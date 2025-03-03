package androidx.media3.exoplayer.dash.manifest;

import com.google.common.base.Objects;

/* loaded from: BaseUrl.class */
public final class BaseUrl {
    public final int priority;
    public final String serviceLocation;
    public final String url;
    public final int weight;

    public BaseUrl(String str, String str2, int i, int i2) {
        this.url = str;
        this.serviceLocation = str2;
        this.priority = i;
        this.weight = i2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseUrl)) {
            return false;
        }
        BaseUrl baseUrl = (BaseUrl) obj;
        if (this.priority != baseUrl.priority || this.weight != baseUrl.weight || !Objects.equal(this.url, baseUrl.url) || !Objects.equal(this.serviceLocation, baseUrl.serviceLocation)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Objects.hashCode(this.url, this.serviceLocation, Integer.valueOf(this.priority), Integer.valueOf(this.weight));
    }
}
