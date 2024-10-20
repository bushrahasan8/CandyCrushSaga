package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.ironsource.i5;
import com.ironsource.t2;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: zzbxw.class */
public final class zzbxw implements zzbxy {
    public static zzbxy zza;
    static zzbxy zzb;
    static zzbxy zzc;
    private static final Object zzd = new Object();
    private final Context zzf;
    private final ExecutorService zzh;
    private final zzcei zzi;
    private final Object zze = new Object();
    private final WeakHashMap zzg = new WeakHashMap();

    protected zzbxw(Context context, zzcei zzceiVar) {
        zzfts.zza();
        this.zzh = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zzf = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzi = zzceiVar;
    }

    public static zzbxy zza(Context context) {
        synchronized (zzd) {
            if (zza == null) {
                if (((Boolean) zzbij.zze.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzhF)).booleanValue()) {
                        zza = new zzbxw(context, zzcei.zza());
                    }
                }
                zza = new zzbxx();
            }
        }
        return zza;
    }

    public static zzbxy zzb(Context context, zzcei zzceiVar) {
        synchronized (zzd) {
            if (zzc == null) {
                if (((Boolean) zzbij.zze.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzhF)).booleanValue()) {
                        zzbxw zzbxwVar = new zzbxw(context, zzceiVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzbxwVar.zze) {
                                zzbxwVar.zzg.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new zzbxv(zzbxwVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzbxu(zzbxwVar, Thread.getDefaultUncaughtExceptionHandler()));
                        zzc = zzbxwVar;
                    }
                }
                zzc = new zzbxx();
            }
        }
        return zzc;
    }

    public static zzbxy zzc(Context context) {
        synchronized (zzd) {
            if (zzb == null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzhG)).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzhF)).booleanValue()) {
                        zzb = new zzbxw(context, zzcei.zza());
                    }
                }
                zzb = new zzbxx();
            }
        }
        return zzb;
    }

    public static String zzd(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zze(Throwable th) {
        return zzfxt.zzc(zzcdv.zzf(zzd(th)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzf(Thread thread, Throwable th) {
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            Throwable th2 = th;
            while (true) {
                Throwable th3 = th2;
                if (th3 == null) {
                    break;
                }
                for (StackTraceElement stackTraceElement : th3.getStackTrace()) {
                    z |= zzcdv.zzo(stackTraceElement.getClassName());
                    z2 |= zzbxw.class.getName().equals(stackTraceElement.getClassName());
                }
                th2 = th3.getCause();
            }
            if (!z || z2) {
                return;
            }
            zzh(th, "", 1.0f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzg(Throwable th, String str) {
        zzh(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzh(Throwable th, String str, float f) {
        Throwable th2;
        String str2;
        Handler handler = zzcdv.zza;
        boolean z = false;
        if (!((Boolean) zzbij.zzf.zze()).booleanValue()) {
            LinkedList linkedList = new LinkedList();
            Throwable th3 = th;
            while (true) {
                Throwable th4 = th3;
                if (th4 == null) {
                    break;
                }
                linkedList.push(th4);
                th3 = th4.getCause();
            }
            Throwable th5 = null;
            while (true) {
                th2 = th5;
                if (linkedList.isEmpty()) {
                    break;
                }
                Throwable th6 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th6.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th6.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z2 = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (zzcdv.zzo(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z2 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z2) {
                    th5 = th5 == null ? new Throwable(th6.getMessage()) : new Throwable(th6.getMessage(), th5);
                    th5.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        } else {
            th2 = th;
        }
        if (th2 == null) {
            return;
        }
        String name = th.getClass().getName();
        String zzd2 = zzd(th);
        String zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zziI)).booleanValue() ? zze(th) : "";
        double d = f;
        double random = Math.random();
        int i = f > 0.0f ? (int) (1.0f / f) : 1;
        if (random < d) {
            ArrayList<String> arrayList2 = new ArrayList();
            try {
                z = Wrappers.packageManager(this.zzf).isCallerInstantApp();
            } catch (Throwable th7) {
                zzcec.zzh("Error fetching instant app info", th7);
            }
            try {
                str2 = this.zzf.getPackageName();
            } catch (Throwable th8) {
                zzcec.zzj("Cannot obtain package name, proceeding.");
                str2 = "unknown";
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter(i5.x, Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str3 = Build.MANUFACTURER;
            String str4 = Build.MODEL;
            if (!str4.startsWith(str3)) {
                str4 = str3 + " " + str4;
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter(t2.h.G, str4).appendQueryParameter("js", this.zzi.zza).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zzd2).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zza().zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "610756093").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzbij.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzf))).appendQueryParameter("lite", true != this.zzi.zze ? t2.h : "1");
            if (!TextUtils.isEmpty(zze)) {
                appendQueryParameter2.appendQueryParameter("hash", zze);
            }
            arrayList2.add(appendQueryParameter2.toString());
            for (final String str5 : arrayList2) {
                final zzceh zzcehVar = new zzceh(null);
                this.zzh.execute(new Runnable(zzcehVar, str5) { // from class: com.google.android.gms.internal.ads.zzbxt
                    public final zzceh zza;
                    public final String zzb;

                    {
                        this.zza = zzcehVar;
                        this.zzb = str5;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zza(this.zzb);
                    }
                });
            }
        }
    }
}
