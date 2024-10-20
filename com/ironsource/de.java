package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: de.class */
public final class de implements c5 {
    private final kb a;
    private final String b;

    public de(kb folderRootUrl, String version) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        Intrinsics.checkNotNullParameter(version, "version");
        this.a = folderRootUrl;
        this.b = version;
    }

    public final String a() {
        return this.b;
    }

    @Override // com.ironsource.c5
    public String value() {
        return this.a.a() + "/versions/" + this.b + "/mobileController.html";
    }
}
