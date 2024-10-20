package retrofit2.converter.scalars;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: ScalarResponseBodyConverters$CharacterResponseBodyConverter.class */
final class ScalarResponseBodyConverters$CharacterResponseBodyConverter implements Converter {
    static final ScalarResponseBodyConverters$CharacterResponseBodyConverter INSTANCE = new ScalarResponseBodyConverters$CharacterResponseBodyConverter();

    ScalarResponseBodyConverters$CharacterResponseBodyConverter() {
    }

    @Override // retrofit2.Converter
    public Character convert(ResponseBody responseBody) {
        String string = responseBody.string();
        if (string.length() == 1) {
            return Character.valueOf(string.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + string.length());
    }
}
