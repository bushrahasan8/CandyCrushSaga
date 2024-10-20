package kotlinx.coroutines.internal;

/* loaded from: LockFreeLinkedListKt.class */
public abstract class LockFreeLinkedListKt {
    private static final Object CONDITION_FALSE = new Symbol("CONDITION_FALSE");

    public static final Object getCONDITION_FALSE() {
        return CONDITION_FALSE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r0 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlinx.coroutines.internal.LockFreeLinkedListNode unwrap(java.lang.Object r3) {
        /*
            r0 = r3
            boolean r0 = r0 instanceof kotlinx.coroutines.internal.Removed
            if (r0 == 0) goto Lf
            r0 = r3
            kotlinx.coroutines.internal.Removed r0 = (kotlinx.coroutines.internal.Removed) r0
            r4 = r0
            goto L11
        Lf:
            r0 = 0
            r4 = r0
        L11:
            r0 = r4
            if (r0 == 0) goto L20
            r0 = r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.ref
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L2b
        L20:
            r0 = r3
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            r0 = r3
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r4 = r0
        L2b:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListKt.unwrap(java.lang.Object):kotlinx.coroutines.internal.LockFreeLinkedListNode");
    }
}
