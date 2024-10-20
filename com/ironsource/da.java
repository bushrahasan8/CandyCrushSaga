package com.ironsource;

import com.ironsource.sdk.controller.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: da.class */
public final class da {
    public static final a d = new a(null);
    private final String a;
    private final String b;
    private final JSONObject c;

    /* loaded from: da$a.class */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final da a(String jsonStr) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
            JSONObject jSONObject = new JSONObject(jsonStr);
            String adId = jSONObject.getString(f.b.c);
            String command = jSONObject.getString(f.b.g);
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            Intrinsics.checkNotNullExpressionValue(adId, "adId");
            Intrinsics.checkNotNullExpressionValue(command, "command");
            return new da(adId, command, optJSONObject);
        }
    }

    public da(String adId, String command, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(command, "command");
        this.a = adId;
        this.b = command;
        this.c = jSONObject;
    }

    public static /* synthetic */ da a(da daVar, String str, String str2, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = daVar.a;
        }
        if ((i & 2) != 0) {
            str2 = daVar.b;
        }
        if ((i & 4) != 0) {
            jSONObject = daVar.c;
        }
        return daVar.a(str, str2, jSONObject);
    }

    public static final da a(String str) throws JSONException {
        return d.a(str);
    }

    public final da a(String adId, String command, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(command, "command");
        return new da(adId, command, jSONObject);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final JSONObject c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da)) {
            return false;
        }
        da daVar = (da) obj;
        return Intrinsics.areEqual(this.a, daVar.a) && Intrinsics.areEqual(this.b, daVar.b) && Intrinsics.areEqual(this.c, daVar.c);
    }

    public final JSONObject f() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        JSONObject jSONObject = this.c;
        return (((hashCode * 31) + hashCode2) * 31) + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "MessageToNative(adId=" + this.a + ", command=" + this.b + ", params=" + this.c + ')';
    }
}
