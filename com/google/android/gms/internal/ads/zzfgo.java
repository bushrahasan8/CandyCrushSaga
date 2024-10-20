package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import java.io.IOException;

/* loaded from: zzfgo.class */
public final class zzfgo {
    private String zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgo(JsonReader jsonReader) throws IOException {
        boolean z;
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -1724546052) {
                if (hashCode == 3059181 && nextName.equals("code")) {
                    z = false;
                }
                z = -1;
            } else {
                if (nextName.equals(OTUXParamsKeys.OT_UX_DESCRIPTION)) {
                    z = true;
                }
                z = -1;
            }
            if (!z) {
                jsonReader.nextInt();
            } else if (!z) {
                jsonReader.skipValue();
            } else {
                str = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        this.zza = str;
    }

    public final String zza() {
        return this.zza;
    }
}
