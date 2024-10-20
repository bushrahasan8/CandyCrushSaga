package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: zzcih.class */
final class zzcih extends zzgq implements zzht {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzc = new AtomicReference();
    private final SSLSocketFactory zzd;
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzhs zzh;
    private zzhb zzi;
    private HttpURLConnection zzj;
    private InputStream zzk;
    private boolean zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private final Set zzs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcih(String str, zzhy zzhyVar, int i, int i2, int i3) {
        super(true);
        this.zzd = new zzcig(this);
        this.zzs = new HashSet();
        zzek.zzc(str);
        this.zzg = str;
        this.zzh = new zzhs();
        this.zze = i;
        this.zzf = i2;
        this.zzr = i3;
        if (zzhyVar != null) {
            zzf(zzhyVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzcec.zzh("Unexpected error while disconnecting", e);
            }
            this.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i, int i2) throws zzhp {
        int read;
        try {
            if (this.zzp != this.zzn) {
                byte[] bArr2 = (byte[]) zzc.getAndSet(null);
                byte[] bArr3 = bArr2;
                if (bArr2 == null) {
                    bArr3 = new byte[4096];
                }
                while (true) {
                    long j = this.zzp;
                    long j2 = this.zzn;
                    if (j == j2) {
                        zzc.set(bArr3);
                        break;
                    }
                    int read2 = this.zzk.read(bArr3, 0, (int) Math.min(j2 - j, bArr3.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read2 == -1) {
                        throw new EOFException();
                    }
                    this.zzp += read2;
                    zzg(read2);
                }
            }
            if (i2 == 0) {
                read = 0;
            } else {
                long j3 = this.zzo;
                int i3 = i2;
                if (j3 != -1) {
                    long j4 = j3 - this.zzq;
                    if (j4 != 0) {
                        i3 = (int) Math.min(i2, j4);
                    }
                    read = -1;
                }
                read = this.zzk.read(bArr, i, i3);
                if (read != -1) {
                    this.zzq += read;
                    zzg(read);
                } else {
                    if (this.zzo != -1) {
                        throw new EOFException();
                    }
                    read = -1;
                }
            }
            return read;
        } catch (IOException e) {
            throw new zzhp(e, this.zzi, 2000, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d1, code lost:
    
        if (r0 != (-1)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01da, code lost:
    
        if (r0 == 0) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x033e  */
    @Override // com.google.android.gms.internal.ads.zzgw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzhb r10) throws com.google.android.gms.internal.ads.zzhp {
        /*
            Method dump skipped, instructions count: 1190
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcih.zzb(com.google.android.gms.internal.ads.zzhb):long");
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzd() throws zzhp {
        try {
            InputStream inputStream = this.zzk;
            if (inputStream != null) {
                int i = zzfy.zza;
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzhp(e, this.zzi, 2000, 3);
                }
            }
        } finally {
            this.zzk = null;
            zzn();
            if (this.zzl) {
                this.zzl = false;
                zzh();
            }
            this.zzs.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq, com.google.android.gms.internal.ads.zzgw
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzm(int i) {
        this.zzr = i;
        for (Socket socket : this.zzs) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzr);
                } catch (SocketException e) {
                    zzcec.zzk("Failed to update receive buffer size.", e);
                }
            }
        }
    }
}
