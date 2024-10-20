package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: b.class */
public class b {
    private static final String b = "b";
    private final v.u a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(v.u uVar) {
        this.a = uVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        v.u uVar = this.a;
        if (uVar != null) {
            uVar.b(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2) {
        synchronized (this) {
            if (this.a == null) {
                Logger.e(b, "!!! nativeAPI == null !!!");
                return;
            }
            Method declaredMethod = v.u.class.getDeclaredMethod(str, String.class);
            if (declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
                declaredMethod.invoke(this.a, str2);
                return;
            }
            throw new AccessControlException("Trying to access a private function: " + str);
        }
    }
}
