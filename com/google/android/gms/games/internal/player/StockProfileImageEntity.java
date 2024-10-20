package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.internal.zzh;

@UsedByReflection("GamesGmsClientImpl.java")
@SafeParcelable.Class(creator = "StockProfileImageEntityCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: StockProfileImageEntity.class */
public final class StockProfileImageEntity extends zzh implements StockProfileImage {
    public static final Parcelable.Creator<StockProfileImageEntity> CREATOR = new zzf();

    @SafeParcelable.Field(getter = "getImageUrl", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getImageUri", id = 2)
    private final Uri zzb;

    @SafeParcelable.Constructor
    public StockProfileImageEntity(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Uri uri) {
        this.zza = str;
        this.zzb = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StockProfileImage)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        StockProfileImage stockProfileImage = (StockProfileImage) obj;
        return Objects.equal(this.zza, stockProfileImage.getImageUrl()) && Objects.equal(this.zzb, stockProfileImage.zza());
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ StockProfileImage freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    public String getImageUrl() {
        return this.zza;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("ImageId", this.zza).add("ImageUri", this.zzb).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getImageUrl(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    public final Uri zza() {
        return this.zzb;
    }
}
