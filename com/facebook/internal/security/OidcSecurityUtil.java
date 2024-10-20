package com.facebook.internal.security;

import android.util.Base64;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: OidcSecurityUtil.class */
public final class OidcSecurityUtil {
    public static final OidcSecurityUtil INSTANCE = new OidcSecurityUtil();
    private static final String OPENID_KEYS_PATH = "/.well-known/oauth/openid/keys/";

    private OidcSecurityUtil() {
    }

    public static final PublicKey getPublicKeyFromString(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        byte[] decode = Base64.decode(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(key, "\n", "", false, 4, (Object) null), "-----BEGIN PUBLIC KEY-----", "", false, 4, (Object) null), "-----END PUBLIC KEY-----", "", false, 4, (Object) null), 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        Intrinsics.checkNotNullExpressionValue(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    public static final String getRawKeyFromEndPoint(final String kid) {
        Intrinsics.checkNotNullParameter(kid, "kid");
        final URL url = new URL(HttpRequest.DEFAULT_SCHEME, "www." + FacebookSdk.getFacebookDomain(), OPENID_KEYS_PATH);
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        FacebookSdk.getExecutor().execute(new Runnable(url, ref$ObjectRef, kid, reentrantLock, newCondition) { // from class: com.facebook.internal.security.OidcSecurityUtil$$ExternalSyntheticLambda0
            public final URL f$0;
            public final Ref$ObjectRef f$1;
            public final String f$2;
            public final ReentrantLock f$3;
            public final Condition f$4;

            {
                this.f$0 = url;
                this.f$1 = ref$ObjectRef;
                this.f$2 = kid;
                this.f$3 = reentrantLock;
                this.f$4 = newCondition;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OidcSecurityUtil.getRawKeyFromEndPoint$lambda$1(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
        reentrantLock.lock();
        try {
            newCondition.await(UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) ref$ObjectRef.element;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRawKeyFromEndPoint$lambda$1(URL openIdKeyUrl, Ref$ObjectRef result, String kid, ReentrantLock lock, Condition condition) {
        Intrinsics.checkNotNullParameter(openIdKeyUrl, "$openIdKeyUrl");
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(kid, "$kid");
        Intrinsics.checkNotNullParameter(lock, "$lock");
        URLConnection openConnection = openIdKeyUrl.openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                Intrinsics.checkNotNullExpressionValue(inputStream, "connection.inputStream");
                String readText = TextStreamsKt.readText(new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192));
                httpURLConnection.getInputStream().close();
                result.element = new JSONObject(readText).optString(kid);
                httpURLConnection.disconnect();
                lock.lock();
                try {
                    condition.signal();
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                lock.lock();
                try {
                    condition.signal();
                    Unit unit2 = Unit.INSTANCE;
                    throw th;
                } finally {
                }
            }
        } catch (Exception e) {
            String name = INSTANCE.getClass().getName();
            String message = e.getMessage();
            String str = message;
            if (message == null) {
                str = "Error getting public key";
            }
            Log.d(name, str);
            httpURLConnection.disconnect();
            lock.lock();
            try {
                condition.signal();
                Unit unit3 = Unit.INSTANCE;
            } finally {
            }
        }
    }

    public static final boolean verify(PublicKey publicKey, String data, String signature) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(signature, "signature");
        try {
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] decode = Base64.decode(signature, 8);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(signature, Base64.URL_SAFE)");
            return signature2.verify(decode);
        } catch (Exception e) {
            return false;
        }
    }
}
