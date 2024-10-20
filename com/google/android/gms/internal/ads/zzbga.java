package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: zzbga.class */
public final class zzbga implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();

    private final void zzd(final SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzbgh.zza(new zzfxu(sharedPreferences) { // from class: com.google.android.gms.internal.ads.zzbfx
                public final SharedPreferences zza;

                {
                    this.zza = sharedPreferences;
                }

                @Override // com.google.android.gms.internal.ads.zzfxu
                public final Object zza() {
                    return this.zza.getString("flag_configuration", "{}");
                }
            }));
        } catch (JSONException e) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzd(sharedPreferences);
        }
    }

    public final Object zza(final zzbfu zzbfuVar) {
        if (!this.zzc.block(UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null) {
                }
                return zzbfuVar.zzm();
            }
        }
        if (zzbfuVar.zze() != 2) {
            return (zzbfuVar.zze() == 1 && this.zzh.has(zzbfuVar.zzn())) ? zzbfuVar.zza(this.zzh) : zzbgh.zza(new zzfxu(this, zzbfuVar) { // from class: com.google.android.gms.internal.ads.zzbfy
                public final zzbga zza;
                public final zzbfu zzb;

                {
                    this.zza = this;
                    this.zzb = zzbfuVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfxu
                public final Object zza() {
                    return this.zza.zzb(this.zzb);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbfuVar.zzm() : zzbfuVar.zzb(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzb(zzbfu zzbfuVar) {
        return zzbfuVar.zzc(this.zze);
    }

    public final void zzc(Context context) {
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd) {
                return;
            }
            if (!this.zza) {
                this.zza = true;
            }
            Context context2 = context;
            if (context.getApplicationContext() != null) {
                context2 = context.getApplicationContext();
            }
            this.zzg = context2;
            try {
                this.zzf = Wrappers.packageManager(context2).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            }
            try {
                Context context3 = this.zzg;
                Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context3);
                Context context4 = remoteContext;
                if (remoteContext == null) {
                    context4 = remoteContext;
                    if (context3 != null) {
                        Context applicationContext = context3.getApplicationContext();
                        context4 = context3;
                        if (applicationContext != null) {
                            context4 = applicationContext;
                        }
                    }
                }
                if (context4 == null) {
                    return;
                }
                com.google.android.gms.ads.internal.client.zzba.zzb();
                SharedPreferences zza = zzbfw.zza(context4);
                this.zze = zza;
                if (zza != null) {
                    zza.registerOnSharedPreferenceChangeListener(this);
                }
                zzbis.zzc(new zzbfz(this, this.zze));
                zzd(this.zze);
                this.zzd = true;
            } finally {
                this.zza = false;
                this.zzc.open();
            }
        }
    }
}
