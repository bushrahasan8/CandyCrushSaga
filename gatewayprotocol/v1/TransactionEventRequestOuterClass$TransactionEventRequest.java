package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: TransactionEventRequestOuterClass$TransactionEventRequest.class */
public final class TransactionEventRequestOuterClass$TransactionEventRequest extends GeneratedMessageLite<TransactionEventRequestOuterClass$TransactionEventRequest, Builder> implements MessageLiteOrBuilder {
    public static final int APP_STORE_FIELD_NUMBER = 3;
    public static final int CUSTOM_STORE_FIELD_NUMBER = 4;
    private static final TransactionEventRequestOuterClass$TransactionEventRequest DEFAULT_INSTANCE;
    public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 2;
    private static volatile Parser<TransactionEventRequestOuterClass$TransactionEventRequest> PARSER;
    public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 1;
    public static final int TRANSACTION_DATA_FIELD_NUMBER = 5;
    private int appStore_;
    private DynamicDeviceInfoOuterClass$DynamicDeviceInfo dynamicDeviceInfo_;
    private StaticDeviceInfoOuterClass$StaticDeviceInfo staticDeviceInfo_;
    private String customStore_ = "";
    private Internal.ProtobufList<TransactionEventRequestOuterClass$TransactionData> transactionData_ = GeneratedMessageLite.emptyProtobufList();

    /* loaded from: TransactionEventRequestOuterClass$TransactionEventRequest$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private Builder() {
            super(TransactionEventRequestOuterClass$TransactionEventRequest.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(TransactionEventRequestOuterClass$1 transactionEventRequestOuterClass$1) {
            this();
        }

        public Builder addAllTransactionData(Iterable iterable) {
            copyOnWrite();
            ((TransactionEventRequestOuterClass$TransactionEventRequest) this.instance).addAllTransactionData(iterable);
            return this;
        }

        public List getTransactionDataList() {
            return Collections.unmodifiableList(((TransactionEventRequestOuterClass$TransactionEventRequest) this.instance).getTransactionDataList());
        }

        public Builder setAppStore(TransactionEventRequestOuterClass$StoreType transactionEventRequestOuterClass$StoreType) {
            copyOnWrite();
            ((TransactionEventRequestOuterClass$TransactionEventRequest) this.instance).setAppStore(transactionEventRequestOuterClass$StoreType);
            return this;
        }

        public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass$DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo) {
            copyOnWrite();
            ((TransactionEventRequestOuterClass$TransactionEventRequest) this.instance).setDynamicDeviceInfo(dynamicDeviceInfoOuterClass$DynamicDeviceInfo);
            return this;
        }

        public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass$StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo) {
            copyOnWrite();
            ((TransactionEventRequestOuterClass$TransactionEventRequest) this.instance).setStaticDeviceInfo(staticDeviceInfoOuterClass$StaticDeviceInfo);
            return this;
        }
    }

    static {
        TransactionEventRequestOuterClass$TransactionEventRequest transactionEventRequestOuterClass$TransactionEventRequest = new TransactionEventRequestOuterClass$TransactionEventRequest();
        DEFAULT_INSTANCE = transactionEventRequestOuterClass$TransactionEventRequest;
        GeneratedMessageLite.registerDefaultInstance(TransactionEventRequestOuterClass$TransactionEventRequest.class, transactionEventRequestOuterClass$TransactionEventRequest);
    }

    private TransactionEventRequestOuterClass$TransactionEventRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTransactionData(Iterable<? extends TransactionEventRequestOuterClass$TransactionData> iterable) {
        ensureTransactionDataIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.transactionData_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTransactionData(int i, TransactionEventRequestOuterClass$TransactionData transactionEventRequestOuterClass$TransactionData) {
        transactionEventRequestOuterClass$TransactionData.getClass();
        ensureTransactionDataIsMutable();
        this.transactionData_.add(i, transactionEventRequestOuterClass$TransactionData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTransactionData(TransactionEventRequestOuterClass$TransactionData transactionEventRequestOuterClass$TransactionData) {
        transactionEventRequestOuterClass$TransactionData.getClass();
        ensureTransactionDataIsMutable();
        this.transactionData_.add(transactionEventRequestOuterClass$TransactionData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppStore() {
        this.appStore_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustomStore() {
        this.customStore_ = getDefaultInstance().getCustomStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDynamicDeviceInfo() {
        this.dynamicDeviceInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStaticDeviceInfo() {
        this.staticDeviceInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransactionData() {
        this.transactionData_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureTransactionDataIsMutable() {
        Internal.ProtobufList<TransactionEventRequestOuterClass$TransactionData> protobufList = this.transactionData_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.transactionData_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static TransactionEventRequestOuterClass$TransactionEventRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass$DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo) {
        dynamicDeviceInfoOuterClass$DynamicDeviceInfo.getClass();
        DynamicDeviceInfoOuterClass$DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo2 = this.dynamicDeviceInfo_;
        if (dynamicDeviceInfoOuterClass$DynamicDeviceInfo2 == null || dynamicDeviceInfoOuterClass$DynamicDeviceInfo2 == DynamicDeviceInfoOuterClass$DynamicDeviceInfo.getDefaultInstance()) {
            this.dynamicDeviceInfo_ = dynamicDeviceInfoOuterClass$DynamicDeviceInfo;
        } else {
            this.dynamicDeviceInfo_ = (DynamicDeviceInfoOuterClass$DynamicDeviceInfo) ((DynamicDeviceInfoOuterClass$DynamicDeviceInfo.Builder) DynamicDeviceInfoOuterClass$DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom((DynamicDeviceInfoOuterClass$DynamicDeviceInfo.Builder) dynamicDeviceInfoOuterClass$DynamicDeviceInfo)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStaticDeviceInfo(StaticDeviceInfoOuterClass$StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo) {
        staticDeviceInfoOuterClass$StaticDeviceInfo.getClass();
        StaticDeviceInfoOuterClass$StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo2 = this.staticDeviceInfo_;
        if (staticDeviceInfoOuterClass$StaticDeviceInfo2 == null || staticDeviceInfoOuterClass$StaticDeviceInfo2 == StaticDeviceInfoOuterClass$StaticDeviceInfo.getDefaultInstance()) {
            this.staticDeviceInfo_ = staticDeviceInfoOuterClass$StaticDeviceInfo;
        } else {
            this.staticDeviceInfo_ = (StaticDeviceInfoOuterClass$StaticDeviceInfo) ((StaticDeviceInfoOuterClass$StaticDeviceInfo.Builder) StaticDeviceInfoOuterClass$StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom((StaticDeviceInfoOuterClass$StaticDeviceInfo.Builder) staticDeviceInfoOuterClass$StaticDeviceInfo)).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(TransactionEventRequestOuterClass$TransactionEventRequest transactionEventRequestOuterClass$TransactionEventRequest) {
        return DEFAULT_INSTANCE.createBuilder(transactionEventRequestOuterClass$TransactionEventRequest);
    }

    public static TransactionEventRequestOuterClass$TransactionEventRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TransactionEventRequestOuterClass$TransactionEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransactionEventRequestOuterClass$TransactionEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TransactionEventRequestOuterClass$TransactionEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TransactionEventRequestOuterClass$TransactionEventRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TransactionEventRequestOuterClass$TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TransactionEventRequestOuterClass$TransactionEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TransactionEventRequestOuterClass$TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TransactionEventRequestOuterClass$TransactionEventRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TransactionEventRequestOuterClass$TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TransactionEventRequestOuterClass$TransactionEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TransactionEventRequestOuterClass$TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static TransactionEventRequestOuterClass$TransactionEventRequest parseFrom(InputStream inputStream) throws IOException {
        return (TransactionEventRequestOuterClass$TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransactionEventRequestOuterClass$TransactionEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TransactionEventRequestOuterClass$TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TransactionEventRequestOuterClass$TransactionEventRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TransactionEventRequestOuterClass$TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TransactionEventRequestOuterClass$TransactionEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TransactionEventRequestOuterClass$TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TransactionEventRequestOuterClass$TransactionEventRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TransactionEventRequestOuterClass$TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TransactionEventRequestOuterClass$TransactionEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TransactionEventRequestOuterClass$TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<TransactionEventRequestOuterClass$TransactionEventRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTransactionData(int i) {
        ensureTransactionDataIsMutable();
        this.transactionData_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppStore(TransactionEventRequestOuterClass$StoreType transactionEventRequestOuterClass$StoreType) {
        this.appStore_ = transactionEventRequestOuterClass$StoreType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppStoreValue(int i) {
        this.appStore_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomStore(String str) {
        str.getClass();
        this.customStore_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomStoreBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.customStore_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass$DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo) {
        dynamicDeviceInfoOuterClass$DynamicDeviceInfo.getClass();
        this.dynamicDeviceInfo_ = dynamicDeviceInfoOuterClass$DynamicDeviceInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStaticDeviceInfo(StaticDeviceInfoOuterClass$StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo) {
        staticDeviceInfoOuterClass$StaticDeviceInfo.getClass();
        this.staticDeviceInfo_ = staticDeviceInfoOuterClass$StaticDeviceInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransactionData(int i, TransactionEventRequestOuterClass$TransactionData transactionEventRequestOuterClass$TransactionData) {
        transactionEventRequestOuterClass$TransactionData.getClass();
        ensureTransactionDataIsMutable();
        this.transactionData_.set(i, transactionEventRequestOuterClass$TransactionData);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (TransactionEventRequestOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TransactionEventRequestOuterClass$TransactionEventRequest();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\u0005����\u0001\u0005\u0005��\u0001��\u0001\t\u0002\t\u0003\f\u0004Ȉ\u0005\u001b", new Object[]{"staticDeviceInfo_", "dynamicDeviceInfo_", "appStore_", "customStore_", "transactionData_", TransactionEventRequestOuterClass$TransactionData.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TransactionEventRequestOuterClass$TransactionEventRequest> parser = PARSER;
                Parser<TransactionEventRequestOuterClass$TransactionEventRequest> parser2 = parser;
                if (parser == null) {
                    synchronized (TransactionEventRequestOuterClass$TransactionEventRequest.class) {
                        try {
                            Parser<TransactionEventRequestOuterClass$TransactionEventRequest> parser3 = PARSER;
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

    public TransactionEventRequestOuterClass$StoreType getAppStore() {
        TransactionEventRequestOuterClass$StoreType forNumber = TransactionEventRequestOuterClass$StoreType.forNumber(this.appStore_);
        TransactionEventRequestOuterClass$StoreType transactionEventRequestOuterClass$StoreType = forNumber;
        if (forNumber == null) {
            transactionEventRequestOuterClass$StoreType = TransactionEventRequestOuterClass$StoreType.UNRECOGNIZED;
        }
        return transactionEventRequestOuterClass$StoreType;
    }

    public int getAppStoreValue() {
        return this.appStore_;
    }

    public String getCustomStore() {
        return this.customStore_;
    }

    public ByteString getCustomStoreBytes() {
        return ByteString.copyFromUtf8(this.customStore_);
    }

    public DynamicDeviceInfoOuterClass$DynamicDeviceInfo getDynamicDeviceInfo() {
        DynamicDeviceInfoOuterClass$DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo = this.dynamicDeviceInfo_;
        DynamicDeviceInfoOuterClass$DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo2 = dynamicDeviceInfoOuterClass$DynamicDeviceInfo;
        if (dynamicDeviceInfoOuterClass$DynamicDeviceInfo == null) {
            dynamicDeviceInfoOuterClass$DynamicDeviceInfo2 = DynamicDeviceInfoOuterClass$DynamicDeviceInfo.getDefaultInstance();
        }
        return dynamicDeviceInfoOuterClass$DynamicDeviceInfo2;
    }

    public StaticDeviceInfoOuterClass$StaticDeviceInfo getStaticDeviceInfo() {
        StaticDeviceInfoOuterClass$StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo = this.staticDeviceInfo_;
        StaticDeviceInfoOuterClass$StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo2 = staticDeviceInfoOuterClass$StaticDeviceInfo;
        if (staticDeviceInfoOuterClass$StaticDeviceInfo == null) {
            staticDeviceInfoOuterClass$StaticDeviceInfo2 = StaticDeviceInfoOuterClass$StaticDeviceInfo.getDefaultInstance();
        }
        return staticDeviceInfoOuterClass$StaticDeviceInfo2;
    }

    public TransactionEventRequestOuterClass$TransactionData getTransactionData(int i) {
        return this.transactionData_.get(i);
    }

    public int getTransactionDataCount() {
        return this.transactionData_.size();
    }

    public List<TransactionEventRequestOuterClass$TransactionData> getTransactionDataList() {
        return this.transactionData_;
    }

    public TransactionEventRequestOuterClass$TransactionDataOrBuilder getTransactionDataOrBuilder(int i) {
        return this.transactionData_.get(i);
    }

    public List<? extends TransactionEventRequestOuterClass$TransactionDataOrBuilder> getTransactionDataOrBuilderList() {
        return this.transactionData_;
    }

    public boolean hasDynamicDeviceInfo() {
        return this.dynamicDeviceInfo_ != null;
    }

    public boolean hasStaticDeviceInfo() {
        return this.staticDeviceInfo_ != null;
    }
}
