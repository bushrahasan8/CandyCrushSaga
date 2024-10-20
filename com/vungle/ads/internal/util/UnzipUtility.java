package com.vungle.ads.internal.util;

import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: UnzipUtility.class */
public final class UnzipUtility {
    private static final int BUFFER_SIZE = 4096;
    public static final UnzipUtility INSTANCE = new UnzipUtility();
    private static final String TAG = UnzipUtility.class.getCanonicalName();

    /* loaded from: UnzipUtility$Filter.class */
    public interface Filter {
        boolean matches(String str);
    }

    /* loaded from: UnzipUtility$ZipSecurityException.class */
    public static final class ZipSecurityException extends IOException {
        public ZipSecurityException(String str) {
            super(str);
        }
    }

    private UnzipUtility() {
    }

    public static /* synthetic */ List unzip$default(UnzipUtility unzipUtility, String str, String str2, Filter filter, int i, Object obj) throws IOException {
        if ((i & 4) != 0) {
            filter = null;
        }
        return unzipUtility.unzip(str, str2, filter);
    }

    private final String validateFilename(String str, String str2) throws IOException {
        String canonicalPath = new File(str).getCanonicalPath();
        String canonicalID = new File(str2).getCanonicalPath();
        Intrinsics.checkNotNullExpressionValue(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullExpressionValue(canonicalID, "canonicalID");
        if (StringsKt.startsWith$default(canonicalPath, canonicalID, false, 2, (Object) null)) {
            return canonicalPath;
        }
        Log.e(TAG, "File is outside extraction target directory.");
        throw new ZipSecurityException("File is outside extraction target directory.");
    }

    public final void extractFile(InputStream zipIn, String str) throws IOException {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        Intrinsics.checkNotNullParameter(zipIn, "zipIn");
        File file = new File(str);
        FileUtility.delete(file);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            fileOutputStream = new FileOutputStream(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = zipIn.read(bArr);
                        if (read == -1) {
                            FileUtility fileUtility = FileUtility.INSTANCE;
                            fileUtility.closeQuietly(zipIn);
                            fileUtility.closeQuietly(bufferedOutputStream);
                            fileUtility.closeQuietly(fileOutputStream);
                            return;
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    th = th;
                    FileUtility fileUtility2 = FileUtility.INSTANCE;
                    fileUtility2.closeQuietly(zipIn);
                    fileUtility2.closeQuietly(bufferedOutputStream);
                    fileUtility2.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            bufferedOutputStream = null;
        }
    }

    public final List<File> unzip(String str, String destDirectory) throws IOException {
        Intrinsics.checkNotNullParameter(destDirectory, "destDirectory");
        return unzip$default(this, str, destDirectory, null, 4, null);
    }

    public final List<File> unzip(String str, String destDirectory, Filter filter) throws IOException {
        ZipFile zipFile;
        ZipFile zipFile2;
        Intrinsics.checkNotNullParameter(destDirectory, "destDirectory");
        if (str == null || str.length() == 0) {
            throw new IOException("Path is empty");
        }
        File file = new File(str);
        if (!file.exists()) {
            throw new IOException("File does not exist");
        }
        File file2 = new File(destDirectory);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        ArrayList arrayList = new ArrayList();
        try {
            zipFile2 = new ZipFile(file);
        } catch (Throwable th) {
            th = th;
            zipFile = null;
        }
        try {
            Enumeration<? extends ZipEntry> entries = zipFile2.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                String str2 = destDirectory + File.separator + nextElement.getName();
                if (filter != null && !filter.matches(str2)) {
                }
                validateFilename(str2, destDirectory);
                if (nextElement.isDirectory()) {
                    File file3 = new File(str2);
                    if (!file3.exists()) {
                        file3.mkdirs();
                    }
                } else {
                    InputStream inputStream = zipFile2.getInputStream(nextElement);
                    Intrinsics.checkNotNullExpressionValue(inputStream, "zipFile.getInputStream(entry)");
                    extractFile(inputStream, str2);
                    arrayList.add(new File(str2));
                }
            }
            try {
                zipFile2.close();
            } catch (IOException e) {
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            zipFile = zipFile2;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e2) {
                }
            }
            throw th;
        }
    }
}
