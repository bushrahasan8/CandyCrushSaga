package com.king.amp.sa;

/* loaded from: DownloadFileRunnable.class */
class DownloadFileRunnable implements Runnable {
    DownloadChunkExecutor mDownloadChunkExecutor;
    final int mFileSizeThresholdMb;
    IHttpDownloadHandler mHandler;
    String mOutputFileName;
    String mRequestId;
    final int mRequestTimeoutMs;
    int mTimeoutMs;
    String mUrl;

    public DownloadFileRunnable(String str, String str2, String str3, int i, int i2, IHttpDownloadHandler iHttpDownloadHandler, DownloadChunkExecutor downloadChunkExecutor, int i3) {
        this.mTimeoutMs = 5000;
        this.mRequestId = str;
        this.mUrl = str2;
        this.mOutputFileName = str3;
        this.mRequestTimeoutMs = i * 1000;
        this.mHandler = iHttpDownloadHandler;
        this.mDownloadChunkExecutor = downloadChunkExecutor;
        this.mFileSizeThresholdMb = i2;
        if (i3 > 0) {
            this.mTimeoutMs = i3;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:70:0x05e5
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [com.king.amp.sa.IHttpDownloadHandler] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v216, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    @Override // java.lang.Runnable
    public void run() {
        /*
            Method dump skipped, instructions count: 1594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.king.amp.sa.DownloadFileRunnable.run():void");
    }
}
