package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.t2;

@SafeParcelable.Class(creator = "OperatorCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: zzx.class */
public final class zzx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new zzy();
    public static final zzx zzmq = new zzx(t2.i.b);
    public static final zzx zzmr = new zzx("<");
    public static final zzx zzms = new zzx("<=");
    public static final zzx zzmt = new zzx(">");
    public static final zzx zzmu = new zzx(">=");
    public static final zzx zzmv = new zzx("and");
    public static final zzx zzmw = new zzx("or");
    private static final zzx zzmx = new zzx("not");
    public static final zzx zzmy = new zzx("contains");

    @SafeParcelable.Field(id = 1)
    private final String tag;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzx(@SafeParcelable.Param(id = 1) String str) {
        this.tag = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzx.class != obj.getClass()) {
            return false;
        }
        zzx zzxVar = (zzx) obj;
        String str = this.tag;
        return str == null ? zzxVar.tag == null : str.equals(zzxVar.tag);
    }

    public final String getTag() {
        return this.tag;
    }

    public final int hashCode() {
        String str = this.tag;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.tag, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
