package kotlin.reflect;

import kotlin.Function;

/* loaded from: KFunction.class */
public interface KFunction extends KCallable, Function {
    boolean isExternal();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    @Override // kotlin.reflect.KCallable
    boolean isSuspend();
}
