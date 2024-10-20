package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import androidx.collection.ArrayMap;

/* loaded from: zzhh.class */
public final class zzhh {
    private static final ArrayMap zza = new ArrayMap();

    public static Uri zza(String str) {
        Uri uri;
        synchronized (zzhh.class) {
            try {
                ArrayMap arrayMap = zza;
                Uri uri2 = (Uri) arrayMap.get(str);
                uri = uri2;
                if (uri2 == null) {
                    uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
                    arrayMap.put(str, uri);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return uri;
    }

    public static String zza(Context context, String str) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + str);
        }
        return str + "#" + context.getPackageName();
    }

    public static boolean zza(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            return str2.contains("dev-keys") || str2.contains("test-keys");
        }
        return false;
    }
}
