package com.ironsource;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.core.view.WindowInsetsCompat$TypeImpl30$;
import androidx.core.view.WindowInsetsControllerCompat$Impl30$;
import java.lang.ref.WeakReference;

/* loaded from: k.class */
public class k implements he {
    private WeakReference a;

    public k(Activity activity) {
        this.a = new WeakReference(activity);
    }

    @Override // com.ironsource.he
    public void a() {
        WindowInsetsController windowInsetsController;
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        Window window = activity.getWindow();
        if (i < 30) {
            window.setFlags(1024, 1024);
            return;
        }
        windowInsetsController = window.getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            WindowInsetsControllerCompat$Impl30$.ExternalSyntheticApiModelOutline3.m(windowInsetsController, WindowInsetsCompat$TypeImpl30$.ExternalSyntheticApiModelOutline0.m());
        }
    }
}
