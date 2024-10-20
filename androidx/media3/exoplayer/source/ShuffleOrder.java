package androidx.media3.exoplayer.source;

import java.util.Arrays;
import java.util.Random;

/* loaded from: ShuffleOrder.class */
public interface ShuffleOrder {

    /* loaded from: ShuffleOrder$DefaultShuffleOrder.class */
    public static class DefaultShuffleOrder implements ShuffleOrder {
        private final int[] indexInShuffled;
        private final Random random;
        private final int[] shuffled;

        public DefaultShuffleOrder(int i) {
            this(i, new Random());
        }

        private DefaultShuffleOrder(int i, Random random) {
            this(createShuffledList(i, random), random);
        }

        private DefaultShuffleOrder(int[] iArr, Random random) {
            this.shuffled = iArr;
            this.random = random;
            this.indexInShuffled = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.indexInShuffled[iArr[i]] = i;
            }
        }

        private static int[] createShuffledList(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= i) {
                    return iArr;
                }
                int i4 = i3 + 1;
                int nextInt = random.nextInt(i4);
                iArr[i3] = iArr[nextInt];
                iArr[nextInt] = i3;
                i2 = i4;
            }
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndClear() {
            return new DefaultShuffleOrder(0, new Random(this.random.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndInsert(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= i2) {
                    break;
                }
                iArr[i4] = this.random.nextInt(this.shuffled.length + 1);
                int i5 = i4 + 1;
                int nextInt = this.random.nextInt(i5);
                iArr2[i4] = iArr2[nextInt];
                iArr2[nextInt] = i4 + i;
                i3 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.shuffled.length + i2];
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.shuffled;
                if (i8 >= iArr4.length + i2) {
                    return new DefaultShuffleOrder(iArr3, new Random(this.random.nextLong()));
                }
                if (i6 >= i2 || i7 != iArr[i6]) {
                    int i9 = iArr4[i7];
                    iArr3[i8] = i9;
                    if (i9 >= i) {
                        iArr3[i8] = i9 + i2;
                    }
                    i7++;
                } else {
                    iArr3[i8] = iArr2[i6];
                    i6++;
                }
                i8++;
            }
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndRemove(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[this.shuffled.length - i3];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.shuffled;
                if (i4 >= iArr2.length) {
                    return new DefaultShuffleOrder(iArr, new Random(this.random.nextLong()));
                }
                int i6 = iArr2[i4];
                if (i6 < i || i6 >= i2) {
                    int i7 = i6;
                    if (i6 >= i) {
                        i7 = i6 - i3;
                    }
                    iArr[i4 - i5] = i7;
                } else {
                    i5++;
                }
                i4++;
            }
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getFirstIndex() {
            int[] iArr = this.shuffled;
            return iArr.length > 0 ? iArr[0] : -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getLastIndex() {
            int[] iArr = this.shuffled;
            return iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getLength() {
            return this.shuffled.length;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getNextIndex(int i) {
            int i2 = this.indexInShuffled[i] + 1;
            int[] iArr = this.shuffled;
            return i2 < iArr.length ? iArr[i2] : -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getPreviousIndex(int i) {
            int i2 = this.indexInShuffled[i];
            int i3 = -1;
            int i4 = i2 - 1;
            if (i4 >= 0) {
                i3 = this.shuffled[i4];
            }
            return i3;
        }
    }

    ShuffleOrder cloneAndClear();

    ShuffleOrder cloneAndInsert(int i, int i2);

    ShuffleOrder cloneAndRemove(int i, int i2);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i);

    int getPreviousIndex(int i);
}
