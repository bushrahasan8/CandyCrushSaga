package com.google.android.gms.internal.play_games_inputmapping;

import com.ironsource.t2;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;

/* loaded from: zzar.class */
public class zzar {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final long zze;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzar(String str, Class cls, boolean z) {
        this(str, cls, z, true);
    }

    private zzar(String str, Class cls, boolean z, boolean z2) {
        zzds.zzc(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z;
        this.zzd = z2;
        int identityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i = 0; i < 5; i++) {
            j |= 1 << (identityHashCode & 63);
            identityHashCode >>>= 6;
        }
        this.zze = j;
    }

    public static zzar zzc(String str, Class cls) {
        return new zzar(str, cls, false, false);
    }

    public final String toString() {
        String name = getClass().getName();
        String str = this.zza;
        String name2 = this.zzb.getName();
        int length = name.length();
        StringBuilder sb = new StringBuilder(length + 3 + str.length() + name2.length());
        sb.append(name);
        sb.append(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH);
        sb.append(str);
        sb.append(t2.i.d);
        sb.append(name2);
        sb.append(t2.i.e);
        return sb.toString();
    }

    protected void zza(Iterator it, zzaq zzaqVar) {
        while (it.hasNext()) {
            zzb(it.next(), zzaqVar);
        }
    }

    protected void zzb(Object obj, zzaq zzaqVar) {
        zzaqVar.zza(this.zza, obj);
    }

    public final String zzd() {
        return this.zza;
    }

    public final Object zze(Object obj) {
        return this.zzb.cast(obj);
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final void zzg(Object obj, zzaq zzaqVar) {
        if (!this.zzd || zzcb.zza() <= 20) {
            zzb(obj, zzaqVar);
        } else {
            zzaqVar.zza(this.zza, obj);
        }
    }

    public final void zzh(Iterator it, zzaq zzaqVar) {
        if (!this.zzc) {
            throw new IllegalStateException("non repeating key");
        }
        if (!this.zzd || zzcb.zza() <= 20) {
            zza(it, zzaqVar);
        } else {
            while (it.hasNext()) {
                zzaqVar.zza(this.zza, it.next());
            }
        }
    }

    public final long zzi() {
        return this.zze;
    }
}
