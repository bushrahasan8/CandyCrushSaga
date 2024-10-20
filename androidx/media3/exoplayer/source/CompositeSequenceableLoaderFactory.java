package androidx.media3.exoplayer.source;

import java.util.List;

/* loaded from: CompositeSequenceableLoaderFactory.class */
public interface CompositeSequenceableLoaderFactory {
    SequenceableLoader create(List list, List list2);

    SequenceableLoader empty();
}
