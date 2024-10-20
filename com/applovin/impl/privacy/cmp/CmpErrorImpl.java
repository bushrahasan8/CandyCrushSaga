package com.applovin.impl.privacy.cmp;

import com.applovin.sdk.AppLovinCmpError;

/* loaded from: CmpErrorImpl.class */
public class CmpErrorImpl implements AppLovinCmpError {
    private final AppLovinCmpError.Code a;
    private final String b;
    private final int c;
    private final String d;

    public CmpErrorImpl(AppLovinCmpError.Code code, String str) {
        this(code, str, -1, "");
    }

    public CmpErrorImpl(AppLovinCmpError.Code code, String str, int i, String str2) {
        this.a = code;
        this.b = str;
        this.c = i;
        this.d = str2;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public int getCmpCode() {
        return this.c;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getCmpMessage() {
        return this.d;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public AppLovinCmpError.Code getCode() {
        return this.a;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getMessage() {
        return this.b;
    }

    public String toString() {
        return "CmpErrorImpl(code=" + getCode() + ", message=" + getMessage() + ", cmpCode=" + getCmpCode() + ", cmpMessage=" + getCmpMessage() + ")";
    }
}
