package androidx.work.impl.constraints;

import java.util.List;

/* loaded from: WorkConstraintsCallback.class */
public interface WorkConstraintsCallback {
    void onAllConstraintsMet(List list);

    void onAllConstraintsNotMet(List list);
}
