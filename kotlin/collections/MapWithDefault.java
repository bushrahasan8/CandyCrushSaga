package kotlin.collections;

import java.util.Map;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: MapWithDefault.class */
interface MapWithDefault extends Map, KMappedMarker {
    Object getOrImplicitDefault(Object obj);
}
