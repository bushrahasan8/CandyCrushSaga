package okhttp3.internal.cache;

import okio.Sink;

/* loaded from: CacheRequest.class */
public interface CacheRequest {
    void abort();

    Sink body();
}
