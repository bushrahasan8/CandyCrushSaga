package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: zzfdp.class */
public final class zzfdp implements zzfed {
    private final zzfiv zza;
    private final Executor zzb;
    private final zzgej zzc = new zzfdn(this);

    public zzfdp(zzfiv zzfivVar, Executor executor) {
        this.zza = zzfivVar;
        this.zzb = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zza(zzdae zzdaeVar, zzfdy zzfdyVar) throws Exception {
        zzfiv zzfivVar = this.zza;
        zzfjf zzfjfVar = zzfdyVar.zzb;
        zzbze zzbzeVar = zzfdyVar.zza;
        zzfje zzb = zzfivVar.zzb(zzfjfVar);
        if (zzb != null && zzbzeVar != null) {
            zzgen.zzr(zzdaeVar.zzb().zzh(zzbzeVar), this.zzc, this.zzb);
        }
        return zzgen.zzh(new zzfdo(zzfjfVar, zzbzeVar, zzb));
    }

    public final ListenableFuture zzb(zzfee zzfeeVar, zzfec zzfecVar, final zzdae zzdaeVar) {
        return zzgen.zze(zzgen.zzn(zzgee.zzu(new zzfdz(this.zza, zzdaeVar, this.zzb).zzc()), new zzgdu(this, zzdaeVar) { // from class: com.google.android.gms.internal.ads.zzfdl
            public final zzfdp zza;
            public final zzdae zzb;

            {
                this.zza = this;
                this.zzb = zzdaeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzgdu
            public final ListenableFuture zza(Object obj) {
                return this.zza.zza(this.zzb, (zzfdy) obj);
            }
        }, this.zzb), Exception.class, new zzfdm(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfed
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfee zzfeeVar, zzfec zzfecVar, Object obj) {
        return zzb(zzfeeVar, zzfecVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfed
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
