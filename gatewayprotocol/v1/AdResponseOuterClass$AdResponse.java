package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.ErrorOuterClass$Error;
import gatewayprotocol.v1.WebviewConfiguration$WebViewConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: AdResponseOuterClass$AdResponse.class */
public final class AdResponseOuterClass$AdResponse extends GeneratedMessageLite<AdResponseOuterClass$AdResponse, Builder> implements MessageLiteOrBuilder {
    public static final int AD_DATA_FIELD_NUMBER = 6;
    public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 5;
    public static final int AD_DATA_VERSION_FIELD_NUMBER = 7;
    private static final AdResponseOuterClass$AdResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 8;
    public static final int IMPRESSION_CONFIGURATION_FIELD_NUMBER = 2;
    public static final int IMPRESSION_CONFIGURATION_VERSION_FIELD_NUMBER = 3;
    private static volatile Parser<AdResponseOuterClass$AdResponse> PARSER;
    public static final int TRACKING_TOKEN_FIELD_NUMBER = 1;
    public static final int WEBVIEW_CONFIGURATION_FIELD_NUMBER = 4;
    private ByteString adDataRefreshToken_;
    private int adDataVersion_;
    private ByteString adData_;
    private int bitField0_;
    private ErrorOuterClass$Error error_;
    private int impressionConfigurationVersion_;
    private ByteString impressionConfiguration_;
    private ByteString trackingToken_;
    private WebviewConfiguration$WebViewConfiguration webviewConfiguration_;

    /* loaded from: AdResponseOuterClass$AdResponse$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private Builder() {
            super(AdResponseOuterClass$AdResponse.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(AdResponseOuterClass$1 adResponseOuterClass$1) {
            this();
        }

        public Builder setAdData(ByteString byteString) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) this.instance).setAdData(byteString);
            return this;
        }

        public Builder setAdDataRefreshToken(ByteString byteString) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) this.instance).setAdDataRefreshToken(byteString);
            return this;
        }

        public Builder setAdDataVersion(int i) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) this.instance).setAdDataVersion(i);
            return this;
        }

        public Builder setError(ErrorOuterClass$Error errorOuterClass$Error) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) this.instance).setError(errorOuterClass$Error);
            return this;
        }

        public Builder setImpressionConfiguration(ByteString byteString) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) this.instance).setImpressionConfiguration(byteString);
            return this;
        }

        public Builder setImpressionConfigurationVersion(int i) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) this.instance).setImpressionConfigurationVersion(i);
            return this;
        }

        public Builder setTrackingToken(ByteString byteString) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) this.instance).setTrackingToken(byteString);
            return this;
        }

        public Builder setWebviewConfiguration(WebviewConfiguration$WebViewConfiguration webviewConfiguration$WebViewConfiguration) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) this.instance).setWebviewConfiguration(webviewConfiguration$WebViewConfiguration);
            return this;
        }
    }

    static {
        AdResponseOuterClass$AdResponse adResponseOuterClass$AdResponse = new AdResponseOuterClass$AdResponse();
        DEFAULT_INSTANCE = adResponseOuterClass$AdResponse;
        GeneratedMessageLite.registerDefaultInstance(AdResponseOuterClass$AdResponse.class, adResponseOuterClass$AdResponse);
    }

    private AdResponseOuterClass$AdResponse() {
        ByteString byteString = ByteString.EMPTY;
        this.trackingToken_ = byteString;
        this.impressionConfiguration_ = byteString;
        this.adDataRefreshToken_ = byteString;
        this.adData_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdData() {
        this.adData_ = getDefaultInstance().getAdData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdDataRefreshToken() {
        this.adDataRefreshToken_ = getDefaultInstance().getAdDataRefreshToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdDataVersion() {
        this.adDataVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        this.error_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImpressionConfiguration() {
        this.impressionConfiguration_ = getDefaultInstance().getImpressionConfiguration();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImpressionConfigurationVersion() {
        this.impressionConfigurationVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackingToken() {
        this.trackingToken_ = getDefaultInstance().getTrackingToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebviewConfiguration() {
        this.webviewConfiguration_ = null;
        this.bitField0_ &= -2;
    }

    public static AdResponseOuterClass$AdResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeError(ErrorOuterClass$Error errorOuterClass$Error) {
        errorOuterClass$Error.getClass();
        ErrorOuterClass$Error errorOuterClass$Error2 = this.error_;
        if (errorOuterClass$Error2 == null || errorOuterClass$Error2 == ErrorOuterClass$Error.getDefaultInstance()) {
            this.error_ = errorOuterClass$Error;
        } else {
            this.error_ = (ErrorOuterClass$Error) ((ErrorOuterClass$Error.Builder) ErrorOuterClass$Error.newBuilder(this.error_).mergeFrom((ErrorOuterClass$Error.Builder) errorOuterClass$Error)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWebviewConfiguration(WebviewConfiguration$WebViewConfiguration webviewConfiguration$WebViewConfiguration) {
        webviewConfiguration$WebViewConfiguration.getClass();
        WebviewConfiguration$WebViewConfiguration webviewConfiguration$WebViewConfiguration2 = this.webviewConfiguration_;
        if (webviewConfiguration$WebViewConfiguration2 == null || webviewConfiguration$WebViewConfiguration2 == WebviewConfiguration$WebViewConfiguration.getDefaultInstance()) {
            this.webviewConfiguration_ = webviewConfiguration$WebViewConfiguration;
        } else {
            this.webviewConfiguration_ = (WebviewConfiguration$WebViewConfiguration) ((WebviewConfiguration$WebViewConfiguration.Builder) WebviewConfiguration$WebViewConfiguration.newBuilder(this.webviewConfiguration_).mergeFrom((WebviewConfiguration$WebViewConfiguration.Builder) webviewConfiguration$WebViewConfiguration)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AdResponseOuterClass$AdResponse adResponseOuterClass$AdResponse) {
        return DEFAULT_INSTANCE.createBuilder(adResponseOuterClass$AdResponse);
    }

    public static AdResponseOuterClass$AdResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AdResponseOuterClass$AdResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AdResponseOuterClass$AdResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AdResponseOuterClass$AdResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AdResponseOuterClass$AdResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AdResponseOuterClass$AdResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AdResponseOuterClass$AdResponse parseFrom(InputStream inputStream) throws IOException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AdResponseOuterClass$AdResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AdResponseOuterClass$AdResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AdResponseOuterClass$AdResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AdResponseOuterClass$AdResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AdResponseOuterClass$AdResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<AdResponseOuterClass$AdResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdData(ByteString byteString) {
        byteString.getClass();
        this.adData_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdDataRefreshToken(ByteString byteString) {
        byteString.getClass();
        this.adDataRefreshToken_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdDataVersion(int i) {
        this.adDataVersion_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setError(ErrorOuterClass$Error errorOuterClass$Error) {
        errorOuterClass$Error.getClass();
        this.error_ = errorOuterClass$Error;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpressionConfiguration(ByteString byteString) {
        byteString.getClass();
        this.impressionConfiguration_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpressionConfigurationVersion(int i) {
        this.impressionConfigurationVersion_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackingToken(ByteString byteString) {
        byteString.getClass();
        this.trackingToken_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebviewConfiguration(WebviewConfiguration$WebViewConfiguration webviewConfiguration$WebViewConfiguration) {
        webviewConfiguration$WebViewConfiguration.getClass();
        this.webviewConfiguration_ = webviewConfiguration$WebViewConfiguration;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AdResponseOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new AdResponseOuterClass$AdResponse();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\b��\u0001\u0001\b\b������\u0001\n\u0002\n\u0003\u0004\u0004ဉ��\u0005\n\u0006\n\u0007\u0004\bဉ\u0001", new Object[]{"bitField0_", "trackingToken_", "impressionConfiguration_", "impressionConfigurationVersion_", "webviewConfiguration_", "adDataRefreshToken_", "adData_", "adDataVersion_", "error_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AdResponseOuterClass$AdResponse> parser = PARSER;
                Parser<AdResponseOuterClass$AdResponse> parser2 = parser;
                if (parser == null) {
                    synchronized (AdResponseOuterClass$AdResponse.class) {
                        try {
                            Parser<AdResponseOuterClass$AdResponse> parser3 = PARSER;
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

    public ByteString getAdData() {
        return this.adData_;
    }

    public ByteString getAdDataRefreshToken() {
        return this.adDataRefreshToken_;
    }

    public int getAdDataVersion() {
        return this.adDataVersion_;
    }

    public ErrorOuterClass$Error getError() {
        ErrorOuterClass$Error errorOuterClass$Error = this.error_;
        ErrorOuterClass$Error errorOuterClass$Error2 = errorOuterClass$Error;
        if (errorOuterClass$Error == null) {
            errorOuterClass$Error2 = ErrorOuterClass$Error.getDefaultInstance();
        }
        return errorOuterClass$Error2;
    }

    public ByteString getImpressionConfiguration() {
        return this.impressionConfiguration_;
    }

    public int getImpressionConfigurationVersion() {
        return this.impressionConfigurationVersion_;
    }

    public ByteString getTrackingToken() {
        return this.trackingToken_;
    }

    public WebviewConfiguration$WebViewConfiguration getWebviewConfiguration() {
        WebviewConfiguration$WebViewConfiguration webviewConfiguration$WebViewConfiguration = this.webviewConfiguration_;
        WebviewConfiguration$WebViewConfiguration webviewConfiguration$WebViewConfiguration2 = webviewConfiguration$WebViewConfiguration;
        if (webviewConfiguration$WebViewConfiguration == null) {
            webviewConfiguration$WebViewConfiguration2 = WebviewConfiguration$WebViewConfiguration.getDefaultInstance();
        }
        return webviewConfiguration$WebViewConfiguration2;
    }

    public boolean hasError() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasWebviewConfiguration() {
        boolean z = true;
        if ((this.bitField0_ & 1) == 0) {
            z = false;
        }
        return z;
    }
}
