package com.unity3d.services.store.gpbl.proxies;

import com.android.billingclient.api.PurchasesUpdatedListener;
import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: PurchaseUpdatedListenerProxy.class */
public class PurchaseUpdatedListenerProxy extends GenericListenerProxy {
    private static final String onPurchasesUpdatedMethodName = "onPurchasesUpdated";
    private PurchaseUpdatedResponseListener purchaseUpdatedResponseListener;

    public PurchaseUpdatedListenerProxy(PurchaseUpdatedResponseListener purchaseUpdatedResponseListener) {
        this.purchaseUpdatedResponseListener = purchaseUpdatedResponseListener;
    }

    public static Class<?> getProxyListenerClass() throws ClassNotFoundException {
        return PurchasesUpdatedListener.class;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public Class<?> getProxyClass() throws ClassNotFoundException {
        return getProxyListenerClass();
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object invoke;
        if (method.getName().equals(onPurchasesUpdatedMethodName)) {
            onPurchasesUpdated(objArr[0], (List) objArr[1]);
            invoke = null;
        } else {
            invoke = super.invoke(obj, method, objArr);
        }
        return invoke;
    }

    public void onPurchasesUpdated(Object obj, List<Object> list) {
        ArrayList arrayList;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<Object> it = list.iterator();
            while (true) {
                arrayList = arrayList2;
                if (!it.hasNext()) {
                    break;
                } else {
                    arrayList2.add(new PurchaseBridge(it.next()));
                }
            }
        } else {
            arrayList = null;
        }
        PurchaseUpdatedResponseListener purchaseUpdatedResponseListener = this.purchaseUpdatedResponseListener;
        if (purchaseUpdatedResponseListener != null) {
            purchaseUpdatedResponseListener.onPurchaseUpdated(new BillingResultBridge(obj), arrayList);
        }
    }
}
