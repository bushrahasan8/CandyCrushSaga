package com.unity3d.services.identifiers;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.identifiers.installationid.b;
import com.unity3d.services.identifiers.installationid.c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: a.class */
public final class a {
    public static volatile a b;
    public final b a;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = context.getPackageName() + ".v2.playerprefs";
        this.a = new b(new c(context, str, "UnityInstallationId"), new c(context, str, "unity.cloud_userid"), new c(context, UnityAdsConstants.Preferences.PREF_NAME_IDFI, UnityAdsConstants.Preferences.PREF_KEY_IDFI));
    }
}
