package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* loaded from: ResponseBody.class */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    /* loaded from: ResponseBody$BomAwareReader.class */
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final BufferedSource source;

        public BomAwareReader(BufferedSource source, Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.source = source;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Unit unit;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader == null) {
                unit = null;
            } else {
                reader.close();
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i, int i2) {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.delegate;
            Reader reader2 = reader;
            if (reader == null) {
                reader2 = new InputStreamReader(this.source.inputStream(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = reader2;
            }
            return reader2.read(cbuf, i, i2);
        }
    }

    /* loaded from: ResponseBody$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
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
            Buffer writeString = new Buffer().writeString(str, charset2);
            return create(writeString, mediaType2, writeString.size());
        }

        public final ResponseBody create(MediaType mediaType, long j, BufferedSource content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, mediaType, j);
        }

        public final ResponseBody create(MediaType mediaType, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, ByteString content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, mediaType);
        }

        public final ResponseBody create(final BufferedSource bufferedSource, final MediaType mediaType, final long j) {
            Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
            return new ResponseBody(mediaType, j, bufferedSource) { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                final long $contentLength;
                final MediaType $contentType;
                final BufferedSource $this_asResponseBody;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.$contentType = mediaType;
                    this.$contentLength = j;
                    this.$this_asResponseBody = bufferedSource;
                }

                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return this.$contentLength;
                }

                @Override // okhttp3.ResponseBody
                public MediaType contentType() {
                    return this.$contentType;
                }

                @Override // okhttp3.ResponseBody
                public BufferedSource source() {
                    return this.$this_asResponseBody;
                }
            };
        }

        public final ResponseBody create(ByteString byteString, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(byteString, "<this>");
            return create(new Buffer().write(byteString), mediaType, byteString.size());
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return create(new Buffer().write(bArr), mediaType, bArr.length);
        }
    }

    private final Charset charset() {
        MediaType contentType = contentType();
        Charset charset = contentType == null ? null : contentType.charset(Charsets.UTF_8);
        Charset charset2 = charset;
        if (charset == null) {
            charset2 = Charsets.UTF_8;
        }
        return charset2;
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final ResponseBody create(MediaType mediaType, long j, BufferedSource bufferedSource) {
        return Companion.create(mediaType, j, bufferedSource);
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final ResponseBody create(MediaType mediaType, ByteString byteString) {
        return Companion.create(mediaType, byteString);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(BufferedSource bufferedSource, MediaType mediaType, long j) {
        return Companion.create(bufferedSource, mediaType, j);
    }

    public static final ResponseBody create(ByteString byteString, MediaType mediaType) {
        return Companion.create(byteString, mediaType);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final ByteString byteString() throws IOException {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException(Intrinsics.stringPlus("Cannot buffer entire body for content length: ", Long.valueOf(contentLength)));
        }
        BufferedSource source = source();
        try {
            ByteString readByteString = source.readByteString();
            CloseableKt.closeFinally(source, null);
            int size = readByteString.size();
            if (contentLength == -1 || contentLength == size) {
                return readByteString;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + size + ") disagree");
        } finally {
        }
    }

    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException(Intrinsics.stringPlus("Cannot buffer entire body for content length: ", Long.valueOf(contentLength)));
        }
        BufferedSource source = source();
        try {
            byte[] readByteArray = source.readByteArray();
            CloseableKt.closeFinally(source, null);
            int length = readByteArray.length;
            if (contentLength == -1 || contentLength == length) {
                return readByteArray;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        Reader reader2 = reader;
        if (reader == null) {
            reader2 = new BomAwareReader(source(), charset());
            this.reader = reader2;
        }
        return reader2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract BufferedSource source();

    public final String string() throws IOException {
        BufferedSource source = source();
        try {
            String readString = source.readString(Util.readBomAsCharset(source, charset()));
            CloseableKt.closeFinally(source, null);
            return readString;
        } finally {
        }
    }
}
