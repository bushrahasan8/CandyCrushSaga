package androidx.privacysandbox.ads.adservices.topics;

/* loaded from: Topic.class */
public final class Topic {
    private final long modelVersion;
    private final long taxonomyVersion;
    private final int topicId;

    public Topic(long j, long j2, int i) {
        this.taxonomyVersion = j;
        this.modelVersion = j2;
        this.topicId = i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Topic)) {
            return false;
        }
        Topic topic = (Topic) obj;
        if (this.taxonomyVersion != topic.taxonomyVersion || this.modelVersion != topic.modelVersion || this.topicId != topic.topicId) {
            z = false;
        }
        return z;
    }

    public final long getModelVersion() {
        return this.modelVersion;
    }

    public final long getTaxonomyVersion() {
        return this.taxonomyVersion;
    }

    public final int getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        return (((Topic$$ExternalSyntheticBackport0.m(this.taxonomyVersion) * 31) + Topic$$ExternalSyntheticBackport0.m(this.modelVersion)) * 31) + this.topicId;
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.taxonomyVersion + ", ModelVersion=" + this.modelVersion + ", TopicCode=" + this.topicId + " }");
    }
}
