package com.unity3d.ads.core.data.datasource;

import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;

/* loaded from: AndroidAnalyticsDataSource.class */
public final class AndroidAnalyticsDataSource implements AnalyticsDataSource {
    @Override // com.unity3d.ads.core.data.datasource.AnalyticsDataSource
    public String getUserId() {
        return AndroidPreferences.getString(ClientProperties.getAppName() + ".v2.playerprefs", "unity.cloud_userid");
    }
}
