package com.vungle.ads.internal.privacy;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.persistence.FilePreferences;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: PrivacyManager.class */
public final class PrivacyManager {
    private static PrivacyConsent ccpaConsent;
    private static FilePreferences filePreferences;
    private static String gdprConsent;
    private static String gdprConsentMessageVersion;
    private static String gdprConsentSource;
    private static Long gdprConsentTimestamp;
    public static final PrivacyManager INSTANCE = new PrivacyManager();
    private static final AtomicReference<Boolean> disableAdId = new AtomicReference<>();
    private static final AtomicReference<Boolean> coppaStatus = new AtomicReference<>();
    private static AtomicReference<Boolean> publishAndroidId = new AtomicReference<>();

    private PrivacyManager() {
    }

    private final void saveCcpaConsent(PrivacyConsent privacyConsent) {
        FilePreferences put;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (put = filePreferences2.put("ccpa_status", privacyConsent.getValue())) == null) {
            return;
        }
        put.apply();
    }

    private final void saveCoppaConsent(boolean z) {
        FilePreferences put;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (put = filePreferences2.put("is_coppa", z)) == null) {
            return;
        }
        put.apply();
    }

    private final void saveDisableAdId(boolean z) {
        FilePreferences put;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (put = filePreferences2.put("disable_ad_id", z)) == null) {
            return;
        }
        put.apply();
    }

    private final void saveGdprConsent(String str, String str2, String str3, long j) {
        FilePreferences put;
        FilePreferences put2;
        FilePreferences put3;
        FilePreferences put4;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (put = filePreferences2.put("gdpr_status", str)) == null || (put2 = put.put("gdpr_source", str2)) == null || (put3 = put2.put("gdpr_message_version", str3)) == null || (put4 = put3.put("gdpr_timestamp", j)) == null) {
            return;
        }
        put4.apply();
    }

    private final void savePublishAndroidId(boolean z) {
        FilePreferences put;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (put = filePreferences2.put("publish_android_id", z)) == null) {
            return;
        }
        put.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getCcpaStatus() {
        /*
            r2 = this;
            com.vungle.ads.internal.privacy.PrivacyConsent r0 = com.vungle.ads.internal.privacy.PrivacyManager.ccpaConsent
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L13
            r0 = r3
            java.lang.String r0 = r0.getValue()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1a
        L13:
            com.vungle.ads.internal.privacy.PrivacyConsent r0 = com.vungle.ads.internal.privacy.PrivacyConsent.OPT_IN
            java.lang.String r0 = r0.getValue()
            r3 = r0
        L1a:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.privacy.PrivacyManager.getCcpaStatus():java.lang.String");
    }

    public final String getConsentMessageVersion() {
        String str = gdprConsentMessageVersion;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return str2;
    }

    public final String getConsentSource() {
        String str = gdprConsentSource;
        String str2 = str;
        if (str == null) {
            str2 = "no_interaction";
        }
        return str2;
    }

    public final String getConsentStatus() {
        String str = gdprConsent;
        String str2 = str;
        if (str == null) {
            str2 = "unknown";
        }
        return str2;
    }

    public final long getConsentTimestamp() {
        Long l = gdprConsentTimestamp;
        return l != null ? l.longValue() : 0L;
    }

    public final COPPA getCoppaStatus() {
        AtomicReference<Boolean> atomicReference = coppaStatus;
        return atomicReference.get() == null ? COPPA.COPPA_NOTSET : Intrinsics.areEqual(atomicReference.get(), Boolean.TRUE) ? COPPA.COPPA_ENABLED : Intrinsics.areEqual(atomicReference.get(), Boolean.FALSE) ? COPPA.COPPA_DISABLED : COPPA.COPPA_NOTSET;
    }

    public final boolean getPublishAndroidId() {
        Boolean bool = publishAndroidId.get();
        return bool != null ? bool.booleanValue() : true;
    }

    public final void init(Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        FilePreferences filePreferences2 = (FilePreferences) ServiceLocator.Companion.getInstance(context).getService(FilePreferences.class);
        filePreferences = filePreferences2;
        AtomicReference<Boolean> atomicReference = disableAdId;
        Boolean bool = atomicReference.get();
        if (bool != null) {
            saveDisableAdId(bool.booleanValue());
        } else {
            Boolean bool2 = filePreferences2.getBoolean("disable_ad_id");
            if (bool2 != null) {
                atomicReference.set(bool2);
            }
        }
        String str2 = gdprConsent;
        long j = 0;
        if (str2 != null) {
            String str3 = gdprConsentSource;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = gdprConsentMessageVersion;
            if (str4 == null) {
                str4 = "";
            }
            Long l = gdprConsentTimestamp;
            if (l != null) {
                j = l.longValue();
            }
            saveGdprConsent(str2, str3, str4, j);
        } else {
            String string = filePreferences2.getString("gdpr_status");
            PrivacyConsent privacyConsent = PrivacyConsent.OPT_IN;
            if (Intrinsics.areEqual(string, privacyConsent.getValue())) {
                str = privacyConsent.getValue();
            } else {
                PrivacyConsent privacyConsent2 = PrivacyConsent.OPT_OUT;
                str = string;
                if (Intrinsics.areEqual(string, privacyConsent2.getValue())) {
                    str = privacyConsent2.getValue();
                }
            }
            gdprConsent = str;
            gdprConsentSource = filePreferences2.getString("gdpr_source");
            gdprConsentMessageVersion = filePreferences2.getString("gdpr_message_version");
            gdprConsentTimestamp = Long.valueOf(filePreferences2.getLong("gdpr_timestamp", 0L));
        }
        PrivacyConsent privacyConsent3 = ccpaConsent;
        if (privacyConsent3 != null) {
            saveCcpaConsent(privacyConsent3);
        } else {
            String string2 = filePreferences2.getString("ccpa_status");
            PrivacyConsent privacyConsent4 = PrivacyConsent.OPT_OUT;
            if (!Intrinsics.areEqual(privacyConsent4.getValue(), string2)) {
                privacyConsent4 = PrivacyConsent.OPT_IN;
            }
            ccpaConsent = privacyConsent4;
        }
        AtomicReference<Boolean> atomicReference2 = coppaStatus;
        Boolean bool3 = atomicReference2.get();
        if (bool3 != null) {
            saveCoppaConsent(bool3.booleanValue());
        } else {
            Boolean bool4 = filePreferences2.getBoolean("is_coppa");
            if (bool4 != null) {
                atomicReference2.set(bool4);
            }
        }
        Boolean bool5 = publishAndroidId.get();
        if (bool5 != null) {
            savePublishAndroidId(bool5.booleanValue());
            return;
        }
        Boolean bool6 = filePreferences2.getBoolean("publish_android_id");
        if (bool6 != null) {
            publishAndroidId.set(bool6);
        }
    }

    public final void setPublishAndroidId(boolean z) {
        publishAndroidId.set(Boolean.valueOf(z));
        savePublishAndroidId(z);
    }

    public final boolean shouldSendAdIds() {
        Boolean bool = disableAdId.get();
        boolean z = false;
        if (bool != null && !bool.booleanValue()) {
            z = true;
        }
        return z;
    }

    public final void updateCcpaConsent(PrivacyConsent consent) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        ccpaConsent = consent;
        saveCcpaConsent(consent);
    }

    public final void updateCoppaConsent(boolean z) {
        coppaStatus.set(Boolean.valueOf(z));
        saveCoppaConsent(z);
    }

    public final void updateDisableAdId(boolean z) {
        disableAdId.set(Boolean.valueOf(z));
        saveDisableAdId(z);
    }

    public final void updateGdprConsent(String consent, String source, String str) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        Intrinsics.checkNotNullParameter(source, "source");
        gdprConsent = consent;
        gdprConsentSource = source;
        gdprConsentMessageVersion = str;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        gdprConsentTimestamp = Long.valueOf(currentTimeMillis);
        String str2 = gdprConsentMessageVersion;
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        saveGdprConsent(consent, source, str3, currentTimeMillis);
    }
}
