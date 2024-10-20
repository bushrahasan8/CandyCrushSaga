package com.onetrust.otpublishers.headless.UI.adapter;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: p.class */
public final class p extends DiffUtil.ItemCallback {
    public final boolean areContentsTheSame(Object obj, Object obj2) {
        com.onetrust.otpublishers.headless.UI.DataModels.i oldItem = (com.onetrust.otpublishers.headless.UI.DataModels.i) obj;
        com.onetrust.otpublishers.headless.UI.DataModels.i newItem = (com.onetrust.otpublishers.headless.UI.DataModels.i) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.b, newItem.b) && oldItem.c == newItem.c;
    }

    public final boolean areItemsTheSame(Object obj, Object obj2) {
        com.onetrust.otpublishers.headless.UI.DataModels.i oldItem = (com.onetrust.otpublishers.headless.UI.DataModels.i) obj;
        com.onetrust.otpublishers.headless.UI.DataModels.i newItem = (com.onetrust.otpublishers.headless.UI.DataModels.i) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.a, newItem.a);
    }
}
