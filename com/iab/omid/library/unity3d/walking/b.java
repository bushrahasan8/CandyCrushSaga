package com.iab.omid.library.unity3d.walking;

import com.iab.omid.library.unity3d.walking.async.b;
import com.iab.omid.library.unity3d.walking.async.d;
import com.iab.omid.library.unity3d.walking.async.e;
import com.iab.omid.library.unity3d.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: b.class */
public class b implements b.InterfaceC0019b {
    private JSONObject a;
    private final com.iab.omid.library.unity3d.walking.async.c b;

    public b(com.iab.omid.library.unity3d.walking.async.c cVar) {
        this.b = cVar;
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b.InterfaceC0019b
    public JSONObject a() {
        return this.a;
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b.InterfaceC0019b
    public void a(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new e(this, hashSet, jSONObject, j));
    }

    public void b() {
        this.b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new f(this, hashSet, jSONObject, j));
    }
}
