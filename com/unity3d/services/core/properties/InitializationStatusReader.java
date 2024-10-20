package com.unity3d.services.core.properties;

import com.unity3d.services.core.properties.SdkProperties;

/* loaded from: InitializationStatusReader.class */
public class InitializationStatusReader {
    private static final String STATE_INITIALIZED_FAILED = "initialized_failed";
    private static final String STATE_INITIALIZED_SUCCESSFULLY = "initialized_successfully";
    private static final String STATE_INITIALIZING = "initializing";
    private static final String STATE_NOT_INITIALIZED = "not_initialized";

    /* renamed from: com.unity3d.services.core.properties.InitializationStatusReader$1, reason: invalid class name */
    /* loaded from: InitializationStatusReader$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final int[] $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x003e
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.unity3d.services.core.properties.SdkProperties$InitializationState[] r0 = com.unity3d.services.core.properties.SdkProperties.InitializationState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.unity3d.services.core.properties.InitializationStatusReader.AnonymousClass1.$SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState = r0
                r0 = r4
                com.unity3d.services.core.properties.SdkProperties$InitializationState r1 = com.unity3d.services.core.properties.SdkProperties.InitializationState.NOT_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L36
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            L14:
                int[] r0 = com.unity3d.services.core.properties.InitializationStatusReader.AnonymousClass1.$SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState     // Catch: java.lang.NoSuchFieldError -> L36 java.lang.NoSuchFieldError -> L3a
                com.unity3d.services.core.properties.SdkProperties$InitializationState r1 = com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZING     // Catch: java.lang.NoSuchFieldError -> L3a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a
            L1f:
                int[] r0 = com.unity3d.services.core.properties.InitializationStatusReader.AnonymousClass1.$SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState     // Catch: java.lang.NoSuchFieldError -> L3a java.lang.NoSuchFieldError -> L3e
                com.unity3d.services.core.properties.SdkProperties$InitializationState r1 = com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L2a:
                int[] r0 = com.unity3d.services.core.properties.InitializationStatusReader.AnonymousClass1.$SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState     // Catch: java.lang.NoSuchFieldError -> L3e java.lang.NoSuchFieldError -> L42
                com.unity3d.services.core.properties.SdkProperties$InitializationState r1 = com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_FAILED     // Catch: java.lang.NoSuchFieldError -> L42
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L42
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L42
            L35:
                return
            L36:
                r4 = move-exception
                goto L14
            L3a:
                r4 = move-exception
                goto L1f
            L3e:
                r4 = move-exception
                goto L2a
            L42:
                r4 = move-exception
                goto L35
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.properties.InitializationStatusReader.AnonymousClass1.m6631clinit():void");
        }
    }

    public String getInitializationStateString(SdkProperties.InitializationState initializationState) {
        int i = AnonymousClass1.$SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState[initializationState.ordinal()];
        if (i == 1) {
            return "not_initialized";
        }
        if (i == 2) {
            return STATE_INITIALIZING;
        }
        if (i == 3) {
            return STATE_INITIALIZED_SUCCESSFULLY;
        }
        if (i != 4) {
            return null;
        }
        return STATE_INITIALIZED_FAILED;
    }
}
