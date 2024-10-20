package com.vungle.ads;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.vungle.ads.internal.util.ThreadUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: NativeAd$displayImage$1.class */
final class NativeAd$displayImage$1 extends Lambda implements Function1 {
    final ImageView $imageView;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAd$displayImage$1(ImageView imageView) {
        super(1);
        this.$imageView = imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m6716invoke$lambda0(ImageView imageView, Bitmap it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        imageView.setImageBitmap(it);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Bitmap) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(final Bitmap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final ImageView imageView = this.$imageView;
        if (imageView != null) {
            ThreadUtil.INSTANCE.runOnUiThread(new Runnable(imageView, it) { // from class: com.vungle.ads.NativeAd$displayImage$1$$ExternalSyntheticLambda0
                public final ImageView f$0;
                public final Bitmap f$1;

                {
                    this.f$0 = imageView;
                    this.f$1 = it;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    NativeAd$displayImage$1.m6716invoke$lambda0(this.f$0, this.f$1);
                }
            });
        }
    }
}
