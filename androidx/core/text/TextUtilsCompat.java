package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;

/* loaded from: TextUtilsCompat.class */
public abstract class TextUtilsCompat {
    private static final Locale ROOT = new Locale("", "");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: TextUtilsCompat$Api17Impl.class */
    public static abstract class Api17Impl {
        static int getLayoutDirectionFromLocale(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    public static int getLayoutDirectionFromLocale(Locale locale) {
        return Api17Impl.getLayoutDirectionFromLocale(locale);
    }
}
