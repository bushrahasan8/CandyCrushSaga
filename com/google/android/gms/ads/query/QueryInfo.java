package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzcdr;

/* loaded from: QueryInfo.class */
public class QueryInfo {
    private final zzem zza;

    public QueryInfo(zzem zzemVar) {
        this.zza = zzemVar;
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zza(context, adFormat, adRequest, null, queryInfoGenerationCallback);
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, String str, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        zza(context, adFormat, adRequest, str, queryInfoGenerationCallback);
    }

    private static void zza(final Context context, final AdFormat adFormat, final AdRequest adRequest, final String str, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzbgc.zza(context);
        if (((Boolean) zzbhy.zzk.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable(context, adFormat, adRequest, str, queryInfoGenerationCallback) { // from class: com.google.android.gms.ads.query.zza
                    public final Context zza;
                    public final AdFormat zzb;
                    public final AdRequest zzc;
                    public final String zzd;
                    public final QueryInfoGenerationCallback zze;

                    {
                        this.zza = context;
                        this.zzb = adFormat;
                        this.zzc = adRequest;
                        this.zzd = str;
                        this.zze = queryInfoGenerationCallback;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AdRequest adRequest2 = this.zzc;
                        zzdx zza = adRequest2 == null ? null : adRequest2.zza();
                        new zzbxk(this.zza, this.zzb, zza, this.zzd).zzb(this.zze);
                    }
                });
                return;
            }
        }
        new zzbxk(context, adFormat, adRequest == null ? null : adRequest.zza(), str).zzb(queryInfoGenerationCallback);
    }

    public String getQuery() {
        return this.zza.zzb();
    }

    @KeepForSdk
    public Bundle getQueryBundle() {
        return this.zza.zza();
    }

    @KeepForSdk
    public String getRequestId() {
        return this.zza.zzc();
    }
}
