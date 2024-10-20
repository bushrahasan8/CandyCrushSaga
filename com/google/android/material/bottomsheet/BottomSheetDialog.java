package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$style;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.shape.MaterialShapeDrawable;

/* loaded from: BottomSheetDialog.class */
public class BottomSheetDialog extends AppCompatDialog {
    private BottomSheetBehavior behavior;
    private FrameLayout bottomSheet;
    private BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    private CoordinatorLayout coordinator;
    boolean dismissWithAnimation;
    private BottomSheetBehavior.BottomSheetCallback edgeToEdgeCallback;
    private boolean edgeToEdgeEnabled;

    /* loaded from: BottomSheetDialog$EdgeToEdgeCallback.class */
    private static class EdgeToEdgeCallback extends BottomSheetBehavior.BottomSheetCallback {
        private final WindowInsetsCompat insetsCompat;
        private final boolean lightBottomSheet;
        private final boolean lightStatusBar;

        private EdgeToEdgeCallback(View view, WindowInsetsCompat windowInsetsCompat) {
            this.insetsCompat = windowInsetsCompat;
            boolean z = (view.getSystemUiVisibility() & 8192) != 0;
            this.lightStatusBar = z;
            MaterialShapeDrawable materialShapeDrawable = BottomSheetBehavior.from(view).getMaterialShapeDrawable();
            ColorStateList fillColor = materialShapeDrawable != null ? materialShapeDrawable.getFillColor() : ViewCompat.getBackgroundTintList(view);
            if (fillColor != null) {
                this.lightBottomSheet = MaterialColors.isColorLight(fillColor.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.lightBottomSheet = MaterialColors.isColorLight(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.lightBottomSheet = z;
            }
        }

        private void setPaddingForPosition(View view) {
            if (view.getTop() < this.insetsCompat.getSystemWindowInsetTop()) {
                BottomSheetDialog.setLightStatusBar(view, this.lightBottomSheet);
                view.setPadding(view.getPaddingLeft(), this.insetsCompat.getSystemWindowInsetTop() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                BottomSheetDialog.setLightStatusBar(view, this.lightStatusBar);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        void onLayout(View view) {
            setPaddingForPosition(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view, float f) {
            setPaddingForPosition(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view, int i) {
            setPaddingForPosition(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetDialog(Context context) {
        this(context, 0);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{R$attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetDialog(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new BottomSheetBehavior.BottomSheetCallback(this) { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.5
            final BottomSheetDialog this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View view, float f) {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View view, int i2) {
                if (i2 == 5) {
                    this.this$0.cancel();
                }
            }
        };
        supportRequestWindowFeature(1);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{R$attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FrameLayout ensureContainerAndBehavior() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R$layout.design_bottom_sheet_dialog, null);
            this.container = frameLayout;
            this.coordinator = frameLayout.findViewById(R$id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.container.findViewById(R$id.design_bottom_sheet);
            this.bottomSheet = frameLayout2;
            BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout2);
            this.behavior = from;
            from.addBottomSheetCallback(this.bottomSheetCallback);
            this.behavior.setHideable(this.cancelable);
        }
        return this.container;
    }

    private static int getThemeResId(Context context, int i) {
        int i2 = i;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i2 = context.getTheme().resolveAttribute(R$attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R$style.Theme_Design_Light_BottomSheetDialog;
        }
        return i2;
    }

    public static void setLightStatusBar(View view, boolean z) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View wrapInBottomSheet(int i, View view, ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout findViewById = this.container.findViewById(R$id.coordinator);
        View view2 = view;
        if (i != 0) {
            view2 = view;
            if (view == null) {
                view2 = getLayoutInflater().inflate(i, (ViewGroup) findViewById, false);
            }
        }
        if (this.edgeToEdgeEnabled) {
            ViewCompat.setOnApplyWindowInsetsListener(this.bottomSheet, new OnApplyWindowInsetsListener(this) { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.1
                final BottomSheetDialog this$0;

                {
                    this.this$0 = this;
                }

                public WindowInsetsCompat onApplyWindowInsets(View view3, WindowInsetsCompat windowInsetsCompat) {
                    if (this.this$0.edgeToEdgeCallback != null) {
                        this.this$0.behavior.removeBottomSheetCallback(this.this$0.edgeToEdgeCallback);
                    }
                    if (windowInsetsCompat != null) {
                        BottomSheetDialog bottomSheetDialog = this.this$0;
                        bottomSheetDialog.edgeToEdgeCallback = new EdgeToEdgeCallback(bottomSheetDialog.bottomSheet, windowInsetsCompat);
                        this.this$0.behavior.addBottomSheetCallback(this.this$0.edgeToEdgeCallback);
                    }
                    return windowInsetsCompat;
                }
            });
        }
        this.bottomSheet.removeAllViews();
        if (layoutParams == null) {
            this.bottomSheet.addView(view2);
        } else {
            this.bottomSheet.addView(view2, layoutParams);
        }
        findViewById.findViewById(R$id.touch_outside).setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.2
            final BottomSheetDialog this$0;

            {
                this.this$0 = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog] */
            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                ?? r0 = this.this$0;
                if (r0.cancelable && r0.isShowing() && this.this$0.shouldWindowCloseOnTouchOutside()) {
                    this.this$0.cancel();
                }
            }
        });
        ViewCompat.setAccessibilityDelegate(this.bottomSheet, new AccessibilityDelegateCompat(this) { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.3
            final BottomSheetDialog this$0;

            {
                this.this$0 = this;
            }

            public void onInitializeAccessibilityNodeInfo(View view3, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view3, accessibilityNodeInfoCompat);
                if (!this.this$0.cancelable) {
                    accessibilityNodeInfoCompat.setDismissable(false);
                } else {
                    accessibilityNodeInfoCompat.addAction(1048576);
                    accessibilityNodeInfoCompat.setDismissable(true);
                }
            }

            public boolean performAccessibilityAction(View view3, int i2, Bundle bundle) {
                if (i2 == 1048576) {
                    BottomSheetDialog bottomSheetDialog = this.this$0;
                    if (bottomSheetDialog.cancelable) {
                        bottomSheetDialog.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view3, i2, bundle);
            }
        });
        this.bottomSheet.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.4
            final BottomSheetDialog this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view3, MotionEvent motionEvent) {
                return true;
            }
        });
        return this.container;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void cancel() {
        BottomSheetBehavior behavior = getBehavior();
        if (!this.dismissWithAnimation || behavior.getState() == 5) {
            super/*android.app.Dialog*/.cancel();
        } else {
            behavior.setState(5);
        }
    }

    public BottomSheetBehavior getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    public boolean getDismissWithAnimation() {
        return this.dismissWithAnimation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.app.Dialog*/.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.edgeToEdgeEnabled && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.container;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.coordinator;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    protected void onStart() {
        super/*androidx.activity.ComponentDialog*/.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 5) {
            return;
        }
        this.behavior.setState(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeDefaultCallback() {
        this.behavior.removeBottomSheetCallback(this.bottomSheetCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCancelable(boolean z) {
        super/*android.app.Dialog*/.setCancelable(z);
        if (this.cancelable != z) {
            this.cancelable = z;
            BottomSheetBehavior bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCanceledOnTouchOutside(boolean z) {
        super/*android.app.Dialog*/.setCanceledOnTouchOutside(z);
        if (z && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z;
        this.canceledOnTouchOutsideSet = true;
    }

    public void setContentView(int i) {
        super.setContentView(wrapInBottomSheet(i, null, null));
    }

    public void setContentView(View view) {
        super.setContentView(wrapInBottomSheet(0, view, null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInBottomSheet(0, view, layoutParams));
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.canceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }
}
