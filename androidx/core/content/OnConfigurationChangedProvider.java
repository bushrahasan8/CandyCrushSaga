package androidx.core.content;

import androidx.core.util.Consumer;

/* loaded from: OnConfigurationChangedProvider.class */
public interface OnConfigurationChangedProvider {
    void addOnConfigurationChangedListener(Consumer consumer);

    void removeOnConfigurationChangedListener(Consumer consumer);
}
