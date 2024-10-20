package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: q.class */
public interface q {

    /* loaded from: q$a.class */
    public static final class a {
        private final String a;

        public a(String adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.a = adFormat;
        }

        public final IronSourceError a(h loadParams) {
            Intrinsics.checkNotNullParameter(loadParams, "loadParams");
            h.b bVar = (h.b) loadParams;
            if (bVar.f() == null) {
                return new IronSourceError(1060, this.a + " was initialized and loaded without Activity");
            }
            if (bVar.g() == null) {
                return new IronSourceError(510, "Missing banner layout");
            }
            if (bVar.g().isDestroyed()) {
                return new IronSourceError(510, "Banner layout is destroyed");
            }
            ISBannerSize size = bVar.g().getSize();
            if (size == null) {
                return new IronSourceError(510, "Missing banner size");
            }
            if (com.ironsource.mediationsdk.l.f == size.getDescription() && (size.getHeight() <= 0 || size.getWidth() <= 0)) {
                return new IronSourceError(510, "Unsupported banner size. Height and width must be bigger than 0");
            }
            if (bVar.b() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String a = bVar.a();
            if ((a == null || a.length() == 0) && loadParams.d()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    /* loaded from: q$b.class */
    public static final class b {
        private final String a;

        public b(String adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.a = adFormat;
        }

        public final IronSourceError a(h.d loadParams) {
            Intrinsics.checkNotNullParameter(loadParams, "loadParams");
            if (loadParams.e() == null) {
                return new IronSourceError(1060, this.a + " was initialized and loaded without Activity");
            }
            if (loadParams.b() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String a = loadParams.a();
            if ((a == null || a.length() == 0) && loadParams.d()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    IronSourceError c();
}
