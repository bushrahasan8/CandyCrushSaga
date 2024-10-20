package com.google.android.gms.internal.drive;

/* loaded from: zzkx.class */
public class zzkx {
    private static final zzjx zzng = zzjx.zzci();
    private zzjc zzth;
    private volatile zzlq zzti;
    private volatile zzjc zztj;

    private final zzlq zzh(zzlq zzlqVar) {
        if (this.zzti == null) {
            synchronized (this) {
                if (this.zzti == null) {
                    try {
                        this.zzti = zzlqVar;
                        this.zztj = zzjc.zznq;
                    } catch (zzkq e) {
                        this.zzti = zzlqVar;
                        this.zztj = zzjc.zznq;
                    }
                }
            }
        }
        return this.zzti;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkx)) {
            return false;
        }
        zzkx zzkxVar = (zzkx) obj;
        zzlq zzlqVar = this.zzti;
        zzlq zzlqVar2 = zzkxVar.zzti;
        return (zzlqVar == null && zzlqVar2 == null) ? zzbl().equals(zzkxVar.zzbl()) : (zzlqVar == null || zzlqVar2 == null) ? zzlqVar != null ? zzlqVar.equals(zzkxVar.zzh(zzlqVar.zzda())) : zzh(zzlqVar2.zzda()).equals(zzlqVar2) : zzlqVar.equals(zzlqVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final zzjc zzbl() {
        if (this.zztj != null) {
            return this.zztj;
        }
        synchronized (this) {
            if (this.zztj != null) {
                return this.zztj;
            }
            if (this.zzti == null) {
                this.zztj = zzjc.zznq;
            } else {
                this.zztj = this.zzti.zzbl();
            }
            return this.zztj;
        }
    }

    public final int zzcx() {
        if (this.zztj != null) {
            return this.zztj.size();
        }
        if (this.zzti != null) {
            return this.zzti.zzcx();
        }
        return 0;
    }

    public final zzlq zzi(zzlq zzlqVar) {
        zzlq zzlqVar2 = this.zzti;
        this.zzth = null;
        this.zztj = null;
        this.zzti = zzlqVar;
        return zzlqVar2;
    }
}
