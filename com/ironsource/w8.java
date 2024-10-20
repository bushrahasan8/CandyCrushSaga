package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.OfferwallListener;
import java.util.Map;

/* loaded from: w8.class */
public interface w8 extends ta, z9, b8 {
    void a(Context context, boolean z);

    /* synthetic */ void a(ImpressionDataListener impressionDataListener);

    /* synthetic */ void a(LogListener logListener);

    @Override // com.ironsource.ta
    /* synthetic */ void a(OfferwallListener offerwallListener);

    @Override // com.ironsource.ta
    /* synthetic */ void a(String str, String str2);

    void a(Map<String, String> map);

    void a(boolean z);

    String b(Context context);

    void b();

    /* synthetic */ void b(ImpressionDataListener impressionDataListener);

    @Override // com.ironsource.ta
    /* synthetic */ void c();

    void d();

    void e();

    boolean e(String str);

    void f();

    InterstitialPlacement g(String str);

    @Override // com.ironsource.ta
    /* synthetic */ void getOfferwallCredits();

    void h(String str);

    Placement i(String str);

    @Override // com.ironsource.ta
    /* synthetic */ boolean isOfferwallAvailable();

    @Override // com.ironsource.ta
    /* synthetic */ void j(String str);
}
