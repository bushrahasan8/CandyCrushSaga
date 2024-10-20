package androidx.media3.extractor.text;

import java.util.List;

/* loaded from: Subtitle.class */
public interface Subtitle {
    List getCues(long j);

    long getEventTime(int i);

    int getEventTimeCount();

    int getNextEventTimeIndex(long j);
}
