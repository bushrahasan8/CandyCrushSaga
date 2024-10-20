package com.king.core;

import androidx.annotation.Keep;
import java.util.UUID;

@Keep
/* loaded from: UuidGenerator.class */
public class UuidGenerator {
    public static String getUuid() {
        return UUID.randomUUID().toString();
    }
}
