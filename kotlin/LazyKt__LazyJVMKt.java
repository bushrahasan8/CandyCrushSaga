package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: LazyKt__LazyJVMKt.class */
public abstract class LazyKt__LazyJVMKt {

    /* loaded from: LazyKt__LazyJVMKt$WhenMappings.class */
    public abstract /* synthetic */ class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            try {
                iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[LazyThreadSafetyMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static Lazy lazy(LazyThreadSafetyMode mode, Function0 initializer) {
        Lazy synchronizedLazyImpl;
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == 1) {
            synchronizedLazyImpl = new SynchronizedLazyImpl(initializer, null, 2, null);
        } else if (i == 2) {
            synchronizedLazyImpl = new SafePublicationLazyImpl(initializer);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            synchronizedLazyImpl = new UnsafeLazyImpl(initializer);
        }
        return synchronizedLazyImpl;
    }

    public static Lazy lazy(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new SynchronizedLazyImpl(initializer, null, 2, null);
    }
}
