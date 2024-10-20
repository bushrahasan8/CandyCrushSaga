package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd;

/* loaded from: zzbjn.class */
public final class zzbjn extends NativeAd.Image {
    private final zzbjm zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:2|3)|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:1|2|3|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a0, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zzh("", r5);
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zzh("", r5);
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zzh("", r5);
        r6 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0047, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zzh("", r5);
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbjn(com.google.android.gms.internal.ads.zzbjm r5) {
        /*
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.zza = r1
            r0 = 0
            r10 = r0
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
            r0 = r10
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
            r0 = -1
            r9 = r0
            r0 = r4
            com.google.android.gms.internal.ads.zzbjm r0 = r0.zza     // Catch: android.os.RemoteException -> L81
            int r0 = r0.zzd()     // Catch: android.os.RemoteException -> L81
            r8 = r0
            goto L8b
        L81:
            r5 = move-exception
            java.lang.String r0 = ""
            r1 = r5
            com.google.android.gms.internal.ads.zzcec.zzh(r0, r1)
            r0 = -1
            r8 = r0
        L8b:
            r0 = r4
            r1 = r8
            r0.zze = r1
            r0 = r4
            com.google.android.gms.internal.ads.zzbjm r0 = r0.zza     // Catch: android.os.RemoteException -> L9f
            int r0 = r0.zzc()     // Catch: android.os.RemoteException -> L9f
            r8 = r0
            goto Laa
        L9f:
            r5 = move-exception
            java.lang.String r0 = ""
            r1 = r5
            com.google.android.gms.internal.ads.zzcec.zzh(r0, r1)
            r0 = r9
            r8 = r0
        Laa:
            r0 = r4
            r1 = r8
            r0.zzf = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjn.<init>(com.google.android.gms.internal.ads.zzbjm):void");
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zzb() {
        return this.zze;
    }
}
