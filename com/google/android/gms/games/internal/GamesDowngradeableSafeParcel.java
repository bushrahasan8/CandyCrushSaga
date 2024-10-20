package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.util.GmsVersion;

/* loaded from: GamesDowngradeableSafeParcel.class */
public abstract class GamesDowngradeableSafeParcel extends DowngradeableSafeParcel {
    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean zzo(Integer num) {
        if (num == null) {
            return false;
        }
        return GmsVersion.isAtLeastFenacho(num.intValue());
    }

    @Override // com.google.android.gms.common.internal.DowngradeableSafeParcel
    public final boolean prepareForClientVersion(int i) {
        setShouldDowngrade(!zzo(Integer.valueOf(i)));
        return true;
    }
}
