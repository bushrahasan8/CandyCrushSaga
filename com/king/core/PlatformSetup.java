package com.king.core;

import androidx.annotation.Keep;

@Keep
/* loaded from: PlatformSetup.class */
public class PlatformSetup {
    private int mHeight;
    private int mMSAASamples;
    private int mRotation;
    private int mTargetFps;
    private int mWidth;

    public PlatformSetup(int i, int i2, int i3, int i4, int i5) {
        this.mWidth = i;
        this.mHeight = i2;
        this.mRotation = i3;
        this.mTargetFps = i4;
        this.mMSAASamples = i5;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getMSAASamples() {
        return this.mMSAASamples;
    }

    public int getRotation() {
        return this.mRotation;
    }

    public int getTargetFps() {
        return this.mTargetFps;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void setTargetFps(int i) {
        this.mTargetFps = i;
    }
}
