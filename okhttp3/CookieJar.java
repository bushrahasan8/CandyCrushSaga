package okhttp3;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: CookieJar.class */
public interface CookieJar {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final CookieJar NO_COOKIES = new Companion.NoCookies();

    /* loaded from: CookieJar$Companion.class */
    public static final class Companion {
        static final Companion $$INSTANCE = new Companion();

        /* loaded from: CookieJar$Companion$NoCookies.class */
        private static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            public List loadForRequest(HttpUrl url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return CollectionsKt.emptyList();
            }

            @Override // okhttp3.CookieJar
            public void saveFromResponse(HttpUrl url, List cookies) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cookies, "cookies");
            }
        }

        private Companion() {
        }
    }

    List loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List list);
}
