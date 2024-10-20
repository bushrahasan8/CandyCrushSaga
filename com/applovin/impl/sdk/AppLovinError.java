package com.applovin.impl.sdk;

/* loaded from: AppLovinError.class */
public class AppLovinError {
    public static final AppLovinError NO_FILL = new AppLovinError(204, "No Fill");
    private final int a;
    private final String b;

    public AppLovinError(int i, String str) {
        this.a = i;
        this.b = str;
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof AppLovinError;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppLovinError)) {
            return false;
        }
        AppLovinError appLovinError = (AppLovinError) obj;
        if (!appLovinError.canEqual(this) || getCode() != appLovinError.getCode()) {
            return false;
        }
        String message = getMessage();
        String message2 = appLovinError.getMessage();
        return message == null ? message2 == null : message.equals(message2);
    }

    public int getCode() {
        return this.a;
    }

    public String getMessage() {
        return this.b;
    }

    public int hashCode() {
        int code = getCode();
        String message = getMessage();
        return ((code + 59) * 59) + (message == null ? 43 : message.hashCode());
    }

    public String toString() {
        return "AppLovinError(code=" + getCode() + ", message=" + getMessage() + ")";
    }
}
