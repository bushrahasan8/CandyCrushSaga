package retrofit2.http;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: QueryMap.class */
public @interface QueryMap {
    boolean encoded() default false;
}
