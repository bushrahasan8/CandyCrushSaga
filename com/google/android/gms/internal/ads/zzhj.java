package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* loaded from: zzhj.class */
public final class zzhj extends zzgq implements zzht {
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzhs zzf;
    private final zzhs zzg;
    private zzhb zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;

    @Deprecated
    public zzhj() {
        this(null, 8000, 8000, false, null, null, false);
    }

    private zzhj(String str, int i, int i2, boolean z, zzhs zzhsVar, zzfxf zzfxfVar, boolean z2) {
        super(true);
        this.zze = str;
        this.zzc = i;
        this.zzd = i2;
        this.zzb = z;
        this.zzf = zzhsVar;
        this.zzg = new zzhs();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.net.HttpURLConnection zzk(java.net.URL r7, int r8, byte[] r9, long r10, long r12, boolean r14, boolean r15, java.util.Map r16) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhj.zzk(java.net.URL, int, byte[], long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    private final URL zzl(URL url, String str, zzhb zzhbVar) throws zzhp {
        if (str == null) {
            throw new zzhp("Null location redirect", zzhbVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new zzhp("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzhbVar, 2001, 1);
            }
            if (this.zzb || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new zzhp("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", zzhbVar, 2001, 1);
        } catch (MalformedURLException e) {
            throw new zzhp(e, zzhbVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzff.zzd("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i, int i2) throws zzhp {
        int read;
        if (i2 == 0) {
            read = 0;
        } else {
            try {
                long j = this.zzm;
                int i3 = i2;
                if (j != -1) {
                    long j2 = j - this.zzn;
                    if (j2 != 0) {
                        i3 = (int) Math.min(i2, j2);
                    }
                    read = -1;
                }
                InputStream inputStream = this.zzj;
                int i4 = zzfy.zza;
                read = inputStream.read(bArr, i, i3);
                if (read != -1) {
                    this.zzn += read;
                    zzg(read);
                }
                read = -1;
            } catch (IOException e) {
                zzhb zzhbVar = this.zzh;
                int i5 = zzfy.zza;
                throw zzhp.zza(e, zzhbVar, 2);
            }
        }
        return read;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x010d, code lost:
    
        if (r0 == 0) goto L36;
     */
    @Override // com.google.android.gms.internal.ads.zzgw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzhb r13) throws com.google.android.gms.internal.ads.zzhp {
        /*
            Method dump skipped, instructions count: 921
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhj.zzb(com.google.android.gms.internal.ads.zzhb):long");
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzd() throws zzhp {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                if (this.zzi != null) {
                    int i = zzfy.zza;
                }
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzhb zzhbVar = this.zzh;
                    int i2 = zzfy.zza;
                    throw new zzhp(e, zzhbVar, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzm();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq, com.google.android.gms.internal.ads.zzgw
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        return httpURLConnection == null ? zzgad.zzd() : new zzhh(httpURLConnection.getHeaderFields());
    }
}
