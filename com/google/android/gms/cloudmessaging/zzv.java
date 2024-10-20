package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;

/* loaded from: zzv.class */
public final class zzv {
    private final Context zza;
    private int zzb;
    private int zzc = 0;

    public zzv(Context context) {
        this.zza = context;
    }

    public final int zza() {
        int i;
        PackageInfo packageInfo;
        synchronized (this) {
            if (this.zzb == 0) {
                try {
                    packageInfo = Wrappers.packageManager(this.zza).getPackageInfo("com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    this.zzb = packageInfo.versionCode;
                }
            }
            i = this.zzb;
        }
        return i;
    }

    public final int zzb() {
        int i;
        synchronized (this) {
            int i2 = this.zzc;
            if (i2 != 0) {
                return i2;
            }
            Context context = this.zza;
            PackageManager packageManager = context.getPackageManager();
            if (Wrappers.packageManager(context).checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                Log.e("Metadata", "Google Play services missing or without correct permission.");
                return 0;
            }
            int i3 = 1;
            if (!PlatformVersion.isAtLeastO()) {
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    i = 1;
                    this.zzc = i;
                    return i;
                }
            }
            Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent2.setPackage("com.google.android.gms");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
                i = 2;
                this.zzc = i;
                return i;
            }
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (true == PlatformVersion.isAtLeastO()) {
                i3 = 2;
            }
            this.zzc = i3;
            return i3;
        }
    }
}
