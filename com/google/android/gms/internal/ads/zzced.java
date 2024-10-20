package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;

/* loaded from: zzced.class */
public final class zzced {
    public static boolean zza(Bundle bundle, Bundle bundle2) {
        Bundle bundle3 = bundle;
        Bundle bundle4 = bundle2;
        if (bundle != null) {
            bundle3 = bundle;
            bundle4 = bundle2;
            if (bundle2 != null) {
                if (bundle.size() != bundle2.size()) {
                    return false;
                }
                for (String str : bundle.keySet()) {
                    if (!bundle2.containsKey(str)) {
                        return false;
                    }
                    bundle3 = bundle.get(str);
                    bundle4 = bundle2.get(str);
                    if (bundle3 != null && bundle4 != null) {
                        if (bundle3 instanceof Bundle) {
                            if (!(bundle4 instanceof Bundle) || !zza((Bundle) bundle3, (Bundle) bundle4)) {
                                return false;
                            }
                        } else if (bundle3.getClass().isArray()) {
                            int length = Array.getLength(bundle3);
                            if (!bundle4.getClass().isArray() || length != Array.getLength(bundle4)) {
                                return false;
                            }
                            for (int i = 0; i < length; i++) {
                                if (!Objects.equal(Array.get(bundle3, i), Array.get(bundle4, i))) {
                                    return false;
                                }
                            }
                        } else if (!bundle3.equals(bundle4)) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        return bundle3 == null && bundle4 == null;
    }
}
