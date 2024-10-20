package com.vungle.ads;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import com.vungle.ads.internal.VungleInitializer;
import com.vungle.ads.internal.VungleInternal;
import com.vungle.ads.internal.network.VungleApiClient;
import java.util.HashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: VungleAds.class */
public final class VungleAds {
    public static final String TAG = "VungleAds";
    public static final Companion Companion = new Companion(null);
    private static VungleInternal vungleInternal = new VungleInternal();
    private static VungleInitializer initializer = new VungleInitializer();

    /* loaded from: VungleAds$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void deInit$vungle_ads_release() {
            VungleAds.initializer.deInit$vungle_ads_release();
        }

        public final String getBiddingToken(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return VungleAds.vungleInternal.getAvailableBidTokens(context);
        }

        public final String getSdkVersion() {
            return VungleAds.vungleInternal.getSdkVersion();
        }

        public final void init(Context context, String appId, InitializationListener callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Context context2 = context;
            if (!(context instanceof Application)) {
                context2 = context.getApplicationContext();
            }
            VungleInitializer vungleInitializer = VungleAds.initializer;
            Context appContext = context2;
            Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
            vungleInitializer.init(appId, context2, callback);
        }

        public final boolean isInitialized() {
            return VungleAds.initializer.isInitialized();
        }

        public final void setIntegrationName(WrapperFramework wrapperFramework, String wrapperFrameworkVersion) {
            String str;
            Intrinsics.checkNotNullParameter(wrapperFramework, "wrapperFramework");
            Intrinsics.checkNotNullParameter(wrapperFrameworkVersion, "wrapperFrameworkVersion");
            if (wrapperFramework != WrapperFramework.none) {
                VungleApiClient.Companion companion = VungleApiClient.Companion;
                companion.setWRAPPER_FRAMEWORK_SELECTED$vungle_ads_release(wrapperFramework);
                String headerUa = companion.getHeaderUa();
                if (wrapperFrameworkVersion.length() > 0) {
                    str = '/' + wrapperFrameworkVersion;
                } else {
                    str = "";
                }
                String str2 = wrapperFramework + str;
                if (new HashSet(StringsKt.split$default((CharSequence) headerUa, new String[]{";"}, false, 0, 6, (Object) null)).add(str2)) {
                    companion.setHeaderUa(headerUa + ';' + str2);
                }
            } else {
                Log.e(VungleAds.TAG, "Wrapper is null or is none");
            }
            if (isInitialized()) {
                Log.w(VungleAds.TAG, "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before");
            }
        }
    }

    @Keep
    /* loaded from: VungleAds$WrapperFramework.class */
    public enum WrapperFramework {
        admob,
        air,
        cocos2dx,
        corona,
        dfp,
        heyzap,
        marmalade,
        mopub,
        unity,
        fyber,
        ironsource,
        upsight,
        appodeal,
        aerserv,
        adtoapp,
        tapdaq,
        vunglehbs,
        max,
        none
    }

    public static final String getBiddingToken(Context context) {
        return Companion.getBiddingToken(context);
    }

    public static final String getSdkVersion() {
        return Companion.getSdkVersion();
    }

    public static final void init(Context context, String str, InitializationListener initializationListener) {
        Companion.init(context, str, initializationListener);
    }

    public static final boolean isInitialized() {
        return Companion.isInitialized();
    }

    public static final void setIntegrationName(WrapperFramework wrapperFramework, String str) {
        Companion.setIntegrationName(wrapperFramework, str);
    }
}
