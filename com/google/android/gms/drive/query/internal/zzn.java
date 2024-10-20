package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

@SafeParcelable.Class(creator = "HasFilterCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: zzn.class */
public final class zzn<T> extends zza {
    public static final zzo CREATOR = new zzo();

    @SafeParcelable.Field(id = 1)
    private final MetadataBundle zzma;
    private final MetadataField<T> zzmb;

    public zzn(SearchableMetadataField<T> searchableMetadataField, T t) {
        this(MetadataBundle.zza(searchableMetadataField, t));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzn(@SafeParcelable.Param(id = 1) MetadataBundle metadataBundle) {
        this.zzma = metadataBundle;
        this.zzmb = (MetadataField<T>) zzi.zza(metadataBundle);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzma, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.drive.query.Filter
    public final <F> F zza(zzj<F> zzjVar) {
        MetadataField<T> metadataField = this.zzmb;
        return zzjVar.zzc(metadataField, this.zzma.zza(metadataField));
    }
}
