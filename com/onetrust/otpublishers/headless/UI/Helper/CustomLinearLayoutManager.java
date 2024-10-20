package com.onetrust.otpublishers.headless.UI.Helper;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: CustomLinearLayoutManager.class */
public final class CustomLinearLayoutManager extends LinearLayoutManager {
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e) {
            OTLogger.a((String) null, 6, "error in layoutManger" + e.getMessage());
        }
    }
}
