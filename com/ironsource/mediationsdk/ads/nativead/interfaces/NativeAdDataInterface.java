package com.ironsource.mediationsdk.ads.nativead.interfaces;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: NativeAdDataInterface.class */
public interface NativeAdDataInterface {

    /* loaded from: NativeAdDataInterface$Image.class */
    public static final class Image {
        private final Drawable a;
        private final Uri b;

        public Image(Drawable drawable, Uri uri) {
            this.a = drawable;
            this.b = uri;
        }

        public final Drawable getDrawable() {
            return this.a;
        }

        public final Uri getUri() {
            return this.b;
        }
    }

    String getAdvertiser();

    String getBody();

    String getCallToAction();

    Image getIcon();

    String getTitle();
}
