package com.unity3d.services.core.request;

import com.ironsource.t2;
import com.unity3d.services.core.log.DeviceLog;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: WebRequest.class */
public class WebRequest {
    private ByteArrayOutputStream _baos;
    private byte[] _body;
    private boolean _canceled;
    private int _connectTimeout;
    private long _contentLength;
    private Map<String, List<String>> _headers;
    private IWebRequestProgressListener _progressListener;
    private int _readTimeout;
    private String _requestType;
    private int _responseCode;
    private Map<String, List<String>> _responseHeaders;
    private URL _url;

    /* loaded from: WebRequest$RequestType.class */
    public enum RequestType {
        POST,
        GET,
        HEAD
    }

    public WebRequest(String str, String str2) throws MalformedURLException {
        this(str, str2, null);
    }

    public WebRequest(String str, String str2, Map<String, List<String>> map) throws MalformedURLException {
        this(str, str2, map, 30000, 30000);
    }

    public WebRequest(String str, String str2, Map<String, List<String>> map, int i, int i2) throws MalformedURLException {
        this._responseCode = -1;
        this._contentLength = -1L;
        this._canceled = false;
        this._url = new URL(str);
        this._requestType = str2;
        this._headers = map;
        this._connectTimeout = i;
        this._readTimeout = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.net.HttpURLConnection] */
    private HttpURLConnection getHttpUrlConnectionWithHeaders() throws NetworkIOException, IllegalArgumentException {
        HttpsURLConnection httpsURLConnection;
        if (getUrl().toString().startsWith("https://")) {
            try {
                httpsURLConnection = (HttpsURLConnection) getUrl().openConnection();
            } catch (IOException e) {
                throw new NetworkIOException("Open HTTPS connection: " + e.getMessage());
            }
        } else {
            if (!getUrl().toString().startsWith("http://")) {
                throw new IllegalArgumentException("Invalid url-protocol in url: " + getUrl().toString());
            }
            try {
                httpsURLConnection = (HttpURLConnection) getUrl().openConnection();
            } catch (IOException e2) {
                throw new NetworkIOException("Open HTTP connection: " + e2.getMessage());
            }
        }
        httpsURLConnection.setInstanceFollowRedirects(false);
        httpsURLConnection.setConnectTimeout(getConnectTimeout());
        httpsURLConnection.setReadTimeout(getReadTimeout());
        try {
            httpsURLConnection.setRequestMethod(getRequestType());
            if (getHeaders() != null && getHeaders().size() > 0) {
                for (String str : getHeaders().keySet()) {
                    for (String str2 : getHeaders().get(str)) {
                        DeviceLog.debug("Setting header: " + str + t2.i.b + str2);
                        httpsURLConnection.setRequestProperty(str, str2);
                    }
                }
            }
            return httpsURLConnection;
        } catch (ProtocolException e3) {
            throw new NetworkIOException("Set Request Method: " + getRequestType() + ", " + e3.getMessage());
        }
    }

    public void cancel() {
        this._canceled = true;
    }

    public byte[] getBody() {
        return this._body;
    }

    public int getConnectTimeout() {
        return this._connectTimeout;
    }

    public long getContentLength() {
        return this._contentLength;
    }

    public Map<String, List<String>> getHeaders() {
        return this._headers;
    }

    public String getQuery() {
        URL url = this._url;
        if (url != null) {
            return url.getQuery();
        }
        return null;
    }

    public int getReadTimeout() {
        return this._readTimeout;
    }

    public String getRequestType() {
        return this._requestType;
    }

    public int getResponseCode() {
        return this._responseCode;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this._responseHeaders;
    }

    public URL getUrl() {
        return this._url;
    }

    public boolean isCanceled() {
        return this._canceled;
    }

    public String makeRequest() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this._baos = byteArrayOutputStream;
        makeStreamRequest(byteArrayOutputStream);
        return this._baos.toString("UTF-8");
    }

    /* JADX WARN: Finally extract failed */
    public long makeStreamRequest(OutputStream outputStream) throws Exception {
        InputStream errorStream;
        HttpURLConnection httpUrlConnectionWithHeaders = getHttpUrlConnectionWithHeaders();
        httpUrlConnectionWithHeaders.setDoInput(true);
        if (getRequestType().equals(RequestType.POST.name())) {
            httpUrlConnectionWithHeaders.setDoOutput(true);
            OutputStream outputStream2 = null;
            OutputStream outputStream3 = null;
            try {
                try {
                    OutputStream outputStream4 = httpUrlConnectionWithHeaders.getOutputStream();
                    if (getBody() == null) {
                        String query = getQuery();
                        if (query != null) {
                            outputStream4.write(query.getBytes(StandardCharsets.UTF_8));
                        }
                    } else {
                        outputStream4.write(getBody());
                    }
                    outputStream3 = outputStream4;
                    outputStream2 = outputStream4;
                    outputStream4.flush();
                    try {
                        outputStream4.close();
                    } catch (IOException e) {
                        DeviceLog.exception("Error closing writer", e);
                    }
                } catch (IOException e2) {
                    DeviceLog.exception("Error while writing POST params", e2);
                    OutputStream outputStream5 = outputStream2;
                    OutputStream outputStream6 = outputStream2;
                    OutputStream outputStream7 = outputStream2;
                    StringBuilder sb = new StringBuilder();
                    OutputStream outputStream8 = outputStream2;
                    sb.append("Error writing POST params: ");
                    OutputStream outputStream9 = outputStream2;
                    sb.append(e2.getMessage());
                    OutputStream outputStream10 = outputStream2;
                    NetworkIOException networkIOException = new NetworkIOException(sb.toString());
                    OutputStream outputStream11 = outputStream2;
                    throw networkIOException;
                }
            } catch (Throwable th) {
                if (outputStream3 != null) {
                    try {
                        outputStream3.close();
                    } catch (IOException e3) {
                        DeviceLog.exception("Error closing writer", e3);
                    }
                }
                throw th;
            }
        }
        try {
            this._responseCode = httpUrlConnectionWithHeaders.getResponseCode();
            long contentLength = httpUrlConnectionWithHeaders.getContentLength();
            this._contentLength = contentLength;
            if (contentLength == -1) {
                this._contentLength = httpUrlConnectionWithHeaders.getHeaderFieldInt("X-OrigLength", -1);
            }
            ByteArrayOutputStream byteArrayOutputStream = this._baos;
            long j = 0;
            OutputStream outputStream12 = outputStream;
            if (byteArrayOutputStream != null) {
                outputStream12 = outputStream;
                if (byteArrayOutputStream == outputStream) {
                    outputStream12 = outputStream;
                    if (this._contentLength > 0) {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream((int) this._contentLength);
                        this._baos = byteArrayOutputStream2;
                        outputStream12 = byteArrayOutputStream2;
                    }
                }
            }
            if (httpUrlConnectionWithHeaders.getHeaderFields() != null) {
                this._responseHeaders = httpUrlConnectionWithHeaders.getHeaderFields();
            }
            try {
                errorStream = httpUrlConnectionWithHeaders.getInputStream();
            } catch (IOException e4) {
                errorStream = httpUrlConnectionWithHeaders.getErrorStream();
                if (errorStream == null) {
                    throw new NetworkIOException("Can't open error stream: " + e4.getMessage());
                }
            }
            IWebRequestProgressListener iWebRequestProgressListener = this._progressListener;
            if (iWebRequestProgressListener != null) {
                iWebRequestProgressListener.onRequestStart(getUrl().toString(), this._contentLength, this._responseCode, this._responseHeaders);
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(errorStream);
            byte[] bArr = new byte[4096];
            int i = 0;
            while (!isCanceled() && i != -1) {
                try {
                    int read = bufferedInputStream.read(bArr);
                    i = read;
                    if (read > 0) {
                        outputStream12.write(bArr, 0, read);
                        long j2 = j + read;
                        IWebRequestProgressListener iWebRequestProgressListener2 = this._progressListener;
                        j = j2;
                        i = read;
                        if (iWebRequestProgressListener2 != null) {
                            iWebRequestProgressListener2.onRequestProgress(getUrl().toString(), j2, this._contentLength);
                            j = j2;
                            i = read;
                        }
                    }
                } catch (IOException e5) {
                    throw new NetworkIOException("Network exception: " + e5.getMessage());
                } catch (Exception e6) {
                    throw new Exception("Unknown Exception: " + e6.getMessage());
                }
            }
            httpUrlConnectionWithHeaders.disconnect();
            outputStream12.flush();
            return j;
        } catch (IOException | RuntimeException e7) {
            throw new NetworkIOException("Response code: " + e7.getMessage());
        }
    }

    public void setBody(String str) {
        this._body = str.getBytes(StandardCharsets.UTF_8);
    }

    public void setBody(byte[] bArr) {
        this._body = bArr;
    }

    public void setConnectTimeout(int i) {
        this._connectTimeout = i;
    }

    public void setProgressListener(IWebRequestProgressListener iWebRequestProgressListener) {
        this._progressListener = iWebRequestProgressListener;
    }

    public void setReadTimeout(int i) {
        this._readTimeout = i;
    }
}
