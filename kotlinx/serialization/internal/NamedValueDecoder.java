package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: NamedValueDecoder.class */
public abstract class NamedValueDecoder extends TaggedDecoder {
    protected abstract String composeName(String str, String str2);

    protected String elementName(SerialDescriptor desc, int i) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        return desc.getElementName(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final String getTag(SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return nested(elementName(serialDescriptor, i));
    }

    protected final String nested(String nestedName) {
        Intrinsics.checkNotNullParameter(nestedName, "nestedName");
        String str = (String) getCurrentTagOrNull();
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return composeName(str2, nestedName);
    }
}
