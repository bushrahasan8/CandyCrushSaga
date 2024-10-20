package com.google.firebase.installations;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: CrossProcessLock.class */
class CrossProcessLock {
    private final FileChannel channel;
    private final FileLock lock;

    private CrossProcessLock(FileChannel fileChannel, FileLock fileLock) {
        this.channel = fileChannel;
        this.lock = fileLock;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.firebase.installations.CrossProcessLock acquire(android.content.Context r5, java.lang.String r6) {
        /*
            java.io.File r0 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L48 java.lang.Error -> L50 java.io.IOException -> L54
            r7 = r0
            r0 = r7
            r1 = r5
            java.io.File r1 = r1.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L48 java.lang.Error -> L50 java.io.IOException -> L54
            r2 = r6
            r0.<init>(r1, r2)     // Catch: java.nio.channels.OverlappingFileLockException -> L48 java.lang.Error -> L50 java.io.IOException -> L54
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L48 java.lang.Error -> L50 java.io.IOException -> L54
            r5 = r0
            r0 = r5
            r1 = r7
            java.lang.String r2 = "rw"
            r0.<init>(r1, r2)     // Catch: java.nio.channels.OverlappingFileLockException -> L48 java.lang.Error -> L50 java.io.IOException -> L54
            r0 = r5
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L48 java.lang.Error -> L50 java.io.IOException -> L54
            r7 = r0
            r0 = r7
            java.nio.channels.FileLock r0 = r0.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L3a java.lang.Error -> L40 java.io.IOException -> L44
            r6 = r0
            com.google.firebase.installations.CrossProcessLock r0 = new com.google.firebase.installations.CrossProcessLock     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L36 java.nio.channels.OverlappingFileLockException -> L3a java.lang.Error -> L40 java.io.IOException -> L44
            r1 = r0
            r2 = r7
            r3 = r6
            r1.<init>(r2, r3)     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L36
            r5 = r0
            r0 = r5
            return r0
        L2e:
            r5 = move-exception
            goto L58
        L32:
            r5 = move-exception
            goto L58
        L36:
            r5 = move-exception
            goto L58
        L3a:
            r5 = move-exception
        L3b:
            r0 = 0
            r6 = r0
            goto L58
        L40:
            r5 = move-exception
            goto L3b
        L44:
            r5 = move-exception
            goto L3b
        L48:
            r5 = move-exception
        L49:
            r0 = 0
            r7 = r0
            r0 = 0
            r6 = r0
            goto L58
        L50:
            r5 = move-exception
            goto L49
        L54:
            r5 = move-exception
            goto L49
        L58:
            java.lang.String r0 = "CrossProcessLock"
            java.lang.String r1 = "encountered error while creating and acquiring the lock, ignoring"
            r2 = r5
            int r0 = android.util.Log.e(r0, r1, r2)
            r0 = r6
            if (r0 == 0) goto L69
            r0 = r6
            r0.release()     // Catch: java.io.IOException -> L73
        L69:
            r0 = r7
            if (r0 == 0) goto L71
            r0 = r7
            r0.close()     // Catch: java.io.IOException -> L77
        L71:
            r0 = 0
            return r0
        L73:
            r5 = move-exception
            goto L69
        L77:
            r5 = move-exception
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.CrossProcessLock.acquire(android.content.Context, java.lang.String):com.google.firebase.installations.CrossProcessLock");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void releaseAndClose() {
        try {
            this.lock.release();
            this.channel.close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }
}
