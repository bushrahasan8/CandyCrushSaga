package com.braze.events;

/* loaded from: IValueCallback.class */
public interface IValueCallback<T> {

    /* loaded from: IValueCallback$_CC.class */
    public abstract /* synthetic */ class _CC {
        public static void $default$onError(IValueCallback iValueCallback) {
        }
    }

    void onError();

    void onSuccess(T t);
}
