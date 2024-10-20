package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.ironsource.t2;
import com.unity3d.services.core.device.MimeTypes;

/* loaded from: zzsv.class */
public final class zzsv {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    zzsv(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = zzcb.zzh(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if ("Nexus 10".equals(r0) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r13) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r16.isFeatureSupported("secure-playback") != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzsv zzc(java.lang.String r13, java.lang.String r14, java.lang.String r15, android.media.MediaCodecInfo.CodecCapabilities r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21) {
        /*
            r0 = r16
            if (r0 == 0) goto L4e
            int r0 = com.google.android.gms.internal.ads.zzfy.zza
            r22 = r0
            r0 = r16
            java.lang.String r1 = "adaptive-playback"
            boolean r0 = r0.isFeatureSupported(r1)
            if (r0 == 0) goto L4e
            int r0 = com.google.android.gms.internal.ads.zzfy.zza
            r1 = 22
            if (r0 > r1) goto L36
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfy.zzd
            r24 = r0
            java.lang.String r0 = "ODROID-XU3"
            r1 = r24
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "Nexus 10"
            r1 = r24
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            goto L3c
        L36:
            r0 = 1
            r20 = r0
            goto L51
        L3c:
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder"
            r1 = r13
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder.secure"
            r1 = r13
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
        L4e:
            r0 = 0
            r20 = r0
        L51:
            r0 = r16
            if (r0 == 0) goto L69
            int r0 = com.google.android.gms.internal.ads.zzfy.zza
            r22 = r0
            r0 = r16
            java.lang.String r1 = "tunneled-playback"
            boolean r0 = r0.isFeatureSupported(r1)
            if (r0 == 0) goto L69
            r0 = 1
            r23 = r0
            goto L6c
        L69:
            r0 = 0
            r23 = r0
        L6c:
            r0 = r21
            if (r0 != 0) goto L83
            r0 = r16
            if (r0 == 0) goto L89
            int r0 = com.google.android.gms.internal.ads.zzfy.zza
            r22 = r0
            r0 = r16
            java.lang.String r1 = "secure-playback"
            boolean r0 = r0.isFeatureSupported(r1)
            if (r0 == 0) goto L89
        L83:
            r0 = 1
            r21 = r0
            goto L8c
        L89:
            r0 = 0
            r21 = r0
        L8c:
            com.google.android.gms.internal.ads.zzsv r0 = new com.google.android.gms.internal.ads.zzsv
            r1 = r0
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r23
            r11 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsv.zzc(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzsv");
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = zzfy.zza;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        zzff.zzb("MediaCodecInfo", "NoSupport [" + str + "] [" + this.zza + ", " + this.zzb + "] [" + zzfy.zze + t2.i.e);
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point zzi = zzi(videoCapabilities, i, i2);
        int i3 = zzi.x;
        int i4 = zzi.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    private final boolean zzl(zzam zzamVar, boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair zza = zztn.zza(zzamVar);
        if (zza == null) {
            return true;
        }
        int intValue = ((Integer) zza.first).intValue();
        int intValue2 = ((Integer) zza.second).intValue();
        int i = intValue2;
        int i2 = intValue;
        if ("video/dolby-vision".equals(zzamVar.zzm)) {
            if (!MimeTypes.VIDEO_H264.equals(this.zzb)) {
                i = intValue2;
                i2 = intValue;
                i2 = MimeTypes.VIDEO_H265.equals(this.zzb) ? 2 : 8;
            }
            i = 0;
        }
        int i3 = i2;
        if (!this.zzh) {
            if (i2 != 42) {
                return true;
            }
            i3 = 42;
        }
        MediaCodecInfo.CodecProfileLevel[] zzh = zzh();
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = zzh;
        if (zzfy.zza <= 23) {
            codecProfileLevelArr = zzh;
            if ("video/x-vnd.on2.vp9".equals(this.zzb)) {
                codecProfileLevelArr = zzh;
                if (zzh.length == 0) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                    int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                    int i4 = intValue3 >= 180000000 ? 1024 : intValue3 >= 120000000 ? 512 : intValue3 >= 60000000 ? 256 : intValue3 >= 30000000 ? 128 : intValue3 >= 18000000 ? 64 : intValue3 >= 12000000 ? 32 : intValue3 >= 7200000 ? 16 : intValue3 >= 3600000 ? 8 : intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i4;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
            }
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == i3 && (codecProfileLevel2.level >= i || !z)) {
                if (!MimeTypes.VIDEO_H265.equals(this.zzb) || i3 != 2) {
                    return true;
                }
                String str = zzfy.zzb;
                if (!"sailfish".equals(str) && !"marlin".equals(str)) {
                    return true;
                }
            }
        }
        zzj("codec.profileLevel, " + zzamVar.zzj + ", " + this.zzc);
        return false;
    }

    private final boolean zzm(zzam zzamVar) {
        return this.zzb.equals(zzamVar.zzm) || this.zzb.equals(zztn.zzc(zzamVar));
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzi(videoCapabilities, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r9.zzs != r10.zzs) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzis zzb(com.google.android.gms.internal.ads.zzam r9, com.google.android.gms.internal.ads.zzam r10) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsv.zzb(com.google.android.gms.internal.ads.zzam, com.google.android.gms.internal.ads.zzam):com.google.android.gms.internal.ads.zzis");
    }

    public final boolean zzd(zzam zzamVar) {
        return zzm(zzamVar) && zzl(zzamVar, false);
    }

    public final boolean zze(zzam zzamVar) throws zzth {
        int i;
        boolean z = false;
        if (!zzm(zzamVar) || !zzl(zzamVar, true)) {
            return false;
        }
        if (this.zzh) {
            int i2 = zzamVar.zzr;
            if (i2 <= 0 || (i = zzamVar.zzs) <= 0) {
                return true;
            }
            int i3 = zzfy.zza;
            return zzg(i2, i, zzamVar.zzt);
        }
        int i4 = zzfy.zza;
        int i5 = zzamVar.zzA;
        if (i5 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzj("sampleRate.caps");
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    zzj("sampleRate.aCaps");
                } else if (!audioCapabilities.isSampleRateSupported(i5)) {
                    zzj("sampleRate.support, " + i5);
                }
            }
            return z;
        }
        int i6 = zzamVar.zzz;
        if (i6 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                zzj("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                zzj("channelCount.aCaps");
                return false;
            }
            String str = this.zza;
            String str2 = this.zzb;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            int i7 = maxInputChannelCount;
            if (maxInputChannelCount <= 1) {
                if (zzfy.zza < 26 || maxInputChannelCount <= 0) {
                    i7 = maxInputChannelCount;
                    if (!"audio/mpeg".equals(str2)) {
                        i7 = maxInputChannelCount;
                        if (!"audio/3gpp".equals(str2)) {
                            i7 = maxInputChannelCount;
                            if (!"audio/amr-wb".equals(str2)) {
                                i7 = maxInputChannelCount;
                                if (!"audio/mp4a-latm".equals(str2)) {
                                    i7 = maxInputChannelCount;
                                    if (!"audio/vorbis".equals(str2)) {
                                        i7 = maxInputChannelCount;
                                        if (!"audio/opus".equals(str2)) {
                                            i7 = maxInputChannelCount;
                                            if (!"audio/raw".equals(str2)) {
                                                i7 = maxInputChannelCount;
                                                if (!"audio/flac".equals(str2)) {
                                                    i7 = maxInputChannelCount;
                                                    if (!"audio/g711-alaw".equals(str2)) {
                                                        i7 = maxInputChannelCount;
                                                        if (!"audio/g711-mlaw".equals(str2)) {
                                                            if ("audio/gsm".equals(str2)) {
                                                                i7 = maxInputChannelCount;
                                                            } else {
                                                                i7 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                                                                zzff.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i7 + t2.i.e);
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
                } else {
                    i7 = maxInputChannelCount;
                }
            }
            if (i7 < i6) {
                zzj("channelCount.support, " + i6);
                return false;
            }
        }
        z = true;
        return z;
    }

    public final boolean zzf(zzam zzamVar) {
        if (this.zzh) {
            return this.zze;
        }
        Pair zza = zztn.zza(zzamVar);
        return zza != null && ((Integer) zza.first).intValue() == 42;
    }

    public final boolean zzg(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzj("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzj("sizeAndRate.vCaps");
            return false;
        }
        if (zzfy.zza >= 29) {
            int zza = zzsu.zza(videoCapabilities, this.zzb, i, i2, d);
            if (zza == 2) {
                return true;
            }
            if (zza == 1) {
                zzj("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                return false;
            }
        }
        if (zzk(videoCapabilities, i, i2, d)) {
            return true;
        }
        if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(zzfy.zzb)) || !zzk(videoCapabilities, i2, i, d))) {
            zzj("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
            return false;
        }
        zzff.zzb("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d) + "] [" + this.zza + ", " + this.zzb + "] [" + zzfy.zze + t2.i.e);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.media.MediaCodecInfo.CodecProfileLevel[] zzh() {
        /*
            r2 = this;
            r0 = r2
            android.media.MediaCodecInfo$CodecCapabilities r0 = r0.zzd
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L14
            r0 = r3
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L19
        L14:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
            r3 = r0
        L19:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsv.zzh():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }
}
