package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: zzbwa.class */
public final class zzbwa extends NativeAd.Image {
    private final zzbjm zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:2|3)|(4:(13:5|6|7|8|9|10|11|12|13|14|16|17|18)|16|17|18)|33|6|7|8|9|10|11|12|13|14|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:1|2|3|(4:(13:5|6|7|8|9|10|11|12|13|14|16|17|18)|16|17|18)|33|6|7|8|9|10|11|12|13|14|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:1|2|3|(13:5|6|7|8|9|10|11|12|13|14|16|17|18)|33|6|7|8|9|10|11|12|13|14|16|17|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zzh("", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zzh("", r5);
        r6 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zzh("", r5);
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbwa(com.google.android.gms.internal.ads.zzbjm r5) {
        /*
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.zza = r1
            r0 = 0
            r8 = r0
            r0 = r5
            com.google.android.gms.dynamic.IObjectWrapper r0 = r0.zzf()     // Catch: android.os.RemoteException -> L22
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L26
            r0 = r5
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r0)     // Catch: android.os.RemoteException -> L22
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0     // Catch: android.os.RemoteException -> L22
            r5 = r0
            goto L34
        L22:
            r5 = move-exception
            goto L2b
        L26:
            r0 = 0
            r5 = r0
            goto L34
        L2b:
            java.lang.String r0 = ""
            r1 = r5
            com.google.android.gms.internal.ads.zzcec.zzh(r0, r1)
            goto L26
        L34:
            r0 = r4
            r1 = r5
            r0.zzb = r1
            r0 = r4
            com.google.android.gms.internal.ads.zzbjm r0 = r0.zza     // Catch: android.os.RemoteException -> L46
            android.net.Uri r0 = r0.zze()     // Catch: android.os.RemoteException -> L46
            r5 = r0
            goto L50
        L46:
            r5 = move-exception
            java.lang.String r0 = ""
            r1 = r5
            com.google.android.gms.internal.ads.zzcec.zzh(r0, r1)
            r0 = r8
            r5 = r0
        L50:
            r0 = r4
            r1 = r5
            r0.zzc = r1
            r0 = r4
            com.google.android.gms.internal.ads.zzbjm r0 = r0.zza     // Catch: android.os.RemoteException -> L62
            double r0 = r0.zzb()     // Catch: android.os.RemoteException -> L62
            r6 = r0
            goto L6b
        L62:
            r5 = move-exception
            java.lang.String r0 = ""
            r1 = r5
            com.google.android.gms.internal.ads.zzcec.zzh(r0, r1)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r6 = r0
        L6b:
            r0 = r4
            r1 = r6
            r0.zzd = r1
            r0 = r4
            com.google.android.gms.internal.ads.zzbjm r0 = r0.zza     // Catch: android.os.RemoteException -> L7d
            int r0 = r0.zzd()     // Catch: android.os.RemoteException -> L7d
            goto L84
        L7d:
            r5 = move-exception
            java.lang.String r0 = ""
            r1 = r5
            com.google.android.gms.internal.ads.zzcec.zzh(r0, r1)
        L84:
            r0 = r4
            com.google.android.gms.internal.ads.zzbjm r0 = r0.zza     // Catch: android.os.RemoteException -> L8f
            int r0 = r0.zzc()     // Catch: android.os.RemoteException -> L8f
            return
        L8f:
            r5 = move-exception
            java.lang.String r0 = ""
            r1 = r5
            com.google.android.gms.internal.ads.zzcec.zzh(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwa.<init>(com.google.android.gms.internal.ads.zzbjm):void");
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Drawable getDrawable() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Uri getUri() {
        return this.zzc;
    }
}
