package com.google.android.gms.internal.play_billing;

/* loaded from: zzgb.class */
final class zzgb implements zzcw {
    static final zzcw zza = new zzgb();

    private zzgb() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw
    public final boolean zza(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            default:
                switch (i) {
                    case 22:
                    case 23:
                    case 24:
                    case VIEW_NOT_VISIBLE_ON_PLAY_VALUE:
                    case MRAID_DOWNLOAD_JS_RETRY_SUCCESS_VALUE:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
