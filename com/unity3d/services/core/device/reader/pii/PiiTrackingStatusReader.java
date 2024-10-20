package com.unity3d.services.core.device.reader.pii;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.misc.IJsonStorageReader;

/* loaded from: PiiTrackingStatusReader.class */
public class PiiTrackingStatusReader {
    private final IJsonStorageReader _jsonStorageReader;
    private final NonBehavioralFlagReader _nonBehavioralFlagReader;

    public PiiTrackingStatusReader(IJsonStorageReader iJsonStorageReader) {
        this._jsonStorageReader = iJsonStorageReader;
        this._nonBehavioralFlagReader = new NonBehavioralFlagReader(iJsonStorageReader);
    }

    private PiiPrivacyMode getPrivacyMode(String str) {
        String str2;
        IJsonStorageReader iJsonStorageReader = this._jsonStorageReader;
        if (iJsonStorageReader != null) {
            Object obj = iJsonStorageReader.get(str);
            if (obj instanceof String) {
                str2 = (String) obj;
                return PiiPrivacyMode.getPiiPrivacyMode(str2);
            }
        }
        str2 = null;
        return PiiPrivacyMode.getPiiPrivacyMode(str2);
    }

    private PiiPrivacyMode getSpmPrivacyMode() {
        return getPrivacyMode(JsonStorageKeyNames.PRIVACY_SPM_KEY);
    }

    private PiiPrivacyMode getUserPrivacyMode() {
        return getPrivacyMode(JsonStorageKeyNames.PRIVACY_MODE_KEY);
    }

    public PiiPrivacyMode getPrivacyMode() {
        PiiPrivacyMode userPrivacyMode = getUserPrivacyMode();
        PiiPrivacyMode piiPrivacyMode = PiiPrivacyMode.NULL;
        if (userPrivacyMode == piiPrivacyMode && getSpmPrivacyMode() == piiPrivacyMode) {
            return piiPrivacyMode;
        }
        PiiPrivacyMode userPrivacyMode2 = getUserPrivacyMode();
        PiiPrivacyMode piiPrivacyMode2 = PiiPrivacyMode.APP;
        PiiPrivacyMode piiPrivacyMode3 = piiPrivacyMode2;
        if (userPrivacyMode2 != piiPrivacyMode2) {
            if (getSpmPrivacyMode() == piiPrivacyMode2) {
                piiPrivacyMode3 = piiPrivacyMode2;
            } else {
                PiiPrivacyMode userPrivacyMode3 = getUserPrivacyMode();
                PiiPrivacyMode piiPrivacyMode4 = PiiPrivacyMode.MIXED;
                piiPrivacyMode3 = piiPrivacyMode4;
                if (userPrivacyMode3 != piiPrivacyMode4) {
                    if (getSpmPrivacyMode() == piiPrivacyMode4) {
                        piiPrivacyMode3 = piiPrivacyMode4;
                    } else {
                        PiiPrivacyMode userPrivacyMode4 = getUserPrivacyMode();
                        PiiPrivacyMode piiPrivacyMode5 = PiiPrivacyMode.NONE;
                        piiPrivacyMode3 = piiPrivacyMode5;
                        if (userPrivacyMode4 != piiPrivacyMode5) {
                            if (getSpmPrivacyMode() != piiPrivacyMode5) {
                                return PiiPrivacyMode.UNDEFINED;
                            }
                            piiPrivacyMode3 = piiPrivacyMode5;
                        }
                    }
                }
            }
        }
        return piiPrivacyMode3;
    }

    public boolean getUserNonBehavioralFlag() {
        return this._nonBehavioralFlagReader.getUserNonBehavioralFlag() == NonBehavioralFlag.TRUE;
    }
}
