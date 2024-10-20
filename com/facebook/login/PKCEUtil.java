package com.facebook.login;

import android.os.Bundle;
import android.util.Base64;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* loaded from: PKCEUtil.class */
public final class PKCEUtil {
    public static final PKCEUtil INSTANCE = new PKCEUtil();

    private PKCEUtil() {
    }

    public static final GraphRequest createCodeExchangeRequest(String authorizationCode, String redirectUri, String codeVerifier) {
        Intrinsics.checkNotNullParameter(authorizationCode, "authorizationCode");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString("code", authorizationCode);
        bundle.putString("client_id", FacebookSdk.getApplicationId());
        bundle.putString("redirect_uri", redirectUri);
        bundle.putString("code_verifier", codeVerifier);
        GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest((AccessToken) null, "oauth/access_token", (GraphRequest.Callback) null);
        newGraphPathRequest.setHttpMethod(HttpMethod.GET);
        newGraphPathRequest.setParameters(bundle);
        return newGraphPathRequest;
    }

    public static final String generateCodeChallenge(String codeVerifier, CodeChallengeMethod codeChallengeMethod) {
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        Intrinsics.checkNotNullParameter(codeChallengeMethod, "codeChallengeMethod");
        if (!isValidCodeVerifier(codeVerifier)) {
            throw new FacebookException("Invalid Code Verifier.");
        }
        if (codeChallengeMethod == CodeChallengeMethod.PLAIN) {
            return codeVerifier;
        }
        try {
            byte[] bytes = codeVerifier.getBytes(Charsets.US_ASCII);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String encodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "{\n      // try to genera… or Base64.NO_WRAP)\n    }");
            return encodeToString;
        } catch (Exception e) {
            throw new FacebookException(e);
        }
    }

    public static final String generateCodeVerifier() {
        int random = RangesKt.random(new IntRange(43, 128), Random.Default);
        List plus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus(new CharRange('a', 'z'), new CharRange('A', 'Z')), (Iterable) new CharRange('0', '9')), (Object) '-'), (Object) '.'), (Object) '_'), (Object) '~');
        ArrayList arrayList = new ArrayList(random);
        for (int i = 0; i < random; i++) {
            Character ch = (Character) CollectionsKt.random(plus, Random.Default);
            ch.charValue();
            arrayList.add(ch);
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    public static final boolean isValidCodeVerifier(String str) {
        if (str == null || str.length() == 0 || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new Regex("^[-._~A-Za-z0-9]+$").matches(str);
    }
}
