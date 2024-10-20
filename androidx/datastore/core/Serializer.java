package androidx.datastore.core;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.coroutines.Continuation;

/* loaded from: Serializer.class */
public interface Serializer {
    Object getDefaultValue();

    Object readFrom(InputStream inputStream, Continuation continuation);

    Object writeTo(Object obj, OutputStream outputStream, Continuation continuation);
}
