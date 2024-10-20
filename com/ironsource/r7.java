package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: r7.class */
public final class r7 extends FrameLayout {
    private final String a;
    private a b;

    /* loaded from: r7$a.class */
    public interface a {
        void a(ge geVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = "ISNNativeAdContainer";
    }

    private final ge a() {
        boolean z = false;
        boolean z2 = getVisibility() == 0;
        if (getWindowVisibility() == 0) {
            z = true;
        }
        return new ge(z2, z, isShown());
    }

    public final a getListener$mediationsdk_release() {
        return this.b;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int i) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        Logger.i(this.a, "onVisibilityChanged: " + i);
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        Logger.i(this.a, "onWindowVisibilityChanged: " + i);
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    public final void setListener$mediationsdk_release(a aVar) {
        this.b = aVar;
    }
}
