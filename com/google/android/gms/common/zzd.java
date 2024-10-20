package com.google.android.gms.common;

import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* loaded from: zzd.class */
public final class zzd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i) {
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = new int[]{1, 2, 3}[i2];
            if (i3 == 0) {
                throw null;
            }
            if (i3 - 1 == i) {
                return i3;
            }
        }
        return 1;
    }
}
