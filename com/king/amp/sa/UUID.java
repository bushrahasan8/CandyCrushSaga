package com.king.amp.sa;

import androidx.annotation.Keep;

@Keep
/* loaded from: UUID.class */
class UUID {
    UUID() {
    }

    public String getUUID() {
        return java.util.UUID.randomUUID().toString();
    }
}
