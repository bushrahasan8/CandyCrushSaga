package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: zzdb.class */
final class zzdb implements Iterator {
    final zzdc zza;
    private int zzb = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdb(zzdc zzdcVar) {
        this.zza = zzdcVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb;
        zzdc zzdcVar = this.zza;
        return i < zzdcVar.zzc() - zzdcVar.zzb();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object[] objArr;
        int i = this.zzb;
        zzdc zzdcVar = this.zza;
        if (i >= zzdcVar.zzc() - zzdcVar.zzb()) {
            throw new NoSuchElementException();
        }
        zzdc zzdcVar2 = this.zza;
        objArr = zzdcVar2.zzb.zzb;
        Object obj = objArr[zzdcVar2.zzb() + i];
        this.zzb = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
