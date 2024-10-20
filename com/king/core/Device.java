package com.king.core;

import android.annotation.SuppressLint;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Keep;
import com.ironsource.p2;
import com.king.core.activityhelper.ActivityHelper;
import com.king.logging.Logging;

@Keep
/* loaded from: Device.class */
public class Device {
    private static final String PROCESSOR_TOKEN_NAME = "Processor";
    private static final String TAG = "Device";

    private Device() {
        throw new IllegalStateException("Utility class");
    }

    public static String getAppName() {
        return ActivityHelper.getInstance().getActivity().getApplicationContext().getApplicationInfo().processName;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:35)
        */
    public static java.lang.String getCpuInfo() {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.king.core.Device.getCpuInfo():java.lang.String");
    }

    public static String getDeviceId() {
        return Settings.Secure.getString(ActivityHelper.getInstance().getActivity().getContentResolver(), "android_id");
    }

    public static String getDeviceName() {
        return Settings.System.getString(ActivityHelper.getInstance().getActivity().getContentResolver(), "device_name");
    }

    public static float[] getDpi() {
        Display defaultDisplay = ((WindowManager) ActivityHelper.getInstance().getActivity().getSystemService("window")).getDefaultDisplay();
        float[] fArr = new float[2];
        if (defaultDisplay != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            fArr[0] = displayMetrics.xdpi;
            fArr[1] = displayMetrics.ydpi;
        } else {
            Logging.logError(TAG, "Default display is null, can't read the current dpi.");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        }
        return fArr;
    }

    public static String getInstallerPackageName() {
        String installerPackageName = ActivityHelper.getInstance().getActivity().getPackageManager().getInstallerPackageName(ActivityHelper.getInstance().getActivity().getPackageName());
        String str = installerPackageName;
        if (installerPackageName == null) {
            str = "installer_package_name_unknown";
        }
        return str;
    }

    public static int[] getMacAddress() {
        if (Build.VERSION.SDK_INT < 31) {
            return getMacAddressDeprecated();
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    private static int[] getMacAddressDeprecated() {
        WifiInfo connectionInfo;
        WifiManager wifiManager = (WifiManager) ActivityHelper.getInstance().getActivity().getApplicationContext().getSystemService(p2.b);
        if (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
            return null;
        }
        return parseMacAddress(connectionInfo.getMacAddress());
    }

    public static String getNetworkCountryIso() {
        return ((TelephonyManager) ActivityHelper.getInstance().getActivity().getSystemService("phone")).getNetworkCountryIso();
    }

    public static String getNetworkOperator() {
        return ((TelephonyManager) ActivityHelper.getInstance().getActivity().getSystemService("phone")).getNetworkOperator();
    }

    public static String getSimCountryIso() {
        return ((TelephonyManager) ActivityHelper.getInstance().getActivity().getSystemService("phone")).getSimCountryIso();
    }

    public static boolean isTablet() {
        return (ActivityHelper.getInstance().getActivity().getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    private static int[] parseMacAddress(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        if (str.indexOf(58) == -1) {
            int[] iArr = null;
            if (str.length() == 12) {
                int[] iArr2 = new int[6];
                while (true) {
                    iArr = iArr2;
                    if (i >= 6) {
                        break;
                    }
                    int i2 = i * 2;
                    iArr2[i] = Integer.parseInt(str.substring(i2, i2 + 2), 16);
                    i++;
                }
            }
            return iArr;
        }
        String[] split = str.split(":");
        int[] iArr3 = null;
        if (split.length == 6) {
            int[] iArr4 = new int[6];
            int i3 = 0;
            while (true) {
                iArr3 = iArr4;
                if (i3 >= 6) {
                    break;
                }
                iArr4[i3] = Integer.parseInt(split[i3], 16);
                i3++;
            }
        }
        return iArr3;
    }
}
