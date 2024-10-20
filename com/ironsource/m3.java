package com.ironsource;

import java.io.InputStream;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: m3.class */
public final class m3 implements m2 {
    public static final m3 a = new m3();

    private m3() {
    }

    @Override // com.ironsource.m2
    public InputStream a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        InputStream openStream = new URL(url).openStream();
        Intrinsics.checkNotNullExpressionValue(openStream, "URL(url).openStream()");
        return openStream;
    }
}
