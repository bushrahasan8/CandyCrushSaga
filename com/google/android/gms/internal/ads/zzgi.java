package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: zzgi.class */
public final class zzgi implements zzbx {
    public static final Parcelable.Creator<zzgi> CREATOR = new zzgg();
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzgi(long j, long j2, long j3) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgi(Parcel parcel, zzgh zzghVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgi)) {
            return false;
        }
        zzgi zzgiVar = (zzgi) obj;
        return this.zza == zzgiVar.zza && this.zzb == zzgiVar.zzb && this.zzc == zzgiVar.zzc;
    }

    public final int hashCode() {
        long j = this.zzc;
        long j2 = this.zza;
        int i = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.zzb;
        return ((((i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }
}
