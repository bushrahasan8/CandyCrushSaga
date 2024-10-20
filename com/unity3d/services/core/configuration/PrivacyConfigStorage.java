package com.unity3d.services.core.configuration;

import com.unity3d.services.core.misc.IObserver;
import com.unity3d.services.core.misc.Observable;

/* loaded from: PrivacyConfigStorage.class */
public class PrivacyConfigStorage extends Observable<PrivacyConfig> {
    private static PrivacyConfigStorage _instance;
    private PrivacyConfig _privacyConfig = new PrivacyConfig();

    private PrivacyConfigStorage() {
    }

    public static PrivacyConfigStorage getInstance() {
        if (_instance == null) {
            _instance = new PrivacyConfigStorage();
        }
        return _instance;
    }

    public PrivacyConfig getPrivacyConfig() {
        PrivacyConfig privacyConfig;
        synchronized (this) {
            privacyConfig = this._privacyConfig;
        }
        return privacyConfig;
    }

    @Override // com.unity3d.services.core.misc.Observable
    public void registerObserver(IObserver<PrivacyConfig> iObserver) {
        synchronized (this) {
            super.registerObserver(iObserver);
            if (this._privacyConfig.getPrivacyStatus() != PrivacyConfigStatus.UNKNOWN) {
                iObserver.updated(this._privacyConfig);
            }
        }
    }

    public void setPrivacyConfig(PrivacyConfig privacyConfig) {
        synchronized (this) {
            this._privacyConfig = privacyConfig;
            notifyObservers(privacyConfig);
        }
    }
}
