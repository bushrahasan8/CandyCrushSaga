package kotlin.random;

/* loaded from: AbstractPlatformRandom.class */
public abstract class AbstractPlatformRandom extends Random {
    public abstract java.util.Random getImpl();

    @Override // kotlin.random.Random
    public int nextBits(int i) {
        return RandomKt.takeUpperBits(getImpl().nextInt(), i);
    }

    @Override // kotlin.random.Random
    public int nextInt() {
        return getImpl().nextInt();
    }

    @Override // kotlin.random.Random
    public int nextInt(int i) {
        return getImpl().nextInt(i);
    }

    @Override // kotlin.random.Random
    public long nextLong() {
        return getImpl().nextLong();
    }
}
