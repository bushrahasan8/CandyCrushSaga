package com.facebook.appevents.ml;

import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: MTensor.class */
public final class MTensor {
    public static final Companion Companion = new Companion(null);
    private int capacity;
    private float[] data;
    private int[] shape;

    /* loaded from: MTensor$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getCapacity(int[] iArr) {
            if (iArr.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i = iArr[0];
            IntIterator it = new IntRange(1, ArraysKt.getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                i *= iArr[it.nextInt()];
            }
            return i;
        }
    }

    public MTensor(int[] shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.shape = shape;
        int capacity = Companion.getCapacity(shape);
        this.capacity = capacity;
        this.data = new float[capacity];
    }

    public final float[] getData() {
        return this.data;
    }

    public final int getShape(int i) {
        return this.shape[i];
    }

    public final int getShapeSize() {
        return this.shape.length;
    }

    public final void reshape(int[] shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.shape = shape;
        int capacity = Companion.getCapacity(shape);
        float[] fArr = new float[capacity];
        System.arraycopy(this.data, 0, fArr, 0, Math.min(this.capacity, capacity));
        this.data = fArr;
        this.capacity = capacity;
    }
}
