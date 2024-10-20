package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.internal.zzh;

@UsedByReflection("GamesGmsClientImpl.java")
@SafeParcelable.Class(creator = "ScreenshotEntityCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: ScreenshotEntity.class */
public final class ScreenshotEntity extends zzh implements Freezable, Parcelable {
    public static final Parcelable.Creator<ScreenshotEntity> CREATOR = new zzd();

    @SafeParcelable.Field(getter = "getUri", id = 1)
    private final Uri zza;

    @SafeParcelable.Field(getter = "getWidth", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getHeight", id = 3)
    private final int zzc;

    @SafeParcelable.Constructor
    public ScreenshotEntity(@SafeParcelable.Param(id = 1) Uri uri, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) int i2) {
        this.zza = uri;
        this.zzb = i;
        this.zzc = i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof ScreenshotEntity)) {
            z = false;
        } else if (this == obj) {
            z = true;
        } else {
            ScreenshotEntity screenshotEntity = (ScreenshotEntity) obj;
            z = false;
            if (Objects.equal(screenshotEntity.zza, this.zza)) {
                z = false;
                if (Objects.equal(Integer.valueOf(screenshotEntity.zzb), Integer.valueOf(this.zzb))) {
                    if (Objects.equal(Integer.valueOf(screenshotEntity.zzc), Integer.valueOf(this.zzc))) {
                        return true;
                    }
                    z = false;
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ Object freeze() {
        return this;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("Uri", this.zza).add("Width", Integer.valueOf(this.zzb)).add("Height", Integer.valueOf(this.zzc)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
