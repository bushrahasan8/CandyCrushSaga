package com.bumptech.glide.provider;

import com.bumptech.glide.load.Encoder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: EncoderRegistry.class */
public class EncoderRegistry {
    private final List encoders = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: EncoderRegistry$Entry.class */
    public static final class Entry {
        private final Class dataClass;
        final Encoder encoder;

        Entry(Class cls, Encoder encoder) {
            this.dataClass = cls;
            this.encoder = encoder;
        }

        boolean handles(Class cls) {
            return this.dataClass.isAssignableFrom(cls);
        }
    }

    public void append(Class cls, Encoder encoder) {
        synchronized (this) {
            this.encoders.add(new Entry(cls, encoder));
        }
    }

    public Encoder getEncoder(Class cls) {
        synchronized (this) {
            for (Entry entry : this.encoders) {
                if (entry.handles(cls)) {
                    return entry.encoder;
                }
            }
            return null;
        }
    }
}
