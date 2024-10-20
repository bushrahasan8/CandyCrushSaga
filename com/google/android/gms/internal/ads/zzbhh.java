package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: zzbhh.class */
public final class zzbhh {
    private final ScheduledExecutorService zza;
    private Runnable zzb;
    private zzbhe zzc;
    private CustomTabsSession zzd;
    private String zze;
    private long zzf = 0;
    private long zzg;
    private JSONArray zzh;
    private Context zzi;

    public zzbhh(ScheduledExecutorService scheduledExecutorService) {
        this.zza = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbgc.zzjB)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj() {
        /*
            r6 = this;
            r0 = r6
            com.google.android.gms.internal.ads.zzbhe r0 = r0.zzc
            r7 = r0
            r0 = r7
            if (r0 != 0) goto Lf
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            com.google.android.gms.internal.ads.zzcec.zzg(r0)
            return
        Lf:
            r0 = r7
            java.lang.Boolean r0 = r0.zza()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a
            return
        L1a:
            r0 = r6
            java.lang.String r0 = r0.zze
            if (r0 == 0) goto L98
            r0 = r6
            androidx.browser.customtabs.CustomTabsSession r0 = r0.zzd
            if (r0 == 0) goto L98
            r0 = r6
            java.util.concurrent.ScheduledExecutorService r0 = r0.zza
            if (r0 == 0) goto L98
            r0 = r6
            long r0 = r0.zzf
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3b
            goto L4e
        L3b:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzt.zzB()
            long r0 = r0.elapsedRealtime()
            r1 = r6
            long r1 = r1.zzf
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L4e
            goto L62
        L4e:
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzjB
            r7 = r0
            com.google.android.gms.internal.ads.zzbga r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            r1 = r7
            java.lang.Object r0 = r0.zza(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L98
        L62:
            r0 = r6
            androidx.browser.customtabs.CustomTabsSession r0 = r0.zzd
            r1 = r6
            java.lang.String r1 = r1.zze
            android.net.Uri r1 = android.net.Uri.parse(r1)
            boolean r0 = r0.requestPostMessageChannel(r1)
            r0 = r6
            java.util.concurrent.ScheduledExecutorService r0 = r0.zza
            r7 = r0
            r0 = r6
            java.lang.Runnable r0 = r0.zzb
            r8 = r0
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzjC
            r9 = r0
            r0 = r7
            r1 = r8
            com.google.android.gms.internal.ads.zzbga r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            r3 = r9
            java.lang.Object r2 = r2.zza(r3)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r0 = r0.schedule(r1, r2, r3)
            return
        L98:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhh.zzj():void");
    }

    private final void zzk(JSONObject jSONObject) {
        try {
            if (this.zzh == null) {
                this.zzh = new JSONArray((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzjE));
            }
            jSONObject.put("eids", this.zzh);
        } catch (JSONException e) {
            zzcec.zzh("Error fetching the PACT active eids JSON: ", e);
        }
    }

    public final CustomTabsSession zzb() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONObject zzc(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put(MRAIDPresenter.ERROR, str2);
        zzk(jSONObject);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONObject zzd(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        zzk(jSONObject);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf() {
        this.zzf = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzjA)).intValue();
        if (this.zzb == null) {
            this.zzb = new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbhf
                public final zzbhh zza;

                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj();
                }
            };
        }
        zzj();
    }

    public final void zzg(Context context, CustomTabsClient customTabsClient, String str, CustomTabsCallback customTabsCallback) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (customTabsClient == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzi = context;
        this.zze = str;
        zzbhe zzbheVar = new zzbhe(this, customTabsCallback);
        this.zzc = zzbheVar;
        CustomTabsSession newSession = customTabsClient.newSession(zzbheVar);
        this.zzd = newSession;
        if (newSession == null) {
            zzcec.zzg("CustomTabsClient failed to create new session.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh(String str) {
        try {
            CustomTabsSession customTabsSession = this.zzd;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzg).toString());
            zzk(jSONObject);
            customTabsSession.postMessage(jSONObject.toString(), (Bundle) null);
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.zzi, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), new zzbhg(this, str));
        } catch (JSONException e) {
            zzcec.zzh("Error creating JSON: ", e);
        }
    }

    public final void zzi(long j) {
        this.zzg = j;
    }
}
