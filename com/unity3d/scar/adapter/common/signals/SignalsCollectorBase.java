package com.unity3d.scar.adapter.common.signals;

import android.content.Context;
import com.unity3d.scar.adapter.common.DispatchGroup;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: SignalsCollectorBase.class */
public abstract class SignalsCollectorBase implements ISignalsCollector {

    /* renamed from: com.unity3d.scar.adapter.common.signals.SignalsCollectorBase$1, reason: invalid class name */
    /* loaded from: SignalsCollectorBase$1.class */
    static abstract /* synthetic */ class AnonymousClass1 {
        static final int[] $SwitchMap$com$unity3d$scar$adapter$common$scarads$UnityAdFormat;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x002f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.unity3d.scar.adapter.common.scarads.UnityAdFormat[] r0 = com.unity3d.scar.adapter.common.scarads.UnityAdFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.unity3d.scar.adapter.common.signals.SignalsCollectorBase.AnonymousClass1.$SwitchMap$com$unity3d$scar$adapter$common$scarads$UnityAdFormat = r0
                r0 = r4
                com.unity3d.scar.adapter.common.scarads.UnityAdFormat r1 = com.unity3d.scar.adapter.common.scarads.UnityAdFormat.BANNER     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = com.unity3d.scar.adapter.common.signals.SignalsCollectorBase.AnonymousClass1.$SwitchMap$com$unity3d$scar$adapter$common$scarads$UnityAdFormat     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                com.unity3d.scar.adapter.common.scarads.UnityAdFormat r1 = com.unity3d.scar.adapter.common.scarads.UnityAdFormat.INTERSTITIAL     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = com.unity3d.scar.adapter.common.signals.SignalsCollectorBase.AnonymousClass1.$SwitchMap$com$unity3d$scar$adapter$common$scarads$UnityAdFormat     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
                com.unity3d.scar.adapter.common.scarads.UnityAdFormat r1 = com.unity3d.scar.adapter.common.scarads.UnityAdFormat.REWARDED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L2a:
                return
            L2b:
                r4 = move-exception
                goto L14
            L2f:
                r4 = move-exception
                goto L1f
            L33:
                r4 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.scar.adapter.common.signals.SignalsCollectorBase.AnonymousClass1.m6456clinit():void");
        }
    }

    /* loaded from: SignalsCollectorBase$GMAScarDispatchCompleted.class */
    private class GMAScarDispatchCompleted implements Runnable {
        private ISignalCollectionListener _signalListener;
        private SignalsResult _signalsResult;
        final SignalsCollectorBase this$0;

        public GMAScarDispatchCompleted(SignalsCollectorBase signalsCollectorBase, ISignalCollectionListener iSignalCollectionListener, SignalsResult signalsResult) {
            this.this$0 = signalsCollectorBase;
            this._signalListener = iSignalCollectionListener;
            this._signalsResult = signalsResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map signalsMap = this._signalsResult.getSignalsMap();
            if (signalsMap.size() > 0) {
                this._signalListener.onSignalsCollected(new JSONObject(signalsMap).toString());
            } else if (this._signalsResult.getErrorMessage() == null) {
                this._signalListener.onSignalsCollected("");
            } else {
                this._signalListener.onSignalsCollectionFailed(this._signalsResult.getErrorMessage());
            }
        }
    }

    public String getAdKey(UnityAdFormat unityAdFormat) {
        int i = AnonymousClass1.$SwitchMap$com$unity3d$scar$adapter$common$scarads$UnityAdFormat[unityAdFormat.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "" : "gmaScarBiddingRewardedSignal" : "gmaScarBiddingInterstitialSignal" : "gmaScarBiddingBannerSignal";
    }

    @Override // com.unity3d.scar.adapter.common.signals.ISignalsCollector
    public void getSCARBiddingSignals(Context context, boolean z, ISignalCollectionListener iSignalCollectionListener) {
        DispatchGroup dispatchGroup = new DispatchGroup();
        SignalsResult signalsResult = new SignalsResult();
        dispatchGroup.enter();
        getSCARSignalForHB(context, UnityAdFormat.INTERSTITIAL, dispatchGroup, signalsResult);
        dispatchGroup.enter();
        getSCARSignalForHB(context, UnityAdFormat.REWARDED, dispatchGroup, signalsResult);
        if (z) {
            dispatchGroup.enter();
            getSCARSignalForHB(context, UnityAdFormat.BANNER, dispatchGroup, signalsResult);
        }
        dispatchGroup.notify(new GMAScarDispatchCompleted(this, iSignalCollectionListener, signalsResult));
    }

    @Override // com.unity3d.scar.adapter.common.signals.ISignalsCollector
    public void getSCARSignal(Context context, String str, UnityAdFormat unityAdFormat, ISignalCollectionListener iSignalCollectionListener) {
        DispatchGroup dispatchGroup = new DispatchGroup();
        SignalsResult signalsResult = new SignalsResult();
        dispatchGroup.enter();
        getSCARSignal(context, str, unityAdFormat, dispatchGroup, signalsResult);
        dispatchGroup.notify(new GMAScarDispatchCompleted(this, iSignalCollectionListener, signalsResult));
    }

    public void onOperationNotSupported(String str, DispatchGroup dispatchGroup, SignalsResult signalsResult) {
        signalsResult.setErrorMessage(String.format("Operation Not supported: %s.", str));
        dispatchGroup.leave();
    }
}
