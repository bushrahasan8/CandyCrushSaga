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

/* loaded from: AdRequestOuterClass$BannerSize.class */
public final class AdRequestOuterClass$BannerSize extends GeneratedMessageLite<AdRequestOuterClass$BannerSize, Builder> implements MessageLiteOrBuilder {
    private static final AdRequestOuterClass$BannerSize DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    private static volatile Parser<AdRequestOuterClass$BannerSize> PARSER;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private int height_;
    private int width_;

    /* loaded from: AdRequestOuterClass$BannerSize$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private Builder() {
            super(AdRequestOuterClass$BannerSize.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(AdRequestOuterClass$1 adRequestOuterClass$1) {
            this();
        }

        public Builder setHeight(int i) {
            copyOnWrite();
            ((AdRequestOuterClass$BannerSize) this.instance).setHeight(i);
            return this;
        }

        public Builder setWidth(int i) {
            copyOnWrite();
            ((AdRequestOuterClass$BannerSize) this.instance).setWidth(i);
            return this;
        }
    }

    static {
        AdRequestOuterClass$BannerSize adRequestOuterClass$BannerSize = new AdRequestOuterClass$BannerSize();
        DEFAULT_INSTANCE = adRequestOuterClass$BannerSize;
        GeneratedMessageLite.registerDefaultInstance(AdRequestOuterClass$BannerSize.class, adRequestOuterClass$BannerSize);
    }

    private AdRequestOuterClass$BannerSize() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0;
    }

    public static AdRequestOuterClass$BannerSize getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AdRequestOuterClass$BannerSize adRequestOuterClass$BannerSize) {
        return DEFAULT_INSTANCE.createBuilder(adRequestOuterClass$BannerSize);
    }

    public static AdRequestOuterClass$BannerSize parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdRequestOuterClass$BannerSize) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AdRequestOuterClass$BannerSize parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdRequestOuterClass$BannerSize) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AdRequestOuterClass$BannerSize parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AdRequestOuterClass$BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AdRequestOuterClass$BannerSize parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AdRequestOuterClass$BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AdRequestOuterClass$BannerSize parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AdRequestOuterClass$BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AdRequestOuterClass$BannerSize parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdRequestOuterClass$BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AdRequestOuterClass$BannerSize parseFrom(InputStream inputStream) throws IOException {
        return (AdRequestOuterClass$BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AdRequestOuterClass$BannerSize parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdRequestOuterClass$BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AdRequestOuterClass$BannerSize parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AdRequestOuterClass$BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AdRequestOuterClass$BannerSize parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AdRequestOuterClass$BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AdRequestOuterClass$BannerSize parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AdRequestOuterClass$BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AdRequestOuterClass$BannerSize parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AdRequestOuterClass$BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<AdRequestOuterClass$BannerSize> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i) {
        this.height_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(int i) {
        this.width_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AdRequestOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new AdRequestOuterClass$BannerSize();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001\u0004\u0002\u0004", new Object[]{"width_", "height_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AdRequestOuterClass$BannerSize> parser = PARSER;
                Parser<AdRequestOuterClass$BannerSize> parser2 = parser;
                if (parser == null) {
                    synchronized (AdRequestOuterClass$BannerSize.class) {
                        try {
                            Parser<AdRequestOuterClass$BannerSize> parser3 = PARSER;
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

    public int getHeight() {
        return this.height_;
    }

    public int getWidth() {
        return this.width_;
    }
}
