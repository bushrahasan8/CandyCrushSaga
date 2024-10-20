package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* loaded from: ForegroundUpdater.class */
public interface ForegroundUpdater {
    ListenableFuture setForegroundAsync(Context context, UUID uuid, ForegroundInfo foregroundInfo);
}
