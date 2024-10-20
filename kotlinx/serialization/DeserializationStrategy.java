package kotlinx.serialization;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: DeserializationStrategy.class */
public interface DeserializationStrategy {
    Object deserialize(Decoder decoder);

    SerialDescriptor getDescriptor();
}
