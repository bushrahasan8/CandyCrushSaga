package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.drive.zzbn;
import com.google.android.gms.internal.drive.zzbs;
import com.google.android.gms.internal.drive.zzdp;
import com.google.android.gms.internal.drive.zzfb;
import com.google.android.gms.internal.drive.zzfd;
import com.google.android.gms.internal.drive.zzjx;
import com.google.android.gms.internal.drive.zzkk;
import com.google.android.gms.internal.drive.zzkq;

@SafeParcelable.Class(creator = "DriveIdCreator")
@SafeParcelable.Reserved({1})
/* loaded from: DriveId.class */
public class DriveId extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<DriveId> CREATOR = new zzk();
    public static final int RESOURCE_TYPE_FILE = 0;
    public static final int RESOURCE_TYPE_FOLDER = 1;
    public static final int RESOURCE_TYPE_UNKNOWN = -1;

    @SafeParcelable.Field(id = 2)
    private final String zzad;

    @SafeParcelable.Field(id = 3)
    private final long zzae;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.drive.DriveId.RESOURCE_TYPE_UNKNOWN", id = 5)
    private final int zzaf;

    @SafeParcelable.Field(id = 4)
    private final long zzf;
    private volatile String zzh = null;
    private volatile String zzag = null;

    @SafeParcelable.Constructor
    public DriveId(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) long j2, @SafeParcelable.Param(id = 5) int i) {
        this.zzad = str;
        Preconditions.checkArgument(!"".equals(str));
        Preconditions.checkArgument(str == null ? j != -1 : true);
        this.zzae = j;
        this.zzf = j2;
        this.zzaf = i;
    }

    public static DriveId decodeFromString(String str) {
        Preconditions.checkArgument(str.startsWith("DriveId:"), str.length() != 0 ? "Invalid DriveId: ".concat(str) : new String("Invalid DriveId: "));
        return zza(Base64.decode(str.substring(8), 10));
    }

    @VisibleForTesting
    public static DriveId zza(String str) {
        Preconditions.checkNotNull(str);
        return new DriveId(str, -1L, -1L, -1);
    }

    @VisibleForTesting
    private static DriveId zza(byte[] bArr) {
        try {
            zzfb zza = zzfb.zza(bArr, zzjx.zzcj());
            return new DriveId("".equals(zza.getResourceId()) ? null : zza.getResourceId(), zza.zzal(), zza.zzam(), zza.getResourceType());
        } catch (zzkq e) {
            throw new IllegalArgumentException();
        }
    }

    public DriveFile asDriveFile() {
        if (this.zzaf != 1) {
            return new zzbn(this);
        }
        throw new IllegalStateException("This DriveId corresponds to a folder. Call asDriveFolder instead.");
    }

    public DriveFolder asDriveFolder() {
        if (this.zzaf != 0) {
            return new zzbs(this);
        }
        throw new IllegalStateException("This DriveId corresponds to a file. Call asDriveFile instead.");
    }

    public DriveResource asDriveResource() {
        int i = this.zzaf;
        return i == 1 ? asDriveFolder() : i == 0 ? asDriveFile() : new zzdp(this);
    }

    public final String encodeToString() {
        if (this.zzh == null) {
            zzfb.zza zzm = zzfb.zzan().zzm(1);
            String str = this.zzad;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            String valueOf = String.valueOf(Base64.encodeToString(((zzfb) ((zzkk) zzm.zze(str2).zzg(this.zzae).zzh(this.zzf).zzn(this.zzaf).zzdf())).toByteArray(), 10));
            this.zzh = valueOf.length() != 0 ? "DriveId:".concat(valueOf) : new String("DriveId:");
        }
        return this.zzh;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == null || obj.getClass() != DriveId.class) {
            return false;
        }
        DriveId driveId = (DriveId) obj;
        if (driveId.zzf != this.zzf) {
            return false;
        }
        long j = driveId.zzae;
        if (j == -1 && this.zzae == -1) {
            return driveId.zzad.equals(this.zzad);
        }
        String str2 = this.zzad;
        return (str2 == null || (str = driveId.zzad) == null) ? j == this.zzae : j == this.zzae && str.equals(str2);
    }

    public String getResourceId() {
        return this.zzad;
    }

    public int getResourceType() {
        return this.zzaf;
    }

    public int hashCode() {
        if (this.zzae == -1) {
            return this.zzad.hashCode();
        }
        String valueOf = String.valueOf(String.valueOf(this.zzf));
        String valueOf2 = String.valueOf(String.valueOf(this.zzae));
        return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
    }

    public final String toInvariantString() {
        if (this.zzag == null) {
            this.zzag = Base64.encodeToString(((zzfd) ((zzkk) zzfd.zzap().zzi(this.zzae).zzj(this.zzf).zzdf())).toByteArray(), 10);
        }
        return this.zzag;
    }

    public String toString() {
        return encodeToString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzad, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzae);
        SafeParcelWriter.writeLong(parcel, 4, this.zzf);
        SafeParcelWriter.writeInt(parcel, 5, this.zzaf);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
