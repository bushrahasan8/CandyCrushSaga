package com.unity3d.services.core.properties;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.core.log.DeviceLog;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

/* loaded from: ClientProperties.class */
public class ClientProperties {
    private static final X500Principal DEBUG_CERT = new X500Principal("CN=Android Debug,O=Android,C=US");
    private static WeakReference<Activity> _activity;
    private static Application _application;
    private static Context _applicationContext;
    private static String _gameId;

    public static Activity getActivity() {
        return _activity.get();
    }

    public static String getAppName() {
        Context context = _applicationContext;
        return context == null ? "" : context.getPackageName();
    }

    public static String getAppVersion() {
        String packageName = getApplicationContext().getPackageName();
        PackageManager packageManager = getApplicationContext().getPackageManager();
        try {
            return packageManager.getPackageInfo(packageName, 0).versionName == null ? AndroidStaticDeviceInfoDataSource.APP_VERSION_FAKE : packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            DeviceLog.exception("Error getting package info", e);
            return null;
        }
    }

    public static Application getApplication() {
        return _application;
    }

    public static Context getApplicationContext() {
        return _applicationContext;
    }

    public static String getGameId() {
        return _gameId;
    }

    public static boolean isAppDebuggable() {
        if (getApplicationContext() == null) {
            return false;
        }
        PackageManager packageManager = getApplicationContext().getPackageManager();
        String packageName = getApplicationContext().getPackageName();
        boolean z = true;
        boolean z2 = true;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            int i = applicationInfo.flags & 2;
            applicationInfo.flags = i;
            if (i == 0) {
                z2 = false;
            }
            z = false;
        } catch (PackageManager.NameNotFoundException e) {
            DeviceLog.exception("Could not find name", e);
            z2 = false;
        }
        boolean z3 = z2;
        if (z) {
            z3 = z2;
            boolean z4 = z2;
            try {
                Signature[] signatureArr = packageManager.getPackageInfo(packageName, 64).signatures;
                boolean z5 = z2;
                int length = signatureArr.length;
                int i2 = 0;
                while (true) {
                    z3 = z2;
                    if (i2 >= length) {
                        break;
                    }
                    Signature signature = signatureArr[i2];
                    z3 = z2;
                    z4 = z2;
                    CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
                    boolean z6 = z2;
                    boolean z7 = z2;
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(signature.toByteArray());
                    boolean z8 = z2;
                    z2 = ((X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream)).getSubjectX500Principal().equals(DEBUG_CERT);
                    if (z2) {
                        z3 = z2;
                        break;
                    }
                    i2++;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                DeviceLog.exception("Could not find name", e2);
                z3 = z4;
            } catch (CertificateException e3) {
                DeviceLog.exception("Certificate exception", e3);
            }
        }
        return z3;
    }

    public static void setActivity(Activity activity) {
        _activity = new WeakReference<>(activity);
    }

    public static void setApplication(Application application) {
        _application = application;
    }

    public static void setApplicationContext(Context context) {
        _applicationContext = context;
    }

    public static void setGameId(String str) {
        _gameId = str;
    }
}
