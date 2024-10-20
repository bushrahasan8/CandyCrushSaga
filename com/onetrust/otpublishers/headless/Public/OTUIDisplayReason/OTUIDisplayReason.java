package com.onetrust.otpublishers.headless.Public.OTUIDisplayReason;

import com.onetrust.otpublishers.headless.Public.OTUIDisplayReason.OTUIDisplayReasonCode;

/* loaded from: OTUIDisplayReason.class */
public class OTUIDisplayReason {
    public final String a;
    public final int b;
    public final String c;

    public OTUIDisplayReason(int i, String str) {
        this.b = i;
        this.c = str;
        this.a = i + " - " + str;
    }

    public static String getResponseMessage(int i) {
        switch (i) {
            case 101:
                return OTUIDisplayReasonMessage.BANNER_SHOWN_GEO_RULE_ENABLED;
            case 102:
                return OTUIDisplayReasonMessage.BANNER_SHOWN_RE_CONSENT;
            case 103:
                return OTUIDisplayReasonMessage.BANNER_SHOWN_RE_CONSENT_EXPIRED;
            case 104:
                return OTUIDisplayReasonMessage.BANNER_SHOWN_TC_STRING_EXPIRED;
            case 105:
                return OTUIDisplayReasonMessage.BANNER_SHOWN_CONSENT_EXPIRED;
            case 106:
                return OTUIDisplayReasonMessage.BANNER_SHOWN_SERVICE_SPECIFIC_OFF;
            case 107:
                return OTUIDisplayReasonMessage.BANNER_SHOWN_SYNC_FAILED;
            case 108:
                return OTUIDisplayReasonMessage.BANNER_SHOWN_BACKWARD_COMPATIBILITY;
            case 109:
                return OTUIDisplayReasonMessage.BANNER_SHOWN_MOVED_REGION;
            case 110:
                return OTUIDisplayReasonMessage.BANNER_SHOWN_SHOW_BANNER_CALLED;
            case 111:
                return "Displaying OT Banner because new category or purpose addition is detected.";
            default:
                switch (i) {
                    case 201:
                        return OTUIDisplayReasonMessage.PC_SHOWN_GEO_RULE_ENABLED;
                    case 202:
                        return OTUIDisplayReasonMessage.PC_SHOWN_RE_CONSENT;
                    case 203:
                        return OTUIDisplayReasonMessage.PC_SHOWN_RE_CONSENT_EXPIRED;
                    case 204:
                        return OTUIDisplayReasonMessage.PC_SHOWN_TC_STRING_EXPIRED;
                    case 205:
                        return OTUIDisplayReasonMessage.PC_SHOWN_CONSENT_EXPIRED;
                    case 206:
                        return OTUIDisplayReasonMessage.PC_SHOWN_SERVICE_SPECIFIC_OFF;
                    case 207:
                        return OTUIDisplayReasonMessage.PC_SHOWN_SYNC_FAILED;
                    case 208:
                        return OTUIDisplayReasonMessage.PC_SHOWN_BACKWARD_COMPATIBILITY;
                    case 209:
                        return OTUIDisplayReasonMessage.PC_SHOWN_MOVED_REGION;
                    case 210:
                        return OTUIDisplayReasonMessage.PC_SHOWN_SHOW_PC_CALLED;
                    case OTUIDisplayReasonCode.UIShownCode.PC_SHOWN_NEW_GROUP_ADDED /* 211 */:
                        return "Displaying OT Banner because new category or purpose addition is detected.";
                    default:
                        return "Banner / PC shown, not defined reason code.";
                }
        }
    }

    public int getResponseCode() {
        return this.b;
    }

    public String getResponseMessage() {
        return this.c;
    }

    public String logReason() {
        return this.a;
    }

    public String toString() {
        return "OTUIDisplayReason{logMessage='" + this.a + "', responseCode=" + this.b + ", responseMessage='" + this.c + "'}";
    }
}
