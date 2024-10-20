package kotlinx.serialization.internal;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt;
import kotlinx.serialization.descriptors.SerialKind;

/* loaded from: PluginGeneratedSerialDescriptorKt.class */
public abstract class PluginGeneratedSerialDescriptorKt {
    public static final int hashCodeImpl(SerialDescriptor serialDescriptor, SerialDescriptor[] typeParams) {
        int i;
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int hashCode = serialDescriptor.getSerialName().hashCode();
        int hashCode2 = Arrays.hashCode(typeParams);
        Iterable elementDescriptors = SerialDescriptorKt.getElementDescriptors(serialDescriptor);
        Iterator it = elementDescriptors.iterator();
        int i2 = 1;
        while (true) {
            i = i2;
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            String serialName = ((SerialDescriptor) it.next()).getSerialName();
            if (serialName != null) {
                i3 = serialName.hashCode();
            }
            i2 = (i * 31) + i3;
        }
        Iterator it2 = elementDescriptors.iterator();
        int i4 = 1;
        while (true) {
            int i5 = i4;
            if (!it2.hasNext()) {
                return (((((hashCode * 31) + hashCode2) * 31) + i) * 31) + i5;
            }
            SerialKind kind = ((SerialDescriptor) it2.next()).getKind();
            i4 = (i5 * 31) + (kind != null ? kind.hashCode() : 0);
        }
    }
}
