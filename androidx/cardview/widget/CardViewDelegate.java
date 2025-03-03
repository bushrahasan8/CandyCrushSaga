package androidx.cardview.widget;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: CardViewDelegate.class */
interface CardViewDelegate {
    Drawable getCardBackground();

    View getCardView();

    boolean getPreventCornerOverlap();

    boolean getUseCompatPadding();

    void setCardBackground(Drawable drawable);

    void setShadowPadding(int i, int i2, int i3, int i4);
}
