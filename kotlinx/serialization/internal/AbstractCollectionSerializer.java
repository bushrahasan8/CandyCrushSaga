package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: AbstractCollectionSerializer.class */
public abstract class AbstractCollectionSerializer implements KSerializer {
    private AbstractCollectionSerializer() {
    }

    public /* synthetic */ AbstractCollectionSerializer(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void readElement$default(AbstractCollectionSerializer abstractCollectionSerializer, CompositeDecoder compositeDecoder, int i, Object obj, boolean z, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        abstractCollectionSerializer.readElement(compositeDecoder, i, obj, z);
    }

    private final int readSize(CompositeDecoder compositeDecoder, Object obj) {
        int decodeCollectionSize = compositeDecoder.decodeCollectionSize(getDescriptor());
        checkCapacity(obj, decodeCollectionSize);
        return decodeCollectionSize;
    }

    protected abstract Object builder();

    protected abstract int builderSize(Object obj);

    protected abstract void checkCapacity(Object obj, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Iterator collectionIterator(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int collectionSize(Object obj);

    @Override // kotlinx.serialization.DeserializationStrategy
    public Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return merge(decoder, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object merge(kotlinx.serialization.encoding.Decoder r9, java.lang.Object r10) {
        /*
            r8 = this;
            r0 = r9
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r10
            if (r0 == 0) goto L19
            r0 = r8
            r1 = r10
            java.lang.Object r0 = r0.toBuilder(r1)
            r13 = r0
            r0 = r13
            r10 = r0
            r0 = r13
            if (r0 != 0) goto L1e
        L19:
            r0 = r8
            java.lang.Object r0 = r0.builder()
            r10 = r0
        L1e:
            r0 = r8
            r1 = r10
            int r0 = r0.builderSize(r1)
            r12 = r0
            r0 = r9
            r1 = r8
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r1.getDescriptor()
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.beginStructure(r1)
            r9 = r0
            r0 = r9
            boolean r0 = r0.decodeSequentially()
            if (r0 == 0) goto L4c
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r12
            r4 = r8
            r5 = r9
            r6 = r10
            int r4 = r4.readSize(r5, r6)
            r0.readAll(r1, r2, r3, r4)
            goto L6f
        L4c:
            r0 = r9
            r1 = r8
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r1.getDescriptor()
            int r0 = r0.decodeElementIndex(r1)
            r11 = r0
            r0 = r11
            r1 = -1
            if (r0 == r1) goto L6f
            r0 = r8
            r1 = r9
            r2 = r12
            r3 = r11
            int r2 = r2 + r3
            r3 = r10
            r4 = 0
            r5 = 8
            r6 = 0
            readElement$default(r0, r1, r2, r3, r4, r5, r6)
            goto L4c
        L6f:
            r0 = r9
            r1 = r8
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r1.getDescriptor()
            r0.endStructure(r1)
            r0 = r8
            r1 = r10
            java.lang.Object r0 = r0.toResult(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.AbstractCollectionSerializer.merge(kotlinx.serialization.encoding.Decoder, java.lang.Object):java.lang.Object");
    }

    protected abstract void readAll(CompositeDecoder compositeDecoder, Object obj, int i, int i2);

    protected abstract void readElement(CompositeDecoder compositeDecoder, int i, Object obj, boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object toBuilder(Object obj);

    protected abstract Object toResult(Object obj);
}
