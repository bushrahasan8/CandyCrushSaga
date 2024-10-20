package androidx.transition;

import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$$ExternalSyntheticThrowCCEIfNotNull0;
import android.view.ViewGroup;

/* loaded from: Scene.class */
public abstract class Scene {
    public static Scene getCurrentScene(ViewGroup viewGroup) {
        MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$$ExternalSyntheticThrowCCEIfNotNull0.m(viewGroup.getTag(R$id.transition_current_scene));
        return null;
    }

    public static void setCurrentScene(ViewGroup viewGroup, Scene scene) {
        viewGroup.setTag(R$id.transition_current_scene, scene);
    }
}
