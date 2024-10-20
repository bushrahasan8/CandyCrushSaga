package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.media3.common.util.NetworkTypeObserver$Api31$;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzfm.class */
public final class zzfm extends BroadcastReceiver {
    final zzfn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfm(zzfn zzfnVar, zzfl zzflVar) {
        this.zza = zzfnVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i = type != 9 ? 8 : 7;
                                }
                                i = 5;
                            }
                        }
                        i = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i = 4;
                            break;
                        case 13:
                            i = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i = 6;
                            break;
                        case 18:
                            i = 2;
                            break;
                        case 20:
                            if (zzfy.zza >= 29) {
                                i = 9;
                                break;
                            }
                            break;
                    }
                } else {
                    i = 1;
                }
            } catch (SecurityException e) {
            }
        }
        if (zzfy.zza < 31 || i != 5) {
            zzfn.zzc(this.zza, i);
            return;
        }
        zzfn zzfnVar = this.zza;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            zzfk zzfkVar = new zzfk(zzfnVar);
            NetworkTypeObserver$Api31$.ExternalSyntheticApiModelOutline1.m(telephonyManager, NetworkTypeObserver$Api31$.ExternalSyntheticApiModelOutline0.m(context), zzfkVar);
            NetworkTypeObserver$Api31$.ExternalSyntheticApiModelOutline2.m(telephonyManager, zzfkVar);
        } catch (RuntimeException e2) {
            zzfn.zzc(zzfnVar, 5);
        }
    }
}
