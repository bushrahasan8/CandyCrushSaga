package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: zzfpg.class */
public final class zzfpg implements zzfpe {
    private final zzfpe zza;

    public zzfpg(zzfpe zzfpeVar) {
        this.zza = zzfpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpe
    public final JSONObject zza(View view) {
        boolean z = false;
        JSONObject zza = zzfpo.zza(0, 0, 0, 0);
        int zzb = zzfpr.zzb();
        if (zzb == 0) {
            throw null;
        }
        if (zzb - 1 == 0) {
            z = true;
        }
        try {
            zza.put("noOutputDevice", z);
        } catch (JSONException e) {
            zzfpp.zza("Error with setting output device status", e);
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfpe
    public final void zzb(View view, JSONObject jSONObject, zzfpd zzfpdVar, boolean z, boolean z2) {
        int i;
        ArrayList arrayList = new ArrayList();
        zzfov zza = zzfov.zza();
        if (zza != null) {
            Collection zzb = zza.zzb();
            int size = zzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = zzb.iterator();
            while (it.hasNext()) {
                View zzf = ((zzfoh) it.next()).zzf();
                if (zzf != null && zzf.isAttachedToWindow() && zzf.isShown()) {
                    View view2 = zzf;
                    while (true) {
                        View view3 = view2;
                        if (view3 == null) {
                            View rootView = zzf.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z3 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (true) {
                                    i = size2;
                                    if (i <= 0) {
                                        break;
                                    }
                                    int i2 = i - 1;
                                    if (((View) arrayList.get(i2)).getZ() <= z3) {
                                        break;
                                    } else {
                                        size2 = i2;
                                    }
                                }
                                arrayList.add(i, rootView);
                            }
                        } else if (view3.getAlpha() != 0.0f) {
                            Object parent = view3.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            zzfpdVar.zza((View) arrayList.get(i3), this.zza, jSONObject, z2);
        }
    }
}
