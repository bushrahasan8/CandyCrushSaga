package okio;

import java.nio.channels.WritableByteChannel;

/* loaded from: BufferedSink.class */
public interface BufferedSink extends Sink, WritableByteChannel {
    BufferedSink emit();

    BufferedSink emitCompleteSegments();

    @Override // okio.Sink, java.io.Flushable
    void flush();

    Buffer getBuffer();

    BufferedSink write(ByteString byteString);

    BufferedSink write(byte[] bArr);

    BufferedSink write(byte[] bArr, int i, int i2);

    long writeAll(Source source);

    BufferedSink writeByte(int i);

    BufferedSink writeDecimalLong(long j);

    BufferedSink writeHexadecimalUnsignedLong(long j);

    BufferedSink writeInt(int i);

    BufferedSink writeShort(int i);

    BufferedSink writeUtf8(String str);
}
