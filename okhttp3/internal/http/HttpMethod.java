package okhttp3.internal.http;

import com.ironsource.na;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: HttpMethod.class */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.areEqual(method, na.a) || Intrinsics.areEqual(method, "HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.areEqual(method, na.b) || Intrinsics.areEqual(method, "PUT") || Intrinsics.areEqual(method, "PATCH") || Intrinsics.areEqual(method, "PROPPATCH") || Intrinsics.areEqual(method, "REPORT");
    }

    public final boolean invalidatesCache(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.areEqual(method, na.b) || Intrinsics.areEqual(method, "PATCH") || Intrinsics.areEqual(method, "PUT") || Intrinsics.areEqual(method, "DELETE") || Intrinsics.areEqual(method, "MOVE");
    }

    public final boolean redirectsToGet(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return !Intrinsics.areEqual(method, "PROPFIND");
    }

    public final boolean redirectsWithBody(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.areEqual(method, "PROPFIND");
    }
}
