package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ClockHandView.class */
public class ClockHandView extends View {
    private boolean animatingOnTouchUp;
    private final float centerDotRadius;
    private boolean changedDuringTouch;
    private int circleRadius;
    private double degRad;
    private float downX;
    private float downY;
    private boolean isInTapRegion;
    private final List listeners;
    private float originalDeg;
    private final Paint paint;
    private ValueAnimator rotationAnimator;
    private int scaledTouchSlop;
    private final RectF selectorBox;
    private final int selectorRadius;
    private final int selectorStrokeWidth;

    /* loaded from: ClockHandView$OnRotateListener.class */
    public interface OnRotateListener {
        void onRotate(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialClockStyle);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.listeners = new ArrayList();
        Paint paint = new Paint();
        this.paint = paint;
        this.selectorBox = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClockHandView, i, R$style.Widget_MaterialComponents_TimePicker_Clock);
        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ClockHandView_materialCircleRadius, 0);
        this.selectorRadius = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ClockHandView_selectorSize, 0);
        this.selectorStrokeWidth = getResources().getDimensionPixelSize(R$dimen.material_clock_hand_stroke_width);
        this.centerDotRadius = r0.getDimensionPixelSize(R$dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(R$styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        this.scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.setImportantForAccessibility(this, 2);
        obtainStyledAttributes.recycle();
    }

    private void drawSelector(Canvas canvas) {
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float f = this.circleRadius;
        float cos = (float) Math.cos(this.degRad);
        float f2 = height;
        float f3 = this.circleRadius;
        float sin = (float) Math.sin(this.degRad);
        this.paint.setStrokeWidth(0.0f);
        canvas.drawCircle((f * cos) + width, (f3 * sin) + f2, this.selectorRadius, this.paint);
        double sin2 = Math.sin(this.degRad);
        double cos2 = Math.cos(this.degRad);
        this.paint.setStrokeWidth(this.selectorStrokeWidth);
        canvas.drawLine(width, f2, r0 + ((int) (cos2 * r0)), height + ((int) (r0 * sin2)), this.paint);
        canvas.drawCircle(width, f2, this.centerDotRadius, this.paint);
    }

    private int getDegreesFromXY(float f, float f2) {
        int degrees = (int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)));
        int i = degrees + 90;
        int i2 = i;
        if (i < 0) {
            i2 = degrees + 450;
        }
        return i2;
    }

    private Pair getValuesForAnimation(float f) {
        float handRotation = getHandRotation();
        float f2 = handRotation;
        float f3 = f;
        if (Math.abs(handRotation - f) > 180.0f) {
            float f4 = f;
            if (handRotation > 180.0f) {
                f4 = f;
                if (f < 180.0f) {
                    f4 = f + 360.0f;
                }
            }
            f2 = handRotation;
            f3 = f4;
            if (handRotation < 180.0f) {
                f2 = handRotation;
                f3 = f4;
                if (f4 > 180.0f) {
                    f2 = handRotation + 360.0f;
                    f3 = f4;
                }
            }
        }
        return new Pair(Float.valueOf(f2), Float.valueOf(f3));
    }

    private boolean handleTouchInput(float f, float f2, boolean z, boolean z2, boolean z3) {
        float degreesFromXY = getDegreesFromXY(f, f2);
        boolean z4 = getHandRotation() != degreesFromXY;
        if (z2 && z4) {
            return true;
        }
        if (!z4 && !z) {
            return false;
        }
        boolean z5 = false;
        if (z3) {
            z5 = false;
            if (this.animatingOnTouchUp) {
                z5 = true;
            }
        }
        setHandRotation(degreesFromXY, z5);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHandRotationInternal(float f, boolean z) {
        float f2 = f % 360.0f;
        this.originalDeg = f2;
        this.degRad = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        float width = (getWidth() / 2) + (this.circleRadius * ((float) Math.cos(this.degRad)));
        float sin = height + (this.circleRadius * ((float) Math.sin(this.degRad)));
        RectF rectF = this.selectorBox;
        int i = this.selectorRadius;
        rectF.set(width - i, sin - i, width + i, sin + i);
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((OnRotateListener) it.next()).onRotate(f2, z);
        }
        invalidate();
    }

    public void addOnRotateListener(OnRotateListener onRotateListener) {
        this.listeners.add(onRotateListener);
    }

    public RectF getCurrentSelectorBox() {
        return this.selectorBox;
    }

    public float getHandRotation() {
        return this.originalDeg;
    }

    public int getSelectorRadius() {
        return this.selectorRadius;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawSelector(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setHandRotation(getHandRotation());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.downX = x;
            this.downY = y;
            this.isInTapRegion = true;
            this.changedDuringTouch = false;
            z = true;
            z2 = false;
            z3 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i = (int) (x - this.downX);
            int i2 = (int) (y - this.downY);
            this.isInTapRegion = (i * i) + (i2 * i2) > this.scaledTouchSlop;
            boolean z4 = this.changedDuringTouch;
            z3 = actionMasked == 1;
            z2 = z4;
            z = false;
        } else {
            z2 = false;
            z = false;
            z3 = false;
        }
        this.changedDuringTouch |= handleTouchInput(x, y, z2, z, z3);
        return true;
    }

    public void setCircleRadius(int i) {
        this.circleRadius = i;
        invalidate();
    }

    public void setHandRotation(float f) {
        setHandRotation(f, false);
    }

    public void setHandRotation(float f, boolean z) {
        ValueAnimator valueAnimator = this.rotationAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            setHandRotationInternal(f, false);
            return;
        }
        Pair valuesForAnimation = getValuesForAnimation(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) valuesForAnimation.first).floatValue(), ((Float) valuesForAnimation.second).floatValue());
        this.rotationAnimator = ofFloat;
        ofFloat.setDuration(200L);
        this.rotationAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.timepicker.ClockHandView.1
            final ClockHandView this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.this$0.setHandRotationInternal(((Float) valueAnimator2.getAnimatedValue()).floatValue(), true);
            }
        });
        this.rotationAnimator.addListener(new AnimatorListenerAdapter(this) { // from class: com.google.android.material.timepicker.ClockHandView.2
            final ClockHandView this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
        this.rotationAnimator.start();
    }
}
