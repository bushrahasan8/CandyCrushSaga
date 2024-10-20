package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.id;

@SafeParcelable.Class(creator = "PoolConfigurationCreator")
/* loaded from: zzfjc.class */
public final class zzfjc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfjc> CREATOR = new zzfjd();
    public final Context zza;
    public final zzfiz zzb;

    @SafeParcelable.Field(id = 2)
    public final int zzc;

    @SafeParcelable.Field(id = 3)
    public final int zzd;

    @SafeParcelable.Field(id = 4)
    public final int zze;

    @SafeParcelable.Field(id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfiz[] zzh;

    @SafeParcelable.Field(getter = "getFormatInt", id = 1)
    private final int zzi;

    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzj;

    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzfjc(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) int i4, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) int i5, @SafeParcelable.Param(id = 7) int i6) {
        zzfiz[] values = zzfiz.values();
        this.zzh = values;
        int[] zza = zzfja.zza();
        this.zzl = zza;
        int[] zza2 = zzfjb.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = values[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = zza[i5];
        this.zzk = i6;
        int i7 = zza2[i6];
    }

    private zzfjc(Context context, zzfiz zzfizVar, int i, int i2, int i3, String str, String str2, String str3) {
        this.zzh = zzfiz.values();
        this.zzl = zzfja.zza();
        this.zzm = zzfjb.zza();
        this.zza = context;
        this.zzi = zzfizVar.ordinal();
        this.zzb = zzfizVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        int i4 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.zzg = i4;
        this.zzj = i4 - 1;
        id.g.equals(str3);
        this.zzk = 0;
    }

    public static zzfjc zza(zzfiz zzfizVar, Context context) {
        if (zzfizVar == zzfiz.Rewarded) {
            return new zzfjc(context, zzfizVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgt)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgz)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgB)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgD), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgv), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgx));
        }
        if (zzfizVar == zzfiz.Interstitial) {
            return new zzfjc(context, zzfizVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgu)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgA)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgC)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgE), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgw), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgy));
        }
        if (zzfizVar != zzfiz.AppOpen) {
            return null;
        }
        return new zzfjc(context, zzfizVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgH)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgJ)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgK)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgF), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgG), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgI));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzi;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
