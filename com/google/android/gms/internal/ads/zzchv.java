package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzchv.class */
public final class zzchv implements Runnable {
    final String zza;
    final String zzb;
    final String zzc;
    final String zzd;
    final zzchw zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchv(zzchw zzchwVar, String str, String str2, String str3, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = zzchwVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            hashMap.put("cachedSrc", this.zzb);
        }
        String str = this.zzc;
        switch (str.hashCode()) {
            case -1947652542:
                if (str.equals("interrupted")) {
                    z = 3;
                    break;
                }
                z = -1;
                break;
            case -1396664534:
                if (str.equals("badUrl")) {
                    z = 8;
                    break;
                }
                z = -1;
                break;
            case -1347010958:
                if (str.equals("inProgress")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case -918817863:
                if (str.equals("downloadTimeout")) {
                    z = 9;
                    break;
                }
                z = -1;
                break;
            case -659376217:
                if (str.equals("contentLengthMissing")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case -642208130:
                if (str.equals("playerFailed")) {
                    z = 5;
                    break;
                }
                z = -1;
                break;
            case -354048396:
                if (str.equals("sizeExceeded")) {
                    z = 11;
                    break;
                }
                z = -1;
                break;
            case -32082395:
                if (str.equals("externalAbort")) {
                    z = 10;
                    break;
                }
                z = -1;
                break;
            case 3387234:
                if (str.equals("noop")) {
                    z = 4;
                    break;
                }
                z = -1;
                break;
            case 96784904:
                if (str.equals(MRAIDPresenter.ERROR)) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case 580119100:
                if (str.equals("expireFailed")) {
                    z = 6;
                    break;
                }
                z = -1;
                break;
            case 725497484:
                if (str.equals("noCacheDir")) {
                    z = 7;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        Object obj = "internal";
        switch (z) {
            case false:
            case true:
            case true:
            case true:
            case true:
            case true:
                break;
            case true:
            case true:
                obj = "io";
                break;
            case true:
            case true:
                obj = "network";
                break;
            case true:
            case true:
                obj = "policy";
                break;
            default:
                obj = "internal";
                break;
        }
        hashMap.put("type", obj);
        hashMap.put("reason", this.zzc);
        if (!TextUtils.isEmpty(this.zzd)) {
            hashMap.put("message", this.zzd);
        }
        zzchw.zze(this.zze, "onPrecacheEvent", hashMap);
    }
}
