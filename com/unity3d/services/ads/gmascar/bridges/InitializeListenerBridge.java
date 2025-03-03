package com.unity3d.services.ads.gmascar.bridges;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.unity3d.services.ads.gmascar.listeners.IInitializationStatusListener;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.reflection.GenericBridge;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;

/* loaded from: InitializeListenerBridge.class */
public class InitializeListenerBridge extends GenericBridge {
    private static final String initializationCompleteMethodName = "onInitializationComplete";
    private IInitializationStatusListener _initializationStatusListener;

    public InitializeListenerBridge() {
        super(new HashMap<String, Class<?>[]>() { // from class: com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge.1
            {
                try {
                    put(InitializeListenerBridge.initializationCompleteMethodName, new Class[]{InitializationStatus.class});
                } catch (ClassNotFoundException e) {
                    DeviceLog.debug("Could not find class \"com.google.android.gms.ads.initialization.InitializationStatus\" %s", e.getLocalizedMessage());
                }
            }
        });
    }

    public Object createInitializeListenerProxy() {
        try {
            return Proxy.newProxyInstance(classForName().getClassLoader(), new Class[]{classForName()}, new InvocationHandler(this) { // from class: com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge.2
                final InitializeListenerBridge this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) {
                    if (!method.getName().equals(InitializeListenerBridge.initializationCompleteMethodName) || this.this$0._initializationStatusListener == null) {
                        return null;
                    }
                    this.this$0._initializationStatusListener.onInitializationComplete(objArr[0]);
                    return null;
                }
            });
        } catch (Exception e) {
            DeviceLog.debug("ERROR: Could not create InitializeCompletionListener");
            return null;
        }
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.google.android.gms.ads.initialization.OnInitializationCompleteListener";
    }

    public void setStatusListener(IInitializationStatusListener iInitializationStatusListener) {
        this._initializationStatusListener = iInitializationStatusListener;
    }
}
