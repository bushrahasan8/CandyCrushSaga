package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.Okio;
import okio.Okio__JvmOkioKt;
import okio.Sink;
import okio.Source;

/* loaded from: FileSystem.class */
public interface FileSystem {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    /* loaded from: FileSystem$Companion.class */
    public static final class Companion {
        static final Companion $$INSTANCE = new Companion();

        /* loaded from: FileSystem$Companion$SystemFileSystem.class */
        private static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            public Sink appendingSink(File file) {
                Sink appendingSink;
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    appendingSink = Okio.appendingSink(file);
                } catch (FileNotFoundException e) {
                    file.getParentFile().mkdirs();
                    appendingSink = Okio.appendingSink(file);
                }
                return appendingSink;
            }

            @Override // okhttp3.internal.io.FileSystem
            public void delete(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException(Intrinsics.stringPlus("failed to delete ", file));
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void deleteContents(File directory) {
                Intrinsics.checkNotNullParameter(directory, "directory");
                File[] listFiles = directory.listFiles();
                if (listFiles == null) {
                    throw new IOException(Intrinsics.stringPlus("not a readable directory: ", directory));
                }
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file = listFiles[i];
                    i++;
                    if (file.isDirectory()) {
                        Intrinsics.checkNotNullExpressionValue(file, "file");
                        deleteContents(file);
                    }
                    if (!file.delete()) {
                        throw new IOException(Intrinsics.stringPlus("failed to delete ", file));
                    }
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean exists(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public void rename(File from, File to) {
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to, "to");
                delete(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // okhttp3.internal.io.FileSystem
            public Sink sink(File file) {
                Sink sink$default;
                Sink sink;
                Sink sink$default2;
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    sink$default2 = Okio__JvmOkioKt.sink$default(file, false, 1, null);
                    sink = sink$default2;
                } catch (FileNotFoundException e) {
                    file.getParentFile().mkdirs();
                    sink$default = Okio__JvmOkioKt.sink$default(file, false, 1, null);
                    sink = sink$default;
                }
                return sink;
            }

            @Override // okhttp3.internal.io.FileSystem
            public long size(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            public Source source(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return Okio.source(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    Sink appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    Sink sink(File file);

    long size(File file);

    Source source(File file);
}
