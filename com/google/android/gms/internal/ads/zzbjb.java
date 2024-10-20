package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "NativeAdOptionsParcelCreator")
/* loaded from: zzbjb.class */
public final class zzbjb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbjb> CREATOR = new zzbjc();

    @SafeParcelable.Field(id = 1)
    public final int zza;

    @SafeParcelable.Field(id = 2)
    public final boolean zzb;

    @SafeParcelable.Field(id = 3)
    public final int zzc;

    @SafeParcelable.Field(id = 4)
    public final boolean zzd;

    @SafeParcelable.Field(id = 5)
    public final int zze;

    @SafeParcelable.Field(id = 6)
    public final com.google.android.gms.ads.internal.client.zzfk zzf;

    @SafeParcelable.Field(id = 7)
    public final boolean zzg;

    @SafeParcelable.Field(id = 8)
    public final int zzh;

    @SafeParcelable.Field(id = 9)
    public final int zzi;

    @SafeParcelable.Field(id = 10)
    public final boolean zzj;

    @SafeParcelable.Field(id = 11)
    public final int zzk;

    @SafeParcelable.Constructor
    public zzbjb(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) boolean z2, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) com.google.android.gms.ads.internal.client.zzfk zzfkVar, @SafeParcelable.Param(id = 7) boolean z3, @SafeParcelable.Param(id = 8) int i4, @SafeParcelable.Param(id = 9) int i5, @SafeParcelable.Param(id = 10) boolean z4, @SafeParcelable.Param(id = 11) int i6) {
        this.zza = i;
        this.zzb = z;
        this.zzc = i2;
        this.zzd = z2;
        this.zze = i3;
        this.zzf = zzfkVar;
        this.zzg = z3;
        this.zzh = i4;
        this.zzj = z4;
        this.zzi = i5;
        this.zzk = i6;
    }

    @Deprecated
    public zzbjb(NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new com.google.android.gms.ads.internal.client.zzfk(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), 0, false, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r0 == 1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.ads.nativead.NativeAdOptions zza(com.google.android.gms.internal.ads.zzbjb r5) {
        /*
            com.google.android.gms.ads.nativead.NativeAdOptions$Builder r0 = new com.google.android.gms.ads.nativead.NativeAdOptions$Builder
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r5
            if (r0 != 0) goto L13
            r0 = r9
            com.google.android.gms.ads.nativead.NativeAdOptions r0 = r0.build()
            return r0
        L13:
            r0 = r5
            int r0 = r0.zza
            r7 = r0
            r0 = 2
            r6 = r0
            r0 = r7
            r1 = 2
            if (r0 == r1) goto L89
            r0 = r7
            r1 = 3
            if (r0 == r1) goto L72
            r0 = r7
            r1 = 4
            if (r0 == r1) goto L2c
            goto L93
        L2c:
            r0 = r9
            r1 = r5
            boolean r1 = r1.zzg
            com.google.android.gms.ads.nativead.NativeAdOptions$Builder r0 = r0.setRequestCustomMuteThisAd(r1)
            r0 = r9
            r1 = r5
            int r1 = r1.zzh
            com.google.android.gms.ads.nativead.NativeAdOptions$Builder r0 = r0.setMediaAspectRatio(r1)
            r0 = r9
            r1 = r5
            int r1 = r1.zzi
            r2 = r5
            boolean r2 = r2.zzj
            com.google.android.gms.ads.nativead.NativeAdOptions$Builder r0 = r0.enableCustomClickGestureDirection(r1, r2)
            r0 = r5
            int r0 = r0.zzk
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L5c
        L57:
            r0 = 1
            r6 = r0
            goto L6b
        L5c:
            r0 = r7
            r1 = 2
            if (r0 != r1) goto L66
            r0 = 3
            r6 = r0
            goto L6b
        L66:
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L57
        L6b:
            r0 = r9
            r1 = r6
            com.google.android.gms.ads.nativead.NativeAdOptions$Builder r0 = r0.zzi(r1)
        L72:
            r0 = r5
            com.google.android.gms.ads.internal.client.zzfk r0 = r0.zzf
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L89
            r0 = r9
            com.google.android.gms.ads.VideoOptions r1 = new com.google.android.gms.ads.VideoOptions
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            com.google.android.gms.ads.nativead.NativeAdOptions$Builder r0 = r0.setVideoOptions(r1)
        L89:
            r0 = r9
            r1 = r5
            int r1 = r1.zze
            com.google.android.gms.ads.nativead.NativeAdOptions$Builder r0 = r0.setAdChoicesPlacement(r1)
        L93:
            r0 = r9
            r1 = r5
            boolean r1 = r1.zzb
            com.google.android.gms.ads.nativead.NativeAdOptions$Builder r0 = r0.setReturnUrlsForImageAssets(r1)
            r0 = r9
            r1 = r5
            boolean r1 = r1.zzd
            com.google.android.gms.ads.nativead.NativeAdOptions$Builder r0 = r0.setRequestMultipleImages(r1)
            r0 = r9
            com.google.android.gms.ads.nativead.NativeAdOptions r0 = r0.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjb.zza(com.google.android.gms.internal.ads.zzbjb):com.google.android.gms.ads.nativead.NativeAdOptions");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.writeInt(parcel, 11, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
