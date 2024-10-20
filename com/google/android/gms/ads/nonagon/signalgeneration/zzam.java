package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: zzam.class */
public final class zzam {
    public final String zza;
    public String zzb;
    public Bundle zzc = new Bundle();

    public zzam(JsonReader jsonReader) throws IOException {
        boolean z;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str2 = nextName == null ? "" : nextName;
            int hashCode = str2.hashCode();
            if (hashCode != -995427962) {
                if (hashCode == -271442291 && str2.equals("signal_dictionary")) {
                    z = true;
                }
                z = -1;
            } else {
                if (str2.equals("params")) {
                    z = false;
                }
                z = -1;
            }
            if (!z) {
                str = jsonReader.nextString();
            } else if (!z) {
                jsonReader.skipValue();
            } else {
                hashMap = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            }
        }
        this.zza = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzc.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }
}
