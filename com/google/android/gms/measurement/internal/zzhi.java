package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: zzhi.class */
public final class zzhi {
    private final Resources zza;
    private final String zzb;

    public zzhi(Context context, String str) {
        Preconditions.checkNotNull(context);
        this.zza = context.getResources();
        if (TextUtils.isEmpty(str)) {
            this.zzb = zza(context);
        } else {
            this.zzb = str;
        }
    }

    public static String zza(Context context) {
        String packageName;
        try {
            packageName = context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException e) {
            packageName = context.getPackageName();
        }
        return packageName;
    }

    public final String zza(String str) {
        int identifier = this.zza.getIdentifier(str, "string", this.zzb);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.zza.getString(identifier);
        } catch (Resources.NotFoundException e) {
            return null;
        }
    }
}
