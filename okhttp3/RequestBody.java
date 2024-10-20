package okhttp3;

import java.io.File;
import java.nio.charset.Charset;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;

/* loaded from: RequestBody.class */
public abstract class RequestBody {
    public static final Companion Companion = new Companion(null);

    /* loaded from: RequestBody$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return companion.create(mediaType, bArr, i, i2);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                mediaType = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return companion.create(bArr, mediaType, i, i2);
        }

        public final RequestBody create(File file, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            return new RequestBody(mediaType, file) { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                final MediaType $contentType;
                final File $this_asRequestBody;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.$contentType = mediaType;
                    this.$this_asRequestBody = file;
                }

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return this.$this_asRequestBody.length();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return this.$contentType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(BufferedSink sink) {
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    Source source = Okio.source(this.$this_asRequestBody);
                    try {
                        sink.writeAll(source);
                        CloseableKt.closeFinally(source, null);
                    } finally {
                    }
                }
            };
        }

        public final RequestBody create(String str, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Charset charset = Charsets.UTF_8;
            Charset charset2 = charset;
            MediaType mediaType2 = mediaType;
            if (mediaType != null) {
                charset2 = MediaType.charset$default(mediaType, null, 1, null);
                if (charset2 == null) {
                    mediaType2 = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                    charset2 = charset;
                } else {
                    mediaType2 = mediaType;
                }
            }
            byte[] bytes = str.getBytes(charset2);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return create(bytes, mediaType2, 0, bytes.length);
        }

        public final RequestBody create(MediaType mediaType, File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return create(file, mediaType);
        }

        public final RequestBody create(MediaType mediaType, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, mediaType);
        }

        public final RequestBody create(MediaType mediaType, ByteString content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, mediaType);
        }

        public final RequestBody create(MediaType mediaType, byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create$default(this, mediaType, content, 0, 0, 12, (Object) null);
        }

        public final RequestBody create(MediaType mediaType, byte[] content, int i) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create$default(this, mediaType, content, i, 0, 8, (Object) null);
        }

        public final RequestBody create(MediaType mediaType, byte[] content, int i, int i2) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, mediaType, i, i2);
        }

        public final RequestBody create(ByteString byteString, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(byteString, "<this>");
            return new RequestBody(mediaType, byteString) { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                final MediaType $contentType;
                final ByteString $this_toRequestBody;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.$contentType = mediaType;
                    this.$this_toRequestBody = byteString;
                }

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return this.$this_toRequestBody.size();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return this.$contentType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(BufferedSink sink) {
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    sink.write(this.$this_toRequestBody);
                }
            };
        }

        public final RequestBody create(byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return create$default(this, bArr, mediaType, i, 0, 4, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            Util.checkOffsetAndCount(bArr.length, i, i2);
            return new RequestBody(mediaType, i2, bArr, i) { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                final int $byteCount;
                final MediaType $contentType;
                final int $offset;
                final byte[] $this_toRequestBody;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.$contentType = mediaType;
                    this.$byteCount = i2;
                    this.$this_toRequestBody = bArr;
                    this.$offset = i;
                }

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return this.$byteCount;
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return this.$contentType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(BufferedSink sink) {
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    sink.write(this.$this_toRequestBody, this.$offset, this.$byteCount);
                }
            };
        }
    }

    public static final RequestBody create(File file, MediaType mediaType) {
        return Companion.create(file, mediaType);
    }

    public static final RequestBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final RequestBody create(MediaType mediaType, File file) {
        return Companion.create(mediaType, file);
    }

    public static final RequestBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final RequestBody create(MediaType mediaType, ByteString byteString) {
        return Companion.create(mediaType, byteString);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i) {
        return Companion.create(mediaType, bArr, i);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i, int i2) {
        return Companion.create(mediaType, bArr, i, i2);
    }

    public static final RequestBody create(ByteString byteString, MediaType mediaType) {
        return Companion.create(byteString, mediaType);
    }

    public static final RequestBody create(byte[] bArr) {
        return Companion.create(bArr);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
        return Companion.create(bArr, mediaType, i);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i, int i2) {
        return Companion.create(bArr, mediaType, i, i2);
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink bufferedSink);
}
