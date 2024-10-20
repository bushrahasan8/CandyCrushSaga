package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: zzq.class */
public final class zzq extends zzv implements zzs {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final int zza(int i, String str, String str2) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        Parcel zzv = zzv(5, zzu);
        int readInt = zzv.readInt();
        zzv.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final int zzc(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(i);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzx.zzc(zzu, bundle);
        Parcel zzv = zzv(10, zzu);
        int readInt = zzv.readInt();
        zzv.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle zzd(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(9);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzx.zzc(zzu, bundle);
        Parcel zzv = zzv(902, zzu);
        Bundle bundle2 = (Bundle) zzx.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle zze(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(9);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzx.zzc(zzu, bundle);
        Parcel zzv = zzv(12, zzu);
        Bundle bundle2 = (Bundle) zzx.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle zzf(int i, String str, String str2, String str3, String str4) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        zzu.writeString(null);
        Parcel zzv = zzv(3, zzu);
        Bundle bundle = (Bundle) zzx.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle zzg(int i, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(i);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        zzu.writeString(null);
        zzx.zzc(zzu, bundle);
        Parcel zzv = zzv(8, zzu);
        Bundle bundle2 = (Bundle) zzx.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle zzh(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(6);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        zzx.zzc(zzu, bundle);
        Parcel zzv = zzv(9, zzu);
        Bundle bundle2 = (Bundle) zzx.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle zzi(int i, String str, String str2, String str3) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        Parcel zzv = zzv(4, zzu);
        Bundle bundle = (Bundle) zzx.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle zzj(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(i);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        zzx.zzc(zzu, bundle);
        Parcel zzv = zzv(11, zzu);
        Bundle bundle2 = (Bundle) zzx.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle zzk(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzx.zzc(zzu, bundle);
        Parcel zzv = zzv(2, zzu);
        Bundle bundle2 = (Bundle) zzx.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle zzl(int i, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(i);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzx.zzc(zzu, bundle);
        zzx.zzc(zzu, bundle2);
        Parcel zzv = zzv(901, zzu);
        Bundle bundle3 = (Bundle) zzx.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzm(int i, String str, Bundle bundle, zzd zzdVar) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(21);
        zzu.writeString(str);
        zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzdVar);
        zzx(1501, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzn(int i, String str, Bundle bundle, zzf zzfVar) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(22);
        zzu.writeString(str);
        zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzfVar);
        zzx(1801, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzo(int i, String str, Bundle bundle, zzh zzhVar) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(21);
        zzu.writeString(str);
        zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzhVar);
        zzx(1601, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzp(int i, String str, Bundle bundle, zzj zzjVar) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(18);
        zzu.writeString(str);
        zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzjVar);
        zzw(IronSourceConstants.RV_AUCTION_FAILED, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzq(int i, String str, Bundle bundle, zzl zzlVar) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(22);
        zzu.writeString(str);
        zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzlVar);
        zzx(1901, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzr(int i, String str, Bundle bundle, zzn zznVar) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(21);
        zzu.writeString(str);
        zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zznVar);
        zzx(IronSourceConstants.RV_CAP_SESSION, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzs(int i, String str, Bundle bundle, zzp zzpVar) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(22);
        zzu.writeString(str);
        zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzpVar);
        zzx(1701, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzt(int i, String str, Bundle bundle, zzu zzuVar) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(12);
        zzu.writeString(str);
        zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzuVar);
        zzw(1201, zzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final int zzy(int i, String str, String str2) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(i);
        zzu.writeString(str);
        zzu.writeString(str2);
        Parcel zzv = zzv(1, zzu);
        int readInt = zzv.readInt();
        zzv.recycle();
        return readInt;
    }
}
