package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: TimestampsOuterClass$Timestamps.class */
public final class TimestampsOuterClass$Timestamps extends GeneratedMessageLite<TimestampsOuterClass$Timestamps, Builder> implements MessageLiteOrBuilder {
    private static final TimestampsOuterClass$Timestamps DEFAULT_INSTANCE;
    private static volatile Parser<TimestampsOuterClass$Timestamps> PARSER;
    public static final int SESSION_TIMESTAMP_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private long sessionTimestamp_;
    private Timestamp timestamp_;

    /* loaded from: TimestampsOuterClass$Timestamps$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private Builder() {
            super(TimestampsOuterClass$Timestamps.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(TimestampsOuterClass$1 timestampsOuterClass$1) {
            this();
        }

        public Builder setSessionTimestamp(long j) {
            copyOnWrite();
            ((TimestampsOuterClass$Timestamps) this.instance).setSessionTimestamp(j);
            return this;
        }

        public Builder setTimestamp(Timestamp timestamp) {
            copyOnWrite();
            ((TimestampsOuterClass$Timestamps) this.instance).setTimestamp(timestamp);
            return this;
        }
    }

    static {
        TimestampsOuterClass$Timestamps timestampsOuterClass$Timestamps = new TimestampsOuterClass$Timestamps();
        DEFAULT_INSTANCE = timestampsOuterClass$Timestamps;
        GeneratedMessageLite.registerDefaultInstance(TimestampsOuterClass$Timestamps.class, timestampsOuterClass$Timestamps);
    }

    private TimestampsOuterClass$Timestamps() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionTimestamp() {
        this.sessionTimestamp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = null;
    }

    public static TimestampsOuterClass$Timestamps getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.timestamp_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.timestamp_ = timestamp;
        } else {
            this.timestamp_ = Timestamp.newBuilder(this.timestamp_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(TimestampsOuterClass$Timestamps timestampsOuterClass$Timestamps) {
        return DEFAULT_INSTANCE.createBuilder(timestampsOuterClass$Timestamps);
    }

    public static TimestampsOuterClass$Timestamps parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TimestampsOuterClass$Timestamps) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TimestampsOuterClass$Timestamps parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TimestampsOuterClass$Timestamps) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TimestampsOuterClass$Timestamps parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TimestampsOuterClass$Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TimestampsOuterClass$Timestamps parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TimestampsOuterClass$Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TimestampsOuterClass$Timestamps parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TimestampsOuterClass$Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TimestampsOuterClass$Timestamps parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TimestampsOuterClass$Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static TimestampsOuterClass$Timestamps parseFrom(InputStream inputStream) throws IOException {
        return (TimestampsOuterClass$Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TimestampsOuterClass$Timestamps parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TimestampsOuterClass$Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TimestampsOuterClass$Timestamps parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TimestampsOuterClass$Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TimestampsOuterClass$Timestamps parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TimestampsOuterClass$Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TimestampsOuterClass$Timestamps parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TimestampsOuterClass$Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TimestampsOuterClass$Timestamps parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TimestampsOuterClass$Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<TimestampsOuterClass$Timestamps> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionTimestamp(long j) {
        this.sessionTimestamp_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        this.timestamp_ = timestamp;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (TimestampsOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TimestampsOuterClass$Timestamps();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001\t\u0002\u0002", new Object[]{"timestamp_", "sessionTimestamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TimestampsOuterClass$Timestamps> parser = PARSER;
                Parser<TimestampsOuterClass$Timestamps> parser2 = parser;
                if (parser == null) {
                    synchronized (TimestampsOuterClass$Timestamps.class) {
                        try {
                            Parser<TimestampsOuterClass$Timestamps> parser3 = PARSER;
                            parser2 = parser3;
                            if (parser3 == null) {
                                parser2 = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return parser2;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public long getSessionTimestamp() {
        return this.sessionTimestamp_;
    }

    public Timestamp getTimestamp() {
        Timestamp timestamp = this.timestamp_;
        Timestamp timestamp2 = timestamp;
        if (timestamp == null) {
            timestamp2 = Timestamp.getDefaultInstance();
        }
        return timestamp2;
    }

    public boolean hasTimestamp() {
        return this.timestamp_ != null;
    }
}
