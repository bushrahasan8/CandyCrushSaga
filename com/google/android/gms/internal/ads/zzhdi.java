package com.google.android.gms.internal.ads;

/* loaded from: zzhdi.class */
final class zzhdi implements zzgzy {
    static final zzgzy zza = new zzhdi();

    private zzhdi() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    public final boolean zza(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 1999) {
            return true;
        }
        switch (i) {
            case 1000:
            case 1001:
            case 1002:
            case 1003:
            case 1004:
            case 1005:
            case 1006:
            case 1007:
            case 1008:
            case 1009:
            case 1010:
                return true;
            default:
                return false;
        }
    }
}
