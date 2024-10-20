package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;

/* loaded from: ImageOutput.class */
public interface ImageOutput {
    public static final ImageOutput NO_OP = new ImageOutput() { // from class: androidx.media3.exoplayer.image.ImageOutput.1
        AnonymousClass1() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void onDisabled() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void onImageAvailable(long j, Bitmap bitmap) {
        }
    };

    /* renamed from: androidx.media3.exoplayer.image.ImageOutput$1 */
    /* loaded from: ImageOutput$1.class */
    class AnonymousClass1 implements ImageOutput {
        AnonymousClass1() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void onDisabled() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void onImageAvailable(long j, Bitmap bitmap) {
        }
    }

    void onDisabled();

    void onImageAvailable(long j, Bitmap bitmap);
}
