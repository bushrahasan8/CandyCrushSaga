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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: DiagnosticEventRequestOuterClass$DiagnosticEventRequest.class */
public final class DiagnosticEventRequestOuterClass$DiagnosticEventRequest extends GeneratedMessageLite<DiagnosticEventRequestOuterClass$DiagnosticEventRequest, Builder> implements MessageLiteOrBuilder {
    public static final int BATCH_FIELD_NUMBER = 1;
    private static final DiagnosticEventRequestOuterClass$DiagnosticEventRequest DEFAULT_INSTANCE;
    private static volatile Parser<DiagnosticEventRequestOuterClass$DiagnosticEventRequest> PARSER;
    private Internal.ProtobufList<DiagnosticEventRequestOuterClass$DiagnosticEvent> batch_ = GeneratedMessageLite.emptyProtobufList();

    /* loaded from: DiagnosticEventRequestOuterClass$DiagnosticEventRequest$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private Builder() {
            super(DiagnosticEventRequestOuterClass$DiagnosticEventRequest.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(DiagnosticEventRequestOuterClass$1 diagnosticEventRequestOuterClass$1) {
            this();
        }

        public Builder addAllBatch(Iterable iterable) {
            copyOnWrite();
            ((DiagnosticEventRequestOuterClass$DiagnosticEventRequest) this.instance).addAllBatch(iterable);
            return this;
        }

        public Builder clearBatch() {
            copyOnWrite();
            ((DiagnosticEventRequestOuterClass$DiagnosticEventRequest) this.instance).clearBatch();
            return this;
        }

        public List getBatchList() {
            return Collections.unmodifiableList(((DiagnosticEventRequestOuterClass$DiagnosticEventRequest) this.instance).getBatchList());
        }
    }

    static {
        DiagnosticEventRequestOuterClass$DiagnosticEventRequest diagnosticEventRequestOuterClass$DiagnosticEventRequest = new DiagnosticEventRequestOuterClass$DiagnosticEventRequest();
        DEFAULT_INSTANCE = diagnosticEventRequestOuterClass$DiagnosticEventRequest;
        GeneratedMessageLite.registerDefaultInstance(DiagnosticEventRequestOuterClass$DiagnosticEventRequest.class, diagnosticEventRequestOuterClass$DiagnosticEventRequest);
    }

    private DiagnosticEventRequestOuterClass$DiagnosticEventRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBatch(Iterable<? extends DiagnosticEventRequestOuterClass$DiagnosticEvent> iterable) {
        ensureBatchIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.batch_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBatch(int i, DiagnosticEventRequestOuterClass$DiagnosticEvent diagnosticEventRequestOuterClass$DiagnosticEvent) {
        diagnosticEventRequestOuterClass$DiagnosticEvent.getClass();
        ensureBatchIsMutable();
        this.batch_.add(i, diagnosticEventRequestOuterClass$DiagnosticEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBatch(DiagnosticEventRequestOuterClass$DiagnosticEvent diagnosticEventRequestOuterClass$DiagnosticEvent) {
        diagnosticEventRequestOuterClass$DiagnosticEvent.getClass();
        ensureBatchIsMutable();
        this.batch_.add(diagnosticEventRequestOuterClass$DiagnosticEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatch() {
        this.batch_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureBatchIsMutable() {
        Internal.ProtobufList<DiagnosticEventRequestOuterClass$DiagnosticEvent> protobufList = this.batch_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.batch_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DiagnosticEventRequestOuterClass$DiagnosticEventRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(DiagnosticEventRequestOuterClass$DiagnosticEventRequest diagnosticEventRequestOuterClass$DiagnosticEventRequest) {
        return DEFAULT_INSTANCE.createBuilder(diagnosticEventRequestOuterClass$DiagnosticEventRequest);
    }

    public static DiagnosticEventRequestOuterClass$DiagnosticEventRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DiagnosticEventRequestOuterClass$DiagnosticEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DiagnosticEventRequestOuterClass$DiagnosticEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DiagnosticEventRequestOuterClass$DiagnosticEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DiagnosticEventRequestOuterClass$DiagnosticEventRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DiagnosticEventRequestOuterClass$DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DiagnosticEventRequestOuterClass$DiagnosticEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DiagnosticEventRequestOuterClass$DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DiagnosticEventRequestOuterClass$DiagnosticEventRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DiagnosticEventRequestOuterClass$DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DiagnosticEventRequestOuterClass$DiagnosticEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DiagnosticEventRequestOuterClass$DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DiagnosticEventRequestOuterClass$DiagnosticEventRequest parseFrom(InputStream inputStream) throws IOException {
        return (DiagnosticEventRequestOuterClass$DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DiagnosticEventRequestOuterClass$DiagnosticEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DiagnosticEventRequestOuterClass$DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DiagnosticEventRequestOuterClass$DiagnosticEventRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DiagnosticEventRequestOuterClass$DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static DiagnosticEventRequestOuterClass$DiagnosticEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DiagnosticEventRequestOuterClass$DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DiagnosticEventRequestOuterClass$DiagnosticEventRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DiagnosticEventRequestOuterClass$DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DiagnosticEventRequestOuterClass$DiagnosticEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DiagnosticEventRequestOuterClass$DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<DiagnosticEventRequestOuterClass$DiagnosticEventRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBatch(int i) {
        ensureBatchIsMutable();
        this.batch_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatch(int i, DiagnosticEventRequestOuterClass$DiagnosticEvent diagnosticEventRequestOuterClass$DiagnosticEvent) {
        diagnosticEventRequestOuterClass$DiagnosticEvent.getClass();
        ensureBatchIsMutable();
        this.batch_.set(i, diagnosticEventRequestOuterClass$DiagnosticEvent);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (DiagnosticEventRequestOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new DiagnosticEventRequestOuterClass$DiagnosticEventRequest();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001��\u0001��\u0001\u001b", new Object[]{"batch_", DiagnosticEventRequestOuterClass$DiagnosticEvent.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DiagnosticEventRequestOuterClass$DiagnosticEventRequest> parser = PARSER;
                Parser<DiagnosticEventRequestOuterClass$DiagnosticEventRequest> parser2 = parser;
                if (parser == null) {
                    synchronized (DiagnosticEventRequestOuterClass$DiagnosticEventRequest.class) {
                        try {
                            Parser<DiagnosticEventRequestOuterClass$DiagnosticEventRequest> parser3 = PARSER;
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

    public DiagnosticEventRequestOuterClass$DiagnosticEvent getBatch(int i) {
        return this.batch_.get(i);
    }

    public int getBatchCount() {
        return this.batch_.size();
    }

    public List<DiagnosticEventRequestOuterClass$DiagnosticEvent> getBatchList() {
        return this.batch_;
    }

    public DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder getBatchOrBuilder(int i) {
        return this.batch_.get(i);
    }

    public List<? extends DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder> getBatchOrBuilderList() {
        return this.batch_;
    }
}
