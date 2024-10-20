package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: PurchasesResponseListenerProxy.class */
public class PurchasesResponseListenerProxy extends GenericListenerProxy {
    private static final String onQueryPurchasesResponseMethodName = "onQueryPurchasesResponse";
    private PurchasesResponseListener purchasesResponseListener;

    public PurchasesResponseListenerProxy(PurchasesResponseListener purchasesResponseListener) {
        this.purchasesResponseListener = purchasesResponseListener;
    }

    public static Class<?> getProxyListenerClass() throws ClassNotFoundException {
        return com.android.billingclient.api.PurchasesResponseListener.class;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public Class<?> getProxyClass() throws ClassNotFoundException {
        return getProxyListenerClass();
    }

    public PurchasesResponseListener getPurchasesResponseListener() {
        return this.purchasesResponseListener;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object invoke;
        if (method.getName().equals(onQueryPurchasesResponseMethodName)) {
            onQueryPurchasesResponse(objArr[0], (List) objArr[1]);
            invoke = null;
        } else {
            invoke = super.invoke(obj, method, objArr);
        }
        return invoke;
    }

    public void onQueryPurchasesResponse(Object obj, List<Object> list) {
        ArrayList arrayList;
        BillingResultBridge billingResultBridge = new BillingResultBridge(obj);
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
        PurchasesResponseListener purchasesResponseListener = this.purchasesResponseListener;
        if (purchasesResponseListener != null) {
            purchasesResponseListener.onPurchaseResponse(billingResultBridge, arrayList);
        }
    }
}
