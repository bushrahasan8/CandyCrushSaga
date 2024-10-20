package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: zzdw.class */
public final class zzdw implements zzdt {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzdr zze;
    private zzdr zzf;
    private zzdr zzg;
    private zzdr zzh;
    private boolean zzi;
    private zzdv zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzdw() {
        zzdr zzdrVar = zzdr.zza;
        this.zze = zzdrVar;
        this.zzf = zzdrVar;
        this.zzg = zzdrVar;
        this.zzh = zzdrVar;
        ByteBuffer byteBuffer = zzdt.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final zzdr zza(zzdr zzdrVar) throws zzds {
        if (zzdrVar.zzd != 2) {
            throw new zzds("Unhandled input format:", zzdrVar);
        }
        int i = this.zzb;
        int i2 = i;
        if (i == -1) {
            i2 = zzdrVar.zzb;
        }
        this.zze = zzdrVar;
        zzdr zzdrVar2 = new zzdr(i2, zzdrVar.zzc, 2);
        this.zzf = zzdrVar2;
        this.zzi = true;
        return zzdrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final ByteBuffer zzb() {
        int zza;
        zzdv zzdvVar = this.zzj;
        if (zzdvVar != null && (zza = zzdvVar.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzdvVar.zzd(this.zzl);
            this.zzo += zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zzdt.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zzc() {
        if (zzg()) {
            zzdr zzdrVar = this.zze;
            this.zzg = zzdrVar;
            zzdr zzdrVar2 = this.zzf;
            this.zzh = zzdrVar2;
            if (this.zzi) {
                this.zzj = new zzdv(zzdrVar.zzb, zzdrVar.zzc, this.zzc, this.zzd, zzdrVar2.zzb);
            } else {
                zzdv zzdvVar = this.zzj;
                if (zzdvVar != null) {
                    zzdvVar.zzc();
                }
            }
        }
        this.zzm = zzdt.zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zzd() {
        zzdv zzdvVar = this.zzj;
        if (zzdvVar != null) {
            zzdvVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzdv zzdvVar = this.zzj;
            zzdvVar.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzn += remaining;
            zzdvVar.zzf(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzdr zzdrVar = zzdr.zza;
        this.zze = zzdrVar;
        this.zzf = zzdrVar;
        this.zzg = zzdrVar;
        this.zzh = zzdrVar;
        ByteBuffer byteBuffer = zzdt.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzg() {
        boolean z = false;
        if (this.zzf.zzb != -1) {
            if (Math.abs(this.zzc - 1.0f) >= 1.0E-4f || Math.abs(this.zzd - 1.0f) >= 1.0E-4f) {
                z = true;
            } else {
                if (this.zzf.zzb != this.zze.zzb) {
                    return true;
                }
                z = false;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzh() {
        boolean z = false;
        if (this.zzp) {
            zzdv zzdvVar = this.zzj;
            if (zzdvVar == null) {
                z = true;
            } else {
                if (zzdvVar.zza() == 0) {
                    return true;
                }
                z = false;
            }
        }
        return z;
    }

    public final long zzi(long j) {
        long j2 = this.zzo;
        if (j2 < 1024) {
            return (long) (this.zzc * j);
        }
        long j3 = this.zzn;
        this.zzj.getClass();
        long zzb = j3 - r0.zzb();
        int i = this.zzh.zzb;
        int i2 = this.zzg.zzb;
        return i == i2 ? zzfy.zzs(j, zzb, j2, RoundingMode.FLOOR) : zzfy.zzs(j, zzb * i, j2 * i2, RoundingMode.FLOOR);
    }

    public final void zzj(float f) {
        if (this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final void zzk(float f) {
        if (this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }
}
