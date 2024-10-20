package retrofit2.converter.scalars;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: ScalarResponseBodyConverters$ShortResponseBodyConverter.class */
final class ScalarResponseBodyConverters$ShortResponseBodyConverter implements Converter {
    static final ScalarResponseBodyConverters$ShortResponseBodyConverter INSTANCE = new ScalarResponseBodyConverters$ShortResponseBodyConverter();

    ScalarResponseBodyConverters$ShortResponseBodyConverter() {
    }

    @Override // retrofit2.Converter
    public Short convert(ResponseBody responseBody) {
        return Short.valueOf(responseBody.string());
    }
}
