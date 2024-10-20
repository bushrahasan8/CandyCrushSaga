package androidx.constraintlayout.core;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: Pools$Pool.class */
public interface Pools$Pool {
    Object acquire();

    boolean release(Object obj);

    void releaseAll(Object[] objArr, int i);
}
