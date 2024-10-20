package com.google.android.gms.internal.play_games_inputmapping;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: zzfo.class */
public final class zzfo extends zzdz implements RandomAccess, zzfp {
    public static final zzfp zza;
    private static final zzfo zzb;
    private final List zzc;

    static {
        zzfo zzfoVar = new zzfo(10);
        zzb = zzfoVar;
        zzfoVar.zzb();
        zza = zzfoVar;
    }

    public zzfo() {
        this(10);
    }

    public zzfo(int i) {
        this.zzc = new ArrayList(i);
    }

    private zzfo(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    private static String zzi(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzek ? ((zzek) obj).zzk(zzfi.zzb) : zzfi.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zzc();
        this.zzc.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zzc();
        Collection collection2 = collection;
        if (collection instanceof zzfp) {
            collection2 = ((zzfp) collection).zzf();
        }
        boolean addAll = this.zzc.addAll(i, collection2);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzc();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzc();
        Object remove = this.zzc.remove(i);
        ((AbstractList) this).modCount++;
        return zzi(remove);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zzc();
        return zzi(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzek) {
            zzek zzekVar = (zzek) obj;
            String zzk = zzekVar.zzk(zzfi.zzb);
            if (zzekVar.zzh()) {
                this.zzc.set(i, zzk);
            }
            return zzk;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzfi.zzd(bArr);
        if (zzfi.zzc(bArr)) {
            this.zzc.set(i, zzd);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfp
    public final Object zze(int i) {
        return this.zzc.get(i);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfp
    public final List zzf() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfp
    public final zzfp zzg() {
        return zza() ? new zzhi(this) : this;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfh
    public final /* bridge */ /* synthetic */ zzfh zzh(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzc);
        return new zzfo(arrayList);
    }
}
