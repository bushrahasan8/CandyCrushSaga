package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: zzazt.class */
final class zzazt {
    ByteArrayOutputStream zza = new ByteArrayOutputStream(4096);
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    public final String toString() {
        String str;
        try {
            this.zzb.close();
        } catch (IOException e) {
            zzcec.zzh("HashManager: Unable to convert to Base64.", e);
        }
        try {
            try {
                this.zza.close();
                str = this.zza.toString();
            } catch (IOException e2) {
                zzcec.zzh("HashManager: Unable to convert to Base64.", e2);
                str = "";
            }
            this.zza = null;
            this.zzb = null;
            return str;
        } catch (Throwable th) {
            this.zza = null;
            this.zzb = null;
            throw th;
        }
    }
}
