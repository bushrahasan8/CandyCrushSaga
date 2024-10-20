package androidx.core.os;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* loaded from: UserManagerCompat.class */
public abstract class UserManagerCompat {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: UserManagerCompat$Api24Impl.class */
    public static abstract class Api24Impl {
        static boolean isUserUnlocked(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean isUserUnlocked(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.isUserUnlocked(context);
        }
        return true;
    }
}
