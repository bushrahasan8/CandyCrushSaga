package com.bumptech.glide.gifdecoder;

import java.util.ArrayList;
import java.util.List;

/* loaded from: GifHeader.class */
public class GifHeader {
    int bgColor;
    int bgIndex;
    GifFrame currentFrame;
    boolean gctFlag;
    int gctSize;
    int height;
    int pixelAspect;
    int width;
    int[] gct = null;
    int status = 0;
    int frameCount = 0;
    final List frames = new ArrayList();
    int loopCount = -1;

    public int getHeight() {
        return this.height;
    }

    public int getNumFrames() {
        return this.frameCount;
    }

    public int getStatus() {
        return this.status;
    }

    public int getWidth() {
        return this.width;
    }
}
