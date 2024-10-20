package com.google.android.gms.internal.ads;

import com.google.android.gms.drive.DriveFile;

/* loaded from: zzib.class */
public class zzib {
    private int zza;

    public final void zza(int i) {
        this.zza = i | this.zza;
    }

    public void zzb() {
        this.zza = 0;
    }

    public final void zzc(int i) {
        this.zza = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzd(int i) {
        return (this.zza & i) == i;
    }

    public final boolean zze() {
        return zzd(DriveFile.MODE_READ_ONLY);
    }

    public final boolean zzf() {
        return zzd(4);
    }

    public final boolean zzg() {
        return zzd(1);
    }

    public final boolean zzh() {
        return zzd(DriveFile.MODE_WRITE_ONLY);
    }
}
