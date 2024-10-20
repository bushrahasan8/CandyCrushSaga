package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.t2;

@Deprecated
/* loaded from: zzafy.class */
public class zzafy implements zzbx {
    public static final Parcelable.Creator<zzafy> CREATOR = new zzafx();
    public final String zza;
    public final String zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzafy(Parcel parcel) {
        String readString = parcel.readString();
        int i = zzfy.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
    }

    public zzafy(String str, String str2) {
        this.zza = zzfwk.zzb(str);
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzafy zzafyVar = (zzafy) obj;
        return this.zza.equals(zzafyVar.zza) && this.zzb.equals(zzafyVar.zzb);
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return "VC: " + this.zza + t2.i.b + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbx
    public final void zza(zzbt zzbtVar) {
        boolean z;
        String str = this.zza;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    z = 4;
                    break;
                }
                z = -1;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    z = 3;
                    break;
                }
                z = -1;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        if (!z) {
            zzbtVar.zzq(this.zzb);
            return;
        }
        if (z) {
            zzbtVar.zze(this.zzb);
            return;
        }
        if (z == 2) {
            zzbtVar.zzd(this.zzb);
        } else if (z == 3) {
            zzbtVar.zzc(this.zzb);
        } else {
            if (z != 4) {
                return;
            }
            zzbtVar.zzh(this.zzb);
        }
    }
}
