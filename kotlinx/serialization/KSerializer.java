package kotlinx.serialization;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: KSerializer.class */
public interface KSerializer extends SerializationStrategy, DeserializationStrategy {
    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    SerialDescriptor getDescriptor();
}
