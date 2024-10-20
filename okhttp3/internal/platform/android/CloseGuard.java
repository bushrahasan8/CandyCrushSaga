package okhttp3.internal.platform.android;

import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: CloseGuard.class */
public final class CloseGuard {
    public static final Companion Companion = new Companion(null);
    private final Method getMethod;
    private final Method openMethod;
    private final Method warnIfOpenMethod;

    /* loaded from: CloseGuard$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CloseGuard get() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", null);
                method2 = cls.getMethod(MRAIDPresenter.OPEN, String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (Exception e) {
                method = null;
                method2 = null;
            }
            return new CloseGuard(method3, method2, method);
        }
    }

    public CloseGuard(Method method, Method method2, Method method3) {
        this.getMethod = method;
        this.openMethod = method2;
        this.warnIfOpenMethod = method3;
    }

    public final Object createAndOpen(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        Method method = this.getMethod;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, null);
            Method method2 = this.openMethod;
            Intrinsics.checkNotNull(method2);
            method2.invoke(invoke, closer);
            return invoke;
        } catch (Exception e) {
            return null;
        }
    }

    public final boolean warnIfOpen(Object obj) {
        boolean z;
        if (obj != null) {
            try {
                Method method = this.warnIfOpenMethod;
                Intrinsics.checkNotNull(method);
                method.invoke(obj, null);
                z = true;
            } catch (Exception e) {
            }
            return z;
        }
        z = false;
        return z;
    }
}
