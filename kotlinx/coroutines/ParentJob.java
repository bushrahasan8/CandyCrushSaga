package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* loaded from: ParentJob.class */
public interface ParentJob extends Job {
    CancellationException getChildJobCancellationCause();
}
