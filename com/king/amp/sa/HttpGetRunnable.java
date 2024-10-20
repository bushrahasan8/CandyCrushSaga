package com.king.amp.sa;

/* loaded from: HttpGetRunnable.class */
class HttpGetRunnable implements Runnable {
    HttpGetHandler mHandler;
    String mId;
    int mTimeoutMs;
    String mUri;

    public HttpGetRunnable(String str, String str2, HttpGetHandler httpGetHandler, int i) {
        this.mTimeoutMs = 5000;
        this.mId = str;
        this.mUri = str2;
        this.mHandler = httpGetHandler;
        if (i > 0) {
            this.mTimeoutMs = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.king.amp.sa.HttpGetRunnable.run():void");
    }
}
