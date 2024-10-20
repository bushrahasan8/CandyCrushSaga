package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: UShort.class */
public final class UShort implements Comparable {
    public static final Companion Companion = new Companion(null);
    private final short data;

    /* loaded from: UShort$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ UShort(short s) {
        this.data = s;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UShort m7210boximpl(short s) {
        return new UShort(s);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m7211constructorimpl(short s) {
        return s;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7212equalsimpl(short s, Object obj) {
        return (obj instanceof UShort) && s == ((UShort) obj).m7215unboximpl();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7213hashCodeimpl(short s) {
        return s;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7214toStringimpl(short s) {
        return String.valueOf(s & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare(m7215unboximpl() & 65535, ((UShort) obj).m7215unboximpl() & 65535);
    }

    public boolean equals(Object obj) {
        return m7212equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m7213hashCodeimpl(this.data);
    }

    public String toString() {
        return m7214toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m7215unboximpl() {
        return this.data;
    }
}
