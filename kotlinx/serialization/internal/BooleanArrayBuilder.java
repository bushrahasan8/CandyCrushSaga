package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: BooleanArrayBuilder.class */
public final class BooleanArrayBuilder extends PrimitiveArrayBuilder {
    private boolean[] buffer;
    private int position;

    public BooleanArrayBuilder(boolean[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = bufferWithData.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append$kotlinx_serialization_core(boolean z) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        boolean[] zArr = this.buffer;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.position = position$kotlinx_serialization_core + 1;
        zArr[position$kotlinx_serialization_core] = z;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public boolean[] build$kotlinx_serialization_core() {
        boolean[] copyOf = Arrays.copyOf(this.buffer, getPosition$kotlinx_serialization_core());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int i) {
        boolean[] zArr = this.buffer;
        if (zArr.length < i) {
            boolean[] copyOf = Arrays.copyOf(zArr, RangesKt.coerceAtLeast(i, zArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.buffer = copyOf;
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public int getPosition$kotlinx_serialization_core() {
        return this.position;
    }
}
