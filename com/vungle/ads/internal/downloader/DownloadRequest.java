package com.vungle.ads.internal.downloader;

import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.metadata.a;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: DownloadRequest.class */
public final class DownloadRequest {
    private String advertisementId;
    private final AtomicBoolean cancelled;
    private String cookieString;
    private String creativeId;
    private TimeIntervalMetric downloadDuration;
    private String eventId;
    private String id;
    private boolean isMainVideo;
    private boolean isTemplate;
    private int networkType;
    private String path;
    private boolean pauseOnConnectionLost;
    private String placementId;
    private AtomicReference<Priority> priority;
    private String url;

    /* loaded from: DownloadRequest$Priority.class */
    public enum Priority {
        CRITICAL(-2147483647),
        HIGHEST(0),
        HIGH(1),
        LOWEST(Integer.MAX_VALUE);

        private final int priority;

        Priority(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    public DownloadRequest(@Downloader.NetworkType int i, Priority priority, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        this.priority = new AtomicReference<>();
        this.cancelled = new AtomicBoolean(false);
        this.url = str;
        this.networkType = i;
        this.priority.set(priority);
        this.path = str2;
        this.pauseOnConnectionLost = z;
        this.cookieString = str3;
        this.advertisementId = str4;
        this.isTemplate = z2;
        this.isMainVideo = z3;
        this.placementId = str5;
        this.creativeId = str6;
        this.eventId = str7;
    }

    public /* synthetic */ DownloadRequest(int i, Priority priority, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, String str5, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, priority, str, str2, z, str3, str4, (i2 & 128) != 0 ? false : z2, (i2 & 256) != 0 ? false : z3, (i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : str5, (i2 & 1024) != 0 ? null : str6, (i2 & a.m) != 0 ? null : str7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DownloadRequest(Priority priority, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6) {
        this(Downloader.NetworkType.Companion.getANY(), priority, str, str2, false, str3, null, z, z2, str4, str5, str6);
        Intrinsics.checkNotNullParameter(priority, "priority");
    }

    public /* synthetic */ DownloadRequest(Priority priority, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(priority, str, str2, str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6);
    }

    public final void cancel() {
        this.cancelled.set(true);
    }

    public final String getAdvertisementId() {
        return this.advertisementId;
    }

    public final String getCookieString() {
        return this.cookieString;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getId() {
        return this.id;
    }

    public final int getNetworkType() {
        return this.networkType;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean getPauseOnConnectionLost() {
        return this.pauseOnConnectionLost;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final int getPriority() {
        return this.priority.get().getPriority();
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isCancelled() {
        return this.cancelled.get();
    }

    public final boolean isMainVideo() {
        return this.isMainVideo;
    }

    public final boolean isTemplate() {
        return this.isTemplate;
    }

    public final void setAdvertisementId(String str) {
        this.advertisementId = str;
    }

    public final void setCookieString(String str) {
        this.cookieString = str;
    }

    public final void setCreativeId(String str) {
        this.creativeId = str;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setMainVideo(boolean z) {
        this.isMainVideo = z;
    }

    public final void setNetworkType(int i) {
        this.networkType = i;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setPauseOnConnectionLost(boolean z) {
        this.pauseOnConnectionLost = z;
    }

    public final void setPlacementId(String str) {
        this.placementId = str;
    }

    public final void setPriority(Priority priority) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        this.priority.set(priority);
    }

    public final void setTemplate(boolean z) {
        this.isTemplate = z;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void startRecord() {
        TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk$SDKMetric.SDKMetricType.TEMPLATE_DOWNLOAD_DURATION_MS);
        this.downloadDuration = timeIntervalMetric;
        timeIntervalMetric.markStart();
    }

    public final void stopRecord() {
        TimeIntervalMetric timeIntervalMetric = this.downloadDuration;
        if (timeIntervalMetric != null) {
            timeIntervalMetric.markEnd();
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(timeIntervalMetric, this.placementId, this.creativeId, this.eventId, this.url);
        }
    }

    public String toString() {
        return "DownloadRequest{networkType=" + this.networkType + ", priority=" + this.priority + ", url='" + this.url + "', path='" + this.path + "', pauseOnConnectionLost=" + this.pauseOnConnectionLost + ", id='" + this.id + "', cookieString='" + this.cookieString + "', cancelled=" + this.cancelled + ", advertisementId=" + this.advertisementId + ", placementId=" + this.placementId + ", creativeId=" + this.creativeId + ", eventId=" + this.eventId + '}';
    }
}
