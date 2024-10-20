package com.vungle.ads.internal.locale;

import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: SystemLocaleInfo.class */
public final class SystemLocaleInfo implements LocaleInfo {
    @Override // com.vungle.ads.internal.locale.LocaleInfo
    public String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getDefault().language");
        return language;
    }

    @Override // com.vungle.ads.internal.locale.LocaleInfo
    public String getTimeZoneId() {
        String id = TimeZone.getDefault().getID();
        Intrinsics.checkNotNullExpressionValue(id, "getDefault().id");
        return id;
    }
}
