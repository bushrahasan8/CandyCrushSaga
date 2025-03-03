package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;
import java.util.Collections;

@SafeParcelable.Class(creator = "InFilterCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: zzp.class */
public final class zzp<T> extends zza {
    public static final zzq CREATOR = new zzq();

    @SafeParcelable.Field(id = 1)
    private final MetadataBundle zzma;
    private final com.google.android.gms.drive.metadata.zzb<T> zzmn;

    public zzp(SearchableCollectionMetadataField<T> searchableCollectionMetadataField, T t) {
        this(MetadataBundle.zza(searchableCollectionMetadataField, Collections.singleton(t)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzp(@SafeParcelable.Param(id = 1) MetadataBundle metadataBundle) {
        this.zzma = metadataBundle;
        this.zzmn = (com.google.android.gms.drive.metadata.zzb) zzi.zza(metadataBundle);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzma, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.drive.query.Filter
    public final <F> F zza(zzj<F> zzjVar) {
        com.google.android.gms.drive.metadata.zzb<T> zzbVar = this.zzmn;
        return zzjVar.zza((com.google.android.gms.drive.metadata.zzb<com.google.android.gms.drive.metadata.zzb<T>>) zzbVar, (com.google.android.gms.drive.metadata.zzb<T>) ((Collection) this.zzma.zza(zzbVar)).iterator().next());
    }
}
