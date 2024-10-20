package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

@UsedByReflection("GamesGmsClientImpl.java")
@SafeParcelable.Class(creator = "GameBadgeEntityCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: GameBadgeEntity.class */
public final class GameBadgeEntity extends GamesDowngradeableSafeParcel implements zza {
    public static final Parcelable.Creator<GameBadgeEntity> CREATOR = new zzb();

    @SafeParcelable.Field(getter = "getType", id = 1)
    private int zza;

    @SafeParcelable.Field(getter = "getTitle", id = 2)
    private String zzb;

    @SafeParcelable.Field(getter = "getDescription", id = 3)
    private String zzc;

    @SafeParcelable.Field(getter = "getIconImageUri", id = 4)
    private Uri zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public GameBadgeEntity(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) Uri uri) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = uri;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof zza)) {
            z = false;
        } else if (this == obj) {
            z = true;
        } else {
            zza zzaVar = (zza) obj;
            z = false;
            if (Objects.equal(Integer.valueOf(zzaVar.zza()), this.zzb)) {
                if (Objects.equal(zzaVar.zzb(), this.zzd)) {
                    return true;
                }
                z = false;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ Object freeze() {
        return this;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("Type", Integer.valueOf(this.zza)).add("Title", this.zzb).add("Description", this.zzc).add("IconImageUri", this.zzd).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (shouldDowngrade()) {
            parcel.writeInt(this.zza);
            parcel.writeString(this.zzb);
            parcel.writeString(this.zzc);
            Uri uri = this.zzd;
            parcel.writeString(uri == null ? null : uri.toString());
            return;
        }
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.games.internal.game.zza
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.internal.game.zza
    public final String zzb() {
        return this.zzc;
    }
}
