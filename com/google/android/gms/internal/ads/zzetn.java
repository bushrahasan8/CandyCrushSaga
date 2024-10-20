package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: zzetn.class */
public final class zzetn implements zzexq {
    private final zzfdk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzetn(zzfdk zzfdkVar) {
        this.zza = zzfdkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final ListenableFuture zzb() {
        zzfdk zzfdkVar = this.zza;
        zzexp zzexpVar = null;
        if (zzfdkVar != null) {
            zzexpVar = null;
            if (zzfdkVar.zza() != null) {
                zzexpVar = null;
                if (!zzfdkVar.zza().isEmpty()) {
                    zzexpVar = new zzexp(this) { // from class: com.google.android.gms.internal.ads.zzetm
                        public final zzetn zza;

                        {
                            this.zza = this;
                        }

                        @Override // com.google.android.gms.internal.ads.zzexp
                        public final void zzj(Object obj) {
                            this.zza.zzc((Bundle) obj);
                        }
                    };
                }
            }
        }
        return zzgen.zzh(zzexpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
