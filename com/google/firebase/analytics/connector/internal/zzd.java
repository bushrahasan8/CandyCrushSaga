package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zziv;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/* loaded from: zzd.class */
public abstract class zzd {
    private static final ImmutableSet zza = ImmutableSet.of((Object) "_in", (Object) "_xa", (Object) "_xu", (Object) "_aq", (Object) "_aa", (Object) "_ai", (Object[]) new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"});
    private static final ImmutableList zzb = ImmutableList.of((Object) "_e", (Object) "_f", (Object) "_iap", (Object) "_s", (Object) "_au", (Object) "_ui", (Object) "_cd");
    private static final ImmutableList zzc = ImmutableList.of((Object) "auto", (Object) "app", (Object) "am");
    private static final ImmutableList zzd = ImmutableList.of((Object) "_r", (Object) "_dbg");
    private static final ImmutableList zze = new ImmutableList.Builder().add((Object[]) zziv.zza).add((Object[]) zziv.zzb).build();
    private static final ImmutableList zzf = ImmutableList.of((Object) "^_ltv_[A-Z]{3}$", (Object) "^_cc[1-5]{1}$");

    public static void zza(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean zza(String str, Bundle bundle) {
        if (zzb.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        ImmutableList immutableList = zzd;
        int size = immutableList.size();
        int i = 0;
        while (i < size) {
            Object obj = immutableList.get(i);
            i++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean zza(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(AppMeasurement.FIAM_ORIGIN);
        }
        if (zze.contains(str2)) {
            return false;
        }
        ImmutableList immutableList = zzf;
        int size = immutableList.size();
        int i = 0;
        while (i < size) {
            Object obj = immutableList.get(i);
            i++;
            if (str2.matches((String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzb(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!zzf(str) || bundle == null) {
            return false;
        }
        ImmutableList immutableList = zzd;
        int size = immutableList.size();
        int i = 0;
        while (i < size) {
            Object obj = immutableList.get(i);
            i++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        str.hashCode();
        boolean z = -1;
        switch (str.hashCode()) {
            case 101200:
                if (str.equals(AppMeasurement.FCM_ORIGIN)) {
                    z = false;
                    break;
                }
                break;
            case 101230:
                if (str.equals("fdl")) {
                    z = true;
                    break;
                }
                break;
            case 3142703:
                if (str.equals(AppMeasurement.FIAM_ORIGIN)) {
                    z = 2;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
                bundle.putString("_cis", "fcm_integration");
                return true;
            case true:
                bundle.putString("_cis", "fdl_integration");
                return true;
            case true:
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    public static boolean zzf(String str) {
        return !zzc.contains(str);
    }
}
