package com.unity3d.ads.core.extensions;

import com.onetrust.otpublishers.headless.Public.Response.OTResponseCode;
import com.unity3d.ads.adplayer.model.ErrorReason;

/* loaded from: IntExtensionKt.class */
public final class IntExtensionKt {
    public static final ErrorReason webResourceToErrorReason(int i) {
        ErrorReason errorReason;
        switch (i) {
            case -16:
                errorReason = ErrorReason.REASON_WEB_ERROR_UNSAFE_RESOURCE;
                break;
            case -15:
                errorReason = ErrorReason.REASON_WEB_ERROR_TOO_MANY_REQUESTS;
                break;
            case -14:
                errorReason = ErrorReason.REASON_WEB_ERROR_FILE_NOT_FOUND;
                break;
            case -13:
                errorReason = ErrorReason.REASON_WEB_ERROR_FILE;
                break;
            case -12:
                errorReason = ErrorReason.REASON_WEB_ERROR_BAD_URL;
                break;
            case -11:
                errorReason = ErrorReason.REASON_WEB_ERROR_FAILED_SSL_HANDSHAKE;
                break;
            case -10:
                errorReason = ErrorReason.REASON_WEB_ERROR_UNSUPPORTED_SCHEME;
                break;
            case -9:
                errorReason = ErrorReason.REASON_WEB_ERROR_REDIRECT_LOOP;
                break;
            case -8:
                errorReason = ErrorReason.REASON_WEB_ERROR_TIMEOUT;
                break;
            case -7:
                errorReason = ErrorReason.REASON_WEB_ERROR_IO;
                break;
            case -6:
                errorReason = ErrorReason.REASON_WEB_ERROR_CONNECT;
                break;
            case -5:
                errorReason = ErrorReason.REASON_WEB_ERROR_PROXY_AUTHENTICATION;
                break;
            case -4:
                errorReason = ErrorReason.REASON_WEB_ERROR_AUTHENTICATION;
                break;
            case OTResponseCode.UNKNOWN_ERROR /* -3 */:
                errorReason = ErrorReason.REASON_WEB_ERROR_UNSUPPORTED_AUTH_SCHEME;
                break;
            case -2:
                errorReason = ErrorReason.REASON_WEB_ERROR_HOST_LOOKUP;
                break;
            case -1:
                errorReason = ErrorReason.REASON_WEB_ERROR_UNKNOWN;
                break;
            default:
                errorReason = ErrorReason.REASON_UNKNOWN;
                break;
        }
        return errorReason;
    }
}
