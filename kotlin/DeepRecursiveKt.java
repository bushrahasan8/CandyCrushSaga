package kotlin;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: DeepRecursiveKt.class */
public abstract class DeepRecursiveKt {
    private static final Object UNDEFINED_RESULT;

    static {
        Result.Companion companion = Result.Companion;
        UNDEFINED_RESULT = Result.m7129constructorimpl(IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }

    public static final Object invoke(DeepRecursiveFunction deepRecursiveFunction, Object obj) {
        Intrinsics.checkNotNullParameter(deepRecursiveFunction, "<this>");
        return new DeepRecursiveScopeImpl(deepRecursiveFunction.getBlock$kotlin_stdlib(), obj).runCallLoop();
    }
}
