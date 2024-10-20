package androidx.media3.exoplayer.upstream;

/* loaded from: LoaderErrorThrower.class */
public interface LoaderErrorThrower {

    /* loaded from: LoaderErrorThrower$Placeholder.class */
    public static final class Placeholder implements LoaderErrorThrower {
        @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError() {
        }
    }

    void maybeThrowError();
}
