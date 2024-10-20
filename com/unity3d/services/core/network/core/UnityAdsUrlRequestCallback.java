package com.unity3d.services.core.network.core;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.Okio;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: UnityAdsUrlRequestCallback.class */
public abstract class UnityAdsUrlRequestCallback extends UrlRequest.Callback {
    private static final int BYTE_BUFFER_CAPACITY_BYTES = 65536;
    public static final Companion Companion = new Companion(null);
    private final ByteArrayOutputStream bytesReceived;
    private final File file;
    private final WritableByteChannel receiveChannel;
    private BufferedSink sink;

    /* loaded from: UnityAdsUrlRequestCallback$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UnityAdsUrlRequestCallback(File file) {
        this.file = file;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.bytesReceived = byteArrayOutputStream;
        this.receiveChannel = Channels.newChannel(byteArrayOutputStream);
    }

    public final File getFile() {
        return this.file;
    }

    public final void onReadCompleted(UrlRequest request, UrlResponseInfo info, ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        byteBuffer.flip();
        File file = this.file;
        if (file == null || !file.exists()) {
            this.receiveChannel.write(byteBuffer);
        } else {
            BufferedSink bufferedSink = this.sink;
            BufferedSink bufferedSink2 = bufferedSink;
            if (bufferedSink == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sink");
                bufferedSink2 = null;
            }
            bufferedSink2.write(byteBuffer);
        }
        byteBuffer.clear();
        request.read(byteBuffer);
    }

    public void onRedirectReceived(UrlRequest request, UrlResponseInfo urlResponseInfo, String str) {
        Intrinsics.checkNotNullParameter(request, "request");
        request.followRedirect();
    }

    public final void onResponseStarted(UrlRequest request, UrlResponseInfo info) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(info, "info");
        File file = this.file;
        if (file != null && file.exists()) {
            BufferedSink buffer = Okio.buffer(Okio.sink(this.file));
            Intrinsics.checkNotNullExpressionValue(buffer, "buffer(Okio.sink(file))");
            this.sink = buffer;
        }
        request.read(ByteBuffer.allocateDirect(65536));
    }

    public final void onSucceeded(UrlRequest request, UrlResponseInfo info) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(info, "info");
        byte[] bodyBytes = this.bytesReceived.toByteArray();
        File file = this.file;
        if (file != null && file.exists()) {
            BufferedSink bufferedSink = this.sink;
            BufferedSink bufferedSink2 = bufferedSink;
            if (bufferedSink == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sink");
                bufferedSink2 = null;
            }
            bufferedSink2.close();
        }
        Intrinsics.checkNotNullExpressionValue(bodyBytes, "bodyBytes");
        onSucceeded(request, info, bodyBytes);
    }

    public abstract void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, byte[] bArr);
}
