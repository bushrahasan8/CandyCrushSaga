package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: z2.class */
public final class z2 implements a6 {
    private final String a;
    private final String b;
    private final boolean c;
    private final kb d;

    public z2() {
        this(null, null, false, null, 15, null);
    }

    public z2(String controllerUrl, String cacheFolder, boolean z, kb rootFolder) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        Intrinsics.checkNotNullParameter(cacheFolder, "cacheFolder");
        Intrinsics.checkNotNullParameter(rootFolder, "rootFolder");
        this.a = controllerUrl;
        this.b = cacheFolder;
        this.c = z;
        this.d = rootFolder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ z2(java.lang.String r7, java.lang.String r8, boolean r9, com.ironsource.kb r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r6 = this;
            r0 = r11
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto La
            java.lang.String r0 = ""
            r7 = r0
        La:
            r0 = r11
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L14
            java.lang.String r0 = ""
            r8 = r0
        L14:
            r0 = r11
            r1 = 4
            r0 = r0 & r1
            if (r0 == 0) goto L1d
            r0 = 0
            r9 = r0
        L1d:
            r0 = r11
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L2f
            com.ironsource.kb r0 = new com.ironsource.kb
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r10 = r0
        L2f:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.z2.<init>(java.lang.String, java.lang.String, boolean, com.ironsource.kb, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Override // com.ironsource.a6
    public kb a() {
        return this.d;
    }

    @Override // com.ironsource.a6
    public String b() {
        return this.b;
    }

    @Override // com.ironsource.a6
    public String c() {
        return this.a;
    }

    @Override // com.ironsource.a6
    public boolean d() {
        return this.c;
    }
}
