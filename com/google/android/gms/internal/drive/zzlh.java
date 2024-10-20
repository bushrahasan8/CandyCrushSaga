package com.google.android.gms.internal.drive;

/* loaded from: zzlh.class */
final class zzlh implements zzlp {
    private zzlp[] zztt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlh(zzlp... zzlpVarArr) {
        this.zztt = zzlpVarArr;
    }

    @Override // com.google.android.gms.internal.drive.zzlp
    public final boolean zzb(Class<?> cls) {
        for (zzlp zzlpVar : this.zztt) {
            if (zzlpVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.drive.zzlp
    public final zzlo zzc(Class<?> cls) {
        for (zzlp zzlpVar : this.zztt) {
            if (zzlpVar.zzb(cls)) {
                return zzlpVar.zzc(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
