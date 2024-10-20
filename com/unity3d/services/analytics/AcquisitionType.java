package com.unity3d.services.analytics;

/* loaded from: AcquisitionType.class */
public enum AcquisitionType {
    SOFT,
    PREMIUM;

    /* renamed from: com.unity3d.services.analytics.AcquisitionType$1, reason: invalid class name */
    /* loaded from: AcquisitionType$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final int[] $SwitchMap$com$unity3d$services$analytics$AcquisitionType;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x0020
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.unity3d.services.analytics.AcquisitionType[] r0 = com.unity3d.services.analytics.AcquisitionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.unity3d.services.analytics.AcquisitionType.AnonymousClass1.$SwitchMap$com$unity3d$services$analytics$AcquisitionType = r0
                r0 = r4
                com.unity3d.services.analytics.AcquisitionType r1 = com.unity3d.services.analytics.AcquisitionType.SOFT     // Catch: java.lang.NoSuchFieldError -> L20
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L20
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L20
            L14:
                int[] r0 = com.unity3d.services.analytics.AcquisitionType.AnonymousClass1.$SwitchMap$com$unity3d$services$analytics$AcquisitionType     // Catch: java.lang.NoSuchFieldError -> L20 java.lang.NoSuchFieldError -> L24
                com.unity3d.services.analytics.AcquisitionType r1 = com.unity3d.services.analytics.AcquisitionType.PREMIUM     // Catch: java.lang.NoSuchFieldError -> L24
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L24
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L24
            L1f:
                return
            L20:
                r4 = move-exception
                goto L14
            L24:
                r4 = move-exception
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.analytics.AcquisitionType.AnonymousClass1.m6512clinit():void");
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$unity3d$services$analytics$AcquisitionType[ordinal()];
        return i != 1 ? i != 2 ? "" : "premium" : "soft";
    }
}
