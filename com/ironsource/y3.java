package com.ironsource;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.OnSuccessListener;
import com.ironsource.b6;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.IronSourceSharedPreferencesUtilities;
import com.ironsource.od;
import com.ironsource.t2;
import com.onetrust.otpublishers.headless.Public.Keys.OTIABTCFKeys;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

/* loaded from: y3.class */
public class y3 implements b6, b6.a {
    private String b = null;
    private String c = null;
    private String d = "";
    private boolean e = false;
    private String f = "";
    private volatile String g;
    private volatile String h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: y3$a.class */
    public class a implements InvocationHandler {
        final y3 a;

        a(y3 y3Var) {
            this.a = y3Var;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (objArr == null) {
                return null;
            }
            try {
                if (objArr.length <= 0 || (obj2 = objArr[0]) == null) {
                    return null;
                }
                String obj3 = obj2.getClass().getMethod("getId", null).invoke(objArr[0], null).toString();
                if (TextUtils.isEmpty(obj3)) {
                    return null;
                }
                this.a.f = obj3;
                return null;
            } catch (Exception e) {
                return null;
            }
        }
    }

    private String L(Context context) {
        Object N = N(context);
        return N.getClass().getMethod("getId", null).invoke(N, null).toString();
    }

    private void M(Context context) {
        Object invoke = AppSet.class.getMethod("getClient", Context.class).invoke(AppSet.class, context);
        Object invoke2 = invoke.getClass().getMethod("getAppSetIdInfo", null).invoke(invoke, null);
        invoke2.getClass().getMethod("addOnSuccessListener", OnSuccessListener.class).invoke(invoke2, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{OnSuccessListener.class}, new a(this)));
    }

    private Object N(Context context) {
        return AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(AdvertisingIdClient.class, context);
    }

    private String O(Context context) {
        Object N = N(context);
        return String.valueOf(((Boolean) N.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(N, null)).booleanValue());
    }

    private String P(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "Mediation_Shared_Preferences", "browser_user_agent", "");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private long Q(Context context) {
        try {
            return Long.parseLong(IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "Mediation_Shared_Preferences", "browser_user_agent_time", String.valueOf(-1L)));
        } catch (Exception e) {
            e.printStackTrace();
            return -1L;
        }
    }

    private long a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1048576;
    }

    private void a(Context context, String str) {
        try {
            IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "Mediation_Shared_Preferences", "browser_user_agent", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void b(Context context, long j) {
        try {
            IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "Mediation_Shared_Preferences", "browser_user_agent_time", String.valueOf(j));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean b(String str) {
        boolean z;
        int i = 0;
        while (true) {
            z = false;
            if (i >= 8) {
                break;
            }
            try {
                if (new File(new String[]{"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"}[i] + str).exists()) {
                    z = true;
                    break;
                }
                i++;
            } catch (Exception e) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.ironsource.b6
    public String A(Context context) {
        String str;
        try {
            str = IronSourceSharedPreferencesUtilities.getStringFromDefaultSharedPrefs(context, OTIABTCFKeys.IABTCF_TCSTRING, null);
        } catch (Exception e) {
            str = null;
        }
        return str;
    }

    @Override // com.ironsource.b6
    public boolean B(Context context) {
        boolean z = false;
        if (Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1) {
            z = true;
        }
        return z;
    }

    @Override // com.ironsource.b6
    public String C(Context context) {
        return Locale.getDefault().toString();
    }

    @Override // com.ironsource.b6
    public String D(Context context) {
        String str;
        if (v3.a.c()) {
            try {
                M(context);
            } catch (Exception e) {
            }
            if (!TextUtils.isEmpty(this.f)) {
                str = this.f;
                return str;
            }
        }
        str = "";
        return str;
    }

    @Override // com.ironsource.b6
    public int E(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    @Override // com.ironsource.b6
    public String F(Context context) throws Exception {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    @Override // com.ironsource.b6
    public boolean G(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i = -1;
        if (registerReceiver != null) {
            i = registerReceiver.getIntExtra("status", -1);
        }
        return i == 2 || i == 5;
    }

    @Override // com.ironsource.b6
    public String H(Context context) {
        String str;
        try {
            str = IronSourceSharedPreferencesUtilities.getStringFromDefaultSharedPrefs(context, OTIABTCFKeys.IABTCF_ADD_TL_CONSENT, null);
        } catch (Exception e) {
            str = null;
        }
        return str;
    }

    @Override // com.ironsource.b6
    public int I(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    @Override // com.ironsource.b6
    public String J(Context context) {
        synchronized (this) {
            if (!TextUtils.isEmpty(this.b)) {
                return this.b;
            }
            if (IronSourceSharedPreferencesUtilities.getBooleanFromSharedPrefs(context, "Mediation_Shared_Preferences", b6.a, true)) {
                String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "Mediation_Shared_Preferences", "cachedUUID", "");
                if (TextUtils.isEmpty(stringFromSharedPrefs)) {
                    String uuid = UUID.randomUUID().toString();
                    this.b = uuid;
                    IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "Mediation_Shared_Preferences", "cachedUUID", uuid);
                } else {
                    this.b = stringFromSharedPrefs;
                }
            }
            return this.b;
        }
    }

    @Override // com.ironsource.b6
    public int K(Context context) {
        return context instanceof Activity ? ((Activity) context).getRequestedOrientation() : -1;
    }

    @Override // com.ironsource.b6
    public int a() {
        return j();
    }

    @Override // com.ironsource.b6
    public long a(String str) {
        return a(new File(str));
    }

    @Override // com.ironsource.b6
    public String a(Context context) {
        String str;
        try {
            if (!v3.a.a()) {
                str = O(context);
            } else if (this.g == null) {
                String O = O(context);
                str = O;
                try {
                    if (!TextUtils.isEmpty(O)) {
                        this.g = O;
                        str = O;
                    }
                } catch (Exception e) {
                    str = O;
                }
            } else {
                str = this.g;
            }
        } catch (Exception e2) {
            str = null;
        }
        return str;
    }

    @Override // com.ironsource.b6.a
    public void a(Context context, long j) {
        if (context != null) {
            if (!new zd(new od.a()).a(Q(context), j)) {
                this.d = P(context);
                this.e = !r0.isEmpty();
            }
            if (this.d.isEmpty()) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                    this.d = defaultUserAgent;
                    a(context, defaultUserAgent);
                    if (j > 0) {
                        b(context, System.currentTimeMillis());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // com.ironsource.b6
    @TargetApi(19)
    public boolean a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | com.ironsource.mediationsdk.metadata.a.m) == systemUiVisibility;
    }

    @Override // com.ironsource.b6
    public String b() {
        String id = TimeZone.getDefault().getID();
        if (id == null) {
            id = "";
        }
        return id;
    }

    @Override // com.ironsource.b6
    public String b(Context context) throws Exception {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    @Override // com.ironsource.b6
    public boolean c() {
        boolean z = false;
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                z = false;
                if (Environment.isExternalStorageRemovable()) {
                    z = true;
                }
            }
        } catch (Exception e) {
            z = false;
        }
        return z;
    }

    @Override // com.ironsource.b6
    public boolean c(Context context) {
        boolean z = false;
        try {
            if (Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.ironsource.b6
    public int d() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    @Override // com.ironsource.b6
    public boolean d(Context context) {
        boolean z = false;
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.ironsource.b6
    public File e(Context context) {
        return context.getExternalCacheDir();
    }

    @Override // com.ironsource.b6
    public String e() {
        return Build.MODEL;
    }

    @Override // com.ironsource.b6
    public String f(Context context) {
        String str;
        if (context == null) {
            return "";
        }
        int K = K(context);
        if (K != 0) {
            if (K != 1) {
                if (K != 11) {
                    if (K != 12) {
                        switch (K) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                str = "none";
                                break;
                        }
                        return str;
                    }
                }
            }
            str = t2.h.D;
            return str;
        }
        str = t2.h.C;
        return str;
    }

    @Override // com.ironsource.b6
    public boolean f() {
        return b(AndroidStaticDeviceInfoDataSource.BINARY_SU);
    }

    @Override // com.ironsource.b6
    public String g() {
        return Build.MANUFACTURER;
    }

    @Override // com.ironsource.b6
    public boolean g(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // com.ironsource.b6
    public float h() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    @Override // com.ironsource.b6
    public long h(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1L;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    @Override // com.ironsource.b6
    public long i() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    @Override // com.ironsource.b6
    public String i(Context context) {
        return r(context) ? "Tablet" : "Phone";
    }

    @Override // com.ironsource.b6
    public int j() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override // com.ironsource.b6
    public String j(Context context) {
        String str = "";
        if (context != null) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            str = "";
            if (telephonyManager != null) {
                str = telephonyManager.getNetworkOperatorName();
            }
        }
        return str;
    }

    @Override // com.ironsource.b6
    public int k() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.ironsource.b6
    public File k(Context context) {
        return context.getCacheDir();
    }

    @Override // com.ironsource.b6
    public int l(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    @Override // com.ironsource.b6
    public String l() {
        return "android";
    }

    @Override // com.ironsource.b6
    public float m(Context context) {
        float f;
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        try {
            f = audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (Exception e) {
            e.printStackTrace();
            f = -1.0f;
        }
        return f;
    }

    @Override // com.ironsource.b6
    public long m() {
        return c() ? a(Environment.getExternalStorageDirectory()) : 0L;
    }

    @Override // com.ironsource.b6
    public long n() {
        return a(Environment.getDataDirectory());
    }

    @Override // com.ironsource.b6
    public String n(Context context) {
        String str = "";
        if (context != null) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            str = "";
            if (telephonyManager != null) {
                str = telephonyManager.getNetworkCountryIso();
            }
        }
        return str;
    }

    @Override // com.ironsource.b6
    public String o() {
        return Build.VERSION.RELEASE;
    }

    @Override // com.ironsource.b6
    @SuppressLint({"QueryPermissionsNeeded"})
    public List<ApplicationInfo> o(Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    @Override // com.ironsource.b6
    public int p() {
        return -(TimeZone.getDefault().getOffset(i()) / 60000);
    }

    @Override // com.ironsource.b6
    public String p(Context context) {
        String L;
        v3 v3Var = v3.a;
        if (v3Var.b()) {
            try {
                if (!v3Var.a()) {
                    L = L(context);
                } else if (this.h == null) {
                    String L2 = L(context);
                    L = L2;
                    try {
                        if (!TextUtils.isEmpty(L2)) {
                            this.h = L2;
                            L = L2;
                        }
                    } catch (Exception e) {
                        L = L2;
                    }
                } else {
                    L = this.h;
                }
            } catch (Exception e2) {
            }
            return L;
        }
        L = null;
        return L;
    }

    @Override // com.ironsource.b6
    public boolean q() {
        return this.e;
    }

    @Override // com.ironsource.b6
    public boolean q(Context context) {
        boolean z;
        try {
            z = ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        return z;
    }

    @Override // com.ironsource.b6
    public int r() {
        return d();
    }

    @Override // com.ironsource.b6
    public boolean r(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        boolean z = false;
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            z = false;
            if (displayMetrics.widthPixels / displayMetrics.density >= 600.0f) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.ironsource.b6
    public String s() {
        try {
            return this.d.isEmpty() ? P(ContextProvider.getInstance().getApplicationContext()) : this.d;
        } catch (Exception e) {
            return "";
        }
    }

    @Override // com.ironsource.b6
    public String s(Context context) {
        synchronized (this) {
            if (!TextUtils.isEmpty(this.c)) {
                return this.c;
            }
            if (context == null) {
                return "";
            }
            String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, UnityAdsConstants.Preferences.PREF_NAME_AUID, "auid", "");
            this.c = stringFromSharedPrefs;
            if (TextUtils.isEmpty(stringFromSharedPrefs)) {
                String uuid = UUID.randomUUID().toString();
                this.c = uuid;
                IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, UnityAdsConstants.Preferences.PREF_NAME_AUID, "auid", uuid);
            }
            return this.c;
        }
    }

    @Override // com.ironsource.b6
    public File t(Context context) {
        return context.getExternalFilesDir(null);
    }

    @Override // com.ironsource.b6
    public boolean u(Context context) {
        boolean z;
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            int length = strArr.length;
            int i = 0;
            while (true) {
                z = false;
                if (i >= length) {
                    break;
                }
                if (strArr[i].equalsIgnoreCase("com.google.android.gms.permission.AD_ID")) {
                    z = true;
                    break;
                }
                i++;
            }
        } catch (Exception e) {
            z = false;
        }
        return z;
    }

    @Override // com.ironsource.b6
    public File v(Context context) {
        return context.getFilesDir();
    }

    @Override // com.ironsource.b6
    public int w(Context context) {
        int i;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i2 = 0;
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : 0;
            if (registerReceiver != null) {
                i2 = registerReceiver.getIntExtra("scale", -1);
            }
            i = -1;
            if (intExtra != -1) {
                i = -1;
                if (i2 != -1) {
                    i = (int) ((intExtra / i2) * 100.0f);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            i = -1;
        }
        return i;
    }

    @Override // com.ironsource.b6
    public int x(Context context) {
        int I = I(context);
        int E = E(context);
        if ((I == 0 || I == 2) && E == 2) {
            return 2;
        }
        return ((I == 1 || I == 3) && E == 1) ? 2 : 1;
    }

    @Override // com.ironsource.b6
    public int y(Context context) {
        int i;
        try {
            i = IronSourceSharedPreferencesUtilities.getIntFromDefaultSharedPrefs(context, OTIABTCFKeys.IABTCF_GDPRAPPLIES, -1);
        } catch (Exception e) {
            i = -1;
        }
        return i;
    }

    @Override // com.ironsource.b6
    public int z(Context context) {
        if (context != null) {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }
}
