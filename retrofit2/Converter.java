package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: Converter.class */
public interface Converter {

    /* loaded from: Converter$Factory.class */
    public static abstract class Factory {
        /* JADX INFO: Access modifiers changed from: protected */
        public static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
            return Utils.getParameterUpperBound(i, parameterizedType);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public static Class getRawType(Type type) {
            return Utils.getRawType(type);
        }

        public Converter requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
            return null;
        }

        public abstract Converter responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit);

        public Converter stringConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }
    }

    Object convert(Object obj);
}
