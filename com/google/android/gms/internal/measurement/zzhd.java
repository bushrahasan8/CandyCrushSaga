package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import androidx.work.impl.WorkManagerImpl$Api24Impl$;
import com.google.common.base.Optional;
import java.io.File;

/* loaded from: zzhd.class */
public final class zzhd {

    /* loaded from: zzhd$zza.class */
    public static class zza {
        private static volatile Optional zza;

        private zza() {
        }

        public static Optional zza(Context context) {
            Optional zza2;
            Context createDeviceProtectedStorageContext;
            Optional optional = zza;
            Optional optional2 = optional;
            if (optional == null) {
                synchronized (zza.class) {
                    try {
                        Optional optional3 = zza;
                        optional2 = optional3;
                        if (optional3 == null) {
                            new zzhd();
                            if (zzhh.zza(Build.TYPE, Build.TAGS)) {
                                Context context2 = context;
                                if (zzgp.zza()) {
                                    if (WorkManagerImpl$Api24Impl$.ExternalSyntheticApiModelOutline0.m(context)) {
                                        context2 = context;
                                    } else {
                                        createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                                        context2 = createDeviceProtectedStorageContext;
                                    }
                                }
                                zza2 = zzhd.zza(context2);
                            } else {
                                zza2 = Optional.absent();
                            }
                            zza = zza2;
                            optional2 = zza2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return optional2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b4, code lost:
    
        if (r0 == r0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.measurement.zzhe zza(android.content.Context r4, java.io.File r5) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhd.zza(android.content.Context, java.io.File):com.google.android.gms.internal.measurement.zzhe");
    }

    static Optional zza(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            Optional zzb = zzb(context);
            Optional of = zzb.isPresent() ? Optional.of(zza(context, (File) zzb.get())) : Optional.absent();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return of;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static final String zza(String str) {
        return new String(str);
    }

    private static Optional zzb(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? Optional.of(file) : Optional.absent();
        } catch (RuntimeException e) {
            Log.e("HermeticFileOverrides", "no data dir", e);
            return Optional.absent();
        }
    }
}
