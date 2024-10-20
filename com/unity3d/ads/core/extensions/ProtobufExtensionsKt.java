package com.unity3d.ads.core.extensions;

import android.util.Base64;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: ProtobufExtensionsKt.class */
public final class ProtobufExtensionsKt {
    public static final ByteString fromBase64(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ByteString copyFrom = ByteString.copyFrom(Base64.decode(str, 2));
        Intrinsics.checkNotNullExpressionValue(copyFrom, "copyFrom(android.util.Ba…oid.util.Base64.NO_WRAP))");
        return copyFrom;
    }

    public static final String toBase64(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        String encodeToString = Base64.encodeToString(byteString.toByteArray(), 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(this.toBy…roid.util.Base64.NO_WRAP)");
        return encodeToString;
    }

    public static final ByteString toByteString(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<this>");
        ByteString copyFrom = ByteString.copyFrom(ByteBuffer.wrap(new byte[16]).order(ByteOrder.BIG_ENDIAN).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
        Intrinsics.checkNotNullExpressionValue(copyFrom, "copyFrom(bytes.array())");
        return copyFrom;
    }

    public static final ByteString toISO8859ByteString(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.ISO_8859_1);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        ByteString copyFrom = ByteString.copyFrom(bytes);
        Intrinsics.checkNotNullExpressionValue(copyFrom, "copyFrom(this.toByteArray(Charsets.ISO_8859_1))");
        return copyFrom;
    }

    public static final String toISO8859String(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        String byteString2 = byteString.toString(Charsets.ISO_8859_1);
        Intrinsics.checkNotNullExpressionValue(byteString2, "this.toString(Charsets.ISO_8859_1)");
        return byteString2;
    }

    public static final UUID toUUID(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        ByteBuffer asReadOnlyByteBuffer = byteString.asReadOnlyByteBuffer();
        Intrinsics.checkNotNullExpressionValue(asReadOnlyByteBuffer, "this.asReadOnlyByteBuffer()");
        if (asReadOnlyByteBuffer.remaining() == 36) {
            UUID fromString = UUID.fromString(byteString.toStringUtf8());
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(uuidString)");
            return fromString;
        }
        if (asReadOnlyByteBuffer.remaining() == 16) {
            return new UUID(asReadOnlyByteBuffer.getLong(), asReadOnlyByteBuffer.getLong());
        }
        throw new IllegalArgumentException("Expected 16 byte ByteString or UUID string");
    }
}
