package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: zzcep.class */
public final class zzcep {
    public static final zzgey zza;
    public static final zzgey zzb;
    public static final zzgey zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgey zze;
    public static final zzgey zzf;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.concurrent.ExecutorService] */
    static {
        Executor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        ThreadPoolExecutor threadPoolExecutor3;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfts.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzcel("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcel("Default"));
        }
        zza = new zzceo(threadPoolExecutor, null);
        if (ClientLibraryUtils.isPackageSide()) {
            threadPoolExecutor2 = zzfts.zza().zzc(5, new zzcel("Loader"), 1);
        } else {
            threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcel("Loader"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
        }
        zzb = new zzceo(threadPoolExecutor2, null);
        if (ClientLibraryUtils.isPackageSide()) {
            threadPoolExecutor3 = zzfts.zza().zzb(new zzcel("Activeview"), 1);
        } else {
            threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcel("Activeview"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
        }
        zzc = new zzceo(threadPoolExecutor3, null);
        zzd = new zzcek(3, new zzcel("Schedule"));
        zze = new zzceo(new zzcem(), null);
        zzf = new zzceo(zzgfe.zzb(), null);
    }
}
