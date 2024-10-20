package androidx.core.app;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: RemoteInput.class */
public abstract class RemoteInput {

    /* loaded from: RemoteInput$Api20Impl.class */
    public static abstract class Api20Impl {
        static void addResultsToIntent(Object obj, Intent intent, Bundle bundle) {
            android.app.RemoteInput.addResultsToIntent((android.app.RemoteInput[]) obj, intent, bundle);
        }

        public static android.app.RemoteInput fromCompat(RemoteInput remoteInput) {
            throw null;
        }

        static Bundle getResultsFromIntent(Intent intent) {
            return android.app.RemoteInput.getResultsFromIntent(intent);
        }
    }

    static android.app.RemoteInput fromCompat(RemoteInput remoteInput) {
        return Api20Impl.fromCompat(remoteInput);
    }

    public static android.app.RemoteInput[] fromCompat(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[remoteInputArr.length];
        for (int i = 0; i < remoteInputArr.length; i++) {
            RemoteInput remoteInput = remoteInputArr[i];
            remoteInputArr2[i] = fromCompat((RemoteInput) null);
        }
        return remoteInputArr2;
    }
}
