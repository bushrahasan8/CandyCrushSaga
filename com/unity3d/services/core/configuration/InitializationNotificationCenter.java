package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: InitializationNotificationCenter.class */
public class InitializationNotificationCenter implements IInitializationNotificationCenter {
    private static InitializationNotificationCenter instance;
    private HashMap<Integer, IInitializationListener> _sdkListeners = new HashMap<>();

    public static InitializationNotificationCenter getInstance() {
        if (instance == null) {
            instance = new InitializationNotificationCenter();
        }
        return instance;
    }

    private void removeListener(Integer num) {
        this._sdkListeners.remove(num);
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void addListener(IInitializationListener iInitializationListener) {
        synchronized (this._sdkListeners) {
            if (iInitializationListener != null) {
                this._sdkListeners.put(new Integer(iInitializationListener.hashCode()), iInitializationListener);
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void removeListener(IInitializationListener iInitializationListener) {
        synchronized (this._sdkListeners) {
            if (iInitializationListener != null) {
                removeListener(new Integer(iInitializationListener.hashCode()));
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void triggerOnSdkInitializationFailed(String str, ErrorState errorState, int i) {
        synchronized (this._sdkListeners) {
            String str2 = "SDK Failed to Initialize due to " + str;
            DeviceLog.error(str2);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<Integer, IInitializationListener> entry : this._sdkListeners.entrySet()) {
                if (entry.getValue() != null) {
                    Utilities.runOnUiThread(new Runnable(this, entry, str2, errorState, i) { // from class: com.unity3d.services.core.configuration.InitializationNotificationCenter.2
                        final InitializationNotificationCenter this$0;
                        final int val$code;
                        final Map.Entry val$entry;
                        final ErrorState val$errorState;
                        final String val$exceptionMessage;

                        {
                            this.this$0 = this;
                            this.val$entry = entry;
                            this.val$exceptionMessage = str2;
                            this.val$errorState = errorState;
                            this.val$code = i;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            ((IInitializationListener) this.val$entry.getValue()).onSdkInitializationFailed(this.val$exceptionMessage, this.val$errorState, this.val$code);
                        }
                    });
                } else {
                    arrayList.add(entry.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this._sdkListeners.remove((Integer) it.next());
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void triggerOnSdkInitialized() {
        synchronized (this._sdkListeners) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<Integer, IInitializationListener> entry : this._sdkListeners.entrySet()) {
                if (entry.getValue() != null) {
                    Utilities.runOnUiThread(new Runnable(this, entry) { // from class: com.unity3d.services.core.configuration.InitializationNotificationCenter.1
                        final InitializationNotificationCenter this$0;
                        final Map.Entry val$entry;

                        {
                            this.this$0 = this;
                            this.val$entry = entry;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            ((IInitializationListener) this.val$entry.getValue()).onSdkInitialized();
                        }
                    });
                } else {
                    arrayList.add(entry.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this._sdkListeners.remove((Integer) it.next());
            }
        }
    }
}
