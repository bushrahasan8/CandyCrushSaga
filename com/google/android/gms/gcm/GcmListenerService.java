package com.google.android.gms.gcm;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* loaded from: GcmListenerService.class */
public class GcmListenerService extends com.google.android.gms.iid.zze {
    private com.google.android.gms.internal.gcm.zzl zzg = com.google.android.gms.internal.gcm.zzm.zzdk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzd(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next != null && next.startsWith("google.c.")) {
                it.remove();
            }
        }
    }

    @Override // com.google.android.gms.iid.zze
    public void handleIntent(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            String valueOf = String.valueOf(intent.getAction());
            Log.w("GcmListenerService", valueOf.length() != 0 ? "Unknown intent action: ".concat(valueOf) : new String("Unknown intent action: "));
            return;
        }
        String stringExtra = intent.getStringExtra("message_type");
        String str = stringExtra;
        if (stringExtra == null) {
            str = GoogleCloudMessaging.MESSAGE_TYPE_MESSAGE;
        }
        boolean z = -1;
        switch (str.hashCode()) {
            case -2062414158:
                if (str.equals(GoogleCloudMessaging.MESSAGE_TYPE_DELETED)) {
                    z = false;
                    break;
                }
                break;
            case 102161:
                if (str.equals(GoogleCloudMessaging.MESSAGE_TYPE_MESSAGE)) {
                    z = true;
                    break;
                }
                break;
            case 814694033:
                if (str.equals(GoogleCloudMessaging.MESSAGE_TYPE_SEND_ERROR)) {
                    z = 2;
                    break;
                }
                break;
            case 814800675:
                if (str.equals(GoogleCloudMessaging.MESSAGE_TYPE_SEND_EVENT)) {
                    z = 3;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
                onDeletedMessages();
                return;
            case true:
                Bundle extras = intent.getExtras();
                extras.remove("message_type");
                extras.remove("androidx.contentpager.content.wakelockid");
                if ("1".equals(zzd.zzd(extras, "gcm.n.e")) || zzd.zzd(extras, "gcm.n.icon") != null) {
                    if (!((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                        int myPid = Process.myPid();
                        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses();
                        if (runningAppProcesses != null) {
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    ActivityManager.RunningAppProcessInfo next = it.next();
                                    if (next.pid == myPid) {
                                        if (next.importance == 100) {
                                            Bundle bundle = new Bundle();
                                            Iterator<String> it2 = extras.keySet().iterator();
                                            while (it2.hasNext()) {
                                                String next2 = it2.next();
                                                String string = extras.getString(next2);
                                                String str2 = next2;
                                                if (next2.startsWith("gcm.notification.")) {
                                                    str2 = next2.replace("gcm.notification.", "gcm.n.");
                                                }
                                                if (str2.startsWith("gcm.n.")) {
                                                    if (!"gcm.n.e".equals(str2)) {
                                                        bundle.putString(str2.substring(6), string);
                                                    }
                                                    it2.remove();
                                                }
                                            }
                                            String string2 = bundle.getString("sound2");
                                            if (string2 != null) {
                                                bundle.remove("sound2");
                                                bundle.putString("sound", string2);
                                            }
                                            if (!bundle.isEmpty()) {
                                                extras.putBundle("notification", bundle);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    zzd.zzd(this).zze(extras);
                    return;
                }
                String string3 = extras.getString("from");
                extras.remove("from");
                zzd(extras);
                this.zzg.zzl("onMessageReceived");
                onMessageReceived(string3, extras);
                return;
            case true:
                String stringExtra2 = intent.getStringExtra("google.message_id");
                String str3 = stringExtra2;
                if (stringExtra2 == null) {
                    str3 = intent.getStringExtra("message_id");
                }
                onSendError(str3, intent.getStringExtra(MRAIDPresenter.ERROR));
                return;
            case true:
                onMessageSent(intent.getStringExtra("google.message_id"));
                return;
            default:
                Log.w("GcmListenerService", str.length() != 0 ? "Received message with unknown type: ".concat(str) : new String("Received message with unknown type: "));
                return;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.google.android.gms.internal.gcm.zzm.zzab();
        this.zzg = com.google.android.gms.internal.gcm.zzm.zzdk;
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(String str, Bundle bundle) {
    }

    public void onMessageSent(String str) {
    }

    public void onSendError(String str, String str2) {
    }
}
