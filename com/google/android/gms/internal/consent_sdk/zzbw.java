package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.ContextWrapper;
import android.content.Intent;
import com.google.android.gms.drive.DriveFile;

/* loaded from: zzbw.class */
public final class zzbw extends ContextWrapper {
    private Activity zza;

    public zzbw(Application application) {
        super(application);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        Activity activity = this.zza;
        return activity != null ? activity.getSystemService(str) : super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.zza;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(DriveFile.MODE_READ_ONLY);
            super.startActivity(intent);
        }
    }

    public final void zza(Activity activity) {
        this.zza = activity;
    }
}
