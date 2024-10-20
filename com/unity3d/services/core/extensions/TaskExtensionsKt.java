package com.unity3d.services.core.extensions;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: TaskExtensionsKt.class */
public final class TaskExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x031d -> B:13:0x0331). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x034b -> B:14:0x0363). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object withRetry(long r6, int r8, double r9, java.lang.Exception r11, kotlin.jvm.functions.Function2 r12, kotlin.coroutines.Continuation<? super T> r13) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry(long, int, double, java.lang.Exception, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object withRetry$default(long j, int i, double d, Exception exc, Function2 function2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = 5000;
        }
        if ((i2 & 2) != 0) {
            i = 6;
        }
        if ((i2 & 4) != 0) {
            d = 2.0d;
        }
        return withRetry(j, i, d, exc, function2, continuation);
    }
}
