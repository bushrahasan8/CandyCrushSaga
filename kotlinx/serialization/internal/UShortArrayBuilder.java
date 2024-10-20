package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.UShortArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: UShortArrayBuilder.class */
public final class UShortArrayBuilder extends PrimitiveArrayBuilder {
    private short[] buffer;
    private int position;

    private UShortArrayBuilder(short[] sArr) {
        this.buffer = sArr;
        this.position = UShortArray.m7223getSizeimpl(sArr);
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public /* synthetic */ UShortArrayBuilder(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    /* renamed from: append-xj2QHRw$kotlinx_serialization_core, reason: not valid java name */
    public final void m7564appendxj2QHRw$kotlinx_serialization_core(short s) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        short[] sArr = this.buffer;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.position = position$kotlinx_serialization_core + 1;
        UShortArray.m7227set01HTLdE(sArr, position$kotlinx_serialization_core, s);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public /* bridge */ /* synthetic */ Object build$kotlinx_serialization_core() {
        return UShortArray.m7216boximpl(m7565buildamswpOA$kotlinx_serialization_core());
    }

    /* renamed from: build-amswpOA$kotlinx_serialization_core, reason: not valid java name */
    public short[] m7565buildamswpOA$kotlinx_serialization_core() {
        short[] copyOf = Arrays.copyOf(this.buffer, getPosition$kotlinx_serialization_core());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return UShortArray.m7218constructorimpl(copyOf);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int i) {
        if (UShortArray.m7223getSizeimpl(this.buffer) < i) {
            short[] sArr = this.buffer;
            short[] copyOf = Arrays.copyOf(sArr, RangesKt.coerceAtLeast(i, UShortArray.m7223getSizeimpl(sArr) * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.buffer = UShortArray.m7218constructorimpl(copyOf);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public int getPosition$kotlinx_serialization_core() {
        return this.position;
    }
}
