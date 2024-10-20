package kotlin.collections;

import com.ironsource.t2;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: AbstractCollection.class */
public abstract class AbstractCollection implements Collection, KMappedMarker {
    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean z;
        if (isEmpty()) {
            z = false;
        } else {
            Iterator<E> it = iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                if (Intrinsics.areEqual(it.next(), obj)) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        boolean z;
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            z = true;
        } else {
            Iterator it = collection.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                if (!contains(it.next())) {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }

    public abstract int getSize();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return CollectionToArray.toArray(this, array);
    }

    public String toString() {
        return CollectionsKt.joinToString$default(this, ", ", t2.i.d, t2.i.e, 0, null, new Function1(this) { // from class: kotlin.collections.AbstractCollection$toString$1
            final AbstractCollection this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(Object obj) {
                return obj == this.this$0 ? "(this Collection)" : String.valueOf(obj);
            }
        }, 24, null);
    }
}
