package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: zzdu.class */
public abstract class zzdu implements zzdt {
    protected zzdr zzb;
    protected zzdr zzc;
    private zzdr zzd;
    private zzdr zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzdu() {
        ByteBuffer byteBuffer = zzdt.zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzdr zzdrVar = zzdr.zza;
        this.zzd = zzdrVar;
        this.zze = zzdrVar;
        this.zzb = zzdrVar;
        this.zzc = zzdrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final zzdr zza(zzdr zzdrVar) throws zzds {
        this.zzd = zzdrVar;
        this.zze = zzi(zzdrVar);
        return zzg() ? this.zze : zzdr.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zzdt.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zzc() {
        this.zzg = zzdt.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zzf() {
        zzc();
        this.zzf = zzdt.zza;
        zzdr zzdrVar = zzdr.zza;
        this.zzd = zzdrVar;
        this.zze = zzdrVar;
        this.zzb = zzdrVar;
        this.zzc = zzdrVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public boolean zzg() {
        return this.zze != zzdr.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public boolean zzh() {
        return this.zzh && this.zzg == zzdt.zza;
    }

    protected zzdr zzi(zzdr zzdrVar) throws zzds {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer zzj(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    protected void zzk() {
    }

    protected void zzl() {
    }

    protected void zzm() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
