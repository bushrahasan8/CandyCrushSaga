package androidx.media3.common.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: CopyOnWriteMultiset.class */
public final class CopyOnWriteMultiset implements Iterable {
    private final Object lock = new Object();
    private final Map elementCounts = new HashMap();
    private Set elementSet = Collections.emptySet();
    private List elements = Collections.emptyList();

    public void add(Object obj) {
        synchronized (this.lock) {
            ArrayList arrayList = new ArrayList(this.elements);
            arrayList.add(obj);
            this.elements = Collections.unmodifiableList(arrayList);
            Integer num = (Integer) this.elementCounts.get(obj);
            if (num == null) {
                HashSet hashSet = new HashSet(this.elementSet);
                hashSet.add(obj);
                this.elementSet = Collections.unmodifiableSet(hashSet);
            }
            Map map = this.elementCounts;
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            map.put(obj, Integer.valueOf(i));
        }
    }

    public int count(Object obj) {
        int intValue;
        synchronized (this.lock) {
            intValue = this.elementCounts.containsKey(obj) ? ((Integer) this.elementCounts.get(obj)).intValue() : 0;
        }
        return intValue;
    }

    public Set elementSet() {
        Set set;
        synchronized (this.lock) {
            set = this.elementSet;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.lock) {
            it = this.elements.iterator();
        }
        return it;
    }

    public void remove(Object obj) {
        synchronized (this.lock) {
            Integer num = (Integer) this.elementCounts.get(obj);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.elements);
            arrayList.remove(obj);
            this.elements = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.elementCounts.remove(obj);
                HashSet hashSet = new HashSet(this.elementSet);
                hashSet.remove(obj);
                this.elementSet = Collections.unmodifiableSet(hashSet);
            } else {
                this.elementCounts.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }
}
