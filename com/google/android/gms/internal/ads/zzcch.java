package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: zzcch.class */
public final class zzcch {
    private final AtomicReference zzb = new AtomicReference(null);
    private final Object zzc = new Object();
    private String zzd = null;
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final AtomicInteger zze = new AtomicInteger(-1);
    private final AtomicReference zzf = new AtomicReference(null);
    private final AtomicReference zzg = new AtomicReference(null);
    private final ConcurrentMap zzh = new ConcurrentHashMap(9);
    private final AtomicReference zzi = new AtomicReference(null);
    private final BlockingQueue zzj = new ArrayBlockingQueue(20);
    private final Object zzk = new Object();

    static final boolean zzq(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzah)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzai)).intValue()) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzaj)).booleanValue()) {
            return true;
        }
        try {
            context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            return false;
        } catch (ClassNotFoundException e) {
            return true;
        }
    }

    private final Object zzr(String str, Context context) {
        if (!zzw(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            return null;
        }
        try {
            return zzs(context, str).invoke(this.zzf.get(), null);
        } catch (Exception e) {
            zzv(str, true);
            return null;
        }
    }

    private final Method zzs(Context context, String str) {
        Method method = (Method) this.zzh.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            this.zzh.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zzv(str, false);
            return null;
        }
    }

    private final void zzt(Context context, String str, String str2) {
        Method method;
        if (zzw(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            Method method2 = (Method) this.zzh.get(str2);
            if (method2 != null) {
                method = method2;
            } else {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.zzh.put(str2, method);
                } catch (Exception e) {
                    zzv(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.zzf.get(), str);
                com.google.android.gms.ads.internal.util.zze.zza("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception e2) {
                zzv(str2, false);
            }
        }
    }

    private final void zzu(Context context, String str, String str2, Bundle bundle) {
        Method method;
        if (zzp(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                zzcec.zzh("Invalid event ID: ".concat(String.valueOf(str2)), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzw(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
                Method method2 = (Method) this.zzh.get("logEventInternal");
                if (method2 != null) {
                    method = method2;
                } else {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.zzh.put("logEventInternal", method);
                    } catch (Exception e2) {
                        zzv("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.zzf.get(), "am", str, bundle2);
                } catch (Exception e3) {
                    zzv("logEventInternal", true);
                }
            }
        }
    }

    private final void zzv(String str, boolean z) {
        if (this.zza.get()) {
            return;
        }
        zzcec.zzj("Invoke Firebase method " + str + " error.");
        if (z) {
            zzcec.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.zza.set(true);
        }
    }

    private final boolean zzw(Context context, String str, AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            zzcce.zza(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            return true;
        } catch (Exception e) {
            zzv("getInstance", z);
            return false;
        }
    }

    public final String zza(Context context) {
        Object zzr;
        if (zzp(context) && (zzr = zzr("generateEventId", context)) != null) {
            return zzr.toString();
        }
        return null;
    }

    public final String zzb(final Context context) {
        Executor threadPoolExecutor;
        if (!zzp(context)) {
            return null;
        }
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzaf)).longValue();
        if (longValue < 0) {
            return (String) zzr("getAppInstanceId", context);
        }
        if (this.zzb.get() == null) {
            if (ClientLibraryUtils.isPackageSide()) {
                threadPoolExecutor = zzfts.zza().zzc(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzag)).intValue(), new zzccg(this), 2);
            } else {
                zzbfu zzbfuVar = zzbgc.zzag;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbfuVar)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbfuVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzccg(this));
            }
            zzcce.zza(this.zzb, null, threadPoolExecutor);
        }
        try {
            return (String) ((ExecutorService) this.zzb.get()).submit(new Callable(this, context) { // from class: com.google.android.gms.internal.ads.zzccf
                public final zzcch zza;
                public final Context zzb;

                {
                    this.zza = this;
                    this.zzb = context;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zze(this.zzb);
                }
            }).get(longValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            return "TIME_OUT";
        } catch (Exception e2) {
            return null;
        }
    }

    public final String zzc(Context context) {
        if (!zzp(context) || !zzw(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            return "";
        }
        try {
            String str = (String) zzs(context, "getCurrentScreenName").invoke(this.zzf.get(), null);
            String str2 = str;
            if (str == null) {
                str2 = (String) zzs(context, "getCurrentScreenClass").invoke(this.zzf.get(), null);
            }
            if (str2 == null) {
                str2 = "";
            }
            return str2;
        } catch (Exception e) {
            zzv("getCurrentScreenName", false);
            return "";
        }
    }

    public final String zzd(Context context) {
        if (!zzp(context)) {
            return null;
        }
        synchronized (this.zzc) {
            String str = this.zzd;
            if (str != null) {
                return str;
            }
            String str2 = (String) zzr("getGmpAppId", context);
            this.zzd = str2;
            return str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zze(Context context) throws Exception {
        return (String) zzr("getAppInstanceId", context);
    }

    public final void zzf(Context context, String str) {
        if (zzp(context)) {
            zzt(context, str, "beginAdUnitExposure");
        }
    }

    public final void zzg(Context context, String str) {
        if (zzp(context)) {
            zzt(context, str, "endAdUnitExposure");
        }
    }

    public final void zzh(Context context, String str) {
        zzu(context, "_aa", str, null);
    }

    public final void zzi(Context context, String str) {
        zzu(context, "_aq", str, null);
    }

    public final void zzj(Context context, String str) {
        zzu(context, "_ac", str, null);
    }

    public final void zzk(Context context, String str) {
        zzu(context, "_ai", str, null);
    }

    public final void zzl(Context context, String str, String str2, String str3, int i) {
        if (zzp(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            zzu(context, "_ar", str, bundle);
            com.google.android.gms.ads.internal.util.zze.zza("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
        }
    }

    public final void zzm(Context context, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzam)).booleanValue() && zzp(context) && zzq(context)) {
            synchronized (this.zzk) {
            }
        }
    }

    public final void zzn(Context context, com.google.android.gms.ads.internal.client.zzff zzffVar) {
        zzcci.zzd(context).zzb().zzc(zzffVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzam)).booleanValue() && zzp(context) && zzq(context)) {
            synchronized (this.zzk) {
            }
        }
    }

    @Deprecated
    public final void zzo(Context context, String str) {
        if (zzp(context) && (context instanceof Activity) && zzw(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzg, false)) {
            Method method = (Method) this.zzh.get("setCurrentScreen");
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    this.zzh.put("setCurrentScreen", method);
                } catch (Exception e) {
                    zzv("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.zzg.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception e2) {
                zzv("setCurrentScreen", false);
            }
        }
    }

    public final boolean zzp(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzaa)).booleanValue() || this.zza.get()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzak)).booleanValue()) {
            return true;
        }
        if (this.zze.get() == -1) {
            com.google.android.gms.ads.internal.client.zzay.zzb();
            if (!zzcdv.zzs(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                com.google.android.gms.ads.internal.client.zzay.zzb();
                if (zzcdv.zzt(context)) {
                    zzcec.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                    this.zze.set(0);
                }
            }
            this.zze.set(1);
        }
        return this.zze.get() == 1;
    }
}
