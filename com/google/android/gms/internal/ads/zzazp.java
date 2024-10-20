package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.common.util.PlatformVersion;
import com.ironsource.t2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: zzazp.class */
public final class zzazp extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzazg zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;
    private final boolean zzp;

    public zzazp() {
        zzazg zzazgVar = new zzazg();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzazgVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbhs.zzd.zze()).intValue();
        this.zzg = ((Long) zzbhs.zza.zze()).intValue();
        this.zzh = ((Long) zzbhs.zze.zze()).intValue();
        this.zzi = ((Long) zzbhs.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzS)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzT)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzU)).intValue();
        this.zze = ((Long) zzbhs.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzW);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzX)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzY)).booleanValue();
        this.zzp = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzZ)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r0.importance != 100) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r0.inKeyguardRestrictedInputMode() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r0 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        if (r0.isScreenOn() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        r0 = com.google.android.gms.ads.internal.zzt.zzb().zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zze("ContentFetchThread: no activity. Sleeping.");
        zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ab, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b4, code lost:
    
        if (r0.getWindow() == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c1, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c4, code lost:
    
        r6 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d5, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzo().zzw(r6, "ContentFetchTask.extractContent");
        com.google.android.gms.internal.ads.zzcec.zze("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e6, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00a7, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0136, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zzh("Error in ContentFetchTask", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00a3, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0122, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zzh("Error in ContentFetchTask", r6);
        com.google.android.gms.ads.internal.zzt.zzo().zzw(r6, "ContentFetchTask.run");
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0144 A[EXC_TOP_SPLITTER, LOOP:2: B:33:0x0144->B:40:0x0144, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazp.run():void");
    }

    public final zzazf zza() {
        return this.zzd.zza(this.zzp);
    }

    final zzazo zzb(View view, zzazf zzazfVar) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    zzazfVar.zzk(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new zzazo(this, 1, 0);
                }
            } else if ((view instanceof WebView) && !(view instanceof zzcjk)) {
                WebView webView = (WebView) view;
                if (PlatformVersion.isAtLeastKitKat()) {
                    zzazfVar.zzh();
                    webView.post(new zzazn(this, zzazfVar, webView, globalVisibleRect));
                    return new zzazo(this, 0, 1);
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    zzazo zzb = zzb(viewGroup.getChildAt(i3), zzazfVar);
                    i += zzb.zza;
                    i2 += zzb.zzb;
                }
                return new zzazo(this, i, i2);
            }
        }
        return new zzazo(this, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if (r0 == 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc(android.view.View r11) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazp.zzc(android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(zzazf zzazfVar, WebView webView, String str, boolean z) {
        zzazfVar.zzg();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString(t2.h.K0);
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzazfVar.zzl(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzazfVar.zzl(webView.getTitle() + "\n" + optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzazfVar.zzo()) {
                this.zzd.zzc(zzazfVar);
            }
        } catch (JSONException e) {
            zzcec.zze("Json string may be malformed.");
        } catch (Throwable th) {
            zzcec.zzf("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzw(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            if (this.zza) {
                zzcec.zze("Content hash thread already started, quitting...");
            } else {
                this.zza = true;
                start();
            }
        }
    }

    public final void zzf() {
        synchronized (this.zzc) {
            this.zzb = true;
            zzcec.zze("ContentFetchThread: paused, pause = true");
        }
    }

    public final void zzg() {
        synchronized (this.zzc) {
            this.zzb = false;
            this.zzc.notifyAll();
            zzcec.zze("ContentFetchThread: wakeup");
        }
    }

    public final boolean zzh() {
        return this.zzb;
    }
}
