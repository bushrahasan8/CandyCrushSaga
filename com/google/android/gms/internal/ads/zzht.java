package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.t2;
import java.util.Map;

/* loaded from: zzht.class */
public interface zzht extends zzgw {
    public static final zzfxf zza = new zzfxf() { // from class: com.google.android.gms.internal.ads.zzhn
        @Override // com.google.android.gms.internal.ads.zzfxf
        public final boolean zza(Object obj) {
            String str = (String) obj;
            if (str == null) {
                return false;
            }
            String zza2 = zzfwk.zza(str);
            if (TextUtils.isEmpty(zza2)) {
                return false;
            }
            return ((zza2.contains(t2.h.K0) && !zza2.contains("text/vtt")) || zza2.contains("html") || zza2.contains("xml")) ? false : true;
        }
    };

    @Override // com.google.android.gms.internal.ads.zzgw
    Map zze();
}
