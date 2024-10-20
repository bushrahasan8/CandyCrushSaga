package androidx.media3.exoplayer.source;

import android.util.SparseArray;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;

/* loaded from: SpannedData.class */
final class SpannedData {
    private final Consumer removeCallback;
    private final SparseArray spans = new SparseArray();
    private int memoizedReadIndex = -1;

    public SpannedData(Consumer consumer) {
        this.removeCallback = consumer;
    }

    public void appendSpan(int i, Object obj) {
        if (this.memoizedReadIndex == -1) {
            Assertions.checkState(this.spans.size() == 0);
            this.memoizedReadIndex = 0;
        }
        if (this.spans.size() > 0) {
            SparseArray sparseArray = this.spans;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            boolean z = false;
            if (i >= keyAt) {
                z = true;
            }
            Assertions.checkArgument(z);
            if (keyAt == i) {
                Consumer consumer = this.removeCallback;
                SparseArray sparseArray2 = this.spans;
                consumer.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.spans.append(i, obj);
    }

    public void clear() {
        for (int i = 0; i < this.spans.size(); i++) {
            this.removeCallback.accept(this.spans.valueAt(i));
        }
        this.memoizedReadIndex = -1;
        this.spans.clear();
    }

    public void discardFrom(int i) {
        for (int size = this.spans.size() - 1; size >= 0 && i < this.spans.keyAt(size); size--) {
            this.removeCallback.accept(this.spans.valueAt(size));
            this.spans.removeAt(size);
        }
        this.memoizedReadIndex = this.spans.size() > 0 ? Math.min(this.memoizedReadIndex, this.spans.size() - 1) : -1;
    }

    public void discardTo(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.spans.size() - 1) {
                return;
            }
            int i4 = i3 + 1;
            if (i < this.spans.keyAt(i4)) {
                return;
            }
            this.removeCallback.accept(this.spans.valueAt(i3));
            this.spans.removeAt(i3);
            int i5 = this.memoizedReadIndex;
            if (i5 > 0) {
                this.memoizedReadIndex = i5 - 1;
            }
            i2 = i4;
        }
    }

    public Object get(int i) {
        if (this.memoizedReadIndex == -1) {
            this.memoizedReadIndex = 0;
        }
        while (true) {
            int i2 = this.memoizedReadIndex;
            if (i2 <= 0 || i >= this.spans.keyAt(i2)) {
                break;
            }
            this.memoizedReadIndex--;
        }
        while (this.memoizedReadIndex < this.spans.size() - 1 && i >= this.spans.keyAt(this.memoizedReadIndex + 1)) {
            this.memoizedReadIndex++;
        }
        return this.spans.valueAt(this.memoizedReadIndex);
    }

    public Object getEndValue() {
        SparseArray sparseArray = this.spans;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean isEmpty() {
        return this.spans.size() == 0;
    }
}
