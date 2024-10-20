package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import gatewayprotocol.v1.ErrorOuterClass$Error;
import gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: InitializationResponseOuterClass$InitializationResponse.class */
public final class InitializationResponseOuterClass$InitializationResponse extends GeneratedMessageLite<InitializationResponseOuterClass$InitializationResponse, Builder> implements MessageLiteOrBuilder {
    public static final int COUNT_OF_LAST_SHOWN_CAMPAIGNS_FIELD_NUMBER = 5;
    private static final InitializationResponseOuterClass$InitializationResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 3;
    public static final int NATIVE_CONFIGURATION_FIELD_NUMBER = 1;
    private static volatile Parser<InitializationResponseOuterClass$InitializationResponse> PARSER;
    public static final int SCAR_PLACEMENTS_FIELD_NUMBER = 6;
    public static final int TRIGGER_INITIALIZATION_COMPLETED_REQUEST_FIELD_NUMBER = 4;
    public static final int UNIVERSAL_REQUEST_URL_FIELD_NUMBER = 2;
    private int bitField0_;
    private int countOfLastShownCampaigns_;
    private ErrorOuterClass$Error error_;
    private NativeConfigurationOuterClass$NativeConfiguration nativeConfiguration_;
    private boolean triggerInitializationCompletedRequest_;
    private MapFieldLite<String, InitializationResponseOuterClass$Placement> scarPlacements_ = MapFieldLite.emptyMapField();
    private String universalRequestUrl_ = "";

    /* loaded from: InitializationResponseOuterClass$InitializationResponse$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private Builder() {
            super(InitializationResponseOuterClass$InitializationResponse.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(InitializationResponseOuterClass$1 initializationResponseOuterClass$1) {
            this();
        }
    }

    /* loaded from: InitializationResponseOuterClass$InitializationResponse$ScarPlacementsDefaultEntryHolder.class */
    private static final abstract class ScarPlacementsDefaultEntryHolder {
        static final MapEntryLite defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, InitializationResponseOuterClass$Placement.getDefaultInstance());
    }

    static {
        InitializationResponseOuterClass$InitializationResponse initializationResponseOuterClass$InitializationResponse = new InitializationResponseOuterClass$InitializationResponse();
        DEFAULT_INSTANCE = initializationResponseOuterClass$InitializationResponse;
        GeneratedMessageLite.registerDefaultInstance(InitializationResponseOuterClass$InitializationResponse.class, initializationResponseOuterClass$InitializationResponse);
    }

    private InitializationResponseOuterClass$InitializationResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountOfLastShownCampaigns() {
        this.countOfLastShownCampaigns_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        this.error_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNativeConfiguration() {
        this.nativeConfiguration_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggerInitializationCompletedRequest() {
        this.triggerInitializationCompletedRequest_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUniversalRequestUrl() {
        this.bitField0_ &= -2;
        this.universalRequestUrl_ = getDefaultInstance().getUniversalRequestUrl();
    }

    public static InitializationResponseOuterClass$InitializationResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, InitializationResponseOuterClass$Placement> getMutableScarPlacementsMap() {
        return internalGetMutableScarPlacements();
    }

    private MapFieldLite<String, InitializationResponseOuterClass$Placement> internalGetMutableScarPlacements() {
        if (!this.scarPlacements_.isMutable()) {
            this.scarPlacements_ = this.scarPlacements_.mutableCopy();
        }
        return this.scarPlacements_;
    }

    private MapFieldLite<String, InitializationResponseOuterClass$Placement> internalGetScarPlacements() {
        return this.scarPlacements_;
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
    public void mergeNativeConfiguration(NativeConfigurationOuterClass$NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration) {
        nativeConfigurationOuterClass$NativeConfiguration.getClass();
        NativeConfigurationOuterClass$NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration2 = this.nativeConfiguration_;
        if (nativeConfigurationOuterClass$NativeConfiguration2 == null || nativeConfigurationOuterClass$NativeConfiguration2 == NativeConfigurationOuterClass$NativeConfiguration.getDefaultInstance()) {
            this.nativeConfiguration_ = nativeConfigurationOuterClass$NativeConfiguration;
        } else {
            this.nativeConfiguration_ = (NativeConfigurationOuterClass$NativeConfiguration) ((NativeConfigurationOuterClass$NativeConfiguration.Builder) NativeConfigurationOuterClass$NativeConfiguration.newBuilder(this.nativeConfiguration_).mergeFrom((NativeConfigurationOuterClass$NativeConfiguration.Builder) nativeConfigurationOuterClass$NativeConfiguration)).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(InitializationResponseOuterClass$InitializationResponse initializationResponseOuterClass$InitializationResponse) {
        return DEFAULT_INSTANCE.createBuilder(initializationResponseOuterClass$InitializationResponse);
    }

    public static InitializationResponseOuterClass$InitializationResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InitializationResponseOuterClass$InitializationResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InitializationResponseOuterClass$InitializationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InitializationResponseOuterClass$InitializationResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static InitializationResponseOuterClass$InitializationResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (InitializationResponseOuterClass$InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static InitializationResponseOuterClass$InitializationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (InitializationResponseOuterClass$InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static InitializationResponseOuterClass$InitializationResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (InitializationResponseOuterClass$InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static InitializationResponseOuterClass$InitializationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InitializationResponseOuterClass$InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static InitializationResponseOuterClass$InitializationResponse parseFrom(InputStream inputStream) throws IOException {
        return (InitializationResponseOuterClass$InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InitializationResponseOuterClass$InitializationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InitializationResponseOuterClass$InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static InitializationResponseOuterClass$InitializationResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InitializationResponseOuterClass$InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InitializationResponseOuterClass$InitializationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (InitializationResponseOuterClass$InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static InitializationResponseOuterClass$InitializationResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InitializationResponseOuterClass$InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InitializationResponseOuterClass$InitializationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (InitializationResponseOuterClass$InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<InitializationResponseOuterClass$InitializationResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountOfLastShownCampaigns(int i) {
        this.countOfLastShownCampaigns_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setError(ErrorOuterClass$Error errorOuterClass$Error) {
        errorOuterClass$Error.getClass();
        this.error_ = errorOuterClass$Error;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNativeConfiguration(NativeConfigurationOuterClass$NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration) {
        nativeConfigurationOuterClass$NativeConfiguration.getClass();
        this.nativeConfiguration_ = nativeConfigurationOuterClass$NativeConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggerInitializationCompletedRequest(boolean z) {
        this.triggerInitializationCompletedRequest_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUniversalRequestUrl(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.universalRequestUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUniversalRequestUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.universalRequestUrl_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    public boolean containsScarPlacements(String str) {
        str.getClass();
        return internalGetScarPlacements().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (InitializationResponseOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new InitializationResponseOuterClass$InitializationResponse();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\u0006��\u0001\u0001\u0006\u0006\u0001����\u0001\t\u0002ለ��\u0003ဉ\u0001\u0004\u0007\u0005\u0004\u00062", new Object[]{"bitField0_", "nativeConfiguration_", "universalRequestUrl_", "error_", "triggerInitializationCompletedRequest_", "countOfLastShownCampaigns_", "scarPlacements_", ScarPlacementsDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<InitializationResponseOuterClass$InitializationResponse> parser = PARSER;
                Parser<InitializationResponseOuterClass$InitializationResponse> parser2 = parser;
                if (parser == null) {
                    synchronized (InitializationResponseOuterClass$InitializationResponse.class) {
                        try {
                            Parser<InitializationResponseOuterClass$InitializationResponse> parser3 = PARSER;
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

    public int getCountOfLastShownCampaigns() {
        return this.countOfLastShownCampaigns_;
    }

    public ErrorOuterClass$Error getError() {
        ErrorOuterClass$Error errorOuterClass$Error = this.error_;
        ErrorOuterClass$Error errorOuterClass$Error2 = errorOuterClass$Error;
        if (errorOuterClass$Error == null) {
            errorOuterClass$Error2 = ErrorOuterClass$Error.getDefaultInstance();
        }
        return errorOuterClass$Error2;
    }

    public NativeConfigurationOuterClass$NativeConfiguration getNativeConfiguration() {
        NativeConfigurationOuterClass$NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration = this.nativeConfiguration_;
        NativeConfigurationOuterClass$NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration2 = nativeConfigurationOuterClass$NativeConfiguration;
        if (nativeConfigurationOuterClass$NativeConfiguration == null) {
            nativeConfigurationOuterClass$NativeConfiguration2 = NativeConfigurationOuterClass$NativeConfiguration.getDefaultInstance();
        }
        return nativeConfigurationOuterClass$NativeConfiguration2;
    }

    @Deprecated
    public Map<String, InitializationResponseOuterClass$Placement> getScarPlacements() {
        return getScarPlacementsMap();
    }

    public int getScarPlacementsCount() {
        return internalGetScarPlacements().size();
    }

    public Map<String, InitializationResponseOuterClass$Placement> getScarPlacementsMap() {
        return Collections.unmodifiableMap(internalGetScarPlacements());
    }

    public InitializationResponseOuterClass$Placement getScarPlacementsOrDefault(String str, InitializationResponseOuterClass$Placement initializationResponseOuterClass$Placement) {
        str.getClass();
        MapFieldLite<String, InitializationResponseOuterClass$Placement> internalGetScarPlacements = internalGetScarPlacements();
        if (internalGetScarPlacements.containsKey(str)) {
            initializationResponseOuterClass$Placement = internalGetScarPlacements.get(str);
        }
        return initializationResponseOuterClass$Placement;
    }

    public InitializationResponseOuterClass$Placement getScarPlacementsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, InitializationResponseOuterClass$Placement> internalGetScarPlacements = internalGetScarPlacements();
        if (internalGetScarPlacements.containsKey(str)) {
            return internalGetScarPlacements.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean getTriggerInitializationCompletedRequest() {
        return this.triggerInitializationCompletedRequest_;
    }

    public String getUniversalRequestUrl() {
        return this.universalRequestUrl_;
    }

    public ByteString getUniversalRequestUrlBytes() {
        return ByteString.copyFromUtf8(this.universalRequestUrl_);
    }

    public boolean hasError() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNativeConfiguration() {
        return this.nativeConfiguration_ != null;
    }

    public boolean hasUniversalRequestUrl() {
        boolean z = true;
        if ((this.bitField0_ & 1) == 0) {
            z = false;
        }
        return z;
    }
}
