package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: b9.class */
public final class b9 {
    public static final b9 a = new b9();

    private b9() {
    }

    public static final <T> T a(T t, T t2) {
        T t3 = t;
        if (t == null) {
            t3 = t2;
        }
        return t3;
    }

    public static final boolean a(Object obj) {
        return a(obj, null, false, 6, null);
    }

    public static final boolean a(Object obj, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return a(obj, errorMessage, false, 4, null);
    }

    public static final boolean a(Object obj, String errorMessage, boolean z) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        if (obj != null) {
            return true;
        }
        if (z) {
            throw new NullPointerException(errorMessage);
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        IronLog.API.error(errorMessage);
        return false;
    }

    public static /* synthetic */ boolean a(Object obj, String str, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = "reference is null";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return a(obj, str, z);
    }
}
