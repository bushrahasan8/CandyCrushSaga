package com.unity3d.services.core.device;

import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.json.JSONObject;

/* loaded from: Storage.class */
public final class Storage extends JsonStorage {
    public static final Companion Companion = new Companion(null);
    private static final MutableStateFlow onStorageEventCallbacks = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
    private final String _targetFileName;
    private final StorageManager.StorageType type;

    /* loaded from: Storage$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addStorageEventCallback(Function1 callback) {
            Object value;
            Intrinsics.checkNotNullParameter(callback, "callback");
            MutableStateFlow mutableStateFlow = Storage.onStorageEventCallbacks;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, CollectionsKt.plus((List) value, callback)));
        }

        public final void removeStorageEventCallback(Function1 callback) {
            Object value;
            Intrinsics.checkNotNullParameter(callback, "callback");
            MutableStateFlow mutableStateFlow = Storage.onStorageEventCallbacks;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, CollectionsKt.minus((List) value, callback)));
        }
    }

    public Storage(String _targetFileName, StorageManager.StorageType type) {
        Intrinsics.checkNotNullParameter(_targetFileName, "_targetFileName");
        Intrinsics.checkNotNullParameter(type, "type");
        this._targetFileName = _targetFileName;
        this.type = type;
    }

    public final boolean clearStorage() {
        boolean delete;
        synchronized (this) {
            clearData();
            delete = new File(this._targetFileName).delete();
        }
        return delete;
    }

    public final StorageManager.StorageType getType() {
        return this.type;
    }

    public final boolean initStorage() {
        synchronized (this) {
            readStorage();
            super.initData();
        }
        return true;
    }

    public final boolean readStorage() {
        byte[] readFileBytes;
        boolean z = true;
        synchronized (this) {
            try {
                readFileBytes = Utilities.readFileBytes(new File(this._targetFileName));
            } catch (FileNotFoundException e) {
                DeviceLog.debug("Storage JSON file not found in local cache:", e);
                z = false;
                return z;
            } catch (Exception e2) {
                DeviceLog.debug("Failed to read storage JSON file:", e2);
                z = false;
                return z;
            }
            if (readFileBytes == null) {
                return false;
            }
            setData(new JSONObject(new String(readFileBytes, Charsets.UTF_8)));
            return z;
        }
    }

    public final void sendEvent(StorageEvent storageEvent, Object obj) {
        boolean z = false;
        synchronized (this) {
            List list = (List) onStorageEventCallbacks.getValue();
            if (!(!list.isEmpty())) {
                if (WebViewApp.getCurrentApp() != null) {
                    z = WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.STORAGE, storageEvent, this.type.name(), obj);
                }
                if (!z) {
                    DeviceLog.debug("Couldn't send storage event to WebApp");
                }
                return;
            }
            Intrinsics.checkNotNull(storageEvent);
            StorageEventInfo storageEventInfo = new StorageEventInfo(storageEvent, this.type, obj);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(storageEventInfo);
            }
        }
    }

    public final boolean storageFileExists() {
        boolean exists;
        synchronized (this) {
            exists = new File(this._targetFileName).exists();
        }
        return exists;
    }

    public final boolean writeStorage() {
        synchronized (this) {
            File file = new File(this._targetFileName);
            if (getData() == null) {
                return false;
            }
            return Utilities.writeFile(file, getData().toString());
        }
    }
}
