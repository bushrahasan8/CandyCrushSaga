package org.chromium.support_lib_boundary.util;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: BoundaryInterfaceReflectionUtil.class */
public abstract class BoundaryInterfaceReflectionUtil {

    /* loaded from: BoundaryInterfaceReflectionUtil$InvocationHandlerWithDelegateGetter.class */
    private static class InvocationHandlerWithDelegateGetter implements InvocationHandler {
        private final Object mDelegate;

        public InvocationHandlerWithDelegateGetter(Object obj) {
            this.mDelegate = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return BoundaryInterfaceReflectionUtil.dupeMethod(method, this.mDelegate.getClass().getClassLoader()).invoke(this.mDelegate, objArr);
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            } catch (ReflectiveOperationException e2) {
                throw new RuntimeException("Reflection failed for method " + method, e2);
            }
        }
    }

    public static Object castToSuppLibClass(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(BoundaryInterfaceReflectionUtil.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (r3.contains(r4 + ":dev") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean containsFeature(java.util.Collection r3, java.lang.String r4) {
        /*
            r0 = r3
            r1 = r4
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L3a
            boolean r0 = isDebuggable()
            if (r0 == 0) goto L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            java.lang.String r1 = ":dev"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            r1 = r6
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L35
            goto L3a
        L35:
            r0 = 0
            r5 = r0
            goto L3c
        L3a:
            r0 = 1
            r5 = r0
        L3c:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.containsFeature(java.util.Collection, java.lang.String):boolean");
    }

    public static InvocationHandler createInvocationHandlerFor(Object obj) {
        if (obj == null) {
            return null;
        }
        return new InvocationHandlerWithDelegateGetter(obj);
    }

    public static Method dupeMethod(Method method, ClassLoader classLoader) {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    private static boolean isDebuggable() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }
}
