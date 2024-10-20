package com.unity3d.services.core.device.reader.pii;

import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: NonBehavioralFlag.class */
public enum NonBehavioralFlag {
    UNKNOWN,
    TRUE,
    FALSE;

    public static final Companion Companion = new Companion(null);

    /* loaded from: NonBehavioralFlag$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NonBehavioralFlag fromString(String value) {
            Object m7129constructorimpl;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                Result.Companion companion = Result.Companion;
                String upperCase = value.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                m7129constructorimpl = Result.m7129constructorimpl(NonBehavioralFlag.valueOf(upperCase));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m7129constructorimpl = Result.m7129constructorimpl(ResultKt.createFailure(th));
            }
            NonBehavioralFlag nonBehavioralFlag = NonBehavioralFlag.UNKNOWN;
            Object obj = m7129constructorimpl;
            if (Result.m7134isFailureimpl(m7129constructorimpl)) {
                obj = nonBehavioralFlag;
            }
            return (NonBehavioralFlag) obj;
        }
    }
}
