package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInConfigurationCreator")
@SafeParcelable.Reserved({1})
/* loaded from: SignInConfiguration.class */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new zzx();

    @SafeParcelable.Field(getter = "getConsumerPkgName", id = 2)
    private final String zzbr;

    @SafeParcelable.Field(getter = "getGoogleConfig", id = 5)
    private GoogleSignInOptions zzbs;

    @SafeParcelable.Constructor
    public SignInConfiguration(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 5) GoogleSignInOptions googleSignInOptions) {
        this.zzbr = Preconditions.checkNotEmpty(str);
        this.zzbs = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (!this.zzbr.equals(signInConfiguration.zzbr)) {
            return false;
        }
        GoogleSignInOptions googleSignInOptions = this.zzbs;
        return googleSignInOptions == null ? signInConfiguration.zzbs == null : googleSignInOptions.equals(signInConfiguration.zzbs);
    }

    public final int hashCode() {
        return new HashAccumulator().addObject(this.zzbr).addObject(this.zzbs).hash();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzbr, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzbs, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final GoogleSignInOptions zzm() {
        return this.zzbs;
    }
}
