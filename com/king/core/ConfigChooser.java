package com.king.core;

import android.opengl.GLSurfaceView;
import androidx.annotation.Keep;
import com.king.logging.Logging;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: Access modifiers changed from: package-private */
@Keep
/* loaded from: ConfigChooser.class */
public class ConfigChooser implements GLSurfaceView.EGLConfigChooser {
    private static final int EGL_OPENGL_ES2_BIT = 4;
    private int[] mConfigAttribs2;
    private ConfigSettings mCurrentConfig;
    private ConfigSettings[] mPreferredConfigs;

    /* loaded from: ConfigChooser$ConfigSettings.class */
    public class ConfigSettings {
        private int mAlphaSize;
        private int mBlueSize;
        private int mDepthSize;
        private int mGreenSize;
        private int mPixelFormat;
        private int mRedSize;
        private int mSamples;
        private int mStencilSize;
        final ConfigChooser this$0;

        public ConfigSettings(ConfigChooser configChooser, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.this$0 = configChooser;
            this.mRedSize = i;
            this.mGreenSize = i2;
            this.mBlueSize = i3;
            this.mAlphaSize = i4;
            this.mDepthSize = i5;
            this.mStencilSize = i6;
            this.mSamples = i7;
            this.mPixelFormat = i8;
        }

        public int getPixelFormat() {
            return this.mPixelFormat;
        }

        public int getSamples() {
            return this.mSamples;
        }

        public boolean isMatchingConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int findConfigAttrib = this.this$0.findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12325, 0);
            int findConfigAttrib2 = this.this$0.findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12326, 0);
            boolean z = false;
            if (findConfigAttrib >= this.mDepthSize) {
                if (findConfigAttrib2 < this.mStencilSize) {
                    z = false;
                } else {
                    int findConfigAttrib3 = this.this$0.findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12324, 0);
                    int findConfigAttrib4 = this.this$0.findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12323, 0);
                    int findConfigAttrib5 = this.this$0.findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12322, 0);
                    int findConfigAttrib6 = this.this$0.findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12321, 0);
                    z = false;
                    if (findConfigAttrib3 == this.mRedSize) {
                        z = false;
                        if (findConfigAttrib4 == this.mGreenSize) {
                            z = false;
                            if (findConfigAttrib5 == this.mBlueSize) {
                                z = false;
                                if (findConfigAttrib6 == this.mAlphaSize) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
            return z;
        }

        public String toString() {
            return String.format("ConfigSettings[%d, %d, %d, %d, %d, %d]", Integer.valueOf(this.mRedSize), Integer.valueOf(this.mGreenSize), Integer.valueOf(this.mBlueSize), Integer.valueOf(this.mAlphaSize), Integer.valueOf(this.mDepthSize), Integer.valueOf(this.mStencilSize));
        }
    }

    public ConfigChooser() {
        ConfigSettings[] configSettingsArr = {new ConfigSettings(this, 5, 6, 5, 0, 16, 8, 1, 4), new ConfigSettings(this, 8, 8, 8, 0, 16, 8, 1, 3)};
        this.mPreferredConfigs = configSettingsArr;
        this.mCurrentConfig = configSettingsArr[0];
        this.mConfigAttribs2 = new int[]{12338, 0, 12337, 0, 12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344};
    }

    private EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        for (int i = 0; i < this.mPreferredConfigs.length; i++) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                if (this.mPreferredConfigs[i].isMatchingConfig(egl10, eGLDisplay, eGLConfig)) {
                    this.mCurrentConfig = this.mPreferredConfigs[i];
                    return eGLConfig;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        int[] iArr = new int[1];
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr) ? iArr[0] : i2;
    }

    private void printConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        int[] iArr = new int[1];
        for (int i = 0; i < 33; i++) {
            int i2 = new int[]{12320, 12321, 12322, 12323, 12324, 12325, 12326, 12327, 12328, 12329, 12330, 12331, 12332, 12333, 12334, 12335, 12336, 12337, 12338, 12339, 12340, 12343, 12342, 12341, 12345, 12346, 12347, 12348, 12349, 12350, 12351, 12352, 12354}[i];
            String str = new String[]{"EGL_BUFFER_SIZE", "EGL_ALPHA_SIZE", "EGL_BLUE_SIZE", "EGL_GREEN_SIZE", "EGL_RED_SIZE", "EGL_DEPTH_SIZE", "EGL_STENCIL_SIZE", "EGL_CONFIG_CAVEAT", "EGL_CONFIG_ID", "EGL_LEVEL", "EGL_MAX_PBUFFER_HEIGHT", "EGL_MAX_PBUFFER_PIXELS", "EGL_MAX_PBUFFER_WIDTH", "EGL_NATIVE_RENDERABLE", "EGL_NATIVE_VISUAL_ID", "EGL_NATIVE_VISUAL_TYPE", "EGL_PRESERVED_RESOURCES", "EGL_SAMPLES", "EGL_SAMPLE_BUFFERS", "EGL_SURFACE_TYPE", "EGL_TRANSPARENT_TYPE", "EGL_TRANSPARENT_RED_VALUE", "EGL_TRANSPARENT_GREEN_VALUE", "EGL_TRANSPARENT_BLUE_VALUE", "EGL_BIND_TO_TEXTURE_RGB", "EGL_BIND_TO_TEXTURE_RGBA", "EGL_MIN_SWAP_INTERVAL", "EGL_MAX_SWAP_INTERVAL", "EGL_LUMINANCE_SIZE", "EGL_ALPHA_MASK_SIZE", "EGL_COLOR_BUFFER_TYPE", "EGL_RENDERABLE_TYPE", "EGL_CONFORMANT"}[i];
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i2, iArr)) {
                Logging.logWarning(GameView.TAG, String.format("  %s: %d%n", str, Integer.valueOf(iArr[0])));
            }
            do {
            } while (egl10.eglGetError() != 12288);
        }
    }

    private void printConfigs(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        int length = eGLConfigArr.length;
        Logging.logWarning(GameView.TAG, String.format("%d configurations", Integer.valueOf(length)));
        for (int i = 0; i < length; i++) {
            Logging.logWarning(GameView.TAG, String.format("Configuration %d:%n", Integer.valueOf(i)));
            printConfig(egl10, eGLDisplay, eGLConfigArr[i]);
        }
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] iArr = new int[1];
        egl10.eglChooseConfig(eGLDisplay, this.mConfigAttribs2, null, 0, iArr);
        int i = iArr[0];
        if (i <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        egl10.eglChooseConfig(eGLDisplay, this.mConfigAttribs2, eGLConfigArr, i, iArr);
        EGLConfig chooseConfig = chooseConfig(egl10, eGLDisplay, eGLConfigArr);
        if (chooseConfig != null) {
            return chooseConfig;
        }
        throw new IllegalArgumentException("No configs match configSpec");
    }

    public ConfigSettings getCurrent() {
        return this.mCurrentConfig;
    }

    public void setSamples(int i) {
        int[] iArr = this.mConfigAttribs2;
        iArr[1] = i > 0 ? 1 : 0;
        iArr[3] = i;
    }
}
