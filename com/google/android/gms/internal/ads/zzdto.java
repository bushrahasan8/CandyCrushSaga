package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.widget.PopupWindow;

/* loaded from: zzdto.class */
public final class zzdto {
    private Context zza;
    private PopupWindow zzb;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(android.content.Context r8, android.view.View r9) {
        /*
            r7 = this;
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKat()
            if (r0 == 0) goto L97
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()
            if (r0 == 0) goto Lf
            goto L97
        Lf:
            r0 = r8
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L21
            r0 = r8
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            r10 = r0
            goto L23
        L21:
            r0 = 0
            r10 = r0
        L23:
            r0 = r10
            if (r0 == 0) goto L2e
            r0 = r10
            android.view.View r0 = r0.getDecorView()
            if (r0 != 0) goto L33
        L2e:
            r0 = 0
            r9 = r0
            goto L87
        L33:
            r0 = r8
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isDestroyed()
            if (r0 == 0) goto L40
            goto L2e
        L40:
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = r1
            r3 = -1
            r4 = -1
            r2.<init>(r3, r4)
            r0.setLayoutParams(r1)
            r0 = r11
            r1 = r9
            r2 = -1
            r3 = -1
            r0.addView(r1, r2, r3)
            android.widget.PopupWindow r0 = new android.widget.PopupWindow
            r1 = r0
            r2 = r11
            r3 = 1
            r4 = 1
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r9 = r0
            r0 = r9
            r1 = 1
            r0.setOutsideTouchable(r1)
            r0 = r9
            r1 = 0
            r0.setClippingEnabled(r1)
            java.lang.String r0 = "Displaying the 1x1 popup off the screen."
            com.google.android.gms.internal.ads.zzcec.zze(r0)
            r0 = r9
            r1 = r10
            android.view.View r1 = r1.getDecorView()     // Catch: java.lang.Exception -> L98
            r2 = 0
            r3 = -1
            r4 = -1
            r0.showAtLocation(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L98
        L87:
            r0 = r7
            r1 = r9
            r0.zzb = r1
            r0 = r9
            if (r0 != 0) goto L92
            r0 = 0
            r8 = r0
        L92:
            r0 = r7
            r1 = r8
            r0.zza = r1
        L97:
            return
        L98:
            r9 = move-exception
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdto.zza(android.content.Context, android.view.View):void");
    }

    public final void zzb() {
        Context context = this.zza;
        if (context == null || this.zzb == null) {
            return;
        }
        if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && this.zzb.isShowing()) {
            this.zzb.dismiss();
        }
        this.zza = null;
        this.zzb = null;
    }
}
