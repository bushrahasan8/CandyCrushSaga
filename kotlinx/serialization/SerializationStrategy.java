package kotlinx.serialization;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: SerializationStrategy.class */
public interface SerializationStrategy {
    SerialDescriptor getDescriptor();

    void serialize(Encoder encoder, Object obj);
}
