package com.king.device;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Point;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.annotation.Keep;
import androidx.work.impl.utils.NetworkApi24$;
import com.applovin.impl.d4$;
import com.king.usdk.logger.Logger;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;

@Keep
/* loaded from: DeviceImpl.class */
public class DeviceImpl {
    private static final int USDK_CELLULAR_NETWORK_TYPE_CDMA = 3;
    private static final int USDK_CELLULAR_NETWORK_TYPE_EDGE = 4;
    private static final int USDK_CELLULAR_NETWORK_TYPE_EDVO0 = 6;
    private static final int USDK_CELLULAR_NETWORK_TYPE_EDVOA = 7;
    private static final int USDK_CELLULAR_NETWORK_TYPE_EDVOB = 8;
    private static final int USDK_CELLULAR_NETWORK_TYPE_EDVOC = 9;
    private static final int USDK_CELLULAR_NETWORK_TYPE_EHRPD = 5;
    private static final int USDK_CELLULAR_NETWORK_TYPE_GPRS = 10;
    private static final int USDK_CELLULAR_NETWORK_TYPE_GSM = 11;
    private static final int USDK_CELLULAR_NETWORK_TYPE_HSDPA = 14;
    private static final int USDK_CELLULAR_NETWORK_TYPE_HSPA = 12;
    private static final int USDK_CELLULAR_NETWORK_TYPE_HSPAP = 13;
    private static final int USDK_CELLULAR_NETWORK_TYPE_HSUPA = 15;
    private static final int USDK_CELLULAR_NETWORK_TYPE_IDEN = 16;
    private static final int USDK_CELLULAR_NETWORK_TYPE_IWLAN = 17;
    private static final int USDK_CELLULAR_NETWORK_TYPE_LTE = 18;
    private static final int USDK_CELLULAR_NETWORK_TYPE_NONE = 0;
    private static final int USDK_CELLULAR_NETWORK_TYPE_ONEXRTT = 2;
    private static final int USDK_CELLULAR_NETWORK_TYPE_TDSCDMA = 19;
    private static final int USDK_CELLULAR_NETWORK_TYPE_UMTS = 20;
    private static final int USDK_CELLULAR_NETWORK_TYPE_UNKNOWN = 1;
    private static final int USDK_NETWORK_TYPE_CELLULAR = 1;
    private static final int USDK_NETWORK_TYPE_ETHERNET = 3;
    private static final int USDK_NETWORK_TYPE_OFFLINE = 0;
    private static final int USDK_NETWORK_TYPE_UNKNOWN = 4;
    private static final int USDK_NETWORK_TYPE_WIFI = 2;
    private static volatile boolean cacheIsInternetReachable = false;
    private static volatile int cacheNetworkType = 4;
    private static Context mContext;
    private final AudioManager mAudioManager;
    private final String mClassName = "[com.king.device.DeviceImpl] ";
    private final long mDeviceState;
    private final BroadcastReceiver mLocaleReceiver;
    private final Logger mLogger;
    private final BroadcastReceiver mTimeZoneReceiver;

    /* loaded from: DeviceImpl$LocaleReceiver.class */
    private class LocaleReceiver extends BroadcastReceiver {
        final DeviceImpl this$0;

        private LocaleReceiver(DeviceImpl deviceImpl) {
            this.this$0 = deviceImpl;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            this.this$0.onLocaleChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: DeviceImpl$NetworkConnectivityStatus.class */
    public static class NetworkConnectivityStatus {
        private volatile boolean callbacksEnabled = false;
        private final AtomicBoolean updateReachabilityFlag = new AtomicBoolean(true);
        private final AtomicBoolean updateNetworkTypeFlag = new AtomicBoolean(true);

        public NetworkConnectivityStatus() {
            if (Build.VERSION.SDK_INT >= 24) {
                registerCallbacks();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void invalidateFlags() {
            this.updateNetworkTypeFlag.set(true);
            this.updateReachabilityFlag.set(true);
        }

        private void registerCallbacks() {
            NetworkApi24$.ExternalSyntheticApiModelOutline0.m((ConnectivityManager) DeviceImpl.mContext.getSystemService("connectivity"), new ConnectivityManager.NetworkCallback(this) { // from class: com.king.device.DeviceImpl.NetworkConnectivityStatus.1
                final NetworkConnectivityStatus this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    this.this$0.invalidateFlags();
                    super.onAvailable(network);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    this.this$0.invalidateFlags();
                    super.onCapabilitiesChanged(network, networkCapabilities);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                    this.this$0.invalidateFlags();
                    super.onLinkPropertiesChanged(network, linkProperties);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    this.this$0.invalidateFlags();
                    super.onLost(network);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onUnavailable() {
                    this.this$0.invalidateFlags();
                    super.onUnavailable();
                }
            });
            this.callbacksEnabled = true;
        }

        public boolean shouldUpdateNetworkType() {
            return this.updateNetworkTypeFlag.getAndSet(!this.callbacksEnabled);
        }

        public boolean shouldUpdateReachability() {
            return this.updateReachabilityFlag.getAndSet(!this.callbacksEnabled);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: DeviceImpl$NetworkConnectivityStatusHolder.class */
    public static abstract class NetworkConnectivityStatusHolder {
        static final NetworkConnectivityStatus INSTANCE = new NetworkConnectivityStatus();
    }

    /* loaded from: DeviceImpl$TimeZoneReceiver.class */
    private class TimeZoneReceiver extends BroadcastReceiver {
        final DeviceImpl this$0;

        private TimeZoneReceiver(DeviceImpl deviceImpl) {
            this.this$0 = deviceImpl;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            this.this$0.onTimeZoneChanged();
        }
    }

    public DeviceImpl(Activity activity, long j, long j2, boolean z) {
        DisplayMetrics displayMetrics;
        int i;
        int i2;
        int i3;
        WindowMetrics currentWindowMetrics;
        this.mLogger = new Logger(j2, z);
        Context applicationContext = activity.getApplicationContext();
        mContext = applicationContext;
        this.mAudioManager = (AudioManager) applicationContext.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.mLocaleReceiver = new LocaleReceiver();
        this.mTimeZoneReceiver = new TimeZoneReceiver();
        this.mDeviceState = j;
        TelephonyManager telephonyManager = (TelephonyManager) mContext.getSystemService("phone");
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            i = d4$.ExternalSyntheticApiModelOutline3.m(currentWindowMetrics).width();
            i2 = d4$.ExternalSyntheticApiModelOutline3.m(currentWindowMetrics).height();
            Configuration configuration = mContext.getResources().getConfiguration();
            displayMetrics = mContext.getResources().getDisplayMetrics();
            i3 = configuration.densityDpi;
        } else {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.x;
            i2 = point.y;
            i3 = displayMetrics.densityDpi;
        }
        setStatics(j, Build.VERSION.RELEASE, new int[]{i4, 0, 0}, Build.MANUFACTURER, Build.MODEL, 0, isTablet(activity), getDeviceId(activity), i, i2, i3, displayMetrics.xdpi, displayMetrics.ydpi, telephonyManager.getSimOperator(), telephonyManager.getSimOperatorName(), telephonyManager.getSimCountryIso());
    }

    private static int getCellularNetwork(int i) {
        switch (i) {
            case 1:
                return 10;
            case 2:
                return 4;
            case 3:
                return 20;
            case 4:
                return 3;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 2;
            case 8:
                return 14;
            case 9:
                return 15;
            case 10:
                return 12;
            case 11:
                return 16;
            case 12:
                return 8;
            case 13:
                return 18;
            case 14:
                return 5;
            case 15:
                return 13;
            case 16:
                return 11;
            case 17:
                return 19;
            case 18:
                return 17;
            default:
                return 1;
        }
    }

    private static String getDeviceId(Activity activity) {
        return Settings.Secure.getString(activity.getContentResolver(), "android_id");
    }

    private static NetworkConnectivityStatus getNetworkConnectivityStatus() {
        return NetworkConnectivityStatusHolder.INSTANCE;
    }

    public static int getNetworkType() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mContext.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 29) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return 0;
            }
            if (networkCapabilities.hasTransport(1)) {
                return 2;
            }
            return networkCapabilities.hasTransport(0) ? 1 : 4;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return 4;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return 1;
        }
        if (type != 1) {
            return !activeNetworkInfo.isConnected() ? 0 : 4;
        }
        return 2;
    }

    public static int getNetworkTypeCached() {
        if (getNetworkConnectivityStatus().shouldUpdateNetworkType()) {
            cacheNetworkType = getNetworkType();
        }
        return cacheNetworkType;
    }

    public static boolean isInternetReachable() {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) mContext.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT < 29) {
            for (NetworkInfo networkInfo : connectivityManager.getAllNetworkInfo()) {
                if (networkInfo.isConnected() && networkInfo.getType() != 17) {
                    return true;
                }
            }
            return false;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities != null) {
            z = true;
            if (!networkCapabilities.hasTransport(1)) {
                z = true;
                if (!networkCapabilities.hasTransport(0)) {
                    z = true;
                    if (!networkCapabilities.hasTransport(3)) {
                        if (networkCapabilities.hasTransport(2)) {
                            z = true;
                        }
                    }
                }
            }
            return z;
        }
        z = false;
        return z;
    }

    public static boolean isInternetReachableCached() {
        if (getNetworkConnectivityStatus().shouldUpdateReachability()) {
            cacheIsInternetReachable = isInternetReachable();
        }
        return cacheIsInternetReachable;
    }

    private static boolean isTablet(Activity activity) {
        return (activity.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    private static boolean isValidOperator(String str) {
        return (str == null || str.equals("") || str.equals("00000")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLocaleChanged() {
        String language = Locale.getDefault().getLanguage();
        String str = language;
        if (language.isEmpty()) {
            str = "en";
        }
        String country = Locale.getDefault().getCountry();
        String str2 = country;
        if (country.isEmpty()) {
            str2 = "US";
        }
        updateLocale(this.mDeviceState, str, str2, Locale.getDefault().getScript());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTimeZoneChanged() {
        TimeZone timeZone = TimeZone.getDefault();
        int offset = timeZone.getOffset(System.currentTimeMillis()) / 1000;
        int i = offset / 60;
        updateTimeZone(this.mDeviceState, offset, String.format(Locale.US, "GMT%+03d:%02d", Integer.valueOf(i / 60), Integer.valueOf(Math.abs(i) % 60)), timeZone.getDisplayName());
    }

    private native void setScreenInfo(long j, int i, int i2, float f, float f2);

    private native void setStatics(long j, String str, int[] iArr, String str2, String str3, int i, boolean z, String str4, int i2, int i3, int i4, float f, float f2, String str5, String str6, String str7);

    private native void updateLocale(long j, String str, String str2, String str3);

    private native void updateNetwork(long j, int i, boolean z, boolean z2);

    private native void updateOperator(long j, String str, String str2, String str3, int i, boolean z);

    private native void updateTimeZone(long j, int i, String str, String str2);

    public boolean detectHeadset() {
        if (!hasPermissionHeadset()) {
            this.mLogger.w("[com.king.device.DeviceImpl] : 'detectHeadset' was called even though hasPermissionHeadset is false.");
            return false;
        }
        AudioDeviceInfo[] devices = this.mAudioManager.getDevices(1);
        for (int i = 0; i < devices.length; i++) {
            if (devices[i].getType() == 7 || devices[i].getType() == 3 || devices[i].getType() == 4 || devices[i].getType() == 22) {
                return true;
            }
        }
        return false;
    }

    public float getHardwareOutputVolume() {
        return this.mAudioManager.getStreamVolume(3) / this.mAudioManager.getStreamMaxVolume(3);
    }

    public void getScreenInfo() {
        DisplayMetrics displayMetrics;
        int i;
        int i2;
        WindowMetrics currentWindowMetrics;
        WindowManager windowManager = (WindowManager) mContext.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            i2 = d4$.ExternalSyntheticApiModelOutline3.m(currentWindowMetrics).width();
            int height = d4$.ExternalSyntheticApiModelOutline3.m(currentWindowMetrics).height();
            mContext.getResources().getConfiguration();
            displayMetrics = mContext.getResources().getDisplayMetrics();
            i = height;
        } else {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i3 = point.x;
            i = point.y;
            i2 = i3;
        }
        setScreenInfo(this.mDeviceState, i2, i, displayMetrics.xdpi, displayMetrics.ydpi);
    }

    public boolean hasPermissionHeadset() {
        boolean z;
        if (mContext.checkCallingOrSelfPermission("android.permission.MODIFY_AUDIO_SETTINGS") != 0) {
            this.mLogger.i("[com.king.device.DeviceImpl] : Permission not granted to modify audio.");
            z = false;
        } else {
            z = true;
        }
        if (mContext.checkCallingOrSelfPermission("android.permission.BLUETOOTH") != 0) {
            this.mLogger.i("[com.king.device.DeviceImpl] : Permission not granted to access bluetooth.");
            z = false;
        }
        return z;
    }

    public void start() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        mContext.registerReceiver(this.mLocaleReceiver, intentFilter);
        onLocaleChanged();
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
        mContext.registerReceiver(this.mTimeZoneReceiver, intentFilter2);
        onTimeZoneChanged();
    }

    public void stop() {
        mContext.unregisterReceiver(this.mLocaleReceiver);
        mContext.unregisterReceiver(this.mTimeZoneReceiver);
    }
}
