package kotlin.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: FilesKt__UtilsKt.class */
public abstract class FilesKt__UtilsKt extends FilesKt__FileTreeWalkKt {
    public static final File copyTo(File file, File target, boolean z, int i) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z) {
                throw new FileAlreadyExistsException(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (!file.isDirectory()) {
            File parentFile = target.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(target);
                try {
                    ByteStreamsKt.copyTo(fileInputStream, fileOutputStream, i);
                    CloseableKt.closeFinally(fileOutputStream, null);
                    CloseableKt.closeFinally(fileInputStream, null);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(fileInputStream, th);
                    throw th2;
                }
            }
        } else if (!target.mkdirs()) {
            throw new FileSystemException(file, target, "Failed to create target directory.");
        }
        return target;
    }

    public static /* synthetic */ File copyTo$default(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return copyTo(file, file2, z, i);
    }

    public static boolean deleteRecursively(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Iterator it = FilesKt__FileTreeWalkKt.walkBottomUp(file).iterator();
        while (true) {
            boolean z = true;
            while (true) {
                boolean z2 = z;
                if (!it.hasNext()) {
                    return z2;
                }
                File file2 = (File) it.next();
                if ((file2.delete() || !file2.exists()) && z2) {
                    break;
                }
                z = false;
            }
        }
    }

    public static final File resolve(File file, File relative) {
        File file2;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        if (FilesKt__FilePathComponentsKt.isRooted(relative)) {
            return relative;
        }
        String file3 = file.toString();
        Intrinsics.checkNotNullExpressionValue(file3, "this.toString()");
        if (file3.length() != 0) {
            char c = File.separatorChar;
            if (!StringsKt.endsWith$default((CharSequence) file3, c, false, 2, (Object) null)) {
                file2 = new File(file3 + c + relative);
                return file2;
            }
        }
        file2 = new File(file3 + relative);
        return file2;
    }

    public static File resolve(File file, String relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        return resolve(file, new File(relative));
    }
}
