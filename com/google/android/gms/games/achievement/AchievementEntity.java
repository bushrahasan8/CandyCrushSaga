package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.zzh;

@UsedByReflection("GamesGmsClientImpl.java")
@SafeParcelable.Class(creator = "AchievementEntityCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: AchievementEntity.class */
public final class AchievementEntity extends zzh implements Achievement {
    public static final Parcelable.Creator<AchievementEntity> CREATOR = new zza();

    @SafeParcelable.Field(getter = "getAchievementId", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getName", id = 3)
    private final String zzc;

    @SafeParcelable.Field(getter = "getDescription", id = 4)
    private final String zzd;

    @SafeParcelable.Field(getter = "getUnlockedImageUri", id = 5)
    private final Uri zze;

    @SafeParcelable.Field(getter = "getUnlockedImageUrl", id = 6)
    private final String zzf;

    @SafeParcelable.Field(getter = "getRevealedImageUri", id = 7)
    private final Uri zzg;

    @SafeParcelable.Field(getter = "getRevealedImageUrl", id = 8)
    private final String zzh;

    @SafeParcelable.Field(getter = "getTotalStepsRaw", id = 9)
    private final int zzi;

    @SafeParcelable.Field(getter = "getFormattedTotalStepsRaw", id = 10)
    private final String zzj;

    @SafeParcelable.Field(getter = "getPlayerInternal", id = 11)
    private final PlayerEntity zzk;

    @SafeParcelable.Field(getter = "getState", id = 12)
    private final int zzl;

    @SafeParcelable.Field(getter = "getCurrentStepsRaw", id = 13)
    private final int zzm;

    @SafeParcelable.Field(getter = "getFormattedCurrentStepsRaw", id = 14)
    private final String zzn;

    @SafeParcelable.Field(getter = "getLastUpdatedTimestamp", id = 15)
    private final long zzo;

    @SafeParcelable.Field(getter = "getXpValue", id = 16)
    private final long zzp;

    @SafeParcelable.Field(defaultValue = "-1.0f", getter = "getRarityPercent", id = 17)
    private final float zzq;

    @SafeParcelable.Field(getter = "getApplicationId", id = 18)
    private final String zzr;

    public AchievementEntity(Achievement achievement) {
        String achievementId = achievement.getAchievementId();
        this.zza = achievementId;
        this.zzb = achievement.getType();
        this.zzc = achievement.getName();
        String description = achievement.getDescription();
        this.zzd = description;
        this.zze = achievement.getUnlockedImageUri();
        this.zzf = achievement.getUnlockedImageUrl();
        this.zzg = achievement.getRevealedImageUri();
        this.zzh = achievement.getRevealedImageUrl();
        Player zzb = achievement.zzb();
        if (zzb != null) {
            this.zzk = new PlayerEntity(zzb);
        } else {
            this.zzk = null;
        }
        this.zzl = achievement.getState();
        this.zzo = achievement.getLastUpdatedTimestamp();
        this.zzp = achievement.getXpValue();
        this.zzq = achievement.zza();
        this.zzr = achievement.zzc();
        if (achievement.getType() == 1) {
            this.zzi = achievement.getTotalSteps();
            this.zzj = achievement.getFormattedTotalSteps();
            this.zzm = achievement.getCurrentSteps();
            this.zzn = achievement.getFormattedCurrentSteps();
        } else {
            this.zzi = 0;
            this.zzj = null;
            this.zzm = 0;
            this.zzn = null;
        }
        Asserts.checkNotNull(achievementId);
        Asserts.checkNotNull(description);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public AchievementEntity(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) Uri uri, @SafeParcelable.Param(id = 6) String str4, @SafeParcelable.Param(id = 7) Uri uri2, @SafeParcelable.Param(id = 8) String str5, @SafeParcelable.Param(id = 9) int i2, @SafeParcelable.Param(id = 10) String str6, @SafeParcelable.Param(id = 11) PlayerEntity playerEntity, @SafeParcelable.Param(id = 12) int i3, @SafeParcelable.Param(id = 13) int i4, @SafeParcelable.Param(id = 14) String str7, @SafeParcelable.Param(id = 15) long j, @SafeParcelable.Param(id = 16) long j2, @SafeParcelable.Param(id = 17) float f, @SafeParcelable.Param(id = 18) String str8) {
        this.zza = str;
        this.zzb = i;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = uri;
        this.zzf = str4;
        this.zzg = uri2;
        this.zzh = str5;
        this.zzi = i2;
        this.zzj = str6;
        this.zzk = playerEntity;
        this.zzl = i3;
        this.zzm = i4;
        this.zzn = str7;
        this.zzo = j;
        this.zzp = j2;
        this.zzq = f;
        this.zzr = str8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(Achievement achievement) {
        int i;
        int i2;
        if (achievement.getType() == 1) {
            i = achievement.getCurrentSteps();
            i2 = achievement.getTotalSteps();
        } else {
            i = 0;
            i2 = 0;
        }
        return Objects.hashCode(achievement.getAchievementId(), achievement.zzc(), achievement.getName(), Integer.valueOf(achievement.getType()), achievement.getDescription(), Long.valueOf(achievement.getXpValue()), Integer.valueOf(achievement.getState()), Long.valueOf(achievement.getLastUpdatedTimestamp()), achievement.zzb(), Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zze(Achievement achievement) {
        Objects.ToStringHelper add = Objects.toStringHelper(achievement).add("Id", achievement.getAchievementId()).add("Game Id", achievement.zzc()).add("Type", Integer.valueOf(achievement.getType())).add("Name", achievement.getName()).add("Description", achievement.getDescription()).add("Player", achievement.zzb()).add("State", Integer.valueOf(achievement.getState())).add("Rarity Percent", Float.valueOf(achievement.zza()));
        if (achievement.getType() == 1) {
            add.add("CurrentSteps", Integer.valueOf(achievement.getCurrentSteps()));
            add.add("TotalSteps", Integer.valueOf(achievement.getTotalSteps()));
        }
        return add.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzf(Achievement achievement, Object obj) {
        if (!(obj instanceof Achievement)) {
            return false;
        }
        if (achievement == obj) {
            return true;
        }
        Achievement achievement2 = (Achievement) obj;
        if (achievement2.getType() != achievement.getType()) {
            return false;
        }
        return (achievement.getType() != 1 || (achievement2.getCurrentSteps() == achievement.getCurrentSteps() && achievement2.getTotalSteps() == achievement.getTotalSteps())) && achievement2.getXpValue() == achievement.getXpValue() && achievement2.getState() == achievement.getState() && achievement2.getLastUpdatedTimestamp() == achievement.getLastUpdatedTimestamp() && Objects.equal(achievement2.getAchievementId(), achievement.getAchievementId()) && Objects.equal(achievement2.zzc(), achievement.zzc()) && Objects.equal(achievement2.getName(), achievement.getName()) && Objects.equal(achievement2.getDescription(), achievement.getDescription()) && Objects.equal(achievement2.zzb(), achievement.zzb()) && achievement2.zza() == achievement.zza();
    }

    public boolean equals(Object obj) {
        return zzf(this, obj);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.data.Freezable
    public Achievement freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ Achievement freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String getAchievementId() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int getCurrentSteps() {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        Asserts.checkState(z);
        return this.zzm;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String getDescription() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public void getDescription(CharArrayBuffer charArrayBuffer) {
        DataUtils.copyStringToBuffer(this.zzd, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String getFormattedCurrentSteps() {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        Asserts.checkState(z);
        return this.zzn;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public void getFormattedCurrentSteps(CharArrayBuffer charArrayBuffer) {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        Asserts.checkState(z);
        DataUtils.copyStringToBuffer(this.zzn, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String getFormattedTotalSteps() {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        Asserts.checkState(z);
        return this.zzj;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public void getFormattedTotalSteps(CharArrayBuffer charArrayBuffer) {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        Asserts.checkState(z);
        DataUtils.copyStringToBuffer(this.zzj, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public long getLastUpdatedTimestamp() {
        return this.zzo;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String getName() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public void getName(CharArrayBuffer charArrayBuffer) {
        DataUtils.copyStringToBuffer(this.zzc, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public Player getPlayer() {
        return (Player) Preconditions.checkNotNull(this.zzk);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public Uri getRevealedImageUri() {
        return this.zzg;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String getRevealedImageUrl() {
        return this.zzh;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int getState() {
        return this.zzl;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int getTotalSteps() {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        Asserts.checkState(z);
        return this.zzi;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int getType() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public Uri getUnlockedImageUri() {
        return this.zze;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String getUnlockedImageUrl() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public long getXpValue() {
        return this.zzp;
    }

    public int hashCode() {
        return zzd(this);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return zze(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getAchievementId(), false);
        SafeParcelWriter.writeInt(parcel, 2, getType());
        SafeParcelWriter.writeString(parcel, 3, getName(), false);
        SafeParcelWriter.writeString(parcel, 4, getDescription(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, getUnlockedImageUri(), i, false);
        SafeParcelWriter.writeString(parcel, 6, getUnlockedImageUrl(), false);
        SafeParcelWriter.writeParcelable(parcel, 7, getRevealedImageUri(), i, false);
        SafeParcelWriter.writeString(parcel, 8, getRevealedImageUrl(), false);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.writeString(parcel, 10, this.zzj, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i, false);
        SafeParcelWriter.writeInt(parcel, 12, getState());
        SafeParcelWriter.writeInt(parcel, 13, this.zzm);
        SafeParcelWriter.writeString(parcel, 14, this.zzn, false);
        SafeParcelWriter.writeLong(parcel, 15, getLastUpdatedTimestamp());
        SafeParcelWriter.writeLong(parcel, 16, getXpValue());
        SafeParcelWriter.writeFloat(parcel, 17, this.zzq);
        SafeParcelWriter.writeString(parcel, 18, this.zzr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final float zza() {
        return this.zzq;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final Player zzb() {
        return this.zzk;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final String zzc() {
        return this.zzr;
    }
}
