package com.unity3d.services.core.request;

/* loaded from: IResolveHostListener.class */
public interface IResolveHostListener {
    void onFailed(String str, ResolveHostError resolveHostError, String str2);

    void onResolve(String str, String str2);
}
