package androidx.core.text;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: ICUCompat.class */
public abstract class ICUCompat {
    private static Method sAddLikelySubtagsMethod;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: ICUCompat$Api21Impl.class */
    public static abstract class Api21Impl {
        static String getScript(Locale locale) {
            return locale.getScript();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: ICUCompat$Api24Impl.class */
    public static abstract class Api24Impl {
        static ULocale addLikelySubtags(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        static ULocale forLocale(Locale locale) {
            return ULocale.forLocale(locale);
        }

        static String getScript(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                sAddLikelySubtagsMethod = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public static String maximizeAndGetScript(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.getScript(Api24Impl.addLikelySubtags(Api24Impl.forLocale(locale)));
        }
        try {
            return Api21Impl.getScript((Locale) sAddLikelySubtagsMethod.invoke(null, locale));
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
            return Api21Impl.getScript(locale);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
            return Api21Impl.getScript(locale);
        }
    }
}
