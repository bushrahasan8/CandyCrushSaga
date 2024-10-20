package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: UInt.class */
public final class UInt implements Comparable {
    public static final Companion Companion = new Companion(null);
    private final int data;

    /* loaded from: UInt$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ UInt(int i) {
        this.data = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UInt m7163boximpl(int i) {
        return new UInt(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7164constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7165equalsimpl(int i, Object obj) {
        return (obj instanceof UInt) && i == ((UInt) obj).m7168unboximpl();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7166hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7167toStringimpl(int i) {
        return String.valueOf(i & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return UnsignedKt.uintCompare(m7168unboximpl(), ((UInt) obj).m7168unboximpl());
    }

    public boolean equals(Object obj) {
        return m7165equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m7166hashCodeimpl(this.data);
    }

    public String toString() {
        return m7167toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7168unboximpl() {
        return this.data;
    }
}
