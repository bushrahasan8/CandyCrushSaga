package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: UByte.class */
public final class UByte implements Comparable {
    public static final Companion Companion = new Companion(null);
    private final byte data;

    /* loaded from: UByte$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ UByte(byte b) {
        this.data = b;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UByte m7140boximpl(byte b) {
        return new UByte(b);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte m7141constructorimpl(byte b) {
        return b;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7142equalsimpl(byte b, Object obj) {
        return (obj instanceof UByte) && b == ((UByte) obj).m7145unboximpl();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7143hashCodeimpl(byte b) {
        return b;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7144toStringimpl(byte b) {
        return String.valueOf(b & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare(m7145unboximpl() & 255, ((UByte) obj).m7145unboximpl() & 255);
    }

    public boolean equals(Object obj) {
        return m7142equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m7143hashCodeimpl(this.data);
    }

    public String toString() {
        return m7144toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte m7145unboximpl() {
        return this.data;
    }
}
