package kotlinx.serialization.internal;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: ElementMarker.class */
public final class ElementMarker {
    private static final Companion Companion = new Companion(null);
    private static final long[] EMPTY_HIGH_MARKS = new long[0];
    private final SerialDescriptor descriptor;
    private final long[] highMarksArray;
    private long lowerMarks;
    private final Function2 readIfAbsent;

    /* loaded from: ElementMarker$Companion.class */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ElementMarker(SerialDescriptor descriptor, Function2 readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.descriptor = descriptor;
        this.readIfAbsent = readIfAbsent;
        int elementsCount = descriptor.getElementsCount();
        long j = 0;
        if (elementsCount <= 64) {
            this.lowerMarks = elementsCount != 64 ? (-1) << elementsCount : j;
            this.highMarksArray = EMPTY_HIGH_MARKS;
        } else {
            this.lowerMarks = 0L;
            this.highMarksArray = prepareHighMarksArray(elementsCount);
        }
    }

    private final void markHigh(int i) {
        int i2 = (i >>> 6) - 1;
        long[] jArr = this.highMarksArray;
        jArr[i2] = jArr[i2] | (1 << (i & 63));
    }

    private final int nextUnmarkedHighIndex() {
        int length = this.highMarksArray.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return -1;
            }
            int i3 = i2 + 1;
            long j = this.highMarksArray[i2];
            while (j != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(j ^ (-1));
                long j2 = j | (1 << numberOfTrailingZeros);
                int i4 = numberOfTrailingZeros + (i3 * 64);
                j = j2;
                if (((Boolean) this.readIfAbsent.invoke(this.descriptor, Integer.valueOf(i4))).booleanValue()) {
                    this.highMarksArray[i2] = j2;
                    return i4;
                }
            }
            this.highMarksArray[i2] = j;
            i = i3;
        }
    }

    private final long[] prepareHighMarksArray(int i) {
        long[] jArr = new long[(i - 1) >>> 6];
        if ((i & 63) != 0) {
            jArr[ArraysKt.getLastIndex(jArr)] = (-1) << i;
        }
        return jArr;
    }

    public final void mark(int i) {
        if (i < 64) {
            this.lowerMarks |= 1 << i;
        } else {
            markHigh(i);
        }
    }

    public final int nextUnmarkedIndex() {
        int numberOfTrailingZeros;
        int elementsCount = this.descriptor.getElementsCount();
        do {
            long j = this.lowerMarks;
            if (j == -1) {
                if (elementsCount > 64) {
                    return nextUnmarkedHighIndex();
                }
                return -1;
            }
            numberOfTrailingZeros = Long.numberOfTrailingZeros(j ^ (-1));
            this.lowerMarks |= 1 << numberOfTrailingZeros;
        } while (!((Boolean) this.readIfAbsent.invoke(this.descriptor, Integer.valueOf(numberOfTrailingZeros))).booleanValue());
        return numberOfTrailingZeros;
    }
}
