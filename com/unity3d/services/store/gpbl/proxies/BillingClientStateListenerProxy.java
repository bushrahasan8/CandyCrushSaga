package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import java.lang.reflect.Method;

/* loaded from: BillingClientStateListenerProxy.class */
public class BillingClientStateListenerProxy extends GenericListenerProxy {
    private static String onBillingServiceDisconnectedMethodName = "onBillingServiceDisconnected";
    private static String onBillingSetupFinishedMethodName = "onBillingSetupFinished";
    private BillingClientStateListener billingClientStateListener;

    public BillingClientStateListenerProxy(BillingClientStateListener billingClientStateListener) {
        this.billingClientStateListener = billingClientStateListener;
    }

    public static Class<?> getProxyListenerClass() throws ClassNotFoundException {
        return com.android.billingclient.api.BillingClientStateListener.class;
    }

    private void onBillingServiceDisconnected() {
        BillingClientStateListener billingClientStateListener = this.billingClientStateListener;
        if (billingClientStateListener != null) {
            billingClientStateListener.onBillingServiceDisconnected();
        }
    }

    private void onBillingSetupFinished(Object obj) {
        BillingClientStateListener billingClientStateListener = this.billingClientStateListener;
        if (billingClientStateListener != null) {
            billingClientStateListener.onBillingSetupFinished(new BillingResultBridge(obj));
        }
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public Class<?> getProxyClass() throws ClassNotFoundException {
        return getProxyListenerClass();
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object invoke;
        if (method.getName().equals(onBillingSetupFinishedMethodName)) {
            onBillingSetupFinished(objArr[0]);
        } else {
            if (!method.getName().equals(onBillingServiceDisconnectedMethodName)) {
                invoke = super.invoke(obj, method, objArr);
                return invoke;
            }
            onBillingServiceDisconnected();
        }
        invoke = null;
        return invoke;
    }
}
