package com.facebook.internal;

import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* loaded from: Logger.class */
public final class Logger {
    public static final Companion Companion = new Companion(null);
    private static final HashMap stringsToReplace = new HashMap();
    private final LoggingBehavior behavior;
    private StringBuilder contents;
    private int priority;
    private final String tag;

    /* loaded from: Logger$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String replaceStrings(String str) {
            synchronized (this) {
                for (Map.Entry entry : Logger.stringsToReplace.entrySet()) {
                    str = StringsKt.replace$default(str, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
                }
            }
            return str;
        }

        public final void log(LoggingBehavior behavior, int i, String tag, String string) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            if (FacebookSdk.isLoggingBehaviorEnabled(behavior)) {
                String replaceStrings = replaceStrings(string);
                String str = tag;
                if (!StringsKt.startsWith$default(tag, "FacebookSDK.", false, 2, (Object) null)) {
                    str = "FacebookSDK." + tag;
                }
                Log.println(i, str, replaceStrings);
                if (behavior == LoggingBehavior.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        public final void log(LoggingBehavior behavior, String tag, String string) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            log(behavior, 3, tag, string);
        }

        public final void log(LoggingBehavior behavior, String tag, String format, Object... args) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (FacebookSdk.isLoggingBehaviorEnabled(behavior)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
                log(behavior, 3, tag, format2);
            }
        }

        public final void registerAccessToken(String accessToken) {
            synchronized (this) {
                Intrinsics.checkNotNullParameter(accessToken, "accessToken");
                if (!FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                    registerStringToReplace(accessToken, "ACCESS_TOKEN_REMOVED");
                }
            }
        }

        public final void registerStringToReplace(String original, String replace) {
            synchronized (this) {
                Intrinsics.checkNotNullParameter(original, "original");
                Intrinsics.checkNotNullParameter(replace, "replace");
                Logger.stringsToReplace.put(original, replace);
            }
        }
    }

    public Logger(LoggingBehavior behavior, String tag) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.priority = 3;
        this.behavior = behavior;
        this.tag = "FacebookSDK." + Validate.notNullOrEmpty(tag, "tag");
        this.contents = new StringBuilder();
    }

    private final boolean shouldLog() {
        return FacebookSdk.isLoggingBehaviorEnabled(this.behavior);
    }

    public final void append(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (shouldLog()) {
            this.contents.append(string);
        }
    }

    public final void append(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (shouldLog()) {
            StringBuilder sb = this.contents;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
            sb.append(format2);
        }
    }

    public final void appendKeyValue(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        append("  %s:\t%s\n", key, value);
    }

    public final void log() {
        String sb = this.contents.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "contents.toString()");
        logString(sb);
        this.contents = new StringBuilder();
    }

    public final void logString(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        Companion.log(this.behavior, this.priority, this.tag, string);
    }
}
