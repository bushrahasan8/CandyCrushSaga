package retrofit2.converter.scalars;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: ScalarResponseBodyConverters$FloatResponseBodyConverter.class */
final class ScalarResponseBodyConverters$FloatResponseBodyConverter implements Converter {
    static final ScalarResponseBodyConverters$FloatResponseBodyConverter INSTANCE = new ScalarResponseBodyConverters$FloatResponseBodyConverter();

    ScalarResponseBodyConverters$FloatResponseBodyConverter() {
    }

    @Override // retrofit2.Converter
    public Float convert(ResponseBody responseBody) {
        return Float.valueOf(responseBody.string());
    }
}
