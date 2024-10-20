package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: MediaView.class */
public final class MediaView extends RelativeLayout {
    private ImageView imageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    private final void initView(Context context) {
        this.imageView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        ImageView imageView = this.imageView;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView2 = null;
        }
        imageView2.setLayoutParams(layoutParams);
        ImageView imageView3 = this.imageView;
        ImageView imageView4 = imageView3;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView4 = null;
        }
        imageView4.setAdjustViewBounds(true);
        ImageView imageView5 = this.imageView;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView5 = null;
        }
        addView(imageView5);
        requestLayout();
    }

    public final void destroy() {
        ImageView imageView = this.imageView;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView2 = null;
        }
        imageView2.setImageDrawable(null);
        ImageView imageView3 = this.imageView;
        ImageView imageView4 = imageView3;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView4 = null;
        }
        if (imageView4.getParent() != null) {
            ImageView imageView5 = this.imageView;
            ImageView imageView6 = imageView5;
            if (imageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
                imageView6 = null;
            }
            ViewParent parent = imageView6.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            ImageView imageView7 = this.imageView;
            if (imageView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
                imageView7 = null;
            }
            viewGroup.removeView(imageView7);
        }
    }

    public final ImageView getMainImage$vungle_ads_release() {
        ImageView imageView = this.imageView;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView2 = null;
        }
        return imageView2;
    }
}
