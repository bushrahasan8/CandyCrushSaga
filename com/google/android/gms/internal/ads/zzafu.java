package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: zzafu.class */
public final class zzafu {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzafu() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AdRequest.MAX_CONTENT_URL_LENGTH);
        this.zza = byteArrayOutputStream;
        this.zzb = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzaft zzaftVar) {
        this.zza.reset();
        try {
            zzb(this.zzb, zzaftVar.zza);
            String str = zzaftVar.zzb;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            zzb(this.zzb, str2);
            this.zzb.writeLong(zzaftVar.zzc);
            this.zzb.writeLong(zzaftVar.zzd);
            this.zzb.write(zzaftVar.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
