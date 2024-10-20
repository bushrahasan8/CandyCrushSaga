package com.unity3d.services.core.configuration;

import android.content.Context;
import androidx.startup.Initializer;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: AdsSdkInitializer.class */
public final class AdsSdkInitializer implements Initializer {
    public /* bridge */ /* synthetic */ Object create(Context context) {
        m6538create(context);
        return Unit.INSTANCE;
    }

    /* renamed from: create, reason: collision with other method in class */
    public void m6538create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ClientProperties.setApplicationContext(context.getApplicationContext());
        SdkProperties.setAppInitializationTimeSinceEpoch(System.currentTimeMillis());
    }

    public List<Class<? extends Initializer>> dependencies() {
        return CollectionsKt.emptyList();
    }
}
