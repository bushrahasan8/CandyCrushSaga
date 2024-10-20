package kotlinx.coroutines.channels;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ChannelResult.class */
public final class ChannelResult {
    public static final Companion Companion = new Companion(null);
    private static final Failed failed = new Failed();
    private final Object holder;

    /* loaded from: ChannelResult$Closed.class */
    public static final class Closed extends Failed {
        public final Throwable cause;

        public Closed(Throwable th) {
            this.cause = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Closed) && Intrinsics.areEqual(this.cause, ((Closed) obj).cause);
        }

        public int hashCode() {
            Throwable th = this.cause;
            return th != null ? th.hashCode() : 0;
        }

        @Override // kotlinx.coroutines.channels.ChannelResult.Failed
        public String toString() {
            return "Closed(" + this.cause + ')';
        }
    }

    /* loaded from: ChannelResult$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: closed-JP2dKIU, reason: not valid java name */
        public final Object m7409closedJP2dKIU(Throwable th) {
            return ChannelResult.m7400constructorimpl(new Closed(th));
        }

        /* renamed from: failure-PtdJZtk, reason: not valid java name */
        public final Object m7410failurePtdJZtk() {
            return ChannelResult.m7400constructorimpl(ChannelResult.failed);
        }

        /* renamed from: success-JP2dKIU, reason: not valid java name */
        public final Object m7411successJP2dKIU(Object obj) {
            return ChannelResult.m7400constructorimpl(obj);
        }
    }

    /* loaded from: ChannelResult$Failed.class */
    public static class Failed {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ ChannelResult(Object obj) {
        this.holder = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ChannelResult m7399boximpl(Object obj) {
        return new ChannelResult(obj);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m7400constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7401equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof ChannelResult) && Intrinsics.areEqual(obj, ((ChannelResult) obj2).m7408unboximpl());
    }

    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m7402exceptionOrNullimpl(Object obj) {
        Throwable th = null;
        Closed closed = obj instanceof Closed ? (Closed) obj : null;
        if (closed != null) {
            th = closed.cause;
        }
        return th;
    }

    /* renamed from: getOrNull-impl, reason: not valid java name */
    public static final Object m7403getOrNullimpl(Object obj) {
        if (obj instanceof Failed) {
            obj = null;
        }
        return obj;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7404hashCodeimpl(Object obj) {
        return obj == null ? 0 : obj.hashCode();
    }

    /* renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m7405isClosedimpl(Object obj) {
        return obj instanceof Closed;
    }

    /* renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m7406isSuccessimpl(Object obj) {
        return !(obj instanceof Failed);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7407toStringimpl(Object obj) {
        String str;
        if (obj instanceof Closed) {
            str = ((Closed) obj).toString();
        } else {
            str = "Value(" + obj + ')';
        }
        return str;
    }

    public boolean equals(Object obj) {
        return m7401equalsimpl(this.holder, obj);
    }

    public int hashCode() {
        return m7404hashCodeimpl(this.holder);
    }

    public String toString() {
        return m7407toStringimpl(this.holder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m7408unboximpl() {
        return this.holder;
    }
}
