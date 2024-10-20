package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: zzbf.class */
public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbf> CREATOR = new zzbe();

    @SafeParcelable.Field(id = 2)
    public final String zza;

    @SafeParcelable.Field(id = 3)
    public final zzba zzb;

    @SafeParcelable.Field(id = 4)
    public final String zzc;

    @SafeParcelable.Field(id = 5)
    public final long zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbf(zzbf zzbfVar, long j) {
        Preconditions.checkNotNull(zzbfVar);
        this.zza = zzbfVar.zza;
        this.zzb = zzbfVar.zzb;
        this.zzc = zzbfVar.zzc;
        this.zzd = j;
    }

    @SafeParcelable.Constructor
    public zzbf(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) zzba zzbaVar, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) long j) {
        this.zza = str;
        this.zzb = zzbaVar;
        this.zzc = str2;
        this.zzd = j;
    }

    public final String toString() {
        return "origin=" + this.zzc + ",name=" + this.zza + ",params=" + String.valueOf(this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
