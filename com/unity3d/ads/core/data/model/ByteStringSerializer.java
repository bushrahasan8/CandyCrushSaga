package com.unity3d.ads.core.data.model;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ByteStringSerializer.class */
public final class ByteStringSerializer implements Serializer {
    private final ByteStringStore defaultValue;

    public ByteStringSerializer() {
        ByteStringStore defaultInstance = ByteStringStore.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance()");
        this.defaultValue = defaultInstance;
    }

    /* renamed from: getDefaultValue, reason: merged with bridge method [inline-methods] */
    public ByteStringStore m6390getDefaultValue() {
        return this.defaultValue;
    }

    public Object readFrom(InputStream inputStream, Continuation<? super ByteStringStore> continuation) {
        try {
            ByteStringStore parseFrom = ByteStringStore.parseFrom(inputStream);
            Intrinsics.checkNotNullExpressionValue(parseFrom, "parseFrom(input)");
            return parseFrom;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        }
    }

    public Object writeTo(ByteStringStore byteStringStore, OutputStream outputStream, Continuation<? super Unit> continuation) {
        byteStringStore.writeTo(outputStream);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) {
        return writeTo((ByteStringStore) obj, outputStream, (Continuation<? super Unit>) continuation);
    }
}
