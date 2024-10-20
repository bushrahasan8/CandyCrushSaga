package com.onetrust.otpublishers.headless.UI.adapter;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: g.class */
public final class g extends DiffUtil.ItemCallback {
    public final boolean areContentsTheSame(Object obj, Object obj2) {
        com.onetrust.otpublishers.headless.UI.DataModels.f oldItem = (com.onetrust.otpublishers.headless.UI.DataModels.f) obj;
        com.onetrust.otpublishers.headless.UI.DataModels.f newItem = (com.onetrust.otpublishers.headless.UI.DataModels.f) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.b, newItem.b) && oldItem.d == newItem.d;
    }

    public final boolean areItemsTheSame(Object obj, Object obj2) {
        com.onetrust.otpublishers.headless.UI.DataModels.f oldItem = (com.onetrust.otpublishers.headless.UI.DataModels.f) obj;
        com.onetrust.otpublishers.headless.UI.DataModels.f newItem = (com.onetrust.otpublishers.headless.UI.DataModels.f) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.a, newItem.a);
    }
}
