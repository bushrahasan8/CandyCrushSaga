package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;

/* loaded from: InlineClassDescriptorKt.class */
public abstract class InlineClassDescriptorKt {
    public static final SerialDescriptor InlinePrimitiveDescriptor(String name, final KSerializer primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new InlineClassDescriptor(name, new GeneratedSerializer(primitiveSerializer) { // from class: kotlinx.serialization.internal.InlineClassDescriptorKt$InlinePrimitiveDescriptor$1
            final KSerializer $primitiveSerializer;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.$primitiveSerializer = primitiveSerializer;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public KSerializer[] childSerializers() {
                return new KSerializer[]{this.$primitiveSerializer};
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                throw new IllegalStateException("unsupported".toString());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public SerialDescriptor getDescriptor() {
                throw new IllegalStateException("unsupported".toString());
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public void serialize(Encoder encoder, Object obj) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                throw new IllegalStateException("unsupported".toString());
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public KSerializer[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        });
    }
}
