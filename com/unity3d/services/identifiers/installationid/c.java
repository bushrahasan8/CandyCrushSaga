package com.unity3d.services.identifiers.installationid;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: c.class */
public final class c implements a {
    public final Context a;
    public final String b;
    public final String c;

    public c(Context context, String settingsFile, String key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(settingsFile, "settingsFile");
        Intrinsics.checkNotNullParameter(key, "key");
        this.a = context;
        this.b = settingsFile;
        this.c = key;
    }

    @Override // com.unity3d.services.identifiers.installationid.a
    public final String a() {
        String string = this.a.getSharedPreferences(this.b, 0).getString(this.c, "");
        return string != null ? string : "";
    }

    @Override // com.unity3d.services.identifiers.installationid.a
    public final void a(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        SharedPreferences.Editor edit = this.a.getSharedPreferences(this.b, 0).edit();
        edit.putString(this.c, id);
        edit.apply();
    }
}
