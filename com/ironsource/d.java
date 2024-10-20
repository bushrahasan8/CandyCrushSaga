package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: d.class */
public final class d implements c5 {
    private final kb a;

    public d(kb folderRootUrl) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        this.a = folderRootUrl;
    }

    @Override // com.ironsource.c5
    public String value() {
        return this.a.a() + "/abTestMap.json";
    }
}
