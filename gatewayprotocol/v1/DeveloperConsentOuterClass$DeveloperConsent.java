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

/* loaded from: DeveloperConsentOuterClass$DeveloperConsent.class */
public final class DeveloperConsentOuterClass$DeveloperConsent extends GeneratedMessageLite<DeveloperConsentOuterClass$DeveloperConsent, Builder> implements MessageLiteOrBuilder {
    private static final DeveloperConsentOuterClass$DeveloperConsent DEFAULT_INSTANCE;
    public static final int OPTIONS_FIELD_NUMBER = 1;
    private static volatile Parser<DeveloperConsentOuterClass$DeveloperConsent> PARSER;
    private Internal.ProtobufList<DeveloperConsentOuterClass$DeveloperConsentOption> options_ = GeneratedMessageLite.emptyProtobufList();

    /* loaded from: DeveloperConsentOuterClass$DeveloperConsent$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private Builder() {
            super(DeveloperConsentOuterClass$DeveloperConsent.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(DeveloperConsentOuterClass$1 developerConsentOuterClass$1) {
            this();
        }

        public Builder addAllOptions(Iterable iterable) {
            copyOnWrite();
            ((DeveloperConsentOuterClass$DeveloperConsent) this.instance).addAllOptions(iterable);
            return this;
        }

        public List getOptionsList() {
            return Collections.unmodifiableList(((DeveloperConsentOuterClass$DeveloperConsent) this.instance).getOptionsList());
        }
    }

    static {
        DeveloperConsentOuterClass$DeveloperConsent developerConsentOuterClass$DeveloperConsent = new DeveloperConsentOuterClass$DeveloperConsent();
        DEFAULT_INSTANCE = developerConsentOuterClass$DeveloperConsent;
        GeneratedMessageLite.registerDefaultInstance(DeveloperConsentOuterClass$DeveloperConsent.class, developerConsentOuterClass$DeveloperConsent);
    }

    private DeveloperConsentOuterClass$DeveloperConsent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends DeveloperConsentOuterClass$DeveloperConsentOption> iterable) {
        ensureOptionsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i, DeveloperConsentOuterClass$DeveloperConsentOption developerConsentOuterClass$DeveloperConsentOption) {
        developerConsentOuterClass$DeveloperConsentOption.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, developerConsentOuterClass$DeveloperConsentOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(DeveloperConsentOuterClass$DeveloperConsentOption developerConsentOuterClass$DeveloperConsentOption) {
        developerConsentOuterClass$DeveloperConsentOption.getClass();
        ensureOptionsIsMutable();
        this.options_.add(developerConsentOuterClass$DeveloperConsentOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureOptionsIsMutable() {
        Internal.ProtobufList<DeveloperConsentOuterClass$DeveloperConsentOption> protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DeveloperConsentOuterClass$DeveloperConsent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(DeveloperConsentOuterClass$DeveloperConsent developerConsentOuterClass$DeveloperConsent) {
        return DEFAULT_INSTANCE.createBuilder(developerConsentOuterClass$DeveloperConsent);
    }

    public static DeveloperConsentOuterClass$DeveloperConsent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DeveloperConsentOuterClass$DeveloperConsent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeveloperConsentOuterClass$DeveloperConsent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeveloperConsentOuterClass$DeveloperConsent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DeveloperConsentOuterClass$DeveloperConsent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DeveloperConsentOuterClass$DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DeveloperConsentOuterClass$DeveloperConsent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DeveloperConsentOuterClass$DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DeveloperConsentOuterClass$DeveloperConsent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DeveloperConsentOuterClass$DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DeveloperConsentOuterClass$DeveloperConsent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeveloperConsentOuterClass$DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DeveloperConsentOuterClass$DeveloperConsent parseFrom(InputStream inputStream) throws IOException {
        return (DeveloperConsentOuterClass$DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeveloperConsentOuterClass$DeveloperConsent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeveloperConsentOuterClass$DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DeveloperConsentOuterClass$DeveloperConsent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DeveloperConsentOuterClass$DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static DeveloperConsentOuterClass$DeveloperConsent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DeveloperConsentOuterClass$DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DeveloperConsentOuterClass$DeveloperConsent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DeveloperConsentOuterClass$DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DeveloperConsentOuterClass$DeveloperConsent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DeveloperConsentOuterClass$DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<DeveloperConsentOuterClass$DeveloperConsent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int i, DeveloperConsentOuterClass$DeveloperConsentOption developerConsentOuterClass$DeveloperConsentOption) {
        developerConsentOuterClass$DeveloperConsentOption.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i, developerConsentOuterClass$DeveloperConsentOption);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (DeveloperConsentOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new DeveloperConsentOuterClass$DeveloperConsent();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001��\u0001��\u0001\u001b", new Object[]{"options_", DeveloperConsentOuterClass$DeveloperConsentOption.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DeveloperConsentOuterClass$DeveloperConsent> parser = PARSER;
                Parser<DeveloperConsentOuterClass$DeveloperConsent> parser2 = parser;
                if (parser == null) {
                    synchronized (DeveloperConsentOuterClass$DeveloperConsent.class) {
                        try {
                            Parser<DeveloperConsentOuterClass$DeveloperConsent> parser3 = PARSER;
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

    public DeveloperConsentOuterClass$DeveloperConsentOption getOptions(int i) {
        return this.options_.get(i);
    }

    public int getOptionsCount() {
        return this.options_.size();
    }

    public List<DeveloperConsentOuterClass$DeveloperConsentOption> getOptionsList() {
        return this.options_;
    }

    public DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    public List<? extends DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }
}
