package androidx.media3.common.util;

/* loaded from: Size.class */
public final class Size {
    public static final Size UNKNOWN = new Size(-1, -1);
    public static final Size ZERO = new Size(0, 0);
    private final int height;
    private final int width;

    public Size(int i, int i2) {
        Assertions.checkArgument((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.width = i;
        this.height = i2;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        boolean z = false;
        if (obj instanceof Size) {
            Size size = (Size) obj;
            z = false;
            if (this.width == size.width) {
                z = false;
                if (this.height == size.height) {
                    z = true;
                }
            }
        }
        return z;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i = this.height;
        int i2 = this.width;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.width + "x" + this.height;
    }
}
