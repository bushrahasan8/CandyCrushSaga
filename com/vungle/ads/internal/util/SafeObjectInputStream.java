package com.vungle.ads.internal.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: SafeObjectInputStream.class */
public final class SafeObjectInputStream extends ObjectInputStream {
    private final List<Class<?>> allowed;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeObjectInputStream(InputStream inputStream, List<? extends Class<?>> list) {
        super(inputStream);
        this.allowed = list;
    }

    @Override // java.io.ObjectInputStream
    protected Class<?> resolveClass(ObjectStreamClass desc) throws ClassNotFoundException, IOException {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Class<?> c = super.resolveClass(desc);
        if (this.allowed == null || Number.class.isAssignableFrom(c) || Intrinsics.areEqual(String.class, c) || Intrinsics.areEqual(Boolean.class, c) || c.isArray() || this.allowed.contains(c)) {
            Intrinsics.checkNotNullExpressionValue(c, "c");
            return c;
        }
        throw new IOException("Deserialization is not allowed for " + desc.getName());
    }
}
