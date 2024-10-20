package androidx.media3.extractor.text.cea;

import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.Subtitle;
import java.util.Collections;
import java.util.List;

/* loaded from: CeaSubtitle.class */
final class CeaSubtitle implements Subtitle {
    private final List cues;

    public CeaSubtitle(List list) {
        this.cues = list;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public List getCues(long j) {
        return j >= 0 ? this.cues : Collections.emptyList();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i) {
        Assertions.checkArgument(i == 0);
        return 0L;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        return j < 0 ? 0 : -1;
    }
}
