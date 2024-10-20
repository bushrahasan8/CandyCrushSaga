package kotlinx.coroutines;

import kotlinx.coroutines.internal.Symbol;

/* loaded from: JobSupportKt.class */
public abstract class JobSupportKt {
    private static final Symbol COMPLETING_ALREADY = new Symbol("COMPLETING_ALREADY");
    public static final Symbol COMPLETING_WAITING_CHILDREN = new Symbol("COMPLETING_WAITING_CHILDREN");
    private static final Symbol COMPLETING_RETRY = new Symbol("COMPLETING_RETRY");
    private static final Symbol TOO_LATE_TO_CANCEL = new Symbol("TOO_LATE_TO_CANCEL");
    private static final Symbol SEALED = new Symbol("SEALED");
    private static final Empty EMPTY_NEW = new Empty(false);
    private static final Empty EMPTY_ACTIVE = new Empty(true);

    public static final Object boxIncomplete(Object obj) {
        Object obj2 = obj;
        if (obj instanceof Incomplete) {
            obj2 = new IncompleteStateBox((Incomplete) obj);
        }
        return obj2;
    }

    public static final Object unboxState(Object obj) {
        IncompleteStateBox incompleteStateBox = obj instanceof IncompleteStateBox ? (IncompleteStateBox) obj : null;
        Object obj2 = obj;
        if (incompleteStateBox != null) {
            obj2 = incompleteStateBox.state;
            if (obj2 == null) {
                obj2 = obj;
            }
        }
        return obj2;
    }
}
