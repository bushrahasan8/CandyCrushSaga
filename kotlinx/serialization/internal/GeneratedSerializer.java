package kotlinx.serialization.internal;

import kotlinx.serialization.KSerializer;

/* loaded from: GeneratedSerializer.class */
public interface GeneratedSerializer extends KSerializer {

    /* loaded from: GeneratedSerializer$DefaultImpls.class */
    public static final abstract class DefaultImpls {
        public static KSerializer[] typeParametersSerializers(GeneratedSerializer generatedSerializer) {
            return PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY;
        }
    }

    KSerializer[] childSerializers();

    KSerializer[] typeParametersSerializers();
}
