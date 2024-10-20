package androidx.core.app;

import androidx.core.util.Consumer;

/* loaded from: OnMultiWindowModeChangedProvider.class */
public interface OnMultiWindowModeChangedProvider {
    void addOnMultiWindowModeChangedListener(Consumer consumer);

    void removeOnMultiWindowModeChangedListener(Consumer consumer);
}
