package com.google.protobuf;

import java.util.Map;

/* loaded from: StructOrBuilder.class */
public interface StructOrBuilder extends MessageLiteOrBuilder {
    boolean containsFields(String str);

    @Override // com.google.protobuf.MessageLiteOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    @Deprecated
    Map<String, Value> getFields();

    int getFieldsCount();

    Map<String, Value> getFieldsMap();

    Value getFieldsOrDefault(String str, Value value);

    Value getFieldsOrThrow(String str);

    @Override // com.google.protobuf.MessageLiteOrBuilder
    /* synthetic */ boolean isInitialized();
}
