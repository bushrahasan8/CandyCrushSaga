package com.google.android.gms.internal.games_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GamesSignInRequestCreator")
/* loaded from: zzy.class */
public final class zzy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzy> CREATOR = new zzz();

    @SafeParcelable.Field(getter = "getSignInType", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getPreviousStepResolutionResult", id = 2)
    private final zzaf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzy(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) zzaf zzafVar) {
        this.zza = i;
        this.zzb = zzafVar;
    }

    public static zzy zzb(int i) {
        return new zzy(i, null);
    }

    public static zzy zzc(int i, zzaf zzafVar) {
        return new zzy(i, zzafVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzy)) {
            return false;
        }
        zzy zzyVar = (zzy) obj;
        return this.zza == zzyVar.zza && Objects.equal(this.zzb, zzyVar.zzb);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("signInType", Integer.valueOf(this.zza)).add("previousStepResolutionResult", this.zzb).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzb == null;
    }
}
