package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: zzahe.class */
public final class zzahe implements zzbx {
    public static final Parcelable.Creator<zzahe> CREATOR = new zzahc();
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzahe(long j, long j2, long j3, long j4, long j5) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzahe(Parcel parcel, zzahd zzahdVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzahe.class != obj.getClass()) {
            return false;
        }
        zzahe zzaheVar = (zzahe) obj;
        return this.zza == zzaheVar.zza && this.zzb == zzaheVar.zzb && this.zzc == zzaheVar.zzc && this.zzd == zzaheVar.zzd && this.zze == zzaheVar.zze;
    }

    public final int hashCode() {
        long j = this.zze;
        long j2 = this.zza;
        int i = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.zzd;
        long j4 = this.zzc;
        long j5 = this.zzb;
        return ((((((((i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) ((j5 >>> 32) ^ j5))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.zza + ", photoSize=" + this.zzb + ", photoPresentationTimestampUs=" + this.zzc + ", videoStartPosition=" + this.zzd + ", videoSize=" + this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }
}
