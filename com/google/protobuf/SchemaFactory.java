package com.google.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
@CheckReturnValue
/* loaded from: SchemaFactory.class */
public interface SchemaFactory {
    <T> Schema<T> createSchema(Class<T> cls);
}
