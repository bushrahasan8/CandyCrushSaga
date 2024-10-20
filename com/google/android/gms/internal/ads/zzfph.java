package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: zzfph.class */
public final class zzfph implements zzfpe {
    private final int[] zza = new int[2];

    @Override // com.google.android.gms.internal.ads.zzfpe
    public final JSONObject zza(View view) {
        if (view == null) {
            return zzfpo.zza(0, 0, 0, 0);
        }
        int[] iArr = this.zza;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        int[] iArr2 = this.zza;
        return zzfpo.zza(iArr2[0], iArr2[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.zzfpe
    public final void zzb(View view, JSONObject jSONObject, zzfpd zzfpdVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    zzfpdVar.zza(viewGroup.getChildAt(i), this, jSONObject, z2);
                }
                return;
            }
            HashMap hashMap = new HashMap();
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                ArrayList arrayList2 = arrayList;
                if (arrayList == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList2);
                }
                arrayList2.add(childAt);
            }
            ArrayList arrayList3 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            for (int i3 = 0; i3 < size; i3++) {
                ArrayList arrayList4 = (ArrayList) hashMap.get((Float) arrayList3.get(i3));
                int size2 = arrayList4.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    zzfpdVar.zza((View) arrayList4.get(i4), this, jSONObject, z2);
                }
            }
        }
    }
}
