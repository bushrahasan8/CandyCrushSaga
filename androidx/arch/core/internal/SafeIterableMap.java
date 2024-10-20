package androidx.arch.core.internal;

import com.ironsource.t2;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: SafeIterableMap.class */
public class SafeIterableMap implements Iterable {
    private Entry mEnd;
    private WeakHashMap mIterators = new WeakHashMap();
    private int mSize = 0;
    Entry mStart;

    /* loaded from: SafeIterableMap$AscendingIterator.class */
    public static class AscendingIterator extends ListIterator {
        AscendingIterator(Entry entry, Entry entry2) {
            super(entry, entry2);
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        Entry backward(Entry entry) {
            return entry.mPrevious;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        Entry forward(Entry entry) {
            return entry.mNext;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: SafeIterableMap$DescendingIterator.class */
    public static class DescendingIterator extends ListIterator {
        DescendingIterator(Entry entry, Entry entry2) {
            super(entry, entry2);
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        Entry backward(Entry entry) {
            return entry.mNext;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        Entry forward(Entry entry) {
            return entry.mPrevious;
        }
    }

    /* loaded from: SafeIterableMap$Entry.class */
    public static class Entry implements Map.Entry {
        final Object mKey;
        Entry mNext;
        Entry mPrevious;
        final Object mValue;

        Entry(Object obj, Object obj2) {
            this.mKey = obj;
            this.mValue = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!this.mKey.equals(entry.mKey) || !this.mValue.equals(entry.mValue)) {
                z = false;
            }
            return z;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.mKey;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.mValue;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.mKey.hashCode() ^ this.mValue.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.mKey + t2.i.b + this.mValue;
        }
    }

    /* loaded from: SafeIterableMap$IteratorWithAdditions.class */
    public class IteratorWithAdditions implements Iterator, SupportRemove {
        private boolean mBeforeStart = true;
        private Entry mCurrent;
        final SafeIterableMap this$0;

        IteratorWithAdditions(SafeIterableMap safeIterableMap) {
            this.this$0 = safeIterableMap;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            boolean z = false;
            if (this.mBeforeStart) {
                if (this.this$0.mStart != null) {
                    z = true;
                }
                return z;
            }
            Entry entry = this.mCurrent;
            boolean z2 = false;
            if (entry != null) {
                z2 = false;
                if (entry.mNext != null) {
                    z2 = true;
                }
            }
            return z2;
        }

        @Override // java.util.Iterator
        public Map.Entry next() {
            if (this.mBeforeStart) {
                this.mBeforeStart = false;
                this.mCurrent = this.this$0.mStart;
            } else {
                Entry entry = this.mCurrent;
                this.mCurrent = entry != null ? entry.mNext : null;
            }
            return this.mCurrent;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public void supportRemove(Entry entry) {
            Entry entry2 = this.mCurrent;
            if (entry == entry2) {
                Entry entry3 = entry2.mPrevious;
                this.mCurrent = entry3;
                this.mBeforeStart = entry3 == null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: SafeIterableMap$ListIterator.class */
    public static abstract class ListIterator implements Iterator, SupportRemove {
        Entry mExpectedEnd;
        Entry mNext;

        ListIterator(Entry entry, Entry entry2) {
            this.mExpectedEnd = entry2;
            this.mNext = entry;
        }

        private Entry nextNode() {
            Entry entry = this.mNext;
            Entry entry2 = this.mExpectedEnd;
            if (entry == entry2 || entry2 == null) {
                return null;
            }
            return forward(entry);
        }

        abstract Entry backward(Entry entry);

        abstract Entry forward(Entry entry);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mNext != null;
        }

        @Override // java.util.Iterator
        public Map.Entry next() {
            Entry entry = this.mNext;
            this.mNext = nextNode();
            return entry;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public void supportRemove(Entry entry) {
            if (this.mExpectedEnd == entry && entry == this.mNext) {
                this.mNext = null;
                this.mExpectedEnd = null;
            }
            Entry entry2 = this.mExpectedEnd;
            if (entry2 == entry) {
                this.mExpectedEnd = backward(entry2);
            }
            if (this.mNext == entry) {
                this.mNext = nextNode();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: SafeIterableMap$SupportRemove.class */
    public interface SupportRemove {
        void supportRemove(Entry entry);
    }

    public Iterator descendingIterator() {
        DescendingIterator descendingIterator = new DescendingIterator(this.mEnd, this.mStart);
        this.mIterators.put(descendingIterator, Boolean.FALSE);
        return descendingIterator;
    }

    public Map.Entry eldest() {
        return this.mStart;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap safeIterableMap = (SafeIterableMap) obj;
        if (size() != safeIterableMap.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = safeIterableMap.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if (entry == null && next != null) {
                return false;
            }
            if (entry != null && !entry.equals(next)) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            z = false;
        }
        return z;
    }

    protected Entry get(Object obj) {
        Entry entry;
        Entry entry2 = this.mStart;
        while (true) {
            entry = entry2;
            if (entry == null || entry.mKey.equals(obj)) {
                break;
            }
            entry2 = entry.mNext;
        }
        return entry;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = i2 + ((Map.Entry) it.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        AscendingIterator ascendingIterator = new AscendingIterator(this.mStart, this.mEnd);
        this.mIterators.put(ascendingIterator, Boolean.FALSE);
        return ascendingIterator;
    }

    public IteratorWithAdditions iteratorWithAdditions() {
        IteratorWithAdditions iteratorWithAdditions = new IteratorWithAdditions(this);
        this.mIterators.put(iteratorWithAdditions, Boolean.FALSE);
        return iteratorWithAdditions;
    }

    public Map.Entry newest() {
        return this.mEnd;
    }

    public Entry put(Object obj, Object obj2) {
        Entry entry = new Entry(obj, obj2);
        this.mSize++;
        Entry entry2 = this.mEnd;
        if (entry2 == null) {
            this.mStart = entry;
            this.mEnd = entry;
            return entry;
        }
        entry2.mNext = entry;
        entry.mPrevious = entry2;
        this.mEnd = entry;
        return entry;
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Entry entry = get(obj);
        if (entry != null) {
            return entry.mValue;
        }
        put(obj, obj2);
        return null;
    }

    public Object remove(Object obj) {
        Entry entry = get(obj);
        if (entry == null) {
            return null;
        }
        this.mSize--;
        if (!this.mIterators.isEmpty()) {
            Iterator it = this.mIterators.keySet().iterator();
            while (it.hasNext()) {
                ((SupportRemove) it.next()).supportRemove(entry);
            }
        }
        Entry entry2 = entry.mPrevious;
        if (entry2 != null) {
            entry2.mNext = entry.mNext;
        } else {
            this.mStart = entry.mNext;
        }
        Entry entry3 = entry.mNext;
        if (entry3 != null) {
            entry3.mPrevious = entry2;
        } else {
            this.mEnd = entry2;
        }
        entry.mNext = null;
        entry.mPrevious = null;
        return entry.mValue;
    }

    public int size() {
        return this.mSize;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(t2.i.d);
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(t2.i.e);
        return sb.toString();
    }
}
