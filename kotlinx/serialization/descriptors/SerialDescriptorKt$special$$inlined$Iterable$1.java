package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: SerialDescriptorKt$special$$inlined$Iterable$1.class */
public final class SerialDescriptorKt$special$$inlined$Iterable$1 implements Iterable, KMappedMarker {
    final SerialDescriptor $this_elementDescriptors$inlined;

    public SerialDescriptorKt$special$$inlined$Iterable$1(SerialDescriptor serialDescriptor) {
        this.$this_elementDescriptors$inlined = serialDescriptor;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new SerialDescriptorKt$elementDescriptors$1$1(this.$this_elementDescriptors$inlined);
    }
}
