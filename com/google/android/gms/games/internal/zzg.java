package com.google.android.gms.games.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.LifecycleKt$;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskExecutors;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: zzg.class */
public final class zzg {
    private static final AtomicReference zza = new AtomicReference();
    private final Application zzb;
    private WeakReference zzf;
    private final Application.ActivityLifecycleCallbacks zzc = new zzf(this, null);
    private final Object zzd = new Object();
    private final Set zze = Collections.newSetFromMap(new WeakHashMap());
    private boolean zzg = false;

    public zzg(Application application) {
        this.zzb = application;
    }

    public static zzg zzb(Application application) {
        Preconditions.checkNotNull(application);
        AtomicReference atomicReference = zza;
        zzg zzgVar = (zzg) atomicReference.get();
        if (zzgVar != null) {
            return zzgVar;
        }
        zzg zzgVar2 = new zzg(application);
        while (!LifecycleKt$.ExternalSyntheticBackportWithForwarding0.m(atomicReference, (Object) null, zzgVar2) && atomicReference.get() == null) {
        }
        return (zzg) zza.get();
    }

    public static zzg zzc(Context context) {
        return zzb((Application) context.getApplicationContext());
    }

    public static /* bridge */ /* synthetic */ void zzd(zzg zzgVar, Activity activity) {
        synchronized (zzgVar.zzd) {
            WeakReference weakReference = zzgVar.zzf;
            if (weakReference == null) {
                return;
            }
            if (weakReference.get() == activity) {
                zzgVar.zzf = null;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zze(zzg zzgVar, Activity activity) {
        Preconditions.checkNotNull(activity);
        synchronized (zzgVar.zzd) {
            if (zzgVar.zza() == activity) {
                return;
            }
            zzgVar.zzf = new WeakReference(activity);
            Iterator it = zzgVar.zze.iterator();
            while (it.hasNext()) {
                ((zzd) it.next()).zza(activity);
            }
        }
    }

    /* renamed from: zzi */
    public final void zzg(zzd zzdVar) {
        Activity zza2 = zza();
        if (zza2 == null) {
            return;
        }
        zzdVar.zza(zza2);
    }

    public final Activity zza() {
        Activity activity;
        synchronized (this.zzd) {
            WeakReference weakReference = this.zzf;
            activity = weakReference == null ? null : (Activity) weakReference.get();
        }
        return activity;
    }

    public final void zzf(zzd zzdVar) {
        Preconditions.checkNotNull(zzdVar);
        synchronized (this.zzd) {
            this.zze.add(zzdVar);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzg(zzdVar);
        } else {
            TaskExecutors.MAIN_THREAD.execute(new Runnable(this, zzdVar) { // from class: com.google.android.gms.games.internal.zzc
                public final zzg zza;
                public final zzd zzb;

                {
                    this.zza = this;
                    this.zzb = zzdVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg(this.zzb);
                }
            });
        }
    }

    public final void zzh() {
        synchronized (this.zzd) {
            if (!this.zzg) {
                this.zzb.registerActivityLifecycleCallbacks(this.zzc);
                this.zzg = true;
            }
        }
    }
}
