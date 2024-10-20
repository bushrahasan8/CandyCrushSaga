package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: Triple.class */
public final class Triple implements Serializable {
    private final Object first;
    private final Object second;
    private final Object third;

    public Triple(Object obj, Object obj2, Object obj3) {
        this.first = obj;
        this.second = obj2;
        this.third = obj3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return Intrinsics.areEqual(this.first, triple.first) && Intrinsics.areEqual(this.second, triple.second) && Intrinsics.areEqual(this.third, triple.third);
    }

    public final Object getFirst() {
        return this.first;
    }

    public final Object getSecond() {
        return this.second;
    }

    public final Object getThird() {
        return this.third;
    }

    public int hashCode() {
        Object obj = this.first;
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.second;
        int hashCode2 = obj2 == null ? 0 : obj2.hashCode();
        Object obj3 = this.third;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public String toString() {
        return '(' + this.first + ", " + this.second + ", " + this.third + ')';
    }
}
