package com.facebook.ads.internal.util.process;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Keep;
import java.lang.reflect.Field;

@Keep
/* loaded from: ProcessUtils.class */
public final class ProcessUtils {
    private static String sProcessName;

    private ProcessUtils() {
    }

    public static String getProcessName(Context context) {
        synchronized (ProcessUtils.class) {
            try {
                String str = sProcessName;
                if (str != null) {
                    return str;
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    return getProcessNameAPI28();
                }
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof Application)) {
                    return null;
                }
                String processNameViaReflection = getProcessNameViaReflection((Application) applicationContext);
                synchronized (ProcessUtils.class) {
                    try {
                        sProcessName = processNameViaReflection;
                    } finally {
                    }
                }
                return processNameViaReflection;
            } finally {
            }
        }
    }

    private static String getProcessNameAPI28() {
        try {
            return (String) Application.class.getMethod("getProcessName", null).invoke(null, null);
        } catch (Exception e) {
            return null;
        }
    }

    private static String getProcessNameViaReflection(Application application) {
        try {
            Field field = application.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(application);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            return (String) obj2.getClass().getDeclaredMethod("getProcessName", null).invoke(obj2, null);
        } catch (Exception e) {
            return null;
        }
    }

    public static String getProcessSpecificName(String str, Context context) {
        String packageName = context.getPackageName();
        String processName = getProcessName(context);
        String str2 = str;
        if (!TextUtils.isEmpty(processName)) {
            str2 = str;
            if (!packageName.equals(processName)) {
                String str3 = processName;
                if (processName.contains(":")) {
                    str3 = processName.split(":")[1];
                }
                str2 = str + "_" + str3;
            }
        }
        return str2;
    }
}
