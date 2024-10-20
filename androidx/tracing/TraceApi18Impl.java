package androidx.tracing;

/* loaded from: TraceApi18Impl.class */
abstract class TraceApi18Impl {
    public static void beginSection(String str) {
        android.os.Trace.beginSection(str);
    }

    public static void endSection() {
        android.os.Trace.endSection();
    }
}
