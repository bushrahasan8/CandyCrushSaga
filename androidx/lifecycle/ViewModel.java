package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: ViewModel.class */
public abstract class ViewModel {
    private final Map mBagOfTags = new HashMap();
    private final Set mCloseables = new LinkedHashSet();
    private volatile boolean mCleared = false;

    private static void closeWithRuntimeException(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void clear() {
        this.mCleared = true;
        Map map = this.mBagOfTags;
        if (map != null) {
            synchronized (map) {
                Iterator it = this.mBagOfTags.values().iterator();
                while (it.hasNext()) {
                    closeWithRuntimeException(it.next());
                }
            }
        }
        Set set = this.mCloseables;
        if (set != null) {
            synchronized (set) {
                Iterator it2 = this.mCloseables.iterator();
                while (it2.hasNext()) {
                    closeWithRuntimeException((Closeable) it2.next());
                }
            }
        }
        onCleared();
    }

    public Object getTag(String str) {
        Object obj;
        Map map = this.mBagOfTags;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.mBagOfTags.get(str);
        }
        return obj;
    }

    public void onCleared() {
    }

    public Object setTagIfAbsent(String str, Object obj) {
        Object obj2;
        synchronized (this.mBagOfTags) {
            obj2 = this.mBagOfTags.get(str);
            if (obj2 == null) {
                this.mBagOfTags.put(str, obj);
            }
        }
        Object obj3 = obj2 == null ? obj : obj2;
        if (this.mCleared) {
            closeWithRuntimeException(obj3);
        }
        return obj3;
    }
}
