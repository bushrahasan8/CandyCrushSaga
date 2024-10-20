package com.iab.omid.library.vungle.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: b.class */
public abstract class b extends AsyncTask<Object, Void, String> {
    private a a;
    protected final InterfaceC0023b b;

    /* loaded from: b$a.class */
    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.vungle.walking.async.b$b, reason: collision with other inner class name */
    /* loaded from: b$b.class */
    public interface InterfaceC0023b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0023b interfaceC0023b) {
        this.b = interfaceC0023b;
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
