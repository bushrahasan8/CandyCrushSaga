package com.google.firebase.messaging;

import java.util.Locale;

/* loaded from: SendException.class */
public final class SendException extends Exception {
    private final int errorCode;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SendException(String str) {
        super(str);
        this.errorCode = parseErrorCode(str);
    }

    private int parseErrorCode(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        boolean z = -1;
        switch (lowerCase.hashCode()) {
            case -1743242157:
                if (lowerCase.equals("service_not_available")) {
                    z = false;
                    break;
                }
                break;
            case -1290953729:
                if (lowerCase.equals("toomanymessages")) {
                    z = true;
                    break;
                }
                break;
            case -920906446:
                if (lowerCase.equals("invalid_parameters")) {
                    z = 2;
                    break;
                }
                break;
            case -617027085:
                if (lowerCase.equals("messagetoobig")) {
                    z = 3;
                    break;
                }
                break;
            case -95047692:
                if (lowerCase.equals("missing_to")) {
                    z = 4;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
                return 3;
            case true:
                return 4;
            case true:
            case true:
                return 1;
            case true:
                return 2;
            default:
                return 0;
        }
    }
}
