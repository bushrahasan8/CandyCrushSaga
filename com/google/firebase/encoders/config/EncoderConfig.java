package com.google.firebase.encoders.config;

import com.google.firebase.encoders.ObjectEncoder;

/* loaded from: EncoderConfig.class */
public interface EncoderConfig {
    EncoderConfig registerEncoder(Class cls, ObjectEncoder objectEncoder);
}
