package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: MainDispatchersKt.class */
public abstract class MainDispatchersKt {
    private static final MissingMainCoroutineDispatcher createMissingDispatcher(Throwable th, String str) {
        if (th != null) {
            throw th;
        }
        throwMissingMainDispatcherException();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ MissingMainCoroutineDispatcher createMissingDispatcher$default(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return createMissingDispatcher(th, str);
    }

    public static final boolean isMissing(MainCoroutineDispatcher mainCoroutineDispatcher) {
        return mainCoroutineDispatcher.getImmediate() instanceof MissingMainCoroutineDispatcher;
    }

    public static final Void throwMissingMainDispatcherException() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final MainCoroutineDispatcher tryCreateDispatcher(MainDispatcherFactory mainDispatcherFactory, List list) {
        MainCoroutineDispatcher createMissingDispatcher;
        try {
            createMissingDispatcher = mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            createMissingDispatcher = createMissingDispatcher(th, mainDispatcherFactory.hintOnError());
        }
        return createMissingDispatcher;
    }
}
