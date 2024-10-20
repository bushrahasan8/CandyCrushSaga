package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: zzahm.class */
public final class zzahm implements zzbx {
    public static final Parcelable.Creator<zzahm> CREATOR = new zzahk();
    public final float zza;
    public final int zzb;

    public zzahm(float f, int i) {
        this.zza = f;
        this.zzb = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzahm(Parcel parcel, zzahl zzahlVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzahm.class != obj.getClass()) {
            return false;
        }
        zzahm zzahmVar = (zzahm) obj;
        return this.zza == zzahmVar.zza && this.zzb == zzahmVar.zzb;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.zza + ", svcTemporalLayerCount=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }
}
