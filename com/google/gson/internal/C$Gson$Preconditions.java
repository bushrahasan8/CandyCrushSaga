package com.google.gson.internal;

/* renamed from: com.google.gson.internal.$Gson$Preconditions, reason: invalid class name */
/* loaded from: $Gson$Preconditions.class */
public abstract class C$Gson$Preconditions {
    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static Object checkNotNull(Object obj) {
        obj.getClass();
        return obj;
    }
}
