package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.base.Supplier;

/* loaded from: zzgs.class */
final class zzgs extends zzhr {
    private final Context zza;
    private final Supplier zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgs(Context context, Supplier supplier) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.zza = context;
        this.zzb = supplier;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhr)) {
            return false;
        }
        zzhr zzhrVar = (zzhr) obj;
        if (!this.zza.equals(zzhrVar.zza())) {
            return false;
        }
        Supplier supplier = this.zzb;
        return supplier == null ? zzhrVar.zzb() == null : supplier.equals(zzhrVar.zzb());
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        Supplier supplier = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (supplier == null ? 0 : supplier.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.zza) + ", hermeticFileOverrides=" + String.valueOf(this.zzb) + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhr
    public final Context zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhr
    public final Supplier zzb() {
        return this.zzb;
    }
}
