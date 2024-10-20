package com.iab.omid.library.ironsrc.adsession;

/* loaded from: DeviceCategory.class */
public enum DeviceCategory {
    CTV("ctv"),
    MOBILE("mobile"),
    OTHER("other");

    private final String deviceCategory;

    DeviceCategory(String str) {
        this.deviceCategory = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.deviceCategory;
    }
}
