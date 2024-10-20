package com.facebook.login;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: LoginTargetApp.class */
public enum LoginTargetApp {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");

    public static final Companion Companion = new Companion(null);
    private final String targetApp;

    /* loaded from: LoginTargetApp$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LoginTargetApp fromString(String str) {
            for (LoginTargetApp loginTargetApp : LoginTargetApp.values()) {
                if (Intrinsics.areEqual(loginTargetApp.toString(), str)) {
                    return loginTargetApp;
                }
            }
            return LoginTargetApp.FACEBOOK;
        }
    }

    LoginTargetApp(String str) {
        this.targetApp = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.targetApp;
    }
}
