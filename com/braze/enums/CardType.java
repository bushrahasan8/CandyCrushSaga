package com.braze.enums;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CardType.class */
public enum CardType {
    IMAGE,
    CAPTIONED_IMAGE,
    DEFAULT,
    SHORT_NEWS,
    TEXT_ANNOUNCEMENT,
    CONTROL;

    public static final Companion Companion = new Companion(null);

    /* loaded from: CardType$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CardType fromValue(int i) {
            return CardType.values()[i];
        }
    }

    public final int getValue() {
        return ordinal();
    }
}
