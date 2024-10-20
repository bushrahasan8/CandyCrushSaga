package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: zzagz.class */
public final class zzagz extends zzagr {
    public static final Parcelable.Creator<zzagz> CREATOR = new zzagy();
    public final String zza;

    @Deprecated
    public final String zzb;
    public final zzgaa zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzagz(String str, String str2, List list) {
        super(str);
        zzek.zzd(!list.isEmpty());
        this.zza = str2;
        zzgaa zzj = zzgaa.zzj(list);
        this.zzc = zzj;
        this.zzb = (String) zzj.get(0);
    }

    private static List zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException e) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzagz.class != obj.getClass()) {
            return false;
        }
        zzagz zzagzVar = (zzagz) obj;
        return zzfy.zzF(this.zzf, zzagzVar.zzf) && zzfy.zzF(this.zza, zzagzVar.zza) && this.zzc.equals(zzagzVar.zzc);
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode();
        String str = this.zza;
        return ((((hashCode + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzagr
    public final String toString() {
        return this.zzf + ": description=" + this.zza + ": values=" + String.valueOf(this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeStringArray((String[]) this.zzc.toArray(new String[0]));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzagr, com.google.android.gms.internal.ads.zzbx
    public final void zza(zzbt zzbtVar) {
        boolean z;
        String str = this.zzf;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    z = 6;
                    break;
                }
                z = -1;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    z = 16;
                    break;
                }
                z = -1;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    z = 12;
                    break;
                }
                z = -1;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    z = 4;
                    break;
                }
                z = -1;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    z = 18;
                    break;
                }
                z = -1;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    z = 8;
                    break;
                }
                z = -1;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    z = 20;
                    break;
                }
                z = -1;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    z = 10;
                    break;
                }
                z = -1;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    z = 7;
                    break;
                }
                z = -1;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    z = 17;
                    break;
                }
                z = -1;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    z = 13;
                    break;
                }
                z = -1;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    z = 14;
                    break;
                }
                z = -1;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    z = 15;
                    break;
                }
                z = -1;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    z = 21;
                    break;
                }
                z = -1;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    z = 3;
                    break;
                }
                z = -1;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    z = 5;
                    break;
                }
                z = -1;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    z = 19;
                    break;
                }
                z = -1;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    z = 9;
                    break;
                }
                z = -1;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    z = 11;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        switch (z) {
            case false:
            case true:
                zzbtVar.zzq((CharSequence) this.zzc.get(0));
                return;
            case true:
            case true:
                zzbtVar.zze((CharSequence) this.zzc.get(0));
                return;
            case true:
            case true:
                zzbtVar.zzc((CharSequence) this.zzc.get(0));
                return;
            case true:
            case true:
                zzbtVar.zzd((CharSequence) this.zzc.get(0));
                return;
            case true:
            case true:
                String str2 = (String) this.zzc.get(0);
                int i = zzfy.zza;
                String[] split = str2.split(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, -1);
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    zzbtVar.zzs(Integer.valueOf(parseInt));
                    zzbtVar.zzr(valueOf);
                    return;
                } catch (NumberFormatException e) {
                    return;
                }
            case true:
            case true:
                try {
                    zzbtVar.zzl(Integer.valueOf(Integer.parseInt((String) this.zzc.get(0))));
                    return;
                } catch (NumberFormatException e2) {
                    return;
                }
            case true:
            case true:
                try {
                    String str3 = (String) this.zzc.get(0);
                    int parseInt2 = Integer.parseInt(str3.substring(2, 4));
                    int parseInt3 = Integer.parseInt(str3.substring(0, 2));
                    zzbtVar.zzk(Integer.valueOf(parseInt2));
                    zzbtVar.zzj(Integer.valueOf(parseInt3));
                    return;
                } catch (NumberFormatException | StringIndexOutOfBoundsException e3) {
                    return;
                }
            case true:
                List zzb = zzb((String) this.zzc.get(0));
                int size = zzb.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size != 3) {
                            return;
                        } else {
                            zzbtVar.zzj((Integer) zzb.get(2));
                        }
                    }
                    zzbtVar.zzk((Integer) zzb.get(1));
                }
                zzbtVar.zzl((Integer) zzb.get(0));
                return;
            case true:
                List zzb2 = zzb((String) this.zzc.get(0));
                int size2 = zzb2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 != 3) {
                            return;
                        } else {
                            zzbtVar.zzm((Integer) zzb2.get(2));
                        }
                    }
                    zzbtVar.zzn((Integer) zzb2.get(1));
                }
                zzbtVar.zzo((Integer) zzb2.get(0));
                return;
            case true:
            case true:
                zzbtVar.zzf((CharSequence) this.zzc.get(0));
                return;
            case true:
            case true:
                zzbtVar.zzg((CharSequence) this.zzc.get(0));
                return;
            case true:
            case true:
                zzbtVar.zzt((CharSequence) this.zzc.get(0));
                return;
            default:
                return;
        }
    }
}
