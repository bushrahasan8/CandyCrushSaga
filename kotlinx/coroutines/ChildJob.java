package kotlinx.coroutines;

/* loaded from: ChildJob.class */
public interface ChildJob extends Job {
    void parentCancelled(ParentJob parentJob);
}
