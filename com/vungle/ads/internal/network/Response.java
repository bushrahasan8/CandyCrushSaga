package com.vungle.ads.internal.network;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.ResponseBody;

/* loaded from: Response.class */
public final class Response {
    public static final Companion Companion = new Companion(null);
    private final Object body;
    private final ResponseBody errorBody;
    private final okhttp3.Response rawResponse;

    /* loaded from: Response$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> Response error(ResponseBody responseBody, okhttp3.Response rawResponse) {
            Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
            if (!rawResponse.isSuccessful()) {
                return new Response(rawResponse, null, responseBody, null);
            }
            throw new IllegalArgumentException("rawResponse should not be successful response".toString());
        }

        public final <T> Response success(T t, okhttp3.Response rawResponse) {
            Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
            if (rawResponse.isSuccessful()) {
                return new Response(rawResponse, t, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response".toString());
        }
    }

    private Response(okhttp3.Response response, Object obj, ResponseBody responseBody) {
        this.rawResponse = response;
        this.body = obj;
        this.errorBody = responseBody;
    }

    public /* synthetic */ Response(okhttp3.Response response, Object obj, ResponseBody responseBody, DefaultConstructorMarker defaultConstructorMarker) {
        this(response, obj, responseBody);
    }

    public final Object body() {
        return this.body;
    }

    public final int code() {
        return this.rawResponse.code();
    }

    public final ResponseBody errorBody() {
        return this.errorBody;
    }

    public final Headers headers() {
        return this.rawResponse.headers();
    }

    public final boolean isSuccessful() {
        return this.rawResponse.isSuccessful();
    }

    public final String message() {
        return this.rawResponse.message();
    }

    public final okhttp3.Response raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }
}
