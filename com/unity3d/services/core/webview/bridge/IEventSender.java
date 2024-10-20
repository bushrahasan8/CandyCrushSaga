package com.unity3d.services.core.webview.bridge;

/* loaded from: IEventSender.class */
public interface IEventSender {
    boolean canSend();

    boolean sendEvent(Enum<?> r1, Enum<?> r2, Object... objArr);
}
