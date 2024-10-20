package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: zzalt.class */
final class zzalt {
    public static zzalu zza(zzalu zzaluVar, String[] strArr, Map map) {
        if (zzaluVar == null) {
            if (strArr == null) {
                return null;
            }
            int length = strArr.length;
            if (length == 1) {
                return (zzalu) map.get(strArr[0]);
            }
            if (length > 1) {
                zzalu zzaluVar2 = new zzalu();
                for (String str : strArr) {
                    zzaluVar2.zzl((zzalu) map.get(str));
                }
                return zzaluVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzaluVar.zzl((zzalu) map.get(strArr[0]));
                return zzaluVar;
            }
            if (strArr != null && (strArr.length) > 1) {
                for (String str2 : strArr) {
                    zzaluVar.zzl((zzalu) map.get(str2));
                }
            }
        }
        return zzaluVar;
    }
}
