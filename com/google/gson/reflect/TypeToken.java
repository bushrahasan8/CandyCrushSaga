package com.google.gson.reflect;

import com.google.gson.internal.C$Gson$Types;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: TypeToken.class */
public class TypeToken<T> {
    final int hashCode;
    final Class rawType;
    final Type type;

    protected TypeToken() {
        Type superclassTypeParameter = getSuperclassTypeParameter(getClass());
        this.type = superclassTypeParameter;
        this.rawType = C$Gson$Types.getRawType(superclassTypeParameter);
        this.hashCode = superclassTypeParameter.hashCode();
    }

    static Type getSuperclassTypeParameter(Class cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        return C$Gson$Types.canonicalize(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof TypeToken) && C$Gson$Types.equals(this.type, ((TypeToken) obj).type);
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public final String toString() {
        return C$Gson$Types.typeToString(this.type);
    }
}
