package com.bumptech.glide.load.engine.bitmap_recycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: GroupedLinkedMap.class */
class GroupedLinkedMap {
    private final LinkedEntry head = new LinkedEntry();
    private final Map keyToEntry = new HashMap();

    /* loaded from: GroupedLinkedMap$LinkedEntry.class */
    public static class LinkedEntry {
        final Object key;
        LinkedEntry next;
        LinkedEntry prev;
        private List values;

        LinkedEntry() {
            this(null);
        }

        LinkedEntry(Object obj) {
            this.prev = this;
            this.next = this;
            this.key = obj;
        }

        public void add(Object obj) {
            if (this.values == null) {
                this.values = new ArrayList();
            }
            this.values.add(obj);
        }

        public Object removeLast() {
            int size = size();
            return size > 0 ? this.values.remove(size - 1) : null;
        }

        public int size() {
            List list = this.values;
            return list != null ? list.size() : 0;
        }
    }

    private void makeHead(LinkedEntry linkedEntry) {
        removeEntry(linkedEntry);
        LinkedEntry linkedEntry2 = this.head;
        linkedEntry.prev = linkedEntry2;
        linkedEntry.next = linkedEntry2.next;
        updateEntry(linkedEntry);
    }

    private void makeTail(LinkedEntry linkedEntry) {
        removeEntry(linkedEntry);
        LinkedEntry linkedEntry2 = this.head;
        linkedEntry.prev = linkedEntry2.prev;
        linkedEntry.next = linkedEntry2;
        updateEntry(linkedEntry);
    }

    private static void removeEntry(LinkedEntry linkedEntry) {
        LinkedEntry linkedEntry2 = linkedEntry.prev;
        linkedEntry2.next = linkedEntry.next;
        linkedEntry.next.prev = linkedEntry2;
    }

    private static void updateEntry(LinkedEntry linkedEntry) {
        linkedEntry.next.prev = linkedEntry;
        linkedEntry.prev.next = linkedEntry;
    }

    public Object get(Poolable poolable) {
        LinkedEntry linkedEntry;
        LinkedEntry linkedEntry2 = (LinkedEntry) this.keyToEntry.get(poolable);
        if (linkedEntry2 == null) {
            LinkedEntry linkedEntry3 = new LinkedEntry(poolable);
            this.keyToEntry.put(poolable, linkedEntry3);
            linkedEntry = linkedEntry3;
        } else {
            poolable.offer();
            linkedEntry = linkedEntry2;
        }
        makeHead(linkedEntry);
        return linkedEntry.removeLast();
    }

    public void put(Poolable poolable, Object obj) {
        LinkedEntry linkedEntry;
        LinkedEntry linkedEntry2 = (LinkedEntry) this.keyToEntry.get(poolable);
        if (linkedEntry2 == null) {
            LinkedEntry linkedEntry3 = new LinkedEntry(poolable);
            makeTail(linkedEntry3);
            this.keyToEntry.put(poolable, linkedEntry3);
            linkedEntry = linkedEntry3;
        } else {
            poolable.offer();
            linkedEntry = linkedEntry2;
        }
        linkedEntry.add(obj);
    }

    public Object removeLast() {
        LinkedEntry linkedEntry = this.head.prev;
        while (true) {
            LinkedEntry linkedEntry2 = linkedEntry;
            if (linkedEntry2.equals(this.head)) {
                return null;
            }
            Object removeLast = linkedEntry2.removeLast();
            if (removeLast != null) {
                return removeLast;
            }
            removeEntry(linkedEntry2);
            this.keyToEntry.remove(linkedEntry2.key);
            ((Poolable) linkedEntry2.key).offer();
            linkedEntry = linkedEntry2.prev;
        }
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        LinkedEntry linkedEntry = this.head.next;
        boolean z2 = false;
        while (true) {
            z = z2;
            if (linkedEntry.equals(this.head)) {
                break;
            }
            sb.append('{');
            sb.append(linkedEntry.key);
            sb.append(':');
            sb.append(linkedEntry.size());
            sb.append("}, ");
            linkedEntry = linkedEntry.next;
            z2 = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
