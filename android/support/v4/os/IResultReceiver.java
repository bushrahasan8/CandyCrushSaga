package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: IResultReceiver.class */
public interface IResultReceiver extends IInterface {
    public static final String DESCRIPTOR = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* loaded from: IResultReceiver$Stub.class */
    public static abstract class Stub extends Binder implements IResultReceiver {

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: IResultReceiver$Stub$Proxy.class */
        public static class Proxy implements IResultReceiver {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }
        }

        public Stub() {
            attachInterface(this, IResultReceiver.DESCRIPTOR);
        }

        public static IResultReceiver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IResultReceiver.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IResultReceiver)) ? new Proxy(iBinder) : (IResultReceiver) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IResultReceiver.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            send(parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
            return true;
        }
    }

    /* loaded from: IResultReceiver$_Parcel.class */
    public static abstract class _Parcel {
        public static Object readTypedObject(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void send(int i, Bundle bundle);
}
