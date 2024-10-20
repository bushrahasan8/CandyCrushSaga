package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: CallAdapter.class */
public interface CallAdapter {

    /* loaded from: CallAdapter$Factory.class */
    public static abstract class Factory {
        /* JADX INFO: Access modifiers changed from: protected */
        public static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
            return Utils.getParameterUpperBound(i, parameterizedType);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public static Class getRawType(Type type) {
            return Utils.getRawType(type);
        }

        public abstract CallAdapter get(Type type, Annotation[] annotationArr, Retrofit retrofit);
    }

    Object adapt(Call call);

    Type responseType();
}
