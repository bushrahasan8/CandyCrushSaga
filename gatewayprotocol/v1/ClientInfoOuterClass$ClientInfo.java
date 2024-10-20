package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
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

/* loaded from: ClientInfoOuterClass$ClientInfo.class */
public final class ClientInfoOuterClass$ClientInfo extends GeneratedMessageLite<ClientInfoOuterClass$ClientInfo, Builder> implements MessageLiteOrBuilder {
    public static final int CUSTOM_MEDIATION_NAME_FIELD_NUMBER = 7;
    private static final ClientInfoOuterClass$ClientInfo DEFAULT_INSTANCE;
    public static final int GAME_ID_FIELD_NUMBER = 3;
    public static final int MEDIATION_PROVIDER_FIELD_NUMBER = 6;
    public static final int MEDIATION_VERSION_FIELD_NUMBER = 8;
    private static volatile Parser<ClientInfoOuterClass$ClientInfo> PARSER;
    public static final int PLATFORM_FIELD_NUMBER = 5;
    public static final int SDK_VERSION_FIELD_NUMBER = 1;
    public static final int SDK_VERSION_NAME_FIELD_NUMBER = 2;
    public static final int TEST_FIELD_NUMBER = 4;
    private int bitField0_;
    private int mediationProvider_;
    private int platform_;
    private int sdkVersion_;
    private boolean test_;
    private String sdkVersionName_ = "";
    private String gameId_ = "";
    private String customMediationName_ = "";
    private String mediationVersion_ = "";

    /* loaded from: ClientInfoOuterClass$ClientInfo$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private Builder() {
            super(ClientInfoOuterClass$ClientInfo.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(ClientInfoOuterClass$1 clientInfoOuterClass$1) {
            this();
        }

        public ClientInfoOuterClass$MediationProvider getMediationProvider() {
            return ((ClientInfoOuterClass$ClientInfo) this.instance).getMediationProvider();
        }

        public Builder setCustomMediationName(String str) {
            copyOnWrite();
            ((ClientInfoOuterClass$ClientInfo) this.instance).setCustomMediationName(str);
            return this;
        }

        public Builder setGameId(String str) {
            copyOnWrite();
            ((ClientInfoOuterClass$ClientInfo) this.instance).setGameId(str);
            return this;
        }

        public Builder setMediationProvider(ClientInfoOuterClass$MediationProvider clientInfoOuterClass$MediationProvider) {
            copyOnWrite();
            ((ClientInfoOuterClass$ClientInfo) this.instance).setMediationProvider(clientInfoOuterClass$MediationProvider);
            return this;
        }

        public Builder setMediationVersion(String str) {
            copyOnWrite();
            ((ClientInfoOuterClass$ClientInfo) this.instance).setMediationVersion(str);
            return this;
        }

        public Builder setPlatform(ClientInfoOuterClass$Platform clientInfoOuterClass$Platform) {
            copyOnWrite();
            ((ClientInfoOuterClass$ClientInfo) this.instance).setPlatform(clientInfoOuterClass$Platform);
            return this;
        }

        public Builder setSdkVersion(int i) {
            copyOnWrite();
            ((ClientInfoOuterClass$ClientInfo) this.instance).setSdkVersion(i);
            return this;
        }

        public Builder setSdkVersionName(String str) {
            copyOnWrite();
            ((ClientInfoOuterClass$ClientInfo) this.instance).setSdkVersionName(str);
            return this;
        }

        public Builder setTest(boolean z) {
            copyOnWrite();
            ((ClientInfoOuterClass$ClientInfo) this.instance).setTest(z);
            return this;
        }
    }

    static {
        ClientInfoOuterClass$ClientInfo clientInfoOuterClass$ClientInfo = new ClientInfoOuterClass$ClientInfo();
        DEFAULT_INSTANCE = clientInfoOuterClass$ClientInfo;
        GeneratedMessageLite.registerDefaultInstance(ClientInfoOuterClass$ClientInfo.class, clientInfoOuterClass$ClientInfo);
    }

    private ClientInfoOuterClass$ClientInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustomMediationName() {
        this.bitField0_ &= -2;
        this.customMediationName_ = getDefaultInstance().getCustomMediationName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameId() {
        this.gameId_ = getDefaultInstance().getGameId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediationProvider() {
        this.mediationProvider_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediationVersion() {
        this.bitField0_ &= -3;
        this.mediationVersion_ = getDefaultInstance().getMediationVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlatform() {
        this.platform_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkVersion() {
        this.sdkVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkVersionName() {
        this.sdkVersionName_ = getDefaultInstance().getSdkVersionName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTest() {
        this.test_ = false;
    }

    public static ClientInfoOuterClass$ClientInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ClientInfoOuterClass$ClientInfo clientInfoOuterClass$ClientInfo) {
        return DEFAULT_INSTANCE.createBuilder(clientInfoOuterClass$ClientInfo);
    }

    public static ClientInfoOuterClass$ClientInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ClientInfoOuterClass$ClientInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientInfoOuterClass$ClientInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClientInfoOuterClass$ClientInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClientInfoOuterClass$ClientInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ClientInfoOuterClass$ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ClientInfoOuterClass$ClientInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClientInfoOuterClass$ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ClientInfoOuterClass$ClientInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ClientInfoOuterClass$ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ClientInfoOuterClass$ClientInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClientInfoOuterClass$ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static ClientInfoOuterClass$ClientInfo parseFrom(InputStream inputStream) throws IOException {
        return (ClientInfoOuterClass$ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientInfoOuterClass$ClientInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClientInfoOuterClass$ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClientInfoOuterClass$ClientInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ClientInfoOuterClass$ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ClientInfoOuterClass$ClientInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClientInfoOuterClass$ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ClientInfoOuterClass$ClientInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ClientInfoOuterClass$ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClientInfoOuterClass$ClientInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClientInfoOuterClass$ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<ClientInfoOuterClass$ClientInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomMediationName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.customMediationName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomMediationNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.customMediationName_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameId(String str) {
        str.getClass();
        this.gameId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.gameId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediationProvider(ClientInfoOuterClass$MediationProvider clientInfoOuterClass$MediationProvider) {
        this.mediationProvider_ = clientInfoOuterClass$MediationProvider.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediationProviderValue(int i) {
        this.mediationProvider_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediationVersion(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.mediationVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediationVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.mediationVersion_ = byteString.toStringUtf8();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatform(ClientInfoOuterClass$Platform clientInfoOuterClass$Platform) {
        this.platform_ = clientInfoOuterClass$Platform.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformValue(int i) {
        this.platform_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersion(int i) {
        this.sdkVersion_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersionName(String str) {
        str.getClass();
        this.sdkVersionName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersionNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sdkVersionName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTest(boolean z) {
        this.test_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (ClientInfoOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new ClientInfoOuterClass$ClientInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\b��\u0001\u0001\b\b������\u0001\u000b\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005\f\u0006\f\u0007ለ��\bለ\u0001", new Object[]{"bitField0_", "sdkVersion_", "sdkVersionName_", "gameId_", "test_", "platform_", "mediationProvider_", "customMediationName_", "mediationVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ClientInfoOuterClass$ClientInfo> parser = PARSER;
                Parser<ClientInfoOuterClass$ClientInfo> parser2 = parser;
                if (parser == null) {
                    synchronized (ClientInfoOuterClass$ClientInfo.class) {
                        try {
                            Parser<ClientInfoOuterClass$ClientInfo> parser3 = PARSER;
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

    public String getCustomMediationName() {
        return this.customMediationName_;
    }

    public ByteString getCustomMediationNameBytes() {
        return ByteString.copyFromUtf8(this.customMediationName_);
    }

    public String getGameId() {
        return this.gameId_;
    }

    public ByteString getGameIdBytes() {
        return ByteString.copyFromUtf8(this.gameId_);
    }

    public ClientInfoOuterClass$MediationProvider getMediationProvider() {
        ClientInfoOuterClass$MediationProvider forNumber = ClientInfoOuterClass$MediationProvider.forNumber(this.mediationProvider_);
        ClientInfoOuterClass$MediationProvider clientInfoOuterClass$MediationProvider = forNumber;
        if (forNumber == null) {
            clientInfoOuterClass$MediationProvider = ClientInfoOuterClass$MediationProvider.UNRECOGNIZED;
        }
        return clientInfoOuterClass$MediationProvider;
    }

    public int getMediationProviderValue() {
        return this.mediationProvider_;
    }

    public String getMediationVersion() {
        return this.mediationVersion_;
    }

    public ByteString getMediationVersionBytes() {
        return ByteString.copyFromUtf8(this.mediationVersion_);
    }

    public ClientInfoOuterClass$Platform getPlatform() {
        ClientInfoOuterClass$Platform forNumber = ClientInfoOuterClass$Platform.forNumber(this.platform_);
        ClientInfoOuterClass$Platform clientInfoOuterClass$Platform = forNumber;
        if (forNumber == null) {
            clientInfoOuterClass$Platform = ClientInfoOuterClass$Platform.UNRECOGNIZED;
        }
        return clientInfoOuterClass$Platform;
    }

    public int getPlatformValue() {
        return this.platform_;
    }

    public int getSdkVersion() {
        return this.sdkVersion_;
    }

    public String getSdkVersionName() {
        return this.sdkVersionName_;
    }

    public ByteString getSdkVersionNameBytes() {
        return ByteString.copyFromUtf8(this.sdkVersionName_);
    }

    public boolean getTest() {
        return this.test_;
    }

    public boolean hasCustomMediationName() {
        boolean z = true;
        if ((this.bitField0_ & 1) == 0) {
            z = false;
        }
        return z;
    }

    public boolean hasMediationVersion() {
        return (this.bitField0_ & 2) != 0;
    }
}
