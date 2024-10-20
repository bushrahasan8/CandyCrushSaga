package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.AdPlayer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: EmbeddableAdPlayer.class */
public interface EmbeddableAdPlayer extends AdPlayer {

    /* loaded from: EmbeddableAdPlayer$DefaultImpls.class */
    public static final class DefaultImpls {
        public static Object destroy(EmbeddableAdPlayer embeddableAdPlayer, Continuation<? super Unit> continuation) {
            Object destroy = AdPlayer.DefaultImpls.destroy(embeddableAdPlayer, continuation);
            return destroy == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? destroy : Unit.INSTANCE;
        }

        public static void show(EmbeddableAdPlayer embeddableAdPlayer, ShowOptions showOptions) {
            Intrinsics.checkNotNullParameter(showOptions, "showOptions");
            AdPlayer.DefaultImpls.show(embeddableAdPlayer, showOptions);
        }
    }
}
