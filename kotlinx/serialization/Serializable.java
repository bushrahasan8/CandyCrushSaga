package kotlinx.serialization;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: Serializable.class */
public @interface Serializable {
    Class with() default KSerializer.class;
}
