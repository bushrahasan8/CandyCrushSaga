package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* loaded from: LogResponse.class */
public abstract class LogResponse {
    static LogResponse create(long j) {
        return new AutoValue_LogResponse(j);
    }

    public static LogResponse fromJson(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        LogResponse create = create(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return create;
                    }
                    LogResponse create2 = create(jsonReader.nextLong());
                    jsonReader.close();
                    return create2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public abstract long getNextRequestWaitMillis();
}
