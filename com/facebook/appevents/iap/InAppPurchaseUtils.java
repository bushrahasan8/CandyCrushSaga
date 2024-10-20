package com.facebook.appevents.iap;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: InAppPurchaseUtils.class */
public final class InAppPurchaseUtils {
    public static final InAppPurchaseUtils INSTANCE = new InAppPurchaseUtils();

    private InAppPurchaseUtils() {
    }

    public static final Class getClass(String className) {
        Class<?> cls;
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            cls = Class.forName(className);
        } catch (ClassNotFoundException e) {
            cls = null;
        }
        return cls;
    }

    public static final Class getClassFromContext$facebook_android_sdk_core_release(Context context, String className) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            return context.getClassLoader().loadClass(className);
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public static final Method getDeclaredMethod$facebook_android_sdk_core_release(Class clazz, String methodName, Class... args) {
        Method method;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            method = clazz.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
        } catch (NoSuchMethodException e) {
            method = null;
        }
        return method;
    }

    public static final Method getMethod(Class clazz, String methodName, Class... args) {
        Method method;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            method = clazz.getMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
        } catch (NoSuchMethodException e) {
            method = null;
        }
        return method;
    }

    public static final Object invokeMethod(Class clazz, Method method, Object obj, Object... args) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(args, "args");
        Object obj2 = obj;
        if (obj != null) {
            obj2 = clazz.cast(obj);
        }
        try {
            return method.invoke(obj2, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException e) {
            return null;
        }
    }
}
