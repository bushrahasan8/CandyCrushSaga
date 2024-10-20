package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: CacheResult.class */
public abstract class CacheResult {

    /* loaded from: CacheResult$Failure.class */
    public static final class Failure extends CacheResult {
        private final CacheError error;
        private final CacheSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(CacheError error, CacheSource source) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(source, "source");
            this.error = error;
            this.source = source;
        }

        public /* synthetic */ Failure(CacheError cacheError, CacheSource cacheSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(cacheError, (i & 2) != 0 ? CacheSource.LOCAL : cacheSource);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, CacheError cacheError, CacheSource cacheSource, int i, Object obj) {
            if ((i & 1) != 0) {
                cacheError = failure.error;
            }
            if ((i & 2) != 0) {
                cacheSource = failure.source;
            }
            return failure.copy(cacheError, cacheSource);
        }

        public final CacheError component1() {
            return this.error;
        }

        public final CacheSource component2() {
            return this.source;
        }

        public final Failure copy(CacheError error, CacheSource source) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Failure(error, source);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.error == failure.error && this.source == failure.source;
        }

        public final CacheError getError() {
            return this.error;
        }

        public final CacheSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return (this.error.hashCode() * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.error + ", source=" + this.source + ')';
        }
    }

    /* loaded from: CacheResult$Success.class */
    public static final class Success extends CacheResult {
        private final CachedFile cachedFile;
        private final CacheSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(CachedFile cachedFile, CacheSource source) {
            super(null);
            Intrinsics.checkNotNullParameter(cachedFile, "cachedFile");
            Intrinsics.checkNotNullParameter(source, "source");
            this.cachedFile = cachedFile;
            this.source = source;
        }

        public static /* synthetic */ Success copy$default(Success success, CachedFile cachedFile, CacheSource cacheSource, int i, Object obj) {
            if ((i & 1) != 0) {
                cachedFile = success.cachedFile;
            }
            if ((i & 2) != 0) {
                cacheSource = success.source;
            }
            return success.copy(cachedFile, cacheSource);
        }

        public final CachedFile component1() {
            return this.cachedFile;
        }

        public final CacheSource component2() {
            return this.source;
        }

        public final Success copy(CachedFile cachedFile, CacheSource source) {
            Intrinsics.checkNotNullParameter(cachedFile, "cachedFile");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Success(cachedFile, source);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(this.cachedFile, success.cachedFile) && this.source == success.source;
        }

        public final CachedFile getCachedFile() {
            return this.cachedFile;
        }

        public final CacheSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return (this.cachedFile.hashCode() * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Success(cachedFile=" + this.cachedFile + ", source=" + this.source + ')';
        }
    }

    private CacheResult() {
    }

    public /* synthetic */ CacheResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
