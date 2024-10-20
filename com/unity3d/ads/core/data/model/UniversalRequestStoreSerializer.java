package com.unity3d.ads.core.data.model;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: UniversalRequestStoreSerializer.class */
public final class UniversalRequestStoreSerializer implements Serializer {
    private final UniversalRequestStore defaultValue;

    public UniversalRequestStoreSerializer() {
        UniversalRequestStore defaultInstance = UniversalRequestStore.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance()");
        this.defaultValue = defaultInstance;
    }

    /* renamed from: getDefaultValue, reason: merged with bridge method [inline-methods] */
    public UniversalRequestStore m6410getDefaultValue() {
        return this.defaultValue;
    }

    public Object readFrom(InputStream inputStream, Continuation<? super UniversalRequestStore> continuation) {
        try {
            UniversalRequestStore parseFrom = UniversalRequestStore.parseFrom(inputStream);
            Intrinsics.checkNotNullExpressionValue(parseFrom, "parseFrom(input)");
            return parseFrom;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        }
    }

    public Object writeTo(UniversalRequestStore universalRequestStore, OutputStream outputStream, Continuation<? super Unit> continuation) {
        universalRequestStore.writeTo(outputStream);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) {
        return writeTo((UniversalRequestStore) obj, outputStream, (Continuation<? super Unit>) continuation);
    }
}
