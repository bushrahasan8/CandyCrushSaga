package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzcn;
import com.google.android.gms.internal.play_billing.zzcs;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: zzcs.class */
public abstract class zzcs<MessageType extends zzcs<MessageType, BuilderType>, BuilderType extends zzcn<MessageType, BuilderType>> extends zzay<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzfg zzc = zzfg.zzc();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzcs zzj(Class cls) {
        Map map = zzb;
        zzcs zzcsVar = (zzcs) map.get(cls);
        zzcs zzcsVar2 = zzcsVar;
        if (zzcsVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzcsVar2 = (zzcs) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        zzcs zzcsVar3 = zzcsVar2;
        if (zzcsVar2 == null) {
            zzcsVar3 = (zzcs) ((zzcs) zzfp.zze(cls)).zzx(6, null, null);
            if (zzcsVar3 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzcsVar3);
        }
        return zzcsVar3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzcs zzm(zzcs zzcsVar, byte[] bArr, zzcd zzcdVar) throws zzdc {
        zzcs zzz = zzz(zzcsVar, bArr, 0, bArr.length, zzcdVar);
        if (zzz == null || zzz.zzk()) {
            return zzz;
        }
        zzdc zza = new zzfe(zzz).zza();
        zza.zzf(zzz);
        throw zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzcx zzn() {
        return zzct.zzf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzcz zzo() {
        return zzem.zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzp(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zzq(zzec zzecVar, String str, Object[] objArr) {
        return new zzen(zzecVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void zzt(Class cls, zzcs zzcsVar) {
        zzcsVar.zzs();
        zzb.put(cls, zzcsVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final boolean zzv(zzcs zzcsVar, boolean z) {
        byte byteValue = ((Byte) zzcsVar.zzx(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzel.zza().zzb(zzcsVar.getClass()).zzk(zzcsVar);
        if (z) {
            zzcsVar.zzx(2, true != zzk ? null : zzcsVar, null);
        }
        return zzk;
    }

    private final int zzy(zzeo zzeoVar) {
        return zzel.zza().zzb(getClass()).zza(this);
    }

    private static zzcs zzz(zzcs zzcsVar, byte[] bArr, int i, int i2, zzcd zzcdVar) throws zzdc {
        if (i2 == 0) {
            return zzcsVar;
        }
        zzcs zzl = zzcsVar.zzl();
        try {
            zzeo zzb2 = zzel.zza().zzb(zzl.getClass());
            zzb2.zzh(zzl, bArr, 0, i2, new zzbc(zzcdVar));
            zzb2.zzf(zzl);
            return zzl;
        } catch (zzdc e) {
            e.zzf(zzl);
            throw e;
        } catch (zzfe e2) {
            zzdc zza = e2.zza();
            zza.zzf(zzl);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzdc) {
                throw ((zzdc) e3.getCause());
            }
            zzdc zzdcVar = new zzdc(e3);
            zzdcVar.zzf(zzl);
            throw zzdcVar;
        } catch (IndexOutOfBoundsException e4) {
            zzdc zzg = zzdc.zzg();
            zzg.zzf(zzl);
            throw zzg;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzel.zza().zzb(getClass()).zzj(this, (zzcs) obj);
    }

    public final int hashCode() {
        if (zzw()) {
            return zzd();
        }
        int i = this.zza;
        int i2 = i;
        if (i == 0) {
            i2 = zzd();
            this.zza = i2;
        }
        return i2;
    }

    public final String toString() {
        return zzee.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.play_billing.zzec
    public final /* synthetic */ zzeb zzE() {
        return (zzcn) zzx(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzec
    public final /* synthetic */ zzeb zzF() {
        zzcn zzcnVar = (zzcn) zzx(5, null, null);
        zzcnVar.zzc(this);
        return zzcnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzay
    public final int zza(zzeo zzeoVar) {
        if (zzw()) {
            int zza = zzeoVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza2 = zzeoVar.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    final int zzd() {
        return zzel.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzec
    public final void zze(zzby zzbyVar) throws IOException {
        zzel.zza().zzb(getClass()).zzi(this, zzbz.zza(zzbyVar));
    }

    @Override // com.google.android.gms.internal.play_billing.zzec
    public final int zzf() {
        int i;
        if (zzw()) {
            i = zzy(null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = zzy(null);
                if (i < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzcn zzg() {
        return (zzcn) zzx(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzed
    public final /* synthetic */ zzec zzh() {
        return (zzcs) zzx(6, null, null);
    }

    public final zzcn zzi() {
        zzcn zzcnVar = (zzcn) zzx(5, null, null);
        zzcnVar.zzc(this);
        return zzcnVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzed
    public final boolean zzk() {
        return zzv(this, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcs zzl() {
        return (zzcs) zzx(4, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzr() {
        zzel.zza().zzb(getClass()).zzf(this);
        zzs();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzs() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzu(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzw() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zzx(int i, Object obj, Object obj2);
}
