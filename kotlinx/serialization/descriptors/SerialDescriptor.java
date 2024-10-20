package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: SerialDescriptor.class */
public interface SerialDescriptor {

    /* loaded from: SerialDescriptor$DefaultImpls.class */
    public static final abstract class DefaultImpls {
        public static List getAnnotations(SerialDescriptor serialDescriptor) {
            return CollectionsKt.emptyList();
        }

        public static boolean isInline(SerialDescriptor serialDescriptor) {
            return false;
        }

        public static boolean isNullable(SerialDescriptor serialDescriptor) {
            return false;
        }
    }

    List getAnnotations();

    List getElementAnnotations(int i);

    SerialDescriptor getElementDescriptor(int i);

    int getElementIndex(String str);

    String getElementName(int i);

    int getElementsCount();

    SerialKind getKind();

    String getSerialName();

    boolean isElementOptional(int i);

    boolean isInline();

    boolean isNullable();
}
