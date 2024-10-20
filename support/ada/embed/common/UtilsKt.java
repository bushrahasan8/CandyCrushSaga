package support.ada.embed.common;

import android.content.res.TypedArray;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: UtilsKt.class */
public abstract class UtilsKt {

    /* loaded from: UtilsKt$WhenMappings.class */
    public abstract /* synthetic */ class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[JsonToken.NUMBER.ordinal()] = 1;
            iArr[JsonToken.BOOLEAN.ordinal()] = 2;
            iArr[JsonToken.STRING.ordinal()] = 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Boolean] */
    public static final /* synthetic */ Map createMetaFields(InputStream inputStream) {
        String valueOf;
        Intrinsics.checkParameterIsNotNull(inputStream, "inputStream");
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
                throw new MetaFieldsJsonException();
            }
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String key = jsonReader.nextName();
                JsonToken peek = jsonReader.peek();
                if (peek != null) {
                    int i = WhenMappings.$EnumSwitchMapping$0[peek.ordinal()];
                    if (i == 1) {
                        valueOf = Double.valueOf(jsonReader.nextDouble());
                    } else if (i == 2) {
                        valueOf = Boolean.valueOf(jsonReader.nextBoolean());
                    } else if (i == 3) {
                        valueOf = jsonReader.nextString();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(valueOf, "when (it.peek()) {\n     …Exception()\n            }");
                    Intrinsics.checkExpressionValueIsNotNull(key, "key");
                    linkedHashMap.put(key, valueOf);
                }
                throw new MetaFieldsJsonException();
            }
            jsonReader.endObject();
            if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new MetaFieldsJsonException();
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(jsonReader, null);
            return linkedHashMap;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(jsonReader, th);
                throw th2;
            }
        }
    }

    public static final /* synthetic */ String getStringOrEmpty(TypedArray getStringOrEmpty, int i) {
        Intrinsics.checkParameterIsNotNull(getStringOrEmpty, "$this$getStringOrEmpty");
        String string = getStringOrEmpty.getString(i);
        if (string == null) {
            string = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(string, "getString(idRes) ?: EMPTY");
        return string;
    }

    public static final /* synthetic */ JSONObject mapToJson(Map map) {
        Intrinsics.checkParameterIsNotNull(map, "map");
        return map.isEmpty() ^ true ? new JSONObject(map) : null;
    }
}
