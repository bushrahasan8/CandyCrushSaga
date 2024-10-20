package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.Set;

@ShowFirstParty
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
@KeepForSdk
/* loaded from: GoogleSignatureVerifier.class */
public class GoogleSignatureVerifier {
    private static GoogleSignatureVerifier zza;
    private static volatile Set zzb;
    private final Context zzc;
    private volatile String zzd;

    public GoogleSignatureVerifier(Context context) {
        this.zzc = context.getApplicationContext();
    }

    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            try {
                if (zza == null) {
                    zzn.zze(context);
                    zza = new GoogleSignatureVerifier(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza;
    }

    static final zzj zza(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < zzjVarArr.length; i++) {
            if (zzjVarArr[i].equals(zzkVar)) {
                return zzjVarArr[i];
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ("com.google.android.gms".equals(r7.packageName) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzb(android.content.pm.PackageInfo r7, boolean r8) {
        /*
            r0 = r8
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L3f
            r0 = r7
            if (r0 == 0) goto L46
            java.lang.String r0 = "com.android.vending"
            r1 = r7
            java.lang.String r1 = r1.packageName
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L24
            r0 = r8
            r9 = r0
            java.lang.String r0 = "com.google.android.gms"
            r1 = r7
            java.lang.String r1 = r1.packageName
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3f
        L24:
            r0 = r7
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L32
        L2d:
            r0 = 0
            r9 = r0
            goto L3f
        L32:
            r0 = r10
            int r0 = r0.flags
            r1 = 129(0x81, float:1.81E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L2d
            r0 = 1
            r9 = r0
        L3f:
            r0 = r7
            r10 = r0
            r0 = r9
            r8 = r0
            goto L48
        L46:
            r0 = 0
            r10 = r0
        L48:
            r0 = r7
            if (r0 == 0) goto L79
            r0 = r10
            android.content.pm.Signature[] r0 = r0.signatures
            if (r0 == 0) goto L79
            r0 = r8
            if (r0 == 0) goto L62
            r0 = r10
            com.google.android.gms.common.zzj[] r1 = com.google.android.gms.common.zzm.zza
            com.google.android.gms.common.zzj r0 = zza(r0, r1)
            r7 = r0
            goto L73
        L62:
            r0 = r10
            r1 = 1
            com.google.android.gms.common.zzj[] r1 = new com.google.android.gms.common.zzj[r1]
            r2 = r1
            r3 = 0
            com.google.android.gms.common.zzj[] r4 = com.google.android.gms.common.zzm.zza
            r5 = 0
            r4 = r4[r5]
            r2[r3] = r4
            com.google.android.gms.common.zzj r0 = zza(r0, r1)
            r7 = r0
        L73:
            r0 = r7
            if (r0 == 0) goto L79
            r0 = 1
            return r0
        L79:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.zzb(android.content.pm.PackageInfo, boolean):boolean");
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final zzx zzc(String str, boolean z, boolean z2) {
        zzx zzc;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return zzx.zzc("null pkg");
        }
        if (str.equals(this.zzd)) {
            return zzx.zzb();
        }
        if (zzn.zzg()) {
            zzc = zzn.zzb(str, GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzc), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.zzc.getPackageManager().getPackageInfo(str, 64);
                boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzc);
                if (packageInfo == null) {
                    zzc = zzx.zzc("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        zzc = zzx.zzc("single cert required");
                    } else {
                        zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        zzc = zzn.zza(str2, zzkVar, honorsDebugCertificates, false);
                        if (zzc.zza && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0 && zzn.zza(str2, zzkVar, false, true).zza) {
                            zzc = zzx.zzc("debuggable release cert app rejected");
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                return zzx.zzd("no pkg ".concat(str), e);
            }
        }
        if (zzc.zza) {
            this.zzd = str;
        }
        return zzc;
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zzb(packageInfo, false)) {
            return true;
        }
        if (!zzb(packageInfo, true)) {
            return false;
        }
        if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzc)) {
            return true;
        }
        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(String str) {
        zzx zzc = zzc(str, false, false);
        zzc.zze();
        return zzc.zza;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i) {
        zzx zzc;
        int length;
        String[] packagesForUid = this.zzc.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zzc = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    Preconditions.checkNotNull(zzc);
                    break;
                }
                zzc = zzc(packagesForUid[i2], false, false);
                if (zzc.zza) {
                    break;
                }
                i2++;
            }
        } else {
            zzc = zzx.zzc("no pkgs");
        }
        zzc.zze();
        return zzc.zza;
    }
}
