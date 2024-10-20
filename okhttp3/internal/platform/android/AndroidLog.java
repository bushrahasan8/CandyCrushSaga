package okhttp3.internal.platform.android;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;

/* loaded from: AndroidLog.class */
public final class AndroidLog {
    public static final AndroidLog INSTANCE = new AndroidLog();
    private static final CopyOnWriteArraySet configuredLoggers = new CopyOnWriteArraySet();
    private static final Map knownLoggers;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r0 = OkHttpClient.class.getPackage();
        String name = r0 == null ? null : r0.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = OkHttpClient.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = Http2.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = TaskRunner.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        knownLoggers = MapsKt.toMap(linkedHashMap);
    }

    private AndroidLog() {
    }

    private final void enableLogging(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (configuredLoggers.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(AndroidLogHandler.INSTANCE);
        }
    }

    private final String loggerTag(String str) {
        String str2 = (String) knownLoggers.get(str);
        String str3 = str2;
        if (str2 == null) {
            str3 = StringsKt.take(str, 23);
        }
        return str3;
    }

    public final void androidLog$okhttp(String loggerName, int i, String message, Throwable th) {
        int min;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String loggerTag = loggerTag(loggerName);
        if (!Log.isLoggable(loggerTag, i)) {
            return;
        }
        String str = message;
        if (th != null) {
            str = message + '\n' + ((Object) Log.getStackTraceString(th));
        }
        int length = str.length();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                return;
            }
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '\n', i3, false, 4, (Object) null);
            if (indexOf$default == -1) {
                indexOf$default = length;
            }
            while (true) {
                min = Math.min(indexOf$default, i3 + 4000);
                String substring = str.substring(i3, min);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                Log.println(i, loggerTag, substring);
                if (min >= indexOf$default) {
                    break;
                } else {
                    i3 = min;
                }
            }
            i2 = min + 1;
        }
    }

    public final void enable() {
        for (Map.Entry entry : knownLoggers.entrySet()) {
            enableLogging((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
