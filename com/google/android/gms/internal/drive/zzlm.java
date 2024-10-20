package com.google.android.gms.internal.drive;

import java.util.Iterator;
import java.util.Map;

/* loaded from: zzlm.class */
final class zzlm implements zzll {
    @Override // com.google.android.gms.internal.drive.zzll
    public final int zzb(int i, Object obj, Object obj2) {
        zzlk zzlkVar = (zzlk) obj;
        if (zzlkVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzlkVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final Object zzb(Object obj, Object obj2) {
        zzlk zzlkVar = (zzlk) obj;
        zzlk zzlkVar2 = (zzlk) obj2;
        zzlk zzlkVar3 = zzlkVar;
        if (!zzlkVar2.isEmpty()) {
            zzlkVar3 = zzlkVar;
            if (!zzlkVar.isMutable()) {
                zzlkVar3 = zzlkVar.zzdx();
            }
            zzlkVar3.zza(zzlkVar2);
        }
        return zzlkVar3;
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final Map<?, ?> zzh(Object obj) {
        return (zzlk) obj;
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final Map<?, ?> zzi(Object obj) {
        return (zzlk) obj;
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final boolean zzj(Object obj) {
        return !((zzlk) obj).isMutable();
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final Object zzk(Object obj) {
        ((zzlk) obj).zzbp();
        return obj;
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final Object zzl(Object obj) {
        return zzlk.zzdw().zzdx();
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final zzlj<?, ?> zzm(Object obj) {
        throw new NoSuchMethodError();
    }
}
