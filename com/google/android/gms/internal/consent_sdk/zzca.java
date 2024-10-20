package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.ironsource.t2;
import com.king.amp.sa.AbmMediaPlayer;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzca.class */
public final class zzca implements zzd {
    private final Application zza;
    private final zzbw zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zze zze;
    private final zzan zzf;
    private final zzbb zzg;
    private final zzap zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzca(Application application, zzbw zzbwVar, Handler handler, Executor executor, zze zzeVar, zzan zzanVar, zzbb zzbbVar, zzap zzapVar) {
        this.zza = application;
        this.zzb = zzbwVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzeVar;
        this.zzf = zzanVar;
        this.zzg = zzbbVar;
        this.zzh = zzapVar;
    }

    private final void zzg(JSONObject jSONObject) {
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
        }
        Uri parse = Uri.parse(optString);
        if (parse.getScheme() == null) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(optString)));
        }
        try {
            this.zzb.startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (ActivityNotFoundException e) {
            Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(optString)), e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor zza() {
        final Handler handler = this.zzc;
        Objects.requireNonNull(handler);
        return new Executor(handler) { // from class: com.google.android.gms.internal.consent_sdk.zzby
            public final Handler zza;

            {
                this.zza = handler;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.zza.post(runnable);
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final boolean zzb(String str, JSONObject jSONObject) {
        boolean z;
        boolean z2;
        switch (str.hashCode()) {
            case -1370505102:
                if (str.equals("load_complete")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case -278739366:
                if (str.equals("configure_app_assets")) {
                    z = 3;
                    break;
                }
                z = -1;
                break;
            case 150940456:
                if (str.equals("browser")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case 1671672458:
                if (str.equals(AbmMediaPlayer.DISMISS)) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        if (!z) {
            this.zzg.zze();
            return true;
        }
        if (!z) {
            if (z == 2) {
                zzg(jSONObject);
                return true;
            }
            if (z != 3) {
                return false;
            }
            zzc();
            return true;
        }
        String optString = jSONObject.optString("status");
        switch (optString.hashCode()) {
            case -954325659:
                z2 = -1;
                if (optString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                    z2 = 3;
                    break;
                }
                break;
            case -258041904:
                z2 = -1;
                if (optString.equals("personalized")) {
                    z2 = false;
                    break;
                }
                break;
            case 429411856:
                z2 = -1;
                if (optString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                    z2 = 4;
                    break;
                }
                break;
            case 467888915:
                z2 = -1;
                if (optString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                    z2 = true;
                    break;
                }
                break;
            case 1666911234:
                z2 = -1;
                if (optString.equals("non_personalized")) {
                    z2 = 2;
                    break;
                }
                break;
            default:
                z2 = -1;
                break;
        }
        if (!z2 || z2 || z2 == 2 || z2 == 3 || z2 == 4) {
            this.zzg.zzc(3);
            return true;
        }
        this.zzg.zzd(new zzg(1, "We are getting something wrong with the webview."));
        return true;
    }

    public final void zzc() {
        this.zzd.execute(new Runnable(this) { // from class: com.google.android.gms.internal.consent_sdk.zzbz
            public final zzca zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        String concat;
        JSONObject jSONObject = new JSONObject();
        Application application = this.zza;
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                concat = null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                concat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", concat);
            jSONObject.put("stored_infos_map", this.zzh.zzc());
        } catch (JSONException e) {
        }
        this.zzg.zza().zzd("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        this.zze.zzb(parse.getQueryParameter(t2.h.h), parse.getQueryParameter("args"), this, this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(int i, String str, String str2) {
        this.zzg.zzf(new zzg(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i), str2, str)));
    }
}
