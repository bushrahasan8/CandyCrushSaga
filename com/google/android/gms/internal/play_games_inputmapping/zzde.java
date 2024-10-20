package com.google.android.gms.internal.play_games_inputmapping;

/* loaded from: zzde.class */
enum zzde {
    BOOLEAN,
    STRING,
    LONG,
    DOUBLE;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzde zza(Object obj) {
        zzde zzdeVar;
        if (obj instanceof String) {
            zzdeVar = STRING;
        } else if (obj instanceof Boolean) {
            zzdeVar = BOOLEAN;
        } else if (obj instanceof Long) {
            zzdeVar = LONG;
        } else {
            if (!(obj instanceof Double)) {
                throw new AssertionError("invalid tag type: ".concat(String.valueOf(obj.getClass())));
            }
            zzdeVar = DOUBLE;
        }
        return zzdeVar;
    }
}
