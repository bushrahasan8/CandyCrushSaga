package androidx.media3.exoplayer.source.chunk;

import java.util.NoSuchElementException;

/* loaded from: MediaChunkIterator.class */
public interface MediaChunkIterator {
    public static final MediaChunkIterator EMPTY = new MediaChunkIterator() { // from class: androidx.media3.exoplayer.source.chunk.MediaChunkIterator.1
        AnonymousClass1() {
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            throw new NoSuchElementException();
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            throw new NoSuchElementException();
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public boolean next() {
            return false;
        }
    };

    /* renamed from: androidx.media3.exoplayer.source.chunk.MediaChunkIterator$1 */
    /* loaded from: MediaChunkIterator$1.class */
    class AnonymousClass1 implements MediaChunkIterator {
        AnonymousClass1() {
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            throw new NoSuchElementException();
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            throw new NoSuchElementException();
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public boolean next() {
            return false;
        }
    }

    long getChunkEndTimeUs();

    long getChunkStartTimeUs();

    boolean next();
}
