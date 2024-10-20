package com.google.android.gms.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.i5;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.IOException;
import java.security.KeyPair;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@ShowFirstParty
/* loaded from: zzaf.class */
public class zzaf {
    private PendingIntent zzaf;
    private Messenger zzaj;
    private Map<String, Object> zzcz = new ArrayMap();
    private Messenger zzda;
    private MessengerCompat zzdb;
    private Context zzl;
    private static final zzaj<Boolean> zzct = zzai.zzy().zzd("gcm_iid_use_messenger_ipc", true);
    private static String zzcu = null;
    private static boolean zzcv = false;
    private static int zzcw = 0;
    private static int zzcx = 0;
    private static int zzcp = 0;
    private static BroadcastReceiver zzcy = null;

    public zzaf(Context context) {
        this.zzl = context;
    }

    private static void zzd(Object obj, Object obj2) {
        if (obj instanceof ConditionVariable) {
            ((ConditionVariable) obj).open();
        }
        if (obj instanceof Messenger) {
            Messenger messenger = (Messenger) obj;
            Message obtain = Message.obtain();
            obtain.obj = obj2;
            try {
                messenger.send(obtain);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                sb.append("Failed to send response ");
                sb.append(valueOf);
                Log.w("InstanceID", sb.toString());
            }
        }
    }

    private final void zzd(String str, Object obj) {
        synchronized (getClass()) {
            Object obj2 = this.zzcz.get(str);
            this.zzcz.put(str, obj);
            zzd(obj2, obj);
        }
    }

    private static boolean zzd(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            zzcu = applicationInfo.packageName;
            zzcx = applicationInfo.uid;
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    private static boolean zzd(PackageManager packageManager, String str, String str2) {
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str) == 0) {
            return zzd(packageManager, str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56 + String.valueOf(str2).length());
        sb.append("Possible malicious package ");
        sb.append(str);
        sb.append(" declares ");
        sb.append(str2);
        sb.append(" without permission");
        Log.w("InstanceID", sb.toString());
        return false;
    }

    private final void zzg(Intent intent) {
        synchronized (this) {
            if (this.zzaf == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                this.zzaf = PendingIntent.getBroadcast(this.zzl, 0, intent2, 0);
            }
            intent.putExtra("app", this.zzaf);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzi(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        String str = string;
        if (string == null) {
            str = bundle.getString("unregistered");
        }
        if (str != null) {
            return str;
        }
        String string2 = bundle.getString(MRAIDPresenter.ERROR);
        if (string2 != null) {
            throw new IOException(string2);
        }
        String valueOf = String.valueOf(bundle);
        StringBuilder sb = new StringBuilder(valueOf.length() + 29);
        sb.append("Unexpected response from GCM ");
        sb.append(valueOf);
        Log.w("InstanceID", sb.toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    private final Bundle zzj(Bundle bundle) throws IOException {
        Bundle zzk = zzk(bundle);
        Bundle bundle2 = zzk;
        if (zzk != null) {
            bundle2 = zzk;
            if (zzk.containsKey("google.messenger")) {
                Bundle zzk2 = zzk(bundle);
                bundle2 = zzk2;
                if (zzk2 != null) {
                    bundle2 = zzk2;
                    if (zzk2.containsKey("google.messenger")) {
                        bundle2 = null;
                    }
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0269 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.os.Bundle zzk(android.os.Bundle r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzaf.zzk(android.os.Bundle):android.os.Bundle");
    }

    @ShowFirstParty
    public static boolean zzk(Context context) {
        if (zzcu != null) {
            zzl(context);
        }
        return zzcv;
    }

    @ShowFirstParty
    public static String zzl(Context context) {
        String str = zzcu;
        if (str != null) {
            return str;
        }
        zzcw = Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        if (!PlatformVersion.isAtLeastO()) {
            Iterator<ResolveInfo> it = packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
            while (it.hasNext()) {
                if (zzd(packageManager, it.next().serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER")) {
                    zzcv = false;
                    return zzcu;
                }
            }
        }
        Iterator<ResolveInfo> it2 = packageManager.queryBroadcastReceivers(new Intent("com.google.iid.TOKEN_REQUEST"), 0).iterator();
        while (it2.hasNext()) {
            if (zzd(packageManager, it2.next().activityInfo.packageName, "com.google.iid.TOKEN_REQUEST")) {
                zzcv = true;
                return zzcu;
            }
        }
        Log.w("InstanceID", "Failed to resolve IID implementation package, falling back");
        if (zzd(packageManager, "com.google.android.gms")) {
            zzcv = PlatformVersion.isAtLeastO();
            return zzcu;
        }
        if (PlatformVersion.isAtLeastLollipop() || !zzd(packageManager, "com.google.android.gsf")) {
            Log.w("InstanceID", "Google Play services is missing, unable to get tokens");
            return null;
        }
        zzcv = false;
        return zzcu;
    }

    private static int zzm(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(zzl(context), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            return -1;
        }
    }

    private static String zzx() {
        String num;
        synchronized (zzaf.class) {
            try {
                int i = zzcp;
                zzcp = i + 1;
                num = Integer.toString(i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return num;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle zzd(Bundle bundle, KeyPair keyPair) throws IOException {
        int zzm = zzm(this.zzl);
        bundle.putString("gmsv", Integer.toString(zzm));
        bundle.putString(i5.y, Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", Integer.toString(InstanceID.zzg(this.zzl)));
        bundle.putString("app_ver_name", InstanceID.zzh(this.zzl));
        bundle.putString("cliv", "iid-12451000");
        bundle.putString("appid", InstanceID.zzd(keyPair));
        if (zzm < 12000000 || !zzct.get().booleanValue()) {
            return zzj(bundle);
        }
        try {
            return (Bundle) Tasks.await(new zzr(this.zzl).zzd(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("InstanceID", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                Log.d("InstanceID", sb.toString());
            }
            if ((e.getCause() instanceof zzaa) && ((zzaa) e.getCause()).getErrorCode() == 4) {
                return zzj(bundle);
            }
            return null;
        }
    }

    public final void zze(Message message) {
        if (message == null) {
            return;
        }
        Object obj = message.obj;
        if (!(obj instanceof Intent)) {
            Log.w("InstanceID", "Dropping invalid message");
            return;
        }
        Intent intent = (Intent) obj;
        intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof MessengerCompat) {
                this.zzdb = (MessengerCompat) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                this.zzda = (Messenger) parcelableExtra;
            }
        }
        zzh((Intent) message.obj);
    }

    public final void zzh(Intent intent) {
        if (intent == null) {
            if (Log.isLoggable("InstanceID", 3)) {
                Log.d("InstanceID", "Unexpected response: null");
                return;
            }
            return;
        }
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action) && !"com.google.android.gms.iid.InstanceID".equals(action)) {
            if (Log.isLoggable("InstanceID", 3)) {
                String valueOf = String.valueOf(intent.getAction());
                Log.d("InstanceID", valueOf.length() != 0 ? "Unexpected response ".concat(valueOf) : new String("Unexpected response "));
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra("registration_id");
        String str = stringExtra;
        if (stringExtra == null) {
            str = intent.getStringExtra("unregistered");
        }
        if (str != null) {
            Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(str);
            if (!matcher.matches()) {
                if (Log.isLoggable("InstanceID", 3)) {
                    Log.d("InstanceID", str.length() != 0 ? "Unexpected response string: ".concat(str) : new String("Unexpected response string: "));
                    return;
                }
                return;
            } else {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                Bundle extras = intent.getExtras();
                extras.putString("registration_id", group2);
                zzd(group, (Object) extras);
                return;
            }
        }
        String stringExtra2 = intent.getStringExtra(MRAIDPresenter.ERROR);
        if (stringExtra2 == null) {
            String valueOf2 = String.valueOf(intent.getExtras());
            StringBuilder sb = new StringBuilder(valueOf2.length() + 49);
            sb.append("Unexpected response, no error or registration id ");
            sb.append(valueOf2);
            Log.w("InstanceID", sb.toString());
            return;
        }
        if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
        }
        String str2 = null;
        String str3 = stringExtra2;
        if (stringExtra2.startsWith("|")) {
            String[] split = stringExtra2.split("\\|");
            if (!"ID".equals(split[1])) {
                Log.w("InstanceID", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
            }
            if (split.length > 2) {
                String str4 = split[2];
                String str5 = split[3];
                str3 = str5;
                str2 = str4;
                if (str5.startsWith(":")) {
                    str3 = str5.substring(1);
                    str2 = str4;
                }
            } else {
                str3 = "UNKNOWN";
                str2 = null;
            }
            intent.putExtra(MRAIDPresenter.ERROR, str3);
        }
        if (str2 != null) {
            zzd(str2, (Object) str3);
            return;
        }
        synchronized (getClass()) {
            for (String str6 : this.zzcz.keySet()) {
                Object obj = this.zzcz.get(str6);
                this.zzcz.put(str6, str3);
                zzd(obj, str3);
            }
        }
    }
}
