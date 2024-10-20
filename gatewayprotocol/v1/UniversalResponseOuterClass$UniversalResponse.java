package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;
import gatewayprotocol.v1.AdResponseOuterClass$AdResponse;
import gatewayprotocol.v1.ErrorOuterClass$Error;
import gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponse;
import gatewayprotocol.v1.MutableDataOuterClass$MutableData;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: UniversalResponseOuterClass$UniversalResponse.class */
public final class UniversalResponseOuterClass$UniversalResponse extends GeneratedMessageLite<UniversalResponseOuterClass$UniversalResponse, Builder> implements MessageLiteOrBuilder {
    private static final UniversalResponseOuterClass$UniversalResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 3;
    public static final int MUTABLE_DATA_FIELD_NUMBER = 2;
    private static volatile Parser<UniversalResponseOuterClass$UniversalResponse> PARSER;
    public static final int PAYLOAD_FIELD_NUMBER = 1;
    private int bitField0_;
    private ErrorOuterClass$Error error_;
    private MutableDataOuterClass$MutableData mutableData_;
    private Payload payload_;

    /* loaded from: UniversalResponseOuterClass$UniversalResponse$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private Builder() {
            super(UniversalResponseOuterClass$UniversalResponse.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(UniversalResponseOuterClass$1 universalResponseOuterClass$1) {
            this();
        }

        public Builder setError(ErrorOuterClass$Error errorOuterClass$Error) {
            copyOnWrite();
            ((UniversalResponseOuterClass$UniversalResponse) this.instance).setError(errorOuterClass$Error);
            return this;
        }
    }

    /* loaded from: UniversalResponseOuterClass$UniversalResponse$Payload.class */
    public static final class Payload extends GeneratedMessageLite<Payload, Builder> implements MessageLiteOrBuilder {
        public static final int AD_DATA_REFRESH_RESPONSE_FIELD_NUMBER = 4;
        public static final int AD_PLAYER_CONFIG_RESPONSE_FIELD_NUMBER = 3;
        public static final int AD_RESPONSE_FIELD_NUMBER = 2;
        private static final Payload DEFAULT_INSTANCE;
        public static final int INITIALIZATION_RESPONSE_FIELD_NUMBER = 1;
        private static volatile Parser<Payload> PARSER;
        public static final int PRIVACY_UPDATE_RESPONSE_FIELD_NUMBER = 5;
        private int valueCase_ = 0;
        private Object value_;

        /* loaded from: UniversalResponseOuterClass$UniversalResponse$Payload$Builder.class */
        public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private Builder() {
                super(Payload.DEFAULT_INSTANCE);
            }

            /* synthetic */ Builder(UniversalResponseOuterClass$1 universalResponseOuterClass$1) {
                this();
            }
        }

        /* loaded from: UniversalResponseOuterClass$UniversalResponse$Payload$ValueCase.class */
        public enum ValueCase {
            INITIALIZATION_RESPONSE(1),
            AD_RESPONSE(2),
            AD_PLAYER_CONFIG_RESPONSE(3),
            AD_DATA_REFRESH_RESPONSE(4),
            PRIVACY_UPDATE_RESPONSE(5),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int i) {
                this.value = i;
            }

            public static ValueCase forNumber(int i) {
                if (i == 0) {
                    return VALUE_NOT_SET;
                }
                if (i == 1) {
                    return INITIALIZATION_RESPONSE;
                }
                if (i == 2) {
                    return AD_RESPONSE;
                }
                if (i == 3) {
                    return AD_PLAYER_CONFIG_RESPONSE;
                }
                if (i == 4) {
                    return AD_DATA_REFRESH_RESPONSE;
                }
                if (i != 5) {
                    return null;
                }
                return PRIVACY_UPDATE_RESPONSE;
            }
        }

        static {
            Payload payload = new Payload();
            DEFAULT_INSTANCE = payload;
            GeneratedMessageLite.registerDefaultInstance(Payload.class, payload);
        }

        private Payload() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdDataRefreshResponse() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdPlayerConfigResponse() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdResponse() {
            if (this.valueCase_ == 2) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitializationResponse() {
            if (this.valueCase_ == 1) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrivacyUpdateResponse() {
            if (this.valueCase_ == 5) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        public static Payload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAdDataRefreshResponse(AdDataRefreshResponseOuterClass$AdDataRefreshResponse adDataRefreshResponseOuterClass$AdDataRefreshResponse) {
            adDataRefreshResponseOuterClass$AdDataRefreshResponse.getClass();
            if (this.valueCase_ != 4 || this.value_ == AdDataRefreshResponseOuterClass$AdDataRefreshResponse.getDefaultInstance()) {
                this.value_ = adDataRefreshResponseOuterClass$AdDataRefreshResponse;
            } else {
                this.value_ = ((AdDataRefreshResponseOuterClass$AdDataRefreshResponse.Builder) AdDataRefreshResponseOuterClass$AdDataRefreshResponse.newBuilder((AdDataRefreshResponseOuterClass$AdDataRefreshResponse) this.value_).mergeFrom((AdDataRefreshResponseOuterClass$AdDataRefreshResponse.Builder) adDataRefreshResponseOuterClass$AdDataRefreshResponse)).buildPartial();
            }
            this.valueCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse adPlayerConfigResponseOuterClass$AdPlayerConfigResponse) {
            adPlayerConfigResponseOuterClass$AdPlayerConfigResponse.getClass();
            if (this.valueCase_ != 3 || this.value_ == AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse.getDefaultInstance()) {
                this.value_ = adPlayerConfigResponseOuterClass$AdPlayerConfigResponse;
            } else {
                this.value_ = ((AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse.Builder) AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse.newBuilder((AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse) this.value_).mergeFrom((AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse.Builder) adPlayerConfigResponseOuterClass$AdPlayerConfigResponse)).buildPartial();
            }
            this.valueCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAdResponse(AdResponseOuterClass$AdResponse adResponseOuterClass$AdResponse) {
            adResponseOuterClass$AdResponse.getClass();
            if (this.valueCase_ != 2 || this.value_ == AdResponseOuterClass$AdResponse.getDefaultInstance()) {
                this.value_ = adResponseOuterClass$AdResponse;
            } else {
                this.value_ = ((AdResponseOuterClass$AdResponse.Builder) AdResponseOuterClass$AdResponse.newBuilder((AdResponseOuterClass$AdResponse) this.value_).mergeFrom((AdResponseOuterClass$AdResponse.Builder) adResponseOuterClass$AdResponse)).buildPartial();
            }
            this.valueCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInitializationResponse(InitializationResponseOuterClass$InitializationResponse initializationResponseOuterClass$InitializationResponse) {
            initializationResponseOuterClass$InitializationResponse.getClass();
            if (this.valueCase_ != 1 || this.value_ == InitializationResponseOuterClass$InitializationResponse.getDefaultInstance()) {
                this.value_ = initializationResponseOuterClass$InitializationResponse;
            } else {
                this.value_ = ((InitializationResponseOuterClass$InitializationResponse.Builder) InitializationResponseOuterClass$InitializationResponse.newBuilder((InitializationResponseOuterClass$InitializationResponse) this.value_).mergeFrom((InitializationResponseOuterClass$InitializationResponse.Builder) initializationResponseOuterClass$InitializationResponse)).buildPartial();
            }
            this.valueCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePrivacyUpdateResponse(PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse privacyUpdateResponseOuterClass$PrivacyUpdateResponse) {
            privacyUpdateResponseOuterClass$PrivacyUpdateResponse.getClass();
            if (this.valueCase_ != 5 || this.value_ == PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse.getDefaultInstance()) {
                this.value_ = privacyUpdateResponseOuterClass$PrivacyUpdateResponse;
            } else {
                this.value_ = ((PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse.Builder) PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse.newBuilder((PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse) this.value_).mergeFrom((PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse.Builder) privacyUpdateResponseOuterClass$PrivacyUpdateResponse)).buildPartial();
            }
            this.valueCase_ = 5;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Payload payload) {
            return DEFAULT_INSTANCE.createBuilder(payload);
        }

        public static Payload parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Payload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Payload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Payload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Payload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Payload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Payload parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Payload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Payload parseFrom(InputStream inputStream) throws IOException {
            return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Payload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Payload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Payload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Payload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Payload parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Parser<Payload> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdDataRefreshResponse(AdDataRefreshResponseOuterClass$AdDataRefreshResponse adDataRefreshResponseOuterClass$AdDataRefreshResponse) {
            adDataRefreshResponseOuterClass$AdDataRefreshResponse.getClass();
            this.value_ = adDataRefreshResponseOuterClass$AdDataRefreshResponse;
            this.valueCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse adPlayerConfigResponseOuterClass$AdPlayerConfigResponse) {
            adPlayerConfigResponseOuterClass$AdPlayerConfigResponse.getClass();
            this.value_ = adPlayerConfigResponseOuterClass$AdPlayerConfigResponse;
            this.valueCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdResponse(AdResponseOuterClass$AdResponse adResponseOuterClass$AdResponse) {
            adResponseOuterClass$AdResponse.getClass();
            this.value_ = adResponseOuterClass$AdResponse;
            this.valueCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitializationResponse(InitializationResponseOuterClass$InitializationResponse initializationResponseOuterClass$InitializationResponse) {
            initializationResponseOuterClass$InitializationResponse.getClass();
            this.value_ = initializationResponseOuterClass$InitializationResponse;
            this.valueCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrivacyUpdateResponse(PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse privacyUpdateResponseOuterClass$PrivacyUpdateResponse) {
            privacyUpdateResponseOuterClass$PrivacyUpdateResponse.getClass();
            this.value_ = privacyUpdateResponseOuterClass$PrivacyUpdateResponse;
            this.valueCase_ = 5;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (UniversalResponseOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Payload();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\u0005\u0001��\u0001\u0005\u0005������\u0001<��\u0002<��\u0003<��\u0004<��\u0005<��", new Object[]{"value_", "valueCase_", InitializationResponseOuterClass$InitializationResponse.class, AdResponseOuterClass$AdResponse.class, AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse.class, AdDataRefreshResponseOuterClass$AdDataRefreshResponse.class, PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Payload> parser = PARSER;
                    Parser<Payload> parser2 = parser;
                    if (parser == null) {
                        synchronized (Payload.class) {
                            try {
                                Parser<Payload> parser3 = PARSER;
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

        public AdDataRefreshResponseOuterClass$AdDataRefreshResponse getAdDataRefreshResponse() {
            return this.valueCase_ == 4 ? (AdDataRefreshResponseOuterClass$AdDataRefreshResponse) this.value_ : AdDataRefreshResponseOuterClass$AdDataRefreshResponse.getDefaultInstance();
        }

        public AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse getAdPlayerConfigResponse() {
            return this.valueCase_ == 3 ? (AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse) this.value_ : AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse.getDefaultInstance();
        }

        public AdResponseOuterClass$AdResponse getAdResponse() {
            return this.valueCase_ == 2 ? (AdResponseOuterClass$AdResponse) this.value_ : AdResponseOuterClass$AdResponse.getDefaultInstance();
        }

        public InitializationResponseOuterClass$InitializationResponse getInitializationResponse() {
            return this.valueCase_ == 1 ? (InitializationResponseOuterClass$InitializationResponse) this.value_ : InitializationResponseOuterClass$InitializationResponse.getDefaultInstance();
        }

        public PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse getPrivacyUpdateResponse() {
            return this.valueCase_ == 5 ? (PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse) this.value_ : PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse.getDefaultInstance();
        }

        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        public boolean hasAdDataRefreshResponse() {
            return this.valueCase_ == 4;
        }

        public boolean hasAdPlayerConfigResponse() {
            return this.valueCase_ == 3;
        }

        public boolean hasAdResponse() {
            return this.valueCase_ == 2;
        }

        public boolean hasInitializationResponse() {
            boolean z = true;
            if (this.valueCase_ != 1) {
                z = false;
            }
            return z;
        }

        public boolean hasPrivacyUpdateResponse() {
            return this.valueCase_ == 5;
        }
    }

    static {
        UniversalResponseOuterClass$UniversalResponse universalResponseOuterClass$UniversalResponse = new UniversalResponseOuterClass$UniversalResponse();
        DEFAULT_INSTANCE = universalResponseOuterClass$UniversalResponse;
        GeneratedMessageLite.registerDefaultInstance(UniversalResponseOuterClass$UniversalResponse.class, universalResponseOuterClass$UniversalResponse);
    }

    private UniversalResponseOuterClass$UniversalResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        this.error_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMutableData() {
        this.mutableData_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.payload_ = null;
    }

    public static UniversalResponseOuterClass$UniversalResponse getDefaultInstance() {
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
    public void mergeMutableData(MutableDataOuterClass$MutableData mutableDataOuterClass$MutableData) {
        mutableDataOuterClass$MutableData.getClass();
        MutableDataOuterClass$MutableData mutableDataOuterClass$MutableData2 = this.mutableData_;
        if (mutableDataOuterClass$MutableData2 == null || mutableDataOuterClass$MutableData2 == MutableDataOuterClass$MutableData.getDefaultInstance()) {
            this.mutableData_ = mutableDataOuterClass$MutableData;
        } else {
            this.mutableData_ = (MutableDataOuterClass$MutableData) ((MutableDataOuterClass$MutableData.Builder) MutableDataOuterClass$MutableData.newBuilder(this.mutableData_).mergeFrom((MutableDataOuterClass$MutableData.Builder) mutableDataOuterClass$MutableData)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePayload(Payload payload) {
        payload.getClass();
        Payload payload2 = this.payload_;
        if (payload2 == null || payload2 == Payload.getDefaultInstance()) {
            this.payload_ = payload;
        } else {
            this.payload_ = (Payload) ((Payload.Builder) Payload.newBuilder(this.payload_).mergeFrom((Payload.Builder) payload)).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(UniversalResponseOuterClass$UniversalResponse universalResponseOuterClass$UniversalResponse) {
        return DEFAULT_INSTANCE.createBuilder(universalResponseOuterClass$UniversalResponse);
    }

    public static UniversalResponseOuterClass$UniversalResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UniversalResponseOuterClass$UniversalResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UniversalResponseOuterClass$UniversalResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UniversalResponseOuterClass$UniversalResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UniversalResponseOuterClass$UniversalResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UniversalResponseOuterClass$UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UniversalResponseOuterClass$UniversalResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UniversalResponseOuterClass$UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UniversalResponseOuterClass$UniversalResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UniversalResponseOuterClass$UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UniversalResponseOuterClass$UniversalResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UniversalResponseOuterClass$UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static UniversalResponseOuterClass$UniversalResponse parseFrom(InputStream inputStream) throws IOException {
        return (UniversalResponseOuterClass$UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UniversalResponseOuterClass$UniversalResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UniversalResponseOuterClass$UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UniversalResponseOuterClass$UniversalResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UniversalResponseOuterClass$UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static UniversalResponseOuterClass$UniversalResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UniversalResponseOuterClass$UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UniversalResponseOuterClass$UniversalResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UniversalResponseOuterClass$UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UniversalResponseOuterClass$UniversalResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UniversalResponseOuterClass$UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<UniversalResponseOuterClass$UniversalResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setError(ErrorOuterClass$Error errorOuterClass$Error) {
        errorOuterClass$Error.getClass();
        this.error_ = errorOuterClass$Error;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMutableData(MutableDataOuterClass$MutableData mutableDataOuterClass$MutableData) {
        mutableDataOuterClass$MutableData.getClass();
        this.mutableData_ = mutableDataOuterClass$MutableData;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayload(Payload payload) {
        payload.getClass();
        this.payload_ = payload;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (UniversalResponseOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new UniversalResponseOuterClass$UniversalResponse();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\u0003��\u0001\u0001\u0003\u0003������\u0001\t\u0002ဉ��\u0003ဉ\u0001", new Object[]{"bitField0_", "payload_", "mutableData_", "error_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UniversalResponseOuterClass$UniversalResponse> parser = PARSER;
                Parser<UniversalResponseOuterClass$UniversalResponse> parser2 = parser;
                if (parser == null) {
                    synchronized (UniversalResponseOuterClass$UniversalResponse.class) {
                        try {
                            Parser<UniversalResponseOuterClass$UniversalResponse> parser3 = PARSER;
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

    public ErrorOuterClass$Error getError() {
        ErrorOuterClass$Error errorOuterClass$Error = this.error_;
        ErrorOuterClass$Error errorOuterClass$Error2 = errorOuterClass$Error;
        if (errorOuterClass$Error == null) {
            errorOuterClass$Error2 = ErrorOuterClass$Error.getDefaultInstance();
        }
        return errorOuterClass$Error2;
    }

    public MutableDataOuterClass$MutableData getMutableData() {
        MutableDataOuterClass$MutableData mutableDataOuterClass$MutableData = this.mutableData_;
        MutableDataOuterClass$MutableData mutableDataOuterClass$MutableData2 = mutableDataOuterClass$MutableData;
        if (mutableDataOuterClass$MutableData == null) {
            mutableDataOuterClass$MutableData2 = MutableDataOuterClass$MutableData.getDefaultInstance();
        }
        return mutableDataOuterClass$MutableData2;
    }

    public Payload getPayload() {
        Payload payload = this.payload_;
        Payload payload2 = payload;
        if (payload == null) {
            payload2 = Payload.getDefaultInstance();
        }
        return payload2;
    }

    public boolean hasError() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMutableData() {
        boolean z = true;
        if ((this.bitField0_ & 1) == 0) {
            z = false;
        }
        return z;
    }

    public boolean hasPayload() {
        return this.payload_ != null;
    }
}
