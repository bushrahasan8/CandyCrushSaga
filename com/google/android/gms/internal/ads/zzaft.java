package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: zzaft.class */
public final class zzaft implements zzbx {
    public static final Parcelable.Creator<zzaft> CREATOR;
    private static final zzam zzf;
    private static final zzam zzg;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzh;

    static {
        zzak zzakVar = new zzak();
        zzakVar.zzW("application/id3");
        zzf = zzakVar.zzac();
        zzak zzakVar2 = new zzak();
        zzakVar2.zzW("application/x-scte35");
        zzg = zzakVar2.zzac();
        CREATOR = new zzafs();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaft(Parcel parcel) {
        String readString = parcel.readString();
        int i = zzfy.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.createByteArray();
    }

    public zzaft(String str, String str2, long j, long j2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaft.class != obj.getClass()) {
            return false;
        }
        zzaft zzaftVar = (zzaft) obj;
        return this.zzc == zzaftVar.zzc && this.zzd == zzaftVar.zzd && zzfy.zzF(this.zza, zzaftVar.zza) && zzfy.zzF(this.zzb, zzaftVar.zzb) && Arrays.equals(this.zze, zzaftVar.zze);
    }

    public final int hashCode() {
        int i = this.zzh;
        int i2 = i;
        if (i == 0) {
            String str = this.zza;
            int i3 = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.zzb;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            long j = this.zzc;
            long j2 = this.zzd;
            i2 = ((((((((hashCode + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + i3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.zze);
            this.zzh = i2;
        }
        return i2;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }
}
