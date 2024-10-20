package com.google.android.gms.games;

import android.annotation.SuppressLint;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

@SuppressLint({"ParcelCreator"})
/* loaded from: zzv.class */
public final class zzv extends zzo implements PlayerRelationshipInfo {
    private final com.google.android.gms.games.internal.player.zzd zza;

    public zzv(DataHolder dataHolder, int i, com.google.android.gms.games.internal.player.zzd zzdVar) {
        super(dataHolder, i);
        this.zza = zzdVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(Object obj) {
        return zzt.zzf(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ PlayerRelationshipInfo freeze() {
        return new zzt(this);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final int getFriendStatus() {
        return zzp(this.zza.zzG, -1);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return zzt.zzd(this);
    }

    public final String toString() {
        return zzt.zze(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzu.zza(new zzt(this), parcel, i);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zza() {
        return zzq(this.zza.zzI, null);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzb() {
        return zzq(this.zza.zzH, null);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzc() {
        return zzq(this.zza.zzJ, null);
    }
}
