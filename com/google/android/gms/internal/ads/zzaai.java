package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzaai.class */
public final class zzaai extends HandlerThread implements Handler.Callback {
    private zzer zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzaak zze;

    public zzaai() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    zzer zzerVar = this.zza;
                    zzerVar.getClass();
                    zzerVar.zzc();
                } finally {
                    try {
                        quit();
                        return true;
                    } catch (Throwable th) {
                    }
                }
                quit();
                return true;
            }
            try {
                try {
                    int i2 = message.arg1;
                    zzer zzerVar2 = this.zza;
                    zzerVar2.getClass();
                    zzerVar2.zzb(i2);
                    this.zze = new zzaak(this, this.zza.zza(), i2 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    zzff.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.zzc = e;
                    synchronized (this) {
                        notify();
                    }
                }
            } catch (zzet e2) {
                zzff.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                this.zzd = new IllegalStateException(e2);
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e3) {
                zzff.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                this.zzd = e3;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    public final zzaak zza(int i) {
        boolean z;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzer(this.zzb, null);
        synchronized (this) {
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            z = false;
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzaak zzaakVar = this.zze;
        zzaakVar.getClass();
        return zzaakVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
