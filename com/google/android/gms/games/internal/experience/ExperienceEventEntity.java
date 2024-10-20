package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.zzh;

@UsedByReflection("GamesGmsClientImpl.java")
@SafeParcelable.Class(creator = "ExperienceEventEntityCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: ExperienceEventEntity.class */
public final class ExperienceEventEntity extends zzh implements ExperienceEvent {
    public static final Parcelable.Creator<ExperienceEventEntity> CREATOR = new zza();

    @SafeParcelable.Field(getter = "getExperienceId", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getGame", id = 2)
    private final GameEntity zzb;

    @SafeParcelable.Field(getter = "getDisplayTitle", id = 3)
    private final String zzc;

    @SafeParcelable.Field(getter = "getDisplayDescription", id = 4)
    private final String zzd;

    @SafeParcelable.Field(getter = "getIconImageUrl", id = 5)
    private final String zze;

    @SafeParcelable.Field(getter = "getIconImageUri", id = 6)
    private final Uri zzf;

    @SafeParcelable.Field(getter = "getCreatedTimestamp", id = 7)
    private final long zzg;

    @SafeParcelable.Field(getter = "getXpEarned", id = 8)
    private final long zzh;

    @SafeParcelable.Field(getter = "getCurrentXp", id = 9)
    private final long zzi;

    @SafeParcelable.Field(getter = "getType", id = 10)
    private final int zzj;

    @SafeParcelable.Field(getter = "getNewLevel", id = 11)
    private final int zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public ExperienceEventEntity(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) GameEntity gameEntity, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) Uri uri, @SafeParcelable.Param(id = 7) long j, @SafeParcelable.Param(id = 8) long j2, @SafeParcelable.Param(id = 9) long j3, @SafeParcelable.Param(id = 10) int i, @SafeParcelable.Param(id = 11) int i2) {
        this.zza = str;
        this.zzb = gameEntity;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = uri;
        this.zzg = j;
        this.zzh = j2;
        this.zzi = j3;
        this.zzj = i;
        this.zzk = i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof ExperienceEvent)) {
            z = false;
        } else if (this == obj) {
            z = true;
        } else {
            ExperienceEvent experienceEvent = (ExperienceEvent) obj;
            z = false;
            if (Objects.equal(experienceEvent.zzj(), this.zza)) {
                z = false;
                if (Objects.equal(experienceEvent.zzg(), this.zzb)) {
                    z = false;
                    if (Objects.equal(experienceEvent.zzi(), this.zzc)) {
                        z = false;
                        if (Objects.equal(experienceEvent.zzh(), this.zzd)) {
                            z = false;
                            if (Objects.equal(experienceEvent.getIconImageUrl(), getIconImageUrl())) {
                                z = false;
                                if (Objects.equal(experienceEvent.zzf(), this.zzf)) {
                                    z = false;
                                    if (Objects.equal(Long.valueOf(experienceEvent.zzc()), Long.valueOf(this.zzg))) {
                                        z = false;
                                        if (Objects.equal(Long.valueOf(experienceEvent.zze()), Long.valueOf(this.zzh))) {
                                            z = false;
                                            if (Objects.equal(Long.valueOf(experienceEvent.zzd()), Long.valueOf(this.zzi))) {
                                                z = false;
                                                if (Objects.equal(Integer.valueOf(experienceEvent.zzb()), Integer.valueOf(this.zzj))) {
                                                    if (Objects.equal(Integer.valueOf(experienceEvent.zza()), Integer.valueOf(this.zzk))) {
                                                        return true;
                                                    }
                                                    z = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ ExperienceEvent freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public String getIconImageUrl() {
        return this.zze;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, getIconImageUrl(), this.zzf, Long.valueOf(this.zzg), Long.valueOf(this.zzh), Long.valueOf(this.zzi), Integer.valueOf(this.zzj), Integer.valueOf(this.zzk));
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("ExperienceId", this.zza).add("Game", this.zzb).add("DisplayTitle", this.zzc).add("DisplayDescription", this.zzd).add("IconImageUrl", getIconImageUrl()).add("IconImageUri", this.zzf).add("CreatedTimestamp", Long.valueOf(this.zzg)).add("XpEarned", Long.valueOf(this.zzh)).add("CurrentXp", Long.valueOf(this.zzi)).add("Type", Integer.valueOf(this.zzj)).add("NewLevel", Integer.valueOf(this.zzk)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, getIconImageUrl(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeLong(parcel, 7, this.zzg);
        SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        SafeParcelWriter.writeLong(parcel, 9, this.zzi);
        SafeParcelWriter.writeInt(parcel, 10, this.zzj);
        SafeParcelWriter.writeInt(parcel, 11, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int zza() {
        return this.zzk;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int zzb() {
        return this.zzj;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzc() {
        return this.zzg;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final Uri zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final Game zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String zzh() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String zzi() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String zzj() {
        return this.zza;
    }
}
