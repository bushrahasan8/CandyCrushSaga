package com.unity3d.services.identifiers;

import android.content.Context;
import androidx.startup.Initializer;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: UnitySharedLibraryInitializer.class */
public final class UnitySharedLibraryInitializer implements Initializer {
    public final Object create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context.applicationContext");
        Intrinsics.checkNotNullParameter(context2, "context");
        a.b = new a(context2);
        return Unit.INSTANCE;
    }

    public final List<Class<? extends Initializer>> dependencies() {
        return CollectionsKt.emptyList();
    }
}
