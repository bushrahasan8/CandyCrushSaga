package androidx.media3.exoplayer.upstream;

import androidx.media3.exoplayer.upstream.SlidingPercentile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: SlidingPercentile.class */
public class SlidingPercentile {
    private static final Comparator INDEX_COMPARATOR = new Comparator() { // from class: androidx.media3.exoplayer.upstream.SlidingPercentile$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int lambda$static$0;
            lambda$static$0 = SlidingPercentile.lambda$static$0((SlidingPercentile.Sample) obj, (SlidingPercentile.Sample) obj2);
            return lambda$static$0;
        }
    };
    private static final Comparator VALUE_COMPARATOR = new Comparator() { // from class: androidx.media3.exoplayer.upstream.SlidingPercentile$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int lambda$static$1;
            lambda$static$1 = SlidingPercentile.lambda$static$1((SlidingPercentile.Sample) obj, (SlidingPercentile.Sample) obj2);
            return lambda$static$1;
        }
    };
    private final int maxWeight;
    private int nextSampleIndex;
    private int recycledSampleCount;
    private int totalWeight;
    private final Sample[] recycledSamples = new Sample[5];
    private final ArrayList samples = new ArrayList();
    private int currentSortOrder = -1;

    /* loaded from: SlidingPercentile$Sample.class */
    public static class Sample {
        public int index;
        public float value;
        public int weight;

        private Sample() {
        }

        /* synthetic */ Sample(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public SlidingPercentile(int i) {
        this.maxWeight = i;
    }

    private void ensureSortedByIndex() {
        if (this.currentSortOrder != 1) {
            Collections.sort(this.samples, INDEX_COMPARATOR);
            this.currentSortOrder = 1;
        }
    }

    private void ensureSortedByValue() {
        if (this.currentSortOrder != 0) {
            Collections.sort(this.samples, VALUE_COMPARATOR);
            this.currentSortOrder = 0;
        }
    }

    public static /* synthetic */ int lambda$static$0(Sample sample, Sample sample2) {
        return sample.index - sample2.index;
    }

    public static /* synthetic */ int lambda$static$1(Sample sample, Sample sample2) {
        return Float.compare(sample.value, sample2.value);
    }

    public void addSample(int i, float f) {
        Sample sample;
        ensureSortedByIndex();
        int i2 = this.recycledSampleCount;
        if (i2 > 0) {
            Sample[] sampleArr = this.recycledSamples;
            int i3 = i2 - 1;
            this.recycledSampleCount = i3;
            sample = sampleArr[i3];
        } else {
            sample = new Sample();
        }
        int i4 = this.nextSampleIndex;
        this.nextSampleIndex = i4 + 1;
        sample.index = i4;
        sample.weight = i;
        sample.value = f;
        this.samples.add(sample);
        this.totalWeight += i;
        while (true) {
            int i5 = this.totalWeight;
            int i6 = this.maxWeight;
            if (i5 <= i6) {
                return;
            }
            int i7 = i5 - i6;
            Sample sample2 = (Sample) this.samples.get(0);
            int i8 = sample2.weight;
            if (i8 <= i7) {
                this.totalWeight -= i8;
                this.samples.remove(0);
                int i9 = this.recycledSampleCount;
                if (i9 < 5) {
                    Sample[] sampleArr2 = this.recycledSamples;
                    this.recycledSampleCount = i9 + 1;
                    sampleArr2[i9] = sample2;
                }
            } else {
                sample2.weight = i8 - i7;
                this.totalWeight -= i7;
            }
        }
    }

    public float getPercentile(float f) {
        float f2;
        ensureSortedByValue();
        float f3 = this.totalWeight;
        int i = 0;
        for (int i2 = 0; i2 < this.samples.size(); i2++) {
            Sample sample = (Sample) this.samples.get(i2);
            i += sample.weight;
            if (i >= f * f3) {
                return sample.value;
            }
        }
        if (this.samples.isEmpty()) {
            f2 = Float.NaN;
        } else {
            ArrayList arrayList = this.samples;
            f2 = ((Sample) arrayList.get(arrayList.size() - 1)).value;
        }
        return f2;
    }

    public void reset() {
        this.samples.clear();
        this.currentSortOrder = -1;
        this.nextSampleIndex = 0;
        this.totalWeight = 0;
    }
}
