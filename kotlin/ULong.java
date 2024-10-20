package kotlin;

import androidx.privacysandbox.ads.adservices.topics.Topic$;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: ULong.class */
public final class ULong implements Comparable {
    public static final Companion Companion = new Companion(null);
    private final long data;

    /* loaded from: ULong$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ ULong(long j) {
        this.data = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ULong m7186boximpl(long j) {
        return new ULong(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7187constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7188equalsimpl(long j, Object obj) {
        return (obj instanceof ULong) && j == ((ULong) obj).m7191unboximpl();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7189hashCodeimpl(long j) {
        return Topic$.ExternalSyntheticBackport0.m(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7190toStringimpl(long j) {
        return UnsignedKt.ulongToString(j);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return UnsignedKt.ulongCompare(m7191unboximpl(), ((ULong) obj).m7191unboximpl());
    }

    public boolean equals(Object obj) {
        return m7188equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m7189hashCodeimpl(this.data);
    }

    public String toString() {
        return m7190toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7191unboximpl() {
        return this.data;
    }
}
