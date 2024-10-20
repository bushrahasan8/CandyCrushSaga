package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbbz;
import com.ironsource.mediationsdk.l;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: zzae.class */
public final class zzae {
    private final String zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzae(zzac zzacVar, zzad zzadVar) {
        String str;
        str = zzacVar.zza;
        this.zza = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public final zzbbz zza() {
        boolean z;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    z = 3;
                    break;
                }
                z = -1;
                break;
            case 1951953708:
                if (str.equals(l.a)) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        return z ? !z ? z != 2 ? z != 3 ? zzbbz.AD_INITIATER_UNSPECIFIED : zzbbz.REWARD_BASED_VIDEO_AD : zzbbz.AD_LOADER : zzbbz.INTERSTITIAL : zzbbz.BANNER;
    }

    public final String zzb() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    public final Set zzc() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
