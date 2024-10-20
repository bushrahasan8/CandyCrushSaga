package com.google.protobuf;

@CheckReturnValue
/* loaded from: NewInstanceSchemaLite.class */
final class NewInstanceSchemaLite implements NewInstanceSchema {
    @Override // com.google.protobuf.NewInstanceSchema
    public Object newInstance(Object obj) {
        return ((GeneratedMessageLite) obj).newMutableInstance();
    }
}
