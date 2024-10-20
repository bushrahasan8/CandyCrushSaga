package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.model.Placement;

/* loaded from: l6.class */
public interface l6 extends k6 {
    void a(Activity activity, Placement placement);

    void a(Context context, boolean z);

    @Override // com.ironsource.k6
    /* synthetic */ void a(IronSourceSegment ironSourceSegment);

    @Override // com.ironsource.k6
    /* synthetic */ void a(ImpressionDataListener impressionDataListener);

    @Override // com.ironsource.k6
    /* synthetic */ void b(ImpressionDataListener impressionDataListener);

    @Override // com.ironsource.k6
    /* synthetic */ void c();

    boolean d();
}
