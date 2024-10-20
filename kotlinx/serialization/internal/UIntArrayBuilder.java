package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.UIntArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: UIntArrayBuilder.class */
public final class UIntArrayBuilder extends PrimitiveArrayBuilder {
    private int[] buffer;
    private int position;

    private UIntArrayBuilder(int[] iArr) {
        this.buffer = iArr;
        this.position = UIntArray.m7176getSizeimpl(iArr);
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public /* synthetic */ UIntArrayBuilder(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    /* renamed from: append-WZ4Q5Ns$kotlinx_serialization_core, reason: not valid java name */
    public final void m7544appendWZ4Q5Ns$kotlinx_serialization_core(int i) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        int[] iArr = this.buffer;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.position = position$kotlinx_serialization_core + 1;
        UIntArray.m7180setVXSXFK8(iArr, position$kotlinx_serialization_core, i);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public /* bridge */ /* synthetic */ Object build$kotlinx_serialization_core() {
        return UIntArray.m7169boximpl(m7545buildhP7Qyg$kotlinx_serialization_core());
    }

    /* renamed from: build--hP7Qyg$kotlinx_serialization_core, reason: not valid java name */
    public int[] m7545buildhP7Qyg$kotlinx_serialization_core() {
        int[] copyOf = Arrays.copyOf(this.buffer, getPosition$kotlinx_serialization_core());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return UIntArray.m7171constructorimpl(copyOf);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int i) {
        if (UIntArray.m7176getSizeimpl(this.buffer) < i) {
            int[] iArr = this.buffer;
            int[] copyOf = Arrays.copyOf(iArr, RangesKt.coerceAtLeast(i, UIntArray.m7176getSizeimpl(iArr) * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.buffer = UIntArray.m7171constructorimpl(copyOf);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public int getPosition$kotlinx_serialization_core() {
        return this.position;
    }
}
