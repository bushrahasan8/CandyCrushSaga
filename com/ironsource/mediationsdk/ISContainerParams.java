package com.ironsource.mediationsdk;

/* loaded from: ISContainerParams.class */
public final class ISContainerParams {
    private final int a;
    private final int b;

    public ISContainerParams(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static /* synthetic */ ISContainerParams copy$default(ISContainerParams iSContainerParams, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = iSContainerParams.a;
        }
        if ((i3 & 2) != 0) {
            i2 = iSContainerParams.b;
        }
        return iSContainerParams.copy(i, i2);
    }

    public final int component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final ISContainerParams copy(int i, int i2) {
        return new ISContainerParams(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ISContainerParams)) {
            return false;
        }
        ISContainerParams iSContainerParams = (ISContainerParams) obj;
        return this.a == iSContainerParams.a && this.b == iSContainerParams.b;
    }

    public final int getHeight() {
        return this.b;
    }

    public final int getWidth() {
        return this.a;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        return "ISContainerParams(width=" + this.a + ", height=" + this.b + ')';
    }
}
