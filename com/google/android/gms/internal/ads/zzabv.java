package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.nio.ByteBuffer;

/* loaded from: zzabv.class */
public final class zzabv {
    public static final int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        int i = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) <= 10) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return zzb[i] * 256;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b = bArr[4];
            return zzf((b & 192) >> 6, b & 63);
        }
        int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
        return i + i;
    }

    public static zzam zzc(zzfp zzfpVar, String str, String str2, zzae zzaeVar) {
        zzfo zzfoVar = new zzfo();
        zzfoVar.zzi(zzfpVar);
        int i = zzc[zzfoVar.zzd(2)];
        zzfoVar.zzm(8);
        int i2 = zze[zzfoVar.zzd(3)];
        int i3 = i2;
        if (zzfoVar.zzd(1) != 0) {
            i3 = i2 + 1;
        }
        int i4 = zzf[zzfoVar.zzd(5)] * 1000;
        zzfoVar.zze();
        zzfpVar.zzK(zzfoVar.zzb());
        zzak zzakVar = new zzak();
        zzakVar.zzK(str);
        zzakVar.zzW("audio/ac3");
        zzakVar.zzy(i3);
        zzakVar.zzX(i);
        zzakVar.zzE(zzaeVar);
        zzakVar.zzN(str2);
        zzakVar.zzx(i4);
        zzakVar.zzR(i4);
        return zzakVar.zzac();
    }

    public static zzam zzd(zzfp zzfpVar, String str, String str2, zzae zzaeVar) {
        String str3;
        zzfo zzfoVar = new zzfo();
        zzfoVar.zzi(zzfpVar);
        int zzd2 = zzfoVar.zzd(13);
        zzfoVar.zzm(3);
        int i = zzc[zzfoVar.zzd(2)];
        zzfoVar.zzm(10);
        int i2 = zze[zzfoVar.zzd(3)];
        int i3 = i2;
        if (zzfoVar.zzd(1) != 0) {
            i3 = i2 + 1;
        }
        zzfoVar.zzm(3);
        int zzd3 = zzfoVar.zzd(4);
        zzfoVar.zzm(1);
        int i4 = i3;
        if (zzd3 > 0) {
            zzfoVar.zzm(6);
            i4 = i3;
            if (zzfoVar.zzd(1) != 0) {
                i4 = i3 + 2;
            }
            zzfoVar.zzm(1);
        }
        if (zzfoVar.zza() > 7) {
            zzfoVar.zzm(7);
            if (zzfoVar.zzd(1) != 0) {
                str3 = "audio/eac3-joc";
                zzfoVar.zze();
                zzfpVar.zzK(zzfoVar.zzb());
                zzak zzakVar = new zzak();
                zzakVar.zzK(str);
                zzakVar.zzW(str3);
                zzakVar.zzy(i4);
                zzakVar.zzX(i);
                zzakVar.zzE(zzaeVar);
                zzakVar.zzN(str2);
                zzakVar.zzR(zzd2 * 1000);
                return zzakVar.zzac();
            }
        }
        str3 = "audio/eac3";
        zzfoVar.zze();
        zzfpVar.zzK(zzfoVar.zzb());
        zzak zzakVar2 = new zzak();
        zzakVar2.zzK(str);
        zzakVar2.zzW(str3);
        zzakVar2.zzy(i4);
        zzakVar2.zzX(i);
        zzakVar2.zzE(zzaeVar);
        zzakVar2.zzN(str2);
        zzakVar2.zzR(zzd2 * 1000);
        return zzakVar2.zzac();
    }

    public static zzabu zze(zzfo zzfoVar) {
        String str;
        int zzf2;
        int i;
        int i2;
        int i3;
        int i4;
        int zzd2;
        int i5;
        int i6;
        int i7;
        int i8;
        int zzc2 = zzfoVar.zzc();
        zzfoVar.zzm(40);
        int zzd3 = zzfoVar.zzd(5);
        zzfoVar.zzk(zzc2);
        int i9 = -1;
        if (zzd3 > 10) {
            zzfoVar.zzm(16);
            int zzd4 = zzfoVar.zzd(2);
            if (zzd4 == 0) {
                i9 = 0;
            } else if (zzd4 == 1) {
                i9 = 1;
            } else if (zzd4 == 2) {
                i9 = 2;
            }
            zzfoVar.zzm(3);
            int zzd5 = zzfoVar.zzd(11) + 1;
            int zzd6 = zzfoVar.zzd(2);
            if (zzd6 == 3) {
                i6 = zzd[zzfoVar.zzd(2)];
                i5 = 6;
                zzd2 = 3;
            } else {
                zzd2 = zzfoVar.zzd(2);
                i5 = zzb[zzd2];
                i6 = zzc[zzd6];
            }
            int i10 = zzd5 + zzd5;
            int i11 = (i10 * i6) / (i5 * 32);
            int zzd7 = zzfoVar.zzd(3);
            boolean zzo = zzfoVar.zzo();
            int i12 = zze[zzd7] + (zzo ? 1 : 0);
            zzfoVar.zzm(10);
            if (zzfoVar.zzo()) {
                zzfoVar.zzm(8);
            }
            if (zzd7 == 0) {
                zzfoVar.zzm(5);
                if (zzfoVar.zzo()) {
                    zzfoVar.zzm(8);
                }
                i7 = 0;
                zzd7 = 0;
            } else {
                i7 = zzd7;
            }
            if (i9 == 1) {
                if (zzfoVar.zzo()) {
                    zzfoVar.zzm(16);
                }
                i8 = 1;
            } else {
                i8 = i9;
            }
            int i13 = i8;
            int i14 = zzd2;
            if (zzfoVar.zzo()) {
                if (i7 > 2) {
                    zzfoVar.zzm(2);
                }
                if ((i7 & 1) != 0 && i7 > 2) {
                    zzfoVar.zzm(6);
                }
                if ((i7 & 4) != 0) {
                    zzfoVar.zzm(6);
                }
                if (zzo && zzfoVar.zzo()) {
                    zzfoVar.zzm(5);
                }
                i13 = i8;
                i14 = zzd2;
                if (i8 == 0) {
                    if (zzfoVar.zzo()) {
                        zzfoVar.zzm(6);
                    }
                    if (i7 == 0 && zzfoVar.zzo()) {
                        zzfoVar.zzm(6);
                    }
                    if (zzfoVar.zzo()) {
                        zzfoVar.zzm(6);
                    }
                    int zzd8 = zzfoVar.zzd(2);
                    if (zzd8 == 1) {
                        zzfoVar.zzm(5);
                    } else if (zzd8 == 2) {
                        zzfoVar.zzm(12);
                    } else if (zzd8 == 3) {
                        int zzd9 = zzfoVar.zzd(5);
                        if (zzfoVar.zzo()) {
                            zzfoVar.zzm(5);
                            if (zzfoVar.zzo()) {
                                zzfoVar.zzm(4);
                            }
                            if (zzfoVar.zzo()) {
                                zzfoVar.zzm(4);
                            }
                            if (zzfoVar.zzo()) {
                                zzfoVar.zzm(4);
                            }
                            if (zzfoVar.zzo()) {
                                zzfoVar.zzm(4);
                            }
                            if (zzfoVar.zzo()) {
                                zzfoVar.zzm(4);
                            }
                            if (zzfoVar.zzo()) {
                                zzfoVar.zzm(4);
                            }
                            if (zzfoVar.zzo()) {
                                zzfoVar.zzm(4);
                            }
                            if (zzfoVar.zzo()) {
                                if (zzfoVar.zzo()) {
                                    zzfoVar.zzm(4);
                                }
                                if (zzfoVar.zzo()) {
                                    zzfoVar.zzm(4);
                                }
                            }
                        }
                        if (zzfoVar.zzo()) {
                            zzfoVar.zzm(5);
                            if (zzfoVar.zzo()) {
                                zzfoVar.zzm(7);
                                if (zzfoVar.zzo()) {
                                    zzfoVar.zzm(8);
                                }
                            }
                        }
                        zzfoVar.zzm((zzd9 + 2) * 8);
                        zzfoVar.zze();
                    }
                    if (i7 < 2) {
                        if (zzfoVar.zzo()) {
                            zzfoVar.zzm(14);
                        }
                        if (zzd7 == 0 && zzfoVar.zzo()) {
                            zzfoVar.zzm(14);
                        }
                    }
                    if (zzfoVar.zzo()) {
                        if (zzd2 == 0) {
                            zzfoVar.zzm(5);
                            i13 = 0;
                            i14 = 0;
                        } else {
                            for (int i15 = 0; i15 < i5; i15++) {
                                if (zzfoVar.zzo()) {
                                    zzfoVar.zzm(5);
                                }
                            }
                        }
                    }
                    i13 = 0;
                    i14 = zzd2;
                }
            }
            if (zzfoVar.zzo()) {
                zzfoVar.zzm(5);
                int i16 = i7;
                if (i7 == 2) {
                    zzfoVar.zzm(4);
                    i16 = 2;
                }
                if (i16 >= 6) {
                    zzfoVar.zzm(2);
                }
                if (zzfoVar.zzo()) {
                    zzfoVar.zzm(8);
                }
                if (i16 == 0 && zzfoVar.zzo()) {
                    zzfoVar.zzm(8);
                }
                if (zzd6 < 3) {
                    zzfoVar.zzl();
                }
            }
            if (i13 == 0 && i14 != 3) {
                zzfoVar.zzl();
            }
            if (i13 == 2 && (i14 == 3 || zzfoVar.zzo())) {
                zzfoVar.zzm(6);
            }
            zzf2 = i10;
            i3 = i6;
            i4 = i5 * 256;
            i2 = i11;
            str = (zzfoVar.zzo() && zzfoVar.zzd(6) == 1 && zzfoVar.zzd(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i = i12;
        } else {
            zzfoVar.zzm(32);
            int zzd10 = zzfoVar.zzd(2);
            str = zzd10 == 3 ? null : "audio/ac3";
            int zzd11 = zzfoVar.zzd(6);
            int i17 = zzf[zzd11 / 2];
            zzf2 = zzf(zzd10, zzd11);
            zzfoVar.zzm(8);
            int zzd12 = zzfoVar.zzd(3);
            if ((zzd12 & 1) != 0 && zzd12 != 1) {
                zzfoVar.zzm(2);
            }
            if ((zzd12 & 4) != 0) {
                zzfoVar.zzm(2);
            }
            if (zzd12 == 2) {
                zzfoVar.zzm(2);
            }
            int i18 = zzd10 < 3 ? zzc[zzd10] : -1;
            i = zze[zzd12] + (zzfoVar.zzo() ? 1 : 0);
            i2 = i17 * 1000;
            i3 = i18;
            i9 = -1;
            i4 = 1536;
        }
        return new zzabu(str, i9, i, i3, zzf2, i4, i2, null);
    }

    private static int zzf(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = zzc[i];
        if (i4 == 44100) {
            int i5 = zzg[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = zzf[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
