package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: zzhhh.class */
public final class zzhhh extends zzhgz {
    private static final zzhhm zza = zzhhe.zza(Collections.emptyMap());

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhhh(Map map, zzhhf zzhhfVar) {
        super(map);
    }

    public static zzhhg zzc(int i) {
        return new zzhhg(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap zzb = zzhha.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzhhm) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}
