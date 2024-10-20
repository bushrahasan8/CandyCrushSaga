package kotlin.reflect;

import java.util.List;

/* loaded from: KType.class */
public interface KType extends KAnnotatedElement {
    List getArguments();

    KClassifier getClassifier();

    boolean isMarkedNullable();
}
