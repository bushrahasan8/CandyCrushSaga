package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.common.util.IOUtils;
import com.ironsource.mediationsdk.utils.c;
import com.ironsource.t2;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/* loaded from: zzeez.class */
public final class zzeez {
    public int zza = 0;
    public Map zzb = new HashMap();
    public String zzc = "";
    public long zzd = -1;

    public static zzeez zza(Reader reader) throws zzfgq {
        try {
            try {
                JsonReader jsonReader = new JsonReader(reader);
                HashMap hashMap = new HashMap();
                String str = "";
                jsonReader.beginObject();
                long j = -1;
                int i = 0;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (c.Y1.equals(nextName)) {
                        i = jsonReader.nextInt();
                    } else if (t2.h.E0.equals(nextName)) {
                        str = jsonReader.nextString();
                    } else if ("latency".equals(nextName)) {
                        j = jsonReader.nextLong();
                    } else if ("headers".equals(nextName)) {
                        hashMap = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            hashMap.put(jsonReader.nextName(), com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                zzeez zzeezVar = new zzeez();
                zzeezVar.zza = i;
                if (str != null) {
                    zzeezVar.zzc = str;
                }
                zzeezVar.zzd = j;
                zzeezVar.zzb = hashMap;
                IOUtils.closeQuietly(reader);
                return zzeezVar;
            } catch (Throwable th) {
                IOUtils.closeQuietly(reader);
                throw th;
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException e) {
            throw new zzfgq("Unable to parse Response", e);
        }
    }
}
