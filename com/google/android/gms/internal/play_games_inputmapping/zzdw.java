package com.google.android.gms.internal.play_games_inputmapping;

/* loaded from: zzdw.class */
final class zzdw implements zzdv {
    private static final int zzc(StackTraceElement[] stackTraceElementArr, Class cls, int i) {
        boolean z;
        String name = cls.getName();
        boolean z2 = false;
        int i2 = 3;
        while (i2 < stackTraceElementArr.length) {
            if (stackTraceElementArr[i2].getClassName().equals(name)) {
                z = true;
            } else {
                z = z2;
                if (z2) {
                    return i2;
                }
            }
            i2++;
            z2 = z;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdv
    public final StackTraceElement zza(Class cls, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int zzc = zzc(stackTrace, cls, 3);
        if (zzc != -1) {
            return stackTrace[zzc];
        }
        return null;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdv
    public final StackTraceElement[] zzb(Class cls, int i, int i2) {
        boolean z = true;
        if (i != -1) {
            z = i > 0;
        }
        zzds.zzb(z, "maxDepth must be > 0 or -1");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int zzc = zzc(stackTrace, cls, 3);
        if (zzc == -1) {
            return new StackTraceElement[0];
        }
        int length = stackTrace.length - zzc;
        if (i <= 0 || i >= length) {
            i = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        System.arraycopy(stackTrace, zzc, stackTraceElementArr, 0, i);
        return stackTraceElementArr;
    }
}
