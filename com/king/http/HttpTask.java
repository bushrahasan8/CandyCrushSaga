package com.king.http;

import androidx.annotation.Keep;
import com.ironsource.na;
import com.king.http.HttpHeaders;
import com.king.usdk.logger.Logger;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Keep
/* loaded from: HttpTask.class */
public class HttpTask implements Runnable {
    private static final int CONTENT_LENGTH_MISSING = -1;
    private static final int ERROR_CODE_MISSING = -1;
    public static final int HTTP_CONNECTION_CLOSED = 1;
    public static final int HTTP_CONNECTION_OPEN = 0;
    private static final int HTTP_ERROR_TYPE_DNS = 0;
    private static final int HTTP_ERROR_TYPE_HTTP = 2;
    private static final int HTTP_ERROR_TYPE_JSONRPC = 3;
    private static final int HTTP_ERROR_TYPE_SSL = 1;
    private static final int HTTP_ERROR_TYPE_UNKOWN = 4;
    public static final int HTTP_METHOD_GET = 1;
    public static final int HTTP_METHOD_HEAD = 0;
    public static final int HTTP_METHOD_POST = 2;
    public static final int HTTP_METHOD_PUT = 3;
    public static final int HTTP_RESULT_CORRUPT = 2;
    public static final int HTTP_RESULT_ERROR = 1;
    public static final int HTTP_RESULT_SUCCESS = 0;
    public static final int HTTP_RESULT_TIMEOUT = 3;
    private static final int READ_BUFFER_SIZE = 4096;
    private final String mClassName = "[com.king.http.HttpTask] ";
    private final byte[] mData;
    private final HttpHeaders mHeaders;
    private final Listener mListener;
    private final Logger mLogger;
    private final int mMethod;
    private final boolean mRedirect;
    private final long mRequestId;
    private final int mTimeoutMillis;
    private final URL mURL;

    @Keep
    /* loaded from: HttpTask$Listener.class */
    public interface Listener {
        void onData(long j, byte[] bArr, int i);

        void onResponse(long j, int i, int i2, int i3, HttpHeaders.Header[] headerArr, int i4, String str, int i5, int i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HttpTask(Logger logger, long j, Listener listener, int i, String str, int i2, boolean z, HttpHeaders httpHeaders, byte[] bArr) throws MalformedURLException {
        this.mLogger = logger;
        this.mRequestId = j;
        this.mListener = listener;
        this.mMethod = i;
        this.mURL = new URL(str);
        this.mTimeoutMillis = i2;
        this.mRedirect = z;
        this.mHeaders = httpHeaders;
        this.mData = bArr;
        logger.i("[com.king.http.HttpTask] Creating task with mRequestId: " + j);
    }

    private HttpURLConnection openConnection() throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.mURL.openConnection();
        int i = this.mTimeoutMillis;
        if (i > 0) {
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(this.mTimeoutMillis);
        } else {
            httpURLConnection.setConnectTimeout(0);
            httpURLConnection.setReadTimeout(0);
        }
        return httpURLConnection;
    }

    private HttpHeaders.Header[] parseHeaders(Map<String, List<String>> map) {
        if (map == null) {
            return null;
        }
        HttpHeaders httpHeaders = new HttpHeaders();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                httpHeaders.add(entry.getKey(), it.next());
            }
        }
        return httpHeaders.array();
    }

    private void readData(HttpURLConnection httpURLConnection) throws IOException {
        byte[] bArr = new byte[4096];
        InputStream inputStream = httpURLConnection.getResponseCode() < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        if (inputStream == null) {
            return;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        int read = bufferedInputStream.read(bArr);
        while (true) {
            int i = read;
            if (i == -1) {
                return;
            }
            if (Thread.currentThread().isInterrupted()) {
                this.mLogger.d("[com.king.http.HttpTask] readData interrupted");
                return;
            } else {
                this.mListener.onData(this.mRequestId, bArr, i);
                read = bufferedInputStream.read(bArr);
            }
        }
    }

    private void writeData(URLConnection uRLConnection) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        outputStream.write(this.mData);
        outputStream.flush();
        outputStream.close();
    }

    public long getRequestId() {
        return this.mRequestId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v117, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v162, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v201, types: [com.king.http.HttpTask$Listener] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v16 */
    /* JADX WARN: Type inference failed for: r26v17 */
    /* JADX WARN: Type inference failed for: r26v34 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    @Override // java.lang.Runnable
    public void run() {
        HttpHeaders.Header[] headerArr;
        HttpURLConnection httpURLConnection;
        HttpHeaders.Header[] headerArr2;
        int i;
        int i2;
        HttpHeaders.Header[] headerArr3;
        int i3;
        int i4;
        HttpHeaders.Header[] headerArr4;
        int i5;
        int i6;
        HttpHeaders.Header[] headerArr5;
        HttpURLConnection httpURLConnection2;
        HttpHeaders.Header[] headerArr6 = null;
        HttpHeaders.Header[] headerArr7 = null;
        HttpHeaders.Header[] headerArr8 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = -1;
        HttpURLConnection httpURLConnection3 = null;
        int i10 = 1;
        try {
            try {
                try {
                    Logger logger = this.mLogger;
                    StringBuilder sb = new StringBuilder();
                    sb.append("[com.king.http.HttpTask] Connect to: ");
                    sb.append(this.mURL.toString());
                    logger.i(sb.toString());
                    httpURLConnection = openConnection();
                    try {
                        this.mLogger.i("[com.king.http.HttpTask] Connection opened");
                        if (this.mHeaders != null) {
                            this.mLogger.d("[com.king.http.HttpTask] Set headers");
                            for (HttpHeaders.Header header : this.mHeaders.array()) {
                                httpURLConnection.addRequestProperty(header.key, header.value);
                            }
                        }
                        int i11 = this.mMethod;
                        if (i11 == 0) {
                            httpURLConnection.setRequestMethod("HEAD");
                        } else if (i11 == 1) {
                            httpURLConnection.setRequestMethod(na.a);
                        } else if (i11 == 2) {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setRequestMethod(na.b);
                            byte[] bArr = this.mData;
                            httpURLConnection.setFixedLengthStreamingMode(bArr != null ? bArr.length : 0);
                        } else if (i11 == 3) {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setRequestMethod("PUT");
                            byte[] bArr2 = this.mData;
                            httpURLConnection.setFixedLengthStreamingMode(bArr2 != null ? bArr2.length : 0);
                        }
                        httpURLConnection.setInstanceFollowRedirects(this.mRedirect);
                        this.mLogger.d("[com.king.http.HttpTask] Connecting method: " + this.mMethod);
                        httpURLConnection.connect();
                        int i12 = this.mMethod;
                        if ((i12 == 2 || i12 == 3) && this.mData != null) {
                            this.mLogger.d("[com.king.http.HttpTask] Write data to socket");
                            writeData(httpURLConnection);
                        }
                        this.mLogger.d("[com.king.http.HttpTask] Retrieve connection results");
                        i6 = httpURLConnection.getResponseCode();
                        if (i6 == -1) {
                            httpURLConnection2 = "Result corrupt";
                            i10 = 2;
                        } else {
                            httpURLConnection2 = 0;
                            i10 = 0;
                        }
                        try {
                            headerArr5 = parseHeaders(httpURLConnection.getHeaderFields());
                            headerArr6 = headerArr5;
                            headerArr7 = headerArr5;
                            headerArr8 = headerArr5;
                            i = httpURLConnection.getContentLength();
                            if (i10 == 0) {
                                try {
                                    this.mLogger.d("[com.king.http.HttpTask] Invoke response (open) result: " + i10 + ", status: " + i6 + ", content-length: " + i);
                                } catch (SocketTimeoutException e) {
                                    e = e;
                                } catch (UnknownHostException e2) {
                                    e = e2;
                                } catch (IOException e3) {
                                    e = e3;
                                } catch (Throwable th) {
                                    th = th;
                                }
                                try {
                                    this.mListener.onResponse(this.mRequestId, 0, i10, i6, headerArr5, i, null, -1, 4);
                                    this.mLogger.i("[com.king.http.HttpTask] Read data from socket");
                                    readData(httpURLConnection);
                                } catch (SocketTimeoutException e4) {
                                    e = e4;
                                    i9 = i;
                                    e = e;
                                    headerArr3 = headerArr5;
                                    i3 = i10;
                                    i4 = i6;
                                    Logger logger2 = this.mLogger;
                                    HttpURLConnection httpURLConnection4 = httpURLConnection;
                                    HttpURLConnection httpURLConnection5 = httpURLConnection;
                                    StringBuilder sb2 = new StringBuilder();
                                    HttpURLConnection httpURLConnection6 = httpURLConnection;
                                    sb2.append("[com.king.http.HttpTask] ");
                                    HttpURLConnection httpURLConnection7 = httpURLConnection;
                                    sb2.append(e.toString());
                                    HttpURLConnection httpURLConnection8 = httpURLConnection;
                                    logger2.w(sb2.toString());
                                    ?? obj = e.toString();
                                    this.mLogger.d("[com.king.http.HttpTask] Disconnect result: 3 - Error type: 2");
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    headerArr4 = headerArr3;
                                    i8 = 3;
                                    httpURLConnection3 = obj;
                                    i10 = i4;
                                    i = i9;
                                    i5 = 2;
                                    this.mLogger.d("[com.king.http.HttpTask] Invoke response (closed) result: " + i8 + ", status: " + i10 + ", content-length: " + i);
                                    this.mListener.onResponse(this.mRequestId, 1, i8, i10, headerArr4, i, httpURLConnection3, -1, i5);
                                } catch (UnknownHostException e5) {
                                    e = e5;
                                    e = e;
                                    headerArr2 = headerArr5;
                                    i2 = i6;
                                    Logger logger3 = this.mLogger;
                                    int i13 = i10;
                                    int i14 = i10;
                                    StringBuilder sb3 = new StringBuilder();
                                    int i15 = i10;
                                    sb3.append("[com.king.http.HttpTask] ");
                                    int i16 = i10;
                                    sb3.append(e.toString());
                                    int i17 = i10;
                                    logger3.w(sb3.toString());
                                    HttpURLConnection httpURLConnection9 = httpURLConnection;
                                    ?? obj2 = e.toString();
                                    this.mLogger.d("[com.king.http.HttpTask] Disconnect result: 1 - Error type: 0");
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    headerArr4 = headerArr2;
                                    httpURLConnection3 = obj2;
                                    i8 = 1;
                                    i10 = i2;
                                    i5 = 0;
                                    this.mLogger.d("[com.king.http.HttpTask] Invoke response (closed) result: " + i8 + ", status: " + i10 + ", content-length: " + i);
                                    this.mListener.onResponse(this.mRequestId, 1, i8, i10, headerArr4, i, httpURLConnection3, -1, i5);
                                } catch (IOException e6) {
                                    e = e6;
                                    e = e;
                                    headerArr = headerArr5;
                                    i7 = i6;
                                    i9 = i;
                                    Logger logger4 = this.mLogger;
                                    int i18 = i10;
                                    int i19 = i10;
                                    StringBuilder sb4 = new StringBuilder();
                                    int i20 = i10;
                                    sb4.append("[com.king.http.HttpTask] ");
                                    int i21 = i10;
                                    sb4.append(e.toString());
                                    int i22 = i10;
                                    logger4.w(sb4.toString());
                                    HttpURLConnection httpURLConnection10 = httpURLConnection;
                                    ?? obj3 = e.toString();
                                    this.mLogger.d("[com.king.http.HttpTask] Disconnect result: 1 - Error type: 4");
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    headerArr4 = headerArr;
                                    httpURLConnection3 = obj3;
                                    i8 = 1;
                                    i10 = i7;
                                    i = i9;
                                    i5 = 4;
                                    this.mLogger.d("[com.king.http.HttpTask] Invoke response (closed) result: " + i8 + ", status: " + i10 + ", content-length: " + i);
                                    this.mListener.onResponse(this.mRequestId, 1, i8, i10, headerArr4, i, httpURLConnection3, -1, i5);
                                } catch (Throwable th2) {
                                    th = th2;
                                    th = th;
                                    httpURLConnection3 = httpURLConnection;
                                    this.mLogger.d("[com.king.http.HttpTask] Disconnect result: " + i10 + " - Error type: 4");
                                    if (httpURLConnection3 != null) {
                                        httpURLConnection3.disconnect();
                                    }
                                    throw th;
                                }
                            }
                            this.mLogger.d("[com.king.http.HttpTask] Disconnect result: " + i10 + " - Error type: 4");
                            httpURLConnection.disconnect();
                            headerArr4 = headerArr5;
                            i8 = i10;
                            i10 = i6;
                            httpURLConnection3 = httpURLConnection2;
                            i5 = 4;
                        } catch (SocketTimeoutException e7) {
                            e = e7;
                            headerArr5 = headerArr7;
                        } catch (UnknownHostException e8) {
                            e = e8;
                            headerArr2 = headerArr8;
                            i = -1;
                            i2 = i6;
                        } catch (IOException e9) {
                            e = e9;
                            headerArr = headerArr6;
                            i7 = i6;
                        } catch (Throwable th3) {
                            httpURLConnection3 = httpURLConnection;
                            th = th3;
                        }
                    } catch (SocketTimeoutException e10) {
                        e = e10;
                        i6 = 0;
                        i10 = 1;
                        headerArr5 = null;
                    } catch (UnknownHostException e11) {
                        e = e11;
                        headerArr2 = null;
                        i10 = 1;
                        i = -1;
                        i2 = 0;
                    } catch (IOException e12) {
                        e = e12;
                        headerArr = null;
                        i10 = 1;
                    } catch (Throwable th4) {
                        i10 = 1;
                        th = th4;
                        httpURLConnection3 = httpURLConnection;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (SocketTimeoutException e13) {
                e = e13;
                headerArr3 = null;
                httpURLConnection = null;
                i3 = 1;
                i4 = 0;
            } catch (UnknownHostException e14) {
                e = e14;
                headerArr2 = null;
                i10 = 1;
                httpURLConnection = null;
                i = -1;
                i2 = 0;
            } catch (IOException e15) {
                e = e15;
                headerArr = null;
                i10 = 1;
                httpURLConnection = null;
            }
            this.mLogger.d("[com.king.http.HttpTask] Invoke response (closed) result: " + i8 + ", status: " + i10 + ", content-length: " + i);
            this.mListener.onResponse(this.mRequestId, 1, i8, i10, headerArr4, i, httpURLConnection3, -1, i5);
        } catch (Throwable th6) {
            th = th6;
            i10 = i8;
        }
    }
}
