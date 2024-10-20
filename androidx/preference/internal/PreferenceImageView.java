package androidx.preference.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.preference.R$styleable;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: PreferenceImageView.class */
public class PreferenceImageView extends ImageView {
    private int mMaxHeight;
    private int mMaxWidth;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PreferenceImageView, i, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(R$styleable.PreferenceImageView_maxWidth, Integer.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(R$styleable.PreferenceImageView_maxHeight, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (r0 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        if (r0 == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0 == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0050, code lost:
    
        if (r0 == 0) goto L43;
     */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            r0 = r5
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L14
            r0 = r5
            r7 = r0
            r0 = r9
            if (r0 != 0) goto L3f
        L14:
            r0 = r5
            int r0 = android.view.View.MeasureSpec.getSize(r0)
            r10 = r0
            r0 = r4
            int r0 = r0.getMaxWidth()
            r8 = r0
            r0 = r5
            r7 = r0
            r0 = r8
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L3f
            r0 = r8
            r1 = r10
            if (r0 < r1) goto L37
            r0 = r5
            r7 = r0
            r0 = r9
            if (r0 != 0) goto L3f
        L37:
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r7 = r0
        L3f:
            r0 = r6
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            r10 = r0
            r0 = r10
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L53
            r0 = r6
            r5 = r0
            r0 = r10
            if (r0 != 0) goto L7e
        L53:
            r0 = r6
            int r0 = android.view.View.MeasureSpec.getSize(r0)
            r8 = r0
            r0 = r4
            int r0 = r0.getMaxHeight()
            r9 = r0
            r0 = r6
            r5 = r0
            r0 = r9
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L7e
            r0 = r9
            r1 = r8
            if (r0 < r1) goto L76
            r0 = r6
            r5 = r0
            r0 = r10
            if (r0 != 0) goto L7e
        L76:
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r5 = r0
        L7e:
            r0 = r4
            r1 = r7
            r2 = r5
            super.onMeasure(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.internal.PreferenceImageView.onMeasure(int, int):void");
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i) {
        this.mMaxHeight = i;
        super.setMaxHeight(i);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i) {
        this.mMaxWidth = i;
        super.setMaxWidth(i);
    }
}
