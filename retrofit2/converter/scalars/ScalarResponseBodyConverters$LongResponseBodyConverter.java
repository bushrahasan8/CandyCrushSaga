package retrofit2.converter.scalars;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: ScalarResponseBodyConverters$LongResponseBodyConverter.class */
final class ScalarResponseBodyConverters$LongResponseBodyConverter implements Converter {
    static final ScalarResponseBodyConverters$LongResponseBodyConverter INSTANCE = new ScalarResponseBodyConverters$LongResponseBodyConverter();

    ScalarResponseBodyConverters$LongResponseBodyConverter() {
    }

    @Override // retrofit2.Converter
    public Long convert(ResponseBody responseBody) {
        return Long.valueOf(responseBody.string());
    }
}
