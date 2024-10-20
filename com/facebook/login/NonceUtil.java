package com.facebook.login;

import kotlin.text.StringsKt;

/* loaded from: NonceUtil.class */
public final class NonceUtil {
    public static final NonceUtil INSTANCE = new NonceUtil();

    private NonceUtil() {
    }

    public static final boolean isValidNonce(String str) {
        boolean z = false;
        if (str == null || str.length() == 0) {
            return false;
        }
        if (StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null) >= 0) {
            z = true;
        }
        return !z;
    }
}
