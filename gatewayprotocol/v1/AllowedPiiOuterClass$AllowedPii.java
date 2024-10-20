package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: AllowedPiiOuterClass$AllowedPii.class */
public final class AllowedPiiOuterClass$AllowedPii extends GeneratedMessageLite<AllowedPiiOuterClass$AllowedPii, Builder> implements MessageLiteOrBuilder {
    private static final AllowedPiiOuterClass$AllowedPii DEFAULT_INSTANCE;
    public static final int IDFA_FIELD_NUMBER = 1;
    public static final int IDFV_FIELD_NUMBER = 2;
    private static volatile Parser<AllowedPiiOuterClass$AllowedPii> PARSER;
    private boolean idfa_;
    private boolean idfv_;

    /* loaded from: AllowedPiiOuterClass$AllowedPii$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private Builder() {
            super(AllowedPiiOuterClass$AllowedPii.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(AllowedPiiOuterClass$1 allowedPiiOuterClass$1) {
            this();
        }

        public boolean getIdfa() {
            return ((AllowedPiiOuterClass$AllowedPii) this.instance).getIdfa();
        }

        public boolean getIdfv() {
            return ((AllowedPiiOuterClass$AllowedPii) this.instance).getIdfv();
        }

        public Builder setIdfa(boolean z) {
            copyOnWrite();
            ((AllowedPiiOuterClass$AllowedPii) this.instance).setIdfa(z);
            return this;
        }

        public Builder setIdfv(boolean z) {
            copyOnWrite();
            ((AllowedPiiOuterClass$AllowedPii) this.instance).setIdfv(z);
            return this;
        }
    }

    static {
        AllowedPiiOuterClass$AllowedPii allowedPiiOuterClass$AllowedPii = new AllowedPiiOuterClass$AllowedPii();
        DEFAULT_INSTANCE = allowedPiiOuterClass$AllowedPii;
        GeneratedMessageLite.registerDefaultInstance(AllowedPiiOuterClass$AllowedPii.class, allowedPiiOuterClass$AllowedPii);
    }

    private AllowedPiiOuterClass$AllowedPii() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdfa() {
        this.idfa_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdfv() {
        this.idfv_ = false;
    }

    public static AllowedPiiOuterClass$AllowedPii getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AllowedPiiOuterClass$AllowedPii allowedPiiOuterClass$AllowedPii) {
        return DEFAULT_INSTANCE.createBuilder(allowedPiiOuterClass$AllowedPii);
    }

    public static AllowedPiiOuterClass$AllowedPii parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AllowedPiiOuterClass$AllowedPii) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AllowedPiiOuterClass$AllowedPii parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AllowedPiiOuterClass$AllowedPii) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AllowedPiiOuterClass$AllowedPii parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AllowedPiiOuterClass$AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AllowedPiiOuterClass$AllowedPii parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AllowedPiiOuterClass$AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AllowedPiiOuterClass$AllowedPii parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AllowedPiiOuterClass$AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AllowedPiiOuterClass$AllowedPii parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AllowedPiiOuterClass$AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AllowedPiiOuterClass$AllowedPii parseFrom(InputStream inputStream) throws IOException {
        return (AllowedPiiOuterClass$AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AllowedPiiOuterClass$AllowedPii parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AllowedPiiOuterClass$AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AllowedPiiOuterClass$AllowedPii parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AllowedPiiOuterClass$AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AllowedPiiOuterClass$AllowedPii parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AllowedPiiOuterClass$AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AllowedPiiOuterClass$AllowedPii parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AllowedPiiOuterClass$AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AllowedPiiOuterClass$AllowedPii parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AllowedPiiOuterClass$AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<AllowedPiiOuterClass$AllowedPii> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdfa(boolean z) {
        this.idfa_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdfv(boolean z) {
        this.idfv_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AllowedPiiOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new AllowedPiiOuterClass$AllowedPii();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001\u0007\u0002\u0007", new Object[]{"idfa_", "idfv_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AllowedPiiOuterClass$AllowedPii> parser = PARSER;
                Parser<AllowedPiiOuterClass$AllowedPii> parser2 = parser;
                if (parser == null) {
                    synchronized (AllowedPiiOuterClass$AllowedPii.class) {
                        try {
                            Parser<AllowedPiiOuterClass$AllowedPii> parser3 = PARSER;
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

    public boolean getIdfa() {
        return this.idfa_;
    }

    public boolean getIdfv() {
        return this.idfv_;
    }
}
