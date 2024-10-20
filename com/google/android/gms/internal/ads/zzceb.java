package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.ironsource.na;
import com.ironsource.t2;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: zzceb.class */
public final class zzceb {
    public static final int zza = 0;
    private static boolean zzc = false;
    private static boolean zzd = false;
    private final List zzg;
    private static final Object zzb = new Object();
    private static final Clock zze = DefaultClock.getInstance();
    private static final Set zzf = new HashSet(Arrays.asList(new String[0]));

    public zzceb() {
        this(null);
    }

    public zzceb(String str) {
        this.zzg = !zzk() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zzr(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name(t2.h.E0).value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzb(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        zzr(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void zzi() {
        synchronized (zzb) {
            zzc = false;
            zzd = false;
            zzcec.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzj(boolean z) {
        synchronized (zzb) {
            zzc = true;
            zzd = z;
        }
    }

    public static boolean zzk() {
        boolean z;
        synchronized (zzb) {
            z = false;
            if (zzc) {
                z = false;
                if (zzd) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static boolean zzl() {
        boolean z;
        synchronized (zzb) {
            z = zzc;
        }
        return z;
    }

    private static void zzm(String str) {
        synchronized (zzceb.class) {
            try {
                zzcec.zzi("GMA Debug BEGIN");
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < str.length()) {
                        int i3 = i2 + 4000;
                        zzcec.zzi("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i2, Math.min(i3, str.length())))));
                        i = i3;
                    } else {
                        zzcec.zzi("GMA Debug FINISH");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzn(String str, zzcea zzceaVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(zze.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            zzceaVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            zzcec.zzh("unable to log", e);
        }
        zzm(stringWriter.toString());
    }

    private final void zzo(final String str) {
        zzn("onNetworkRequestError", new zzcea(str) { // from class: com.google.android.gms.internal.ads.zzcdy
            public final String zza;

            {
                this.zza = str;
            }

            @Override // com.google.android.gms.internal.ads.zzcea
            public final void zza(JsonWriter jsonWriter) {
                int i = zzceb.zza;
                jsonWriter.name("params").beginObject();
                String str2 = this.zza;
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private final void zzp(final String str, final String str2, final Map map, final byte[] bArr) {
        zzn("onNetworkRequest", new zzcea(str, str2, map, bArr) { // from class: com.google.android.gms.internal.ads.zzcdw
            public final String zza;
            public final String zzb;
            public final Map zzc;
            public final byte[] zzd;

            {
                this.zza = str;
                this.zzb = str2;
                this.zzc = map;
                this.zzd = bArr;
            }

            @Override // com.google.android.gms.internal.ads.zzcea
            public final void zza(JsonWriter jsonWriter) {
                zzceb.zza(this.zza, this.zzb, this.zzc, this.zzd, jsonWriter);
            }
        });
    }

    private final void zzq(final Map map, final int i) {
        zzn("onNetworkResponse", new zzcea(i, map) { // from class: com.google.android.gms.internal.ads.zzcdz
            public final int zza;
            public final Map zzb;

            {
                this.zza = i;
                this.zzb = map;
            }

            @Override // com.google.android.gms.internal.ads.zzcea
            public final void zza(JsonWriter jsonWriter) {
                zzceb.zzb(this.zza, this.zzb, jsonWriter);
            }
        });
    }

    private static void zzr(JsonWriter jsonWriter, Map map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!zzf.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        zzcec.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void zzc(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (zzk()) {
            zzp(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void zzd(String str, String str2, Map map, byte[] bArr) {
        if (zzk()) {
            zzp(str, na.a, map, bArr);
        }
    }

    public final void zze(HttpURLConnection httpURLConnection, int i) {
        String str;
        if (zzk()) {
            zzq(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    zzcec.zzj("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e.getMessage())));
                    str = null;
                }
                zzo(str);
            }
        }
    }

    public final void zzf(Map map, int i) {
        if (zzk()) {
            zzq(map, i);
            if (i < 200 || i >= 300) {
                zzo(null);
            }
        }
    }

    public final void zzg(String str) {
        if (zzk() && str != null) {
            zzh(str.getBytes());
        }
    }

    public final void zzh(final byte[] bArr) {
        zzn("onNetworkResponseBody", new zzcea(bArr) { // from class: com.google.android.gms.internal.ads.zzcdx
            public final byte[] zza;

            {
                this.zza = bArr;
            }

            @Override // com.google.android.gms.internal.ads.zzcea
            public final void zza(JsonWriter jsonWriter) {
                int i = zzceb.zza;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = this.zza;
                int length = bArr2.length;
                String encode = Base64Utils.encode(bArr2);
                if (length < 10000) {
                    jsonWriter.name(t2.h.E0).value(encode);
                } else {
                    String zze2 = zzcdv.zze(encode);
                    if (zze2 != null) {
                        jsonWriter.name("bodydigest").value(zze2);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }
}
