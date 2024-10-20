package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.InputStream;

@SafeParcelable.Class(creator = "CacheEntryParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: zzbay.class */
public final class zzbay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbay> CREATOR = new zzbaz();

    @SafeParcelable.Field(getter = "getContentFileDescriptor", id = 2)
    private ParcelFileDescriptor zza;

    @SafeParcelable.Field(getter = "hasAdditionalMetadataFromReadV2", id = 3)
    private final boolean zzb;

    @SafeParcelable.Field(getter = "isDownloaded", id = 4)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "getCachedBytes", id = 5)
    private final long zzd;

    @SafeParcelable.Field(getter = "isGcacheHit", id = 6)
    private final boolean zze;

    public zzbay() {
        this(null, false, false, 0L, false);
    }

    @SafeParcelable.Constructor
    public zzbay(@SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) boolean z2, @SafeParcelable.Param(id = 5) long j, @SafeParcelable.Param(id = 6) boolean z3) {
        this.zza = parcelFileDescriptor;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = j;
        this.zze = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzb(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 3, zzd());
        SafeParcelWriter.writeBoolean(parcel, 4, zzf());
        SafeParcelWriter.writeLong(parcel, 5, zza());
        SafeParcelWriter.writeBoolean(parcel, 6, zzg());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final long zza() {
        long j;
        synchronized (this) {
            j = this.zzd;
        }
        return j;
    }

    final ParcelFileDescriptor zzb() {
        ParcelFileDescriptor parcelFileDescriptor;
        synchronized (this) {
            parcelFileDescriptor = this.zza;
        }
        return parcelFileDescriptor;
    }

    public final InputStream zzc() {
        synchronized (this) {
            if (this.zza == null) {
                return null;
            }
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zza);
            this.zza = null;
            return autoCloseInputStream;
        }
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this) {
            z = this.zzb;
        }
        return z;
    }

    public final boolean zze() {
        ParcelFileDescriptor parcelFileDescriptor;
        synchronized (this) {
            parcelFileDescriptor = this.zza;
        }
        return parcelFileDescriptor != null;
    }

    public final boolean zzf() {
        boolean z;
        synchronized (this) {
            z = this.zzc;
        }
        return z;
    }

    public final boolean zzg() {
        boolean z;
        synchronized (this) {
            z = this.zze;
        }
        return z;
    }
}
