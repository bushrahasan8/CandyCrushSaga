package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import com.facebook.ads.internal.util.common.Preconditions;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import dalvik.system.DexClassLoader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@Keep
/* loaded from: DynamicLoaderFactory.class */
public class DynamicLoaderFactory {
    private static final String AUDIENCE_NETWORK_CODE_PATH = "audience_network";
    public static final String AUDIENCE_NETWORK_DEX = "audience_network.dex";
    private static final String CODE_CACHE_DIR = "code_cache";
    static final String DEX_LOADING_ERROR_MESSAGE = "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder.";
    private static final int DEX_LOAD_RETRY_COUNT = 3;
    private static final int DEX_LOAD_RETRY_DELAY_MS = 200;
    private static final String DYNAMIC_LOADING_BUILD_TYPE = "releaseDL";
    private static final String OPTIMIZED_DEX_PATH = "optimized";
    private static boolean sFallbackMode;
    public static final boolean LOAD_FROM_ASSETS = "releaseDL".equals(BuildConfig.BUILD_TYPE);
    private static final AtomicReference<DynamicLoader> sDynamicLoader = new AtomicReference<>();
    private static final AtomicBoolean sInitializing = new AtomicBoolean();
    private static boolean sUseLegacyClassLoader = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static AudienceNetworkAds.InitResult createErrorInitResult(Throwable th) {
        return new AudienceNetworkAds.InitResult(th) { // from class: com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.3
            final Throwable val$t;

            {
                this.val$t = th;
            }

            @Override // com.facebook.ads.AudienceNetworkAds.InitResult
            public String getMessage() {
                return DynamicLoaderFactory.createErrorMessage(this.val$t);
            }

            @Override // com.facebook.ads.AudienceNetworkAds.InitResult
            public boolean isSuccess() {
                return false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String createErrorMessage(Throwable th) {
        return "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder.\n" + stackTraceToString(th);
    }

    @TargetApi(Sdk$SDKMetric.SDKMetricType.MRAID_DOWNLOAD_JS_RETRY_SUCCESS_VALUE)
    private static ClassLoader createInMemoryClassLoader(Context context) throws IOException {
        InputStream open = context.getAssets().open(AUDIENCE_NETWORK_DEX);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = open.read(bArr);
            if (read <= 0) {
                open.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                ByteBuffer wrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
                DynamicLoaderFactory$$ExternalSyntheticApiModelOutline1.m();
                return DynamicLoaderFactory$$ExternalSyntheticApiModelOutline0.m(wrap, DynamicLoaderFactory.class.getClassLoader());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void doCallInitialize(Context context, DynamicLoader dynamicLoader, Throwable th, boolean z, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener) {
        if (th != null) {
            if (initListener != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable(initListener, th) { // from class: com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.2
                    final Throwable val$dexLoadThrowable;
                    final AudienceNetworkAds.InitListener val$initListener;

                    {
                        this.val$initListener = initListener;
                        this.val$dexLoadThrowable = th;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.val$initListener.onInitialized(DynamicLoaderFactory.createErrorInitResult(this.val$dexLoadThrowable));
                    }
                }, 100L);
                return;
            } else {
                Log.e(AudienceNetworkAds.TAG, DEX_LOADING_ERROR_MESSAGE, th);
                return;
            }
        }
        if (dynamicLoader != null) {
            if (z) {
                dynamicLoader.createAudienceNetworkAdsApi().onContentProviderCreated(context);
            } else {
                dynamicLoader.createAudienceNetworkAdsApi().initialize(context, multithreadedBundleWrapper, initListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DynamicLoader doMakeLoader(Context context, boolean z) throws Exception {
        DynamicLoader dynamicLoader;
        AtomicReference<DynamicLoader> atomicReference = sDynamicLoader;
        DynamicLoader dynamicLoader2 = atomicReference.get();
        if (dynamicLoader2 != null) {
            return dynamicLoader2;
        }
        if (LOAD_FROM_ASSETS) {
            long currentTimeMillis = System.currentTimeMillis();
            dynamicLoader = (DynamicLoader) makeAdsSdkClassLoader(context.getApplicationContext()).loadClass("com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl").newInstance();
            Log.d(AudienceNetworkAds.TAG, "SDK dex loading time: " + (System.currentTimeMillis() - currentTimeMillis));
        } else {
            dynamicLoader = (DynamicLoader) Class.forName("com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl").newInstance();
        }
        if (z) {
            dynamicLoader.maybeInitInternally(context);
        }
        atomicReference.set(dynamicLoader);
        return dynamicLoader;
    }

    @SuppressLint({"PrivateApi", "CatchGeneralException"})
    private static Context getApplicationContextViaReflection() {
        try {
            return (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
        } catch (Throwable th) {
            Log.e(AudienceNetworkAds.TAG, "Failed to fetch Context from  ActivityThread. Audience Network SDK won't work unless you call AudienceNetworkAds.buildInitSettings().withListener(InitListener).initialize().", th);
            return null;
        }
    }

    private static File getCacheCodeDirLegacy(Context context, File file) throws IOException {
        File dir;
        File file2 = new File(file, CODE_CACHE_DIR);
        try {
            mkdirChecked(file2);
            dir = file2;
        } catch (IOException e) {
            dir = context.getDir(CODE_CACHE_DIR, 0);
            mkdirChecked(dir);
        }
        return dir;
    }

    private static File getCodeCacheDir(Context context, File file) throws IOException {
        return context.getCodeCacheDir();
    }

    public static DynamicLoader getDynamicLoader() {
        return sDynamicLoader.get();
    }

    private static File getSecondaryDir(File file) throws IOException {
        File file2 = new File(file, AUDIENCE_NETWORK_CODE_PATH);
        mkdirChecked(file2);
        return file2;
    }

    public static void initialize(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, boolean z) {
        if (z || !sInitializing.getAndSet(true)) {
            new Thread(new Runnable(context, z, multithreadedBundleWrapper, initListener) { // from class: com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.1
                final Context val$context;
                final boolean val$fromContentProvider;
                final AudienceNetworkAds.InitListener val$initListener;
                final MultithreadedBundleWrapper val$initSettings;

                {
                    this.val$context = context;
                    this.val$fromContentProvider = z;
                    this.val$initSettings = multithreadedBundleWrapper;
                    this.val$initListener = initListener;
                }

                @Override // java.lang.Runnable
                public void run() {
                    Throwable th;
                    DynamicLoader dynamicLoader;
                    int i;
                    int i2;
                    ANActivityLifecycleCallbacksListener.registerActivityCallbacks(this.val$context);
                    synchronized (DynamicLoaderFactory.class) {
                        th = null;
                        int i3 = 0;
                        while (true) {
                            dynamicLoader = null;
                            if (i3 >= 3) {
                                break;
                            }
                            try {
                                dynamicLoader = DynamicLoaderFactory.doMakeLoader(this.val$context, false);
                                break;
                            } finally {
                                if (i == i2) {
                                    try {
                                    } catch (Throwable th2) {
                                    }
                                }
                            }
                        }
                    }
                    DynamicLoaderFactory.doCallInitialize(this.val$context, dynamicLoader, th, this.val$fromContentProvider, this.val$initSettings, this.val$initListener);
                    DynamicLoaderFactory.sInitializing.set(false);
                }
            }).start();
        }
    }

    public static boolean isFallbackMode() {
        boolean z;
        synchronized (DynamicLoaderFactory.class) {
            try {
                z = sFallbackMode;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    private static ClassLoader makeAdsSdkClassLoader(Context context) throws Exception {
        if (Build.VERSION.SDK_INT >= 30) {
            return createInMemoryClassLoader(context);
        }
        if (sUseLegacyClassLoader) {
            return makeLegacyAdsSdkClassLoader(context);
        }
        File secondaryDir = getSecondaryDir(getCodeCacheDir(context, new File(context.getApplicationInfo().dataDir)));
        String str = secondaryDir.getPath() + File.separator + AUDIENCE_NETWORK_DEX;
        InputStream open = context.getAssets().open(AUDIENCE_NETWORK_DEX);
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = open.read(bArr);
            if (read <= 0) {
                open.close();
                fileOutputStream.flush();
                fileOutputStream.close();
                File file = new File(secondaryDir.getPath() + File.separator + OPTIMIZED_DEX_PATH);
                mkdirChecked(file);
                return new DexClassLoader(str, file.getPath(), null, context.getClassLoader());
            }
            fileOutputStream.write(bArr, 0, read);
        }
    }

    private static DexClassLoader makeLegacyAdsSdkClassLoader(Context context) throws Exception {
        String str = context.getFilesDir().getPath() + File.separator + AUDIENCE_NETWORK_DEX;
        InputStream open = context.getAssets().open(AUDIENCE_NETWORK_DEX);
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = open.read(bArr);
            if (read <= 0) {
                open.close();
                fileOutputStream.flush();
                fileOutputStream.close();
                return new DexClassLoader(str, context.getDir(OPTIMIZED_DEX_PATH, 0).getPath(), null, DynamicLoaderFactory.class.getClassLoader());
            }
            fileOutputStream.write(bArr, 0, read);
        }
    }

    public static DynamicLoader makeLoader(Context context) {
        DynamicLoader makeLoader;
        synchronized (DynamicLoaderFactory.class) {
            try {
                makeLoader = makeLoader(context, true);
            } catch (Throwable th) {
                throw th;
            }
        }
        return makeLoader;
    }

    @SuppressLint({"CatchGeneralException"})
    public static DynamicLoader makeLoader(Context context, boolean z) {
        DynamicLoader doMakeLoader;
        synchronized (DynamicLoaderFactory.class) {
            try {
                Preconditions.checkNotNull(context, "Context can not be null.");
                try {
                    doMakeLoader = doMakeLoader(context, z);
                } catch (Throwable th) {
                    Log.e(AudienceNetworkAds.TAG, DEX_LOADING_ERROR_MESSAGE, th);
                    DexLoadErrorReporter.reportDexLoadingIssue(context, createErrorMessage(th), 0.1d);
                    DynamicLoader makeFallbackLoader = DynamicLoaderFallback.makeFallbackLoader();
                    sDynamicLoader.set(makeFallbackLoader);
                    sFallbackMode = true;
                    return makeFallbackLoader;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return doMakeLoader;
    }

    @SuppressLint({"CatchGeneralException"})
    public static DynamicLoader makeLoaderUnsafe() {
        synchronized (DynamicLoaderFactory.class) {
            try {
                AtomicReference<DynamicLoader> atomicReference = sDynamicLoader;
                if (atomicReference.get() != null) {
                    return atomicReference.get();
                }
                Context applicationContextViaReflection = getApplicationContextViaReflection();
                if (applicationContextViaReflection == null) {
                    throw new RuntimeException("You must call AudienceNetworkAds.buildInitSettings(Context).initialize() before you can use Audience Network SDK.");
                }
                return makeLoader(applicationContextViaReflection, true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void mkdirChecked(File file) throws IOException {
        String str;
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            str = "Failed to create dir " + file.getPath() + ". Parent file is null.";
        } else {
            str = "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite();
        }
        Log.e(AudienceNetworkAds.TAG, str);
        throw new IOException("Failed to create directory " + file.getPath() + ", detailed message: " + str);
    }

    public static void setFallbackMode(boolean z) {
        synchronized (DynamicLoaderFactory.class) {
            try {
                if (z) {
                    sDynamicLoader.set(DynamicLoaderFallback.makeFallbackLoader());
                    sFallbackMode = true;
                } else {
                    sDynamicLoader.set(null);
                    sFallbackMode = false;
                }
            } finally {
            }
        }
    }

    public static void setUseLegacyClassLoader(boolean z) {
        sUseLegacyClassLoader = z;
    }

    private static String stackTraceToString(Throwable th) {
        return Log.getStackTraceString(th);
    }
}
