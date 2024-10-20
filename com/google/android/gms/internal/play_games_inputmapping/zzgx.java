package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Iterator;
import java.util.Map;

/* loaded from: zzgx.class */
final class zzgx implements Iterator {
    final zzgz zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzj().entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z = true;
        if (this.zzb + 1 >= this.zza.zzi().size()) {
            if (this.zza.zzj().isEmpty()) {
                z = false;
            } else {
                if (!zza().hasNext()) {
                    return false;
                }
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        return i < this.zza.zzi().size() ? (Map.Entry) this.zza.zzi().get(this.zzb) : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzh();
        if (this.zzb >= this.zza.zzi().size()) {
            zza().remove();
            return;
        }
        zzgz zzgzVar = this.zza;
        int i = this.zzb;
        this.zzb = i - 1;
        zzgzVar.zzg(i);
    }
}
