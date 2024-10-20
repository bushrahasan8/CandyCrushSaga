package androidx.core.util;

/* loaded from: Pools$Pool.class */
public interface Pools$Pool {
    Object acquire();

    boolean release(Object obj);
}
