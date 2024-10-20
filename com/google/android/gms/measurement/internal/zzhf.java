package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzhf.class */
public final /* synthetic */ class zzhf {
    static final int[] zza;
    static final int[] zzb;
    static final int[] zzc;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:43:0x009e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    static {
        /*
            com.google.android.gms.internal.measurement.zzfn$zza$zzd[] r0 = com.google.android.gms.internal.measurement.zzfn.zza.zzd.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            com.google.android.gms.measurement.internal.zzhf.zzc = r0
            r0 = r4
            com.google.android.gms.internal.measurement.zzfn$zza$zzd r1 = com.google.android.gms.internal.measurement.zzfn.zza.zzd.DENIED     // Catch: java.lang.NoSuchFieldError -> L8a
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8a
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8a
        L14:
            int[] r0 = com.google.android.gms.measurement.internal.zzhf.zzc     // Catch: java.lang.NoSuchFieldError -> L8a java.lang.NoSuchFieldError -> L8e
            com.google.android.gms.internal.measurement.zzfn$zza$zzd r1 = com.google.android.gms.internal.measurement.zzfn.zza.zzd.GRANTED     // Catch: java.lang.NoSuchFieldError -> L8e
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8e
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8e
        L1f:
            com.google.android.gms.internal.measurement.zzfn$zza$zze[] r0 = com.google.android.gms.internal.measurement.zzfn.zza.zze.values()     // Catch: java.lang.NoSuchFieldError -> L8e
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            com.google.android.gms.measurement.internal.zzhf.zzb = r0
            r0 = r4
            com.google.android.gms.internal.measurement.zzfn$zza$zze r1 = com.google.android.gms.internal.measurement.zzfn.zza.zze.AD_STORAGE     // Catch: java.lang.NoSuchFieldError -> L92
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L92
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L92
        L33:
            int[] r0 = com.google.android.gms.measurement.internal.zzhf.zzb     // Catch: java.lang.NoSuchFieldError -> L92 java.lang.NoSuchFieldError -> L96
            com.google.android.gms.internal.measurement.zzfn$zza$zze r1 = com.google.android.gms.internal.measurement.zzfn.zza.zze.ANALYTICS_STORAGE     // Catch: java.lang.NoSuchFieldError -> L96
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L96
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L96
        L3e:
            int[] r0 = com.google.android.gms.measurement.internal.zzhf.zzb     // Catch: java.lang.NoSuchFieldError -> L96 java.lang.NoSuchFieldError -> L9a
            com.google.android.gms.internal.measurement.zzfn$zza$zze r1 = com.google.android.gms.internal.measurement.zzfn.zza.zze.AD_USER_DATA     // Catch: java.lang.NoSuchFieldError -> L9a
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9a
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9a
        L49:
            int[] r0 = com.google.android.gms.measurement.internal.zzhf.zzb     // Catch: java.lang.NoSuchFieldError -> L9a java.lang.NoSuchFieldError -> L9e
            com.google.android.gms.internal.measurement.zzfn$zza$zze r1 = com.google.android.gms.internal.measurement.zzfn.zza.zze.AD_PERSONALIZATION     // Catch: java.lang.NoSuchFieldError -> L9e
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9e
            r2 = 4
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9e
        L54:
            com.google.android.gms.internal.measurement.zzs[] r0 = com.google.android.gms.internal.measurement.zzs.values()     // Catch: java.lang.NoSuchFieldError -> L9e
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            com.google.android.gms.measurement.internal.zzhf.zza = r0
            r0 = r4
            com.google.android.gms.internal.measurement.zzs r1 = com.google.android.gms.internal.measurement.zzs.DEBUG     // Catch: java.lang.NoSuchFieldError -> La2
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La2
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La2
        L68:
            int[] r0 = com.google.android.gms.measurement.internal.zzhf.zza     // Catch: java.lang.NoSuchFieldError -> La2 java.lang.NoSuchFieldError -> La6
            com.google.android.gms.internal.measurement.zzs r1 = com.google.android.gms.internal.measurement.zzs.ERROR     // Catch: java.lang.NoSuchFieldError -> La6
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La6
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La6
        L73:
            int[] r0 = com.google.android.gms.measurement.internal.zzhf.zza     // Catch: java.lang.NoSuchFieldError -> La6 java.lang.NoSuchFieldError -> Laa
            com.google.android.gms.internal.measurement.zzs r1 = com.google.android.gms.internal.measurement.zzs.WARN     // Catch: java.lang.NoSuchFieldError -> Laa
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Laa
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Laa
        L7e:
            int[] r0 = com.google.android.gms.measurement.internal.zzhf.zza     // Catch: java.lang.NoSuchFieldError -> Laa java.lang.NoSuchFieldError -> Lae
            com.google.android.gms.internal.measurement.zzs r1 = com.google.android.gms.internal.measurement.zzs.VERBOSE     // Catch: java.lang.NoSuchFieldError -> Lae
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lae
            r2 = 4
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lae
        L89:
            return
        L8a:
            r4 = move-exception
            goto L14
        L8e:
            r4 = move-exception
            goto L1f
        L92:
            r4 = move-exception
            goto L33
        L96:
            r4 = move-exception
            goto L3e
        L9a:
            r4 = move-exception
            goto L49
        L9e:
            r4 = move-exception
            goto L54
        La2:
            r4 = move-exception
            goto L68
        La6:
            r4 = move-exception
            goto L73
        Laa:
            r4 = move-exception
            goto L7e
        Lae:
            r4 = move-exception
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhf.m2477clinit():void");
    }
}
