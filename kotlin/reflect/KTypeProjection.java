package kotlin.reflect;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: KTypeProjection.class */
public final class KTypeProjection {
    public static final Companion Companion = new Companion(null);
    public static final KTypeProjection star = new KTypeProjection(null, null);
    private final KType type;
    private final KVariance variance;

    /* loaded from: KTypeProjection$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KTypeProjection invariant(KType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(KVariance.INVARIANT, type);
        }
    }

    /* loaded from: KTypeProjection$WhenMappings.class */
    public abstract /* synthetic */ class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KTypeProjection(KVariance kVariance, KType kType) {
        String str;
        this.variance = kVariance;
        this.type = kType;
        if ((kVariance == null) == (kType == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        return this.variance == kTypeProjection.variance && Intrinsics.areEqual(this.type, kTypeProjection.type);
    }

    public final KType getType() {
        return this.type;
    }

    public final KVariance getVariance() {
        return this.variance;
    }

    public int hashCode() {
        KVariance kVariance = this.variance;
        int i = 0;
        int hashCode = kVariance == null ? 0 : kVariance.hashCode();
        KType kType = this.type;
        if (kType != null) {
            i = kType.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public String toString() {
        String str;
        KVariance kVariance = this.variance;
        int i = kVariance == null ? -1 : WhenMappings.$EnumSwitchMapping$0[kVariance.ordinal()];
        if (i == -1) {
            str = "*";
        } else if (i == 1) {
            str = String.valueOf(this.type);
        } else if (i == 2) {
            str = "in " + this.type;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "out " + this.type;
        }
        return str;
    }
}
