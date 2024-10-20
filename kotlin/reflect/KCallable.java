package kotlin.reflect;

import java.util.List;
import java.util.Map;

/* loaded from: KCallable.class */
public interface KCallable extends KAnnotatedElement {
    Object call(Object... objArr);

    Object callBy(Map map);

    String getName();

    List getParameters();

    KType getReturnType();

    List getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
