package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.common.util.RetainForClient;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;

@UsedByReflection("GamesGmsClientImpl.java")
@RetainForClient
@SafeParcelable.Class(creator = "PlayerEntityCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: PlayerEntity.class */
public final class PlayerEntity extends GamesDowngradeableSafeParcel implements Player {
    public static final Parcelable.Creator<PlayerEntity> CREATOR = new zzp();

    @SafeParcelable.Field(getter = "getPlayerId", id = 1)
    private String zza;

    @SafeParcelable.Field(getter = "getDisplayName", id = 2)
    private String zzb;

    @SafeParcelable.Field(getter = "getIconImageUri", id = 3)
    private final Uri zzc;

    @SafeParcelable.Field(getter = "getHiResImageUri", id = 4)
    private final Uri zzd;

    @SafeParcelable.Field(getter = "getRetrievedTimestamp", id = 5)
    private final long zze;

    @SafeParcelable.Field(getter = "isInCircles", id = 6)
    private final int zzf;

    @SafeParcelable.Field(getter = "getLastPlayedWithTimestamp", id = 7)
    private final long zzg;

    @SafeParcelable.Field(getter = "getIconImageUrl", id = 8)
    private final String zzh;

    @SafeParcelable.Field(getter = "getHiResImageUrl", id = 9)
    private final String zzi;

    @SafeParcelable.Field(getter = "getTitle", id = 14)
    private final String zzj;

    @SafeParcelable.Field(getter = "getMostRecentGameInfo", id = 15)
    private final MostRecentGameInfoEntity zzk;

    @SafeParcelable.Field(getter = "getLevelInfo", id = 16)
    private final PlayerLevelInfo zzl;

    @SafeParcelable.Field(getter = "isProfileVisible", id = 18)
    private final boolean zzm;

    @SafeParcelable.Field(getter = "hasDebugAccess", id = 19)
    private final boolean zzn;

    @SafeParcelable.Field(getter = "getGamerTag", id = 20)
    private final String zzo;

    @SafeParcelable.Field(getter = "getName", id = 21)
    private final String zzp;

    @SafeParcelable.Field(getter = "getBannerImageLandscapeUri", id = 22)
    private final Uri zzq;

    @SafeParcelable.Field(getter = "getBannerImageLandscapeUrl", id = 23)
    private final String zzr;

    @SafeParcelable.Field(getter = "getBannerImagePortraitUri", id = 24)
    private final Uri zzs;

    @SafeParcelable.Field(getter = "getBannerImagePortraitUrl", id = Sdk$SDKMetric.SDKMetricType.VIEW_NOT_VISIBLE_ON_PLAY_VALUE)
    private final String zzt;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getTotalUnlockedAchievement", id = Sdk$SDKMetric.SDKMetricType.NOTIFICATION_REDIRECT_VALUE)
    private long zzu;

    @SafeParcelable.Field(getter = "getRelationshipInfo", id = 33)
    private final zzt zzv;

    @SafeParcelable.Field(getter = "getCurrentPlayerInfo", id = 35)
    private final zza zzw;

    @SafeParcelable.Field(getter = "isAlwaysAutoSignIn", id = 36)
    private boolean zzx;

    public PlayerEntity(Player player) {
        this.zza = player.getPlayerId();
        this.zzb = player.getDisplayName();
        this.zzc = player.getIconImageUri();
        this.zzh = player.getIconImageUrl();
        this.zzd = player.getHiResImageUri();
        this.zzi = player.getHiResImageUrl();
        long retrievedTimestamp = player.getRetrievedTimestamp();
        this.zze = retrievedTimestamp;
        this.zzf = player.zza();
        this.zzg = player.getLastPlayedWithTimestamp();
        this.zzj = player.getTitle();
        this.zzm = player.zzh();
        com.google.android.gms.games.internal.player.zza zzc = player.zzc();
        this.zzk = zzc == null ? null : new MostRecentGameInfoEntity(zzc);
        this.zzl = player.getLevelInfo();
        this.zzn = player.zzf();
        this.zzo = player.zzd();
        this.zzp = player.zze();
        this.zzq = player.getBannerImageLandscapeUri();
        this.zzr = player.getBannerImageLandscapeUrl();
        this.zzs = player.getBannerImagePortraitUri();
        this.zzt = player.getBannerImagePortraitUrl();
        this.zzu = player.zzb();
        PlayerRelationshipInfo relationshipInfo = player.getRelationshipInfo();
        this.zzv = relationshipInfo == null ? null : new zzt(relationshipInfo.freeze());
        CurrentPlayerInfo currentPlayerInfo = player.getCurrentPlayerInfo();
        this.zzw = (zza) (currentPlayerInfo == null ? null : currentPlayerInfo.freeze());
        this.zzx = player.zzg();
        Asserts.checkNotNull(this.zza);
        Asserts.checkNotNull(this.zzb);
        Asserts.checkState(retrievedTimestamp > 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public PlayerEntity(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) Uri uri, @SafeParcelable.Param(id = 4) Uri uri2, @SafeParcelable.Param(id = 5) long j, @SafeParcelable.Param(id = 6) int i, @SafeParcelable.Param(id = 7) long j2, @SafeParcelable.Param(id = 8) String str3, @SafeParcelable.Param(id = 9) String str4, @SafeParcelable.Param(id = 14) String str5, @SafeParcelable.Param(id = 15) MostRecentGameInfoEntity mostRecentGameInfoEntity, @SafeParcelable.Param(id = 16) PlayerLevelInfo playerLevelInfo, @SafeParcelable.Param(id = 18) boolean z, @SafeParcelable.Param(id = 19) boolean z2, @SafeParcelable.Param(id = 20) String str6, @SafeParcelable.Param(id = 21) String str7, @SafeParcelable.Param(id = 22) Uri uri3, @SafeParcelable.Param(id = 23) String str8, @SafeParcelable.Param(id = 24) Uri uri4, @SafeParcelable.Param(id = 25) String str9, @SafeParcelable.Param(id = 29) long j3, @SafeParcelable.Param(id = 33) zzt zztVar, @SafeParcelable.Param(id = 35) zza zzaVar, @SafeParcelable.Param(id = 36) boolean z3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = uri;
        this.zzh = str3;
        this.zzd = uri2;
        this.zzi = str4;
        this.zze = j;
        this.zzf = i;
        this.zzg = j2;
        this.zzj = str5;
        this.zzm = z;
        this.zzk = mostRecentGameInfoEntity;
        this.zzl = playerLevelInfo;
        this.zzn = z2;
        this.zzo = str6;
        this.zzp = str7;
        this.zzq = uri3;
        this.zzr = str8;
        this.zzs = uri4;
        this.zzt = str9;
        this.zzu = j3;
        this.zzv = zztVar;
        this.zzw = zzaVar;
        this.zzx = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(Player player) {
        return Objects.hashCode(player.getPlayerId(), player.getDisplayName(), Boolean.valueOf(player.zzf()), player.getIconImageUri(), player.getHiResImageUri(), Long.valueOf(player.getRetrievedTimestamp()), player.getTitle(), player.getLevelInfo(), player.zzd(), player.zze(), player.getBannerImageLandscapeUri(), player.getBannerImagePortraitUri(), Long.valueOf(player.zzb()), player.getRelationshipInfo(), player.getCurrentPlayerInfo(), Boolean.valueOf(player.zzg()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzk(Player player) {
        Objects.ToStringHelper add = Objects.toStringHelper(player).add("PlayerId", player.getPlayerId()).add("DisplayName", player.getDisplayName()).add("HasDebugAccess", Boolean.valueOf(player.zzf())).add("IconImageUri", player.getIconImageUri()).add("IconImageUrl", player.getIconImageUrl()).add("HiResImageUri", player.getHiResImageUri()).add("HiResImageUrl", player.getHiResImageUrl()).add("RetrievedTimestamp", Long.valueOf(player.getRetrievedTimestamp())).add("Title", player.getTitle()).add("LevelInfo", player.getLevelInfo()).add("GamerTag", player.zzd()).add("Name", player.zze()).add("BannerImageLandscapeUri", player.getBannerImageLandscapeUri()).add("BannerImageLandscapeUrl", player.getBannerImageLandscapeUrl()).add("BannerImagePortraitUri", player.getBannerImagePortraitUri()).add("BannerImagePortraitUrl", player.getBannerImagePortraitUrl()).add("CurrentPlayerInfo", player.getCurrentPlayerInfo()).add("TotalUnlockedAchievement", Long.valueOf(player.zzb()));
        if (player.zzg()) {
            add.add("AlwaysAutoSignIn", Boolean.valueOf(player.zzg()));
        }
        if (player.getRelationshipInfo() != null) {
            add.add("RelationshipInfo", player.getRelationshipInfo());
        }
        return add.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzn(Player player, Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        if (player == obj) {
            return true;
        }
        Player player2 = (Player) obj;
        return Objects.equal(player2.getPlayerId(), player.getPlayerId()) && Objects.equal(player2.getDisplayName(), player.getDisplayName()) && Objects.equal(Boolean.valueOf(player2.zzf()), Boolean.valueOf(player.zzf())) && Objects.equal(player2.getIconImageUri(), player.getIconImageUri()) && Objects.equal(player2.getHiResImageUri(), player.getHiResImageUri()) && Objects.equal(Long.valueOf(player2.getRetrievedTimestamp()), Long.valueOf(player.getRetrievedTimestamp())) && Objects.equal(player2.getTitle(), player.getTitle()) && Objects.equal(player2.getLevelInfo(), player.getLevelInfo()) && Objects.equal(player2.zzd(), player.zzd()) && Objects.equal(player2.zze(), player.zze()) && Objects.equal(player2.getBannerImageLandscapeUri(), player.getBannerImageLandscapeUri()) && Objects.equal(player2.getBannerImagePortraitUri(), player.getBannerImagePortraitUri()) && Objects.equal(Long.valueOf(player2.zzb()), Long.valueOf(player.zzb())) && Objects.equal(player2.getCurrentPlayerInfo(), player.getCurrentPlayerInfo()) && Objects.equal(player2.getRelationshipInfo(), player.getRelationshipInfo()) && Objects.equal(Boolean.valueOf(player2.zzg()), Boolean.valueOf(player.zzg()));
    }

    public boolean equals(Object obj) {
        return zzn(this, obj);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.data.Freezable
    public Player freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ Player freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.Player
    public Uri getBannerImageLandscapeUri() {
        return this.zzq;
    }

    @Override // com.google.android.gms.games.Player
    public String getBannerImageLandscapeUrl() {
        return this.zzr;
    }

    @Override // com.google.android.gms.games.Player
    public Uri getBannerImagePortraitUri() {
        return this.zzs;
    }

    @Override // com.google.android.gms.games.Player
    public String getBannerImagePortraitUrl() {
        return this.zzt;
    }

    @Override // com.google.android.gms.games.Player
    public CurrentPlayerInfo getCurrentPlayerInfo() {
        return this.zzw;
    }

    @Override // com.google.android.gms.games.Player
    public String getDisplayName() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.Player
    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        DataUtils.copyStringToBuffer(this.zzb, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Player
    public Uri getHiResImageUri() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.Player
    public String getHiResImageUrl() {
        return this.zzi;
    }

    @Override // com.google.android.gms.games.Player
    public Uri getIconImageUri() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.Player
    public String getIconImageUrl() {
        return this.zzh;
    }

    @Override // com.google.android.gms.games.Player
    public long getLastPlayedWithTimestamp() {
        return this.zzg;
    }

    @Override // com.google.android.gms.games.Player
    public PlayerLevelInfo getLevelInfo() {
        return this.zzl;
    }

    @Override // com.google.android.gms.games.Player
    public String getPlayerId() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.Player
    public PlayerRelationshipInfo getRelationshipInfo() {
        return this.zzv;
    }

    @Override // com.google.android.gms.games.Player
    public long getRetrievedTimestamp() {
        return this.zze;
    }

    @Override // com.google.android.gms.games.Player
    public String getTitle() {
        return this.zzj;
    }

    @Override // com.google.android.gms.games.Player
    public void getTitle(CharArrayBuffer charArrayBuffer) {
        DataUtils.copyStringToBuffer(this.zzj, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Player
    public boolean hasHiResImage() {
        return getHiResImageUri() != null;
    }

    @Override // com.google.android.gms.games.Player
    public boolean hasIconImage() {
        return getIconImageUri() != null;
    }

    public int hashCode() {
        return zzi(this);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return zzk(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (shouldDowngrade()) {
            parcel.writeString(this.zza);
            parcel.writeString(this.zzb);
            Uri uri = this.zzc;
            parcel.writeString(uri == null ? null : uri.toString());
            Uri uri2 = this.zzd;
            parcel.writeString(uri2 == null ? null : uri2.toString());
            parcel.writeLong(this.zze);
            return;
        }
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getPlayerId(), false);
        SafeParcelWriter.writeString(parcel, 2, getDisplayName(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getIconImageUri(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getHiResImageUri(), i, false);
        SafeParcelWriter.writeLong(parcel, 5, getRetrievedTimestamp());
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeLong(parcel, 7, getLastPlayedWithTimestamp());
        SafeParcelWriter.writeString(parcel, 8, getIconImageUrl(), false);
        SafeParcelWriter.writeString(parcel, 9, getHiResImageUrl(), false);
        SafeParcelWriter.writeString(parcel, 14, getTitle(), false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.zzk, i, false);
        SafeParcelWriter.writeParcelable(parcel, 16, getLevelInfo(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 19, this.zzn);
        SafeParcelWriter.writeString(parcel, 20, this.zzo, false);
        SafeParcelWriter.writeString(parcel, 21, this.zzp, false);
        SafeParcelWriter.writeParcelable(parcel, 22, getBannerImageLandscapeUri(), i, false);
        SafeParcelWriter.writeString(parcel, 23, getBannerImageLandscapeUrl(), false);
        SafeParcelWriter.writeParcelable(parcel, 24, getBannerImagePortraitUri(), i, false);
        SafeParcelWriter.writeString(parcel, 25, getBannerImagePortraitUrl(), false);
        SafeParcelWriter.writeLong(parcel, 29, this.zzu);
        SafeParcelWriter.writeParcelable(parcel, 33, getRelationshipInfo(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 35, getCurrentPlayerInfo(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 36, this.zzx);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.games.Player
    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.Player
    public final long zzb() {
        return this.zzu;
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.internal.player.zza zzc() {
        return this.zzk;
    }

    @Override // com.google.android.gms.games.Player
    public final String zzd() {
        return this.zzo;
    }

    @Override // com.google.android.gms.games.Player
    public final String zze() {
        return this.zzp;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzf() {
        return this.zzn;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzg() {
        return this.zzx;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzh() {
        return this.zzm;
    }
}
