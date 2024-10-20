package kotlin.random;

import java.io.Serializable;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: Random.class */
public abstract class Random {
    public static final Default Default = new Default(null);
    private static final Random defaultRandom = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();

    /* loaded from: Random$Default.class */
    public static final class Default extends Random implements Serializable {
        private Default() {
        }

        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // kotlin.random.Random
        public int nextBits(int i) {
            return Random.defaultRandom.nextBits(i);
        }

        @Override // kotlin.random.Random
        public int nextInt() {
            return Random.defaultRandom.nextInt();
        }

        @Override // kotlin.random.Random
        public int nextInt(int i) {
            return Random.defaultRandom.nextInt(i);
        }

        @Override // kotlin.random.Random
        public int nextInt(int i, int i2) {
            return Random.defaultRandom.nextInt(i, i2);
        }

        @Override // kotlin.random.Random
        public long nextLong() {
            return Random.defaultRandom.nextLong();
        }

        @Override // kotlin.random.Random
        public long nextLong(long j, long j2) {
            return Random.defaultRandom.nextLong(j, j2);
        }
    }

    public abstract int nextBits(int i);

    public abstract int nextInt();

    public abstract int nextInt(int i);

    public int nextInt(int i, int i2) {
        int nextInt;
        int i3;
        RandomKt.checkRangeBounds(i, i2);
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                i3 = nextBits(RandomKt.fastLog2(i4));
                return i + i3;
            }
            do {
                nextInt = nextInt() >>> 1;
                i3 = nextInt % i4;
            } while ((nextInt - i3) + (i4 - 1) < 0);
            return i + i3;
        }
        while (true) {
            int nextInt2 = nextInt();
            if (i <= nextInt2 && nextInt2 < i2) {
                return nextInt2;
            }
        }
    }

    public abstract long nextLong();

    public long nextLong(long j, long j2) {
        long nextLong;
        long j3;
        int nextInt;
        RandomKt.checkRangeBounds(j, j2);
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    nextInt = nextBits(RandomKt.fastLog2(i));
                } else {
                    if (i2 != 1) {
                        j3 = (nextBits(RandomKt.fastLog2(i2)) << 32) + (nextInt() & 4294967295L);
                        return j + j3;
                    }
                    nextInt = nextInt();
                }
                j3 = nextInt & 4294967295L;
                return j + j3;
            }
            do {
                nextLong = nextLong() >>> 1;
                j3 = nextLong % j4;
            } while ((nextLong - j3) + (j4 - 1) < 0);
            return j + j3;
        }
        while (true) {
            long nextLong2 = nextLong();
            if (j <= nextLong2 && nextLong2 < j2) {
                return nextLong2;
            }
        }
    }
}
