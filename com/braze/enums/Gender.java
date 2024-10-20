package com.braze.enums;

import com.braze.models.IPutIntoJson;
import com.ironsource.m4;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: Gender.class */
public enum Gender implements IPutIntoJson<String> {
    MALE("m"),
    FEMALE("f"),
    OTHER("o"),
    UNKNOWN("u"),
    NOT_APPLICABLE(m4.p),
    PREFER_NOT_TO_SAY("p");

    public static final Companion Companion = new Companion(null);
    private final String value;

    /* loaded from: Gender$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    Gender(String str) {
        this.value = str;
    }

    @Override // com.braze.models.IPutIntoJson
    public String forJsonPut() {
        return this.value;
    }
}
