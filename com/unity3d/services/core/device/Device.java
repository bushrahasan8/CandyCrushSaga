package com.unity3d.services.core.device;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.core.os.BuildCompat$Extensions30Impl$;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$;
import com.ironsource.p2;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Device.class */
public class Device {
    private static ConcurrentHashMap<String, Boolean> _reportedWarning = new ConcurrentHashMap<>();
    private static SDKMetricsSender sdkMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.unity3d.services.core.device.Device$1, reason: invalid class name */
    /* loaded from: Device$1.class */
    public static /* synthetic */ class AnonymousClass1 {
        static final int[] $SwitchMap$com$unity3d$services$core$device$Device$MemoryInfoType;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x0020
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.unity3d.services.core.device.Device$MemoryInfoType[] r0 = com.unity3d.services.core.device.Device.MemoryInfoType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.unity3d.services.core.device.Device.AnonymousClass1.$SwitchMap$com$unity3d$services$core$device$Device$MemoryInfoType = r0
                r0 = r4
                com.unity3d.services.core.device.Device$MemoryInfoType r1 = com.unity3d.services.core.device.Device.MemoryInfoType.TOTAL_MEMORY     // Catch: java.lang.NoSuchFieldError -> L20
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L20
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L20
            L14:
                int[] r0 = com.unity3d.services.core.device.Device.AnonymousClass1.$SwitchMap$com$unity3d$services$core$device$Device$MemoryInfoType     // Catch: java.lang.NoSuchFieldError -> L20 java.lang.NoSuchFieldError -> L24
                com.unity3d.services.core.device.Device$MemoryInfoType r1 = com.unity3d.services.core.device.Device.MemoryInfoType.FREE_MEMORY     // Catch: java.lang.NoSuchFieldError -> L24
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L24
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L24
            L1f:
                return
            L20:
                r4 = move-exception
                goto L14
            L24:
                r4 = move-exception
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.Device.AnonymousClass1.m6555clinit():void");
        }
    }

    /* loaded from: Device$MemoryInfoType.class */
    public enum MemoryInfoType {
        TOTAL_MEMORY,
        FREE_MEMORY
    }

    public static String getAdvertisingTrackingId() {
        return AdvertisingId.getAdvertisingTrackingId();
    }

    public static int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:13:0x0094
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public static java.lang.String getApkDigest() throws java.lang.Exception {
        /*
            android.content.Context r0 = com.unity3d.services.core.properties.ClientProperties.getApplicationContext()
            java.lang.String r0 = r0.getPackageCodePath()
            r13 = r0
            long r0 = java.lang.System.nanoTime()
            r7 = r0
            r0 = 0
            r12 = r0
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L85
            r11 = r0
            r0 = r11
            r1 = r13
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L85
            r0 = r11
            long r0 = r0.length()     // Catch: java.lang.Throwable -> L85
            r1 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 / r1
            r9 = r0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L85
            r13 = r0
            r0 = r13
            r1 = r11
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L85
            r0 = r13
            java.lang.String r0 = com.unity3d.services.core.misc.Utilities.Sha256(r0)     // Catch: java.lang.Throwable -> L7c
            r11 = r0
            r0 = r13
            r0.close()     // Catch: java.io.IOException -> L94
        L3d:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.io.IOException -> L94
            long r1 = java.lang.System.nanoTime()
            r2 = r7
            long r1 = r1 - r2
            long r0 = r0.toMillis(r1)
            r1 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L64
            com.unity3d.services.core.request.metrics.SDKMetricsSender r0 = com.unity3d.services.core.device.Device.sdkMetricsSender
            com.unity3d.services.core.request.metrics.Metric r1 = new com.unity3d.services.core.request.metrics.Metric
            r2 = r1
            java.lang.String r3 = "native_device_info_apk_digest_timeout"
            r4 = r9
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.<init>(r3, r4)
            r0.sendMetric(r1)
        L64:
            com.unity3d.services.core.request.metrics.SDKMetricsSender r0 = com.unity3d.services.core.device.Device.sdkMetricsSender
            com.unity3d.services.core.request.metrics.Metric r1 = new com.unity3d.services.core.request.metrics.Metric
            r2 = r1
            java.lang.String r3 = "native_device_info_apk_size"
            r4 = r9
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.<init>(r3, r4)
            r0.sendMetric(r1)
            r0 = r11
            return r0
        L7c:
            r11 = move-exception
            r0 = r13
            r12 = r0
            goto L87
        L85:
            r11 = move-exception
        L87:
            r0 = r12
            if (r0 == 0) goto L91
            r0 = r12
            r0.close()     // Catch: java.io.IOException -> L99
        L91:
            r0 = r11
            throw r0
        L94:
            r12 = move-exception
            goto L3d
        L99:
            r12 = move-exception
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.Device.getApkDigest():java.lang.String");
    }

    public static String getAuid() {
        return AndroidPreferences.getString(UnityAdsConstants.Preferences.PREF_NAME_AUID, "auid");
    }

    public static float getBatteryLevel() {
        Intent registerReceiver;
        if (ClientProperties.getApplicationContext() == null || (registerReceiver = ClientProperties.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -1.0f;
        }
        return registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
    }

    public static int getBatteryStatus() {
        Intent registerReceiver;
        if (ClientProperties.getApplicationContext() == null || (registerReceiver = ClientProperties.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -1;
        }
        return registerReceiver.getIntExtra("status", -1);
    }

    public static String getBoard() {
        return Build.BOARD;
    }

    public static String getBootloader() {
        return Build.BOOTLOADER;
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static String getBuildId() {
        return Build.ID;
    }

    public static String getBuildVersionIncremental() {
        return Build.VERSION.INCREMENTAL;
    }

    public static long getCPUCount() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static String getCertificateFingerprint() {
        String str;
        try {
            Signature[] signatureArr = ClientProperties.getApplicationContext().getPackageManager().getPackageInfo(ClientProperties.getApplicationContext().getPackageName(), 64).signatures;
            str = null;
            if (signatureArr != null) {
                str = null;
                if (signatureArr.length >= 1) {
                    str = Utilities.toHexString(MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded()));
                }
            }
        } catch (Exception e) {
            DeviceLog.exception("Exception when signing certificate fingerprint", e);
            str = null;
        }
        return str;
    }

    public static String getConnectionType() {
        return isUsingWifi() ? p2.b : isActiveNetworkConnected() ? p2.g : "none";
    }

    public static String getDevice() {
        return Build.DEVICE;
    }

    public static float getDisplayMetricDensity() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getDisplayMetrics().density;
        }
        return -1.0f;
    }

    public static long getElapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public static int getExtensionVersion() {
        if (Build.VERSION.SDK_INT >= 30) {
            return BuildCompat$Extensions30Impl$.ExternalSyntheticApiModelOutline0.m(30);
        }
        return -1;
    }

    public static String getFingerprint() {
        return Build.FINGERPRINT;
    }

    public static long getFreeMemory() {
        return getMemoryInfo(MemoryInfoType.FREE_MEMORY);
    }

    public static long getFreeSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return Math.round((float) (file.getFreeSpace() / 1024));
    }

    public static String getGLVersion() {
        ActivityManager activityManager;
        ConfigurationInfo deviceConfigurationInfo;
        if (ClientProperties.getApplicationContext() == null || (activityManager = (ActivityManager) ClientProperties.getApplicationContext().getSystemService("activity")) == null || (deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo()) == null) {
            return null;
        }
        return deviceConfigurationInfo.getGlEsVersion();
    }

    public static String getHardware() {
        return Build.HARDWARE;
    }

    public static String getHost() {
        return Build.HOST;
    }

    public static String getIdfi() {
        String string = AndroidPreferences.getString(UnityAdsConstants.Preferences.PREF_NAME_IDFI, UnityAdsConstants.Preferences.PREF_KEY_IDFI);
        String str = string;
        if (string == null) {
            str = getAuid();
        }
        String str2 = str;
        if (str == null) {
            str2 = getUniqueEventId();
            AndroidPreferences.setString(UnityAdsConstants.Preferences.PREF_NAME_IDFI, UnityAdsConstants.Preferences.PREF_KEY_IDFI, str2);
        }
        return str2;
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long getMemoryInfo(com.unity3d.services.core.device.Device.MemoryInfoType r4) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.Device.getMemoryInfo(com.unity3d.services.core.device.Device$MemoryInfoType):long");
    }

    private static long getMemoryValueFromString(String str) {
        if (str == null) {
            return -1L;
        }
        Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
        String str2 = "";
        while (true) {
            String str3 = str2;
            if (!matcher.find()) {
                return Long.parseLong(str3);
            }
            str2 = matcher.group(1);
        }
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static String getNetworkCountryISO() {
        return ClientProperties.getApplicationContext() != null ? ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkCountryIso() : "";
    }

    public static boolean getNetworkMetered() {
        ConnectivityManager connectivityManager;
        if (ClientProperties.getApplicationContext() == null || (connectivityManager = (ConnectivityManager) ClientProperties.getApplicationContext().getSystemService("connectivity")) == null) {
            return false;
        }
        return connectivityManager.isActiveNetworkMetered();
    }

    public static String getNetworkOperator() {
        return ClientProperties.getApplicationContext() != null ? ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkOperator() : "";
    }

    public static String getNetworkOperatorName() {
        return ClientProperties.getApplicationContext() != null ? ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkOperatorName() : "";
    }

    public static int getNetworkType() {
        if (ClientProperties.getApplicationContext() == null) {
            return -1;
        }
        try {
            return ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkType();
        } catch (SecurityException e) {
            if (_reportedWarning.containsKey("getNetworkType")) {
                return -1;
            }
            DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
            _reportedWarning.put("getNetworkType", Boolean.TRUE);
            return -1;
        }
    }

    @TargetApi(21)
    private static ArrayList<String> getNewAbiList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(Build.SUPPORTED_ABIS));
        return arrayList;
    }

    private static ArrayList<String> getOldAbiList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(Build.CPU_ABI);
        arrayList.add(Build.CPU_ABI2);
        return arrayList;
    }

    public static String getOpenAdvertisingTrackingId() {
        return OpenAdvertisingId.getOpenAdvertisingTrackingId();
    }

    public static String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    public static JSONObject getPackageInfo(PackageManager packageManager) throws PackageManager.NameNotFoundException, JSONException {
        String appName = ClientProperties.getAppName();
        PackageInfo packageInfo = packageManager.getPackageInfo(appName, 0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("installer", packageManager.getInstallerPackageName(appName));
        jSONObject.put("firstInstallTime", packageInfo.firstInstallTime);
        jSONObject.put("lastUpdateTime", packageInfo.lastUpdateTime);
        jSONObject.put("versionCode", packageInfo.versionCode);
        jSONObject.put("versionName", packageInfo.versionName);
        jSONObject.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, packageInfo.packageName);
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.RandomAccessFile] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, java.lang.String> getProcessInfo() {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = 0
            r6 = r0
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L48
            r5 = r0
            r0 = r5
            java.lang.String r1 = "/proc/self/stat"
            java.lang.String r2 = "r"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L48
            r0 = r5
            r4 = r0
            r0 = r7
            java.lang.String r1 = "stat"
            r2 = r5
            java.lang.String r2 = r2.readLine()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L40
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L40
            r0 = r5
            r0.close()     // Catch: java.io.IOException -> L2d
            goto L5c
        L2d:
            r4 = move-exception
            java.lang.String r0 = "Error closing RandomAccessFile"
            r1 = r4
            com.unity3d.services.core.log.DeviceLog.exception(r0, r1)
            goto L5c
        L38:
            r5 = move-exception
            r0 = r4
            r6 = r0
            r0 = r5
            r4 = r0
            goto L5e
        L40:
            r6 = move-exception
            goto L4b
        L44:
            r4 = move-exception
            goto L5e
        L48:
            r6 = move-exception
            r0 = 0
            r5 = r0
        L4b:
            r0 = r5
            r4 = r0
            java.lang.String r0 = "Error while reading processor info: "
            r1 = r6
            com.unity3d.services.core.log.DeviceLog.exception(r0, r1)     // Catch: java.lang.Throwable -> L38
            r0 = r5
            if (r0 == 0) goto L5c
            r0 = r5
            r0.close()     // Catch: java.io.IOException -> L2d
        L5c:
            r0 = r7
            return r0
        L5e:
            r0 = r6
            if (r0 == 0) goto L71
            r0 = r6
            r0.close()     // Catch: java.io.IOException -> L69
            goto L71
        L69:
            r5 = move-exception
            java.lang.String r0 = "Error closing RandomAccessFile"
            r1 = r5
            com.unity3d.services.core.log.DeviceLog.exception(r0, r1)
        L71:
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.Device.getProcessInfo():java.util.Map");
    }

    public static String getProduct() {
        return Build.PRODUCT;
    }

    public static int getRingerMode() {
        if (ClientProperties.getApplicationContext() == null) {
            return -1;
        }
        AudioManager audioManager = (AudioManager) ClientProperties.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager != null) {
            return audioManager.getRingerMode();
        }
        return -2;
    }

    public static int getScreenBrightness() {
        if (ClientProperties.getApplicationContext() != null) {
            return Settings.System.getInt(ClientProperties.getApplicationContext().getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    public static int getScreenDensity() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
        }
        return -1;
    }

    public static int getScreenHeight() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getDisplayMetrics().heightPixels;
        }
        return -1;
    }

    public static int getScreenLayout() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getConfiguration().screenLayout;
        }
        return -1;
    }

    public static int getScreenWidth() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getDisplayMetrics().widthPixels;
        }
        return -1;
    }

    public static List<Sensor> getSensorList() {
        if (ClientProperties.getApplicationContext() != null) {
            return ((SensorManager) ClientProperties.getApplicationContext().getSystemService("sensor")).getSensorList(-1);
        }
        return null;
    }

    public static int getStreamMaxVolume(int i) {
        if (ClientProperties.getApplicationContext() == null) {
            return -1;
        }
        AudioManager audioManager = (AudioManager) ClientProperties.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(i);
        }
        return -2;
    }

    public static int getStreamVolume(int i) {
        if (ClientProperties.getApplicationContext() == null) {
            return -1;
        }
        AudioManager audioManager = (AudioManager) ClientProperties.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager != null) {
            return audioManager.getStreamVolume(i);
        }
        return -2;
    }

    public static ArrayList<String> getSupportedAbis() {
        return getApiLevel() < 21 ? getOldAbiList() : getNewAbiList();
    }

    public static String getSystemProperty(String str, String str2) {
        return str2 != null ? System.getProperty(str, str2) : System.getProperty(str);
    }

    public static long getTotalMemory() {
        return getMemoryInfo(MemoryInfoType.TOTAL_MEMORY);
    }

    public static long getTotalSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return Math.round((float) (file.getTotalSpace() / 1024));
    }

    public static String getUniqueEventId() {
        return UUID.randomUUID().toString();
    }

    public static long getUptime() {
        return SystemClock.uptimeMillis();
    }

    public static boolean hasAV1Decoder() {
        return selectAllDecodeCodecs(MimeTypes.VIDEO_AV1).size() > 0;
    }

    public static boolean hasX264Decoder() {
        return selectAllDecodeCodecs(MimeTypes.VIDEO_H264).size() > 0;
    }

    public static boolean hasX265Decoder() {
        return selectAllDecodeCodecs(MimeTypes.VIDEO_H265).size() > 0;
    }

    public static boolean isActiveNetworkConnected() {
        boolean z = false;
        if (ClientProperties.getApplicationContext() != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) ClientProperties.getApplicationContext().getSystemService("connectivity");
            z = false;
            if (connectivityManager != null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                z = false;
                if (activeNetworkInfo != null) {
                    z = false;
                    if (activeNetworkInfo.isConnected()) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public static Boolean isAdbEnabled() {
        return getApiLevel() < 17 ? oldAdbStatus() : newAdbStatus();
    }

    private static boolean isHardwareAccelerated(MediaCodecInfo mediaCodecInfo, String str) {
        return getApiLevel() >= 29 ? isHardwareAcceleratedV29(mediaCodecInfo) : !isSoftwareOnly(mediaCodecInfo, str);
    }

    @TargetApi(Sdk$SDKMetric.SDKMetricType.NOTIFICATION_REDIRECT_VALUE)
    private static boolean isHardwareAcceleratedV29(MediaCodecInfo mediaCodecInfo) {
        return MediaCodecUtil$.ExternalSyntheticApiModelOutline1.m(mediaCodecInfo);
    }

    public static boolean isLimitAdTrackingEnabled() {
        return AdvertisingId.getLimitedAdTracking();
    }

    public static boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    public static boolean isRooted() {
        try {
            return searchPathForBinary(AndroidStaticDeviceInfoDataSource.BINARY_SU);
        } catch (Exception e) {
            DeviceLog.exception("Rooted check failed", e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r0.startsWith("c2.") == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean isSoftwareOnly(android.media.MediaCodecInfo r3, java.lang.String r4) {
        /*
            int r0 = getApiLevel()
            r1 = 29
            if (r0 < r1) goto Ld
            r0 = r3
            boolean r0 = isSoftwareOnlyV29(r0)
            return r0
        Ld:
            r0 = r3
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = r0.toLowerCase()
            r3 = r0
            r0 = r3
            java.lang.String r1 = "arc."
            boolean r0 = r0.startsWith(r1)
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L25
            r0 = 0
            return r0
        L25:
            r0 = r3
            java.lang.String r1 = "omx.google."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L83
            r0 = r3
            java.lang.String r1 = "omx.ffmpeg."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L83
            r0 = r3
            java.lang.String r1 = "omx.sec."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L4d
            r0 = r3
            java.lang.String r1 = ".sw."
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L83
        L4d:
            r0 = r3
            java.lang.String r1 = "omx.qcom.video.decoder.hevcswvdec"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L83
            r0 = r3
            java.lang.String r1 = "c2.android."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L83
            r0 = r3
            java.lang.String r1 = "c2.google."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L83
            r0 = r6
            r5 = r0
            r0 = r3
            java.lang.String r1 = "omx."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L85
            r0 = r6
            r5 = r0
            r0 = r3
            java.lang.String r1 = "c2."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L85
        L83:
            r0 = 1
            r5 = r0
        L85:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.Device.isSoftwareOnly(android.media.MediaCodecInfo, java.lang.String):boolean");
    }

    @TargetApi(Sdk$SDKMetric.SDKMetricType.NOTIFICATION_REDIRECT_VALUE)
    private static boolean isSoftwareOnlyV29(MediaCodecInfo mediaCodecInfo) {
        return MediaCodecUtil$.ExternalSyntheticApiModelOutline0.m(mediaCodecInfo);
    }

    public static boolean isUSBConnected() {
        Intent registerReceiver;
        if (ClientProperties.getApplicationContext() == null || (registerReceiver = ClientProperties.getApplicationContext().registerReceiver(null, new IntentFilter(AndroidDynamicDeviceInfoDataSource.INTENT_USB_STATE))) == null) {
            return false;
        }
        return registerReceiver.getBooleanExtra(AndroidDynamicDeviceInfoDataSource.USB_EXTRA_CONNECTED, false);
    }

    public static boolean isUsingWifi() {
        boolean z = false;
        if (ClientProperties.getApplicationContext() != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) ClientProperties.getApplicationContext().getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            TelephonyManager telephonyManager = (TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            z = false;
            if (activeNetworkInfo != null) {
                z = false;
                if (connectivityManager.getBackgroundDataSetting()) {
                    z = false;
                    if (connectivityManager.getActiveNetworkInfo().isConnected()) {
                        if (telephonyManager == null) {
                            z = false;
                        } else {
                            z = false;
                            if (activeNetworkInfo.getType() == 1) {
                                z = false;
                                if (activeNetworkInfo.isConnected()) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    public static boolean isWiredHeadsetOn() {
        if (ClientProperties.getApplicationContext() != null) {
            return ((AudioManager) ClientProperties.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO)).isWiredHeadsetOn();
        }
        return false;
    }

    @TargetApi(17)
    private static Boolean newAdbStatus() {
        Boolean bool;
        try {
            boolean z = false;
            if (1 == Settings.Global.getInt(ClientProperties.getApplicationContext().getContentResolver(), "adb_enabled", 0)) {
                z = true;
            }
            bool = Boolean.valueOf(z);
        } catch (Exception e) {
            DeviceLog.exception("Problems fetching adb enabled status", e);
            bool = null;
        }
        return bool;
    }

    private static Boolean oldAdbStatus() {
        Boolean bool;
        try {
            boolean z = false;
            if (1 == Settings.Secure.getInt(ClientProperties.getApplicationContext().getContentResolver(), "adb_enabled", 0)) {
                z = true;
            }
            bool = Boolean.valueOf(z);
        } catch (Exception e) {
            DeviceLog.exception("Problems fetching adb enabled status", e);
            bool = null;
        }
        return bool;
    }

    private static boolean searchPathForBinary(String str) {
        File[] listFiles;
        for (String str2 : System.getenv(AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH).split(":")) {
            File file = new File(str2);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.getName().equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static List<MediaCodecInfo> selectAllDecodeCodecs(String str) {
        ArrayList arrayList = new ArrayList();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str) && isHardwareAccelerated(codecInfoAt, str)) {
                        arrayList.add(codecInfoAt);
                    }
                }
            }
        }
        return arrayList;
    }
}
