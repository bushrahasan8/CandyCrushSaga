package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CheckReturnValue
/* loaded from: ExtensionSchemaLite.class */
final class ExtensionSchemaLite extends ExtensionSchema<GeneratedMessageLite.ExtensionDescriptor> {

    /* renamed from: com.google.protobuf.ExtensionSchemaLite$1, reason: invalid class name */
    /* loaded from: ExtensionSchemaLite$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:92:0x010d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                Method dump skipped, instructions count: 293
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ExtensionSchemaLite.AnonymousClass1.m2735clinit():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.ExtensionSchema
    public int extensionNumber(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.ExtensionDescriptor) entry.getKey()).getNumber();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.ExtensionSchema
    public Object findExtensionByNumber(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i) {
        return extensionRegistryLite.findLiteExtensionByNumber(messageLite, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.ExtensionSchema
    public FieldSet<GeneratedMessageLite.ExtensionDescriptor> getExtensions(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.ExtensionSchema
    public FieldSet<GeneratedMessageLite.ExtensionDescriptor> getMutableExtensions(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.ExtensionSchema
    public boolean hasExtensions(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.ExtensionSchema
    public void makeImmutable(Object obj) {
        getExtensions(obj).makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.ExtensionSchema
    public <UT, UB> UB parseExtension(Object obj, Reader reader, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) throws IOException {
        Object valueOf;
        Object obj3;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj2;
        int number = generatedExtension.getNumber();
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    reader.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    reader.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    reader.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    reader.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    reader.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    reader.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    reader.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    reader.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    reader.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    reader.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    reader.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    reader.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    reader.readSInt64List(arrayList);
                    break;
                case 14:
                    ArrayList arrayList2 = new ArrayList();
                    reader.readEnumList(arrayList2);
                    ub = SchemaUtil.filterUnknownEnumList(obj, number, arrayList2, generatedExtension.descriptor.getEnumType(), ub, unknownFieldSchema);
                    arrayList = arrayList2;
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
            fieldSet.setField(generatedExtension.descriptor, arrayList);
        } else {
            if (generatedExtension.getLiteType() != WireFormat.FieldType.ENUM) {
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(reader.readDouble());
                        break;
                    case 2:
                        valueOf = Float.valueOf(reader.readFloat());
                        break;
                    case 3:
                        valueOf = Long.valueOf(reader.readInt64());
                        break;
                    case 4:
                        valueOf = Long.valueOf(reader.readUInt64());
                        break;
                    case 5:
                        valueOf = Integer.valueOf(reader.readInt32());
                        break;
                    case 6:
                        valueOf = Long.valueOf(reader.readFixed64());
                        break;
                    case 7:
                        valueOf = Integer.valueOf(reader.readFixed32());
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(reader.readBool());
                        break;
                    case 9:
                        valueOf = Integer.valueOf(reader.readUInt32());
                        break;
                    case 10:
                        valueOf = Integer.valueOf(reader.readSFixed32());
                        break;
                    case 11:
                        valueOf = Long.valueOf(reader.readSFixed64());
                        break;
                    case 12:
                        valueOf = Integer.valueOf(reader.readSInt32());
                        break;
                    case 13:
                        valueOf = Long.valueOf(reader.readSInt64());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = reader.readBytes();
                        break;
                    case 16:
                        valueOf = reader.readString();
                        break;
                    case 17:
                        if (!generatedExtension.isRepeated()) {
                            Object field = fieldSet.getField(generatedExtension.descriptor);
                            if (field instanceof GeneratedMessageLite) {
                                Schema schemaFor = Protobuf.getInstance().schemaFor((Protobuf) field);
                                Object obj4 = field;
                                if (!((GeneratedMessageLite) field).isMutable()) {
                                    obj4 = schemaFor.newInstance();
                                    schemaFor.mergeFrom(obj4, field);
                                    fieldSet.setField(generatedExtension.descriptor, obj4);
                                }
                                reader.mergeGroupField(obj4, schemaFor, extensionRegistryLite);
                                return ub;
                            }
                        }
                        valueOf = reader.readGroup(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                    case 18:
                        if (!generatedExtension.isRepeated()) {
                            Object field2 = fieldSet.getField(generatedExtension.descriptor);
                            if (field2 instanceof GeneratedMessageLite) {
                                Schema schemaFor2 = Protobuf.getInstance().schemaFor((Protobuf) field2);
                                Object obj5 = field2;
                                if (!((GeneratedMessageLite) field2).isMutable()) {
                                    obj5 = schemaFor2.newInstance();
                                    schemaFor2.mergeFrom(obj5, field2);
                                    fieldSet.setField(generatedExtension.descriptor, obj5);
                                }
                                reader.mergeMessageField(obj5, schemaFor2, extensionRegistryLite);
                                return ub;
                            }
                        }
                        valueOf = reader.readMessage(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            } else {
                int readInt32 = reader.readInt32();
                if (generatedExtension.descriptor.getEnumType().findValueByNumber(readInt32) == null) {
                    return (UB) SchemaUtil.storeUnknownEnum(obj, number, readInt32, ub, unknownFieldSchema);
                }
                valueOf = Integer.valueOf(readInt32);
            }
            if (generatedExtension.isRepeated()) {
                fieldSet.addRepeatedField(generatedExtension.descriptor, valueOf);
            } else {
                int i = AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()];
                if (i == 17 || i == 18) {
                    Object field3 = fieldSet.getField(generatedExtension.descriptor);
                    obj3 = valueOf;
                    if (field3 != null) {
                        obj3 = Internal.mergeMessage(field3, valueOf);
                    }
                } else {
                    obj3 = valueOf;
                }
                fieldSet.setField(generatedExtension.descriptor, obj3);
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.ExtensionSchema
    public void parseLengthPrefixedMessageSetItem(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.setField(generatedExtension.descriptor, reader.readMessage(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.ExtensionSchema
    public void parseMessageSetItem(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        MessageLite.Builder newBuilderForType = generatedExtension.getMessageDefaultInstance().newBuilderForType();
        CodedInputStream newCodedInput = byteString.newCodedInput();
        newBuilderForType.mergeFrom(newCodedInput, extensionRegistryLite);
        fieldSet.setField(generatedExtension.descriptor, newBuilderForType.buildPartial());
        newCodedInput.checkLastTagWas(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.ExtensionSchema
    public void serializeExtension(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = (GeneratedMessageLite.ExtensionDescriptor) entry.getKey();
        if (!extensionDescriptor.isRepeated()) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[extensionDescriptor.getLiteType().ordinal()]) {
                case 1:
                    writer.writeDouble(extensionDescriptor.getNumber(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    writer.writeFloat(extensionDescriptor.getNumber(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    writer.writeInt64(extensionDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    writer.writeUInt64(extensionDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                    writer.writeInt32(extensionDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    writer.writeFixed64(extensionDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    writer.writeFixed32(extensionDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    writer.writeBool(extensionDescriptor.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    writer.writeUInt32(extensionDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    writer.writeSFixed32(extensionDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    writer.writeSFixed64(extensionDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    writer.writeSInt32(extensionDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    writer.writeSInt64(extensionDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 14:
                    writer.writeInt32(extensionDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    writer.writeBytes(extensionDescriptor.getNumber(), (ByteString) entry.getValue());
                    return;
                case 16:
                    writer.writeString(extensionDescriptor.getNumber(), (String) entry.getValue());
                    return;
                case 17:
                    writer.writeGroup(extensionDescriptor.getNumber(), entry.getValue(), Protobuf.getInstance().schemaFor((Class) entry.getValue().getClass()));
                    return;
                case 18:
                    writer.writeMessage(extensionDescriptor.getNumber(), entry.getValue(), Protobuf.getInstance().schemaFor((Class) entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[extensionDescriptor.getLiteType().ordinal()]) {
            case 1:
                SchemaUtil.writeDoubleList(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                return;
            case 2:
                SchemaUtil.writeFloatList(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                return;
            case 3:
                SchemaUtil.writeInt64List(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                return;
            case 4:
                SchemaUtil.writeUInt64List(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                return;
            case 5:
                SchemaUtil.writeInt32List(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                return;
            case 6:
                SchemaUtil.writeFixed64List(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                return;
            case 7:
                SchemaUtil.writeFixed32List(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                return;
            case 8:
                SchemaUtil.writeBoolList(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                return;
            case 9:
                SchemaUtil.writeUInt32List(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                return;
            case 10:
                SchemaUtil.writeSFixed32List(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                return;
            case 11:
                SchemaUtil.writeSFixed64List(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                return;
            case 12:
                SchemaUtil.writeSInt32List(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                return;
            case 13:
                SchemaUtil.writeSInt64List(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                return;
            case 14:
                SchemaUtil.writeInt32List(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                return;
            case 15:
                SchemaUtil.writeBytesList(extensionDescriptor.getNumber(), (List) entry.getValue(), writer);
                return;
            case 16:
                SchemaUtil.writeStringList(extensionDescriptor.getNumber(), (List) entry.getValue(), writer);
                return;
            case 17:
                List list = (List) entry.getValue();
                if (list == null || list.isEmpty()) {
                    return;
                }
                SchemaUtil.writeGroupList(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, Protobuf.getInstance().schemaFor((Class) list.get(0).getClass()));
                return;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                SchemaUtil.writeMessageList(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, Protobuf.getInstance().schemaFor((Class) list2.get(0).getClass()));
                return;
            default:
                return;
        }
    }

    @Override // com.google.protobuf.ExtensionSchema
    void setExtensions(Object obj, FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions = fieldSet;
    }
}
