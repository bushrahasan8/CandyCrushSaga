package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.zzkk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: zzjx.class */
public class zzjx {
    private static volatile boolean zzol = false;
    private static volatile zzjx zzon;
    private final Map<zza, zzkk.zzd<?, ?>> zzop;
    private static final Class<?> zzom = zzch();
    static final zzjx zzoo = new zzjx(true);

    /* loaded from: zzjx$zza.class */
    static final class zza {
        private final int number;
        private final Object object;

        zza(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zzaVar = (zza) obj;
            return this.object == zzaVar.object && this.number == zzaVar.number;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.object) * 65535) + this.number;
        }
    }

    zzjx() {
        this.zzop = new HashMap();
    }

    private zzjx(boolean z) {
        this.zzop = Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzjx zzcg() {
        return zzki.zza(zzjx.class);
    }

    private static Class<?> zzch() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public static zzjx zzci() {
        return zzjw.zzcf();
    }

    public static zzjx zzcj() {
        zzjx zzjxVar = zzon;
        zzjx zzjxVar2 = zzjxVar;
        if (zzjxVar == null) {
            synchronized (zzjx.class) {
                try {
                    zzjx zzjxVar3 = zzon;
                    zzjxVar2 = zzjxVar3;
                    if (zzjxVar3 == null) {
                        zzjxVar2 = zzjw.zzcg();
                        zzon = zzjxVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzjxVar2;
    }

    public final <ContainingType extends zzlq> zzkk.zzd<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzkk.zzd) this.zzop.get(new zza(containingtype, i));
    }
}
