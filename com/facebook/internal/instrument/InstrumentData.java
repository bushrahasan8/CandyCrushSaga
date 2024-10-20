package com.facebook.internal.instrument;

import android.os.Build;
import com.facebook.internal.Utility;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: InstrumentData.class */
public final class InstrumentData {
    public static final Companion Companion = new Companion(null);
    private String appVersion;
    private String cause;
    private JSONArray featureNames;
    private String filename;
    private String stackTrace;
    private Long timestamp;
    private Type type;

    /* loaded from: InstrumentData$Builder.class */
    public static final class Builder {
        public static final Builder INSTANCE = new Builder();

        private Builder() {
        }

        public static final InstrumentData build(String str, String str2) {
            return new InstrumentData(str, str2, (DefaultConstructorMarker) null);
        }

        public static final InstrumentData build(Throwable th, Type t) {
            Intrinsics.checkNotNullParameter(t, "t");
            return new InstrumentData(th, t, (DefaultConstructorMarker) null);
        }

        public static final InstrumentData build(JSONArray features) {
            Intrinsics.checkNotNullParameter(features, "features");
            return new InstrumentData(features, (DefaultConstructorMarker) null);
        }

        public static final InstrumentData load(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new InstrumentData(file, (DefaultConstructorMarker) null);
        }
    }

    /* loaded from: InstrumentData$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Type getType(String str) {
            return StringsKt.startsWith$default(str, "crash_log_", false, 2, (Object) null) ? Type.CrashReport : StringsKt.startsWith$default(str, "shield_log_", false, 2, (Object) null) ? Type.CrashShield : StringsKt.startsWith$default(str, "thread_check_log_", false, 2, (Object) null) ? Type.ThreadCheck : StringsKt.startsWith$default(str, "analysis_log_", false, 2, (Object) null) ? Type.Analysis : StringsKt.startsWith$default(str, "anr_log_", false, 2, (Object) null) ? Type.AnrReport : Type.Unknown;
        }
    }

    /* loaded from: InstrumentData$Type.class */
    public enum Type {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* loaded from: InstrumentData$Type$WhenMappings.class */
        public abstract /* synthetic */ class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Type.values().length];
                try {
                    iArr[Type.Analysis.ordinal()] = 1;
                } catch (NoSuchFieldError e) {
                }
                try {
                    iArr[Type.AnrReport.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                }
                try {
                    iArr[Type.CrashReport.ordinal()] = 3;
                } catch (NoSuchFieldError e3) {
                }
                try {
                    iArr[Type.CrashShield.ordinal()] = 4;
                } catch (NoSuchFieldError e4) {
                }
                try {
                    iArr[Type.ThreadCheck.ordinal()] = 5;
                } catch (NoSuchFieldError e5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final String getLogPrefix() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
        }
    }

    /* loaded from: InstrumentData$WhenMappings.class */
    public abstract /* synthetic */ class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.Analysis.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Type.AnrReport.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Type.CrashReport.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[Type.CrashShield.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[Type.ThreadCheck.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private InstrumentData(File file) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.filename = name;
        this.type = Companion.getType(name);
        JSONObject readFile = InstrumentUtility.readFile(this.filename, true);
        if (readFile != null) {
            this.timestamp = Long.valueOf(readFile.optLong("timestamp", 0L));
            this.appVersion = readFile.optString("app_version", null);
            this.cause = readFile.optString("reason", null);
            this.stackTrace = readFile.optString("callstack", null);
            this.featureNames = readFile.optJSONArray("feature_names");
        }
    }

    public /* synthetic */ InstrumentData(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    private InstrumentData(String str, String str2) {
        this.type = Type.AnrReport;
        this.appVersion = Utility.getAppVersion();
        this.cause = str;
        this.stackTrace = str2;
        this.timestamp = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        this.filename = stringBuffer2;
    }

    public /* synthetic */ InstrumentData(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    private InstrumentData(Throwable th, Type type) {
        this.type = type;
        this.appVersion = Utility.getAppVersion();
        this.cause = InstrumentUtility.getCause(th);
        this.stackTrace = InstrumentUtility.getStackTrace(th);
        this.timestamp = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(type.getLogPrefix());
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer().append(t.…ppend(\".json\").toString()");
        this.filename = stringBuffer2;
    }

    public /* synthetic */ InstrumentData(Throwable th, Type type, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, type);
    }

    private InstrumentData(JSONArray jSONArray) {
        this.type = Type.Analysis;
        this.timestamp = Long.valueOf(System.currentTimeMillis() / 1000);
        this.featureNames = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        this.filename = stringBuffer2;
    }

    public /* synthetic */ InstrumentData(JSONArray jSONArray, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONArray);
    }

    private final JSONObject getAnalysisReportParameters() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.featureNames;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l = this.timestamp;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            return jSONObject;
        } catch (JSONException e) {
            return null;
        }
    }

    private final JSONObject getExceptionReportParameters() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.appVersion;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l = this.timestamp;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            String str2 = this.cause;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.stackTrace;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            Type type = this.type;
            if (type != null) {
                jSONObject.put("type", type);
            }
            return jSONObject;
        } catch (JSONException e) {
            return null;
        }
    }

    private final JSONObject getParameters() {
        Type type = this.type;
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? getExceptionReportParameters() : null : getAnalysisReportParameters();
    }

    public final void clear() {
        InstrumentUtility.deleteFile(this.filename);
    }

    public final int compareTo(InstrumentData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Long l = this.timestamp;
        if (l == null) {
            return -1;
        }
        long longValue = l.longValue();
        Long l2 = data.timestamp;
        if (l2 != null) {
            return Intrinsics.compare(l2.longValue(), longValue);
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r3.timestamp != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r3.timestamp != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r3.timestamp != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isValid() {
        /*
            r3 = this;
            r0 = r3
            com.facebook.internal.instrument.InstrumentData$Type r0 = r0.type
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L10
            r0 = -1
            r4 = r0
            goto L1a
        L10:
            int[] r0 = com.facebook.internal.instrument.InstrumentData.WhenMappings.$EnumSwitchMapping$0
            r1 = r7
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r4 = r0
        L1a:
            r0 = 0
            r6 = r0
            r0 = r4
            r1 = 1
            if (r0 == r1) goto L6f
            r0 = r4
            r1 = 2
            if (r0 == r1) goto L51
            r0 = r4
            r1 = 3
            if (r0 == r1) goto L3a
            r0 = r4
            r1 = 4
            if (r0 == r1) goto L3a
            r0 = r4
            r1 = 5
            if (r0 == r1) goto L3a
            r0 = r6
            r5 = r0
            goto L84
        L3a:
            r0 = r6
            r5 = r0
            r0 = r3
            java.lang.String r0 = r0.stackTrace
            if (r0 == 0) goto L84
            r0 = r6
            r5 = r0
            r0 = r3
            java.lang.Long r0 = r0.timestamp
            if (r0 == 0) goto L84
        L4c:
            r0 = 1
            r5 = r0
            goto L84
        L51:
            r0 = r6
            r5 = r0
            r0 = r3
            java.lang.String r0 = r0.stackTrace
            if (r0 == 0) goto L84
            r0 = r6
            r5 = r0
            r0 = r3
            java.lang.String r0 = r0.cause
            if (r0 == 0) goto L84
            r0 = r6
            r5 = r0
            r0 = r3
            java.lang.Long r0 = r0.timestamp
            if (r0 == 0) goto L84
            goto L4c
        L6f:
            r0 = r6
            r5 = r0
            r0 = r3
            org.json.JSONArray r0 = r0.featureNames
            if (r0 == 0) goto L84
            r0 = r6
            r5 = r0
            r0 = r3
            java.lang.Long r0 = r0.timestamp
            if (r0 == 0) goto L84
            goto L4c
        L84:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.instrument.InstrumentData.isValid():boolean");
    }

    public final void save() {
        if (isValid()) {
            InstrumentUtility.writeFile(this.filename, toString());
        }
    }

    public String toString() {
        JSONObject parameters = getParameters();
        if (parameters == null) {
            String jSONObject = new JSONObject().toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject().toString()");
            return jSONObject;
        }
        String jSONObject2 = parameters.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "params.toString()");
        return jSONObject2;
    }
}
