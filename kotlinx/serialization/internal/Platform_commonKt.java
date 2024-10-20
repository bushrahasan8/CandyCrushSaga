package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: Platform_commonKt.class */
public abstract class Platform_commonKt {
    private static final SerialDescriptor[] EMPTY_DESCRIPTOR_ARRAY = new SerialDescriptor[0];

    public static final Set cachedSerialNames(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor instanceof CachedNames) {
            return ((CachedNames) serialDescriptor).getSerialNames();
        }
        HashSet hashSet = new HashSet(serialDescriptor.getElementsCount());
        int elementsCount = serialDescriptor.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            hashSet.add(serialDescriptor.getElementName(i));
        }
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlinx.serialization.descriptors.SerialDescriptor[] compactArray(java.util.List r3) {
        /*
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L12
            r0 = r4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L14
        L12:
            r0 = 0
            r3 = r0
        L14:
            r0 = r3
            if (r0 == 0) goto L37
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 0
            kotlinx.serialization.descriptors.SerialDescriptor[] r1 = new kotlinx.serialization.descriptors.SerialDescriptor[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            r3 = r0
            r0 = r3
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            r0 = r3
            kotlinx.serialization.descriptors.SerialDescriptor[] r0 = (kotlinx.serialization.descriptors.SerialDescriptor[]) r0
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L3b
        L37:
            kotlinx.serialization.descriptors.SerialDescriptor[] r0 = kotlinx.serialization.internal.Platform_commonKt.EMPTY_DESCRIPTOR_ARRAY
            r3 = r0
        L3b:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.Platform_commonKt.compactArray(java.util.List):kotlinx.serialization.descriptors.SerialDescriptor[]");
    }

    public static final KClass kclass(KType kType) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KClass) {
            return (KClass) classifier;
        }
        throw new IllegalStateException(("Only KClass supported as classifier, got " + classifier).toString());
    }

    public static final Void serializerNotRegistered(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        throw new SerializationException("Serializer for class '" + kClass.getSimpleName() + "' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
    }
}
