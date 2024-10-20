package com.google.android.datatransport;

/* loaded from: TransportFactory.class */
public interface TransportFactory {
    Transport getTransport(String str, Class cls, Encoding encoding, Transformer transformer);
}
