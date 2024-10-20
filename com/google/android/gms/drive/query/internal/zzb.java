package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

@SafeParcelable.Class(creator = "ComparisonFilterCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: zzb.class */
public final class zzb<T> extends zza {
    public static final zzc CREATOR = new zzc();

    @SafeParcelable.Field(id = 1)
    private final zzx zzlz;

    @SafeParcelable.Field(id = 2)
    private final MetadataBundle zzma;
    private final MetadataField<T> zzmb;

    public zzb(zzx zzxVar, SearchableMetadataField<T> searchableMetadataField, T t) {
        this(zzxVar, MetadataBundle.zza(searchableMetadataField, t));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzb(@SafeParcelable.Param(id = 1) zzx zzxVar, @SafeParcelable.Param(id = 2) MetadataBundle metadataBundle) {
        this.zzlz = zzxVar;
        this.zzma = metadataBundle;
        this.zzmb = (MetadataField<T>) zzi.zza(metadataBundle);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzlz, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzma, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.drive.query.Filter
    public final <F> F zza(zzj<F> zzjVar) {
        zzx zzxVar = this.zzlz;
        MetadataField<T> metadataField = this.zzmb;
        return zzjVar.zza(zzxVar, metadataField, this.zzma.zza(metadataField));
    }
}
