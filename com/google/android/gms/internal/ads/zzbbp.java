package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: zzbbp.class */
public final class zzbbp {
    private final zzbbv zza;
    private final zzbde zzb;
    private final boolean zzc;

    private zzbbp() {
        this.zzb = zzbdf.zzd();
        this.zzc = false;
        this.zza = new zzbbv();
    }

    public zzbbp(zzbbv zzbbvVar) {
        this.zzb = zzbdf.zzd();
        this.zza = zzbbvVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzeO)).booleanValue();
    }

    public static zzbbp zza() {
        return new zzbbp();
    }

    private final String zzd(int i) {
        String format;
        synchronized (this) {
            format = String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.zzb.zzk(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime()), Integer.valueOf(i - 1), Base64.encodeToString(((zzbdf) this.zzb.zzal()).zzax(), 3));
        }
        return format;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.FileOutputStream] */
    private final void zze(int i) {
        synchronized (this) {
            FileOutputStream externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == 0) {
                return;
            }
            try {
                try {
                    externalStorageDirectory = new FileOutputStream(new File((File) externalStorageDirectory, "clearcut_events.txt"), true);
                    try {
                        externalStorageDirectory.write(zzd(i).getBytes());
                        try {
                            externalStorageDirectory.close();
                        } catch (IOException e) {
                            com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                        }
                    } catch (IOException e2) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                        try {
                            externalStorageDirectory.close();
                        } catch (IOException e3) {
                            com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                        }
                    }
                } catch (Throwable th) {
                    try {
                        externalStorageDirectory.close();
                    } catch (IOException e4) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                    throw th;
                }
            } catch (FileNotFoundException e5) {
                com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
            }
        }
    }

    private final void zzf(int i) {
        synchronized (this) {
            zzbde zzbdeVar = this.zzb;
            zzbdeVar.zzd();
            zzbdeVar.zzc(com.google.android.gms.ads.internal.util.zzt.zzd());
            zzbbu zzbbuVar = new zzbbu(this.zza, ((zzbdf) this.zzb.zzal()).zzax(), null);
            int i2 = i - 1;
            zzbbuVar.zza(i2);
            zzbbuVar.zzc();
            com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
        }
    }

    public final void zzb(zzbbo zzbboVar) {
        synchronized (this) {
            if (this.zzc) {
                try {
                    zzbboVar.zza(this.zzb);
                } catch (NullPointerException e) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "AdMobClearcutLogger.modify");
                }
            }
        }
    }

    public final void zzc(int i) {
        synchronized (this) {
            if (this.zzc) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzeP)).booleanValue()) {
                    zze(i);
                } else {
                    zzf(i);
                }
            }
        }
    }
}
