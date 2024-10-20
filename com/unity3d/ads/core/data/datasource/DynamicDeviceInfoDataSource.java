package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo;
import kotlinx.coroutines.flow.Flow;

/* loaded from: DynamicDeviceInfoDataSource.class */
public interface DynamicDeviceInfoDataSource {
    DynamicDeviceInfoOuterClass$DynamicDeviceInfo fetch();

    String getConnectionTypeStr();

    String getOrientation();

    int getRingerMode();

    Flow getVolumeSettingsChange();

    boolean hasInternet();
}
