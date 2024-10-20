package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.games.Game;

@VisibleForTesting
/* loaded from: ExperienceEvent.class */
public interface ExperienceEvent extends Freezable<ExperienceEvent>, Parcelable {
    @Deprecated
    @KeepName
    String getIconImageUrl();

    int zza();

    int zzb();

    long zzc();

    long zzd();

    long zze();

    Uri zzf();

    Game zzg();

    String zzh();

    String zzi();

    String zzj();
}
