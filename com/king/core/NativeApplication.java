package com.king.core;

import android.content.res.AssetManager;
import androidx.annotation.Keep;

@Keep
/* loaded from: NativeApplication.class */
public class NativeApplication {

    /* loaded from: NativeApplication$ESystemEvent.class */
    public enum ESystemEvent {
        SYSTEM_EVENT_WILL_RESIGN_ACTIVE,
        SYSTEM_EVENT_DID_BECOME_ACTIVE,
        SYSTEM_EVENT_WILL_TERMINATE,
        SYSTEM_EVENT_DID_ENTER_BACKGROUND,
        SYSTEM_EVENT_WILL_ENTER_FOREGROUND,
        SYSTEM_EVENT_OPEN_GL_CONTEXT_RECREATED,
        SYSTEM_EVENT_DID_RECEIVE_MEMORY_WARNING
    }

    public native void create(long j, String str, AssetManager assetManager);

    public native void createWithOptions(long j, String str, AssetManager assetManager, boolean z);

    public native void destroy();

    native boolean getJavaAvailableBoolSetting(String str);

    public native void init(int i, int i2, int i3, boolean z);

    public native boolean isOrientationSupported(int i);

    public native void onAccelerometer(float f, float f2, float f3);

    public native void onBackKeyDown();

    public native void onBackKeyUp();

    public native void onKeyDown(int i);

    public native void onKeyUp(int i);

    public native void onKeyboardInputChange(String str);

    public native void onKeyboardSubmit();

    public native void onMouseWheelEvent(int i, int i2, int i3);

    public native void onSystemEvent(int i);

    public native void onTouchEvent(int i, int i2, int i3, int i4);

    public native void onWebViewMessage(int i, String str, String str2, String str3);

    public native void onWebViewPageLoadError(int i, String str);

    public native void onWebViewPageLoadSuccess(int i);

    public native void setAppShuttingDownFlag();

    public native boolean shouldRejectTextInputChanges(long j, String str);

    public native boolean step(float f);

    public native void updateOrientation(int i);

    public native void updateScreenSafeAreaInsets(int i, int i2, int i3, int i4);

    public native void updateScreenSize(int i, int i2);
}
