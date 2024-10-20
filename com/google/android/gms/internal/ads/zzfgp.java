package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: zzfgp.class */
public final class zzfgp {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final long zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzfgo zzi;
    public final Bundle zzj;
    public final String zzk;
    public final String zzl;
    public final String zzm;
    public final JSONObject zzn;
    public final String zzo;
    public final int zzp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgp(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        String nextString;
        zzfgo zzfgoVar;
        String str;
        String str2;
        String str3;
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        String str4 = "";
        String str5 = "";
        String str6 = "";
        String str7 = str6;
        String str8 = str7;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        zzfgo zzfgoVar2 = null;
        long j = 0;
        int i3 = 1;
        String str9 = str8;
        String str10 = str9;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str4 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str9 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j = jsonReader.nextLong();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzig)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzfgoVar = new zzfgo(jsonReader);
                    str3 = str7;
                    str2 = str6;
                    str = str5;
                    nextString = str10;
                } else if ("bidding_data".equals(nextName)) {
                    nextString = jsonReader.nextString();
                    zzfgoVar = zzfgoVar2;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzjU)).booleanValue() && Objects.equals(nextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(nextName)) {
                        str8 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgQ)).booleanValue()) {
                            try {
                                Bundle zza = com.google.android.gms.ads.internal.util.zzbw.zza(com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader));
                                nextString = str10;
                                zzfgoVar = zzfgoVar2;
                                str = str5;
                                str2 = str6;
                                str3 = str7;
                                if (zza != null) {
                                    bundle = zza;
                                    nextString = str10;
                                    zzfgoVar = zzfgoVar2;
                                    str = str5;
                                    str2 = str6;
                                    str3 = str7;
                                }
                            } catch (IOException | JSONException e) {
                            } catch (IllegalStateException e2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzjg)).booleanValue()) {
                            str2 = jsonReader.nextString();
                            nextString = str10;
                            zzfgoVar = zzfgoVar2;
                            str = str5;
                            str3 = str7;
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(nextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzjg)).booleanValue()) {
                            str = jsonReader.nextString();
                            nextString = str10;
                            zzfgoVar = zzfgoVar2;
                            str2 = str6;
                            str3 = str7;
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        zzbfu zzbfuVar = zzbgc.zzjh;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbfuVar)).booleanValue() && Objects.equals(nextName, "adResponseBody")) {
                            str3 = jsonReader.nextString();
                            nextString = str10;
                            zzfgoVar = zzfgoVar2;
                            str = str5;
                            str2 = str6;
                        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbfuVar)).booleanValue() && Objects.equals(nextName, "adResponseHeaders")) {
                            jSONObject = com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader);
                        } else if (Objects.equals(nextName, "max_parallel_renderers")) {
                            i3 = Math.max(1, jsonReader.nextInt());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
                str7 = str3;
                str6 = str2;
                str5 = str;
                zzfgoVar2 = zzfgoVar;
                str10 = nextString;
            }
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzc = i;
        this.zzb = str4;
        this.zzd = str9;
        this.zze = i2;
        this.zzf = j;
        this.zzi = zzfgoVar2;
        this.zzg = z;
        this.zzh = str10;
        this.zzj = bundle;
        this.zzk = str5;
        this.zzl = str6;
        this.zzm = str7;
        this.zzn = jSONObject;
        this.zzo = str8;
        zzbhm zzbhmVar = zzbif.zza;
        this.zzp = ((Long) zzbhmVar.zze()).longValue() > 0 ? ((Long) zzbhmVar.zze()).intValue() : i3;
    }
}
