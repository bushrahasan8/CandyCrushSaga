package kotlinx.coroutines.internal;

import kotlinx.coroutines.DebugStringsKt;

/* loaded from: OpDescriptor.class */
public abstract class OpDescriptor {
    public abstract Object perform(Object obj);

    public String toString() {
        return DebugStringsKt.getClassSimpleName(this) + '@' + DebugStringsKt.getHexAddress(this);
    }
}
