package okhttp3.internal.http2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: Settings.class */
public final class Settings {
    public static final Companion Companion = new Companion(null);
    private int set;
    private final int[] values = new int[10];

    /* loaded from: Settings$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int get(int i) {
        return this.values[i];
    }

    public final int getHeaderTableSize() {
        return (this.set & 2) != 0 ? this.values[1] : -1;
    }

    public final int getInitialWindowSize() {
        return (this.set & 128) != 0 ? this.values[7] : 65535;
    }

    public final int getMaxConcurrentStreams() {
        return (this.set & 16) != 0 ? this.values[4] : Integer.MAX_VALUE;
    }

    public final int getMaxFrameSize(int i) {
        if ((this.set & 32) != 0) {
            i = this.values[5];
        }
        return i;
    }

    public final boolean isSet(int i) {
        boolean z = true;
        if (((1 << i) & this.set) == 0) {
            z = false;
        }
        return z;
    }

    public final void merge(Settings other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i = 0; i < 10; i++) {
            if (other.isSet(i)) {
                set(i, other.get(i));
            }
        }
    }

    public final Settings set(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.values;
            if (i < iArr.length) {
                this.set = (1 << i) | this.set;
                iArr[i] = i2;
            }
        }
        return this;
    }

    public final int size() {
        return Integer.bitCount(this.set);
    }
}
