package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: zzara.class */
public final class zzara extends zzaqo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static List zza(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new zzaps((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }
}
