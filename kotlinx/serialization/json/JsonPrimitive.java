package kotlinx.serialization.json;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: JsonPrimitive.class */
public abstract class JsonPrimitive extends JsonElement {
    public static final Companion Companion = new Companion(null);

    /* loaded from: JsonPrimitive$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private JsonPrimitive() {
        super(null);
    }

    public /* synthetic */ JsonPrimitive(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getContent();

    public String toString() {
        return getContent();
    }
}
