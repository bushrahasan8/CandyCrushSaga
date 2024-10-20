package com.onetrust.otpublishers.headless.Public.DataModel;

/* loaded from: OTGeolocationModel.class */
public class OTGeolocationModel {
    public String country;
    public String state;

    public boolean compareLocation(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        if (str.equalsIgnoreCase(this.country) || str.equalsIgnoreCase(this.state)) {
            z = true;
        }
        return z;
    }
}
