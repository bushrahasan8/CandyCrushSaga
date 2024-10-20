package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: zzbke.class */
public final class zzbke extends zzayg implements zzbkg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbke(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.google.android.gms.internal.ads.zzbjj] */
    @Override // com.google.android.gms.internal.ads.zzbkg
    public final zzbjj zzf() throws RemoteException {
        zzbjh zzbjhVar;
        Parcel zzbl = zzbl(16, zza());
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            zzbjhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbjhVar = queryLocalInterface instanceof zzbjj ? (zzbjj) queryLocalInterface : new zzbjh(readStrongBinder);
        }
        zzbl.recycle();
        return zzbjhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.google.android.gms.internal.ads.zzbjm] */
    @Override // com.google.android.gms.internal.ads.zzbkg
    public final zzbjm zzg(String str) throws RemoteException {
        zzbjk zzbjkVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbl = zzbl(2, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            zzbjkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbjkVar = queryLocalInterface instanceof zzbjm ? (zzbjm) queryLocalInterface : new zzbjk(readStrongBinder);
        }
        zzbl.recycle();
        return zzbjkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final IObjectWrapper zzh() throws RemoteException {
        Parcel zzbl = zzbl(9, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbl.readStrongBinder());
        zzbl.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final String zzi() throws RemoteException {
        Parcel zzbl = zzbl(4, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final String zzj(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbl = zzbl(1, zza);
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final List zzk() throws RemoteException {
        Parcel zzbl = zzbl(3, zza());
        ArrayList<String> createStringArrayList = zzbl.createStringArrayList();
        zzbl.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzl() throws RemoteException {
        zzbm(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzm() throws RemoteException {
        zzbm(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzn(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbm(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzo() throws RemoteException {
        zzbm(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayi.zzf(zza, iObjectWrapper);
        zzbm(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final boolean zzq() throws RemoteException {
        Parcel zzbl = zzbl(12, zza());
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayi.zzf(zza, iObjectWrapper);
        Parcel zzbl = zzbl(17, zza);
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayi.zzf(zza, iObjectWrapper);
        Parcel zzbl = zzbl(10, zza);
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final boolean zzt() throws RemoteException {
        Parcel zzbl = zzbl(13, zza());
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }
}
