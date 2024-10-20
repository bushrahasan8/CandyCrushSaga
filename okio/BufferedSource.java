package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: BufferedSource.class */
public interface BufferedSource extends Source, ReadableByteChannel {
    boolean exhausted();

    Buffer getBuffer();

    InputStream inputStream();

    long readAll(Sink sink);

    byte readByte();

    byte[] readByteArray();

    byte[] readByteArray(long j);

    ByteString readByteString();

    ByteString readByteString(long j);

    long readDecimalLong();

    long readHexadecimalUnsignedLong();

    int readInt();

    short readShort();

    String readString(Charset charset);

    String readUtf8LineStrict();

    String readUtf8LineStrict(long j);

    void require(long j);

    int select(Options options);

    void skip(long j);
}
