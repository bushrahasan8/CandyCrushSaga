package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.decoder.CryptoInfo$PatternHolderV24$;
import androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer$;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzsk.class */
public final class zzsk implements zzss {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzeo zzg;
    private boolean zzh;

    public zzsk(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzeo zzeoVar = new zzeo(zzel.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzeoVar;
        this.zzf = new AtomicReference();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zza(zzsk zzskVar, Message message) {
        zzsj zzsjVar;
        int i = message.what;
        if (i == 0) {
            zzsj zzsjVar2 = (zzsj) message.obj;
            try {
                zzskVar.zzc.queueInputBuffer(zzsjVar2.zza, 0, zzsjVar2.zzc, zzsjVar2.zze, zzsjVar2.zzf);
                zzsjVar = zzsjVar2;
            } catch (RuntimeException e) {
                zzsh.zza(zzskVar.zzf, null, e);
                zzsjVar = zzsjVar2;
            }
        } else if (i == 1) {
            zzsj zzsjVar3 = (zzsj) message.obj;
            int i2 = zzsjVar3.zza;
            MediaCodec.CryptoInfo cryptoInfo = zzsjVar3.zzd;
            long j = zzsjVar3.zze;
            int i3 = zzsjVar3.zzf;
            try {
                synchronized (zzb) {
                    zzskVar.zzc.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                }
                zzsjVar = zzsjVar3;
            } catch (RuntimeException e2) {
                zzsh.zza(zzskVar.zzf, null, e2);
                zzsjVar = zzsjVar3;
            }
        } else if (i == 2) {
            zzskVar.zzg.zze();
            zzsjVar = null;
        } else if (i != 3) {
            zzsh.zza(zzskVar.zzf, null, new IllegalStateException(String.valueOf(message.what)));
            zzsjVar = null;
        } else {
            try {
                zzskVar.zzc.setParameters((Bundle) message.obj);
                zzsjVar = null;
            } catch (RuntimeException e3) {
                zzsh.zza(zzskVar.zzf, null, e3);
                zzsjVar = null;
            }
        }
        if (zzsjVar != null) {
            ArrayDeque arrayDeque = zza;
            synchronized (arrayDeque) {
                arrayDeque.add(zzsjVar);
            }
        }
    }

    private static zzsj zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzsj();
            }
            return (zzsj) arrayDeque.removeFirst();
        }
    }

    private static byte[] zzj(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int[] zzk(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                handler2.getClass();
                handler2.obtainMessage(2).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzd(int i, int i2, int i3, long j, int i4) {
        zzc();
        zzsj zzi = zzi();
        zzi.zza(i, 0, i3, j, i4);
        Handler handler = this.zze;
        int i5 = zzfy.zza;
        handler.obtainMessage(0, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zze(int i, int i2, zzie zzieVar, long j, int i3) {
        zzc();
        zzsj zzi = zzi();
        zzi.zza(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzi.zzd;
        cryptoInfo.numSubSamples = zzieVar.zzf;
        cryptoInfo.numBytesOfClearData = zzk(zzieVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzk(zzieVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzj = zzj(zzieVar.zzb, cryptoInfo.key);
        zzj.getClass();
        cryptoInfo.key = zzj;
        byte[] zzj2 = zzj(zzieVar.zza, cryptoInfo.iv);
        zzj2.getClass();
        cryptoInfo.iv = zzj2;
        cryptoInfo.mode = zzieVar.zzc;
        if (zzfy.zza >= 24) {
            AsynchronousMediaCodecBufferEnqueuer$.ExternalSyntheticApiModelOutline0.m();
            CryptoInfo$PatternHolderV24$.ExternalSyntheticApiModelOutline2.m(cryptoInfo, CryptoInfo$PatternHolderV24$.ExternalSyntheticApiModelOutline0.m(zzieVar.zzg, zzieVar.zzh));
        }
        this.zze.obtainMessage(1, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzf(Bundle bundle) {
        zzc();
        Handler handler = this.zze;
        int i = zzfy.zza;
        handler.obtainMessage(3, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzg() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzh() {
        if (this.zzh) {
            return;
        }
        this.zzd.start();
        this.zze = new zzsi(this, this.zzd.getLooper());
        this.zzh = true;
    }
}
