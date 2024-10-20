package kotlin.collections;

import java.util.Collection;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: AbstractMutableCollection.class */
public abstract class AbstractMutableCollection extends java.util.AbstractCollection implements Collection, KMappedMarker {
    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
