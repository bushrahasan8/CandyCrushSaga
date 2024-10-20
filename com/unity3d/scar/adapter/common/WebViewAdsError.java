package com.unity3d.scar.adapter.common;

/* loaded from: WebViewAdsError.class */
public abstract class WebViewAdsError implements IUnityAdsError {
    protected String _description;
    protected Object[] _errorArguments;
    private Enum _errorCategory;

    public WebViewAdsError(Enum r4, String str, Object... objArr) {
        this._errorCategory = r4;
        this._description = str;
        this._errorArguments = objArr;
    }

    public int getCode() {
        return -1;
    }

    public String getDescription() {
        return this._description;
    }

    public abstract String getDomain();

    public Object[] getErrorArguments() {
        return this._errorArguments;
    }

    public Enum<?> getErrorCategory() {
        return this._errorCategory;
    }
}
