package com.facebook.internal;

import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: SmartLoginOption.class */
public enum SmartLoginOption {
    None(0),
    Enabled(1),
    RequireConfirm(2);

    private static final EnumSet ALL;
    public static final Companion Companion = new Companion(null);
    private final long value;

    /* loaded from: SmartLoginOption$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumSet parseOptions(long j) {
            EnumSet result = EnumSet.noneOf(SmartLoginOption.class);
            Iterator it = SmartLoginOption.ALL.iterator();
            while (it.hasNext()) {
                SmartLoginOption smartLoginOption = (SmartLoginOption) it.next();
                if ((smartLoginOption.getValue() & j) != 0) {
                    result.add(smartLoginOption);
                }
            }
            Intrinsics.checkNotNullExpressionValue(result, "result");
            return result;
        }
    }

    static {
        EnumSet allOf = EnumSet.allOf(SmartLoginOption.class);
        Intrinsics.checkNotNullExpressionValue(allOf, "allOf(SmartLoginOption::class.java)");
        ALL = allOf;
    }

    SmartLoginOption(long j) {
        this.value = j;
    }

    public final long getValue() {
        return this.value;
    }
}
