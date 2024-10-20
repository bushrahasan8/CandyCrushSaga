package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: ActivityRecreator.class */
public abstract class ActivityRecreator {
    protected static final Class activityThreadClass;
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    protected static final Field mainThreadField;
    protected static final Method performStopActivity2ParamsMethod;
    protected static final Method performStopActivity3ParamsMethod;
    protected static final Method requestRelaunchActivityMethod;
    protected static final Field tokenField;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.ActivityRecreator$1 */
    /* loaded from: ActivityRecreator$1.class */
    public class AnonymousClass1 implements Runnable {
        final LifecycleCheckCallbacks val$callbacks;
        final Object val$token;

        AnonymousClass1(LifecycleCheckCallbacks lifecycleCheckCallbacks, Object obj) {
            this.val$callbacks = lifecycleCheckCallbacks;
            this.val$token = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.val$callbacks.currentlyRecreatingToken = this.val$token;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.ActivityRecreator$2 */
    /* loaded from: ActivityRecreator$2.class */
    public class AnonymousClass2 implements Runnable {
        final Application val$application;
        final LifecycleCheckCallbacks val$callbacks;

        AnonymousClass2(Application application, LifecycleCheckCallbacks lifecycleCheckCallbacks) {
            this.val$application = application;
            this.val$callbacks = lifecycleCheckCallbacks;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.val$application.unregisterActivityLifecycleCallbacks(this.val$callbacks);
        }
    }

    /* renamed from: androidx.core.app.ActivityRecreator$3 */
    /* loaded from: ActivityRecreator$3.class */
    public class AnonymousClass3 implements Runnable {
        final Object val$activityThread;
        final Object val$token;

        AnonymousClass3(Object obj, Object obj2) {
            this.val$activityThread = obj;
            this.val$token = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = ActivityRecreator.performStopActivity3ParamsMethod;
                if (method != null) {
                    method.invoke(this.val$activityThread, this.val$token, Boolean.FALSE, "AppCompat recreation");
                } else {
                    ActivityRecreator.performStopActivity2ParamsMethod.invoke(this.val$activityThread, this.val$token, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: ActivityRecreator$LifecycleCheckCallbacks.class */
    public static final class LifecycleCheckCallbacks implements Application.ActivityLifecycleCallbacks {
        Object currentlyRecreatingToken;
        private Activity mActivity;
        private final int mRecreatingHashCode;
        private boolean mStarted = false;
        private boolean mDestroyed = false;
        private boolean mStopQueued = false;

        LifecycleCheckCallbacks(Activity activity) {
            this.mActivity = activity;
            this.mRecreatingHashCode = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.mActivity == activity) {
                this.mActivity = null;
                this.mDestroyed = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.mDestroyed || this.mStopQueued || this.mStarted || !ActivityRecreator.queueOnStopIfNecessary(this.currentlyRecreatingToken, this.mRecreatingHashCode, activity)) {
                return;
            }
            this.mStopQueued = true;
            this.currentlyRecreatingToken = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.mActivity == activity) {
                this.mStarted = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class activityThreadClass2 = getActivityThreadClass();
        activityThreadClass = activityThreadClass2;
        mainThreadField = getMainThreadField();
        tokenField = getTokenField();
        performStopActivity3ParamsMethod = getPerformStopActivity3Params(activityThreadClass2);
        performStopActivity2ParamsMethod = getPerformStopActivity2Params(activityThreadClass2);
        requestRelaunchActivityMethod = getRequestRelaunchActivityMethod(activityThreadClass2);
    }

    private static Class getActivityThreadClass() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable th) {
            return null;
        }
    }

    private static Field getMainThreadField() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th) {
            return null;
        }
    }

    private static Method getPerformStopActivity2Params(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable th) {
            return null;
        }
    }

    private static Method getPerformStopActivity3Params(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable th) {
            return null;
        }
    }

    private static Method getRequestRelaunchActivityMethod(Class cls) {
        if (!needsRelaunchCall() || cls == null) {
            return null;
        }
        try {
            Class<?> cls2 = Integer.TYPE;
            Class<?> cls3 = Boolean.TYPE;
            Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable th) {
            return null;
        }
    }

    private static Field getTokenField() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th) {
            return null;
        }
    }

    private static boolean needsRelaunchCall() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    protected static boolean queueOnStopIfNecessary(Object obj, int i, Activity activity) {
        try {
            Object obj2 = tokenField.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                mainHandler.postAtFrontOfQueue(new Runnable(mainThreadField.get(activity), obj2) { // from class: androidx.core.app.ActivityRecreator.3
                    final Object val$activityThread;
                    final Object val$token;

                    AnonymousClass3(Object obj3, Object obj22) {
                        this.val$activityThread = obj3;
                        this.val$token = obj22;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Method method = ActivityRecreator.performStopActivity3ParamsMethod;
                            if (method != null) {
                                method.invoke(this.val$activityThread, this.val$token, Boolean.FALSE, "AppCompat recreation");
                            } else {
                                ActivityRecreator.performStopActivity2ParamsMethod.invoke(this.val$activityThread, this.val$token, Boolean.FALSE);
                            }
                        } catch (RuntimeException e) {
                            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                                throw e;
                            }
                        } catch (Throwable th) {
                            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                        }
                    }
                });
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    public static boolean recreate(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (needsRelaunchCall() && requestRelaunchActivityMethod == null) {
            return false;
        }
        if (performStopActivity2ParamsMethod == null && performStopActivity3ParamsMethod == null) {
            return false;
        }
        try {
            Object obj2 = tokenField.get(activity);
            if (obj2 == null || (obj = mainThreadField.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            LifecycleCheckCallbacks lifecycleCheckCallbacks = new LifecycleCheckCallbacks(activity);
            application.registerActivityLifecycleCallbacks(lifecycleCheckCallbacks);
            Handler handler = mainHandler;
            handler.post(new Runnable(lifecycleCheckCallbacks, obj2) { // from class: androidx.core.app.ActivityRecreator.1
                final LifecycleCheckCallbacks val$callbacks;
                final Object val$token;

                AnonymousClass1(LifecycleCheckCallbacks lifecycleCheckCallbacks2, Object obj22) {
                    this.val$callbacks = lifecycleCheckCallbacks2;
                    this.val$token = obj22;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.val$callbacks.currentlyRecreatingToken = this.val$token;
                }
            });
            try {
                if (needsRelaunchCall()) {
                    Method method = requestRelaunchActivityMethod;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj22, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new Runnable(application, lifecycleCheckCallbacks2) { // from class: androidx.core.app.ActivityRecreator.2
                    final Application val$application;
                    final LifecycleCheckCallbacks val$callbacks;

                    AnonymousClass2(Application application2, LifecycleCheckCallbacks lifecycleCheckCallbacks2) {
                        this.val$application = application2;
                        this.val$callbacks = lifecycleCheckCallbacks2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.val$application.unregisterActivityLifecycleCallbacks(this.val$callbacks);
                    }
                });
                return true;
            } catch (Throwable th) {
                mainHandler.post(new Runnable(application2, lifecycleCheckCallbacks2) { // from class: androidx.core.app.ActivityRecreator.2
                    final Application val$application;
                    final LifecycleCheckCallbacks val$callbacks;

                    AnonymousClass2(Application application2, LifecycleCheckCallbacks lifecycleCheckCallbacks2) {
                        this.val$application = application2;
                        this.val$callbacks = lifecycleCheckCallbacks2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.val$application.unregisterActivityLifecycleCallbacks(this.val$callbacks);
                    }
                });
                throw th;
            }
        } catch (Throwable th2) {
            return false;
        }
    }
}
