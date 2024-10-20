package com.unity3d.ads.gl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: OffscreenSurface.class */
public final class OffscreenSurface extends EglSurfaceBase {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffscreenSurface(EglCore eglCore, int i, int i2) {
        super(eglCore);
        Intrinsics.checkNotNullParameter(eglCore, "eglCore");
        createOffscreenSurface(i, i2);
    }

    public final void release() {
        releaseEglSurface();
    }
}
