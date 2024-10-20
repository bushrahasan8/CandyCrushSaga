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

/* loaded from: PiiOuterClass$Pii.class */
public final class PiiOuterClass$Pii extends GeneratedMessageLite<PiiOuterClass$Pii, Builder> implements MessageLiteOrBuilder {
    public static final int ADVERTISING_ID_FIELD_NUMBER = 1;
    private static final PiiOuterClass$Pii DEFAULT_INSTANCE;
    public static final int OPEN_ADVERTISING_TRACKING_ID_FIELD_NUMBER = 3;
    private static volatile Parser<PiiOuterClass$Pii> PARSER;
    public static final int VENDOR_ID_FIELD_NUMBER = 2;
    private ByteString advertisingId_;
    private ByteString openAdvertisingTrackingId_;
    private ByteString vendorId_;

    /* loaded from: PiiOuterClass$Pii$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private Builder() {
            super(PiiOuterClass$Pii.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(PiiOuterClass$1 piiOuterClass$1) {
            this();
        }

        public Builder setAdvertisingId(ByteString byteString) {
            copyOnWrite();
            ((PiiOuterClass$Pii) this.instance).setAdvertisingId(byteString);
            return this;
        }

        public Builder setOpenAdvertisingTrackingId(ByteString byteString) {
            copyOnWrite();
            ((PiiOuterClass$Pii) this.instance).setOpenAdvertisingTrackingId(byteString);
            return this;
        }
    }

    static {
        PiiOuterClass$Pii piiOuterClass$Pii = new PiiOuterClass$Pii();
        DEFAULT_INSTANCE = piiOuterClass$Pii;
        GeneratedMessageLite.registerDefaultInstance(PiiOuterClass$Pii.class, piiOuterClass$Pii);
    }

    private PiiOuterClass$Pii() {
        ByteString byteString = ByteString.EMPTY;
        this.advertisingId_ = byteString;
        this.vendorId_ = byteString;
        this.openAdvertisingTrackingId_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvertisingId() {
        this.advertisingId_ = getDefaultInstance().getAdvertisingId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpenAdvertisingTrackingId() {
        this.openAdvertisingTrackingId_ = getDefaultInstance().getOpenAdvertisingTrackingId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVendorId() {
        this.vendorId_ = getDefaultInstance().getVendorId();
    }

    public static PiiOuterClass$Pii getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(PiiOuterClass$Pii piiOuterClass$Pii) {
        return DEFAULT_INSTANCE.createBuilder(piiOuterClass$Pii);
    }

    public static PiiOuterClass$Pii parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PiiOuterClass$Pii) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PiiOuterClass$Pii parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PiiOuterClass$Pii) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PiiOuterClass$Pii parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PiiOuterClass$Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PiiOuterClass$Pii parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PiiOuterClass$Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PiiOuterClass$Pii parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PiiOuterClass$Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PiiOuterClass$Pii parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PiiOuterClass$Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static PiiOuterClass$Pii parseFrom(InputStream inputStream) throws IOException {
        return (PiiOuterClass$Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PiiOuterClass$Pii parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PiiOuterClass$Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PiiOuterClass$Pii parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PiiOuterClass$Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static PiiOuterClass$Pii parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PiiOuterClass$Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PiiOuterClass$Pii parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PiiOuterClass$Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PiiOuterClass$Pii parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PiiOuterClass$Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<PiiOuterClass$Pii> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvertisingId(ByteString byteString) {
        byteString.getClass();
        this.advertisingId_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenAdvertisingTrackingId(ByteString byteString) {
        byteString.getClass();
        this.openAdvertisingTrackingId_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVendorId(ByteString byteString) {
        byteString.getClass();
        this.vendorId_ = byteString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (PiiOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new PiiOuterClass$Pii();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\u0003����\u0001\u0003\u0003������\u0001\n\u0002\n\u0003\n", new Object[]{"advertisingId_", "vendorId_", "openAdvertisingTrackingId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PiiOuterClass$Pii> parser = PARSER;
                Parser<PiiOuterClass$Pii> parser2 = parser;
                if (parser == null) {
                    synchronized (PiiOuterClass$Pii.class) {
                        try {
                            Parser<PiiOuterClass$Pii> parser3 = PARSER;
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

    public ByteString getAdvertisingId() {
        return this.advertisingId_;
    }

    public ByteString getOpenAdvertisingTrackingId() {
        return this.openAdvertisingTrackingId_;
    }

    public ByteString getVendorId() {
        return this.vendorId_;
    }
}
