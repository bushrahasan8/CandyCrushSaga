package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequest;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;
import gatewayprotocol.v1.AdRequestOuterClass$AdRequest;
import gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventRequest;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass$GetTokenEventRequest;
import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;
import gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequest;
import gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest;
import gatewayprotocol.v1.PiiOuterClass$Pii;
import gatewayprotocol.v1.PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;
import gatewayprotocol.v1.TestDataOuterClass$TestData;
import gatewayprotocol.v1.TimestampsOuterClass$Timestamps;
import gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequest;
import gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: UniversalRequestOuterClass$UniversalRequest.class */
public final class UniversalRequestOuterClass$UniversalRequest extends GeneratedMessageLite<UniversalRequestOuterClass$UniversalRequest, Builder> implements MessageLiteOrBuilder {
    private static final UniversalRequestOuterClass$UniversalRequest DEFAULT_INSTANCE;
    private static volatile Parser<UniversalRequestOuterClass$UniversalRequest> PARSER;
    public static final int PAYLOAD_FIELD_NUMBER = 2;
    public static final int SHARED_DATA_FIELD_NUMBER = 1;
    private Payload payload_;
    private SharedData sharedData_;

    /* loaded from: UniversalRequestOuterClass$UniversalRequest$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private Builder() {
            super(UniversalRequestOuterClass$UniversalRequest.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(UniversalRequestOuterClass$1 universalRequestOuterClass$1) {
            this();
        }

        public Payload getPayload() {
            return ((UniversalRequestOuterClass$UniversalRequest) this.instance).getPayload();
        }

        public Builder setPayload(Payload payload) {
            copyOnWrite();
            ((UniversalRequestOuterClass$UniversalRequest) this.instance).setPayload(payload);
            return this;
        }

        public Builder setSharedData(SharedData sharedData) {
            copyOnWrite();
            ((UniversalRequestOuterClass$UniversalRequest) this.instance).setSharedData(sharedData);
            return this;
        }
    }

    /* loaded from: UniversalRequestOuterClass$UniversalRequest$Payload.class */
    public static final class Payload extends GeneratedMessageLite<Payload, Builder> implements MessageLiteOrBuilder {
        public static final int AD_DATA_REFRESH_REQUEST_FIELD_NUMBER = 9;
        public static final int AD_PLAYER_CONFIG_REQUEST_FIELD_NUMBER = 6;
        public static final int AD_REQUEST_FIELD_NUMBER = 3;
        private static final Payload DEFAULT_INSTANCE;
        public static final int DIAGNOSTIC_EVENT_REQUEST_FIELD_NUMBER = 5;
        public static final int GET_TOKEN_EVENT_REQUEST_FIELD_NUMBER = 7;
        public static final int INITIALIZATION_COMPLETED_EVENT_REQUEST_FIELD_NUMBER = 10;
        public static final int INITIALIZATION_REQUEST_FIELD_NUMBER = 2;
        public static final int OPERATIVE_EVENT_FIELD_NUMBER = 4;
        private static volatile Parser<Payload> PARSER;
        public static final int PRIVACY_UPDATE_REQUEST_FIELD_NUMBER = 8;
        public static final int TRANSACTION_EVENT_REQUEST_FIELD_NUMBER = 11;
        private int valueCase_ = 0;
        private Object value_;

        /* loaded from: UniversalRequestOuterClass$UniversalRequest$Payload$Builder.class */
        public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private Builder() {
                super(Payload.DEFAULT_INSTANCE);
            }

            /* synthetic */ Builder(UniversalRequestOuterClass$1 universalRequestOuterClass$1) {
                this();
            }

            public DiagnosticEventRequestOuterClass$DiagnosticEventRequest getDiagnosticEventRequest() {
                return ((Payload) this.instance).getDiagnosticEventRequest();
            }

            public Builder setAdDataRefreshRequest(AdDataRefreshRequestOuterClass$AdDataRefreshRequest adDataRefreshRequestOuterClass$AdDataRefreshRequest) {
                copyOnWrite();
                ((Payload) this.instance).setAdDataRefreshRequest(adDataRefreshRequestOuterClass$AdDataRefreshRequest);
                return this;
            }

            public Builder setAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest adPlayerConfigRequestOuterClass$AdPlayerConfigRequest) {
                copyOnWrite();
                ((Payload) this.instance).setAdPlayerConfigRequest(adPlayerConfigRequestOuterClass$AdPlayerConfigRequest);
                return this;
            }

            public Builder setAdRequest(AdRequestOuterClass$AdRequest adRequestOuterClass$AdRequest) {
                copyOnWrite();
                ((Payload) this.instance).setAdRequest(adRequestOuterClass$AdRequest);
                return this;
            }

            public Builder setDiagnosticEventRequest(DiagnosticEventRequestOuterClass$DiagnosticEventRequest diagnosticEventRequestOuterClass$DiagnosticEventRequest) {
                copyOnWrite();
                ((Payload) this.instance).setDiagnosticEventRequest(diagnosticEventRequestOuterClass$DiagnosticEventRequest);
                return this;
            }

            public Builder setInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest) {
                copyOnWrite();
                ((Payload) this.instance).setInitializationCompletedEventRequest(initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest);
                return this;
            }

            public Builder setInitializationRequest(InitializationRequestOuterClass$InitializationRequest initializationRequestOuterClass$InitializationRequest) {
                copyOnWrite();
                ((Payload) this.instance).setInitializationRequest(initializationRequestOuterClass$InitializationRequest);
                return this;
            }

            public Builder setOperativeEvent(OperativeEventRequestOuterClass$OperativeEventRequest operativeEventRequestOuterClass$OperativeEventRequest) {
                copyOnWrite();
                ((Payload) this.instance).setOperativeEvent(operativeEventRequestOuterClass$OperativeEventRequest);
                return this;
            }

            public Builder setPrivacyUpdateRequest(PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest privacyUpdateRequestOuterClass$PrivacyUpdateRequest) {
                copyOnWrite();
                ((Payload) this.instance).setPrivacyUpdateRequest(privacyUpdateRequestOuterClass$PrivacyUpdateRequest);
                return this;
            }

            public Builder setTransactionEventRequest(TransactionEventRequestOuterClass$TransactionEventRequest transactionEventRequestOuterClass$TransactionEventRequest) {
                copyOnWrite();
                ((Payload) this.instance).setTransactionEventRequest(transactionEventRequestOuterClass$TransactionEventRequest);
                return this;
            }
        }

        /* loaded from: UniversalRequestOuterClass$UniversalRequest$Payload$ValueCase.class */
        public enum ValueCase {
            INITIALIZATION_REQUEST(2),
            AD_REQUEST(3),
            OPERATIVE_EVENT(4),
            DIAGNOSTIC_EVENT_REQUEST(5),
            AD_PLAYER_CONFIG_REQUEST(6),
            GET_TOKEN_EVENT_REQUEST(7),
            PRIVACY_UPDATE_REQUEST(8),
            AD_DATA_REFRESH_REQUEST(9),
            INITIALIZATION_COMPLETED_EVENT_REQUEST(10),
            TRANSACTION_EVENT_REQUEST(11),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int i) {
                this.value = i;
            }

            public static ValueCase forNumber(int i) {
                if (i == 0) {
                    return VALUE_NOT_SET;
                }
                switch (i) {
                    case 2:
                        return INITIALIZATION_REQUEST;
                    case 3:
                        return AD_REQUEST;
                    case 4:
                        return OPERATIVE_EVENT;
                    case 5:
                        return DIAGNOSTIC_EVENT_REQUEST;
                    case 6:
                        return AD_PLAYER_CONFIG_REQUEST;
                    case 7:
                        return GET_TOKEN_EVENT_REQUEST;
                    case 8:
                        return PRIVACY_UPDATE_REQUEST;
                    case 9:
                        return AD_DATA_REFRESH_REQUEST;
                    case 10:
                        return INITIALIZATION_COMPLETED_EVENT_REQUEST;
                    case 11:
                        return TRANSACTION_EVENT_REQUEST;
                    default:
                        return null;
                }
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
        public void clearAdDataRefreshRequest() {
            if (this.valueCase_ == 9) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdPlayerConfigRequest() {
            if (this.valueCase_ == 6) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdRequest() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDiagnosticEventRequest() {
            if (this.valueCase_ == 5) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGetTokenEventRequest() {
            if (this.valueCase_ == 7) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitializationCompletedEventRequest() {
            if (this.valueCase_ == 10) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitializationRequest() {
            if (this.valueCase_ == 2) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOperativeEvent() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrivacyUpdateRequest() {
            if (this.valueCase_ == 8) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTransactionEventRequest() {
            if (this.valueCase_ == 11) {
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
        public void mergeAdDataRefreshRequest(AdDataRefreshRequestOuterClass$AdDataRefreshRequest adDataRefreshRequestOuterClass$AdDataRefreshRequest) {
            adDataRefreshRequestOuterClass$AdDataRefreshRequest.getClass();
            if (this.valueCase_ != 9 || this.value_ == AdDataRefreshRequestOuterClass$AdDataRefreshRequest.getDefaultInstance()) {
                this.value_ = adDataRefreshRequestOuterClass$AdDataRefreshRequest;
            } else {
                this.value_ = ((AdDataRefreshRequestOuterClass$AdDataRefreshRequest.Builder) AdDataRefreshRequestOuterClass$AdDataRefreshRequest.newBuilder((AdDataRefreshRequestOuterClass$AdDataRefreshRequest) this.value_).mergeFrom((AdDataRefreshRequestOuterClass$AdDataRefreshRequest.Builder) adDataRefreshRequestOuterClass$AdDataRefreshRequest)).buildPartial();
            }
            this.valueCase_ = 9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest adPlayerConfigRequestOuterClass$AdPlayerConfigRequest) {
            adPlayerConfigRequestOuterClass$AdPlayerConfigRequest.getClass();
            if (this.valueCase_ != 6 || this.value_ == AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest.getDefaultInstance()) {
                this.value_ = adPlayerConfigRequestOuterClass$AdPlayerConfigRequest;
            } else {
                this.value_ = ((AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest.Builder) AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest.newBuilder((AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest) this.value_).mergeFrom((AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest.Builder) adPlayerConfigRequestOuterClass$AdPlayerConfigRequest)).buildPartial();
            }
            this.valueCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAdRequest(AdRequestOuterClass$AdRequest adRequestOuterClass$AdRequest) {
            adRequestOuterClass$AdRequest.getClass();
            if (this.valueCase_ != 3 || this.value_ == AdRequestOuterClass$AdRequest.getDefaultInstance()) {
                this.value_ = adRequestOuterClass$AdRequest;
            } else {
                this.value_ = ((AdRequestOuterClass$AdRequest.Builder) AdRequestOuterClass$AdRequest.newBuilder((AdRequestOuterClass$AdRequest) this.value_).mergeFrom((AdRequestOuterClass$AdRequest.Builder) adRequestOuterClass$AdRequest)).buildPartial();
            }
            this.valueCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDiagnosticEventRequest(DiagnosticEventRequestOuterClass$DiagnosticEventRequest diagnosticEventRequestOuterClass$DiagnosticEventRequest) {
            diagnosticEventRequestOuterClass$DiagnosticEventRequest.getClass();
            if (this.valueCase_ != 5 || this.value_ == DiagnosticEventRequestOuterClass$DiagnosticEventRequest.getDefaultInstance()) {
                this.value_ = diagnosticEventRequestOuterClass$DiagnosticEventRequest;
            } else {
                this.value_ = ((DiagnosticEventRequestOuterClass$DiagnosticEventRequest.Builder) DiagnosticEventRequestOuterClass$DiagnosticEventRequest.newBuilder((DiagnosticEventRequestOuterClass$DiagnosticEventRequest) this.value_).mergeFrom((DiagnosticEventRequestOuterClass$DiagnosticEventRequest.Builder) diagnosticEventRequestOuterClass$DiagnosticEventRequest)).buildPartial();
            }
            this.valueCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGetTokenEventRequest(GetTokenEventRequestOuterClass$GetTokenEventRequest getTokenEventRequestOuterClass$GetTokenEventRequest) {
            getTokenEventRequestOuterClass$GetTokenEventRequest.getClass();
            if (this.valueCase_ != 7 || this.value_ == GetTokenEventRequestOuterClass$GetTokenEventRequest.getDefaultInstance()) {
                this.value_ = getTokenEventRequestOuterClass$GetTokenEventRequest;
            } else {
                this.value_ = ((GetTokenEventRequestOuterClass$GetTokenEventRequest.Builder) GetTokenEventRequestOuterClass$GetTokenEventRequest.newBuilder((GetTokenEventRequestOuterClass$GetTokenEventRequest) this.value_).mergeFrom((GetTokenEventRequestOuterClass$GetTokenEventRequest.Builder) getTokenEventRequestOuterClass$GetTokenEventRequest)).buildPartial();
            }
            this.valueCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest) {
            initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest.getClass();
            if (this.valueCase_ != 10 || this.value_ == InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest.getDefaultInstance()) {
                this.value_ = initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;
            } else {
                this.value_ = ((InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest.Builder) InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest.newBuilder((InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest) this.value_).mergeFrom((InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest.Builder) initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest)).buildPartial();
            }
            this.valueCase_ = 10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInitializationRequest(InitializationRequestOuterClass$InitializationRequest initializationRequestOuterClass$InitializationRequest) {
            initializationRequestOuterClass$InitializationRequest.getClass();
            if (this.valueCase_ != 2 || this.value_ == InitializationRequestOuterClass$InitializationRequest.getDefaultInstance()) {
                this.value_ = initializationRequestOuterClass$InitializationRequest;
            } else {
                this.value_ = ((InitializationRequestOuterClass$InitializationRequest.Builder) InitializationRequestOuterClass$InitializationRequest.newBuilder((InitializationRequestOuterClass$InitializationRequest) this.value_).mergeFrom((InitializationRequestOuterClass$InitializationRequest.Builder) initializationRequestOuterClass$InitializationRequest)).buildPartial();
            }
            this.valueCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOperativeEvent(OperativeEventRequestOuterClass$OperativeEventRequest operativeEventRequestOuterClass$OperativeEventRequest) {
            operativeEventRequestOuterClass$OperativeEventRequest.getClass();
            if (this.valueCase_ != 4 || this.value_ == OperativeEventRequestOuterClass$OperativeEventRequest.getDefaultInstance()) {
                this.value_ = operativeEventRequestOuterClass$OperativeEventRequest;
            } else {
                this.value_ = ((OperativeEventRequestOuterClass$OperativeEventRequest.Builder) OperativeEventRequestOuterClass$OperativeEventRequest.newBuilder((OperativeEventRequestOuterClass$OperativeEventRequest) this.value_).mergeFrom((OperativeEventRequestOuterClass$OperativeEventRequest.Builder) operativeEventRequestOuterClass$OperativeEventRequest)).buildPartial();
            }
            this.valueCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePrivacyUpdateRequest(PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest privacyUpdateRequestOuterClass$PrivacyUpdateRequest) {
            privacyUpdateRequestOuterClass$PrivacyUpdateRequest.getClass();
            if (this.valueCase_ != 8 || this.value_ == PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest.getDefaultInstance()) {
                this.value_ = privacyUpdateRequestOuterClass$PrivacyUpdateRequest;
            } else {
                this.value_ = ((PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest.Builder) PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest.newBuilder((PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest) this.value_).mergeFrom((PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest.Builder) privacyUpdateRequestOuterClass$PrivacyUpdateRequest)).buildPartial();
            }
            this.valueCase_ = 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTransactionEventRequest(TransactionEventRequestOuterClass$TransactionEventRequest transactionEventRequestOuterClass$TransactionEventRequest) {
            transactionEventRequestOuterClass$TransactionEventRequest.getClass();
            if (this.valueCase_ != 11 || this.value_ == TransactionEventRequestOuterClass$TransactionEventRequest.getDefaultInstance()) {
                this.value_ = transactionEventRequestOuterClass$TransactionEventRequest;
            } else {
                this.value_ = ((TransactionEventRequestOuterClass$TransactionEventRequest.Builder) TransactionEventRequestOuterClass$TransactionEventRequest.newBuilder((TransactionEventRequestOuterClass$TransactionEventRequest) this.value_).mergeFrom((TransactionEventRequestOuterClass$TransactionEventRequest.Builder) transactionEventRequestOuterClass$TransactionEventRequest)).buildPartial();
            }
            this.valueCase_ = 11;
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
        public void setAdDataRefreshRequest(AdDataRefreshRequestOuterClass$AdDataRefreshRequest adDataRefreshRequestOuterClass$AdDataRefreshRequest) {
            adDataRefreshRequestOuterClass$AdDataRefreshRequest.getClass();
            this.value_ = adDataRefreshRequestOuterClass$AdDataRefreshRequest;
            this.valueCase_ = 9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest adPlayerConfigRequestOuterClass$AdPlayerConfigRequest) {
            adPlayerConfigRequestOuterClass$AdPlayerConfigRequest.getClass();
            this.value_ = adPlayerConfigRequestOuterClass$AdPlayerConfigRequest;
            this.valueCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdRequest(AdRequestOuterClass$AdRequest adRequestOuterClass$AdRequest) {
            adRequestOuterClass$AdRequest.getClass();
            this.value_ = adRequestOuterClass$AdRequest;
            this.valueCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDiagnosticEventRequest(DiagnosticEventRequestOuterClass$DiagnosticEventRequest diagnosticEventRequestOuterClass$DiagnosticEventRequest) {
            diagnosticEventRequestOuterClass$DiagnosticEventRequest.getClass();
            this.value_ = diagnosticEventRequestOuterClass$DiagnosticEventRequest;
            this.valueCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGetTokenEventRequest(GetTokenEventRequestOuterClass$GetTokenEventRequest getTokenEventRequestOuterClass$GetTokenEventRequest) {
            getTokenEventRequestOuterClass$GetTokenEventRequest.getClass();
            this.value_ = getTokenEventRequestOuterClass$GetTokenEventRequest;
            this.valueCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest) {
            initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest.getClass();
            this.value_ = initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;
            this.valueCase_ = 10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitializationRequest(InitializationRequestOuterClass$InitializationRequest initializationRequestOuterClass$InitializationRequest) {
            initializationRequestOuterClass$InitializationRequest.getClass();
            this.value_ = initializationRequestOuterClass$InitializationRequest;
            this.valueCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOperativeEvent(OperativeEventRequestOuterClass$OperativeEventRequest operativeEventRequestOuterClass$OperativeEventRequest) {
            operativeEventRequestOuterClass$OperativeEventRequest.getClass();
            this.value_ = operativeEventRequestOuterClass$OperativeEventRequest;
            this.valueCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrivacyUpdateRequest(PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest privacyUpdateRequestOuterClass$PrivacyUpdateRequest) {
            privacyUpdateRequestOuterClass$PrivacyUpdateRequest.getClass();
            this.value_ = privacyUpdateRequestOuterClass$PrivacyUpdateRequest;
            this.valueCase_ = 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransactionEventRequest(TransactionEventRequestOuterClass$TransactionEventRequest transactionEventRequestOuterClass$TransactionEventRequest) {
            transactionEventRequestOuterClass$TransactionEventRequest.getClass();
            this.value_ = transactionEventRequestOuterClass$TransactionEventRequest;
            this.valueCase_ = 11;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (UniversalRequestOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Payload();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\n\u0001��\u0002\u000b\n������\u0002<��\u0003<��\u0004<��\u0005<��\u0006<��\u0007<��\b<��\t<��\n<��\u000b<��", new Object[]{"value_", "valueCase_", InitializationRequestOuterClass$InitializationRequest.class, AdRequestOuterClass$AdRequest.class, OperativeEventRequestOuterClass$OperativeEventRequest.class, DiagnosticEventRequestOuterClass$DiagnosticEventRequest.class, AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest.class, GetTokenEventRequestOuterClass$GetTokenEventRequest.class, PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest.class, AdDataRefreshRequestOuterClass$AdDataRefreshRequest.class, InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest.class, TransactionEventRequestOuterClass$TransactionEventRequest.class});
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

        public AdDataRefreshRequestOuterClass$AdDataRefreshRequest getAdDataRefreshRequest() {
            return this.valueCase_ == 9 ? (AdDataRefreshRequestOuterClass$AdDataRefreshRequest) this.value_ : AdDataRefreshRequestOuterClass$AdDataRefreshRequest.getDefaultInstance();
        }

        public AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest getAdPlayerConfigRequest() {
            return this.valueCase_ == 6 ? (AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest) this.value_ : AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest.getDefaultInstance();
        }

        public AdRequestOuterClass$AdRequest getAdRequest() {
            return this.valueCase_ == 3 ? (AdRequestOuterClass$AdRequest) this.value_ : AdRequestOuterClass$AdRequest.getDefaultInstance();
        }

        public DiagnosticEventRequestOuterClass$DiagnosticEventRequest getDiagnosticEventRequest() {
            return this.valueCase_ == 5 ? (DiagnosticEventRequestOuterClass$DiagnosticEventRequest) this.value_ : DiagnosticEventRequestOuterClass$DiagnosticEventRequest.getDefaultInstance();
        }

        public GetTokenEventRequestOuterClass$GetTokenEventRequest getGetTokenEventRequest() {
            return this.valueCase_ == 7 ? (GetTokenEventRequestOuterClass$GetTokenEventRequest) this.value_ : GetTokenEventRequestOuterClass$GetTokenEventRequest.getDefaultInstance();
        }

        public InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
            return this.valueCase_ == 10 ? (InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest) this.value_ : InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest.getDefaultInstance();
        }

        public InitializationRequestOuterClass$InitializationRequest getInitializationRequest() {
            return this.valueCase_ == 2 ? (InitializationRequestOuterClass$InitializationRequest) this.value_ : InitializationRequestOuterClass$InitializationRequest.getDefaultInstance();
        }

        public OperativeEventRequestOuterClass$OperativeEventRequest getOperativeEvent() {
            return this.valueCase_ == 4 ? (OperativeEventRequestOuterClass$OperativeEventRequest) this.value_ : OperativeEventRequestOuterClass$OperativeEventRequest.getDefaultInstance();
        }

        public PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest getPrivacyUpdateRequest() {
            return this.valueCase_ == 8 ? (PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest) this.value_ : PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest.getDefaultInstance();
        }

        public TransactionEventRequestOuterClass$TransactionEventRequest getTransactionEventRequest() {
            return this.valueCase_ == 11 ? (TransactionEventRequestOuterClass$TransactionEventRequest) this.value_ : TransactionEventRequestOuterClass$TransactionEventRequest.getDefaultInstance();
        }

        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        public boolean hasAdDataRefreshRequest() {
            return this.valueCase_ == 9;
        }

        public boolean hasAdPlayerConfigRequest() {
            return this.valueCase_ == 6;
        }

        public boolean hasAdRequest() {
            return this.valueCase_ == 3;
        }

        public boolean hasDiagnosticEventRequest() {
            return this.valueCase_ == 5;
        }

        public boolean hasGetTokenEventRequest() {
            return this.valueCase_ == 7;
        }

        public boolean hasInitializationCompletedEventRequest() {
            return this.valueCase_ == 10;
        }

        public boolean hasInitializationRequest() {
            return this.valueCase_ == 2;
        }

        public boolean hasOperativeEvent() {
            return this.valueCase_ == 4;
        }

        public boolean hasPrivacyUpdateRequest() {
            return this.valueCase_ == 8;
        }

        public boolean hasTransactionEventRequest() {
            return this.valueCase_ == 11;
        }
    }

    /* loaded from: UniversalRequestOuterClass$UniversalRequest$SharedData.class */
    public static final class SharedData extends GeneratedMessageLite<SharedData, Builder> implements MessageLiteOrBuilder {
        public static final int APP_START_TIME_FIELD_NUMBER = 8;
        public static final int CURRENT_STATE_FIELD_NUMBER = 6;
        private static final SharedData DEFAULT_INSTANCE;
        public static final int DEVELOPER_CONSENT_FIELD_NUMBER = 4;
        public static final int LIMITED_SESSION_TOKEN_FIELD_NUMBER = 10;
        private static volatile Parser<SharedData> PARSER;
        public static final int PII_FIELD_NUMBER = 3;
        public static final int SDK_START_TIME_FIELD_NUMBER = 9;
        public static final int SESSION_TOKEN_FIELD_NUMBER = 1;
        public static final int TEST_DATA_FIELD_NUMBER = 7;
        public static final int TIMESTAMPS_FIELD_NUMBER = 2;
        public static final int WEBVIEW_VERSION_FIELD_NUMBER = 5;
        private Timestamp appStartTime_;
        private int bitField0_;
        private ByteString currentState_;
        private DeveloperConsentOuterClass$DeveloperConsent developerConsent_;
        private UniversalRequestOuterClass$LimitedSessionToken limitedSessionToken_;
        private PiiOuterClass$Pii pii_;
        private Timestamp sdkStartTime_;
        private ByteString sessionToken_;
        private TestDataOuterClass$TestData testData_;
        private TimestampsOuterClass$Timestamps timestamps_;
        private int webviewVersion_;

        /* loaded from: UniversalRequestOuterClass$UniversalRequest$SharedData$Builder.class */
        public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private Builder() {
                super(SharedData.DEFAULT_INSTANCE);
            }

            /* synthetic */ Builder(UniversalRequestOuterClass$1 universalRequestOuterClass$1) {
                this();
            }

            public Builder setAppStartTime(Timestamp timestamp) {
                copyOnWrite();
                ((SharedData) this.instance).setAppStartTime(timestamp);
                return this;
            }

            public Builder setDeveloperConsent(DeveloperConsentOuterClass$DeveloperConsent developerConsentOuterClass$DeveloperConsent) {
                copyOnWrite();
                ((SharedData) this.instance).setDeveloperConsent(developerConsentOuterClass$DeveloperConsent);
                return this;
            }

            public Builder setLimitedSessionToken(UniversalRequestOuterClass$LimitedSessionToken universalRequestOuterClass$LimitedSessionToken) {
                copyOnWrite();
                ((SharedData) this.instance).setLimitedSessionToken(universalRequestOuterClass$LimitedSessionToken);
                return this;
            }

            public Builder setPii(PiiOuterClass$Pii piiOuterClass$Pii) {
                copyOnWrite();
                ((SharedData) this.instance).setPii(piiOuterClass$Pii);
                return this;
            }

            public Builder setSdkStartTime(Timestamp timestamp) {
                copyOnWrite();
                ((SharedData) this.instance).setSdkStartTime(timestamp);
                return this;
            }

            public Builder setSessionToken(ByteString byteString) {
                copyOnWrite();
                ((SharedData) this.instance).setSessionToken(byteString);
                return this;
            }

            public Builder setTimestamps(TimestampsOuterClass$Timestamps timestampsOuterClass$Timestamps) {
                copyOnWrite();
                ((SharedData) this.instance).setTimestamps(timestampsOuterClass$Timestamps);
                return this;
            }
        }

        static {
            SharedData sharedData = new SharedData();
            DEFAULT_INSTANCE = sharedData;
            GeneratedMessageLite.registerDefaultInstance(SharedData.class, sharedData);
        }

        private SharedData() {
            ByteString byteString = ByteString.EMPTY;
            this.sessionToken_ = byteString;
            this.currentState_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppStartTime() {
            this.appStartTime_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentState() {
            this.bitField0_ &= -17;
            this.currentState_ = getDefaultInstance().getCurrentState();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeveloperConsent() {
            this.developerConsent_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLimitedSessionToken() {
            this.limitedSessionToken_ = null;
            this.bitField0_ &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPii() {
            this.pii_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSdkStartTime() {
            this.sdkStartTime_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionToken() {
            this.bitField0_ &= -2;
            this.sessionToken_ = getDefaultInstance().getSessionToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTestData() {
            this.testData_ = null;
            this.bitField0_ &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamps() {
            this.timestamps_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWebviewVersion() {
            this.bitField0_ &= -9;
            this.webviewVersion_ = 0;
        }

        public static SharedData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAppStartTime(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.appStartTime_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.appStartTime_ = timestamp;
            } else {
                this.appStartTime_ = Timestamp.newBuilder(this.appStartTime_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDeveloperConsent(DeveloperConsentOuterClass$DeveloperConsent developerConsentOuterClass$DeveloperConsent) {
            developerConsentOuterClass$DeveloperConsent.getClass();
            DeveloperConsentOuterClass$DeveloperConsent developerConsentOuterClass$DeveloperConsent2 = this.developerConsent_;
            if (developerConsentOuterClass$DeveloperConsent2 == null || developerConsentOuterClass$DeveloperConsent2 == DeveloperConsentOuterClass$DeveloperConsent.getDefaultInstance()) {
                this.developerConsent_ = developerConsentOuterClass$DeveloperConsent;
            } else {
                this.developerConsent_ = (DeveloperConsentOuterClass$DeveloperConsent) ((DeveloperConsentOuterClass$DeveloperConsent.Builder) DeveloperConsentOuterClass$DeveloperConsent.newBuilder(this.developerConsent_).mergeFrom((DeveloperConsentOuterClass$DeveloperConsent.Builder) developerConsentOuterClass$DeveloperConsent)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLimitedSessionToken(UniversalRequestOuterClass$LimitedSessionToken universalRequestOuterClass$LimitedSessionToken) {
            universalRequestOuterClass$LimitedSessionToken.getClass();
            UniversalRequestOuterClass$LimitedSessionToken universalRequestOuterClass$LimitedSessionToken2 = this.limitedSessionToken_;
            if (universalRequestOuterClass$LimitedSessionToken2 == null || universalRequestOuterClass$LimitedSessionToken2 == UniversalRequestOuterClass$LimitedSessionToken.getDefaultInstance()) {
                this.limitedSessionToken_ = universalRequestOuterClass$LimitedSessionToken;
            } else {
                this.limitedSessionToken_ = (UniversalRequestOuterClass$LimitedSessionToken) ((UniversalRequestOuterClass$LimitedSessionToken.Builder) UniversalRequestOuterClass$LimitedSessionToken.newBuilder(this.limitedSessionToken_).mergeFrom((UniversalRequestOuterClass$LimitedSessionToken.Builder) universalRequestOuterClass$LimitedSessionToken)).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePii(PiiOuterClass$Pii piiOuterClass$Pii) {
            piiOuterClass$Pii.getClass();
            PiiOuterClass$Pii piiOuterClass$Pii2 = this.pii_;
            if (piiOuterClass$Pii2 == null || piiOuterClass$Pii2 == PiiOuterClass$Pii.getDefaultInstance()) {
                this.pii_ = piiOuterClass$Pii;
            } else {
                this.pii_ = (PiiOuterClass$Pii) ((PiiOuterClass$Pii.Builder) PiiOuterClass$Pii.newBuilder(this.pii_).mergeFrom((PiiOuterClass$Pii.Builder) piiOuterClass$Pii)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSdkStartTime(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.sdkStartTime_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.sdkStartTime_ = timestamp;
            } else {
                this.sdkStartTime_ = Timestamp.newBuilder(this.sdkStartTime_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTestData(TestDataOuterClass$TestData testDataOuterClass$TestData) {
            testDataOuterClass$TestData.getClass();
            TestDataOuterClass$TestData testDataOuterClass$TestData2 = this.testData_;
            if (testDataOuterClass$TestData2 == null || testDataOuterClass$TestData2 == TestDataOuterClass$TestData.getDefaultInstance()) {
                this.testData_ = testDataOuterClass$TestData;
            } else {
                this.testData_ = (TestDataOuterClass$TestData) ((TestDataOuterClass$TestData.Builder) TestDataOuterClass$TestData.newBuilder(this.testData_).mergeFrom((TestDataOuterClass$TestData.Builder) testDataOuterClass$TestData)).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimestamps(TimestampsOuterClass$Timestamps timestampsOuterClass$Timestamps) {
            timestampsOuterClass$Timestamps.getClass();
            TimestampsOuterClass$Timestamps timestampsOuterClass$Timestamps2 = this.timestamps_;
            if (timestampsOuterClass$Timestamps2 == null || timestampsOuterClass$Timestamps2 == TimestampsOuterClass$Timestamps.getDefaultInstance()) {
                this.timestamps_ = timestampsOuterClass$Timestamps;
            } else {
                this.timestamps_ = (TimestampsOuterClass$Timestamps) ((TimestampsOuterClass$Timestamps.Builder) TimestampsOuterClass$Timestamps.newBuilder(this.timestamps_).mergeFrom((TimestampsOuterClass$Timestamps.Builder) timestampsOuterClass$Timestamps)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(SharedData sharedData) {
            return DEFAULT_INSTANCE.createBuilder(sharedData);
        }

        public static SharedData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SharedData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SharedData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SharedData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SharedData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SharedData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SharedData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SharedData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static SharedData parseFrom(InputStream inputStream) throws IOException {
            return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SharedData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SharedData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static SharedData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SharedData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SharedData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Parser<SharedData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppStartTime(Timestamp timestamp) {
            timestamp.getClass();
            this.appStartTime_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentState(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 16;
            this.currentState_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeveloperConsent(DeveloperConsentOuterClass$DeveloperConsent developerConsentOuterClass$DeveloperConsent) {
            developerConsentOuterClass$DeveloperConsent.getClass();
            this.developerConsent_ = developerConsentOuterClass$DeveloperConsent;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLimitedSessionToken(UniversalRequestOuterClass$LimitedSessionToken universalRequestOuterClass$LimitedSessionToken) {
            universalRequestOuterClass$LimitedSessionToken.getClass();
            this.limitedSessionToken_ = universalRequestOuterClass$LimitedSessionToken;
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPii(PiiOuterClass$Pii piiOuterClass$Pii) {
            piiOuterClass$Pii.getClass();
            this.pii_ = piiOuterClass$Pii;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdkStartTime(Timestamp timestamp) {
            timestamp.getClass();
            this.sdkStartTime_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionToken(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 1;
            this.sessionToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTestData(TestDataOuterClass$TestData testDataOuterClass$TestData) {
            testDataOuterClass$TestData.getClass();
            this.testData_ = testDataOuterClass$TestData;
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamps(TimestampsOuterClass$Timestamps timestampsOuterClass$Timestamps) {
            timestampsOuterClass$Timestamps.getClass();
            this.timestamps_ = timestampsOuterClass$Timestamps;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWebviewVersion(int i) {
            this.bitField0_ |= 8;
            this.webviewVersion_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (UniversalRequestOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SharedData();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\n��\u0001\u0001\n\n������\u0001ည��\u0002\t\u0003ဉ\u0001\u0004ဉ\u0002\u0005င\u0003\u0006ည\u0004\u0007ဉ\u0005\b\t\t\t\nဉ\u0006", new Object[]{"bitField0_", "sessionToken_", "timestamps_", "pii_", "developerConsent_", "webviewVersion_", "currentState_", "testData_", "appStartTime_", "sdkStartTime_", "limitedSessionToken_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SharedData> parser = PARSER;
                    Parser<SharedData> parser2 = parser;
                    if (parser == null) {
                        synchronized (SharedData.class) {
                            try {
                                Parser<SharedData> parser3 = PARSER;
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

        public Timestamp getAppStartTime() {
            Timestamp timestamp = this.appStartTime_;
            Timestamp timestamp2 = timestamp;
            if (timestamp == null) {
                timestamp2 = Timestamp.getDefaultInstance();
            }
            return timestamp2;
        }

        public ByteString getCurrentState() {
            return this.currentState_;
        }

        public DeveloperConsentOuterClass$DeveloperConsent getDeveloperConsent() {
            DeveloperConsentOuterClass$DeveloperConsent developerConsentOuterClass$DeveloperConsent = this.developerConsent_;
            DeveloperConsentOuterClass$DeveloperConsent developerConsentOuterClass$DeveloperConsent2 = developerConsentOuterClass$DeveloperConsent;
            if (developerConsentOuterClass$DeveloperConsent == null) {
                developerConsentOuterClass$DeveloperConsent2 = DeveloperConsentOuterClass$DeveloperConsent.getDefaultInstance();
            }
            return developerConsentOuterClass$DeveloperConsent2;
        }

        public UniversalRequestOuterClass$LimitedSessionToken getLimitedSessionToken() {
            UniversalRequestOuterClass$LimitedSessionToken universalRequestOuterClass$LimitedSessionToken = this.limitedSessionToken_;
            UniversalRequestOuterClass$LimitedSessionToken universalRequestOuterClass$LimitedSessionToken2 = universalRequestOuterClass$LimitedSessionToken;
            if (universalRequestOuterClass$LimitedSessionToken == null) {
                universalRequestOuterClass$LimitedSessionToken2 = UniversalRequestOuterClass$LimitedSessionToken.getDefaultInstance();
            }
            return universalRequestOuterClass$LimitedSessionToken2;
        }

        public PiiOuterClass$Pii getPii() {
            PiiOuterClass$Pii piiOuterClass$Pii = this.pii_;
            PiiOuterClass$Pii piiOuterClass$Pii2 = piiOuterClass$Pii;
            if (piiOuterClass$Pii == null) {
                piiOuterClass$Pii2 = PiiOuterClass$Pii.getDefaultInstance();
            }
            return piiOuterClass$Pii2;
        }

        public Timestamp getSdkStartTime() {
            Timestamp timestamp = this.sdkStartTime_;
            Timestamp timestamp2 = timestamp;
            if (timestamp == null) {
                timestamp2 = Timestamp.getDefaultInstance();
            }
            return timestamp2;
        }

        public ByteString getSessionToken() {
            return this.sessionToken_;
        }

        public TestDataOuterClass$TestData getTestData() {
            TestDataOuterClass$TestData testDataOuterClass$TestData = this.testData_;
            TestDataOuterClass$TestData testDataOuterClass$TestData2 = testDataOuterClass$TestData;
            if (testDataOuterClass$TestData == null) {
                testDataOuterClass$TestData2 = TestDataOuterClass$TestData.getDefaultInstance();
            }
            return testDataOuterClass$TestData2;
        }

        public TimestampsOuterClass$Timestamps getTimestamps() {
            TimestampsOuterClass$Timestamps timestampsOuterClass$Timestamps = this.timestamps_;
            TimestampsOuterClass$Timestamps timestampsOuterClass$Timestamps2 = timestampsOuterClass$Timestamps;
            if (timestampsOuterClass$Timestamps == null) {
                timestampsOuterClass$Timestamps2 = TimestampsOuterClass$Timestamps.getDefaultInstance();
            }
            return timestampsOuterClass$Timestamps2;
        }

        public int getWebviewVersion() {
            return this.webviewVersion_;
        }

        public boolean hasAppStartTime() {
            return this.appStartTime_ != null;
        }

        public boolean hasCurrentState() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasDeveloperConsent() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasLimitedSessionToken() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasPii() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSdkStartTime() {
            return this.sdkStartTime_ != null;
        }

        public boolean hasSessionToken() {
            boolean z = true;
            if ((this.bitField0_ & 1) == 0) {
                z = false;
            }
            return z;
        }

        public boolean hasTestData() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasTimestamps() {
            return this.timestamps_ != null;
        }

        public boolean hasWebviewVersion() {
            return (this.bitField0_ & 8) != 0;
        }
    }

    static {
        UniversalRequestOuterClass$UniversalRequest universalRequestOuterClass$UniversalRequest = new UniversalRequestOuterClass$UniversalRequest();
        DEFAULT_INSTANCE = universalRequestOuterClass$UniversalRequest;
        GeneratedMessageLite.registerDefaultInstance(UniversalRequestOuterClass$UniversalRequest.class, universalRequestOuterClass$UniversalRequest);
    }

    private UniversalRequestOuterClass$UniversalRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.payload_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSharedData() {
        this.sharedData_ = null;
    }

    public static UniversalRequestOuterClass$UniversalRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSharedData(SharedData sharedData) {
        sharedData.getClass();
        SharedData sharedData2 = this.sharedData_;
        if (sharedData2 == null || sharedData2 == SharedData.getDefaultInstance()) {
            this.sharedData_ = sharedData;
        } else {
            this.sharedData_ = (SharedData) ((SharedData.Builder) SharedData.newBuilder(this.sharedData_).mergeFrom((SharedData.Builder) sharedData)).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(UniversalRequestOuterClass$UniversalRequest universalRequestOuterClass$UniversalRequest) {
        return DEFAULT_INSTANCE.createBuilder(universalRequestOuterClass$UniversalRequest);
    }

    public static UniversalRequestOuterClass$UniversalRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UniversalRequestOuterClass$UniversalRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UniversalRequestOuterClass$UniversalRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UniversalRequestOuterClass$UniversalRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UniversalRequestOuterClass$UniversalRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UniversalRequestOuterClass$UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UniversalRequestOuterClass$UniversalRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UniversalRequestOuterClass$UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UniversalRequestOuterClass$UniversalRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UniversalRequestOuterClass$UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UniversalRequestOuterClass$UniversalRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UniversalRequestOuterClass$UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static UniversalRequestOuterClass$UniversalRequest parseFrom(InputStream inputStream) throws IOException {
        return (UniversalRequestOuterClass$UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UniversalRequestOuterClass$UniversalRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UniversalRequestOuterClass$UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UniversalRequestOuterClass$UniversalRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UniversalRequestOuterClass$UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static UniversalRequestOuterClass$UniversalRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UniversalRequestOuterClass$UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UniversalRequestOuterClass$UniversalRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UniversalRequestOuterClass$UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UniversalRequestOuterClass$UniversalRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UniversalRequestOuterClass$UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<UniversalRequestOuterClass$UniversalRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayload(Payload payload) {
        payload.getClass();
        this.payload_ = payload;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSharedData(SharedData sharedData) {
        sharedData.getClass();
        this.sharedData_ = sharedData;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (UniversalRequestOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new UniversalRequestOuterClass$UniversalRequest();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001\t\u0002\t", new Object[]{"sharedData_", "payload_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UniversalRequestOuterClass$UniversalRequest> parser = PARSER;
                Parser<UniversalRequestOuterClass$UniversalRequest> parser2 = parser;
                if (parser == null) {
                    synchronized (UniversalRequestOuterClass$UniversalRequest.class) {
                        try {
                            Parser<UniversalRequestOuterClass$UniversalRequest> parser3 = PARSER;
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

    public Payload getPayload() {
        Payload payload = this.payload_;
        Payload payload2 = payload;
        if (payload == null) {
            payload2 = Payload.getDefaultInstance();
        }
        return payload2;
    }

    public SharedData getSharedData() {
        SharedData sharedData = this.sharedData_;
        SharedData sharedData2 = sharedData;
        if (sharedData == null) {
            sharedData2 = SharedData.getDefaultInstance();
        }
        return sharedData2;
    }

    public boolean hasPayload() {
        return this.payload_ != null;
    }

    public boolean hasSharedData() {
        return this.sharedData_ != null;
    }
}
