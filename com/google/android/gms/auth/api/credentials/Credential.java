package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "CredentialCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: Credential.class */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new zzc();
    public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";

    @SafeParcelable.Field(getter = "getId", id = 1)
    private final String mId;

    @SafeParcelable.Field(getter = "getName", id = 2)
    private final String mName;

    @SafeParcelable.Field(getter = "getProfilePictureUri", id = 3)
    private final Uri zzo;

    @SafeParcelable.Field(getter = "getIdTokens", id = 4)
    private final List<IdToken> zzp;

    @SafeParcelable.Field(getter = "getPassword", id = 5)
    private final String zzq;

    @SafeParcelable.Field(getter = "getAccountType", id = 6)
    private final String zzr;

    @SafeParcelable.Field(getter = "getGivenName", id = 9)
    private final String zzs;

    @SafeParcelable.Field(getter = "getFamilyName", id = 10)
    private final String zzt;

    /* loaded from: Credential$Builder.class */
    public static class Builder {
        private final String mId;
        private String mName;
        private Uri zzo;
        private List<IdToken> zzp;
        private String zzq;
        private String zzr;
        private String zzs;
        private String zzt;

        public Builder(Credential credential) {
            this.mId = credential.mId;
            this.mName = credential.mName;
            this.zzo = credential.zzo;
            this.zzp = credential.zzp;
            this.zzq = credential.zzq;
            this.zzr = credential.zzr;
            this.zzs = credential.zzs;
            this.zzt = credential.zzt;
        }

        public Builder(String str) {
            this.mId = str;
        }

        public Credential build() {
            return new Credential(this.mId, this.mName, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt);
        }

        public Builder setAccountType(String str) {
            this.zzr = str;
            return this;
        }

        public Builder setName(String str) {
            this.mName = str;
            return this;
        }

        public Builder setPassword(String str) {
            this.zzq = str;
            return this;
        }

        public Builder setProfilePictureUri(Uri uri) {
            this.zzo = uri;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        if (com.unity3d.services.core.network.model.HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(r0.getScheme()) != false) goto L26;
     */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Credential(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) android.net.Uri r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.util.List<com.google.android.gms.auth.api.credentials.IdToken> r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.lang.String r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.String r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) java.lang.String r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.Credential.<init>(java.lang.String, java.lang.String, android.net.Uri, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.mId, credential.mId) && TextUtils.equals(this.mName, credential.mName) && Objects.equal(this.zzo, credential.zzo) && TextUtils.equals(this.zzq, credential.zzq) && TextUtils.equals(this.zzr, credential.zzr);
    }

    public String getAccountType() {
        return this.zzr;
    }

    public String getFamilyName() {
        return this.zzt;
    }

    public String getGivenName() {
        return this.zzs;
    }

    public String getId() {
        return this.mId;
    }

    public List<IdToken> getIdTokens() {
        return this.zzp;
    }

    public String getName() {
        return this.mName;
    }

    public String getPassword() {
        return this.zzq;
    }

    public Uri getProfilePictureUri() {
        return this.zzo;
    }

    public int hashCode() {
        return Objects.hashCode(this.mId, this.mName, this.zzo, this.zzq, this.zzr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeString(parcel, 2, getName(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getProfilePictureUri(), i, false);
        SafeParcelWriter.writeTypedList(parcel, 4, getIdTokens(), false);
        SafeParcelWriter.writeString(parcel, 5, getPassword(), false);
        SafeParcelWriter.writeString(parcel, 6, getAccountType(), false);
        SafeParcelWriter.writeString(parcel, 9, getGivenName(), false);
        SafeParcelWriter.writeString(parcel, 10, getFamilyName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
