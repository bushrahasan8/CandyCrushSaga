package com.onetrust.otpublishers.headless.Public.DataModel;

import androidx.annotation.Keep;
import java.net.URL;

@Keep
/* loaded from: OTProxyManager.class */
public interface OTProxyManager {
    @Keep
    URL getProxyDomain(OTProxyType oTProxyType);
}
