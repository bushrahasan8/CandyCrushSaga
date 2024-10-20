package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.ironsource.t2;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ProtobufDataEncoderContext.class */
public final class ProtobufDataEncoderContext implements ObjectEncoderContext {
    private final ObjectEncoder fallbackEncoder;
    private final Map objectEncoders;
    private OutputStream output;
    private final ProtobufValueEncoderContext valueEncoderContext = new ProtobufValueEncoderContext(this);
    private final Map valueEncoders;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final FieldDescriptor MAP_KEY_DESC = FieldDescriptor.builder(t2.h.W).withProperty(AtProtobuf.builder().tag(1).build()).build();
    private static final FieldDescriptor MAP_VALUE_DESC = FieldDescriptor.builder("value").withProperty(AtProtobuf.builder().tag(2).build()).build();
    private static final ObjectEncoder DEFAULT_MAP_ENCODER = new ObjectEncoder() { // from class: com.google.firebase.encoders.proto.ProtobufDataEncoderContext$$ExternalSyntheticLambda0
        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            ProtobufDataEncoderContext.lambda$static$0((Map.Entry) obj, (ObjectEncoderContext) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.encoders.proto.ProtobufDataEncoderContext$1, reason: invalid class name */
    /* loaded from: ProtobufDataEncoderContext$1.class */
    public static abstract /* synthetic */ class AnonymousClass1 {
        static final int[] $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x002f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.google.firebase.encoders.proto.Protobuf$IntEncoding[] r0 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.google.firebase.encoders.proto.ProtobufDataEncoderContext.AnonymousClass1.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding = r0
                r0 = r4
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.DEFAULT     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = com.google.firebase.encoders.proto.ProtobufDataEncoderContext.AnonymousClass1.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.SIGNED     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = com.google.firebase.encoders.proto.ProtobufDataEncoderContext.AnonymousClass1.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.FIXED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L2a:
                return
            L2b:
                r4 = move-exception
                goto L14
            L2f:
                r4 = move-exception
                goto L1f
            L33:
                r4 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.encoders.proto.ProtobufDataEncoderContext.AnonymousClass1.m2634clinit():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProtobufDataEncoderContext(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.output = outputStream;
        this.objectEncoders = map;
        this.valueEncoders = map2;
        this.fallbackEncoder = objectEncoder;
    }

    private static ByteBuffer allocateBuffer(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long determineSize(ObjectEncoder objectEncoder, Object obj) {
        LengthCountingOutputStream lengthCountingOutputStream = new LengthCountingOutputStream();
        try {
            OutputStream outputStream = this.output;
            this.output = lengthCountingOutputStream;
            try {
                objectEncoder.encode(obj, this);
                this.output = outputStream;
                long length = lengthCountingOutputStream.getLength();
                lengthCountingOutputStream.close();
                return length;
            } catch (Throwable th) {
                this.output = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                lengthCountingOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private ProtobufDataEncoderContext doEncode(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        long determineSize = determineSize(objectEncoder, obj);
        if (z && determineSize == 0) {
            return this;
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
        writeVarInt64(determineSize);
        objectEncoder.encode(obj, this);
        return this;
    }

    private ProtobufDataEncoderContext doEncode(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        this.valueEncoderContext.resetContext(fieldDescriptor, z);
        valueEncoder.encode(obj, this.valueEncoderContext);
        return this;
    }

    private static Protobuf getProtobuf(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int getTag(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Map.Entry entry, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(MAP_KEY_DESC, entry.getKey());
        objectEncoderContext.add(MAP_VALUE_DESC, entry.getValue());
    }

    private void writeVarInt32(int i) {
        while ((i & (-128)) != 0) {
            this.output.write((i & 127) | 128);
            i >>>= 7;
        }
        this.output.write(i & 127);
    }

    private void writeVarInt64(long j) {
        while (((-128) & j) != 0) {
            this.output.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.output.write(((int) j) & 127);
    }

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 1);
        this.output.write(allocateBuffer(8).putDouble(d).array());
        return this;
    }

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 5);
        this.output.write(allocateBuffer(4).putFloat(f).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) {
        return add(fieldDescriptor, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(UTF_8);
            writeVarInt32(bytes.length);
            this.output.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                add(fieldDescriptor, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                doEncode(DEFAULT_MAP_ENCODER, fieldDescriptor, it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return add(fieldDescriptor, ((Double) obj).doubleValue(), z);
        }
        if (obj instanceof Float) {
            return add(fieldDescriptor, ((Float) obj).floatValue(), z);
        }
        if (obj instanceof Number) {
            return add(fieldDescriptor, ((Number) obj).longValue(), z);
        }
        if (obj instanceof Boolean) {
            return add(fieldDescriptor, ((Boolean) obj).booleanValue(), z);
        }
        if (!(obj instanceof byte[])) {
            ObjectEncoder objectEncoder = (ObjectEncoder) this.objectEncoders.get(obj.getClass());
            if (objectEncoder != null) {
                return doEncode(objectEncoder, fieldDescriptor, obj, z);
            }
            ValueEncoder valueEncoder = (ValueEncoder) this.valueEncoders.get(obj.getClass());
            return valueEncoder != null ? doEncode(valueEncoder, fieldDescriptor, obj, z) : obj instanceof ProtoEnum ? add(fieldDescriptor, ((ProtoEnum) obj).getNumber()) : obj instanceof Enum ? add(fieldDescriptor, ((Enum) obj).ordinal()) : doEncode(this.fallbackEncoder, fieldDescriptor, obj, z);
        }
        byte[] bArr = (byte[]) obj;
        if (z && bArr.length == 0) {
            return this;
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
        writeVarInt32(bArr.length);
        this.output.write(bArr);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ProtobufDataEncoderContext add(FieldDescriptor fieldDescriptor, int i) {
        return add(fieldDescriptor, i, true);
    }

    ProtobufDataEncoderContext add(FieldDescriptor fieldDescriptor, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        Protobuf protobuf = getProtobuf(fieldDescriptor);
        int i2 = AnonymousClass1.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[protobuf.intEncoding().ordinal()];
        if (i2 == 1) {
            writeVarInt32(protobuf.tag() << 3);
            writeVarInt32(i);
        } else if (i2 == 2) {
            writeVarInt32(protobuf.tag() << 3);
            writeVarInt32((i << 1) ^ (i >> 31));
        } else if (i2 == 3) {
            writeVarInt32((protobuf.tag() << 3) | 5);
            this.output.write(allocateBuffer(4).putInt(i).array());
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ProtobufDataEncoderContext add(FieldDescriptor fieldDescriptor, long j) {
        return add(fieldDescriptor, j, true);
    }

    ProtobufDataEncoderContext add(FieldDescriptor fieldDescriptor, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        Protobuf protobuf = getProtobuf(fieldDescriptor);
        int i = AnonymousClass1.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[protobuf.intEncoding().ordinal()];
        if (i == 1) {
            writeVarInt32(protobuf.tag() << 3);
            writeVarInt64(j);
        } else if (i == 2) {
            writeVarInt32(protobuf.tag() << 3);
            writeVarInt64((j >> 63) ^ (j << 1));
        } else if (i == 3) {
            writeVarInt32((protobuf.tag() << 3) | 1);
            this.output.write(allocateBuffer(8).putLong(j).array());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProtobufDataEncoderContext add(FieldDescriptor fieldDescriptor, boolean z, boolean z2) {
        return add(fieldDescriptor, z ? 1 : 0, z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProtobufDataEncoderContext encode(Object obj) {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.objectEncoders.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }
}
