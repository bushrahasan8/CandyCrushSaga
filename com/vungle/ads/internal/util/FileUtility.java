package com.vungle.ads.internal.util;

import android.os.Build;
import android.util.Log;
import android.webkit.URLUtil;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: FileUtility.class */
public final class FileUtility {
    public static final FileUtility INSTANCE = new FileUtility();
    private static ObjectInputStreamProvider objectInputStreamProvider = new ObjectInputStreamProvider() { // from class: com.vungle.ads.internal.util.FileUtility$$ExternalSyntheticLambda1
        @Override // com.vungle.ads.internal.util.FileUtility.ObjectInputStreamProvider
        public final ObjectInputStream provideObjectInputStream(InputStream inputStream) {
            ObjectInputStream m6946objectInputStreamProvider$lambda0;
            m6946objectInputStreamProvider$lambda0 = FileUtility.m6946objectInputStreamProvider$lambda0(inputStream);
            return m6946objectInputStreamProvider$lambda0;
        }
    };
    private static final String TAG = FileUtility.class.getSimpleName();
    private static final List<Class<?>> allowedClasses = CollectionsKt.listOf((Object[]) new Class[]{LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class});

    /* loaded from: FileUtility$ObjectInputStreamProvider.class */
    public interface ObjectInputStreamProvider {
        ObjectInputStream provideObjectInputStream(InputStream inputStream) throws IOException, ClassNotFoundException;
    }

    private FileUtility() {
    }

    public static final void delete(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            deleteContents(file);
        }
        if (file.delete()) {
            return;
        }
        Log.d(TAG, "Failed to delete file: " + file);
    }

    public static final void deleteAndLogIfFailed(File file) {
        Path path;
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                path = file.toPath();
                Files.delete(path);
            } else if (!file.delete()) {
                Log.e(TAG, "Cannot delete " + file.getName());
            }
        } catch (IOException e) {
            Log.e(TAG, "Cannot delete " + file.getName(), e);
        }
    }

    public static final void deleteContents(File folder) {
        Intrinsics.checkNotNullParameter(folder, "folder");
        File[] listFiles = folder.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            delete(file);
        }
    }

    public static /* synthetic */ void getAllowedClasses$vungle_ads_release$annotations() {
    }

    private final String getIndentString(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("|  ");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: objectInputStreamProvider$lambda-0, reason: not valid java name */
    public static final ObjectInputStream m6946objectInputStreamProvider$lambda0(InputStream inputStream) {
        return new SafeObjectInputStream(inputStream, allowedClasses);
    }

    public static final void printDirectoryTree(File file) {
    }

    private final void printDirectoryTree(File file, int i, StringBuilder sb) {
        if (file == null) {
            return;
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("folder is not a Directory".toString());
        }
        sb.append(getIndentString(i));
        sb.append("+--");
        sb.append(file.getName());
        sb.append("/\n");
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                printDirectoryTree(file2, i + 1, sb);
            } else {
                Intrinsics.checkNotNullExpressionValue(file2, "file");
                printFile(file2, i + 1, sb);
            }
        }
    }

    private final void printFile(File file, int i, StringBuilder sb) {
        sb.append(getIndentString(i));
        sb.append("+--");
        sb.append(file.getName());
        sb.append('\n');
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException
        */
    /* JADX WARN: Failed to calculate best type for var: r0v7 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0049: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:57:0x0047 */
    public static final <T> T readSerializable(java.io.File r4) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.util.FileUtility.readSerializable(java.io.File):java.lang.Object");
    }

    public static final void writeSerializable(File file, Serializable serializable) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2;
        Intrinsics.checkNotNullParameter(file, "file");
        if (file.exists()) {
            deleteAndLogIfFailed(file);
        }
        if (serializable == null) {
            return;
        }
        ObjectOutputStream objectOutputStream3 = null;
        try {
            fileOutputStream2 = new FileOutputStream(file);
            objectOutputStream3 = null;
            fileOutputStream = fileOutputStream2;
            try {
                try {
                    objectOutputStream2 = new ObjectOutputStream(fileOutputStream2);
                } catch (IOException e) {
                    e = e;
                    objectOutputStream = null;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = null;
            objectOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            objectOutputStream2.writeObject(serializable);
            objectOutputStream2.reset();
            FileUtility fileUtility = INSTANCE;
            fileUtility.closeQuietly(objectOutputStream2);
            fileUtility.closeQuietly(fileOutputStream2);
        } catch (IOException e3) {
            objectOutputStream = objectOutputStream2;
            e = e3;
            objectOutputStream3 = objectOutputStream;
            fileOutputStream = fileOutputStream2;
            Log.e(TAG, "IOIOException", e);
            FileUtility fileUtility2 = INSTANCE;
            fileUtility2.closeQuietly(objectOutputStream);
            fileUtility2.closeQuietly(fileOutputStream2);
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream3 = objectOutputStream2;
            fileOutputStream = fileOutputStream2;
            FileUtility fileUtility3 = INSTANCE;
            fileUtility3.closeQuietly(objectOutputStream3);
            fileUtility3.closeQuietly(fileOutputStream);
            throw th;
        }
    }

    public final void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    public final List<Class<?>> getAllowedClasses$vungle_ads_release() {
        return allowedClasses;
    }

    public final ObjectInputStreamProvider getObjectInputStreamProvider() {
        return objectInputStreamProvider;
    }

    public final String guessFileName(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        String guessFileName = URLUtil.guessFileName(url, null, str);
        Intrinsics.checkNotNullExpressionValue(guessFileName, "guessFileName(url, null, ext)");
        return guessFileName;
    }

    public final boolean isValidUrl(String str) {
        return (str == null || str.length() == 0 || HttpUrl.Companion.parse(str) == null) ? false : true;
    }

    public final void setObjectInputStreamProvider(ObjectInputStreamProvider objectInputStreamProvider2) {
        Intrinsics.checkNotNullParameter(objectInputStreamProvider2, "<set-?>");
        objectInputStreamProvider = objectInputStreamProvider2;
    }

    public final long size(File file) {
        long j = 0;
        long j2 = 0;
        if (file != null) {
            if (!file.exists()) {
                j2 = 0;
            } else {
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    long j3 = 0;
                    if (listFiles != null) {
                        j3 = 0;
                        if (!(listFiles.length == 0)) {
                            int length = listFiles.length;
                            int i = 0;
                            while (true) {
                                j3 = j;
                                if (i >= length) {
                                    break;
                                }
                                j += size(listFiles[i]);
                                i++;
                            }
                        }
                    }
                    return j3;
                }
                j2 = file.length();
            }
        }
        return j2;
    }
}
