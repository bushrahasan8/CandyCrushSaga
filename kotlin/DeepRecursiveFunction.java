package kotlin;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: DeepRecursiveFunction.class */
public final class DeepRecursiveFunction {
    private final Function3 block;

    public DeepRecursiveFunction(Function3 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.block = block;
    }

    public final Function3 getBlock$kotlin_stdlib() {
        return this.block;
    }
}
