package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: MainDispatcherFactory.class */
public interface MainDispatcherFactory {
    MainCoroutineDispatcher createDispatcher(List list);

    int getLoadPriority();

    String hintOnError();
}
