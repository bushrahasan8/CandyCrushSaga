package com.king.usdk.lifecycle;

import android.content.Intent;
import androidx.annotation.Keep;

@Keep
/* loaded from: UsdkLifecycle.class */
public class UsdkLifecycle {
    public static native void nativeOnActivityResult(int i, int i2, Intent intent);

    public static native void nativeOnCreate(Intent intent);

    public static native void nativeOnDestroy();

    public static native void nativeOnNewIntent(Intent intent);

    public static native void nativeOnPause();

    public static native void nativeOnRestart();

    public static native void nativeOnResume();

    public static native void nativeOnStart();

    public static native void nativeOnStop();

    public static void onActivityResult(int i, int i2, Intent intent) {
        nativeOnActivityResult(i, i2, intent);
    }

    public static void onCreate(Intent intent) {
        nativeOnCreate(intent);
    }

    public static void onDestroy() {
        nativeOnDestroy();
    }

    public static void onNewIntent(Intent intent) {
        nativeOnNewIntent(intent);
    }

    public static void onPause() {
        nativeOnPause();
    }

    public static void onRestart() {
        nativeOnRestart();
    }

    public static void onResume() {
        nativeOnResume();
    }

    public static void onStart() {
        nativeOnStart();
    }

    public static void onStop() {
        nativeOnStop();
    }
}
