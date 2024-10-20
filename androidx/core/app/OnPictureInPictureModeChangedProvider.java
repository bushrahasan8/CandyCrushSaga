package androidx.core.app;

import androidx.core.util.Consumer;

/* loaded from: OnPictureInPictureModeChangedProvider.class */
public interface OnPictureInPictureModeChangedProvider {
    void addOnPictureInPictureModeChangedListener(Consumer consumer);

    void removeOnPictureInPictureModeChangedListener(Consumer consumer);
}
