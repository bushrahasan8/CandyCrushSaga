package com.applovin.sdk;

/* loaded from: AppLovinCmpError.class */
public interface AppLovinCmpError {

    /* loaded from: AppLovinCmpError$Code.class */
    public enum Code {
        UNSPECIFIED(-1),
        INTEGRATION_ERROR(1),
        FORM_UNAVAILABLE(2),
        FORM_NOT_REQUIRED(3);

        private final int a;

        Code(int i) {
            this.a = i;
        }

        public int getValue() {
            return this.a;
        }
    }

    int getCmpCode();

    String getCmpMessage();

    Code getCode();

    String getMessage();
}
