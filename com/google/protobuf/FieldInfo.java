package com.google.protobuf;

import com.google.protobuf.Internal;

@CheckReturnValue
/* loaded from: FieldInfo.class */
final class FieldInfo implements Comparable<FieldInfo> {
    private final java.lang.reflect.Field cachedSizeField;
    private final boolean enforceUtf8;
    private final Internal.EnumVerifier enumVerifier;
    private final java.lang.reflect.Field field;
    private final int fieldNumber;
    private final Object mapDefaultEntry;
    private final Class<?> messageClass;
    private final OneofInfo oneof;
    private final Class<?> oneofStoredType;
    private final java.lang.reflect.Field presenceField;
    private final int presenceMask;
    private final boolean required;
    private final FieldType type;

    /* renamed from: com.google.protobuf.FieldInfo$1, reason: invalid class name */
    /* loaded from: FieldInfo$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final int[] $SwitchMap$com$google$protobuf$FieldType;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x003e
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.google.protobuf.FieldType[] r0 = com.google.protobuf.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.google.protobuf.FieldInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType = r0
                r0 = r4
                com.google.protobuf.FieldType r1 = com.google.protobuf.FieldType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L36
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            L14:
                int[] r0 = com.google.protobuf.FieldInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType     // Catch: java.lang.NoSuchFieldError -> L36 java.lang.NoSuchFieldError -> L3a
                com.google.protobuf.FieldType r1 = com.google.protobuf.FieldType.GROUP     // Catch: java.lang.NoSuchFieldError -> L3a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a
            L1f:
                int[] r0 = com.google.protobuf.FieldInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType     // Catch: java.lang.NoSuchFieldError -> L3a java.lang.NoSuchFieldError -> L3e
                com.google.protobuf.FieldType r1 = com.google.protobuf.FieldType.MESSAGE_LIST     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L2a:
                int[] r0 = com.google.protobuf.FieldInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType     // Catch: java.lang.NoSuchFieldError -> L3e java.lang.NoSuchFieldError -> L42
                com.google.protobuf.FieldType r1 = com.google.protobuf.FieldType.GROUP_LIST     // Catch: java.lang.NoSuchFieldError -> L42
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L42
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L42
            L35:
                return
            L36:
                r4 = move-exception
                goto L14
            L3a:
                r4 = move-exception
                goto L1f
            L3e:
                r4 = move-exception
                goto L2a
            L42:
                r4 = move-exception
                goto L35
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.FieldInfo.AnonymousClass1.m2743clinit():void");
        }
    }

    /* loaded from: FieldInfo$Builder.class */
    public static final class Builder {
        private java.lang.reflect.Field cachedSizeField;
        private boolean enforceUtf8;
        private Internal.EnumVerifier enumVerifier;
        private java.lang.reflect.Field field;
        private int fieldNumber;
        private Object mapDefaultEntry;
        private OneofInfo oneof;
        private Class<?> oneofStoredType;
        private java.lang.reflect.Field presenceField;
        private int presenceMask;
        private boolean required;
        private FieldType type;

        private Builder() {
        }

        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public FieldInfo build() {
            OneofInfo oneofInfo = this.oneof;
            if (oneofInfo != null) {
                return FieldInfo.forOneofMemberField(this.fieldNumber, this.type, oneofInfo, this.oneofStoredType, this.enforceUtf8, this.enumVerifier);
            }
            Object obj = this.mapDefaultEntry;
            if (obj != null) {
                return FieldInfo.forMapField(this.field, this.fieldNumber, obj, this.enumVerifier);
            }
            java.lang.reflect.Field field = this.presenceField;
            if (field != null) {
                return this.required ? FieldInfo.forProto2RequiredField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier) : FieldInfo.forProto2OptionalField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
            }
            Internal.EnumVerifier enumVerifier = this.enumVerifier;
            if (enumVerifier != null) {
                java.lang.reflect.Field field2 = this.cachedSizeField;
                return field2 == null ? FieldInfo.forFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, enumVerifier) : FieldInfo.forPackedFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, enumVerifier, field2);
            }
            java.lang.reflect.Field field3 = this.cachedSizeField;
            return field3 == null ? FieldInfo.forField(this.field, this.fieldNumber, this.type, this.enforceUtf8) : FieldInfo.forPackedField(this.field, this.fieldNumber, this.type, field3);
        }

        public Builder withCachedSizeField(java.lang.reflect.Field field) {
            this.cachedSizeField = field;
            return this;
        }

        public Builder withEnforceUtf8(boolean z) {
            this.enforceUtf8 = z;
            return this;
        }

        public Builder withEnumVerifier(Internal.EnumVerifier enumVerifier) {
            this.enumVerifier = enumVerifier;
            return this;
        }

        public Builder withField(java.lang.reflect.Field field) {
            if (this.oneof != null) {
                throw new IllegalStateException("Cannot set field when building a oneof.");
            }
            this.field = field;
            return this;
        }

        public Builder withFieldNumber(int i) {
            this.fieldNumber = i;
            return this;
        }

        public Builder withMapDefaultEntry(Object obj) {
            this.mapDefaultEntry = obj;
            return this;
        }

        public Builder withOneof(OneofInfo oneofInfo, Class<?> cls) {
            if (this.field != null || this.presenceField != null) {
                throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.oneof = oneofInfo;
            this.oneofStoredType = cls;
            return this;
        }

        public Builder withPresence(java.lang.reflect.Field field, int i) {
            this.presenceField = (java.lang.reflect.Field) Internal.checkNotNull(field, "presenceField");
            this.presenceMask = i;
            return this;
        }

        public Builder withRequired(boolean z) {
            this.required = z;
            return this;
        }

        public Builder withType(FieldType fieldType) {
            this.type = fieldType;
            return this;
        }
    }

    private FieldInfo(java.lang.reflect.Field field, int i, FieldType fieldType, Class<?> cls, java.lang.reflect.Field field2, int i2, boolean z, boolean z2, OneofInfo oneofInfo, Class<?> cls2, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.field = field;
        this.type = fieldType;
        this.messageClass = cls;
        this.fieldNumber = i;
        this.presenceField = field2;
        this.presenceMask = i2;
        this.required = z;
        this.enforceUtf8 = z2;
        this.oneof = oneofInfo;
        this.oneofStoredType = cls2;
        this.mapDefaultEntry = obj;
        this.enumVerifier = enumVerifier;
        this.cachedSizeField = field3;
    }

    private static void checkFieldNumber(int i) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + i);
    }

    public static FieldInfo forField(java.lang.reflect.Field field, int i, FieldType fieldType, boolean z) {
        checkFieldNumber(i);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        if (fieldType == FieldType.MESSAGE_LIST || fieldType == FieldType.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new FieldInfo(field, i, fieldType, null, null, 0, false, z, null, null, null, null, null);
    }

    public static FieldInfo forFieldWithEnumVerifier(java.lang.reflect.Field field, int i, FieldType fieldType, Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(i);
        Internal.checkNotNull(field, "field");
        return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, null);
    }

    public static FieldInfo forMapField(java.lang.reflect.Field field, int i, Object obj, Internal.EnumVerifier enumVerifier) {
        Internal.checkNotNull(obj, "mapDefaultEntry");
        checkFieldNumber(i);
        Internal.checkNotNull(field, "field");
        return new FieldInfo(field, i, FieldType.MAP, null, null, 0, false, true, null, null, obj, enumVerifier, null);
    }

    public static FieldInfo forOneofMemberField(int i, FieldType fieldType, OneofInfo oneofInfo, Class<?> cls, boolean z, Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(i);
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(oneofInfo, "oneof");
        Internal.checkNotNull(cls, "oneofStoredType");
        if (fieldType.isScalar()) {
            return new FieldInfo(null, i, fieldType, null, null, 0, false, z, oneofInfo, cls, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i + " is of type " + fieldType);
    }

    public static FieldInfo forPackedField(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2) {
        checkFieldNumber(i);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        if (fieldType == FieldType.MESSAGE_LIST || fieldType == FieldType.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, null, field2);
    }

    public static FieldInfo forPackedFieldWithEnumVerifier(java.lang.reflect.Field field, int i, FieldType fieldType, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field2) {
        checkFieldNumber(i);
        Internal.checkNotNull(field, "field");
        return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, field2);
    }

    public static FieldInfo forProto2OptionalField(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(i);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(field2, "presenceField");
        if (field2 == null || isExactlyOneBitSet(i2)) {
            return new FieldInfo(field, i, fieldType, null, field2, i2, false, z, null, null, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
    }

    public static FieldInfo forProto2RequiredField(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(i);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(field2, "presenceField");
        if (field2 == null || isExactlyOneBitSet(i2)) {
            return new FieldInfo(field, i, fieldType, null, field2, i2, true, z, null, null, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
    }

    public static FieldInfo forRepeatedMessageField(java.lang.reflect.Field field, int i, FieldType fieldType, Class<?> cls) {
        checkFieldNumber(i);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(cls, "messageClass");
        return new FieldInfo(field, i, fieldType, cls, null, 0, false, false, null, null, null, null, null);
    }

    private static boolean isExactlyOneBitSet(int i) {
        return i != 0 && (i & (i - 1)) == 0;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    @Override // java.lang.Comparable
    public int compareTo(FieldInfo fieldInfo) {
        return this.fieldNumber - fieldInfo.fieldNumber;
    }

    public java.lang.reflect.Field getCachedSizeField() {
        return this.cachedSizeField;
    }

    public Internal.EnumVerifier getEnumVerifier() {
        return this.enumVerifier;
    }

    public java.lang.reflect.Field getField() {
        return this.field;
    }

    public int getFieldNumber() {
        return this.fieldNumber;
    }

    public Class<?> getListElementType() {
        return this.messageClass;
    }

    public Object getMapDefaultEntry() {
        return this.mapDefaultEntry;
    }

    public Class<?> getMessageFieldClass() {
        int i = AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType[this.type.ordinal()];
        if (i == 1 || i == 2) {
            java.lang.reflect.Field field = this.field;
            return field != null ? field.getType() : this.oneofStoredType;
        }
        if (i == 3 || i == 4) {
            return this.messageClass;
        }
        return null;
    }

    public OneofInfo getOneof() {
        return this.oneof;
    }

    public Class<?> getOneofStoredType() {
        return this.oneofStoredType;
    }

    public java.lang.reflect.Field getPresenceField() {
        return this.presenceField;
    }

    public int getPresenceMask() {
        return this.presenceMask;
    }

    public FieldType getType() {
        return this.type;
    }

    public boolean isEnforceUtf8() {
        return this.enforceUtf8;
    }

    public boolean isRequired() {
        return this.required;
    }
}
