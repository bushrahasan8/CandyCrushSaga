package retrofit2.http;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: Query.class */
public @interface Query {
    boolean encoded() default false;

    String value();
}
