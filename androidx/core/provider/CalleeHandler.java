package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;

/* loaded from: CalleeHandler.class */
abstract class CalleeHandler {
    public static Handler create() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
