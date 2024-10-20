package retrofit2.http;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: Part.class */
public @interface Part {
    String encoding() default "binary";

    String value() default "";
}
