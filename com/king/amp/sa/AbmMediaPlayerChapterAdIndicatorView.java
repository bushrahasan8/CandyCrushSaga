package com.king.amp.sa;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.king.abm.R$dimen;
import com.king.abm.R$drawable;

/* loaded from: AbmMediaPlayerChapterAdIndicatorView.class */
public class AbmMediaPlayerChapterAdIndicatorView extends LinearLayout {
    private Drawable activeIndicator;
    private int currentActiveIndicator;
    private Drawable inactiveIndicator;
    private ImageView[] indicators;

    public AbmMediaPlayerChapterAdIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setupIndicators(Context context, int i) {
        this.indicators = new ImageView[i];
        this.activeIndicator = ContextCompat.getDrawable(context, R$drawable.indicator_active);
        this.inactiveIndicator = ContextCompat.getDrawable(context, R$drawable.indicator_inactive);
        this.activeIndicator.setAlpha(204);
        this.inactiveIndicator.setAlpha(204);
        int dimension = (int) getResources().getDimension(R$dimen.indicator_size);
        for (int i2 = 0; i2 < i; i2++) {
            this.indicators[i2] = new ImageView(context);
            this.indicators[i2].setImageDrawable(this.inactiveIndicator);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimension, dimension);
            layoutParams.setMargins(0, 12, 0, 12);
            addView(this.indicators[i2], layoutParams);
        }
        this.currentActiveIndicator = 0;
        this.indicators[0].setImageDrawable(this.activeIndicator);
    }

    public void updateIndicator(int i) {
        this.indicators[this.currentActiveIndicator].setImageDrawable(this.inactiveIndicator);
        this.indicators[i].setImageDrawable(this.activeIndicator);
        this.currentActiveIndicator = i;
    }
}
