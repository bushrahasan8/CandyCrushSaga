package com.king.amp.sa;

/* loaded from: HttpPostRunnable.class */
class HttpPostRunnable implements Runnable {
    final boolean LOG_POST = false;
    final String TAG = "HttpRunnable";
    String mContentType;
    HttpPostHandler mHandler;
    String mId;
    String mPostData;
    int mTimeoutMs;
    String mUri;

    public HttpPostRunnable(String str, String str2, String str3, String str4, HttpPostHandler httpPostHandler, int i) {
        this.mTimeoutMs = 5000;
        this.mId = str;
        this.mUri = str2;
        this.mContentType = str3;
        this.mPostData = str4;
        this.mHandler = httpPostHandler;
        if (i > 0) {
            this.mTimeoutMs = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01bf A[Catch: all -> 0x01d3, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x01d3, blocks: (B:40:0x01b5, B:42:0x01bf), top: B:39:0x01b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ed A[Catch: Exception -> 0x0218, TRY_ENTER, TryCatch #4 {Exception -> 0x0218, blocks: (B:50:0x01ed, B:93:0x018d), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0208 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.king.amp.sa.HttpPostRunnable.run():void");
    }
}
