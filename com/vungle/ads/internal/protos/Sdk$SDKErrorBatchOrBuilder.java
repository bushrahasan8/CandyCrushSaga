package com.vungle.ads.internal.protos;

import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* loaded from: Sdk$SDKErrorBatchOrBuilder.class */
public interface Sdk$SDKErrorBatchOrBuilder extends MessageLiteOrBuilder {
    @Override // com.google.protobuf.MessageLiteOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    Sdk$SDKError getErrors(int i);

    int getErrorsCount();

    List<Sdk$SDKError> getErrorsList();

    @Override // com.google.protobuf.MessageLiteOrBuilder
    /* synthetic */ boolean isInitialized();
}
