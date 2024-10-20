package com.facebook.internal;

import android.R;
import com.facebook.FacebookSdk;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: FeatureManager.class */
public final class FeatureManager {
    public static final FeatureManager INSTANCE = new FeatureManager();
    private static final Map featureMapping = new HashMap();

    /* loaded from: FeatureManager$Callback.class */
    public interface Callback {
        void onCompleted(boolean z);
    }

    /* loaded from: FeatureManager$Feature.class */
    public enum Feature {
        Unknown(-1),
        Core(0),
        AppEvents(ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(MetadataChangeSet.INDEXABLE_TEXT_SIZE_LIMIT_BYTES),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        ServiceUpdateCompliance(196864),
        Megatron(262144),
        Elora(327680),
        Login(16777216),
        ChromeCustomTabsPrefetching(R.attr.theme),
        IgnoreAppSwitchToLoggedOut(R.id.background),
        BypassAppSwitch(R.style.Animation),
        Share(33554432);

        public static final Companion Companion = new Companion(null);
        private final int code;

        /* loaded from: FeatureManager$Feature$Companion.class */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Feature fromInt(int i) {
                for (Feature feature : Feature.values()) {
                    if (feature.code == i) {
                        return feature;
                    }
                }
                return Feature.Unknown;
            }
        }

        /* loaded from: FeatureManager$Feature$WhenMappings.class */
        public abstract /* synthetic */ class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Feature.values().length];
                try {
                    iArr[Feature.Core.ordinal()] = 1;
                } catch (NoSuchFieldError e) {
                }
                try {
                    iArr[Feature.AppEvents.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                }
                try {
                    iArr[Feature.CodelessEvents.ordinal()] = 3;
                } catch (NoSuchFieldError e3) {
                }
                try {
                    iArr[Feature.RestrictiveDataFiltering.ordinal()] = 4;
                } catch (NoSuchFieldError e4) {
                }
                try {
                    iArr[Feature.Instrument.ordinal()] = 5;
                } catch (NoSuchFieldError e5) {
                }
                try {
                    iArr[Feature.CrashReport.ordinal()] = 6;
                } catch (NoSuchFieldError e6) {
                }
                try {
                    iArr[Feature.CrashShield.ordinal()] = 7;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[Feature.ThreadCheck.ordinal()] = 8;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[Feature.ErrorReport.ordinal()] = 9;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[Feature.AnrReport.ordinal()] = 10;
                } catch (NoSuchFieldError e10) {
                }
                try {
                    iArr[Feature.AAM.ordinal()] = 11;
                } catch (NoSuchFieldError e11) {
                }
                try {
                    iArr[Feature.CloudBridge.ordinal()] = 12;
                } catch (NoSuchFieldError e12) {
                }
                try {
                    iArr[Feature.PrivacyProtection.ordinal()] = 13;
                } catch (NoSuchFieldError e13) {
                }
                try {
                    iArr[Feature.SuggestedEvents.ordinal()] = 14;
                } catch (NoSuchFieldError e14) {
                }
                try {
                    iArr[Feature.IntelligentIntegrity.ordinal()] = 15;
                } catch (NoSuchFieldError e15) {
                }
                try {
                    iArr[Feature.ModelRequest.ordinal()] = 16;
                } catch (NoSuchFieldError e16) {
                }
                try {
                    iArr[Feature.EventDeactivation.ordinal()] = 17;
                } catch (NoSuchFieldError e17) {
                }
                try {
                    iArr[Feature.OnDeviceEventProcessing.ordinal()] = 18;
                } catch (NoSuchFieldError e18) {
                }
                try {
                    iArr[Feature.OnDevicePostInstallEventProcessing.ordinal()] = 19;
                } catch (NoSuchFieldError e19) {
                }
                try {
                    iArr[Feature.IapLogging.ordinal()] = 20;
                } catch (NoSuchFieldError e20) {
                }
                try {
                    iArr[Feature.IapLoggingLib2.ordinal()] = 21;
                } catch (NoSuchFieldError e21) {
                }
                try {
                    iArr[Feature.Monitoring.ordinal()] = 22;
                } catch (NoSuchFieldError e22) {
                }
                try {
                    iArr[Feature.ServiceUpdateCompliance.ordinal()] = 23;
                } catch (NoSuchFieldError e23) {
                }
                try {
                    iArr[Feature.Megatron.ordinal()] = 24;
                } catch (NoSuchFieldError e24) {
                }
                try {
                    iArr[Feature.Elora.ordinal()] = 25;
                } catch (NoSuchFieldError e25) {
                }
                try {
                    iArr[Feature.Login.ordinal()] = 26;
                } catch (NoSuchFieldError e26) {
                }
                try {
                    iArr[Feature.ChromeCustomTabsPrefetching.ordinal()] = 27;
                } catch (NoSuchFieldError e27) {
                }
                try {
                    iArr[Feature.IgnoreAppSwitchToLoggedOut.ordinal()] = 28;
                } catch (NoSuchFieldError e28) {
                }
                try {
                    iArr[Feature.BypassAppSwitch.ordinal()] = 29;
                } catch (NoSuchFieldError e29) {
                }
                try {
                    iArr[Feature.Share.ordinal()] = 30;
                } catch (NoSuchFieldError e30) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        Feature(int i) {
            this.code = i;
        }

        public final Feature getParent() {
            int i = this.code;
            return (i & 255) > 0 ? Companion.fromInt(i & (-256)) : (65280 & i) > 0 ? Companion.fromInt(i & (-65536)) : (16711680 & i) > 0 ? Companion.fromInt(i & (-16777216)) : Companion.fromInt(0);
        }

        public final String toKey() {
            return "FBSDKFeature" + this;
        }

        @Override // java.lang.Enum
        public String toString() {
            String str;
            switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                    str = "CoreKit";
                    break;
                case 2:
                    str = "AppEvents";
                    break;
                case 3:
                    str = "CodelessEvents";
                    break;
                case 4:
                    str = "RestrictiveDataFiltering";
                    break;
                case 5:
                    str = "Instrument";
                    break;
                case 6:
                    str = "CrashReport";
                    break;
                case 7:
                    str = "CrashShield";
                    break;
                case 8:
                    str = "ThreadCheck";
                    break;
                case 9:
                    str = "ErrorReport";
                    break;
                case 10:
                    str = "AnrReport";
                    break;
                case 11:
                    str = "AAM";
                    break;
                case 12:
                    str = "AppEventsCloudbridge";
                    break;
                case 13:
                    str = "PrivacyProtection";
                    break;
                case 14:
                    str = "SuggestedEvents";
                    break;
                case 15:
                    str = "IntelligentIntegrity";
                    break;
                case 16:
                    str = "ModelRequest";
                    break;
                case 17:
                    str = "EventDeactivation";
                    break;
                case 18:
                    str = "OnDeviceEventProcessing";
                    break;
                case 19:
                    str = "OnDevicePostInstallEventProcessing";
                    break;
                case 20:
                    str = "IAPLogging";
                    break;
                case 21:
                    str = "IAPLoggingLib2";
                    break;
                case 22:
                    str = "Monitoring";
                    break;
                case 23:
                    str = "ServiceUpdateCompliance";
                    break;
                case 24:
                    str = "Megatron";
                    break;
                case VIEW_NOT_VISIBLE_ON_PLAY_VALUE:
                    str = "Elora";
                    break;
                case MRAID_DOWNLOAD_JS_RETRY_SUCCESS_VALUE:
                    str = "LoginKit";
                    break;
                case OMSDK_DOWNLOAD_JS_RETRY_SUCCESS_VALUE:
                    str = "ChromeCustomTabsPrefetching";
                    break;
                case PRIVACY_URL_OPENED_VALUE:
                    str = "IgnoreAppSwitchToLoggedOut";
                    break;
                case NOTIFICATION_REDIRECT_VALUE:
                    str = "BypassAppSwitch";
                    break;
                case 30:
                    str = "ShareKit";
                    break;
                default:
                    str = "unknown";
                    break;
            }
            return str;
        }
    }

    /* loaded from: FeatureManager$WhenMappings.class */
    public abstract /* synthetic */ class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Feature.values().length];
            try {
                iArr[Feature.RestrictiveDataFiltering.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Feature.Instrument.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Feature.CrashReport.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[Feature.CrashShield.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[Feature.ThreadCheck.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[Feature.ErrorReport.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[Feature.AnrReport.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Feature.AAM.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Feature.CloudBridge.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[Feature.PrivacyProtection.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[Feature.SuggestedEvents.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[Feature.IntelligentIntegrity.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[Feature.ModelRequest.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[Feature.EventDeactivation.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr[Feature.OnDeviceEventProcessing.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr[Feature.OnDevicePostInstallEventProcessing.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
            }
            try {
                iArr[Feature.IapLogging.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
            }
            try {
                iArr[Feature.IapLoggingLib2.ordinal()] = 18;
            } catch (NoSuchFieldError e18) {
            }
            try {
                iArr[Feature.ChromeCustomTabsPrefetching.ordinal()] = 19;
            } catch (NoSuchFieldError e19) {
            }
            try {
                iArr[Feature.Monitoring.ordinal()] = 20;
            } catch (NoSuchFieldError e20) {
            }
            try {
                iArr[Feature.Megatron.ordinal()] = 21;
            } catch (NoSuchFieldError e21) {
            }
            try {
                iArr[Feature.Elora.ordinal()] = 22;
            } catch (NoSuchFieldError e22) {
            }
            try {
                iArr[Feature.IgnoreAppSwitchToLoggedOut.ordinal()] = 23;
            } catch (NoSuchFieldError e23) {
            }
            try {
                iArr[Feature.BypassAppSwitch.ordinal()] = 24;
            } catch (NoSuchFieldError e24) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private FeatureManager() {
    }

    public static final void checkFeature(final Feature feature, final Callback callback) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FetchedAppGateKeepersManager.loadAppGateKeepersAsync(new FetchedAppGateKeepersManager.Callback(callback, feature) { // from class: com.facebook.internal.FeatureManager$checkFeature$1
            final FeatureManager.Callback $callback;
            final FeatureManager.Feature $feature;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.$callback = callback;
                this.$feature = feature;
            }

            @Override // com.facebook.internal.FetchedAppGateKeepersManager.Callback
            public void onCompleted() {
                this.$callback.onCompleted(FeatureManager.isEnabled(this.$feature));
            }
        });
    }

    private final boolean defaultStatus(Feature feature) {
        boolean z;
        switch (WhenMappings.$EnumSwitchMapping$0[feature.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                z = false;
                break;
            default:
                z = true;
                break;
        }
        return z;
    }

    public static final void disableFeature(Feature feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(feature.toKey(), FacebookSdk.getSdkVersion()).apply();
    }

    public static final Feature getFeature(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        INSTANCE.initializeFeatureMapping();
        for (Map.Entry entry : featureMapping.entrySet()) {
            Feature feature = (Feature) entry.getKey();
            for (String str : (String[]) entry.getValue()) {
                if (StringsKt.startsWith$default(className, str, false, 2, (Object) null)) {
                    return feature;
                }
            }
        }
        return Feature.Unknown;
    }

    private final boolean getGKStatus(Feature feature) {
        return FetchedAppGateKeepersManager.getGateKeeperForKey(feature.toKey(), FacebookSdk.getApplicationId(), defaultStatus(feature));
    }

    private final void initializeFeatureMapping() {
        synchronized (this) {
            Map map = featureMapping;
            if (map.isEmpty()) {
                map.put(Feature.AAM, new String[]{"com.facebook.appevents.aam."});
                map.put(Feature.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                map.put(Feature.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
                map.put(Feature.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                map.put(Feature.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                map.put(Feature.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                map.put(Feature.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                map.put(Feature.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                map.put(Feature.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                map.put(Feature.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                map.put(Feature.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                map.put(Feature.IapLogging, new String[]{"com.facebook.appevents.iap."});
                map.put(Feature.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
            }
        }
    }

    public static final boolean isEnabled(Feature feature) {
        boolean z;
        Intrinsics.checkNotNullParameter(feature, "feature");
        if (Feature.Unknown == feature) {
            return false;
        }
        if (Feature.Core == feature) {
            return true;
        }
        String string = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(feature.toKey(), null);
        if (string != null && Intrinsics.areEqual(string, FacebookSdk.getSdkVersion())) {
            return false;
        }
        Feature parent = feature.getParent();
        if (parent == feature) {
            z = INSTANCE.getGKStatus(feature);
        } else {
            z = false;
            if (isEnabled(parent)) {
                z = false;
                if (INSTANCE.getGKStatus(feature)) {
                    z = true;
                }
            }
        }
        return z;
    }
}
