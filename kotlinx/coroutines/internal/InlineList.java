package kotlinx.coroutines.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: InlineList.class */
public abstract class InlineList {
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m7446constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ Object m7447constructorimpl$default(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m7446constructorimpl(obj);
    }

    /* renamed from: plus-FjFbRPM, reason: not valid java name */
    public static final Object m7448plusFjFbRPM(Object obj, Object obj2) {
        Object m7446constructorimpl;
        if (obj == null) {
            m7446constructorimpl = m7446constructorimpl(obj2);
        } else if (obj instanceof ArrayList) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(obj2);
            m7446constructorimpl = m7446constructorimpl(obj);
        } else {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(obj2);
            m7446constructorimpl = m7446constructorimpl(arrayList);
        }
        return m7446constructorimpl;
    }
}
