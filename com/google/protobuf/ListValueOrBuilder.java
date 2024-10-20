package com.google.protobuf;

import java.util.List;

/* loaded from: ListValueOrBuilder.class */
public interface ListValueOrBuilder extends MessageLiteOrBuilder {
    @Override // com.google.protobuf.MessageLiteOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    Value getValues(int i);

    int getValuesCount();

    List<Value> getValuesList();

    @Override // com.google.protobuf.MessageLiteOrBuilder
    /* synthetic */ boolean isInitialized();
}
