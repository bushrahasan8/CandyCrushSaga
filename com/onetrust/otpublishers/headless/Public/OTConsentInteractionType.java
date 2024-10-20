package com.onetrust.otpublishers.headless.Public;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: OTConsentInteractionType.class */
public class OTConsentInteractionType {
    public static final String BANNER_ALLOW_ALL = "Banner - Allow All";
    public static final String BANNER_BACK = "Banner - Back";
    public static final String BANNER_CLOSE = "Banner - Close";
    public static final String BANNER_CONTINUE_WITHOUT_ACCEPTING = "Banner - Continue Without Accepting";
    public static final String BANNER_REJECT_ALL = "Banner - Reject All";
    public static final String PC_ALLOW_ALL = "Preference Center - Allow All";
    public static final String PC_CLOSE = "Preference Center - Close";
    public static final String PC_CONFIRM = "Preference Center - Confirm";
    public static final String PC_REJECT_ALL = "Preference Center - Reject All";
    public static final String SDK_LIST_ALLOW_ALL = "SDKList - Allow All";
    public static final String SDK_LIST_CONFIRM = "SDKList - Confirm";
    public static final String SDK_LIST_REJECT_ALL = "SDKList - Reject All";
    public static final String UC_PC_CONFIRM = "UC Preference Center - Confirm";
    public static final String VENDOR_LIST_ALLOW_ALL = "VendorList - Allow All";
    public static final String VENDOR_LIST_CONFIRM = "VendorList - Confirm";
    public static final String VENDOR_LIST_REJECT_ALL = "VendorList - Reject All";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: OTConsentInteractionType$InteractionType.class */
    public @interface InteractionType {
    }
}
