package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.AdPlayer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: FullscreenAdPlayer.class */
public interface FullscreenAdPlayer extends AdPlayer {

    /* loaded from: FullscreenAdPlayer$DefaultImpls.class */
    public static final class DefaultImpls {
        public static Object destroy(FullscreenAdPlayer fullscreenAdPlayer, Continuation<? super Unit> continuation) {
            Object destroy = AdPlayer.DefaultImpls.destroy(fullscreenAdPlayer, continuation);
            return destroy == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? destroy : Unit.INSTANCE;
        }

        public static void show(FullscreenAdPlayer fullscreenAdPlayer, ShowOptions showOptions) {
            Intrinsics.checkNotNullParameter(showOptions, "showOptions");
            AdPlayer.DefaultImpls.show(fullscreenAdPlayer, showOptions);
        }
    }
}
