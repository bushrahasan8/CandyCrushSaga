package com.king.core;

import android.opengl.GLSurfaceView;
import android.view.Display;
import androidx.annotation.Keep;
import com.king.core.NativeApplication;
import com.king.logging.Logging;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

@Keep
/* loaded from: GameRenderer.class */
public class GameRenderer implements GLSurfaceView.Renderer {
    private static final String TAG = "com.king.core.GameRenderer";
    private final ConfigChooser mConfigChooser;
    private ScreenRotation mLastOrientation;
    private final NativeApplication mNativeApplication;
    private final GameView mParentView;
    private final PlatformSetup mPlatformSetup;
    private boolean mFirst = true;
    private boolean mFirstDrawFrame = true;
    private long mLastFrameStartTime = System.nanoTime();
    private long mLastFrameEndTime = System.nanoTime();

    /* loaded from: GameRenderer$ScreenRotation.class */
    public enum ScreenRotation {
        SCREEN_ROTATION_0(1),
        SCREEN_ROTATION_90(2),
        SCREEN_ROTATION_180(4),
        SCREEN_ROTATION_270(8);

        private final int mId;

        ScreenRotation(int i) {
            this.mId = i;
        }

        public static ScreenRotation fromSurface(int i) {
            return i != 1 ? i != 2 ? i != 3 ? SCREEN_ROTATION_0 : SCREEN_ROTATION_90 : SCREEN_ROTATION_180 : SCREEN_ROTATION_270;
        }

        public int getId() {
            return this.mId;
        }
    }

    public GameRenderer(GameView gameView, NativeApplication nativeApplication, ConfigChooser configChooser, PlatformSetup platformSetup) {
        this.mParentView = gameView;
        this.mNativeApplication = nativeApplication;
        this.mConfigChooser = configChooser;
        this.mPlatformSetup = platformSetup;
    }

    private ScreenRotation getRotation() {
        Display defaultDisplay = this.mParentView.getActivity().getWindowManager().getDefaultDisplay();
        if (defaultDisplay != null) {
            return ScreenRotation.fromSurface(defaultDisplay.getRotation());
        }
        Logging.logError(TAG, "default display is null, can't read the screen rotation.");
        return ScreenRotation.SCREEN_ROTATION_0;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (this.mFirstDrawFrame) {
            this.mFirstDrawFrame = false;
            return;
        }
        ScreenRotation rotation = getRotation();
        if (rotation != this.mLastOrientation) {
            this.mNativeApplication.updateOrientation(rotation.getId());
            this.mLastOrientation = rotation;
        }
        long nanoTime = System.nanoTime();
        long j = this.mLastFrameStartTime;
        this.mLastFrameStartTime = System.nanoTime();
        if (!this.mNativeApplication.step(((float) (nanoTime - j)) / 1.0E9f)) {
            this.mParentView.setRenderMode(0);
            this.mParentView.requestApplicationMinimization();
        }
        long targetFps = 1000000000 / this.mPlatformSetup.getTargetFps();
        long nanoTime2 = System.nanoTime() - this.mLastFrameEndTime;
        while (nanoTime2 < targetFps) {
            if (targetFps - nanoTime2 > 1250000) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e) {
                    Logging.logException(TAG + ":onDrawFrame() - Fatal exception on Thread sleep.", e);
                    Thread.currentThread().interrupt();
                }
            } else {
                Thread.yield();
            }
            long nanoTime3 = System.nanoTime() - this.mLastFrameEndTime;
            nanoTime2 = nanoTime3;
            if (nanoTime3 < 0) {
                this.mLastFrameEndTime = System.nanoTime();
                nanoTime2 = 0;
            }
        }
        this.mLastFrameEndTime = System.nanoTime();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        String str = TAG;
        Logging.logInfo(str, "onSurfaceChanged(" + i + ", " + i2 + ")");
        if (!this.mFirst) {
            Logging.logInfo(str, "Calling native.updateScreenSize(" + i + ", " + i2 + ")");
            this.mNativeApplication.updateScreenSize(i, i2);
            this.mParentView.restoreKeyboardVisibility();
            return;
        }
        ScreenRotation rotation = getRotation();
        this.mLastOrientation = rotation;
        Logging.logInfo(str, "Calling native.init(" + i + ", " + i2 + ", " + rotation.getId() + ")");
        this.mNativeApplication.init(i, i2, rotation.getId(), this.mParentView.isUsingFallbackRenderer());
        this.mFirst = false;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        String str = TAG;
        Logging.logInfo(str, "Surface created");
        if (!this.mFirst) {
            this.mNativeApplication.onSystemEvent(NativeApplication.ESystemEvent.SYSTEM_EVENT_OPEN_GL_CONTEXT_RECREATED.ordinal());
            Logging.logInfo(str, "GL Context recreated");
            return;
        }
        Logging.logInfo(str, "Current:     " + this.mConfigChooser.getCurrent());
        Logging.logInfo(str, "PixelFormat: " + this.mConfigChooser.getCurrent().getPixelFormat());
        Logging.logInfo(str, "Samples:     " + this.mConfigChooser.getCurrent().getSamples());
        this.mParentView.getHolder().setFormat(this.mConfigChooser.getCurrent().getPixelFormat());
    }
}
