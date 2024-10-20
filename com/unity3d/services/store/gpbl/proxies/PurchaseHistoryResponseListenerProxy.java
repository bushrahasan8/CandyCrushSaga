package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseHistoryRecordBridge;
import com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: PurchaseHistoryResponseListenerProxy.class */
public class PurchaseHistoryResponseListenerProxy extends GenericListenerProxy {
    private static final String onPurchaseHistoryResponseMethodName = "onPurchaseHistoryResponse";
    private int _maxPurchases;
    private PurchaseHistoryResponseListener purchaseHistoryResponseListener;

    public PurchaseHistoryResponseListenerProxy(PurchaseHistoryResponseListener purchaseHistoryResponseListener, int i) {
        this.purchaseHistoryResponseListener = purchaseHistoryResponseListener;
        this._maxPurchases = i;
    }

    public static Class<?> getProxyListenerClass() throws ClassNotFoundException {
        return com.android.billingclient.api.PurchaseHistoryResponseListener.class;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public Class<?> getProxyClass() throws ClassNotFoundException {
        return getProxyListenerClass();
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object invoke;
        if (method.getName().equals(onPurchaseHistoryResponseMethodName)) {
            onPurchaseHistoryResponse(objArr[0], (List) objArr[1]);
            invoke = null;
        } else {
            invoke = super.invoke(obj, method, objArr);
        }
        return invoke;
    }

    public void onPurchaseHistoryResponse(Object obj, List<Object> list) {
        ArrayList arrayList;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            while (true) {
                arrayList = arrayList2;
                if (i >= this._maxPurchases) {
                    break;
                }
                arrayList = arrayList2;
                if (i >= list.size()) {
                    break;
                }
                arrayList2.add(new PurchaseHistoryRecordBridge(list.get(i)));
                i++;
            }
        } else {
            arrayList = null;
        }
        PurchaseHistoryResponseListener purchaseHistoryResponseListener = this.purchaseHistoryResponseListener;
        if (purchaseHistoryResponseListener != null) {
            purchaseHistoryResponseListener.onPurchaseHistoryUpdated(new BillingResultBridge(obj), arrayList);
        }
    }
}
