package com.ironsource;

import android.text.TextUtils;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.Callable;

/* loaded from: d5.class */
class d5 implements Callable {
    private final z3 a;
    private final String b;
    private long c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d5(z3 z3Var, String str, long j) {
        this.a = z3Var;
        this.b = str;
        this.c = j;
    }

    int a(byte[] bArr, String str) {
        return IronSourceStorageUtils.saveFile(bArr, str);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a4 call() {
        int i;
        if (this.c == 0) {
            this.c = 1L;
        }
        a4 a4Var = null;
        for (int i2 = 0; i2 < this.c; i2++) {
            a4Var = a(this.a.e(), i2, this.a.a(), this.a.c());
            int b = a4Var.b();
            if (b != 1008 && b != 1009) {
                break;
            }
        }
        if (a4Var != null && a4Var.a() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            String str = File.separator;
            sb.append(str);
            sb.append(this.a.b().getName());
            String sb2 = sb.toString();
            String str2 = this.a.d() + str + u2.E + this.a.b().getName();
            try {
                if (a(a4Var.a(), str2) == 0) {
                    a4Var.a(1006);
                } else if (!a(str2, sb2)) {
                    a4Var.a(u2.j);
                }
            } catch (FileNotFoundException e) {
                i = 1018;
                a4Var.a(i);
            } catch (Error e2) {
                if (!TextUtils.isEmpty(e2.getMessage())) {
                    Logger.i("FileWorkerThread", e2.getMessage());
                }
                i = 1019;
                a4Var.a(i);
            } catch (Exception e3) {
                if (!TextUtils.isEmpty(e3.getMessage())) {
                    Logger.i("FileWorkerThread", e3.getMessage());
                }
                a4Var.a(1009);
            }
        }
        return a4Var;
    }

    a4 a(String str, int i, int i2, int i3) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        InputStream inputStream;
        InputStream inputStream2;
        HttpURLConnection httpURLConnection3;
        int i4;
        int i5;
        InputStream inputStream3;
        a4 a4Var = new a4();
        if (TextUtils.isEmpty(str)) {
            a4Var.a(str);
            a4Var.a(1007);
            return a4Var;
        }
        InputStream inputStream4 = null;
        InputStream inputStream5 = null;
        InputStream inputStream6 = null;
        InputStream inputStream7 = null;
        InputStream inputStream8 = null;
        boolean z = false;
        try {
            try {
                try {
                    URL url = new URL(str);
                    url.toURI();
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                    inputStream4 = null;
                    inputStream = null;
                    z = false;
                    inputStream8 = null;
                    inputStream7 = null;
                    inputStream6 = null;
                    inputStream5 = null;
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                httpURLConnection = null;
            } catch (Error e2) {
                e = e2;
                inputStream2 = null;
                httpURLConnection3 = null;
            } catch (MalformedURLException e3) {
                httpURLConnection = null;
            } catch (SocketTimeoutException e4) {
                httpURLConnection = null;
            } catch (URISyntaxException e5) {
                httpURLConnection = null;
            } catch (Exception e6) {
                e = e6;
                httpURLConnection2 = null;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = null;
                i2 = 0;
            }
        } catch (Throwable th4) {
            inputStream4 = null;
            th = th4;
        }
        try {
            httpURLConnection.setRequestMethod(na.a);
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i3);
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 400) {
                StringBuilder sb = new StringBuilder();
                sb.append(" RESPONSE CODE: ");
                sb.append(responseCode);
                sb.append(" URL: ");
                sb.append(str);
                sb.append(" ATTEMPT: ");
                sb.append(i);
                Logger.i("FileWorkerThread", sb.toString());
                i5 = 1011;
                inputStream3 = null;
            } else {
                inputStream3 = httpURLConnection.getInputStream();
                a4Var.a(a(inputStream3));
                i5 = responseCode;
            }
            if (inputStream3 != null) {
                inputStream3.close();
            }
            httpURLConnection.disconnect();
            i2 = i5;
        } catch (FileNotFoundException e7) {
            if (inputStream5 != null) {
                try {
                    inputStream5.close();
                } catch (Throwable th5) {
                    th5.printStackTrace();
                    i4 = 1018;
                    a4Var.a(str);
                    a4Var.a(i4);
                    return a4Var;
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            i4 = 1018;
            a4Var.a(str);
            a4Var.a(i4);
            return a4Var;
        } catch (Error e8) {
            inputStream2 = null;
            httpURLConnection3 = httpURLConnection;
            e = e8;
            if (!TextUtils.isEmpty(e.getMessage())) {
                HttpURLConnection httpURLConnection4 = httpURLConnection3;
                Logger.i("FileWorkerThread", e.getMessage());
            }
            if (inputStream2 != null) {
                inputStream2.close();
            }
            i2 = 1019;
            if (httpURLConnection3 != null) {
                httpURLConnection3.disconnect();
                i2 = 1019;
            }
            a4Var.a(str);
            a4Var.a(i2);
            return a4Var;
        } catch (MalformedURLException e9) {
            if (inputStream8 != null) {
                try {
                    inputStream8.close();
                } catch (Throwable th6) {
                    th6.printStackTrace();
                    i4 = 1004;
                    a4Var.a(str);
                    a4Var.a(i4);
                    return a4Var;
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            i4 = 1004;
            a4Var.a(str);
            a4Var.a(i4);
            return a4Var;
        } catch (SocketTimeoutException e10) {
            if (inputStream6 != null) {
                try {
                    inputStream6.close();
                } catch (Throwable th7) {
                    th7.printStackTrace();
                    i4 = 1008;
                    a4Var.a(str);
                    a4Var.a(i4);
                    return a4Var;
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            i4 = 1008;
            a4Var.a(str);
            a4Var.a(i4);
            return a4Var;
        } catch (URISyntaxException e11) {
            if (inputStream7 != null) {
                try {
                    inputStream7.close();
                } catch (Throwable th8) {
                    th8.printStackTrace();
                    i4 = 1010;
                    a4Var.a(str);
                    a4Var.a(i4);
                    return a4Var;
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            i4 = 1010;
            a4Var.a(str);
            a4Var.a(i4);
            return a4Var;
        } catch (Exception e12) {
            e = e12;
            httpURLConnection2 = httpURLConnection;
            if (!TextUtils.isEmpty(e.getMessage())) {
                HttpURLConnection httpURLConnection5 = httpURLConnection2;
                Logger.i("FileWorkerThread", e.getMessage());
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th9) {
                    th9.printStackTrace();
                    i4 = 1009;
                    a4Var.a(str);
                    a4Var.a(i4);
                    return a4Var;
                }
            }
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            i4 = 1009;
            a4Var.a(str);
            a4Var.a(i4);
            return a4Var;
        } catch (Throwable th10) {
            th = th10;
            i2 = 0;
            if (inputStream4 != null) {
                try {
                    inputStream4.close();
                } catch (Throwable th11) {
                    th11.printStackTrace();
                    a4Var.a(str);
                    a4Var.a(i2);
                    throw th;
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            a4Var.a(str);
            a4Var.a(i2);
            throw th;
        }
        a4Var.a(str);
        a4Var.a(i2);
        return a4Var;
    }

    boolean a(String str, String str2) {
        return IronSourceStorageUtils.renameFile(str, str2);
    }

    byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read == -1) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
