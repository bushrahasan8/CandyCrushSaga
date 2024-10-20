package com.unity3d.ads.core.data.model;

import androidx.privacysandbox.ads.adservices.topics.Topic$;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: CachedFile.class */
public final class CachedFile {
    private final long contentLength;
    private final String extension;
    private final File file;
    private final String name;
    private final String objectId;
    private final int priority;
    private final String protocol;
    private final String url;

    public CachedFile(String objectId, String url, String name, File file, String str, long j, String protocol, int i) {
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.objectId = objectId;
        this.url = url;
        this.name = name;
        this.file = file;
        this.extension = str;
        this.contentLength = j;
        this.protocol = protocol;
        this.priority = i;
    }

    public /* synthetic */ CachedFile(String str, String str2, String str3, File file, String str4, long j, String str5, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? null : file, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? -1L : j, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? Integer.MAX_VALUE : i);
    }

    public static /* synthetic */ CachedFile copy$default(CachedFile cachedFile, String str, String str2, String str3, File file, String str4, long j, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cachedFile.objectId;
        }
        if ((i2 & 2) != 0) {
            str2 = cachedFile.url;
        }
        if ((i2 & 4) != 0) {
            str3 = cachedFile.name;
        }
        if ((i2 & 8) != 0) {
            file = cachedFile.file;
        }
        if ((i2 & 16) != 0) {
            str4 = cachedFile.extension;
        }
        if ((i2 & 32) != 0) {
            j = cachedFile.contentLength;
        }
        if ((i2 & 64) != 0) {
            str5 = cachedFile.protocol;
        }
        if ((i2 & 128) != 0) {
            i = cachedFile.priority;
        }
        return cachedFile.copy(str, str2, str3, file, str4, j, str5, i);
    }

    public final String component1() {
        return this.objectId;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.name;
    }

    public final File component4() {
        return this.file;
    }

    public final String component5() {
        return this.extension;
    }

    public final long component6() {
        return this.contentLength;
    }

    public final String component7() {
        return this.protocol;
    }

    public final int component8() {
        return this.priority;
    }

    public final CachedFile copy(String objectId, String url, String name, File file, String str, long j, String protocol, int i) {
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        return new CachedFile(objectId, url, name, file, str, j, protocol, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedFile)) {
            return false;
        }
        CachedFile cachedFile = (CachedFile) obj;
        return Intrinsics.areEqual(this.objectId, cachedFile.objectId) && Intrinsics.areEqual(this.url, cachedFile.url) && Intrinsics.areEqual(this.name, cachedFile.name) && Intrinsics.areEqual(this.file, cachedFile.file) && Intrinsics.areEqual(this.extension, cachedFile.extension) && this.contentLength == cachedFile.contentLength && Intrinsics.areEqual(this.protocol, cachedFile.protocol) && this.priority == cachedFile.priority;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getName() {
        return this.name;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.objectId.hashCode();
        int hashCode2 = this.url.hashCode();
        int hashCode3 = this.name.hashCode();
        File file = this.file;
        int i = 0;
        int hashCode4 = file == null ? 0 : file.hashCode();
        String str = this.extension;
        if (str != null) {
            i = str.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + Topic$.ExternalSyntheticBackport0.m(this.contentLength)) * 31) + this.protocol.hashCode()) * 31) + this.priority;
    }

    public String toString() {
        return "CachedFile(objectId=" + this.objectId + ", url=" + this.url + ", name=" + this.name + ", file=" + this.file + ", extension=" + this.extension + ", contentLength=" + this.contentLength + ", protocol=" + this.protocol + ", priority=" + this.priority + ')';
    }
}
