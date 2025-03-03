package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.InAppMessageResult;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* loaded from: zzb.class */
public final class zzb {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Intent intent, String str) {
        if (intent != null) {
            return zzm(intent.getExtras(), "ProxyBillingActivity");
        }
        zzk("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzk(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzj(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        zzk(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static Bundle zzc(boolean z, boolean z2, boolean z3, boolean z4, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z3) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z2 && z4) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static Bundle zzd(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    public static BillingResult zze(Intent intent, String str) {
        if (intent != null) {
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(zzb(intent.getExtras(), str));
            newBuilder.setDebugMessage(zzg(intent.getExtras(), str));
            return newBuilder.build();
        }
        zzk("BillingHelper", "Got null intent!");
        BillingResult.Builder newBuilder2 = BillingResult.newBuilder();
        newBuilder2.setResponseCode(6);
        newBuilder2.setDebugMessage("An internal error occurred.");
        return newBuilder2.build();
    }

    public static InAppMessageResult zzf(Bundle bundle, String str) {
        return bundle == null ? new InAppMessageResult(0, (String) null) : new InAppMessageResult(zzm(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    public static String zzg(Bundle bundle, String str) {
        if (bundle == null) {
            zzk(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzj(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        zzk(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static String zzh(int i) {
        return zza.zza(i).toString();
    }

    public static List zzi(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase zzn = zzn(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (zzn == null) {
                zzj("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(zzn);
        } else {
            zzj("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
                Purchase zzn2 = zzn(stringArrayList.get(i), stringArrayList2.get(i));
                if (zzn2 != null) {
                    arrayList.add(zzn2);
                }
            }
        }
        return arrayList;
    }

    public static void zzj(String str, String str2) {
        if (!Log.isLoggable(str, 2)) {
            return;
        }
        if (str2.isEmpty()) {
            Log.v(str, str2);
            return;
        }
        int i = 40000;
        while (true) {
            int i2 = i;
            if (str2.isEmpty() || i2 <= 0) {
                return;
            }
            int min = Math.min(str2.length(), Math.min(4000, i2));
            Log.v(str, str2.substring(0, min));
            str2 = str2.substring(min);
            i = i2 - min;
        }
    }

    public static void zzk(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void zzl(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    private static int zzm(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        zzk(str, "Unexpected null bundle received!");
        return 0;
    }

    private static Purchase zzn(String str, String str2) {
        Purchase purchase;
        if (str == null || str2 == null) {
            zzj("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            purchase = new Purchase(str, str2);
        } catch (JSONException e) {
            zzk("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            purchase = null;
        }
        return purchase;
    }
}
