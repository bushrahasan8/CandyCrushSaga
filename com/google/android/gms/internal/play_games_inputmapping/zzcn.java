package com.google.android.gms.internal.play_games_inputmapping;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: zzcn.class */
final class zzcn extends zzcg {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicLong zzc = new AtomicLong();
    private static final ConcurrentLinkedQueue zzd = new ConcurrentLinkedQueue();
    private volatile zzbc zzb;

    private zzcn(String str) {
        super(str);
        String str2 = Build.FINGERPRINT;
        boolean z = str2 == null || "robolectric".equals(str2);
        String str3 = Build.HARDWARE;
        boolean z2 = "goldfish".equals(str3) || "ranchu".equals(str3);
        String str4 = Build.TYPE;
        boolean z3 = "eng".equals(str4) ? true : "userdebug".equals(str4);
        if (z || z2) {
            this.zzb = new zzch().zza(zza());
        } else if (z3) {
            this.zzb = new zzcp().zzb(false).zza(zza());
        } else {
            this.zzb = null;
        }
    }

    public static zzbc zze(String str) {
        AtomicReference atomicReference = zza;
        if (atomicReference.get() != null) {
            return ((zzci) atomicReference.get()).zza(str);
        }
        zzcn zzcnVar = new zzcn(str.replace('$', '.'));
        zzcl.zza.offer(zzcnVar);
        if (atomicReference.get() != null) {
            while (true) {
                zzcn zzcnVar2 = (zzcn) zzcl.zza.poll();
                if (zzcnVar2 == null) {
                    break;
                }
                zzcnVar2.zzb = ((zzci) zza.get()).zza(zzcnVar2.zza());
            }
            zzf();
        }
        return zzcnVar;
    }

    private static void zzf() {
        while (true) {
            zzcm zzcmVar = (zzcm) zzd.poll();
            if (zzcmVar == null) {
                return;
            }
            zzc.getAndDecrement();
            zzbc zza2 = zzcmVar.zza();
            zzba zzb = zzcmVar.zzb();
            if (zzb.zzk() || zza2.zzb(zzb.zze())) {
                zza2.zzc(zzb);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbc
    public final boolean zzb(Level level) {
        if (this.zzb != null) {
            return this.zzb.zzb(level);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbc
    @SuppressLint({"LongLogTag"})
    public final void zzc(zzba zzbaVar) {
        if (this.zzb != null) {
            this.zzb.zzc(zzbaVar);
            return;
        }
        if (zzc.incrementAndGet() > 20) {
            zzd.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        zzd.offer(new zzcm(this, zzbaVar));
        if (this.zzb != null) {
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzcg, com.google.android.gms.internal.play_games_inputmapping.zzbc
    public final void zzd(RuntimeException runtimeException, zzba zzbaVar) {
        if (this.zzb != null) {
            this.zzb.zzd(runtimeException, zzbaVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
