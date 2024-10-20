package com.unity3d.services.core.network.model;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.drive.ExecutionOptions;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.ads.core.data.model.OperationType;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: HttpRequest.class */
public final class HttpRequest {
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_SCHEME = "https";
    public static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final Object body;
    private final BodyType bodyType;
    private final int callTimeout;
    private final int connectTimeout;
    private final File downloadDestination;
    private final Map<String, List<String>> headers;
    private final boolean isProtobuf;
    private final RequestType method;
    private final OperationType operationType;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int priority;
    private final int readTimeout;
    private final String scheme;
    private final int writeTimeout;

    /* loaded from: HttpRequest$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL) {
        this(baseURL, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131070, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path) {
        this(baseURL, path, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131068, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131064, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj) {
        this(baseURL, path, method, obj, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131056, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers) {
        this(baseURL, path, method, obj, headers, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131040, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters) {
        this(baseURL, path, method, obj, headers, parameters, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131008, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, null, null, 0, 0, 0, 0, false, null, null, 0, 130944, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, null, 0, 0, 0, 0, false, null, null, 0, 130816, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, 0, 0, 0, 0, false, null, null, 0, 130560, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, 0, 0, 0, false, null, null, 0, 130048, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i, int i2) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, 0, 0, false, null, null, 0, 129024, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, 0, false, null, null, 0, 126976, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3, int i4) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, i4, false, null, null, 0, 122880, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3, int i4, boolean z) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, i4, z, null, null, 0, 114688, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, i4, z, operationType, null, 0, 98304, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(operationType, "operationType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, i4, z, operationType, file, 0, ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(operationType, "operationType");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5) {
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(operationType, "operationType");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = obj;
        this.headers = headers;
        this.parameters = parameters;
        this.bodyType = bodyType;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i;
        this.readTimeout = i2;
        this.writeTimeout = i3;
        this.callTimeout = i4;
        this.isProtobuf = z;
        this.operationType = operationType;
        this.downloadDestination = file;
        this.priority = i5;
    }

    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? RequestType.GET : requestType, (i6 & 8) != 0 ? null : obj, (i6 & 16) != 0 ? MapsKt.emptyMap() : map, (i6 & 32) != 0 ? MapsKt.emptyMap() : map2, (i6 & 64) != 0 ? BodyType.UNKNOWN : bodyType, (i6 & 128) != 0 ? DEFAULT_SCHEME : str3, (i6 & 256) != 0 ? null : num, (i6 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 30000 : i, (i6 & 1024) != 0 ? 30000 : i2, (i6 & a.m) != 0 ? 30000 : i3, (i6 & 4096) != 0 ? 30000 : i4, (i6 & 8192) != 0 ? false : z, (i6 & 16384) != 0 ? OperationType.UNKNOWN : operationType, (i6 & 32768) != 0 ? null : file, (i6 & ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH) != 0 ? 0 : i5);
    }

    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5, int i6, Object obj2) {
        if ((i6 & 1) != 0) {
            str = httpRequest.baseURL;
        }
        if ((i6 & 2) != 0) {
            str2 = httpRequest.path;
        }
        if ((i6 & 4) != 0) {
            requestType = httpRequest.method;
        }
        if ((i6 & 8) != 0) {
            obj = httpRequest.body;
        }
        if ((i6 & 16) != 0) {
            map = httpRequest.headers;
        }
        if ((i6 & 32) != 0) {
            map2 = httpRequest.parameters;
        }
        if ((i6 & 64) != 0) {
            bodyType = httpRequest.bodyType;
        }
        if ((i6 & 128) != 0) {
            str3 = httpRequest.scheme;
        }
        if ((i6 & 256) != 0) {
            num = httpRequest.port;
        }
        if ((i6 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            i = httpRequest.connectTimeout;
        }
        if ((i6 & 1024) != 0) {
            i2 = httpRequest.readTimeout;
        }
        if ((i6 & a.m) != 0) {
            i3 = httpRequest.writeTimeout;
        }
        if ((i6 & 4096) != 0) {
            i4 = httpRequest.callTimeout;
        }
        if ((i6 & 8192) != 0) {
            z = httpRequest.isProtobuf;
        }
        if ((i6 & 16384) != 0) {
            operationType = httpRequest.operationType;
        }
        if ((i6 & 32768) != 0) {
            file = httpRequest.downloadDestination;
        }
        if ((i6 & ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH) != 0) {
            i5 = httpRequest.priority;
        }
        return httpRequest.copy(str, str2, requestType, obj, map, map2, bodyType, str3, num, i, i2, i3, i4, z, operationType, file, i5);
    }

    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.connectTimeout;
    }

    public final int component11() {
        return this.readTimeout;
    }

    public final int component12() {
        return this.writeTimeout;
    }

    public final int component13() {
        return this.callTimeout;
    }

    public final boolean component14() {
        return this.isProtobuf;
    }

    public final OperationType component15() {
        return this.operationType;
    }

    public final File component16() {
        return this.downloadDestination;
    }

    public final int component17() {
        return this.priority;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final Object component4() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    public final BodyType component7() {
        return this.bodyType;
    }

    public final String component8() {
        return this.scheme;
    }

    public final Integer component9() {
        return this.port;
    }

    public final HttpRequest copy(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5) {
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(operationType, "operationType");
        return new HttpRequest(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, i4, z, operationType, file, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return Intrinsics.areEqual(this.baseURL, httpRequest.baseURL) && Intrinsics.areEqual(this.path, httpRequest.path) && this.method == httpRequest.method && Intrinsics.areEqual(this.body, httpRequest.body) && Intrinsics.areEqual(this.headers, httpRequest.headers) && Intrinsics.areEqual(this.parameters, httpRequest.parameters) && this.bodyType == httpRequest.bodyType && Intrinsics.areEqual(this.scheme, httpRequest.scheme) && Intrinsics.areEqual(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout && this.isProtobuf == httpRequest.isProtobuf && this.operationType == httpRequest.operationType && Intrinsics.areEqual(this.downloadDestination, httpRequest.downloadDestination) && this.priority == httpRequest.priority;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final Object getBody() {
        return this.body;
    }

    public final BodyType getBodyType() {
        return this.bodyType;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final File getDownloadDestination() {
        return this.downloadDestination;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final OperationType getOperationType() {
        return this.operationType;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public final String getPath() {
        return this.path;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public int hashCode() {
        int hashCode = this.baseURL.hashCode();
        int hashCode2 = this.path.hashCode();
        int hashCode3 = this.method.hashCode();
        Object obj = this.body;
        int i = 0;
        int hashCode4 = obj == null ? 0 : obj.hashCode();
        int hashCode5 = this.headers.hashCode();
        int hashCode6 = this.parameters.hashCode();
        int hashCode7 = this.bodyType.hashCode();
        int hashCode8 = this.scheme.hashCode();
        Integer num = this.port;
        int hashCode9 = num == null ? 0 : num.hashCode();
        int i2 = this.connectTimeout;
        int i3 = this.readTimeout;
        int i4 = this.writeTimeout;
        int i5 = this.callTimeout;
        boolean z = this.isProtobuf;
        int i6 = z ? 1 : 0;
        if (z) {
            i6 = 1;
        }
        int hashCode10 = this.operationType.hashCode();
        File file = this.downloadDestination;
        if (file != null) {
            i = file.hashCode();
        }
        return (((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + hashCode10) * 31) + i) * 31) + this.priority;
    }

    public final boolean isProtobuf() {
        return this.isProtobuf;
    }

    public String toString() {
        return "HttpRequest(baseURL=" + this.baseURL + ", path=" + this.path + ", method=" + this.method + ", body=" + this.body + ", headers=" + this.headers + ", parameters=" + this.parameters + ", bodyType=" + this.bodyType + ", scheme=" + this.scheme + ", port=" + this.port + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", callTimeout=" + this.callTimeout + ", isProtobuf=" + this.isProtobuf + ", operationType=" + this.operationType + ", downloadDestination=" + this.downloadDestination + ", priority=" + this.priority + ')';
    }
}
