package com.unity3d.services.core.device;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@TargetApi(9)
/* loaded from: OpenAdvertisingId.class */
public class OpenAdvertisingId {
    private static final String HW_DEVICE_NAME = "HUAWEI";
    private static final String HW_OPEN_ADVERTISING_ID_SERVICE_NAME = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";
    private static OpenAdvertisingId instance;
    private String openAdvertisingIdentifier = null;
    private boolean limitedOpenAdTracking = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: OpenAdvertisingId$HWAdvertisingInfo.class */
    public interface HWAdvertisingInfo extends IInterface {

        /* loaded from: OpenAdvertisingId$HWAdvertisingInfo$HWAdvertisingInfoBinder.class */
        public static abstract class HWAdvertisingInfoBinder extends Binder implements HWAdvertisingInfo {

            /* JADX INFO: Access modifiers changed from: private */
            /* loaded from: OpenAdvertisingId$HWAdvertisingInfo$HWAdvertisingInfoBinder$HWAdvertisingInfoImplementation.class */
            public static class HWAdvertisingInfoImplementation implements HWAdvertisingInfo {
                private final IBinder _binder;

                HWAdvertisingInfoImplementation(IBinder iBinder) {
                    this._binder = iBinder;
                }

                @Override // android.os.IInterface
                public IBinder asBinder() {
                    return this._binder;
                }

                @Override // com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo
                public boolean getEnabled(boolean z) throws RemoteException {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(OpenAdvertisingId.HW_OPEN_ADVERTISING_ID_SERVICE_NAME);
                        boolean z2 = true;
                        obtain.writeInt(z ? 1 : 0);
                        this._binder.transact(2, obtain, obtain2, 0);
                        obtain2.readException();
                        if (obtain2.readInt() == 0) {
                            z2 = false;
                        }
                        obtain2.recycle();
                        obtain.recycle();
                        return z2;
                    } catch (Throwable th) {
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                }

                @Override // com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo
                public String getId() throws RemoteException {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(OpenAdvertisingId.HW_OPEN_ADVERTISING_ID_SERVICE_NAME);
                        this._binder.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        return obtain2.readString();
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }
            }

            public static HWAdvertisingInfo create(IBinder iBinder) {
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface(OpenAdvertisingId.HW_OPEN_ADVERTISING_ID_SERVICE_NAME);
                return (queryLocalInterface == null || !(queryLocalInterface instanceof HWAdvertisingInfo)) ? new HWAdvertisingInfoImplementation(iBinder) : (HWAdvertisingInfo) queryLocalInterface;
            }

            @Override // android.os.Binder
            public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
                if (i == 1) {
                    parcel.enforceInterface(OpenAdvertisingId.HW_OPEN_ADVERTISING_ID_SERVICE_NAME);
                    String id = getId();
                    parcel2.writeNoException();
                    parcel2.writeString(id);
                    return true;
                }
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel.enforceInterface(OpenAdvertisingId.HW_OPEN_ADVERTISING_ID_SERVICE_NAME);
                boolean enabled = getEnabled(parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(enabled ? 1 : 0);
                return true;
            }
        }

        boolean getEnabled(boolean z) throws RemoteException;

        String getId() throws RemoteException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: OpenAdvertisingId$HWAdvertisingServiceConnection.class */
    public class HWAdvertisingServiceConnection implements ServiceConnection {
        private final BlockingQueue<IBinder> _binderQueue;
        boolean _consumed;
        final OpenAdvertisingId this$0;

        private HWAdvertisingServiceConnection(OpenAdvertisingId openAdvertisingId) {
            this.this$0 = openAdvertisingId;
            this._consumed = false;
            this._binderQueue = new LinkedBlockingQueue();
        }

        public IBinder getBinder() throws InterruptedException {
            if (this._consumed) {
                throw new IllegalStateException();
            }
            this._consumed = true;
            return this._binderQueue.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this._binderQueue.put(iBinder);
            } catch (InterruptedException e) {
                DeviceLog.debug("Couldn't put service to binder que");
                Thread.currentThread().interrupt();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    private void fetchOAId(Context context) {
        HWAdvertisingServiceConnection hWAdvertisingServiceConnection = new HWAdvertisingServiceConnection();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        try {
            try {
                if (context.bindService(intent, hWAdvertisingServiceConnection, 1)) {
                    try {
                        HWAdvertisingInfo create = HWAdvertisingInfo.HWAdvertisingInfoBinder.create(hWAdvertisingServiceConnection.getBinder());
                        this.openAdvertisingIdentifier = create.getId();
                        this.limitedOpenAdTracking = create.getEnabled(true);
                    } catch (Exception e) {
                        DeviceLog.exception("Couldn't get openAdvertising info", e);
                    }
                }
            } finally {
                context.unbindService(hWAdvertisingServiceConnection);
            }
        } catch (Exception e2) {
            DeviceLog.exception("Couldn't bind to identifier service intent", e2);
        }
    }

    private static OpenAdvertisingId getInstance() {
        if (instance == null) {
            instance = new OpenAdvertisingId();
        }
        return instance;
    }

    public static boolean getLimitedOpenAdTracking() {
        return getInstance().limitedOpenAdTracking;
    }

    public static String getOpenAdvertisingTrackingId() {
        return getInstance().openAdvertisingIdentifier;
    }

    public static void init(Context context) {
        if (Build.MANUFACTURER.toUpperCase().equals(HW_DEVICE_NAME)) {
            getInstance().fetchOAId(context);
        }
    }
}
