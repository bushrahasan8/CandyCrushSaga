package androidx.core.content;

import androidx.core.util.Consumer;

/* loaded from: OnTrimMemoryProvider.class */
public interface OnTrimMemoryProvider {
    void addOnTrimMemoryListener(Consumer consumer);

    void removeOnTrimMemoryListener(Consumer consumer);
}
