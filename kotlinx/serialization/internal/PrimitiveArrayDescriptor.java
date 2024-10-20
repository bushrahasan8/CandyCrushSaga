package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: PrimitiveArrayDescriptor.class */
public final class PrimitiveArrayDescriptor extends ListLikeDescriptor {
    private final String serialName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimitiveArrayDescriptor(SerialDescriptor primitive) {
        super(primitive, null);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.serialName = primitive.getSerialName() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getSerialName() {
        return this.serialName;
    }
}
