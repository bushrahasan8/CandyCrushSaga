package com.iab.omid.library.unity3d.processor;

import android.view.View;
import com.iab.omid.library.unity3d.processor.a;
import com.iab.omid.library.unity3d.utils.e;
import com.iab.omid.library.unity3d.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: c.class */
public class c implements a {
    private final a a;

    public c(a aVar) {
        this.a = aVar;
    }

    ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.unity3d.internal.c c = com.iab.omid.library.unity3d.internal.c.c();
        if (c != null) {
            Collection<com.iab.omid.library.unity3d.adsession.a> a = c.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a.size() * 2) + 3);
            Iterator<com.iab.omid.library.unity3d.adsession.a> it = a.iterator();
            while (it.hasNext()) {
                View c2 = it.next().c();
                if (c2 != null && h.e(c2) && (rootView = c2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float c3 = h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.c(arrayList.get(size - 1)) > c3) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.unity3d.processor.a
    public JSONObject a(View view) {
        JSONObject a = com.iab.omid.library.unity3d.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.unity3d.utils.c.a(a, e.a());
        return a;
    }

    @Override // com.iab.omid.library.unity3d.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0016a interfaceC0016a, boolean z, boolean z2) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0016a.a(it.next(), this.a, jSONObject, z2);
        }
    }
}
