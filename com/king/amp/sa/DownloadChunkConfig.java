package com.king.amp.sa;

/* loaded from: DownloadChunkConfig.class */
public class DownloadChunkConfig {
    public long end;
    public String filePath;
    public final String requestId;
    final int seqNo;
    public long start;
    public String tempFile;
    public final String url;
    int timeoutMs = 10000;
    long contentLength = 0;
    long downloadTimeSec = 0;
    private final String mUid = java.util.UUID.randomUUID().toString();

    /* JADX INFO: Access modifiers changed from: package-private */
    public DownloadChunkConfig(int i, String str, String str2) {
        this.seqNo = i;
        this.requestId = str;
        this.url = str2;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != DownloadChunkConfig.class) {
            return false;
        }
        return ((DownloadChunkConfig) obj).mUid.equals(this.mUid);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getChunkSize() {
        return this.end - this.start;
    }

    public int hashCode() {
        return this.mUid.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setTargetFilePath(String str) {
        this.filePath = str;
        this.tempFile = this.filePath + ".download." + this.seqNo;
    }

    public String toString() {
        return "{ " + this.requestId + ", " + this.start + "-" + this.end + ", " + this.url + " }";
    }
}
