package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: zzkj.class */
public final class zzkj extends zzid<String> implements zzkm, RandomAccess {
    private static final zzkj zza;

    @Deprecated
    private static final zzkm zzb;
    private final List<Object> zzc;

    static {
        zzkj zzkjVar = new zzkj(false);
        zza = zzkjVar;
        zzb = zzkjVar;
    }

    public zzkj() {
        this(10);
    }

    public zzkj(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private zzkj(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    private zzkj(boolean z) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    private static String zza(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzij ? ((zzij) obj).zzc() : zzjw.zzb((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzid, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        zza();
        this.zzc.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzid, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzid, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zza();
        Collection<? extends String> collection2 = collection;
        if (collection instanceof zzkm) {
            collection2 = ((zzkm) collection).zze();
        }
        boolean addAll = this.zzc.addAll(i, collection2);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.zzid, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzid, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzid, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzij) {
            zzij zzijVar = (zzij) obj;
            String zzc = zzijVar.zzc();
            if (zzijVar.zzd()) {
                this.zzc.set(i, zzc);
            }
            return zzc;
        }
        byte[] bArr = (byte[]) obj;
        String zzb2 = zzjw.zzb(bArr);
        if (zzjw.zzc(bArr)) {
            this.zzc.set(i, zzb2);
        }
        return zzb2;
    }

    @Override // com.google.android.gms.internal.measurement.zzid, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzid, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        Object remove = this.zzc.remove(i);
        ((AbstractList) this).modCount++;
        return zza(remove);
    }

    @Override // com.google.android.gms.internal.measurement.zzid, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzid, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzid, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzid, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        zza();
        return zza(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    public final /* synthetic */ zzkc zza(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzc);
        return new zzkj((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final void zza(zzij zzijVar) {
        zza();
        this.zzc.add(zzijVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final Object zzb(int i) {
        return this.zzc.get(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzid, com.google.android.gms.internal.measurement.zzkc
    public final /* bridge */ /* synthetic */ boolean zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final zzkm zzd() {
        return zzc() ? new zzmy(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final List<?> zze() {
        return Collections.unmodifiableList(this.zzc);
    }
}
