package kotlinx.serialization.json.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: CharArrayPool.class */
public final class CharArrayPool {
    private static final int MAX_CHARS_IN_POOL;
    private static int charsTotal;
    public static final CharArrayPool INSTANCE = new CharArrayPool();
    private static final ArrayDeque arrays = new ArrayDeque();

    static {
        Object m7129constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            m7129constructorimpl = Result.m7129constructorimpl(StringsKt.toIntOrNull(property));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m7129constructorimpl = Result.m7129constructorimpl(ResultKt.createFailure(th));
        }
        Object obj = m7129constructorimpl;
        if (Result.m7134isFailureimpl(m7129constructorimpl)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        MAX_CHARS_IN_POOL = num != null ? num.intValue() : 1048576;
    }

    private CharArrayPool() {
    }

    public final void release(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            int i = charsTotal;
            if (array.length + i < MAX_CHARS_IN_POOL) {
                charsTotal = i + array.length;
                arrays.addLast(array);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final char[] take() {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) arrays.removeLastOrNull();
            if (cArr != null) {
                charsTotal -= cArr.length;
            } else {
                cArr = null;
            }
        }
        char[] cArr2 = cArr;
        if (cArr == null) {
            cArr2 = new char[128];
        }
        return cArr2;
    }
}
