package com.google.ads.mediation.unity.eventadapters;

import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* loaded from: UnityInterstitialEventAdapter.class */
public class UnityInterstitialEventAdapter {
    final MediationInterstitialAdapter adapter;
    final MediationInterstitialListener listener;

    /* renamed from: com.google.ads.mediation.unity.eventadapters.UnityInterstitialEventAdapter$1, reason: invalid class name */
    /* loaded from: UnityInterstitialEventAdapter$1.class */
    static abstract /* synthetic */ class AnonymousClass1 {
        static final int[] $SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x004d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.google.ads.mediation.unity.UnityAdsAdapterUtils$AdEvent[] r0 = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.google.ads.mediation.unity.eventadapters.UnityInterstitialEventAdapter.AnonymousClass1.$SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent = r0
                r0 = r4
                com.google.ads.mediation.unity.UnityAdsAdapterUtils$AdEvent r1 = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.LOADED     // Catch: java.lang.NoSuchFieldError -> L41
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L41
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L41
            L14:
                int[] r0 = com.google.ads.mediation.unity.eventadapters.UnityInterstitialEventAdapter.AnonymousClass1.$SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent     // Catch: java.lang.NoSuchFieldError -> L41 java.lang.NoSuchFieldError -> L45
                com.google.ads.mediation.unity.UnityAdsAdapterUtils$AdEvent r1 = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.OPENED     // Catch: java.lang.NoSuchFieldError -> L45
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45
            L1f:
                int[] r0 = com.google.ads.mediation.unity.eventadapters.UnityInterstitialEventAdapter.AnonymousClass1.$SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent     // Catch: java.lang.NoSuchFieldError -> L45 java.lang.NoSuchFieldError -> L49
                com.google.ads.mediation.unity.UnityAdsAdapterUtils$AdEvent r1 = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.CLICKED     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L2a:
                int[] r0 = com.google.ads.mediation.unity.eventadapters.UnityInterstitialEventAdapter.AnonymousClass1.$SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent     // Catch: java.lang.NoSuchFieldError -> L49 java.lang.NoSuchFieldError -> L4d
                com.google.ads.mediation.unity.UnityAdsAdapterUtils$AdEvent r1 = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.CLOSED     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L35:
                int[] r0 = com.google.ads.mediation.unity.eventadapters.UnityInterstitialEventAdapter.AnonymousClass1.$SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent     // Catch: java.lang.NoSuchFieldError -> L4d java.lang.NoSuchFieldError -> L51
                com.google.ads.mediation.unity.UnityAdsAdapterUtils$AdEvent r1 = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION     // Catch: java.lang.NoSuchFieldError -> L51
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L51
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L51
            L40:
                return
            L41:
                r4 = move-exception
                goto L14
            L45:
                r4 = move-exception
                goto L1f
            L49:
                r4 = move-exception
                goto L2a
            L4d:
                r4 = move-exception
                goto L35
            L51:
                r4 = move-exception
                goto L40
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ads.mediation.unity.eventadapters.UnityInterstitialEventAdapter.AnonymousClass1.m265clinit():void");
        }
    }

    public UnityInterstitialEventAdapter(MediationInterstitialListener mediationInterstitialListener, MediationInterstitialAdapter mediationInterstitialAdapter) {
        this.listener = mediationInterstitialListener;
        this.adapter = mediationInterstitialAdapter;
    }

    public void sendAdEvent(UnityAdsAdapterUtils.AdEvent adEvent) {
        if (this.listener == null) {
            return;
        }
        int i = AnonymousClass1.$SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent[adEvent.ordinal()];
        if (i == 1) {
            this.listener.onAdLoaded(this.adapter);
            return;
        }
        if (i == 2) {
            this.listener.onAdOpened(this.adapter);
            return;
        }
        if (i == 3) {
            this.listener.onAdClicked(this.adapter);
        } else if (i == 4) {
            this.listener.onAdClosed(this.adapter);
        } else {
            if (i != 5) {
                return;
            }
            this.listener.onAdLeftApplication(this.adapter);
        }
    }
}
