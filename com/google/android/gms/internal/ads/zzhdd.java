package com.google.android.gms.internal.ads;

/* loaded from: zzhdd.class */
final class zzhdd extends IllegalArgumentException {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhdd(int i, int i2) {
        super("Unpaired surrogate at index " + i + " of " + i2);
    }
}
