package kotlinx.serialization.json;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: JsonClassDiscriminator.class */
public @interface JsonClassDiscriminator {
    String discriminator();
}
