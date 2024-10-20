package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.Build;
import com.google.android.apps.common.proguard.SideEffectFree;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;

@KeepForSdk
/* loaded from: DeviceProperties.class */
public final class DeviceProperties {
    private static Boolean zza;
    private static Boolean zzb;
    private static Boolean zzc;
    private static Boolean zzd;
    private static Boolean zze;
    private static Boolean zzf;
    private static Boolean zzg;
    private static Boolean zzh;
    private static Boolean zzi;
    private static Boolean zzj;
    private static Boolean zzk;
    private static Boolean zzl;
    private static Boolean zzm;
    private static Boolean zzn;

    private DeviceProperties() {
    }

    @KeepForSdk
    public static boolean isAuto(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (zzj == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastO()) {
                z = false;
                if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                    z = true;
                }
            }
            zzj = Boolean.valueOf(z);
        }
        return zzj.booleanValue();
    }

    @KeepForSdk
    public static boolean isBstar(Context context) {
        if (zzm == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastR()) {
                z = false;
                if (context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                    z = true;
                }
            }
            zzm = Boolean.valueOf(z);
        }
        return zzm.booleanValue();
    }

    @KeepForSdk
    public static boolean isFoldable(Context context) {
        if (zzc == null) {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            boolean z = false;
            if (PlatformVersion.isAtLeastR()) {
                z = false;
                if (sensorManager != null) {
                    z = false;
                    if (sensorManager.getDefaultSensor(36) != null) {
                        z = true;
                    }
                }
            }
            zzc = Boolean.valueOf(z);
        }
        return zzc.booleanValue();
    }

    @KeepForSdk
    public static boolean isLatchsky(Context context) {
        if (zzg == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater")) {
                z = false;
                if (packageManager.hasSystemFeature("cn.google.services")) {
                    z = true;
                }
            }
            zzg = Boolean.valueOf(z);
        }
        return zzg.booleanValue();
    }

    @KeepForSdk
    public static boolean isPhone(Context context) {
        if (zza == null) {
            boolean z = true;
            if (!isFoldable(context)) {
                if (!isTablet(context) && !isWearable(context) && !zzb(context)) {
                    if (zzi == null) {
                        zzi = Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
                    }
                    if (!zzi.booleanValue() && !isAuto(context) && !isTv(context)) {
                        if (zzl == null) {
                            zzl = Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
                        }
                        if (!zzl.booleanValue() && !isBstar(context) && !isXr(context)) {
                            z = true;
                        }
                    }
                }
                z = false;
            }
            zza = Boolean.valueOf(z);
        }
        return zza.booleanValue();
    }

    @KeepForSdk
    public static boolean isSevenInchTablet(Context context) {
        return zzc(context.getResources());
    }

    @KeepForSdk
    @TargetApi(21)
    public static boolean isSidewinder(Context context) {
        return zza(context);
    }

    @KeepForSdk
    public static boolean isTablet(Context context) {
        return isTablet(context.getResources());
    }

    @KeepForSdk
    public static boolean isTablet(Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (zzb == null) {
            if ((resources.getConfiguration().screenLayout & 15) > 3 || zzc(resources)) {
                z = true;
            }
            zzb = Boolean.valueOf(z);
        }
        return zzb.booleanValue();
    }

    @KeepForSdk
    public static boolean isTv(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (zzk == null) {
            boolean z = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv")) {
                z = true;
                if (!packageManager.hasSystemFeature("android.hardware.type.television")) {
                    z = packageManager.hasSystemFeature("android.software.leanback");
                }
            }
            zzk = Boolean.valueOf(z);
        }
        return zzk.booleanValue();
    }

    @KeepForSdk
    public static boolean isUserBuild() {
        int i = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    @KeepForSdk
    @TargetApi(20)
    public static boolean isWearable(Context context) {
        return zzd(context.getPackageManager());
    }

    @KeepForSdk
    @TargetApi(Sdk$SDKMetric.SDKMetricType.MRAID_DOWNLOAD_JS_RETRY_SUCCESS_VALUE)
    public static boolean isWearableWithoutPlayStore(Context context) {
        if (isWearable(context) && !PlatformVersion.isAtLeastN()) {
            return true;
        }
        if (zza(context)) {
            return !PlatformVersion.isAtLeastO() || PlatformVersion.isAtLeastR();
        }
        return false;
    }

    @KeepForSdk
    public static boolean isXr(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (zzn == null) {
            zzn = Boolean.valueOf(packageManager.hasSystemFeature("android.software.xr.immersive"));
        }
        return zzn.booleanValue();
    }

    @TargetApi(21)
    public static boolean zza(Context context) {
        if (zzf == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastLollipop()) {
                z = false;
                if (context.getPackageManager().hasSystemFeature("cn.google")) {
                    z = true;
                }
            }
            zzf = Boolean.valueOf(z);
        }
        return zzf.booleanValue();
    }

    public static boolean zzb(Context context) {
        if (zzh == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot")) {
                z = context.getPackageManager().hasSystemFeature("android.hardware.type.embedded");
            }
            zzh = Boolean.valueOf(z);
        }
        return zzh.booleanValue();
    }

    public static boolean zzc(Resources resources) {
        if (resources == null) {
            return false;
        }
        if (zzd == null) {
            Configuration configuration = resources.getConfiguration();
            boolean z = false;
            if ((configuration.screenLayout & 15) <= 3) {
                z = false;
                if (configuration.smallestScreenWidthDp >= 600) {
                    z = true;
                }
            }
            zzd = Boolean.valueOf(z);
        }
        return zzd.booleanValue();
    }

    @SideEffectFree
    @TargetApi(20)
    public static boolean zzd(PackageManager packageManager) {
        if (zze == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastKitKatWatch()) {
                z = false;
                if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                    z = true;
                }
            }
            zze = Boolean.valueOf(z);
        }
        return zze.booleanValue();
    }
}
