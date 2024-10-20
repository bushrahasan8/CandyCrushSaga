package com.king.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import androidx.annotation.Keep;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Keep
/* loaded from: AndroidCallstackUtils.class */
public class AndroidCallstackUtils {
    private AndroidCallstackUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static String getOsVersionName() {
        return "os_version_android_" + Build.VERSION.SDK_INT;
    }

    public static String getPackageVersionName(Context context) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0)) == null) ? "" : packageInfo.versionName;
        } catch (Exception e) {
            return "";
        }
    }

    public static String[] getThreadsCallstacks() {
        return (String[]) printProcessMap().toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$printProcessMap$0(Thread thread, Thread thread2) {
        int compare = String.CASE_INSENSITIVE_ORDER.compare(thread.getName(), thread2.getName());
        int i = compare;
        if (compare == 0) {
            i = thread.getName().compareTo(thread2.getName());
        }
        return i;
    }

    private static List<String> printProcessMap() {
        boolean z = 3;
        TreeMap treeMap = new TreeMap(new Comparator() { // from class: com.king.core.AndroidCallstackUtils$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$printProcessMap$0;
                lambda$printProcessMap$0 = AndroidCallstackUtils.lambda$printProcessMap$0((Thread) obj, (Thread) obj2);
                return lambda$printProcessMap$0;
            }
        });
        treeMap.putAll(Thread.getAllStackTraces());
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            Thread thread = mainLooper.getThread();
            if (!treeMap.containsKey(thread)) {
                treeMap.put(thread, thread.getStackTrace());
            }
        }
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        for (Map.Entry entry : treeMap.entrySet()) {
            byteArrayOutputStream.reset();
            Thread thread2 = (Thread) entry.getKey();
            String name = thread2.getThreadGroup() == null ? "" : thread2.getThreadGroup().getName();
            String name2 = thread2.getName();
            int priority = thread2.getPriority();
            long id = thread2.getId();
            Thread.State state = thread2.getState();
            Object[] objArr = new Object[5];
            objArr[0] = name2;
            objArr[1] = name;
            objArr[2] = Integer.valueOf(priority);
            objArr[z ? 1 : 0] = Long.valueOf(id);
            objArr[4] = state;
            printStream.printf("[thread='%s' group='%s' prio=%d tid=%d status=%s]", objArr);
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            int length = stackTraceElementArr.length;
            int i = 0;
            boolean z2 = z;
            while (i < length) {
                StackTraceElement stackTraceElement = stackTraceElementArr[i];
                printStream.printf("%n%s.%s(%s:%d)", stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()));
                i++;
                z2 = 3;
            }
            arrayList.add(new String(byteArrayOutputStream.toByteArray()));
            z = z2;
        }
        return arrayList;
    }
}
