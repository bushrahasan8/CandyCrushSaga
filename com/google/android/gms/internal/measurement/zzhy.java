package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhy;
import com.google.android.gms.internal.measurement.zzhz;
import java.io.IOException;

/* loaded from: zzhy.class */
public abstract class zzhy<MessageType extends zzhz<MessageType, BuilderType>, BuilderType extends zzhy<MessageType, BuilderType>> implements zzlf {
    private final String zza(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    @Override // 
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzb(zziu zziuVar, zzjg zzjgVar) throws IOException;

    public BuilderType zza(byte[] bArr, int i, int i2) throws zzkb {
        try {
            zziu zza = zziu.zza(bArr, 0, i2, false);
            zzb(zza, zzjg.zza);
            zza.zzc(0);
            return this;
        } catch (zzkb e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    public BuilderType zza(byte[] bArr, int i, int i2, zzjg zzjgVar) throws zzkb {
        try {
            zziu zza = zziu.zza(bArr, 0, i2, false);
            zzb(zza, zzjgVar);
            zza.zzc(0);
            return this;
        } catch (zzkb e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlf
    public final /* synthetic */ zzlf zza(byte[] bArr) throws zzkb {
        return zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzlf
    public final /* synthetic */ zzlf zza(byte[] bArr, zzjg zzjgVar) throws zzkb {
        return zza(bArr, 0, bArr.length, zzjgVar);
    }

    @Override // 
    /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();
}
