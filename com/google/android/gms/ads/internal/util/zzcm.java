package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import bo.app.t$;
import com.google.android.gms.internal.ads.zzbgc;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: zzcm.class */
public final class zzcm {
    private boolean zzd;
    private Context zze;
    private boolean zzc = false;
    private final Map zzb = new WeakHashMap();
    private final BroadcastReceiver zza = new zzcl(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(Context context, Intent intent) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.zzb.entrySet()) {
                if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                    arrayList.add((BroadcastReceiver) entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
            }
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final void zzb(Context context) {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.zze = applicationContext;
            if (applicationContext == null) {
                this.zze = context;
            }
            zzbgc.zza(this.zze);
            this.zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzdI)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzkw)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.zze.registerReceiver(this.zza, intentFilter);
            } else {
                t$.ExternalSyntheticApiModelOutline0.m(this.zze, this.zza, intentFilter, 4);
            }
            this.zzc = true;
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final void zzc(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this) {
            if (this.zzd) {
                this.zzb.put(broadcastReceiver, intentFilter);
                return;
            }
            zzbgc.zza(context);
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzkw)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                context.registerReceiver(broadcastReceiver, intentFilter);
            } else {
                t$.ExternalSyntheticApiModelOutline0.m(context, broadcastReceiver, intentFilter, 4);
            }
        }
    }

    public final void zzd(Context context, BroadcastReceiver broadcastReceiver) {
        synchronized (this) {
            if (this.zzd) {
                this.zzb.remove(broadcastReceiver);
            } else {
                context.unregisterReceiver(broadcastReceiver);
            }
        }
    }
}
