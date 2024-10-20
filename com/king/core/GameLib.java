package com.king.core;

import android.os.Build;
import android.widget.Toast;
import androidx.annotation.Keep;
import com.king.logging.Logging;

@Keep
/* loaded from: GameLib.class */
public class GameLib {
    public static final String TAG = "FictionFactory";
    private static GameActivity mGameActivity;

    private GameLib() {
        throw new IllegalStateException("Utility class");
    }

    public static int getCursorPosition() {
        return mGameActivity.getCursorPosition();
    }

    public static void hideApplication() {
        mGameActivity.runOnUiThread(new Runnable() { // from class: com.king.core.GameLib.2
            @Override // java.lang.Runnable
            public void run() {
                GameLib.mGameActivity.moveTaskToBack(true);
            }
        });
    }

    public static void hideKeyboard() {
        mGameActivity.hideKeyboard();
    }

    public static void initAccelerometer() {
        mGameActivity.initAccelerometer();
    }

    public static void initAllowedScreenOrientations(boolean z, boolean z2, boolean z3, boolean z4) {
        mGameActivity.GetOrientationManager().initAllowedOrientations(z, z2, z3, z4);
    }

    public static boolean isInMultiWindowMode() {
        if (Build.VERSION.SDK_INT >= 24) {
            return GameLib$$ExternalSyntheticApiModelOutline0.m(mGameActivity);
        }
        return false;
    }

    public static boolean isKeyboardShowing() {
        return mGameActivity.isKeyboardShowing();
    }

    public static void justShowKeyboard() {
        mGameActivity.showKeyboard();
    }

    public static void logInfo(String str, String str2) {
        Logging.logInfo(str, str2);
    }

    public static void logWarning(String str, String str2) {
        Logging.logWarning(str, str2);
    }

    public static void releaseAccelerometer() {
        mGameActivity.releaseAccelerometer();
    }

    public static void runOnGameThread(Runnable runnable) {
        mGameActivity.runOnGameThread(runnable);
    }

    public static void setCursorPosition(int i) {
        mGameActivity.setCursorPosition(i);
    }

    public static void setGameActivity(GameActivity gameActivity) {
        mGameActivity = gameActivity;
    }

    public static void setKeyboardText(String str) {
        mGameActivity.setKeyboardText(str);
    }

    public static void setScreenOrientation(int i) {
        mGameActivity.GetOrientationManager().setScreenOrientation(i);
    }

    public static void setupPlatform(int i, int i2, int i3, int i4, int i5) {
        mGameActivity.setPlatformSetup(new PlatformSetup(i, i2, i3, i4, i5));
    }

    public static boolean shouldAutoHideKeyboardOnSubmit() {
        return mGameActivity.shouldAutoHideKeyboardOnSubmit();
    }

    public static void showKeyboard(String str, int i, int i2, int i3, int i4, int i5, long j, int i6, int i7) {
        mGameActivity.showKeyboard(str, i, i2, i3, i4, i5 != 0, j, i6, i7 != 0);
    }

    public static void showToast(String str, String str2) {
        mGameActivity.runOnUiThread(new Runnable(str, str2) { // from class: com.king.core.GameLib.1
            final String val$message;
            final String val$title;

            {
                this.val$title = str;
                this.val$message = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(GameLib.mGameActivity, this.val$title + "\n" + this.val$message, 1).show();
            }
        });
    }

    public static void updateAllowedScreenOrientations(boolean z, boolean z2, boolean z3, boolean z4) {
        mGameActivity.GetOrientationManager().updateAllowedOrientations(z, z2, z3, z4);
    }
}
