package com.unity3d.scar.adapter.common.signals;

/* loaded from: ISignalCallbackListener.class */
public interface ISignalCallbackListener {
    void onFailure(String str);

    void onSuccess(String str, String str2, Object obj);
}
