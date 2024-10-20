package com.unity3d.services.identifiers;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: SessionId.class */
public final class SessionId {
    public static final SessionId INSTANCE = new SessionId();
    public static final String a;

    static {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "UUID.randomUUID().toString()");
        a = uuid;
    }

    public final String getId() {
        return a;
    }
}
