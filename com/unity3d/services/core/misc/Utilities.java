package com.unity3d.services.core.misc;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.t2;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.log.DeviceLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.JvmClassMappingKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Utilities.class */
public class Utilities {
    public static String Sha256(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return toHexString(messageDigest.digest());
                }
                messageDigest.update(bArr, 0, read);
            }
        } catch (NoSuchAlgorithmException e) {
            DeviceLog.exception("SHA-256 algorithm not found", e);
            return null;
        }
    }

    public static String Sha256(String str) {
        return Sha256(str.getBytes());
    }

    public static String Sha256(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr, 0, bArr.length);
            return toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            DeviceLog.exception("SHA-256 algorithm not found", e);
            return null;
        }
    }

    public static Map<String, Object> combineJsonIntoMap(Map<String, Object> map, JSONObject jSONObject) {
        return combineJsonIntoMap(map, jSONObject, "");
    }

    public static Map<String, Object> combineJsonIntoMap(Map<String, Object> map, JSONObject jSONObject, String str) {
        HashMap hashMap = new HashMap(map);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(str + next, jSONObject.opt(next));
        }
        return hashMap;
    }

    public static Map<String, Object> convertJsonToMap(JSONObject jSONObject) {
        return combineJsonIntoMap(new HashMap(), jSONObject);
    }

    public static <T> T getService(Class cls) {
        return (T) getService("", cls);
    }

    public static <T> T getService(String str, Class cls) {
        return (T) ServiceProvider.INSTANCE.getRegistry().getService(str, JvmClassMappingKt.getKotlinClass(cls));
    }

    public static JSONObject mergeJsonObjects(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject == null) {
            return jSONObject2;
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject3.put(next, jSONObject2.get(next));
        }
        Iterator<String> keys2 = jSONObject.keys();
        while (keys2.hasNext()) {
            String next2 = keys2.next();
            if (jSONObject3.has(next2) && (jSONObject3.get(next2) instanceof JSONObject) && (jSONObject.get(next2) instanceof JSONObject)) {
                jSONObject3.put(next2, mergeJsonObjects(jSONObject.getJSONObject(next2), jSONObject3.getJSONObject(next2)));
            } else {
                jSONObject3.put(next2, jSONObject.get(next2));
            }
        }
        return jSONObject3;
    }

    public static byte[] readFileBytes(File file) throws IOException {
        FileInputStream fileInputStream;
        Path path;
        byte[] readAllBytes;
        if (file == null || !file.exists()) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            path = file.toPath();
            readAllBytes = Files.readAllBytes(path);
            return readAllBytes;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                int length = (int) file.length();
                byte[] bArr = new byte[length];
                if (fileInputStream.read(bArr) == length) {
                    fileInputStream.close();
                    return bArr;
                }
                throw new IOException("Failed to read all bytes from input file path: " + file.getPath());
            } catch (Throwable th) {
                th = th;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public static void runOnUiThread(Runnable runnable) {
        runOnUiThread(runnable, 0L);
    }

    public static void runOnUiThread(Runnable runnable, long j) {
        Handler handler = new Handler(Looper.getMainLooper());
        if (j > 0) {
            handler.postDelayed(runnable, j);
        } else {
            handler.post(runnable);
        }
    }

    public static String toHexString(byte[] bArr) {
        String str = "";
        for (byte b : bArr) {
            int i = b & 255;
            String str2 = str;
            if (i <= 15) {
                str2 = str + t2.h;
            }
            str = str2 + Integer.toHexString(i);
        }
        return str;
    }

    public static void wrapCustomerListener(Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e) {
            DeviceLog.error("An uncaught exception has occurred in the client application.  Exception: %s", e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean writeFile(java.io.File r3, java.lang.String r4) {
        /*
            r0 = 0
            r6 = r0
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 0
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r10
            r7 = r0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5c
            r8 = r0
            r0 = r10
            r7 = r0
            r0 = r8
            r1 = r3
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5c
            r0 = r8
            r1 = r4
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L4c
            r0.write(r1)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L4c
            r0 = r8
            r0.flush()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L4c
            r0 = r8
            r0.close()     // Catch: java.lang.Exception -> L37
            goto L3f
        L37:
            r4 = move-exception
            java.lang.String r0 = "Error closing FileOutputStream"
            r1 = r4
            com.unity3d.services.core.log.DeviceLog.exception(r0, r1)
        L3f:
            r0 = 1
            r5 = r0
            goto L85
        L44:
            r3 = move-exception
            r0 = r8
            r7 = r0
            goto Lab
        L4c:
            r7 = move-exception
            r0 = r8
            r4 = r0
            r0 = r7
            r8 = r0
            goto L61
        L58:
            r3 = move-exception
            goto Lab
        L5c:
            r8 = move-exception
            r0 = r9
            r4 = r0
        L61:
            r0 = r4
            r7 = r0
            java.lang.String r0 = "Could not write file"
            r1 = r8
            com.unity3d.services.core.log.DeviceLog.exception(r0, r1)     // Catch: java.lang.Throwable -> L58
            r0 = r6
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L85
            r0 = r4
            r0.close()     // Catch: java.lang.Exception -> L7b
            r0 = r6
            r5 = r0
            goto L85
        L7b:
            r4 = move-exception
            java.lang.String r0 = "Error closing FileOutputStream"
            r1 = r4
            com.unity3d.services.core.log.DeviceLog.exception(r0, r1)
            r0 = r6
            r5 = r0
        L85:
            r0 = r5
            if (r0 == 0) goto La9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            java.lang.String r1 = "Wrote file: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.String r0 = r0.toString()
            com.unity3d.services.core.log.DeviceLog.debug(r0)
        La9:
            r0 = r5
            return r0
        Lab:
            r0 = r7
            if (r0 == 0) goto Lc0
            r0 = r7
            r0.close()     // Catch: java.lang.Exception -> Lb8
            goto Lc0
        Lb8:
            r4 = move-exception
            java.lang.String r0 = "Error closing FileOutputStream"
            r1 = r4
            com.unity3d.services.core.log.DeviceLog.exception(r0, r1)
        Lc0:
            r0 = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.misc.Utilities.writeFile(java.io.File, java.lang.String):boolean");
    }
}
