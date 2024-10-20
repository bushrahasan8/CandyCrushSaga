package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "PermissionCreator")
@SafeParcelable.Reserved({1})
/* loaded from: zzr.class */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    @SafeParcelable.Field(getter = "getAccountType", id = 3)
    private int accountType;

    @SafeParcelable.Field(getter = "getAccountIdentifier", id = 2)
    private String zzbg;

    @SafeParcelable.Field(getter = "getAccountDisplayName", id = 4)
    private String zzbh;

    @SafeParcelable.Field(getter = "getPhotoLink", id = 5)
    private String zzbi;

    @SafeParcelable.Field(getter = "getRole", id = 6)
    private int zzbj;

    @SafeParcelable.Field(getter = "isLinkRequiredForAccess", id = 7)
    private boolean zzbk;

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) int i2, @SafeParcelable.Param(id = 7) boolean z) {
        this.zzbg = str;
        this.accountType = i;
        this.zzbh = str2;
        this.zzbi = str3;
        this.zzbj = i2;
        this.zzbk = z;
    }

    private static boolean zzb(int i) {
        switch (i) {
            case 256:
            case 257:
            case 258:
                return true;
            default:
                return false;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != zzr.class) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzr zzrVar = (zzr) obj;
        return Objects.equal(this.zzbg, zzrVar.zzbg) && this.accountType == zzrVar.accountType && this.zzbj == zzrVar.zzbj && this.zzbk == zzrVar.zzbk;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzbg, Integer.valueOf(this.accountType), Integer.valueOf(this.zzbj), Boolean.valueOf(this.zzbk));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, !zzb(this.accountType) ? null : this.zzbg, false);
        SafeParcelWriter.writeInt(parcel, 3, !zzb(this.accountType) ? -1 : this.accountType);
        SafeParcelWriter.writeString(parcel, 4, this.zzbh, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbi, false);
        int i2 = this.zzbj;
        if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            i2 = -1;
        }
        SafeParcelWriter.writeInt(parcel, 6, i2);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzbk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
