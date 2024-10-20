package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzfxo.class */
public final class zzfxo implements Iterable {
    final CharSequence zza;
    final zzfxr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxo(zzfxr zzfxrVar, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzfxrVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzg;
        zzg = this.zzb.zzg(this.zza);
        return zzg;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfwt.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
