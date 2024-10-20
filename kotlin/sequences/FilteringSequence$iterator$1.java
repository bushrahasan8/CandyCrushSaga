package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: FilteringSequence$iterator$1.class */
public final class FilteringSequence$iterator$1 implements Iterator, KMappedMarker {
    private final Iterator iterator;
    private Object nextItem;
    private int nextState;
    final FilteringSequence this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FilteringSequence$iterator$1(FilteringSequence filteringSequence) {
        Sequence sequence;
        this.this$0 = filteringSequence;
        sequence = filteringSequence.sequence;
        this.iterator = sequence.iterator();
        this.nextState = -1;
    }

    private final void calcNext() {
        Function1 function1;
        boolean z;
        while (this.iterator.hasNext()) {
            Object next = this.iterator.next();
            function1 = this.this$0.predicate;
            boolean booleanValue = ((Boolean) function1.invoke(next)).booleanValue();
            z = this.this$0.sendWhen;
            if (booleanValue == z) {
                this.nextItem = next;
                this.nextState = 1;
                return;
            }
        }
        this.nextState = 0;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.nextState == -1) {
            calcNext();
        }
        boolean z = true;
        if (this.nextState != 1) {
            z = false;
        }
        return z;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.nextState == -1) {
            calcNext();
        }
        if (this.nextState == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.nextItem;
        this.nextItem = null;
        this.nextState = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
