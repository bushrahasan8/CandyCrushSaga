package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzkl.class */
public final class zzkl implements Application.ActivityLifecycleCallbacks {
    private final zziy zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkl(zziy zziyVar) {
        this.zza = zziyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0119 A[Catch: RuntimeException -> 0x002c, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x002c, blocks: (B:3:0x0007, B:5:0x0016, B:9:0x0033, B:11:0x0039, B:15:0x0052, B:20:0x0119, B:22:0x0128, B:26:0x013f, B:28:0x0145, B:32:0x015e, B:34:0x016c, B:38:0x0182, B:40:0x018c, B:42:0x01a6, B:46:0x01be, B:50:0x01c5, B:54:0x01ed, B:56:0x021b, B:58:0x0209, B:59:0x0228, B:61:0x0232, B:63:0x023c, B:65:0x0246, B:67:0x0250, B:69:0x025a, B:72:0x0266, B:74:0x026c, B:77:0x027b, B:79:0x0064, B:83:0x0073, B:86:0x007f, B:88:0x0087, B:90:0x0091, B:92:0x009b, B:94:0x00a5, B:96:0x00af, B:100:0x00be, B:103:0x00ca, B:104:0x00d8, B:107:0x0108), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c5 A[Catch: RuntimeException -> 0x002c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x002c, blocks: (B:3:0x0007, B:5:0x0016, B:9:0x0033, B:11:0x0039, B:15:0x0052, B:20:0x0119, B:22:0x0128, B:26:0x013f, B:28:0x0145, B:32:0x015e, B:34:0x016c, B:38:0x0182, B:40:0x018c, B:42:0x01a6, B:46:0x01be, B:50:0x01c5, B:54:0x01ed, B:56:0x021b, B:58:0x0209, B:59:0x0228, B:61:0x0232, B:63:0x023c, B:65:0x0246, B:67:0x0250, B:69:0x025a, B:72:0x0266, B:74:0x026c, B:77:0x027b, B:79:0x0064, B:83:0x0073, B:86:0x007f, B:88:0x0087, B:90:0x0091, B:92:0x009b, B:94:0x00a5, B:96:0x00af, B:100:0x00be, B:103:0x00ca, B:104:0x00d8, B:107:0x0108), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void zza(com.google.android.gms.measurement.internal.zzkl r9, boolean r10, android.net.Uri r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkl.zza(com.google.android.gms.measurement.internal.zzkl, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.zza.zzj().zzp().zza("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            Uri data = intent.getData();
            if (data == null || !data.isHierarchical()) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string)) {
                        data = Uri.parse(string);
                    }
                }
                data = null;
            }
            if (data != null && data.isHierarchical()) {
                this.zza.zzq();
                this.zza.zzl().zzb(new zzkk(this, bundle == null, data, zznt.zza(intent) ? "gs" : "auto", data.getQueryParameter("referrer")));
            }
        } catch (RuntimeException e) {
            this.zza.zzj().zzg().zza("Throwable caught in onActivityCreated", e);
        } finally {
            this.zza.zzn().zza(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzn().zza(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.zza.zzn().zzb(activity);
        zzmi zzp = this.zza.zzp();
        zzp.zzl().zzb(new zzmk(zzp, zzp.zzb().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzmi zzp = this.zza.zzp();
        zzp.zzl().zzb(new zzml(zzp, zzp.zzb().elapsedRealtime()));
        this.zza.zzn().zzc(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzn().zzb(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
