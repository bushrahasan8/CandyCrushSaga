package com.facebook.appevents.ml;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: Operator.class */
public final class Operator {
    public static final Operator INSTANCE = new Operator();

    private Operator() {
    }

    public static final void addmv(MTensor x, MTensor b) {
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(b, "b");
        int shape = x.getShape(0);
        int shape2 = x.getShape(1);
        int shape3 = x.getShape(2);
        float[] data = x.getData();
        float[] data2 = b.getData();
        for (int i = 0; i < shape; i++) {
            for (int i2 = 0; i2 < shape2; i2++) {
                for (int i3 = 0; i3 < shape3; i3++) {
                    int i4 = (i * shape2 * shape3) + (i2 * shape3) + i3;
                    data[i4] = data[i4] + data2[i3];
                }
            }
        }
    }

    public static final MTensor concatenate(MTensor[] tensors) {
        Intrinsics.checkNotNullParameter(tensors, "tensors");
        int shape = tensors[0].getShape(0);
        int i = 0;
        for (MTensor mTensor : tensors) {
            i += mTensor.getShape(1);
        }
        MTensor mTensor2 = new MTensor(new int[]{shape, i});
        float[] data = mTensor2.getData();
        for (int i2 = 0; i2 < shape; i2++) {
            int i3 = i2 * i;
            int length = tensors.length;
            for (int i4 = 0; i4 < length; i4++) {
                float[] data2 = tensors[i4].getData();
                int shape2 = tensors[i4].getShape(1);
                System.arraycopy(data2, i2 * shape2, data, i3, shape2);
                i3 += shape2;
            }
        }
        return mTensor2;
    }

    public static final MTensor conv1D(MTensor x, MTensor w) {
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(w, "w");
        int shape = x.getShape(0);
        int shape2 = x.getShape(1);
        int shape3 = x.getShape(2);
        int shape4 = w.getShape(0);
        int i = (shape2 - shape4) + 1;
        int shape5 = w.getShape(2);
        MTensor mTensor = new MTensor(new int[]{shape, i, shape5});
        float[] data = x.getData();
        float[] data2 = mTensor.getData();
        float[] data3 = w.getData();
        for (int i2 = 0; i2 < shape; i2++) {
            for (int i3 = 0; i3 < shape5; i3++) {
                for (int i4 = 0; i4 < i; i4++) {
                    float f = 0.0f;
                    int i5 = 0;
                    while (true) {
                        if (i5 < shape4) {
                            for (int i6 = 0; i6 < shape3; i6++) {
                                f += data[(shape2 * shape3 * i2) + ((i5 + i4) * shape3) + i6] * data3[(((i5 * shape3) + i6) * shape5) + i3];
                            }
                            i5++;
                        }
                    }
                    data2[(i * shape5 * i2) + (i4 * shape5) + i3] = f;
                }
            }
        }
        return mTensor;
    }

    public static final MTensor dense(MTensor x, MTensor w, MTensor b) {
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(w, "w");
        Intrinsics.checkNotNullParameter(b, "b");
        int shape = x.getShape(0);
        int shape2 = b.getShape(0);
        MTensor mul = mul(x, w);
        float[] data = b.getData();
        float[] data2 = mul.getData();
        for (int i = 0; i < shape; i++) {
            for (int i2 = 0; i2 < shape2; i2++) {
                int i3 = (i * shape2) + i2;
                data2[i3] = data2[i3] + data[i2];
            }
        }
        return mul;
    }

    public static final MTensor embedding(String[] texts, int i, MTensor w) {
        Intrinsics.checkNotNullParameter(texts, "texts");
        Intrinsics.checkNotNullParameter(w, "w");
        int length = texts.length;
        int shape = w.getShape(1);
        MTensor mTensor = new MTensor(new int[]{length, i, shape});
        float[] data = mTensor.getData();
        float[] data2 = w.getData();
        for (int i2 = 0; i2 < length; i2++) {
            int[] vectorize = Utils.INSTANCE.vectorize(texts[i2], i);
            for (int i3 = 0; i3 < i; i3++) {
                System.arraycopy(data2, vectorize[i3] * shape, data, (shape * i * i2) + (shape * i3), shape);
            }
        }
        return mTensor;
    }

    public static final void flatten(MTensor x, int i) {
        Intrinsics.checkNotNullParameter(x, "x");
        if (i >= x.getShapeSize()) {
            return;
        }
        int shapeSize = x.getShapeSize();
        int i2 = 1;
        for (int i3 = i; i3 < shapeSize; i3++) {
            i2 *= x.getShape(i3);
        }
        int[] iArr = new int[i + 1];
        for (int i4 = 0; i4 < i; i4++) {
            iArr[i4] = x.getShape(i4);
        }
        iArr[i] = i2;
        x.reshape(iArr);
    }

    public static final MTensor maxPool1D(MTensor x, int i) {
        Intrinsics.checkNotNullParameter(x, "x");
        int shape = x.getShape(0);
        int shape2 = x.getShape(1);
        int shape3 = x.getShape(2);
        int i2 = (shape2 - i) + 1;
        MTensor mTensor = new MTensor(new int[]{shape, i2, shape3});
        float[] data = x.getData();
        float[] data2 = mTensor.getData();
        for (int i3 = 0; i3 < shape; i3++) {
            for (int i4 = 0; i4 < shape3; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * shape3;
                    int i7 = (i3 * i2 * shape3) + i6 + i4;
                    data2[i7] = Float.MIN_VALUE;
                    for (int i8 = 0; i8 < i; i8++) {
                        data2[i7] = Math.max(data2[i7], data[(i3 * shape2 * shape3) + i6 + i4 + (i8 * shape3)]);
                    }
                }
            }
        }
        return mTensor;
    }

    public static final MTensor mul(MTensor x, MTensor w) {
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(w, "w");
        int shape = x.getShape(0);
        int shape2 = w.getShape(0);
        int shape3 = w.getShape(1);
        MTensor mTensor = new MTensor(new int[]{shape, shape3});
        float[] data = x.getData();
        float[] data2 = w.getData();
        float[] data3 = mTensor.getData();
        for (int i = 0; i < shape; i++) {
            for (int i2 = 0; i2 < shape3; i2++) {
                int i3 = (i * shape3) + i2;
                data3[i3] = 0.0f;
                for (int i4 = 0; i4 < shape2; i4++) {
                    data3[i3] = data3[i3] + (data[(i * shape2) + i4] * data2[(i4 * shape3) + i2]);
                }
            }
        }
        return mTensor;
    }

    public static final void relu(MTensor x) {
        Intrinsics.checkNotNullParameter(x, "x");
        float[] data = x.getData();
        int length = data.length;
        for (int i = 0; i < length; i++) {
            if (data[i] < 0.0f) {
                data[i] = 0.0f;
            }
        }
    }

    public static final void softmax(MTensor x) {
        int i;
        Intrinsics.checkNotNullParameter(x, "x");
        int shape = x.getShape(0);
        int shape2 = x.getShape(1);
        float[] data = x.getData();
        for (int i2 = 0; i2 < shape; i2++) {
            int i3 = i2 * shape2;
            int i4 = i3 + shape2;
            float f = Float.MIN_VALUE;
            int i5 = i3;
            while (i5 < i4) {
                float f2 = data[i5];
                float f3 = f;
                if (f2 > f) {
                    f3 = f2;
                }
                i5++;
                f = f3;
            }
            float f4 = 0.0f;
            int i6 = i3;
            while (true) {
                if (i6 >= i4) {
                    break;
                }
                float exp = (float) Math.exp(data[i6] - f);
                data[i6] = exp;
                f4 += exp;
                i6++;
            }
            for (i = i3; i < i4; i++) {
                data[i] = data[i] / f4;
            }
        }
    }

    public static final MTensor transpose2D(MTensor x) {
        Intrinsics.checkNotNullParameter(x, "x");
        int shape = x.getShape(0);
        int shape2 = x.getShape(1);
        MTensor mTensor = new MTensor(new int[]{shape2, shape});
        float[] data = x.getData();
        float[] data2 = mTensor.getData();
        for (int i = 0; i < shape; i++) {
            for (int i2 = 0; i2 < shape2; i2++) {
                data2[(i2 * shape) + i] = data[(i * shape2) + i2];
            }
        }
        return mTensor;
    }

    public static final MTensor transpose3D(MTensor x) {
        Intrinsics.checkNotNullParameter(x, "x");
        int shape = x.getShape(0);
        int shape2 = x.getShape(1);
        int shape3 = x.getShape(2);
        MTensor mTensor = new MTensor(new int[]{shape3, shape2, shape});
        float[] data = x.getData();
        float[] data2 = mTensor.getData();
        for (int i = 0; i < shape; i++) {
            for (int i2 = 0; i2 < shape2; i2++) {
                for (int i3 = 0; i3 < shape3; i3++) {
                    data2[(i3 * shape * shape2) + (i2 * shape) + i] = data[(i * shape2 * shape3) + (i2 * shape3) + i3];
                }
            }
        }
        return mTensor;
    }
}
