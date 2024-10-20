package com.facebook.internal;

import java.io.File;
import java.util.UUID;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: NativeAppCallAttachmentStore.class */
public final class NativeAppCallAttachmentStore {
    public static final NativeAppCallAttachmentStore INSTANCE = new NativeAppCallAttachmentStore();
    private static final String TAG = NativeAppCallAttachmentStore.class.getName();
    private static File attachmentsDirectory;

    private NativeAppCallAttachmentStore() {
    }

    public static final void cleanupAttachmentsForCall(UUID callId) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        File attachmentsDirectoryForCall = getAttachmentsDirectoryForCall(callId, false);
        if (attachmentsDirectoryForCall != null) {
            FilesKt.deleteRecursively(attachmentsDirectoryForCall);
        }
    }

    public static final File getAttachmentsDirectoryForCall(UUID callId, boolean z) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        if (attachmentsDirectory == null) {
            return null;
        }
        File file = new File(attachmentsDirectory, callId.toString());
        if (z && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
