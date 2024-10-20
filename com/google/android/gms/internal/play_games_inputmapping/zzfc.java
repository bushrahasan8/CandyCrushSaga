package com.google.android.gms.internal.play_games_inputmapping;

import com.google.android.gms.internal.play_games_inputmapping.zzez;
import com.google.android.gms.internal.play_games_inputmapping.zzfc;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: zzfc.class */
public abstract class zzfc<MessageType extends zzfc<MessageType, BuilderType>, BuilderType extends zzez<MessageType, BuilderType>> extends zzdy<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzhe zzc = zzhe.zza();
    protected int zzd = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfc zzn(Class cls) {
        Map map = zzb;
        zzfc zzfcVar = (zzfc) map.get(cls);
        zzfc zzfcVar2 = zzfcVar;
        if (zzfcVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzfcVar2 = (zzfc) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        zzfc zzfcVar3 = zzfcVar2;
        if (zzfcVar2 == null) {
            zzfcVar3 = (zzfc) ((zzfc) zzhn.zzc(cls)).zzf(6, null, null);
            if (zzfcVar3 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzfcVar3);
        }
        return zzfcVar3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void zzo(Class cls, zzfc zzfcVar) {
        zzb.put(cls, zzfcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zzp(zzge zzgeVar, String str, Object[] objArr) {
        return new zzgo(zzgeVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzq(Method method, Object obj, Object... objArr) {
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
    public static zzff zzr() {
        return zzfd.zzd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzff zzs(zzff zzffVar) {
        int size = zzffVar.size();
        return zzffVar.zzh(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzfh zzt() {
        return zzgn.zzd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzfh zzu(zzfh zzfhVar) {
        int size = zzfhVar.size();
        return zzfhVar.zzh(size == 0 ? 10 : size + size);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzgm.zza().zzb(getClass()).zza(this, (zzfc) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzb2 = zzgm.zza().zzb(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final String toString() {
        return zzgg.zza(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zzf(int i, Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdy
    public final int zzh() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdy
    public final void zzi(int i) {
        this.zzd = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzez zzj() {
        return (zzez) zzf(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzge
    public final void zzk(zzep zzepVar) throws IOException {
        zzgm.zza().zzb(getClass()).zze(this, zzeq.zza(zzepVar));
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzge
    public final int zzl() {
        int i = this.zzd;
        int i2 = i;
        if (i == -1) {
            i2 = zzgm.zza().zzb(getClass()).zzd(this);
            this.zzd = i2;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgf
    public final /* synthetic */ zzge zzm() {
        return (zzfc) zzf(6, null, null);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzge
    public final /* synthetic */ zzgd zzv() {
        zzez zzezVar = (zzez) zzf(5, null, null);
        zzezVar.zzk(this);
        return zzezVar;
    }
}
