package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.internal.zzh;

@UsedByReflection("GamesGmsClientImpl.java")
@SafeParcelable.Class(creator = "SnapshotMetadataChangeCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: SnapshotMetadataChangeEntity.class */
public final class SnapshotMetadataChangeEntity extends zzh implements SnapshotMetadataChange {
    public static final Parcelable.Creator<SnapshotMetadataChangeEntity> CREATOR = new zzc();

    @SafeParcelable.Field(getter = "getDescription", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getPlayedTimeMillis", id = 2)
    private final Long zzb;

    @SafeParcelable.Field(getter = "getCoverImageUri", id = 4)
    private final Uri zzc;

    @SafeParcelable.Field(getter = "getCoverImageTeleporter", id = 5)
    private BitmapTeleporter zzd;

    @SafeParcelable.Field(getter = "getProgressValue", id = 6)
    private final Long zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SnapshotMetadataChangeEntity() {
        this(null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public SnapshotMetadataChangeEntity(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Long l, @SafeParcelable.Param(id = 5) BitmapTeleporter bitmapTeleporter, @SafeParcelable.Param(id = 4) Uri uri, @SafeParcelable.Param(id = 6) Long l2) {
        this.zza = str;
        this.zzb = l;
        this.zzd = bitmapTeleporter;
        this.zzc = uri;
        this.zze = l2;
        Preconditions.checkState(bitmapTeleporter != null ? uri == null : true, "Cannot set both a URI and an image");
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadataChange
    public final Bitmap getCoverImage() {
        BitmapTeleporter bitmapTeleporter = this.zzd;
        if (bitmapTeleporter == null) {
            return null;
        }
        return bitmapTeleporter.get();
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadataChange
    public final String getDescription() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadataChange
    public final Long getPlayedTimeMillis() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadataChange
    public final Long getProgressValue() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLongObject(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i, false);
        SafeParcelWriter.writeLongObject(parcel, 6, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadataChange
    public final BitmapTeleporter zza() {
        return this.zzd;
    }
}
