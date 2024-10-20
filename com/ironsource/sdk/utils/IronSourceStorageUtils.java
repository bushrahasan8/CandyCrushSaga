package com.ironsource.sdk.utils;

import android.content.Context;
import android.os.Build;
import com.ironsource.b6;
import com.ironsource.ca;
import com.ironsource.o7;
import com.ironsource.t2;
import com.ironsource.wc;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: IronSourceStorageUtils.class */
public class IronSourceStorageUtils {
    private static wc b;
    private static boolean c = false;

    private static void a(Context context) {
        wc wcVar = b;
        if (wcVar != null && wcVar.b()) {
            deleteCacheDirectories(context);
        }
        wc wcVar2 = b;
        if (wcVar2 == null || !wcVar2.c()) {
            return;
        }
        deleteFilesDirectories(context);
    }

    private static void a(File file) {
        if (file != null) {
            deleteFolder(b(file).getPath());
        }
    }

    private static boolean a() {
        wc wcVar = b;
        return (wcVar != null && wcVar.a()) || Build.VERSION.SDK_INT > 28;
    }

    private static File b(Context context) {
        b6 c2 = ca.h().c();
        wc wcVar = b;
        return (wcVar == null || !wcVar.d()) ? c2.t(context) : c2.e(context);
    }

    private static File b(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("supersonicads");
        sb.append(str);
        return new File(sb.toString());
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + File.separator + str2;
    }

    public static JSONObject buildFilesMap(String str, String str2) {
        Object c2;
        String name;
        File file = new File(str, str2);
        JSONObject jSONObject = new JSONObject();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                try {
                    c2 = c(file2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (c2 instanceof JSONArray) {
                    name = "files";
                } else if (c2 instanceof JSONObject) {
                    name = file2.getName();
                }
                jSONObject.put(name, c(file2));
            }
        }
        return jSONObject;
    }

    public static JSONObject buildFilesMapOfDirectory(o7 o7Var, JSONObject jSONObject) throws Exception {
        String name;
        JSONObject buildFilesMapOfDirectory;
        if (o7Var == null || !o7Var.isDirectory()) {
            return new JSONObject();
        }
        File[] listFiles = o7Var.listFiles();
        if (listFiles == null) {
            return new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        for (File file : listFiles) {
            o7 o7Var2 = new o7(file.getPath());
            if (o7Var2.isFile()) {
                String name2 = o7Var2.getName();
                JSONObject a = o7Var2.a();
                name = name2;
                buildFilesMapOfDirectory = a;
                if (jSONObject.has(name2)) {
                    buildFilesMapOfDirectory = SDKUtils.mergeJSONObjects(a, jSONObject.getJSONObject(name2));
                    name = name2;
                }
            } else if (o7Var2.isDirectory()) {
                name = o7Var2.getName();
                buildFilesMapOfDirectory = buildFilesMapOfDirectory(o7Var2, jSONObject);
            }
            jSONObject2.put(name, buildFilesMapOfDirectory);
        }
        return jSONObject2;
    }

    private static File c(Context context) {
        b6 c2 = ca.h().c();
        wc wcVar = b;
        return (wcVar == null || !wcVar.d()) ? c2.v(context) : c2.k(context);
    }

    private static Object c(File file) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (file.isFile()) {
            jSONArray.put(file.getName());
            return jSONArray;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                jSONObject.put(file2.getName(), c(file2));
            } else {
                jSONArray.put(file2.getName());
                jSONObject.put("files", jSONArray);
            }
        }
        return jSONObject;
    }

    public static void deleteCacheDirectories(Context context) {
        b6 c2 = ca.h().c();
        a(c2.e(context));
        a(c2.k(context));
    }

    public static boolean deleteFile(o7 o7Var) {
        synchronized (IronSourceStorageUtils.class) {
            try {
                if (!o7Var.exists()) {
                    return false;
                }
                return o7Var.delete();
            } finally {
            }
        }
    }

    public static void deleteFilesDirectories(Context context) {
        b6 c2 = ca.h().c();
        a(c2.t(context));
        a(c2.v(context));
    }

    public static boolean deleteFolder(String str) {
        boolean z;
        synchronized (IronSourceStorageUtils.class) {
            try {
                File file = new File(str);
                if (deleteFolderContentRecursive(file)) {
                    if (file.delete()) {
                        z = true;
                    }
                }
                z = false;
            } finally {
            }
        }
        return z;
    }

    public static boolean deleteFolderContentRecursive(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        boolean z2 = true;
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (true) {
                z = z2;
                if (i >= length) {
                    break;
                }
                File file2 = listFiles[i];
                boolean z3 = z2;
                if (file2.isDirectory()) {
                    z3 = z2 & deleteFolderContentRecursive(file2);
                }
                z2 = z3;
                if (!file2.delete()) {
                    z2 = false;
                }
                i++;
            }
        }
        return z;
    }

    public static void ensurePathSafety(File file, String str) throws Exception {
        wc wcVar = b;
        if (wcVar == null || !wcVar.e()) {
            String canonicalPath = new File(str).getCanonicalPath();
            String canonicalPath2 = file.getCanonicalPath();
            if (canonicalPath2.startsWith(canonicalPath)) {
                return;
            }
            throw new Exception(t2.c.w + canonicalPath2);
        }
    }

    public static String getCachedFilesMap(String str, String str2) {
        JSONObject buildFilesMap = buildFilesMap(str, str2);
        try {
            buildFilesMap.put("path", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return buildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        File b2;
        if (!a() || !SDKUtils.isExternalStorageAvailable() || (b2 = b(context)) == null || !b2.canWrite()) {
            return c(context).getPath();
        }
        c = true;
        return b2.getPath();
    }

    public static ArrayList<o7> getFilesInFolderRecursive(o7 o7Var) {
        if (o7Var == null || !o7Var.isDirectory()) {
            return new ArrayList<>();
        }
        ArrayList<o7> arrayList = new ArrayList<>();
        File[] listFiles = o7Var.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                o7 o7Var2 = new o7(file.getPath());
                if (o7Var2.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(o7Var2));
                }
                if (o7Var2.isFile()) {
                    arrayList.add(o7Var2);
                }
            }
        }
        return arrayList;
    }

    public static String getNetworkStorageDir(Context context) {
        File b2 = b(new File(getDiskCacheDirPath(context)));
        if (!b2.exists()) {
            b2.mkdir();
        }
        return b2.getPath();
    }

    public static long getTotalSizeOfDir(o7 o7Var) {
        long j;
        long totalSizeOfDir;
        long j2 = 0;
        long j3 = 0;
        if (o7Var != null) {
            if (o7Var.isDirectory()) {
                File[] listFiles = o7Var.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i = 0;
                    while (true) {
                        j3 = j2;
                        if (i >= length) {
                            break;
                        }
                        o7 o7Var2 = new o7(listFiles[i].getPath());
                        if (o7Var2.isFile()) {
                            totalSizeOfDir = o7Var2.length();
                        } else {
                            j = j2;
                            if (o7Var2.isDirectory()) {
                                totalSizeOfDir = getTotalSizeOfDir(o7Var2);
                            } else {
                                i++;
                                j2 = j;
                            }
                        }
                        j = j2 + totalSizeOfDir;
                        i++;
                        j2 = j;
                    }
                } else {
                    return 0L;
                }
            } else {
                j3 = 0;
            }
        }
        return j3;
    }

    public static void initializeCacheDirectory(Context context, wc wcVar) {
        b = wcVar;
        a(context);
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static boolean isUxt() {
        return c;
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static String readFile(o7 o7Var) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(o7Var));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(readLine);
            sb.append('\n');
        }
    }

    public static boolean renameFile(String str, String str2) throws Exception {
        return new File(str).renameTo(new File(str2));
    }

    public static int saveFile(byte[] bArr, String str) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[102400];
            int i = 0;
            while (true) {
                int i2 = i;
                int read = byteArrayInputStream.read(bArr2);
                if (read == -1) {
                    return i2;
                }
                fileOutputStream.write(bArr2, 0, read);
                i = i2 + read;
            }
        } finally {
            fileOutputStream.close();
            byteArrayInputStream.close();
        }
    }
}
