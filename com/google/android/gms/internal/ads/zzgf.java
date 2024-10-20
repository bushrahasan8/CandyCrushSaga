package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: zzgf.class */
public final class zzgf implements zzbx {
    public static final Parcelable.Creator<zzgf> CREATOR = new zzgd();
    public final float zza;
    public final float zzb;

    public zzgf(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f) {
            z = false;
            if (f <= 90.0f) {
                z = false;
                if (f2 >= -180.0f) {
                    z = false;
                    if (f2 <= 180.0f) {
                        z = true;
                    }
                }
            }
        }
        zzek.zze(z, "Invalid latitude or longitude");
        this.zza = f;
        this.zzb = f2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgf(Parcel parcel, zzge zzgeVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzgf.class != obj.getClass()) {
            return false;
        }
        zzgf zzgfVar = (zzgf) obj;
        return this.zza == zzgfVar.zza && this.zzb == zzgfVar.zzb;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.valueOf(this.zzb).hashCode();
    }

    public final String toString() {
        return "xyz: latitude=" + this.zza + ", longitude=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.zza);
        parcel.writeFloat(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }
}
