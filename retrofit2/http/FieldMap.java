package retrofit2.http;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: FieldMap.class */
public @interface FieldMap {
    boolean encoded() default false;
}
