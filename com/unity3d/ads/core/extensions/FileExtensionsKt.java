package com.unity3d.ads.core.extensions;

import java.io.File;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: FileExtensionsKt.class */
public final class FileExtensionsKt {
    public static final long getDirectorySize(File file) {
        File[] listFiles;
        Intrinsics.checkNotNullParameter(file, "<this>");
        long j = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        while (!linkedList.isEmpty()) {
            int i = 0;
            File file2 = (File) linkedList.remove(0);
            if (file2.exists() && (listFiles = file2.listFiles()) != null && listFiles.length != 0) {
                int length = listFiles.length;
                long j2 = j;
                while (true) {
                    j = j2;
                    if (i < length) {
                        File child = listFiles[i];
                        if (child.isDirectory()) {
                            Intrinsics.checkNotNullExpressionValue(child, "child");
                            linkedList.add(child);
                        } else {
                            j2 += child.length();
                        }
                        i++;
                    }
                }
            }
        }
        return j;
    }
}
