package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.ULongArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: ULongArrayBuilder.class */
public final class ULongArrayBuilder extends PrimitiveArrayBuilder {
    private long[] buffer;
    private int position;

    private ULongArrayBuilder(long[] jArr) {
        this.buffer = jArr;
        this.position = ULongArray.m7199getSizeimpl(jArr);
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public /* synthetic */ ULongArrayBuilder(long[] jArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }

    /* renamed from: append-VKZWuLQ$kotlinx_serialization_core, reason: not valid java name */
    public final void m7554appendVKZWuLQ$kotlinx_serialization_core(long j) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        long[] jArr = this.buffer;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.position = position$kotlinx_serialization_core + 1;
        ULongArray.m7203setk8EXiF4(jArr, position$kotlinx_serialization_core, j);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public /* bridge */ /* synthetic */ Object build$kotlinx_serialization_core() {
        return ULongArray.m7192boximpl(m7555buildY2RjT0g$kotlinx_serialization_core());
    }

    /* renamed from: build-Y2RjT0g$kotlinx_serialization_core, reason: not valid java name */
    public long[] m7555buildY2RjT0g$kotlinx_serialization_core() {
        long[] copyOf = Arrays.copyOf(this.buffer, getPosition$kotlinx_serialization_core());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return ULongArray.m7194constructorimpl(copyOf);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int i) {
        if (ULongArray.m7199getSizeimpl(this.buffer) < i) {
            long[] jArr = this.buffer;
            long[] copyOf = Arrays.copyOf(jArr, RangesKt.coerceAtLeast(i, ULongArray.m7199getSizeimpl(jArr) * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.buffer = ULongArray.m7194constructorimpl(copyOf);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public int getPosition$kotlinx_serialization_core() {
        return this.position;
    }
}
