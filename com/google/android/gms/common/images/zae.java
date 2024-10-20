package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zal;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;

/* loaded from: zae.class */
public final class zae extends zag {
    private final WeakReference zac;

    public zae(ImageView imageView, int i) {
        super(Uri.EMPTY, i);
        Asserts.checkNotNull(imageView);
        this.zac = new WeakReference(imageView);
    }

    public zae(ImageView imageView, Uri uri) {
        super(uri, 0);
        Asserts.checkNotNull(imageView);
        this.zac = new WeakReference(imageView);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zae)) {
            return false;
        }
        ImageView imageView = (ImageView) this.zac.get();
        ImageView imageView2 = (ImageView) ((zae) obj).zac.get();
        return (imageView2 == null || imageView == null || !Objects.equal(imageView2, imageView)) ? false : true;
    }

    public final int hashCode() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.images.zag
    public final void zaa(Drawable drawable, boolean z, boolean z2, boolean z3) {
        Drawable drawable2;
        ImageView imageView = (ImageView) this.zac.get();
        if (imageView != null) {
            if (!z2 && !z3 && (imageView instanceof zal)) {
                throw null;
            }
            boolean z4 = false;
            if (!z2) {
                z4 = !z;
            }
            Drawable drawable3 = drawable;
            if (z4) {
                Drawable drawable4 = imageView.getDrawable();
                if (drawable4 != null) {
                    drawable2 = drawable4;
                    if (drawable4 instanceof zak) {
                        drawable2 = ((zak) drawable4).zaa();
                    }
                } else {
                    drawable2 = null;
                }
                drawable3 = new zak(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable3);
            if (imageView instanceof zal) {
                throw null;
            }
            if (drawable3 == null || !z4) {
                return;
            }
            ((zak) drawable3).zab(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
        }
    }
}
