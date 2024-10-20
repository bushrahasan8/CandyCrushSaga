package com.google.protobuf;

@CheckReturnValue
/* loaded from: MessageInfo.class */
interface MessageInfo {
    MessageLite getDefaultInstance();

    ProtoSyntax getSyntax();

    boolean isMessageSetWireFormat();
}
