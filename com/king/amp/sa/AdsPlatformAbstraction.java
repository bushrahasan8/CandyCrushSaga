package com.king.amp.sa;

import android.app.Activity;
import android.app.ActivityManager;
import android.media.AudioManager;
import android.net.NetworkInfo;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Debug;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.core.content.ContextCompat;
import com.king.amp.sa.google.GoogleAdvertisingIdSource;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Locale;

@Keep
/* loaded from: AdsPlatformAbstraction.class */
public final class AdsPlatformAbstraction {
    private static final String NETWORK_OPERATOR_UNAVAILABLE = "";
    private static final String OS_VERSION_UNAVAILABLE = "0.0";
    private static Activity sActivity;
    private static AdvertisingIdSource sAdIdSource = createAdvertisingIdSource();
    private static AttitudeManager sAttitudeManager;
    private static NetworkListener sNetworkListener;

    private AdsPlatformAbstraction(Activity activity) {
        sActivity = activity;
        if (sAttitudeManager == null) {
            sAttitudeManager = new AttitudeManager(activity);
        }
    }

    private static AdvertisingIdSource createAdvertisingIdSource() {
        try {
            return (AdvertisingIdSource) GoogleAdvertisingIdSource.class.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            return new DefaultAdvertisingIdSource();
        }
    }

    public static GLSurfaceView findSurfaceView(ViewGroup viewGroup) {
        GLSurfaceView findSurfaceView;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof GLSurfaceView) {
                return (GLSurfaceView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (findSurfaceView = findSurfaceView((ViewGroup) childAt)) != null) {
                return findSurfaceView;
            }
        }
        return null;
    }

    public static String getAdvertisingIdentifier() {
        return sAdIdSource.getAdvertisingIdentifier();
    }

    public static double[] getAttitude() {
        AttitudeManager attitudeManager = sAttitudeManager;
        if (attitudeManager != null) {
            if (attitudeManager.getAttitude().length >= 3) {
                return new double[]{-Math.toDegrees(r0[1]), Math.toDegrees(r0[2]), Math.toDegrees(r0[0])};
            }
        }
        return new double[]{0.0d, 0.0d, 0.0d};
    }

    public static String getBrowserUserAgent() {
        return System.getProperty("http.agent");
    }

    public static String getBundleId() {
        Activity activity = sActivity;
        return activity != null ? activity.getApplicationContext().getPackageName() : "";
    }

    public static String getCountryCode() {
        return Locale.getDefault().getCountry();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r7.isAvailable() == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.net.NetworkInfo getCurrentNetworkInfo() {
        /*
            android.app.Activity r0 = com.king.amp.sa.AdsPlatformAbstraction.sActivity
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            r7 = r0
            r0 = r7
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            r5 = r0
            r0 = r5
            r6 = r0
            r0 = r5
            if (r0 != 0) goto L9c
            r0 = r7
            android.net.NetworkInfo[] r0 = r0.getAllNetworkInfo()
            r8 = r0
            r0 = r5
            r6 = r0
            r0 = r8
            if (r0 == 0) goto L9c
            r0 = r8
            int r0 = r0.length
            r4 = r0
            r0 = 0
            r3 = r0
        L2d:
            r0 = r5
            r6 = r0
            r0 = r3
            r1 = r4
            if (r0 >= r1) goto L9c
            r0 = r8
            r1 = r3
            r0 = r0[r1]
            r6 = r0
            r0 = r6
            int r0 = r0.getType()
            r1 = 7
            if (r0 != r1) goto L48
            r0 = r5
            r7 = r0
            goto L93
        L48:
            r0 = r5
            r7 = r0
            r0 = r5
            if (r0 != 0) goto L5c
            r0 = r5
            r7 = r0
            r0 = r6
            int r0 = r0.getType()
            if (r0 != 0) goto L5c
            r0 = r6
            r7 = r0
        L5c:
            r0 = r7
            r5 = r0
            r0 = r6
            boolean r0 = r0.isAvailable()
            if (r0 == 0) goto L78
            r0 = r7
            if (r0 == 0) goto L76
            r0 = r7
            r5 = r0
            r0 = r7
            boolean r0 = r0.isAvailable()
            if (r0 != 0) goto L78
        L76:
            r0 = r6
            r5 = r0
        L78:
            r0 = r5
            r7 = r0
            r0 = r6
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L93
            r0 = r5
            if (r0 == 0) goto L90
            r0 = r5
            r7 = r0
            r0 = r5
            boolean r0 = r0.isConnected()
            if (r0 != 0) goto L93
        L90:
            goto L9c
        L93:
            int r3 = r3 + 1
            r0 = r7
            r5 = r0
            goto L2d
        L9c:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.king.amp.sa.AdsPlatformAbstraction.getCurrentNetworkInfo():android.net.NetworkInfo");
    }

    public static String getDeviceMake() {
        return Build.MANUFACTURER;
    }

    public static String getDeviceModel() {
        return Build.MODEL;
    }

    public static int getHeight() {
        Activity activity = sActivity;
        return (activity != null ? activity.getResources().getDisplayMetrics() : new DisplayMetrics()).heightPixels;
    }

    public static String getLanguageCode() {
        return Locale.getDefault().getLanguage();
    }

    public static long[] getMemoryUsageStats() {
        synchronized (AdsPlatformAbstraction.class) {
            try {
                Activity activity = sActivity;
                if (activity == null) {
                    return new long[]{0, 0, 0, 0};
                }
                ActivityManager activityManager = (ActivityManager) activity.getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                Debug.getMemoryInfo(new Debug.MemoryInfo());
                return new long[]{memoryInfo.totalMem / 1024, memoryInfo.availMem / 1024, r0.getTotalPss(), Runtime.getRuntime().maxMemory() / 1024};
            } catch (Throwable th) {
                return new long[]{0, 0, 0, 0};
            }
        }
    }

    public static String getNetworkOperator() {
        Activity activity = sActivity;
        if (activity == null) {
            return "";
        }
        try {
            return ((TelephonyManager) activity.getSystemService("phone")).getNetworkOperator();
        } catch (Throwable th) {
            return "";
        }
    }

    public static int getNetworkType() {
        NetworkInfo currentNetworkInfo = getCurrentNetworkInfo();
        if (currentNetworkInfo == null) {
            return 0;
        }
        int type = currentNetworkInfo.getType();
        if (type == 0) {
            return 1;
        }
        if (type != 1) {
            return type != 9 ? 4 : 3;
        }
        return 2;
    }

    public static int getOrientation() {
        Activity activity = sActivity;
        return (activity != null && activity.getResources().getConfiguration().orientation == 2) ? 1 : 0;
    }

    public static String getOsVersionAsString() {
        try {
            return String.valueOf(Build.VERSION.SDK_INT);
        } catch (Throwable th) {
            return OS_VERSION_UNAVAILABLE;
        }
    }

    public static float getVolume() {
        Activity activity = sActivity;
        if (activity == null) {
            return 0.0f;
        }
        AudioManager audioManager = (AudioManager) activity.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
    }

    public static int getWidth() {
        Activity activity = sActivity;
        return (activity != null ? activity.getResources().getDisplayMetrics() : new DisplayMetrics()).widthPixels;
    }

    public static void initNetworkListener(long j) {
        NetworkListener networkListener = sNetworkListener;
        if (networkListener != null) {
            networkListener.uninit();
            sNetworkListener = null;
        }
        sNetworkListener = new NetworkListener(sActivity.getApplicationContext(), j);
    }

    public static boolean isAdvertisingTrackingEnabled() {
        return sAdIdSource.isAdvertisingTrackingEnabled();
    }

    public static boolean isClassAvailable(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isInternetPermissionGranted() {
        return ContextCompat.checkSelfPermission(sActivity, "android.permission.INTERNET") == 0 && ContextCompat.checkSelfPermission(sActivity, "android.permission.ACCESS_NETWORK_STATE") == 0;
    }

    public static boolean isInternetReachable() {
        NetworkInfo currentNetworkInfo = getCurrentNetworkInfo();
        if (currentNetworkInfo != null) {
            return currentNetworkInfo.isConnected();
        }
        return false;
    }

    public static boolean isLoaded() {
        return sAdIdSource.isLoaded();
    }

    private static boolean isTablet() {
        Activity activity = sActivity;
        boolean z = false;
        if (activity == null) {
            return false;
        }
        if ((activity.getResources().getConfiguration().screenLayout & 15) >= 3) {
            z = true;
        }
        return z;
    }

    public static void setActivity(Activity activity) {
        sActivity = activity;
        sAdIdSource.load(activity);
    }

    public static void uninit() {
        NetworkListener networkListener = sNetworkListener;
        if (networkListener != null) {
            networkListener.uninit();
        }
        sNetworkListener = null;
    }

    protected void finalize() throws Throwable {
        sActivity = null;
        super.finalize();
    }
}
