package com.king.candycrushsaga;

import androidx.annotation.Keep;
import java.util.UUID;

@Keep
/* loaded from: UuidGenerator.class */
public class UuidGenerator {
    public static String generateUuid() {
        return UUID.randomUUID().toString();
    }
}
