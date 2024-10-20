package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.Assertions;
import com.ironsource.na;
import com.ironsource.t2;
import java.util.Collections;
import java.util.Map;

/* loaded from: DataSpec.class */
public final class DataSpec {
    public final long absoluteStreamPosition;
    public final Object customData;
    public final int flags;
    public final byte[] httpBody;
    public final int httpMethod;
    public final Map httpRequestHeaders;
    public final String key;
    public final long length;
    public final long position;
    public final Uri uri;
    public final long uriPositionOffset;

    /* loaded from: DataSpec$Builder.class */
    public static final class Builder {
        private Object customData;
        private int flags;
        private byte[] httpBody;
        private int httpMethod;
        private Map httpRequestHeaders;
        private String key;
        private long length;
        private long position;
        private Uri uri;
        private long uriPositionOffset;

        public Builder() {
            this.httpMethod = 1;
            this.httpRequestHeaders = Collections.emptyMap();
            this.length = -1L;
        }

        private Builder(DataSpec dataSpec) {
            this.uri = dataSpec.uri;
            this.uriPositionOffset = dataSpec.uriPositionOffset;
            this.httpMethod = dataSpec.httpMethod;
            this.httpBody = dataSpec.httpBody;
            this.httpRequestHeaders = dataSpec.httpRequestHeaders;
            this.position = dataSpec.position;
            this.length = dataSpec.length;
            this.key = dataSpec.key;
            this.flags = dataSpec.flags;
            this.customData = dataSpec.customData;
        }

        /* synthetic */ Builder(DataSpec dataSpec, AnonymousClass1 anonymousClass1) {
            this(dataSpec);
        }

        public DataSpec build() {
            Assertions.checkStateNotNull(this.uri, "The uri must be set.");
            return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
        }

        public Builder setFlags(int i) {
            this.flags = i;
            return this;
        }

        public Builder setHttpBody(byte[] bArr) {
            this.httpBody = bArr;
            return this;
        }

        public Builder setHttpMethod(int i) {
            this.httpMethod = i;
            return this;
        }

        public Builder setHttpRequestHeaders(Map map) {
            this.httpRequestHeaders = map;
            return this;
        }

        public Builder setKey(String str) {
            this.key = str;
            return this;
        }

        public Builder setLength(long j) {
            this.length = j;
            return this;
        }

        public Builder setPosition(long j) {
            this.position = j;
            return this;
        }

        public Builder setUri(Uri uri) {
            this.uri = uri;
            return this;
        }

        public Builder setUri(String str) {
            this.uri = Uri.parse(str);
            return this;
        }
    }

    static {
        MediaLibraryInfo.registerModule("media3.datasource");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (r14 == (-1)) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private DataSpec(android.net.Uri r6, long r7, int r9, byte[] r10, java.util.Map r11, long r12, long r14, java.lang.String r16, int r17, java.lang.Object r18) {
        /*
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r7
            r1 = r12
            long r0 = r0 + r1
            r21 = r0
            r0 = 0
            r20 = r0
            r0 = r21
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L1a
            r0 = 1
            r19 = r0
            goto L1d
        L1a:
            r0 = 0
            r19 = r0
        L1d:
            r0 = r19
            androidx.media3.common.util.Assertions.checkArgument(r0)
            r0 = r12
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L2f
            r0 = 1
            r19 = r0
            goto L32
        L2f:
            r0 = 0
            r19 = r0
        L32:
            r0 = r19
            androidx.media3.common.util.Assertions.checkArgument(r0)
            r0 = r14
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L4b
            r0 = r20
            r19 = r0
            r0 = r14
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L4e
        L4b:
            r0 = 1
            r19 = r0
        L4e:
            r0 = r19
            androidx.media3.common.util.Assertions.checkArgument(r0)
            r0 = r5
            r1 = r6
            r0.uri = r1
            r0 = r5
            r1 = r7
            r0.uriPositionOffset = r1
            r0 = r5
            r1 = r9
            r0.httpMethod = r1
            r0 = r10
            if (r0 == 0) goto L71
            r0 = r10
            int r0 = r0.length
            if (r0 == 0) goto L71
            goto L74
        L71:
            r0 = 0
            r10 = r0
        L74:
            r0 = r5
            r1 = r10
            r0.httpBody = r1
            r0 = r5
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r3 = r11
            r2.<init>(r3)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r0.httpRequestHeaders = r1
            r0 = r5
            r1 = r12
            r0.position = r1
            r0 = r5
            r1 = r21
            r0.absoluteStreamPosition = r1
            r0 = r5
            r1 = r14
            r0.length = r1
            r0 = r5
            r1 = r16
            r0.key = r1
            r0 = r5
            r1 = r17
            r0.flags = r1
            r0 = r5
            r1 = r18
            r0.customData = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.DataSpec.<init>(android.net.Uri, long, int, byte[], java.util.Map, long, long, java.lang.String, int, java.lang.Object):void");
    }

    /* synthetic */ DataSpec(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj, AnonymousClass1 anonymousClass1) {
        this(uri, j, i, bArr, map, j2, j3, str, i2, obj);
    }

    public static String getStringForHttpMethod(int i) {
        if (i == 1) {
            return na.a;
        }
        if (i == 2) {
            return na.b;
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public final String getHttpMethodString() {
        return getStringForHttpMethod(this.httpMethod);
    }

    public boolean isFlagSet(int i) {
        return (this.flags & i) == i;
    }

    public DataSpec subrange(long j) {
        long j2 = this.length;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        return subrange(j, j3);
    }

    public DataSpec subrange(long j, long j2) {
        return (j == 0 && this.length == j2) ? this : new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position + j, j2, this.key, this.flags, this.customData);
    }

    public String toString() {
        return "DataSpec[" + getHttpMethodString() + " " + this.uri + ", " + this.position + ", " + this.length + ", " + this.key + ", " + this.flags + t2.i.e;
    }
}
