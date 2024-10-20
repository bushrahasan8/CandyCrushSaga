package com.unity3d.services.identifiers.installationid;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: b.class */
public final class b {
    public String a;
    public final a b;
    public final a c;
    public final a d;

    public b(a installationIdProvider, a analyticsIdProvider, a unityAdsIdProvider) {
        Intrinsics.checkNotNullParameter(installationIdProvider, "installationIdProvider");
        Intrinsics.checkNotNullParameter(analyticsIdProvider, "analyticsIdProvider");
        Intrinsics.checkNotNullParameter(unityAdsIdProvider, "unityAdsIdProvider");
        this.b = installationIdProvider;
        this.c = analyticsIdProvider;
        this.d = unityAdsIdProvider;
        this.a = "";
        a();
        b();
    }

    public final void a() {
        String uuid;
        a aVar;
        if (this.b.a().length() > 0) {
            aVar = this.b;
        } else if (this.c.a().length() > 0) {
            aVar = this.c;
        } else {
            if (this.d.a().length() <= 0) {
                uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "UUID.randomUUID().toString()");
                this.a = uuid;
            }
            aVar = this.d;
        }
        uuid = aVar.a();
        this.a = uuid;
    }

    public final void b() {
        this.b.a(this.a);
        this.c.a(this.a);
        this.d.a(this.a);
    }
}
