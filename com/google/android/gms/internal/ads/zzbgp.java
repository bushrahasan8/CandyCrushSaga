package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: zzbgp.class */
final class zzbgp extends zzbgq {
    private static final String zzb(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i2 = 0;
        while (true) {
            i = length;
            if (i2 >= str.length()) {
                break;
            }
            i = length;
            if (str.charAt(i2) != ',') {
                break;
            }
            i2++;
        }
        while (i > 0) {
            int i3 = i - 1;
            if (str.charAt(i3) != ',') {
                break;
            }
            i = i3;
        }
        if (i < i2) {
            return null;
        }
        if (i2 == 0) {
            if (i == str.length()) {
                return str;
            }
            i2 = 0;
        }
        return str.substring(i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final String zza(String str, String str2) {
        String zzb = zzb(str);
        String zzb2 = zzb(str2);
        if (TextUtils.isEmpty(zzb)) {
            return zzb2;
        }
        if (TextUtils.isEmpty(zzb2)) {
            return zzb;
        }
        return zzb + "," + zzb2;
    }
}
