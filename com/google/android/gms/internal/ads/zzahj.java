package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: zzahj.class */
public final class zzahj implements zzbx {
    public static final Parcelable.Creator<zzahj> CREATOR = new zzahf();
    public final List zza;

    public zzahj(List list) {
        boolean z;
        this.zza = list;
        if (list.isEmpty()) {
            z = false;
        } else {
            long j = ((zzahi) list.get(0)).zzc;
            int i = 1;
            while (true) {
                z = false;
                if (i >= list.size()) {
                    break;
                }
                if (((zzahi) list.get(i)).zzb < j) {
                    z = true;
                    break;
                } else {
                    j = ((zzahi) list.get(i)).zzc;
                    i++;
                }
            }
        }
        zzek.zzd(!z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzahj.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzahj) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }
}
