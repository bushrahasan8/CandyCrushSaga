package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* loaded from: ViewOverlayApi18.class */
class ViewOverlayApi18 implements ViewOverlayImpl {
    private final ViewOverlay mViewOverlay;

    public ViewOverlayApi18(View view) {
        this.mViewOverlay = view.getOverlay();
    }

    @Override // androidx.transition.ViewOverlayImpl
    public void add(Drawable drawable) {
        this.mViewOverlay.add(drawable);
    }

    @Override // androidx.transition.ViewOverlayImpl
    public void remove(Drawable drawable) {
        this.mViewOverlay.remove(drawable);
    }
}
