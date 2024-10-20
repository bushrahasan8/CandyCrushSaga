package kotlin.io;

import java.io.File;
import java.io.IOException;

/* loaded from: FileSystemException.class */
public class FileSystemException extends IOException {
    private final File file;
    private final File other;
    private final String reason;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FileSystemException(java.io.File r6, java.io.File r7, java.lang.String r8) {
        /*
            r5 = this;
            r0 = r6
            java.lang.String r1 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            java.lang.String r1 = kotlin.io.ExceptionsKt.access$constructMessage(r1, r2, r3)
            r0.<init>(r1)
            r0 = r5
            r1 = r6
            r0.file = r1
            r0 = r5
            r1 = r7
            r0.other = r1
            r0 = r5
            r1 = r8
            r0.reason = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FileSystemException.<init>(java.io.File, java.io.File, java.lang.String):void");
    }
}
