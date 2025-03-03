package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.iid.zzaf;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* loaded from: GoogleCloudMessaging.class */
public class GoogleCloudMessaging {
    public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    public static final String INSTANCE_ID_SCOPE = "GCM";

    @Deprecated
    public static final String MESSAGE_TYPE_DELETED = "deleted_messages";

    @Deprecated
    public static final String MESSAGE_TYPE_MESSAGE = "gcm";

    @Deprecated
    public static final String MESSAGE_TYPE_SEND_ERROR = "send_error";

    @Deprecated
    public static final String MESSAGE_TYPE_SEND_EVENT = "send_event";
    private static GoogleCloudMessaging zzae;
    private static final AtomicInteger zzah = new AtomicInteger(1);
    private PendingIntent zzaf;
    private final Map<String, Handler> zzag = Collections.synchronizedMap(new ArrayMap());
    private final BlockingQueue<Intent> zzai = new LinkedBlockingQueue();
    private final Messenger zzaj = new Messenger(new zzf(this, Looper.getMainLooper()));
    private Context zzl;

    @Deprecated
    public static GoogleCloudMessaging getInstance(Context context) {
        GoogleCloudMessaging googleCloudMessaging;
        synchronized (GoogleCloudMessaging.class) {
            try {
                if (zzae == null) {
                    zze(context);
                    GoogleCloudMessaging googleCloudMessaging2 = new GoogleCloudMessaging();
                    zzae = googleCloudMessaging2;
                    googleCloudMessaging2.zzl = context.getApplicationContext();
                }
                googleCloudMessaging = zzae;
            } catch (Throwable th) {
                throw th;
            }
        }
        return googleCloudMessaging;
    }

    @Deprecated
    private final Intent zzd(Bundle bundle, boolean z) throws IOException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        if (zzf(this.zzl) < 0) {
            throw new IOException("Google Play Services missing");
        }
        Intent intent = new Intent(z ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.setPackage(zzaf.zzl(this.zzl));
        zze(intent);
        int andIncrement = zzah.getAndIncrement();
        StringBuilder sb = new StringBuilder(21);
        sb.append("google.rpc");
        sb.append(andIncrement);
        intent.putExtra("google.message_id", sb.toString());
        intent.putExtras(bundle);
        intent.putExtra("google.messenger", this.zzaj);
        if (z) {
            this.zzl.sendBroadcast(intent);
        } else {
            this.zzl.startService(intent);
        }
        try {
            return this.zzai.poll(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IOException(e.getMessage());
        }
    }

    @ShowFirstParty
    @VisibleForTesting
    @Deprecated
    private final String zzd(boolean z, String... strArr) throws IOException {
        synchronized (this) {
            String zzl = zzaf.zzl(this.zzl);
            if (zzl == null) {
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            if (strArr == null || strArr.length == 0) {
                throw new IllegalArgumentException("No senderIds");
            }
            StringBuilder sb = new StringBuilder(strArr[0]);
            for (int i = 1; i < strArr.length; i++) {
                sb.append(',');
                sb.append(strArr[i]);
            }
            String sb2 = sb.toString();
            Bundle bundle = new Bundle();
            if (zzl.contains(".gsf")) {
                bundle.putString("legacy.sender", sb2);
                return InstanceID.getInstance(this.zzl).getToken(sb2, "GCM", bundle);
            }
            bundle.putString("sender", sb2);
            Intent zzd = zzd(bundle, z);
            if (zzd == null) {
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            String stringExtra = zzd.getStringExtra("registration_id");
            if (stringExtra != null) {
                return stringExtra;
            }
            String stringExtra2 = zzd.getStringExtra(MRAIDPresenter.ERROR);
            if (stringExtra2 != null) {
                throw new IOException(stringExtra2);
            }
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzd(Intent intent) {
        Handler remove;
        String stringExtra = intent.getStringExtra("In-Reply-To");
        String str = stringExtra;
        if (stringExtra == null) {
            str = stringExtra;
            if (intent.hasExtra(MRAIDPresenter.ERROR)) {
                str = intent.getStringExtra("google.message_id");
            }
        }
        if (str == null || (remove = this.zzag.remove(str)) == null) {
            return false;
        }
        Message obtain = Message.obtain();
        obtain.obj = intent;
        return remove.sendMessage(obtain);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zze(Context context) {
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 48);
        sb.append("GCM SDK is deprecated, ");
        sb.append(packageName);
        sb.append(" should update to use FCM");
        Log.w("GCM", sb.toString());
    }

    private final void zze(Intent intent) {
        synchronized (this) {
            if (this.zzaf == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                this.zzaf = PendingIntent.getBroadcast(this.zzl, 0, intent2, 0);
            }
            intent.putExtra("app", this.zzaf);
        }
    }

    public static int zzf(Context context) {
        String zzl = zzaf.zzl(context);
        if (zzl == null) {
            return -1;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(zzl, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return -1;
        } catch (PackageManager.NameNotFoundException e) {
            return -1;
        }
    }

    private final void zzh() {
        synchronized (this) {
            PendingIntent pendingIntent = this.zzaf;
            if (pendingIntent != null) {
                pendingIntent.cancel();
                this.zzaf = null;
            }
        }
    }

    @Deprecated
    public void close() {
        zzae = null;
        zzd.zzk = null;
        zzh();
    }

    @Deprecated
    public String getMessageType(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return null;
        }
        String stringExtra = intent.getStringExtra("message_type");
        return stringExtra != null ? stringExtra : MESSAGE_TYPE_MESSAGE;
    }

    @Deprecated
    public String register(String... strArr) throws IOException {
        String zzd;
        synchronized (this) {
            zzd = zzd(zzaf.zzk(this.zzl), strArr);
        }
        return zzd;
    }

    @Deprecated
    public void send(String str, String str2, long j, Bundle bundle) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        String zzl = zzaf.zzl(this.zzl);
        if (zzl == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        zze(intent);
        intent.setPackage(zzl);
        intent.putExtra("google.to", str);
        intent.putExtra("google.message_id", str2);
        intent.putExtra("google.ttl", Long.toString(j));
        int indexOf = str.indexOf(64);
        String substring = indexOf > 0 ? str.substring(0, indexOf) : str;
        InstanceID.getInstance(this.zzl);
        intent.putExtra("google.from", InstanceID.zzp().zzf("", substring, "GCM"));
        if (!zzl.contains(".gsf")) {
            this.zzl.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        Bundle bundle2 = new Bundle();
        for (String str3 : bundle.keySet()) {
            Object obj = bundle.get(str3);
            if (obj instanceof String) {
                String valueOf = String.valueOf(str3);
                bundle2.putString(valueOf.length() != 0 ? "gcm.".concat(valueOf) : new String("gcm."), (String) obj);
            }
        }
        bundle2.putString("google.to", str);
        bundle2.putString("google.message_id", str2);
        InstanceID.getInstance(this.zzl).zze("GCM", "upstream", bundle2);
    }

    @Deprecated
    public void send(String str, String str2, Bundle bundle) throws IOException {
        send(str, str2, -1L, bundle);
    }

    @Deprecated
    public void unregister() throws IOException {
        synchronized (this) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                throw new IOException("MAIN_THREAD");
            }
            InstanceID.getInstance(this.zzl).deleteInstanceID();
        }
    }
}
