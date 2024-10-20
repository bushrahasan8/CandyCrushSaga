package com.google.protobuf;

@CheckReturnValue
/* loaded from: MessageInfoFactory.class */
interface MessageInfoFactory {
    boolean isSupported(Class<?> cls);

    MessageInfo messageInfoFor(Class<?> cls);
}
