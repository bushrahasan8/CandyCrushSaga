package androidx.media3.exoplayer.source;

import android.net.Uri;

/* loaded from: ExternalLoader.class */
public interface ExternalLoader {

    /* loaded from: ExternalLoader$LoadRequest.class */
    public static final class LoadRequest {
        public final Uri uri;

        public LoadRequest(Uri uri) {
            this.uri = uri;
        }
    }
}
