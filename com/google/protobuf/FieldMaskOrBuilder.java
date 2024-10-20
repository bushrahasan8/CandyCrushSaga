package com.google.protobuf;

import java.util.List;

/* loaded from: FieldMaskOrBuilder.class */
public interface FieldMaskOrBuilder extends MessageLiteOrBuilder {
    @Override // com.google.protobuf.MessageLiteOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getPaths(int i);

    ByteString getPathsBytes(int i);

    int getPathsCount();

    List<String> getPathsList();

    @Override // com.google.protobuf.MessageLiteOrBuilder
    /* synthetic */ boolean isInitialized();
}
