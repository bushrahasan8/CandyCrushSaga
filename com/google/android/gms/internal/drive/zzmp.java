package com.google.android.gms.internal.drive;

import com.ironsource.t2;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzmp.class */
public final class zzmp implements Comparable, Map.Entry {
    private Object value;
    private final zzmi zzvk;
    private final Comparable zzvn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmp(zzmi zzmiVar, Comparable comparable, Object obj) {
        this.zzvk = zzmiVar;
        this.zzvn = comparable;
        this.value = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmp(zzmi zzmiVar, Map.Entry entry) {
        this(zzmiVar, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean equals(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zzmp) obj).getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return equals(this.zzvn, entry.getKey()) && equals(this.value, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zzvn;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.zzvn;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.value;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.zzvk.zzeu();
        Object obj2 = this.value;
        this.value = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzvn);
        String valueOf2 = String.valueOf(this.value);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append(t2.i.b);
        sb.append(valueOf2);
        return sb.toString();
    }
}
