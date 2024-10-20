package com.facebook.internal.instrument;

import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.internal.Utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: InstrumentUtility.class */
public final class InstrumentUtility {
    public static final InstrumentUtility INSTANCE = new InstrumentUtility();

    private InstrumentUtility() {
    }

    public static final boolean deleteFile(String str) {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null || str == null) {
            return false;
        }
        return new File(instrumentReportDir, str).delete();
    }

    public static final String getCause(Throwable th) {
        if (th == null) {
            return null;
        }
        return th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
    }

    public static final File getInstrumentReportDir() {
        File file = new File(FacebookSdk.getApplicationContext().getCacheDir(), "instrument");
        File file2 = file;
        if (!file.exists()) {
            file2 = file.mkdirs() ? file : null;
        }
        return file2;
    }

    public static final String getStackTrace(Thread thread) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    public static final String getStackTrace(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r0, "com.meta", false, 2, (java.lang.Object) null) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean isFromFBorMeta(java.lang.StackTraceElement r6) {
        /*
            r0 = r6
            java.lang.String r1 = "element"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r6
            java.lang.String r0 = r0.getClassName()
            r8 = r0
            r0 = r8
            java.lang.String r1 = "element.className"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0 = 0
            r7 = r0
            r0 = r8
            java.lang.String r1 = "com.facebook"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L36
            r0 = r6
            java.lang.String r0 = r0.getClassName()
            r6 = r0
            r0 = r6
            java.lang.String r1 = "element.className"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0 = r6
            java.lang.String r1 = "com.meta"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L38
        L36:
            r0 = 1
            r7 = r0
        L38:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.instrument.InstrumentUtility.isFromFBorMeta(java.lang.StackTraceElement):boolean");
    }

    public static final boolean isSDKRelatedException(Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
            for (StackTraceElement element : stackTrace) {
                Intrinsics.checkNotNullExpressionValue(element, "element");
                if (isFromFBorMeta(element)) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    public static final boolean isSDKRelatedThread(Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread == null || (stackTrace = thread.getStackTrace()) == null) {
            return false;
        }
        for (StackTraceElement element : stackTrace) {
            Intrinsics.checkNotNullExpressionValue(element, "element");
            if (isFromFBorMeta(element)) {
                String className = element.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "element.className");
                if (!StringsKt.startsWith$default(className, "com.facebook.appevents.codeless", false, 2, (Object) null)) {
                    String className2 = element.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className2, "element.className");
                    if (!StringsKt.startsWith$default(className2, "com.facebook.appevents.suggestedevents", false, 2, (Object) null)) {
                        return true;
                    }
                }
                String methodName = element.getMethodName();
                Intrinsics.checkNotNullExpressionValue(methodName, "element.methodName");
                if (StringsKt.startsWith$default(methodName, "onClick", false, 2, (Object) null)) {
                    continue;
                } else {
                    String methodName2 = element.getMethodName();
                    Intrinsics.checkNotNullExpressionValue(methodName2, "element.methodName");
                    if (StringsKt.startsWith$default(methodName2, "onItemClick", false, 2, (Object) null)) {
                        continue;
                    } else {
                        String methodName3 = element.getMethodName();
                        Intrinsics.checkNotNullExpressionValue(methodName3, "element.methodName");
                        if (!StringsKt.startsWith$default(methodName3, "onTouch", false, 2, (Object) null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final File[] listAnrReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] listFiles = instrumentReportDir.listFiles(new FilenameFilter() { // from class: com.facebook.internal.instrument.InstrumentUtility$$ExternalSyntheticLambda1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean listAnrReportFiles$lambda$1;
                listAnrReportFiles$lambda$1 = InstrumentUtility.listAnrReportFiles$lambda$1(file, str);
                return listAnrReportFiles$lambda$1;
            }
        });
        File[] fileArr = listFiles;
        if (listFiles == null) {
            fileArr = new File[0];
        }
        return fileArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listAnrReportFiles$lambda$1(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return new Regex(format).matches(name);
    }

    public static final File[] listExceptionAnalysisReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] listFiles = instrumentReportDir.listFiles(new FilenameFilter() { // from class: com.facebook.internal.instrument.InstrumentUtility$$ExternalSyntheticLambda2
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean listExceptionAnalysisReportFiles$lambda$2;
                listExceptionAnalysisReportFiles$lambda$2 = InstrumentUtility.listExceptionAnalysisReportFiles$lambda$2(file, str);
                return listExceptionAnalysisReportFiles$lambda$2;
            }
        });
        File[] fileArr = listFiles;
        if (listFiles == null) {
            fileArr = new File[0];
        }
        return fileArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listExceptionAnalysisReportFiles$lambda$2(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return new Regex(format).matches(name);
    }

    public static final File[] listExceptionReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] listFiles = instrumentReportDir.listFiles(new FilenameFilter() { // from class: com.facebook.internal.instrument.InstrumentUtility$$ExternalSyntheticLambda0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean listExceptionReportFiles$lambda$3;
                listExceptionReportFiles$lambda$3 = InstrumentUtility.listExceptionReportFiles$lambda$3(file, str);
                return listExceptionReportFiles$lambda$3;
            }
        });
        File[] fileArr = listFiles;
        if (listFiles == null) {
            fileArr = new File[0];
        }
        return fileArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listExceptionReportFiles$lambda$3(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return new Regex(format).matches(name);
    }

    public static final JSONObject readFile(String str, boolean z) {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null || str == null) {
            return null;
        }
        try {
            return new JSONObject(Utility.readStreamToString(new FileInputStream(new File(instrumentReportDir, str))));
        } catch (Exception e) {
            if (!z) {
                return null;
            }
            deleteFile(str);
            return null;
        }
    }

    public static final void sendReports(String str, JSONArray reports, GraphRequest.Callback callback) {
        Intrinsics.checkNotNullParameter(reports, "reports");
        if (reports.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, reports.toString());
            JSONObject dataProcessingOptions = Utility.getDataProcessingOptions();
            if (dataProcessingOptions != null) {
                Iterator<String> keys = dataProcessingOptions.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, dataProcessingOptions.get(next));
                }
            }
            GraphRequest.Companion companion = GraphRequest.Companion;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            companion.newPostRequest((AccessToken) null, format, jSONObject, callback).executeAsync();
        } catch (JSONException e) {
        }
    }

    public static final void writeFile(String str, String str2) {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(instrumentReportDir, str));
            byte[] bytes = str2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception e) {
        }
    }
}
