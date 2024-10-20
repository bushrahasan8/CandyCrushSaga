package com.google.android.gms.games;

import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: zzo.class */
public class zzo extends DataBufferRef {
    public zzo(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzp(String str, int i) {
        return (!hasColumn(str) || hasNull(str)) ? i : getInteger(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzq(String str, String str2) {
        if (!hasColumn(str) || hasNull(str)) {
            return null;
        }
        return getString(str);
    }
}
