package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.t2;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: zzfw.class */
public final class zzfw {
    private static final AtomicReference<String[]> zza = new AtomicReference<>();
    private static final AtomicReference<String[]> zzb = new AtomicReference<>();
    private static final AtomicReference<String[]> zzc = new AtomicReference<>();
    private final zzfz zzd;

    public zzfw(zzfz zzfzVar) {
        this.zzd = zzfzVar;
    }

    private static String zza(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    String[] strArr4 = strArr3;
                    if (strArr3 == null) {
                        strArr4 = new String[strArr2.length];
                        atomicReference.set(strArr4);
                    }
                    if (strArr4[i] == null) {
                        strArr4[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str2 = strArr4[i];
                }
                return str2;
            }
        }
        return str;
    }

    private final String zza(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(t2.i.d);
        for (Object obj : objArr) {
            String zza2 = obj instanceof Bundle ? zza((Bundle) obj) : String.valueOf(obj);
            if (zza2 != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(zza2);
            }
        }
        sb.append(t2.i.e);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zza(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(zzb(str));
            sb.append(t2.i.b);
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? zza(new Object[]{obj}) : obj instanceof Object[] ? zza((Object[]) obj) : obj instanceof ArrayList ? zza(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zza(zzbf zzbfVar) {
        if (zzbfVar == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return zzbfVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzbfVar.zzc);
        sb.append(",name=");
        sb.append(zza(zzbfVar.zza));
        sb.append(",params=");
        zzba zzbaVar = zzbfVar.zzb;
        sb.append(zzbaVar == null ? null : !this.zzd.zza() ? zzbaVar.toString() : zza(zzbaVar.zzb()));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zza(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zza(str, zzit.zzc, zzit.zza, zza);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzb(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zza(str, zzis.zzb, zzis.zza, zzb);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzc(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return zza(str, zziv.zzb, zziv.zza, zzc);
        }
        return "experiment_id(" + str + ")";
    }
}
