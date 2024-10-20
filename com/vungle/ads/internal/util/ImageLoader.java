package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.util.LruCache;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: ImageLoader.class */
public final class ImageLoader {
    private static final String FILE_SCHEME = "file://";
    private Executor ioExecutor;
    private final LruCache<String, Bitmap> lruCache = new LruCache(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8) { // from class: com.vungle.ads.internal.util.ImageLoader.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        public int sizeOf(String str, Bitmap value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.getByteCount() / 1024;
        }
    };
    public static final Companion Companion = new Companion(null);
    private static final String TAG = ImageLoader.class.getSimpleName();
    private static final ImageLoader instance = new ImageLoader();

    /* loaded from: ImageLoader$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ImageLoader getInstance() {
            return ImageLoader.instance;
        }
    }

    private ImageLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: displayImage$lambda-0, reason: not valid java name */
    public static final void m6948displayImage$lambda0(String str, ImageLoader this$0, Function1 onImageLoaded) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onImageLoaded, "$onImageLoaded");
        if (StringsKt.startsWith$default(str, "file://", false, 2, (Object) null)) {
            Bitmap bitmap = this$0.lruCache.get(str);
            if (bitmap != null && !bitmap.isRecycled()) {
                onImageLoaded.invoke(bitmap);
                return;
            }
            String substring = str.substring(7);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            Bitmap decodeFile = BitmapFactory.decodeFile(substring);
            if (decodeFile == null) {
                Log.w(TAG, "decode bitmap failed.");
            } else {
                this$0.lruCache.put(str, decodeFile);
                onImageLoaded.invoke(decodeFile);
            }
        }
    }

    public final void displayImage(final String str, final Function1 onImageLoaded) {
        Intrinsics.checkNotNullParameter(onImageLoaded, "onImageLoaded");
        if (this.ioExecutor == null) {
            Log.w(TAG, "ImageLoader not initialized.");
            return;
        }
        if (str == null || str.length() == 0) {
            Log.w(TAG, "the uri is required.");
            return;
        }
        Executor executor = this.ioExecutor;
        if (executor != null) {
            executor.execute(new Runnable(str, this, onImageLoaded) { // from class: com.vungle.ads.internal.util.ImageLoader$$ExternalSyntheticLambda0
                public final String f$0;
                public final ImageLoader f$1;
                public final Function1 f$2;

                {
                    this.f$0 = str;
                    this.f$1 = this;
                    this.f$2 = onImageLoaded;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.m6948displayImage$lambda0(this.f$0, this.f$1, this.f$2);
                }
            });
        }
    }

    public final void init(Executor ioExecutor) {
        Intrinsics.checkNotNullParameter(ioExecutor, "ioExecutor");
        this.ioExecutor = ioExecutor;
    }
}
