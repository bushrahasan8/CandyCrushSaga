package com.unity3d.ads.adplayer;

import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: AdPlayer.class */
public interface AdPlayer {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: AdPlayer$Companion.class */
    public static final class Companion {
        static final Companion $$INSTANCE = new Companion();
        private static final MutableSharedFlow broadcastEventChannel = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

        private Companion() {
        }

        public final MutableSharedFlow getBroadcastEventChannel() {
            return broadcastEventChannel;
        }
    }

    /* loaded from: AdPlayer$DefaultImpls.class */
    public static final class DefaultImpls {
        public static Object destroy(AdPlayer adPlayer, Continuation<? super Unit> continuation) {
            CoroutineScopeKt.cancel$default(adPlayer.getScope(), null, 1, null);
            return Unit.INSTANCE;
        }

        public static void show(AdPlayer adPlayer, ShowOptions showOptions) {
            Intrinsics.checkNotNullParameter(showOptions, "showOptions");
            throw new NotImplementedError(null, 1, null);
        }
    }

    Object destroy(Continuation<? super Unit> continuation);

    void dispatchShowCompleted();

    Flow getOnLoadEvent();

    Flow getOnShowEvent();

    CoroutineScope getScope();

    Flow getUpdateCampaignState();

    WebViewContainer getWebViewContainer();

    Object onAllowedPiiChange(byte[] bArr, Continuation<? super Unit> continuation);

    Object onBroadcastEvent(String str, Continuation<? super Unit> continuation);

    Object requestShow(Map<String, ? extends Object> map, Continuation<? super Unit> continuation);

    Object sendFocusChange(boolean z, Continuation<? super Unit> continuation);

    Object sendMuteChange(boolean z, Continuation<? super Unit> continuation);

    Object sendPrivacyFsmChange(byte[] bArr, Continuation<? super Unit> continuation);

    Object sendUserConsentChange(byte[] bArr, Continuation<? super Unit> continuation);

    Object sendVisibilityChange(boolean z, Continuation<? super Unit> continuation);

    Object sendVolumeChange(double d, Continuation<? super Unit> continuation);

    void show(ShowOptions showOptions);
}
