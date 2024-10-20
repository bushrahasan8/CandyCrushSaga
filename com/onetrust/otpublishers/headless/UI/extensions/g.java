package com.onetrust.otpublishers.headless.UI.extensions;

import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: g.class */
public abstract class g {
    public static final Object a(MutableLiveData mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<this>");
        if (mutableLiveData.getValue() == null) {
            throw new IllegalStateException("LiveData does not have any value");
        }
        Object value = mutableLiveData.getValue();
        Intrinsics.checkNotNull(value);
        return value;
    }
}
