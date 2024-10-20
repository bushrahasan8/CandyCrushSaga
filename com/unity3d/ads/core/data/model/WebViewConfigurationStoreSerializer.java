package com.unity3d.ads.core.data.model;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: WebViewConfigurationStoreSerializer.class */
public final class WebViewConfigurationStoreSerializer implements Serializer {
    private final WebViewConfigurationStore defaultValue;

    public WebViewConfigurationStoreSerializer() {
        WebViewConfigurationStore defaultInstance = WebViewConfigurationStore.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance()");
        this.defaultValue = defaultInstance;
    }

    /* renamed from: getDefaultValue, reason: merged with bridge method [inline-methods] */
    public WebViewConfigurationStore m6411getDefaultValue() {
        return this.defaultValue;
    }

    public Object readFrom(InputStream inputStream, Continuation<? super WebViewConfigurationStore> continuation) {
        try {
            WebViewConfigurationStore parseFrom = WebViewConfigurationStore.parseFrom(inputStream);
            Intrinsics.checkNotNullExpressionValue(parseFrom, "parseFrom(input)");
            return parseFrom;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        }
    }

    public Object writeTo(WebViewConfigurationStore webViewConfigurationStore, OutputStream outputStream, Continuation<? super Unit> continuation) {
        webViewConfigurationStore.writeTo(outputStream);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) {
        return writeTo((WebViewConfigurationStore) obj, outputStream, (Continuation<? super Unit>) continuation);
    }
}
