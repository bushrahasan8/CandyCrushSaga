package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zziq;
import com.ironsource.t2;
import com.onetrust.otpublishers.headless.Public.Keys.OTIABTCFKeys;
import java.util.HashMap;
import java.util.Map;

/* loaded from: zzmt.class */
public final class zzmt {
    private static final String[] zza = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};
    private final Map<String, String> zzb;

    private zzmt(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        this.zzb = hashMap;
        hashMap.putAll(map);
    }

    private static int zza(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException e) {
            return -1;
        }
    }

    public static zzmt zza(SharedPreferences sharedPreferences) {
        HashMap hashMap = new HashMap();
        String zzb = zzb(sharedPreferences, OTIABTCFKeys.IABTCF_VENDORCONSENTS);
        if (!"��".equals(zzb) && zzb.length() > 754) {
            hashMap.put("GoogleConsent", String.valueOf(zzb.charAt(754)));
        }
        int zza2 = zza(sharedPreferences, OTIABTCFKeys.IABTCF_GDPRAPPLIES);
        if (zza2 != -1) {
            hashMap.put("gdprApplies", String.valueOf(zza2));
        }
        int zza3 = zza(sharedPreferences, OTIABTCFKeys.IABTCF_ADVERTISER_CONSENT_MODE);
        if (zza3 != -1) {
            hashMap.put("EnableAdvertiserConsentMode", String.valueOf(zza3));
        }
        int zza4 = zza(sharedPreferences, OTIABTCFKeys.IABTCF_POLICYVERSION);
        if (zza4 != -1) {
            hashMap.put("PolicyVersion", String.valueOf(zza4));
        }
        String zzb2 = zzb(sharedPreferences, OTIABTCFKeys.IABTCF_PURPOSECONSENTS);
        if (!"��".equals(zzb2)) {
            hashMap.put("PurposeConsents", zzb2);
        }
        int zza5 = zza(sharedPreferences, OTIABTCFKeys.IABTCF_CMPSDKID);
        if (zza5 != -1) {
            hashMap.put("CmpSdkID", String.valueOf(zza5));
        }
        return new zzmt(hashMap);
    }

    public static String zza(String str, boolean z) {
        String str2 = str;
        if (z) {
            if (str.length() <= 4) {
                str2 = str;
            } else {
                char[] charArray = str.toCharArray();
                int i = 1;
                while (true) {
                    if (i >= 64) {
                        i = 0;
                        break;
                    }
                    if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i)) {
                        break;
                    }
                    i++;
                }
                charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i);
                str2 = String.valueOf(charArray);
            }
        }
        return str2;
    }

    private static String zzb(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "��");
        } catch (ClassCastException e) {
            return "��";
        }
    }

    private final int zzd() {
        int i;
        try {
            String str = this.zzb.get("CmpSdkID");
            i = -1;
            if (!TextUtils.isEmpty(str)) {
                i = Integer.parseInt(str);
            }
        } catch (NumberFormatException e) {
            i = -1;
        }
        return i;
    }

    private final int zze() {
        int i;
        try {
            String str = this.zzb.get("PolicyVersion");
            i = -1;
            if (!TextUtils.isEmpty(str)) {
                i = Integer.parseInt(str);
            }
        } catch (NumberFormatException e) {
            i = -1;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzmt) {
            return zzc().equalsIgnoreCase(((zzmt) obj).zzc());
        }
        return false;
    }

    public final int hashCode() {
        return zzc().hashCode();
    }

    public final String toString() {
        return zzc();
    }

    public final Bundle zza() {
        if (!"1".equals(this.zzb.get("GoogleConsent")) || !"1".equals(this.zzb.get("gdprApplies")) || !"1".equals(this.zzb.get("EnableAdvertiserConsentMode"))) {
            return Bundle.EMPTY;
        }
        int zze = zze();
        if (zze < 0) {
            return Bundle.EMPTY;
        }
        String str = this.zzb.get("PurposeConsents");
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        if (str.length() > 0) {
            bundle.putString(zziq.zza.AD_STORAGE.zze, str.charAt(0) == '1' ? "granted" : "denied");
        }
        if (str.length() > 3) {
            bundle.putString(zziq.zza.AD_PERSONALIZATION.zze, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
        }
        if (str.length() > 6 && zze >= 4) {
            String str2 = zziq.zza.AD_USER_DATA.zze;
            String str3 = "denied";
            if (str.charAt(0) == '1') {
                str3 = "denied";
                if (str.charAt(6) == '1') {
                    str3 = "granted";
                }
            }
            bundle.putString(str2, str3);
        }
        return bundle;
    }

    public final String zzb() {
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        int zzd = zzd();
        if (zzd < 0 || zzd > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((zzd >> 6) & 63));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(zzd & 63));
        }
        int zze = zze();
        if (zze < 0 || zze > 63) {
            sb.append(t2.h);
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(zze));
        }
        Preconditions.checkArgument(true);
        int i = "1".equals(this.zzb.get("gdprApplies")) ? 2 : 0;
        int i2 = i | 4;
        if ("1".equals(this.zzb.get("EnableAdvertiserConsentMode"))) {
            i2 = i | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i2));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzc() {
        StringBuilder sb = new StringBuilder();
        for (String str : zza) {
            if (this.zzb.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append(t2.i.b);
                sb.append(this.zzb.get(str));
            }
        }
        return sb.toString();
    }
}
