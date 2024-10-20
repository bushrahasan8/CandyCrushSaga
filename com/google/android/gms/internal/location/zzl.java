package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DeviceOrientationRequestUpdateDataCreator")
/* loaded from: zzl.class */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestUpdateData.OPERATION_ADD", id = 1)
    final int zza;

    @SafeParcelable.Field(defaultValueUnchecked = "null", id = 2)
    final zzj zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getDeviceOrientationListenerBinder", id = 3, type = "android.os.IBinder")
    final com.google.android.gms.location.zzax zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getFusedLocationProviderCallbackBinder", id = 4, type = "android.os.IBinder")
    final zzai zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.google.android.gms.internal.location.zzai] */
    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) zzj zzjVar, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) IBinder iBinder2) {
        zzag zzagVar;
        this.zza = i;
        this.zzb = zzjVar;
        this.zzc = iBinder == null ? null : com.google.android.gms.location.zzaw.zzb(iBinder);
        if (iBinder2 == null) {
            zzagVar = null;
        } else {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzagVar = queryLocalInterface instanceof zzai ? (zzai) queryLocalInterface : new zzag(iBinder2);
        }
        this.zzd = zzagVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.location.zzax zzaxVar = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, zzaxVar == null ? null : zzaxVar.asBinder(), false);
        zzai zzaiVar = this.zzd;
        SafeParcelWriter.writeIBinder(parcel, 4, zzaiVar == null ? null : zzaiVar.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
