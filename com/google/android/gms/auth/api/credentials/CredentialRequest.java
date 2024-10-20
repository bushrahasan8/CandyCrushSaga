package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SafeParcelable.Class(creator = "CredentialRequestCreator")
/* loaded from: CredentialRequest.class */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new zzg();

    @SafeParcelable.Field(getter = "getAccountTypes", id = 2)
    private final String[] zzaa;

    @SafeParcelable.Field(getter = "getCredentialPickerConfig", id = 3)
    private final CredentialPickerConfig zzab;

    @SafeParcelable.Field(getter = "getCredentialHintPickerConfig", id = 4)
    private final CredentialPickerConfig zzac;

    @SafeParcelable.Field(getter = "isIdTokenRequested", id = 5)
    private final boolean zzad;

    @SafeParcelable.Field(getter = "getServerClientId", id = 6)
    private final String zzae;

    @SafeParcelable.Field(getter = "getIdTokenNonce", id = 7)
    private final String zzaf;

    @SafeParcelable.Field(getter = "getRequireUserMediation", id = 8)
    private final boolean zzag;

    @SafeParcelable.Field(id = 1000)
    private final int zzu;

    @SafeParcelable.Field(getter = "isPasswordLoginSupported", id = 1)
    private final boolean zzz;

    /* loaded from: CredentialRequest$Builder.class */
    public static final class Builder {
        private String[] zzaa;
        private CredentialPickerConfig zzab;
        private CredentialPickerConfig zzac;
        private String zzaf;
        private boolean zzz;
        private boolean zzad = false;
        private boolean zzag = false;
        private String zzae = null;

        public final CredentialRequest build() {
            if (this.zzaa == null) {
                this.zzaa = new String[0];
            }
            if (this.zzz || this.zzaa.length != 0) {
                return new CredentialRequest(this);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }

        public final Builder setAccountTypes(String... strArr) {
            String[] strArr2 = strArr;
            if (strArr == null) {
                strArr2 = new String[0];
            }
            this.zzaa = strArr2;
            return this;
        }

        public final Builder setCredentialHintPickerConfig(CredentialPickerConfig credentialPickerConfig) {
            this.zzac = credentialPickerConfig;
            return this;
        }

        public final Builder setCredentialPickerConfig(CredentialPickerConfig credentialPickerConfig) {
            this.zzab = credentialPickerConfig;
            return this;
        }

        public final Builder setIdTokenNonce(String str) {
            this.zzaf = str;
            return this;
        }

        public final Builder setIdTokenRequested(boolean z) {
            this.zzad = z;
            return this;
        }

        public final Builder setPasswordLoginSupported(boolean z) {
            this.zzz = z;
            return this;
        }

        public final Builder setServerClientId(String str) {
            this.zzae = str;
            return this;
        }

        @Deprecated
        public final Builder setSupportsPasswordLogin(boolean z) {
            return setPasswordLoginSupported(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public CredentialRequest(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) String[] strArr, @SafeParcelable.Param(id = 3) CredentialPickerConfig credentialPickerConfig, @SafeParcelable.Param(id = 4) CredentialPickerConfig credentialPickerConfig2, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) boolean z3) {
        this.zzu = i;
        this.zzz = z;
        this.zzaa = (String[]) Preconditions.checkNotNull(strArr);
        this.zzab = credentialPickerConfig == null ? new CredentialPickerConfig.Builder().build() : credentialPickerConfig;
        this.zzac = credentialPickerConfig2 == null ? new CredentialPickerConfig.Builder().build() : credentialPickerConfig2;
        if (i < 3) {
            this.zzad = true;
            this.zzae = null;
            this.zzaf = null;
        } else {
            this.zzad = z2;
            this.zzae = str;
            this.zzaf = str2;
        }
        this.zzag = z3;
    }

    private CredentialRequest(Builder builder) {
        this(4, builder.zzz, builder.zzaa, builder.zzab, builder.zzac, builder.zzad, builder.zzae, builder.zzaf, false);
    }

    public final String[] getAccountTypes() {
        return this.zzaa;
    }

    public final Set<String> getAccountTypesSet() {
        return new HashSet(Arrays.asList(this.zzaa));
    }

    public final CredentialPickerConfig getCredentialHintPickerConfig() {
        return this.zzac;
    }

    public final CredentialPickerConfig getCredentialPickerConfig() {
        return this.zzab;
    }

    public final String getIdTokenNonce() {
        return this.zzaf;
    }

    public final String getServerClientId() {
        return this.zzae;
    }

    @Deprecated
    public final boolean getSupportsPasswordLogin() {
        return isPasswordLoginSupported();
    }

    public final boolean isIdTokenRequested() {
        return this.zzad;
    }

    public final boolean isPasswordLoginSupported() {
        return this.zzz;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, isPasswordLoginSupported());
        SafeParcelWriter.writeStringArray(parcel, 2, getAccountTypes(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getCredentialPickerConfig(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getCredentialHintPickerConfig(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 5, isIdTokenRequested());
        SafeParcelWriter.writeString(parcel, 6, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel, 7, getIdTokenNonce(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzu);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzag);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
