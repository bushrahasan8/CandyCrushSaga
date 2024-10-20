package kotlinx.coroutines;

/* loaded from: ChildHandle.class */
public interface ChildHandle extends DisposableHandle {
    boolean childCancelled(Throwable th);

    Job getParent();
}
