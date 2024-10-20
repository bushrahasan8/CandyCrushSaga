package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Comparator;

/* loaded from: zzed.class */
final class zzed implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int compareTo;
        zzek zzekVar = (zzek) obj;
        zzek zzekVar2 = (zzek) obj2;
        zzec zzecVar = new zzec(zzekVar);
        zzec zzecVar2 = new zzec(zzekVar2);
        while (zzecVar.hasNext() && zzecVar2.hasNext()) {
            compareTo = Integer.valueOf(zzecVar.zza() & 255).compareTo(Integer.valueOf(zzecVar2.zza() & 255));
            if (compareTo != 0) {
                break;
            }
        }
        compareTo = Integer.valueOf(zzekVar.zzc()).compareTo(Integer.valueOf(zzekVar2.zzc()));
        return compareTo;
    }
}
