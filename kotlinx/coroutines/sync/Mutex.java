package kotlinx.coroutines.sync;

import kotlin.coroutines.Continuation;

/* loaded from: Mutex.class */
public interface Mutex {

    /* loaded from: Mutex$DefaultImpls.class */
    public static final abstract class DefaultImpls {
        public static /* synthetic */ boolean tryLock$default(Mutex mutex, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return mutex.tryLock(obj);
        }

        public static /* synthetic */ void unlock$default(Mutex mutex, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            mutex.unlock(obj);
        }
    }

    boolean isLocked();

    Object lock(Object obj, Continuation continuation);

    boolean tryLock(Object obj);

    void unlock(Object obj);
}
