package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* loaded from: zzhw.class */
public final class zzhw extends zzgq {
    private final Context zza;
    private zzhb zzb;
    private AssetFileDescriptor zzc;
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzhw(Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r0.matches("\\d+") != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.res.AssetFileDescriptor zzk(android.content.Context r6, com.google.android.gms.internal.ads.zzhb r7) throws com.google.android.gms.internal.ads.zzhv {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhw.zzk(android.content.Context, com.google.android.gms.internal.ads.zzhb):android.content.res.AssetFileDescriptor");
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i, int i2) throws zzhv {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j == 0) {
            return -1;
        }
        int i3 = i2;
        if (j != -1) {
            try {
                i3 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzhv(null, e, 2000);
            }
        }
        InputStream inputStream = this.zzd;
        int i4 = zzfy.zza;
        int read = inputStream.read(bArr, i, i3);
        if (read == -1) {
            if (this.zze == -1) {
                return -1;
            }
            throw new zzhv("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.zze;
        if (j2 != -1) {
            this.zze = j2 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final long zzb(zzhb zzhbVar) throws zzhv {
        long j;
        this.zzb = zzhbVar;
        zzi(zzhbVar);
        AssetFileDescriptor zzk = zzk(this.zza, zzhbVar);
        this.zzc = zzk;
        long length = zzk.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        try {
            if (length != -1) {
                try {
                    if (zzhbVar.zzf > length) {
                        throw new zzhv(null, null, 2008);
                    }
                } catch (IOException e) {
                    throw new zzhv(null, e, 2000);
                }
            }
            long startOffset = this.zzc.getStartOffset();
            long skip = fileInputStream.skip(zzhbVar.zzf + startOffset) - startOffset;
            if (skip != zzhbVar.zzf) {
                throw new zzhv(null, null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.zze = -1L;
                    j = -1;
                } else {
                    j = channel.size() - channel.position();
                    this.zze = j;
                    if (j < 0) {
                        throw new zzhv(null, null, 2008);
                    }
                }
            } else {
                j = length - skip;
                this.zze = j;
                if (j < 0) {
                    throw new zzgx(2008);
                }
            }
            long j2 = zzhbVar.zzg;
            if (j2 != -1) {
                this.zze = j == -1 ? j2 : Math.min(j, j2);
            }
            this.zzf = true;
            zzj(zzhbVar);
            long j3 = zzhbVar.zzg;
            return j3 != -1 ? j3 : this.zze;
        } catch (zzhv e2) {
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final Uri zzc() {
        zzhb zzhbVar = this.zzb;
        if (zzhbVar != null) {
            return zzhbVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzd() throws zzhv {
        this.zzb = null;
        try {
            try {
                try {
                    InputStream inputStream = this.zzd;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                    } catch (IOException e) {
                        throw new zzhv(null, e, 2000);
                    }
                } catch (IOException e2) {
                    throw new zzhv(null, e2, 2000);
                }
            } catch (Throwable th) {
                this.zzd = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.zzc = null;
                    if (this.zzf) {
                        this.zzf = false;
                        zzh();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new zzhv(null, e3, 2000);
                }
            }
        } catch (Throwable th2) {
            this.zzc = null;
            if (this.zzf) {
                this.zzf = false;
                zzh();
            }
            throw th2;
        }
    }
}
