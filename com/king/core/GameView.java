package com.king.core;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.Keep;
import com.google.android.gms.drive.DriveFile;
import com.king.core.GameView;
import com.king.core.TextInput;
import com.king.logging.Logging;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

@Keep
/* loaded from: GameView.class */
public class GameView extends GLSurfaceView {
    static final boolean DEBUG = false;
    public static final String TAG = "com.king.core.GameView";
    private final Activity mActivity;
    private final EditableWatcher mEditableWatcher;
    private InitializationOptions mInitializationOptions;
    private final SimpleInputConnection mInputConnection;
    private final AtomicBoolean mKeyboardShowing;
    private TextInput.KeyboardType mKeyboardType;
    private NativeApplication mNativeApplication;
    private boolean mOpenGLES3AttemptSuccess;
    private PlatformSetup mPlatformSetup;
    private TextInput.ReturnKey mReturnKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.king.core.GameView$1, reason: invalid class name */
    /* loaded from: GameView$1.class */
    public class AnonymousClass1 implements EditableWatcher {
        final GameView this$0;

        AnonymousClass1(GameView gameView) {
            this.this$0 = gameView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onEditableChanged$0(String str) {
            this.this$0.mNativeApplication.onKeyboardInputChange(str);
        }

        @Override // com.king.core.EditableWatcher
        public void onEditableChanged(CharSequence charSequence) {
            Logging.logInfo(GameView.TAG, "EditableChanged: " + ((Object) charSequence));
            final String charSequence2 = charSequence.toString();
            this.this$0.queueEvent(new Runnable(this, charSequence2) { // from class: com.king.core.GameView$1$$ExternalSyntheticLambda0
                public final GameView.AnonymousClass1 f$0;
                public final String f$1;

                {
                    this.f$0 = this;
                    this.f$1 = charSequence2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onEditableChanged$0(this.f$1);
                }
            });
        }
    }

    /* loaded from: GameView$InitializationOptions.class */
    public static class InitializationOptions {
        public boolean mAttemptGLES3 = false;
    }

    public GameView(Activity activity) {
        this(activity, new InitializationOptions());
    }

    public GameView(Activity activity, InitializationOptions initializationOptions) {
        super(activity);
        this.mNativeApplication = null;
        this.mPlatformSetup = null;
        this.mOpenGLES3AttemptSuccess = true;
        this.mActivity = activity;
        this.mInitializationOptions = initializationOptions;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this);
        this.mEditableWatcher = anonymousClass1;
        SimpleInputConnection simpleInputConnection = new SimpleInputConnection(this, true);
        this.mInputConnection = simpleInputConnection;
        simpleInputConnection.addEditableChangedListener(anonymousClass1);
        this.mKeyboardShowing = new AtomicBoolean(false);
        this.mKeyboardType = TextInput.KeyboardType.KEYBOARD_TYPE_NORMAL;
        this.mReturnKey = TextInput.ReturnKey.RETURN_KEY_DEFAULT;
        int i = Build.VERSION.SDK_INT;
        setPreserveEGLContextOnPause(true);
        if (i >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
    }

    private int getInputType() {
        return TextInput.KeyboardType.toMaskField(this.mKeyboardType, false);
    }

    private static boolean isSamsung() {
        return Build.MANUFACTURER.equalsIgnoreCase("Samsung");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onGenericMotionEvent$1(int i, int i2, int i3) {
        this.mNativeApplication.onMouseWheelEvent(i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTouchEvent$2(int i, int i2, int i3, int i4) {
        this.mNativeApplication.onTouchEvent(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestApplicationMinimization$0() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(DriveFile.MODE_READ_ONLY);
        this.mActivity.startActivity(intent);
        this.mActivity.moveTaskToBack(true);
    }

    public Activity getActivity() {
        return this.mActivity;
    }

    public int getCachedCursorPosition() {
        return this.mInputConnection.getCachedCursorPosition();
    }

    public Editable getEditableText() {
        return this.mInputConnection.getEditable();
    }

    public SimpleInputConnection getInputConnection() {
        return this.mInputConnection;
    }

    public NativeApplication getNativeApplication() {
        return this.mNativeApplication;
    }

    public void initialize(NativeApplication nativeApplication, PlatformSetup platformSetup) {
        this.mNativeApplication = nativeApplication;
        this.mPlatformSetup = platformSetup;
        this.mInputConnection.setNativeApplication(nativeApplication);
        GLSurfaceView.EGLContextFactory eGLContextFactory = new GLSurfaceView.EGLContextFactory(this) { // from class: com.king.core.GameView.2
            final GameView this$0;

            {
                this.this$0 = this;
            }

            private boolean checkEglError(String str, EGL10 egl10) {
                boolean z = false;
                while (true) {
                    boolean z2 = z;
                    int eglGetError = egl10.eglGetError();
                    if (eglGetError == 12288) {
                        return z2;
                    }
                    Logging.logError(GameView.TAG, String.format("%s: EGL error: 0x%x", str, Integer.valueOf(eglGetError)));
                    z = true;
                }
            }

            private EGLContext createContextWithVersion(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
                String str = GameView.TAG;
                Logging.logWarning(str, String.format("Attempt at creation of OpenGL ES %d context", Integer.valueOf(i)));
                if (checkEglError("Before eglCreateContext", egl10)) {
                    Logging.logError(str, "Can't create context, EGL had errors before attempting to use it");
                    return null;
                }
                EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, i, 12344});
                if (checkEglError("After eglCreateContext", egl10)) {
                    Logging.logWarning(str, String.format("Failed to create OpenGL ES %d context", Integer.valueOf(i)));
                    return null;
                }
                Logging.logWarning(str, String.format("Successfully created OpenGL ES %d context", Integer.valueOf(i)));
                return eglCreateContext;
            }

            @Override // android.opengl.GLSurfaceView.EGLContextFactory
            public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
                Logging.logWarning(GameView.TAG, "creating OpenGL ES context");
                checkEglError("Before eglCreateContext", egl10);
                EGLContext createContextWithVersion = this.this$0.mInitializationOptions.mAttemptGLES3 ? createContextWithVersion(egl10, eGLDisplay, eGLConfig, 3) : null;
                EGLContext eGLContext = createContextWithVersion;
                if (createContextWithVersion == null) {
                    this.this$0.mOpenGLES3AttemptSuccess = false;
                    eGLContext = createContextWithVersion(egl10, eGLDisplay, eGLConfig, 2);
                }
                return eGLContext;
            }

            @Override // android.opengl.GLSurfaceView.EGLContextFactory
            public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
                egl10.eglDestroyContext(eGLDisplay, eGLContext);
            }
        };
        ConfigChooser configChooser = new ConfigChooser();
        configChooser.setSamples(platformSetup.getMSAASamples());
        GLSurfaceView.Renderer gameRenderer = new GameRenderer(this, this.mNativeApplication, configChooser, this.mPlatformSetup);
        setEGLContextFactory(eGLContextFactory);
        setEGLConfigChooser(configChooser);
        setRenderer(gameRenderer);
    }

    public boolean isKeyboardShowing() {
        return this.mKeyboardShowing.get();
    }

    public boolean isUsingFallbackRenderer() {
        return this.mInitializationOptions.mAttemptGLES3 && !this.mOpenGLES3AttemptSuccess;
    }

    public void notifyKeyboardVisible(boolean z) {
        this.mKeyboardShowing.set(z);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        Logging.logInfo(TAG, "onCreateInputConnection in GameView.java mKeyboardType: " + this.mKeyboardType);
        editorInfo.inputType = getInputType();
        editorInfo.imeOptions = DriveFile.MODE_READ_ONLY;
        editorInfo.imeOptions = 268435456 | TextInput.ReturnKey.toImeAction(this.mReturnKey);
        return this.mInputConnection;
    }

    @Override // android.view.View
    @TargetApi(12)
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 8) {
            return super.onGenericMotionEvent(motionEvent);
        }
        final int x = (int) motionEvent.getX();
        final int y = (int) motionEvent.getY();
        final int axisValue = (int) (motionEvent.getAxisValue(9) * 120.0f);
        queueEvent(new Runnable(this, x, y, axisValue) { // from class: com.king.core.GameView$$ExternalSyntheticLambda3
            public final GameView f$0;
            public final int f$1;
            public final int f$2;
            public final int f$3;

            {
                this.f$0 = this;
                this.f$1 = x;
                this.f$2 = y;
                this.f$3 = axisValue;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onGenericMotionEvent$1(this.f$1, this.f$2, this.f$3);
            }
        });
        return true;
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        Logging.logInfo(TAG, "GameView.onResume()");
        setRenderMode(1);
        super.onResume();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        if (r13 < 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        r4 = r10.getPointerId(r14);
        r5 = r13;
        r6 = (int) r0;
        r7 = (int) r0;
        queueEvent(new com.king.core.GameView$$ExternalSyntheticLambda1(r9, r4, r5, r6, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
    
        if (r15 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        return true;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            r0 = 0
            r14 = r0
        L3:
            r0 = r14
            r1 = r10
            int r1 = r1.getPointerCount()
            if (r0 >= r1) goto Lbe
            r0 = r10
            int r0 = r0.getActionMasked()
            r13 = r0
            r0 = r13
            r1 = 5
            if (r0 == r1) goto L25
            r0 = r13
            r1 = 6
            if (r0 == r1) goto L25
            r0 = 0
            r15 = r0
            goto L28
        L25:
            r0 = 1
            r15 = r0
        L28:
            r0 = r15
            if (r0 == 0) goto L39
            r0 = r14
            r1 = r10
            int r1 = r1.getActionIndex()
            if (r0 == r1) goto L39
            goto Lb8
        L39:
            r0 = r10
            r1 = r14
            float r0 = r0.getX(r1)
            r12 = r0
            r0 = r10
            r1 = r14
            float r0 = r0.getY(r1)
            r11 = r0
            r0 = r10
            int r0 = r0.getActionMasked()
            r16 = r0
            r0 = 2
            r13 = r0
            r0 = r16
            switch(r0) {
                case 0: goto L88;
                case 1: goto L82;
                case 2: goto L7f;
                case 3: goto L8e;
                case 4: goto L7f;
                case 5: goto L88;
                case 6: goto L82;
                default: goto L7c;
            }
        L7c:
            r0 = -1
            r13 = r0
        L7f:
            goto L94
        L82:
            r0 = 1
            r13 = r0
            goto L94
        L88:
            r0 = 0
            r13 = r0
            goto L94
        L8e:
            r0 = 3
            r13 = r0
            goto L7f
        L94:
            r0 = r13
            if (r0 < 0) goto Lb1
            r0 = r9
            com.king.core.GameView$$ExternalSyntheticLambda1 r1 = new com.king.core.GameView$$ExternalSyntheticLambda1
            r2 = r1
            r3 = r9
            r4 = r10
            r5 = r14
            int r4 = r4.getPointerId(r5)
            r5 = r13
            r6 = r12
            int r6 = (int) r6
            r7 = r11
            int r7 = (int) r7
            r2.<init>(r3, r4, r5, r6, r7)
            r0.queueEvent(r1)
        Lb1:
            r0 = r15
            if (r0 == 0) goto Lb8
            r0 = 1
            return r0
        Lb8:
            int r14 = r14 + 1
            goto L3
        Lbe:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.king.core.GameView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestApplicationMinimization() {
        this.mActivity.runOnUiThread(new Runnable(this) { // from class: com.king.core.GameView$$ExternalSyntheticLambda2
            public final GameView f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$requestApplicationMinimization$0();
            }
        });
    }

    public void restoreKeyboardVisibility() {
        if (this.mKeyboardShowing.get()) {
            GameLib.justShowKeyboard();
        }
    }

    public void setCursorPosition(int i) {
        this.mInputConnection.setCursorPosition(i);
    }

    public void setEditableText(String str) {
        this.mInputConnection.getEditable().clear();
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        this.mInputConnection.commitText(str2, str2.length());
    }

    public void setKeyboardType(int i) {
        setKeyboardType(i, TextInput.ReturnKey.RETURN_KEY_DEFAULT.getId());
    }

    public void setKeyboardType(int i, int i2) {
        TextInput.KeyboardType fromId = TextInput.KeyboardType.fromId(i);
        TextInput.ReturnKey fromId2 = TextInput.ReturnKey.fromId(i2);
        Logging.logInfo(TAG, "SetKeyboardType keyboardIntType: " + fromId + " returnIntKey: " + fromId2);
        if (this.mKeyboardType == fromId && this.mReturnKey == fromId2) {
            return;
        }
        TextInput.KeyboardType keyboardType = fromId;
        if (fromId == TextInput.KeyboardType.KEYBOARD_TYPE_EMAIL_ADDRESS) {
            keyboardType = fromId;
            if (isSamsung()) {
                keyboardType = TextInput.KeyboardType.KEYBOARD_TYPE_NORMAL;
            }
        }
        this.mKeyboardType = keyboardType;
        this.mReturnKey = fromId2;
        InputMethodManager inputMethodManager = (InputMethodManager) this.mActivity.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.restartInput(this);
        }
    }

    public void setTargetFps(int i) {
        Logging.logInfo(TAG, "setTargetFps " + i);
        PlatformSetup platformSetup = this.mPlatformSetup;
        if (platformSetup != null) {
            platformSetup.setTargetFps(i);
        }
    }
}
