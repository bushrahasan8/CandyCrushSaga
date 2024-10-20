package com.google.firebase.encoders.proto;

/* loaded from: Protobuf.class */
public @interface Protobuf {

    /* loaded from: Protobuf$IntEncoding.class */
    public enum IntEncoding {
        DEFAULT,
        SIGNED,
        FIXED
    }

    IntEncoding intEncoding() default IntEncoding.DEFAULT;

    int tag();
}
