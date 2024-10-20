package com.unity3d.services.core.device.reader;

import java.util.Map;

/* loaded from: IDeviceInfoDataContainer.class */
public interface IDeviceInfoDataContainer {
    byte[] getDeviceData();

    Map<String, Object> getDeviceInfo();
}
