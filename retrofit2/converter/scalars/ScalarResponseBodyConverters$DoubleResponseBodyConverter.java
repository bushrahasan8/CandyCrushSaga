package retrofit2.converter.scalars;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: ScalarResponseBodyConverters$DoubleResponseBodyConverter.class */
final class ScalarResponseBodyConverters$DoubleResponseBodyConverter implements Converter {
    static final ScalarResponseBodyConverters$DoubleResponseBodyConverter INSTANCE = new ScalarResponseBodyConverters$DoubleResponseBodyConverter();

    ScalarResponseBodyConverters$DoubleResponseBodyConverter() {
    }

    @Override // retrofit2.Converter
    public Double convert(ResponseBody responseBody) {
        return Double.valueOf(responseBody.string());
    }
}
