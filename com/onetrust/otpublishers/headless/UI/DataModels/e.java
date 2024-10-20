package com.onetrust.otpublishers.headless.UI.DataModels;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: e.class */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();
    public String a;
    public ArrayList b = new ArrayList();

    /* loaded from: e$a.class */
    public final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new e[i];
        }
    }

    public e() {
    }

    public e(Parcel parcel) {
        this.a = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
