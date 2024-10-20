package com.google.protobuf;

import java.util.List;

/* loaded from: ProtocolStringList.class */
public interface ProtocolStringList extends List<String> {
    List<ByteString> asByteStringList();
}
