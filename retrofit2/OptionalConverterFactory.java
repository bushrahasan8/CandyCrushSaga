package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: OptionalConverterFactory.class */
public final class OptionalConverterFactory extends Converter.Factory {
    static final Converter.Factory INSTANCE = new OptionalConverterFactory();

    /* loaded from: OptionalConverterFactory$OptionalConverter.class */
    static final class OptionalConverter implements Converter {
        final Converter delegate;

        OptionalConverter(Converter converter) {
            this.delegate = converter;
        }

        @Override // retrofit2.Converter
        public Optional convert(ResponseBody responseBody) {
            Optional ofNullable;
            ofNullable = Optional.ofNullable(this.delegate.convert(responseBody));
            return ofNullable;
        }
    }

    OptionalConverterFactory() {
    }

    @Override // retrofit2.Converter.Factory
    public Converter responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Converter.Factory.getRawType(type) != OptionalConverterFactory$$ExternalSyntheticApiModelOutline0.m()) {
            return null;
        }
        return new OptionalConverter(retrofit.responseBodyConverter(Converter.Factory.getParameterUpperBound(0, (ParameterizedType) type), annotationArr));
    }
}
