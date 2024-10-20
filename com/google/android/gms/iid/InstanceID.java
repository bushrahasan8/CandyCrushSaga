package com.google.android.gms.iid;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Deprecated
/* loaded from: InstanceID.class */
public class InstanceID {
    public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
    public static final String ERROR_MISSING_INSTANCEID_SERVICE = "MISSING_INSTANCEID_SERVICE";
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    public static final String ERROR_TIMEOUT = "TIMEOUT";
    private static final zzaj<Boolean> zzbu = zzai.zzy().zzd("gcm_check_for_different_iid_in_token", true);
    private static Map<String, InstanceID> zzbv = new ArrayMap();
    private static final long zzbw = TimeUnit.DAYS.toMillis(7);
    private static zzak zzbx;
    private static zzaf zzby;
    private static String zzbz;
    private String zzca;
    private Context zzl;

    @ShowFirstParty
    private InstanceID(Context context, String str) {
        this.zzca = "";
        this.zzl = context.getApplicationContext();
        this.zzca = str;
    }

    @Deprecated
    public static InstanceID getInstance(Context context) {
        return getInstance(context, null);
    }

    @KeepForSdk
    public static InstanceID getInstance(Context context, Bundle bundle) {
        String string;
        InstanceID instanceID;
        synchronized (InstanceID.class) {
            if (bundle == null) {
                string = "";
            } else {
                try {
                    string = bundle.getString("subtype");
                } catch (Throwable th) {
                    throw th;
                }
            }
            String str = string;
            if (string == null) {
                str = "";
            }
            Context applicationContext = context.getApplicationContext();
            if (zzbx == null) {
                String packageName = applicationContext.getPackageName();
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 73);
                sb.append("Instance ID SDK is deprecated, ");
                sb.append(packageName);
                sb.append(" should update to use Firebase Instance ID");
                Log.w("InstanceID", sb.toString());
                zzbx = new zzak(applicationContext);
                zzby = new zzaf(applicationContext);
            }
            zzbz = Integer.toString(zzg(applicationContext));
            InstanceID instanceID2 = zzbv.get(str);
            instanceID = instanceID2;
            if (instanceID2 == null) {
                instanceID = new InstanceID(applicationContext, str);
                zzbv.put(str, instanceID);
            }
        }
        return instanceID;
    }

    private final KeyPair getKeyPair() {
        return zzbx.zzj(this.zzca).getKeyPair();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzd(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException e) {
            Log.w("InstanceID", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 38);
            sb.append("Never happens: can't find own package ");
            sb.append(valueOf);
            Log.w("InstanceID", sb.toString());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzh(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 38);
            sb.append("Never happens: can't find own package ");
            sb.append(valueOf);
            Log.w("InstanceID", sb.toString());
            return null;
        }
    }

    public static zzak zzp() {
        return zzbx;
    }

    @Deprecated
    public void deleteInstanceID() throws IOException {
        zzd("*", "*", null);
        zzo();
    }

    @Deprecated
    public void deleteToken(String str, String str2) throws IOException {
        zzd(str, str2, null);
    }

    @Deprecated
    public long getCreationTime() {
        return zzbx.zzj(this.zzca).getCreationTime();
    }

    @Deprecated
    public String getId() {
        return zzd(getKeyPair());
    }

    @KeepForSdk
    public String getSubtype() {
        return this.zzca;
    }

    @Deprecated
    public String getToken(String str, String str2) throws IOException {
        return getToken(str, str2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getToken(java.lang.String r8, java.lang.String r9, android.os.Bundle r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.InstanceID.getToken(java.lang.String, java.lang.String, android.os.Bundle):java.lang.String");
    }

    @ShowFirstParty
    public final void zzd(String str, String str2, Bundle bundle) throws IOException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        zzbx.zzh(this.zzca, str, str2);
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("sender", str);
        if (str2 != null) {
            bundle2.putString("scope", str2);
        }
        bundle2.putString("subscription", str);
        bundle2.putString("delete", "1");
        bundle2.putString("X-delete", "1");
        bundle2.putString("subtype", "".equals(this.zzca) ? str : this.zzca);
        if (!"".equals(this.zzca)) {
            str = this.zzca;
        }
        bundle2.putString("X-subtype", str);
        zzaf.zzi(zzby.zzd(bundle2, getKeyPair()));
    }

    public final String zze(String str, String str2, Bundle bundle) throws IOException {
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("sender", str);
        String str3 = "".equals(this.zzca) ? str : this.zzca;
        if (!bundle.containsKey("legacy.register")) {
            bundle.putString("subscription", str);
            bundle.putString("subtype", str3);
            bundle.putString("X-subscription", str);
            bundle.putString("X-subtype", str3);
        }
        String zzi = zzaf.zzi(zzby.zzd(bundle, getKeyPair()));
        if (!"RST".equals(zzi) && !zzi.startsWith("RST|")) {
            return zzi;
        }
        InstanceIDListenerService.zzd(this.zzl, zzbx);
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzo() {
        zzbx.zzk(this.zzca);
    }
}
