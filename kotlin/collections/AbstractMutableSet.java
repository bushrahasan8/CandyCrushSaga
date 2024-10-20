package kotlin.collections;

import java.util.AbstractSet;
import java.util.Set;
import kotlin.jvm.internal.markers.KMutableSet;

/* loaded from: AbstractMutableSet.class */
public abstract class AbstractMutableSet extends AbstractSet implements Set, KMutableSet {
    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
