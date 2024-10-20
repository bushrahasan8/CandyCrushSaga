package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: TransactionEventRequestOuterClass$TransactionData.class */
public final class TransactionEventRequestOuterClass$TransactionData extends GeneratedMessageLite<TransactionEventRequestOuterClass$TransactionData, Builder> implements TransactionEventRequestOuterClass$TransactionDataOrBuilder {
    private static final TransactionEventRequestOuterClass$TransactionData DEFAULT_INSTANCE;
    public static final int EVENT_ID_FIELD_NUMBER = 3;
    private static volatile Parser<TransactionEventRequestOuterClass$TransactionData> PARSER;
    public static final int PRODUCT_FIELD_NUMBER = 5;
    public static final int PRODUCT_ID_FIELD_NUMBER = 2;
    public static final int RECEIPT_FIELD_NUMBER = 7;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int TRANSACTION_FIELD_NUMBER = 6;
    public static final int TRANSACTION_ID_FIELD_NUMBER = 4;
    public static final int TRANSACTION_STATE_FIELD_NUMBER = 8;
    private int bitField0_;
    private Timestamp timestamp_;
    private int transactionState_;
    private String productId_ = "";
    private ByteString eventId_ = ByteString.EMPTY;
    private String transactionId_ = "";
    private String product_ = "";
    private String transaction_ = "";
    private String receipt_ = "";

    /* loaded from: TransactionEventRequestOuterClass$TransactionData$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder implements TransactionEventRequestOuterClass$TransactionDataOrBuilder {
        private Builder() {
            super(TransactionEventRequestOuterClass$TransactionData.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(TransactionEventRequestOuterClass$1 transactionEventRequestOuterClass$1) {
            this();
        }

        public Builder setEventId(ByteString byteString) {
            copyOnWrite();
            ((TransactionEventRequestOuterClass$TransactionData) this.instance).setEventId(byteString);
            return this;
        }

        public Builder setProduct(String str) {
            copyOnWrite();
            ((TransactionEventRequestOuterClass$TransactionData) this.instance).setProduct(str);
            return this;
        }

        public Builder setProductId(String str) {
            copyOnWrite();
            ((TransactionEventRequestOuterClass$TransactionData) this.instance).setProductId(str);
            return this;
        }

        public Builder setTimestamp(Timestamp timestamp) {
            copyOnWrite();
            ((TransactionEventRequestOuterClass$TransactionData) this.instance).setTimestamp(timestamp);
            return this;
        }

        public Builder setTransaction(String str) {
            copyOnWrite();
            ((TransactionEventRequestOuterClass$TransactionData) this.instance).setTransaction(str);
            return this;
        }

        public Builder setTransactionId(String str) {
            copyOnWrite();
            ((TransactionEventRequestOuterClass$TransactionData) this.instance).setTransactionId(str);
            return this;
        }

        public Builder setTransactionState(TransactionEventRequestOuterClass$TransactionState transactionEventRequestOuterClass$TransactionState) {
            copyOnWrite();
            ((TransactionEventRequestOuterClass$TransactionData) this.instance).setTransactionState(transactionEventRequestOuterClass$TransactionState);
            return this;
        }
    }

    static {
        TransactionEventRequestOuterClass$TransactionData transactionEventRequestOuterClass$TransactionData = new TransactionEventRequestOuterClass$TransactionData();
        DEFAULT_INSTANCE = transactionEventRequestOuterClass$TransactionData;
        GeneratedMessageLite.registerDefaultInstance(TransactionEventRequestOuterClass$TransactionData.class, transactionEventRequestOuterClass$TransactionData);
    }

    private TransactionEventRequestOuterClass$TransactionData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventId() {
        this.eventId_ = getDefaultInstance().getEventId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProduct() {
        this.product_ = getDefaultInstance().getProduct();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductId() {
        this.productId_ = getDefaultInstance().getProductId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReceipt() {
        this.bitField0_ &= -2;
        this.receipt_ = getDefaultInstance().getReceipt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransaction() {
        this.transaction_ = getDefaultInstance().getTransaction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransactionId() {
        this.transactionId_ = getDefaultInstance().getTransactionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransactionState() {
        this.transactionState_ = 0;
    }

    public static TransactionEventRequestOuterClass$TransactionData getDefaultInstance() {
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

    public static Builder newBuilder(TransactionEventRequestOuterClass$TransactionData transactionEventRequestOuterClass$TransactionData) {
        return DEFAULT_INSTANCE.createBuilder(transactionEventRequestOuterClass$TransactionData);
    }

    public static TransactionEventRequestOuterClass$TransactionData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TransactionEventRequestOuterClass$TransactionData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransactionEventRequestOuterClass$TransactionData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TransactionEventRequestOuterClass$TransactionData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TransactionEventRequestOuterClass$TransactionData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TransactionEventRequestOuterClass$TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TransactionEventRequestOuterClass$TransactionData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TransactionEventRequestOuterClass$TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TransactionEventRequestOuterClass$TransactionData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TransactionEventRequestOuterClass$TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TransactionEventRequestOuterClass$TransactionData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TransactionEventRequestOuterClass$TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static TransactionEventRequestOuterClass$TransactionData parseFrom(InputStream inputStream) throws IOException {
        return (TransactionEventRequestOuterClass$TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransactionEventRequestOuterClass$TransactionData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TransactionEventRequestOuterClass$TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TransactionEventRequestOuterClass$TransactionData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TransactionEventRequestOuterClass$TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TransactionEventRequestOuterClass$TransactionData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TransactionEventRequestOuterClass$TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TransactionEventRequestOuterClass$TransactionData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TransactionEventRequestOuterClass$TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TransactionEventRequestOuterClass$TransactionData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TransactionEventRequestOuterClass$TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<TransactionEventRequestOuterClass$TransactionData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventId(ByteString byteString) {
        byteString.getClass();
        this.eventId_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProduct(String str) {
        str.getClass();
        this.product_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.product_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductId(String str) {
        str.getClass();
        this.productId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.productId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReceipt(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.receipt_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReceiptBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.receipt_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        this.timestamp_ = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransaction(String str) {
        str.getClass();
        this.transaction_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransactionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.transaction_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransactionId(String str) {
        str.getClass();
        this.transactionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransactionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.transactionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransactionState(TransactionEventRequestOuterClass$TransactionState transactionEventRequestOuterClass$TransactionState) {
        this.transactionState_ = transactionEventRequestOuterClass$TransactionState.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransactionStateValue(int i) {
        this.transactionState_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (TransactionEventRequestOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TransactionEventRequestOuterClass$TransactionData();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\b��\u0001\u0001\b\b������\u0001\t\u0002Ȉ\u0003\n\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007ለ��\b\f", new Object[]{"bitField0_", "timestamp_", "productId_", "eventId_", "transactionId_", "product_", "transaction_", "receipt_", "transactionState_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TransactionEventRequestOuterClass$TransactionData> parser = PARSER;
                Parser<TransactionEventRequestOuterClass$TransactionData> parser2 = parser;
                if (parser == null) {
                    synchronized (TransactionEventRequestOuterClass$TransactionData.class) {
                        try {
                            Parser<TransactionEventRequestOuterClass$TransactionData> parser3 = PARSER;
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

    public ByteString getEventId() {
        return this.eventId_;
    }

    public String getProduct() {
        return this.product_;
    }

    public ByteString getProductBytes() {
        return ByteString.copyFromUtf8(this.product_);
    }

    public String getProductId() {
        return this.productId_;
    }

    public ByteString getProductIdBytes() {
        return ByteString.copyFromUtf8(this.productId_);
    }

    public String getReceipt() {
        return this.receipt_;
    }

    public ByteString getReceiptBytes() {
        return ByteString.copyFromUtf8(this.receipt_);
    }

    public Timestamp getTimestamp() {
        Timestamp timestamp = this.timestamp_;
        Timestamp timestamp2 = timestamp;
        if (timestamp == null) {
            timestamp2 = Timestamp.getDefaultInstance();
        }
        return timestamp2;
    }

    public String getTransaction() {
        return this.transaction_;
    }

    public ByteString getTransactionBytes() {
        return ByteString.copyFromUtf8(this.transaction_);
    }

    public String getTransactionId() {
        return this.transactionId_;
    }

    public ByteString getTransactionIdBytes() {
        return ByteString.copyFromUtf8(this.transactionId_);
    }

    public TransactionEventRequestOuterClass$TransactionState getTransactionState() {
        TransactionEventRequestOuterClass$TransactionState forNumber = TransactionEventRequestOuterClass$TransactionState.forNumber(this.transactionState_);
        TransactionEventRequestOuterClass$TransactionState transactionEventRequestOuterClass$TransactionState = forNumber;
        if (forNumber == null) {
            transactionEventRequestOuterClass$TransactionState = TransactionEventRequestOuterClass$TransactionState.UNRECOGNIZED;
        }
        return transactionEventRequestOuterClass$TransactionState;
    }

    public int getTransactionStateValue() {
        return this.transactionState_;
    }

    public boolean hasReceipt() {
        boolean z = true;
        if ((this.bitField0_ & 1) == 0) {
            z = false;
        }
        return z;
    }

    public boolean hasTimestamp() {
        return this.timestamp_ != null;
    }
}
