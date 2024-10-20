package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: zzdq.class */
public final class zzdq {
    private final zzgaa zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private zzdr zzd;
    private zzdr zze;
    private boolean zzf;

    public zzdq(zzgaa zzgaaVar) {
        this.zza = zzgaaVar;
        zzdr zzdrVar = zzdr.zza;
        this.zzd = zzdrVar;
        this.zze = zzdrVar;
        this.zzf = false;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z;
        do {
            int i = 0;
            boolean z2 = false;
            while (true) {
                z = z2;
                if (i > zzi()) {
                    break;
                }
                int i2 = i + 1;
                boolean z3 = z;
                if (!this.zzc[i].hasRemaining()) {
                    zzdt zzdtVar = (zzdt) this.zzb.get(i);
                    if (zzdtVar.zzh()) {
                        z3 = z;
                        if (!this.zzc[i].hasRemaining()) {
                            z3 = z;
                            if (i < zzi()) {
                                ((zzdt) this.zzb.get(i2)).zzd();
                                z3 = z;
                            }
                        }
                    } else {
                        ByteBuffer byteBuffer2 = i > 0 ? this.zzc[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzdt.zza;
                        long remaining = byteBuffer2.remaining();
                        zzdtVar.zze(byteBuffer2);
                        this.zzc[i] = zzdtVar.zzb();
                        boolean z4 = true;
                        if (remaining - byteBuffer2.remaining() <= 0) {
                            z4 = this.zzc[i].hasRemaining();
                        }
                        z3 = z | z4;
                    }
                }
                i = i2;
                z2 = z3;
            }
        } while (z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdq)) {
            return false;
        }
        zzdq zzdqVar = (zzdq) obj;
        if (this.zza.size() != zzdqVar.zza.size()) {
            return false;
        }
        for (int i = 0; i < this.zza.size(); i++) {
            if (this.zza.get(i) != zzdqVar.zza.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzdr zza(zzdr zzdrVar) throws zzds {
        if (zzdrVar.equals(zzdr.zza)) {
            throw new zzds("Unhandled input format:", zzdrVar);
        }
        for (int i = 0; i < this.zza.size(); i++) {
            zzdt zzdtVar = (zzdt) this.zza.get(i);
            zzdr zza = zzdtVar.zza(zzdrVar);
            if (zzdtVar.zzg()) {
                zzek.zzf(!zza.equals(zzdr.zza));
                zzdrVar = zza;
            }
        }
        this.zze = zzdrVar;
        return zzdrVar;
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzdt.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzj(zzdt.zza);
        return this.zzc[zzi()];
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = this.zze;
        this.zzf = false;
        for (int i = 0; i < this.zza.size(); i++) {
            zzdt zzdtVar = (zzdt) this.zza.get(i);
            zzdtVar.zzc();
            if (zzdtVar.zzg()) {
                this.zzb.add(zzdtVar);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for (int i2 = 0; i2 <= zzi(); i2++) {
            this.zzc[i2] = ((zzdt) this.zzb.get(i2)).zzb();
        }
    }

    public final void zzd() {
        if (!zzh() || this.zzf) {
            return;
        }
        this.zzf = true;
        ((zzdt) this.zzb.get(0)).zzd();
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (!zzh() || this.zzf) {
            return;
        }
        zzj(byteBuffer);
    }

    public final void zzf() {
        for (int i = 0; i < this.zza.size(); i++) {
            zzdt zzdtVar = (zzdt) this.zza.get(i);
            zzdtVar.zzc();
            zzdtVar.zzf();
        }
        this.zzc = new ByteBuffer[0];
        zzdr zzdrVar = zzdr.zza;
        this.zzd = zzdrVar;
        this.zze = zzdrVar;
        this.zzf = false;
    }

    public final boolean zzg() {
        return this.zzf && ((zzdt) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}
