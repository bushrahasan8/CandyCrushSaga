package com.onetrust.otpublishers.headless.UI.Helper;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: k.class */
public abstract class k {
    public static final a a(Fragment fragment, Function1 viewBindingFactory) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewBindingFactory, "viewBindingFactory");
        return new a(fragment, viewBindingFactory);
    }
}
