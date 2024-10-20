package com.google.protobuf;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Found several "values" enum fields: [] */
/* loaded from: FieldType.class */
public final class FieldType {
    private static final FieldType[] $VALUES;
    public static final FieldType BOOL;
    public static final FieldType BOOL_LIST;
    public static final FieldType BOOL_LIST_PACKED;
    public static final FieldType BYTES;
    public static final FieldType BYTES_LIST;
    public static final FieldType DOUBLE;
    public static final FieldType DOUBLE_LIST;
    public static final FieldType DOUBLE_LIST_PACKED;
    private static final java.lang.reflect.Type[] EMPTY_TYPES;
    public static final FieldType ENUM;
    public static final FieldType ENUM_LIST;
    public static final FieldType ENUM_LIST_PACKED;
    public static final FieldType FIXED32;
    public static final FieldType FIXED32_LIST;
    public static final FieldType FIXED32_LIST_PACKED;
    public static final FieldType FIXED64;
    public static final FieldType FIXED64_LIST;
    public static final FieldType FIXED64_LIST_PACKED;
    public static final FieldType FLOAT;
    public static final FieldType FLOAT_LIST;
    public static final FieldType FLOAT_LIST_PACKED;
    public static final FieldType GROUP;
    public static final FieldType GROUP_LIST;
    public static final FieldType INT32;
    public static final FieldType INT32_LIST;
    public static final FieldType INT32_LIST_PACKED;
    public static final FieldType INT64;
    public static final FieldType INT64_LIST;
    public static final FieldType INT64_LIST_PACKED;
    public static final FieldType MAP;
    public static final FieldType MESSAGE;
    public static final FieldType MESSAGE_LIST;
    public static final FieldType SFIXED32;
    public static final FieldType SFIXED32_LIST;
    public static final FieldType SFIXED32_LIST_PACKED;
    public static final FieldType SFIXED64;
    public static final FieldType SFIXED64_LIST;
    public static final FieldType SFIXED64_LIST_PACKED;
    public static final FieldType SINT32;
    public static final FieldType SINT32_LIST;
    public static final FieldType SINT32_LIST_PACKED;
    public static final FieldType SINT64;
    public static final FieldType SINT64_LIST;
    public static final FieldType SINT64_LIST_PACKED;
    public static final FieldType STRING;
    public static final FieldType STRING_LIST;
    public static final FieldType UINT32;
    public static final FieldType UINT32_LIST;
    public static final FieldType UINT32_LIST_PACKED;
    public static final FieldType UINT64;
    public static final FieldType UINT64_LIST;
    public static final FieldType UINT64_LIST_PACKED;
    private static final FieldType[] VALUES;
    private final Collection collection;
    private final Class<?> elementType;
    private final int id;
    private final JavaType javaType;
    private final boolean primitiveScalar;

    /* renamed from: com.google.protobuf.FieldType$1, reason: invalid class name */
    /* loaded from: FieldType$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final int[] $SwitchMap$com$google$protobuf$FieldType$Collection;
        static final int[] $SwitchMap$com$google$protobuf$JavaType;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:21:0x005d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.google.protobuf.JavaType[] r0 = com.google.protobuf.JavaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.google.protobuf.FieldType.AnonymousClass1.$SwitchMap$com$google$protobuf$JavaType = r0
                r0 = r4
                com.google.protobuf.JavaType r1 = com.google.protobuf.JavaType.BYTE_STRING     // Catch: java.lang.NoSuchFieldError -> L55
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L55
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L55
            L14:
                int[] r0 = com.google.protobuf.FieldType.AnonymousClass1.$SwitchMap$com$google$protobuf$JavaType     // Catch: java.lang.NoSuchFieldError -> L55 java.lang.NoSuchFieldError -> L59
                com.google.protobuf.JavaType r1 = com.google.protobuf.JavaType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L1f:
                int[] r0 = com.google.protobuf.FieldType.AnonymousClass1.$SwitchMap$com$google$protobuf$JavaType     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.JavaType r1 = com.google.protobuf.JavaType.STRING     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L2a:
                com.google.protobuf.FieldType$Collection[] r0 = com.google.protobuf.FieldType.Collection.values()     // Catch: java.lang.NoSuchFieldError -> L5d
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.google.protobuf.FieldType.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType$Collection = r0
                r0 = r4
                com.google.protobuf.FieldType$Collection r1 = com.google.protobuf.FieldType.Collection.MAP     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L3e:
                int[] r0 = com.google.protobuf.FieldType.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType$Collection     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.FieldType$Collection r1 = com.google.protobuf.FieldType.Collection.VECTOR     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L49:
                int[] r0 = com.google.protobuf.FieldType.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType$Collection     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.FieldType$Collection r1 = com.google.protobuf.FieldType.Collection.SCALAR     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L54:
                return
            L55:
                r4 = move-exception
                goto L14
            L59:
                r4 = move-exception
                goto L1f
            L5d:
                r4 = move-exception
                goto L2a
            L61:
                r4 = move-exception
                goto L3e
            L65:
                r4 = move-exception
                goto L49
            L69:
                r4 = move-exception
                goto L54
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.FieldType.AnonymousClass1.m2751clinit():void");
        }
    }

    /* loaded from: FieldType$Collection.class */
    enum Collection {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        Collection(boolean z) {
            this.isList = z;
        }

        public boolean isList() {
            return this.isList;
        }
    }

    private static /* synthetic */ FieldType[] $values() {
        return new FieldType[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64, GROUP, DOUBLE_LIST, FLOAT_LIST, INT64_LIST, UINT64_LIST, INT32_LIST, FIXED64_LIST, FIXED32_LIST, BOOL_LIST, STRING_LIST, MESSAGE_LIST, BYTES_LIST, UINT32_LIST, ENUM_LIST, SFIXED32_LIST, SFIXED64_LIST, SINT32_LIST, SINT64_LIST, DOUBLE_LIST_PACKED, FLOAT_LIST_PACKED, INT64_LIST_PACKED, UINT64_LIST_PACKED, INT32_LIST_PACKED, FIXED64_LIST_PACKED, FIXED32_LIST_PACKED, BOOL_LIST_PACKED, UINT32_LIST_PACKED, ENUM_LIST_PACKED, SFIXED32_LIST_PACKED, SFIXED64_LIST_PACKED, SINT32_LIST_PACKED, SINT64_LIST_PACKED, GROUP_LIST, MAP};
    }

    static {
        Collection collection = Collection.SCALAR;
        JavaType javaType = JavaType.DOUBLE;
        DOUBLE = new FieldType("DOUBLE", 0, 0, collection, javaType);
        JavaType javaType2 = JavaType.FLOAT;
        FLOAT = new FieldType("FLOAT", 1, 1, collection, javaType2);
        JavaType javaType3 = JavaType.LONG;
        INT64 = new FieldType("INT64", 2, 2, collection, javaType3);
        UINT64 = new FieldType("UINT64", 3, 3, collection, javaType3);
        JavaType javaType4 = JavaType.INT;
        INT32 = new FieldType("INT32", 4, 4, collection, javaType4);
        FIXED64 = new FieldType("FIXED64", 5, 5, collection, javaType3);
        FIXED32 = new FieldType("FIXED32", 6, 6, collection, javaType4);
        JavaType javaType5 = JavaType.BOOLEAN;
        BOOL = new FieldType("BOOL", 7, 7, collection, javaType5);
        JavaType javaType6 = JavaType.STRING;
        STRING = new FieldType("STRING", 8, 8, collection, javaType6);
        JavaType javaType7 = JavaType.MESSAGE;
        MESSAGE = new FieldType("MESSAGE", 9, 9, collection, javaType7);
        JavaType javaType8 = JavaType.BYTE_STRING;
        BYTES = new FieldType("BYTES", 10, 10, collection, javaType8);
        UINT32 = new FieldType("UINT32", 11, 11, collection, javaType4);
        JavaType javaType9 = JavaType.ENUM;
        ENUM = new FieldType("ENUM", 12, 12, collection, javaType9);
        SFIXED32 = new FieldType("SFIXED32", 13, 13, collection, javaType4);
        SFIXED64 = new FieldType("SFIXED64", 14, 14, collection, javaType3);
        SINT32 = new FieldType("SINT32", 15, 15, collection, javaType4);
        SINT64 = new FieldType("SINT64", 16, 16, collection, javaType3);
        GROUP = new FieldType("GROUP", 17, 17, collection, javaType7);
        Collection collection2 = Collection.VECTOR;
        DOUBLE_LIST = new FieldType("DOUBLE_LIST", 18, 18, collection2, javaType);
        FLOAT_LIST = new FieldType("FLOAT_LIST", 19, 19, collection2, javaType2);
        INT64_LIST = new FieldType("INT64_LIST", 20, 20, collection2, javaType3);
        UINT64_LIST = new FieldType("UINT64_LIST", 21, 21, collection2, javaType3);
        INT32_LIST = new FieldType("INT32_LIST", 22, 22, collection2, javaType4);
        FIXED64_LIST = new FieldType("FIXED64_LIST", 23, 23, collection2, javaType3);
        FIXED32_LIST = new FieldType("FIXED32_LIST", 24, 24, collection2, javaType4);
        BOOL_LIST = new FieldType("BOOL_LIST", 25, 25, collection2, javaType5);
        STRING_LIST = new FieldType("STRING_LIST", 26, 26, collection2, javaType6);
        MESSAGE_LIST = new FieldType("MESSAGE_LIST", 27, 27, collection2, javaType7);
        BYTES_LIST = new FieldType("BYTES_LIST", 28, 28, collection2, javaType8);
        UINT32_LIST = new FieldType("UINT32_LIST", 29, 29, collection2, javaType4);
        ENUM_LIST = new FieldType("ENUM_LIST", 30, 30, collection2, javaType9);
        SFIXED32_LIST = new FieldType("SFIXED32_LIST", 31, 31, collection2, javaType4);
        SFIXED64_LIST = new FieldType("SFIXED64_LIST", 32, 32, collection2, javaType3);
        SINT32_LIST = new FieldType("SINT32_LIST", 33, 33, collection2, javaType4);
        SINT64_LIST = new FieldType("SINT64_LIST", 34, 34, collection2, javaType3);
        Collection collection3 = Collection.PACKED_VECTOR;
        DOUBLE_LIST_PACKED = new FieldType("DOUBLE_LIST_PACKED", 35, 35, collection3, javaType);
        FLOAT_LIST_PACKED = new FieldType("FLOAT_LIST_PACKED", 36, 36, collection3, javaType2);
        INT64_LIST_PACKED = new FieldType("INT64_LIST_PACKED", 37, 37, collection3, javaType3);
        UINT64_LIST_PACKED = new FieldType("UINT64_LIST_PACKED", 38, 38, collection3, javaType3);
        INT32_LIST_PACKED = new FieldType("INT32_LIST_PACKED", 39, 39, collection3, javaType4);
        FIXED64_LIST_PACKED = new FieldType("FIXED64_LIST_PACKED", 40, 40, collection3, javaType3);
        FIXED32_LIST_PACKED = new FieldType("FIXED32_LIST_PACKED", 41, 41, collection3, javaType4);
        BOOL_LIST_PACKED = new FieldType("BOOL_LIST_PACKED", 42, 42, collection3, javaType5);
        UINT32_LIST_PACKED = new FieldType("UINT32_LIST_PACKED", 43, 43, collection3, javaType4);
        ENUM_LIST_PACKED = new FieldType("ENUM_LIST_PACKED", 44, 44, collection3, javaType9);
        SFIXED32_LIST_PACKED = new FieldType("SFIXED32_LIST_PACKED", 45, 45, collection3, javaType4);
        SFIXED64_LIST_PACKED = new FieldType("SFIXED64_LIST_PACKED", 46, 46, collection3, javaType3);
        SINT32_LIST_PACKED = new FieldType("SINT32_LIST_PACKED", 47, 47, collection3, javaType4);
        SINT64_LIST_PACKED = new FieldType("SINT64_LIST_PACKED", 48, 48, collection3, javaType3);
        GROUP_LIST = new FieldType("GROUP_LIST", 49, 49, collection2, javaType7);
        MAP = new FieldType("MAP", 50, 50, Collection.MAP, JavaType.VOID);
        $VALUES = $values();
        EMPTY_TYPES = new java.lang.reflect.Type[0];
        FieldType[] values = values();
        VALUES = new FieldType[values.length];
        for (FieldType fieldType : values) {
            VALUES[fieldType.id] = fieldType;
        }
    }

    private FieldType(String str, int i, int i2, Collection collection, JavaType javaType) {
        int i3;
        this.id = i2;
        this.collection = collection;
        this.javaType = javaType;
        int i4 = AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType$Collection[collection.ordinal()];
        boolean z = true;
        if (i4 == 1) {
            this.elementType = javaType.getBoxedType();
        } else if (i4 != 2) {
            this.elementType = null;
        } else {
            this.elementType = javaType.getBoxedType();
        }
        this.primitiveScalar = (collection != Collection.SCALAR || (i3 = AnonymousClass1.$SwitchMap$com$google$protobuf$JavaType[javaType.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : z;
    }

    public static FieldType forId(int i) {
        if (i < 0) {
            return null;
        }
        FieldType[] fieldTypeArr = VALUES;
        if (i >= fieldTypeArr.length) {
            return null;
        }
        return fieldTypeArr[i];
    }

    private static java.lang.reflect.Type getGenericSuperList(Class<?> cls) {
        for (java.lang.reflect.Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        java.lang.reflect.Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static java.lang.reflect.Type getListParameter(Class<?> cls, java.lang.reflect.Type[] typeArr) {
        while (true) {
            int i = 0;
            if (cls == List.class) {
                if (typeArr.length == 1) {
                    return typeArr[0];
                }
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
            java.lang.reflect.Type genericSuperList = getGenericSuperList(cls);
            if (!(genericSuperList instanceof ParameterizedType)) {
                typeArr = EMPTY_TYPES;
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                while (true) {
                    if (i >= length) {
                        cls = cls.getSuperclass();
                        break;
                    }
                    Class<?> cls2 = interfaces[i];
                    if (List.class.isAssignableFrom(cls2)) {
                        cls = cls2;
                        break;
                    }
                    i++;
                }
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                    java.lang.reflect.Type type = actualTypeArguments[i2];
                    if (type instanceof TypeVariable) {
                        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                        if (typeArr.length != typeParameters.length) {
                            throw new RuntimeException("Type array mismatch");
                        }
                        for (int i3 = 0; i3 < typeParameters.length; i3++) {
                            if (type == typeParameters[i3]) {
                                actualTypeArguments[i2] = typeArr[i3];
                            }
                        }
                        throw new RuntimeException("Unable to find replacement for " + type);
                    }
                }
                cls = (Class) parameterizedType.getRawType();
                typeArr = actualTypeArguments;
            }
        }
    }

    private boolean isValidForList(java.lang.reflect.Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        java.lang.reflect.Type[] typeArr = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            typeArr = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        java.lang.reflect.Type listParameter = getListParameter(type, typeArr);
        if (listParameter instanceof Class) {
            return this.elementType.isAssignableFrom((Class) listParameter);
        }
        return true;
    }

    public static FieldType valueOf(String str) {
        return (FieldType) java.lang.Enum.valueOf(FieldType.class, str);
    }

    public static FieldType[] values() {
        return (FieldType[]) $VALUES.clone();
    }

    public JavaType getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == Collection.MAP;
    }

    public boolean isPacked() {
        return Collection.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == Collection.SCALAR;
    }

    public boolean isValidForField(java.lang.reflect.Field field) {
        return Collection.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }
}
