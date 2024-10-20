package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.ironsource.h4;
import java.util.ArrayList;

/* loaded from: zzp.class */
public final class zzp implements Parcelable.Creator<zzn> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzn createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i2 = 0;
        long j8 = -2147483648L;
        String str11 = "";
        String str12 = "";
        String str13 = str12;
        String str14 = str13;
        int i3 = 100;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    j = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 7:
                    j2 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 8:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    z3 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    j8 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 12:
                    str6 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 13:
                    j3 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 14:
                    j4 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 15:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 16:
                    z2 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 17:
                case 20:
                case 33:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 18:
                    z4 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 19:
                    str7 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 21:
                    bool = SafeParcelReader.readBooleanObject(parcel, readHeader);
                    break;
                case 22:
                    j5 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 23:
                    arrayList = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 24:
                    str8 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case VIEW_NOT_VISIBLE_ON_PLAY_VALUE:
                    str11 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case MRAID_DOWNLOAD_JS_RETRY_SUCCESS_VALUE:
                    str12 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case OMSDK_DOWNLOAD_JS_RETRY_SUCCESS_VALUE:
                    str9 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case PRIVACY_URL_OPENED_VALUE:
                    z5 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case NOTIFICATION_REDIRECT_VALUE:
                    j6 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 30:
                    i3 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 31:
                    str13 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case h4.i /* 32 */:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 34:
                    j7 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 35:
                    str10 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 36:
                    str14 = SafeParcelReader.createString(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzn(str, str2, str3, str4, j, j2, str5, z, z3, j8, str6, j3, j4, i, z2, z4, str7, bool, j5, arrayList, str8, str11, str12, str9, z5, j6, i3, str13, i2, j7, str10, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzn[] newArray(int i) {
        return new zzn[i];
    }
}
