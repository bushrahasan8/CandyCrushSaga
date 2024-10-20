package com.google.android.gms.internal.drive;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.drive.DriveId;

/* loaded from: zzf.class */
public final class zzf {
    private final int status;
    private final int zzct;
    private final DriveId zzk;

    public zzf(zzh zzhVar) {
        this.zzk = zzhVar.zzk;
        this.zzct = zzhVar.zzct;
        this.status = zzhVar.status;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != zzf.class) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzf zzfVar = (zzf) obj;
        return Objects.equal(this.zzk, zzfVar.zzk) && this.zzct == zzfVar.zzct && this.status == zzfVar.status;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzk, Integer.valueOf(this.zzct), Integer.valueOf(this.status));
    }

    public final String toString() {
        return String.format("FileTransferState[TransferType: %d, DriveId: %s, status: %d]", Integer.valueOf(this.zzct), this.zzk, Integer.valueOf(this.status));
    }
}
