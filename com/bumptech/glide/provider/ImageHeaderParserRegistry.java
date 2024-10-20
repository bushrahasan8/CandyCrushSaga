package com.bumptech.glide.provider;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: ImageHeaderParserRegistry.class */
public final class ImageHeaderParserRegistry {
    private final List parsers = new ArrayList();

    public void add(ImageHeaderParser imageHeaderParser) {
        synchronized (this) {
            this.parsers.add(imageHeaderParser);
        }
    }

    public List getParsers() {
        List list;
        synchronized (this) {
            list = this.parsers;
        }
        return list;
    }
}
