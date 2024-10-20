package com.google.android.gms.drive.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.t2;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "CustomPropertyKeyCreator")
@SafeParcelable.Reserved({1})
/* loaded from: CustomPropertyKey.class */
public class CustomPropertyKey extends AbstractSafeParcelable {
    public static final int PRIVATE = 1;
    public static final int PUBLIC = 0;

    @SafeParcelable.Field(id = 3)
    private final int visibility;

    @SafeParcelable.Field(id = 2)
    private final String zziz;
    public static final Parcelable.Creator<CustomPropertyKey> CREATOR = new zzc();
    private static final Pattern zzja = Pattern.compile("[\\w.!@$%^&*()/-]+");

    @SafeParcelable.Constructor
    public CustomPropertyKey(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i) {
        Preconditions.checkNotNull(str, t2.h.W);
        Preconditions.checkArgument(zzja.matcher(str).matches(), "key name characters must be alphanumeric or one of .!@$%^&*()-_/");
        Preconditions.checkArgument(i != 0 ? i == 1 : true, "visibility must be either PUBLIC or PRIVATE");
        this.zziz = str;
        this.visibility = i;
    }

    public static CustomPropertyKey fromJson(JSONObject jSONObject) throws JSONException {
        return new CustomPropertyKey(jSONObject.getString(t2.h.W), jSONObject.getInt("visibility"));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        CustomPropertyKey customPropertyKey = (CustomPropertyKey) obj;
        return customPropertyKey.getKey().equals(this.zziz) && customPropertyKey.getVisibility() == this.visibility;
    }

    public String getKey() {
        return this.zziz;
    }

    public int getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        String str = this.zziz;
        int i = this.visibility;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(i);
        return sb.toString().hashCode();
    }

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(t2.h.W, getKey());
        jSONObject.put("visibility", getVisibility());
        return jSONObject;
    }

    public String toString() {
        String str = this.zziz;
        int i = this.visibility;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("CustomPropertyKey(");
        sb.append(str);
        sb.append(",");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zziz, false);
        SafeParcelWriter.writeInt(parcel, 3, this.visibility);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
