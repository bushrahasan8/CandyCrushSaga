package com.bumptech.glide.load;

import java.io.IOException;

/* loaded from: HttpException.class */
public final class HttpException extends IOException {
    private final int statusCode;

    public HttpException(int i) {
        this("Http request failed with status code: " + i, i);
    }

    public HttpException(String str) {
        this(str, -1);
    }

    public HttpException(String str, int i) {
        this(str, i, null);
    }

    public HttpException(String str, int i, Throwable th) {
        super(str, th);
        this.statusCode = i;
    }
}
