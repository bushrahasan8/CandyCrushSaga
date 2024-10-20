package com.king.popupwebview.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;

/* JADX INFO: Access modifiers changed from: package-private */
@Keep
/* loaded from: PopupDialog.class */
public final class PopupDialog {
    private static final String BACK_BUTTON_PRESSED_MESSAGE = "systemBackButton";
    private static final int FULLSCREEN_FLAGS = 5894;
    private View contentView;
    private final boolean forceFullscreen;
    private final WindowManager wndManager;
    private PopupDecorView decorView = null;
    private volatile Popup openedPopup = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: PopupDialog$PopupDecorView.class */
    public final class PopupDecorView extends FrameLayout {
        final PopupDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private PopupDecorView(PopupDialog popupDialog, Context context) {
            super(context);
            this.this$0 = popupDialog;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            KeyEvent.DispatcherState keyDispatcherState;
            if (this.this$0.decorView == this && keyEvent.getKeyCode() == 4 && (keyDispatcherState = getKeyDispatcherState()) != null) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                }
                if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                    if (this.this$0.openedPopup == null) {
                        return true;
                    }
                    this.this$0.openedPopup.postMessage(PopupDialog.BACK_BUTTON_PRESSED_MESSAGE, null);
                    return true;
                }
            }
            return super.dispatchKeyEvent(keyEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PopupDialog(View view, boolean z) {
        this.forceFullscreen = z;
        this.contentView = view;
        this.wndManager = (WindowManager) view.getContext().getSystemService("window");
    }

    private void processDisplayCutout(Context context, WindowManager.LayoutParams layoutParams) {
        Window window;
        int i;
        if (Build.VERSION.SDK_INT < 28 || !(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || window.getAttributes() == null) {
            return;
        }
        i = window.getAttributes().layoutInDisplayCutoutMode;
        layoutParams.layoutInDisplayCutoutMode = i;
    }

    public void close() {
        this.openedPopup = null;
        PopupDecorView popupDecorView = this.decorView;
        if (popupDecorView != null) {
            if (popupDecorView.getParent() != null) {
                this.wndManager.removeViewImmediate(this.decorView);
            }
            this.decorView = null;
        }
        View view = this.contentView;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.contentView);
            }
        }
    }

    public void destroy() {
        close();
        this.contentView = null;
    }

    public boolean isOpened() {
        return this.openedPopup != null;
    }

    @SuppressLint({"InlinedApi"})
    public void open(Popup popup) {
        if (popup == null || this.contentView == null) {
            close();
            return;
        }
        View activityDecorView = popup.getActivityWrapper().getActivityDecorView();
        if (activityDecorView == null) {
            close();
            return;
        }
        if (popup == this.openedPopup) {
            return;
        }
        if (this.openedPopup != null) {
            close();
        }
        this.openedPopup = popup;
        Context context = this.contentView.getContext();
        PopupDecorView popupDecorView = new PopupDecorView(context);
        this.decorView = popupDecorView;
        popupDecorView.addView(this.contentView, -1, -1);
        this.decorView.setClipChildren(false);
        this.decorView.setClipToPadding(false);
        this.decorView.setFitsSystemWindows(false);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1000;
        layoutParams.token = activityDecorView.getWindowToken();
        layoutParams.softInputMode = 1;
        layoutParams.windowAnimations = 0;
        layoutParams.format = -3;
        layoutParams.flags = 1098907656;
        layoutParams.gravity = 17;
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.wndManager.addView(this.decorView, layoutParams);
        if (this.forceFullscreen || (activityDecorView.getSystemUiVisibility() & 6144) != 0) {
            this.contentView.setSystemUiVisibility(FULLSCREEN_FLAGS);
            processDisplayCutout(context, layoutParams);
            this.contentView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this) { // from class: com.king.popupwebview.internal.PopupDialog.1
                private int currentHeightDiff = -1;
                final PopupDialog this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (this.this$0.contentView != null) {
                        Rect rect = new Rect();
                        this.this$0.contentView.getWindowVisibleDisplayFrame(rect);
                        int height = this.this$0.contentView.getRootView().getHeight();
                        int i = height - (rect.bottom - rect.top);
                        ViewGroup.LayoutParams layoutParams2 = this.this$0.contentView.getLayoutParams();
                        if (i == this.currentHeightDiff) {
                            if (layoutParams2.height != height) {
                                layoutParams2.height = height;
                                this.this$0.contentView.requestLayout();
                                return;
                            }
                            return;
                        }
                        if (i > height * 0.33d) {
                            layoutParams2.height = height - i;
                            this.this$0.contentView.setSystemUiVisibility(5892);
                        } else {
                            layoutParams2.height = height;
                            this.this$0.contentView.setSystemUiVisibility(PopupDialog.FULLSCREEN_FLAGS);
                        }
                        this.currentHeightDiff = i;
                        this.this$0.contentView.requestLayout();
                    }
                }
            });
        }
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) this.decorView.getLayoutParams();
        layoutParams2.flags &= -9;
        this.wndManager.updateViewLayout(this.decorView, layoutParams2);
    }
}
