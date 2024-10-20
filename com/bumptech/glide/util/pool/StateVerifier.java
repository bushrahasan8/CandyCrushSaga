package com.bumptech.glide.util.pool;

/* loaded from: StateVerifier.class */
public abstract class StateVerifier {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: StateVerifier$DefaultStateVerifier.class */
    public static class DefaultStateVerifier extends StateVerifier {
        private volatile boolean isReleased;

        DefaultStateVerifier() {
            super();
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        public void setRecycled(boolean z) {
            this.isReleased = z;
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        public void throwIfRecycled() {
            if (this.isReleased) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    private StateVerifier() {
    }

    /* synthetic */ StateVerifier(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static StateVerifier newInstance() {
        return new DefaultStateVerifier();
    }

    public abstract void setRecycled(boolean z);

    public abstract void throwIfRecycled();
}
