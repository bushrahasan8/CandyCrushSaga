package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.UByteArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: UByteArrayBuilder.class */
public final class UByteArrayBuilder extends PrimitiveArrayBuilder {
    private byte[] buffer;
    private int position;

    private UByteArrayBuilder(byte[] bArr) {
        this.buffer = bArr;
        this.position = UByteArray.m7153getSizeimpl(bArr);
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public /* synthetic */ UByteArrayBuilder(byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }

    /* renamed from: append-7apg3OU$kotlinx_serialization_core, reason: not valid java name */
    public final void m7534append7apg3OU$kotlinx_serialization_core(byte b) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        byte[] bArr = this.buffer;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.position = position$kotlinx_serialization_core + 1;
        UByteArray.m7157setVurrAj0(bArr, position$kotlinx_serialization_core, b);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public /* bridge */ /* synthetic */ Object build$kotlinx_serialization_core() {
        return UByteArray.m7146boximpl(m7535buildTcUX1vc$kotlinx_serialization_core());
    }

    /* renamed from: build-TcUX1vc$kotlinx_serialization_core, reason: not valid java name */
    public byte[] m7535buildTcUX1vc$kotlinx_serialization_core() {
        byte[] copyOf = Arrays.copyOf(this.buffer, getPosition$kotlinx_serialization_core());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return UByteArray.m7148constructorimpl(copyOf);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int i) {
        if (UByteArray.m7153getSizeimpl(this.buffer) < i) {
            byte[] bArr = this.buffer;
            byte[] copyOf = Arrays.copyOf(bArr, RangesKt.coerceAtLeast(i, UByteArray.m7153getSizeimpl(bArr) * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.buffer = UByteArray.m7148constructorimpl(copyOf);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public int getPosition$kotlinx_serialization_core() {
        return this.position;
    }
}
