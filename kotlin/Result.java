package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: Result.class */
public final class Result implements Serializable {
    public static final Companion Companion = new Companion(null);
    private final Object value;

    /* loaded from: Result$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: Result$Failure.class */
    public static final class Failure implements Serializable {
        public final Throwable exception;

        public Failure(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Failure) && Intrinsics.areEqual(this.exception, ((Failure) obj).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Failure(" + this.exception + ')';
        }
    }

    private /* synthetic */ Result(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Result m7128boximpl(Object obj) {
        return new Result(obj);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m7129constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7130equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof Result) && Intrinsics.areEqual(obj, ((Result) obj2).m7137unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7131equalsimpl0(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m7132exceptionOrNullimpl(Object obj) {
        return obj instanceof Failure ? ((Failure) obj).exception : null;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7133hashCodeimpl(Object obj) {
        return obj == null ? 0 : obj.hashCode();
    }

    /* renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m7134isFailureimpl(Object obj) {
        return obj instanceof Failure;
    }

    /* renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m7135isSuccessimpl(Object obj) {
        return !(obj instanceof Failure);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7136toStringimpl(Object obj) {
        String str;
        if (obj instanceof Failure) {
            str = ((Failure) obj).toString();
        } else {
            str = "Success(" + obj + ')';
        }
        return str;
    }

    public boolean equals(Object obj) {
        return m7130equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7133hashCodeimpl(this.value);
    }

    public String toString() {
        return m7136toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m7137unboximpl() {
        return this.value;
    }
}
