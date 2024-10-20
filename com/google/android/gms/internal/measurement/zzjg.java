package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjt;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: zzjg.class */
public class zzjg {
    static final zzjg zza = new zzjg(true);
    private static volatile boolean zzb = false;
    private static boolean zzc = true;
    private static volatile zzjg zzd;
    private final Map<zza, zzjt.zzd<?, ?>> zze;

    /* loaded from: zzjg$zza.class */
    private static final class zza {
        private final Object zza;
        private final int zzb;

        zza(Object obj, int i) {
            this.zza = obj;
            this.zzb = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zzaVar = (zza) obj;
            return this.zza == zzaVar.zza && this.zzb == zzaVar.zzb;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.zza) * 65535) + this.zzb;
        }
    }

    zzjg() {
        this.zze = new HashMap();
    }

    private zzjg(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzjg zza() {
        zzjg zzjgVar = zzd;
        if (zzjgVar != null) {
            return zzjgVar;
        }
        synchronized (zzjg.class) {
            try {
                zzjg zzjgVar2 = zzd;
                if (zzjgVar2 != null) {
                    return zzjgVar2;
                }
                zzjg zza2 = zzjs.zza(zzjg.class);
                zzd = zza2;
                return zza2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <ContainingType extends zzlg> zzjt.zzd<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzjt.zzd) this.zze.get(new zza(containingtype, i));
    }
}
