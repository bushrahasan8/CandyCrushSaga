package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.m4;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: iv.class */
public final class iv {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2628 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static short[] f2629;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2630 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2631;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2632;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static byte[] f2633;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2634;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f2635;

    static {
        m5390();
        TextUtils.getOffsetBefore("", 0);
        f2628 = (f2630 + 63) % 128;
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int[] iArr2;
        int length;
        m mVar = new m();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f2635;
        int[] iArr4 = iArr3;
        if (iArr3 != null) {
            $11 = ($10 + 71) % 128;
            int length2 = iArr3.length;
            int[] iArr5 = new int[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                $11 = ($10 + 27) % 128;
                int i3 = iArr3[i2];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122833333);
                    if (obj == null) {
                        obj = ((Class) b.m3371((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) Drawable.resolveOpacity(0, 0), TextUtils.lastIndexOf("", '0', 0) + 42)).getMethod(m4.p, Integer.TYPE);
                        map.put(122833333, obj);
                    }
                    iArr5[i2] = ((Integer) ((Method) obj).invoke(null, Integer.valueOf(i3))).intValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $10 = ($11 + 75) % 128;
            iArr4 = iArr5;
        }
        int length3 = iArr4.length;
        int[] iArr6 = new int[length3];
        int[] iArr7 = f2635;
        if (iArr7 != null) {
            int i4 = $11 + 57;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = iArr7.length;
                iArr2 = new int[length];
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
            }
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = iArr7[i5];
                Map map2 = b.f452;
                Object obj2 = map2.get(122833333);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), 41 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod(m4.p, Integer.TYPE);
                    map2.put(122833333, obj2);
                }
                iArr2[i5] = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i6))).intValue();
            }
        } else {
            iArr2 = iArr7;
        }
        System.arraycopy(iArr2, 0, iArr6, 0, length3);
        mVar.f3040 = 0;
        $11 = ($10 + 119) % 128;
        while (true) {
            int i7 = mVar.f3040;
            if (i7 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            $10 = ($11 + 61) % 128;
            int i8 = iArr[i7];
            char c = (char) (i8 >> 16);
            cArr[0] = c;
            char c2 = (char) i8;
            cArr[1] = c2;
            char c3 = (char) (iArr[i7 + 1] >> 16);
            cArr[2] = c3;
            char c4 = (char) iArr[i7 + 1];
            cArr[3] = c4;
            mVar.f3039 = (c << 16) + c2;
            mVar.f3038 = (c3 << 16) + c4;
            m.m5748(iArr6);
            for (int i9 = 0; i9 < 16; i9++) {
                $10 = ($11 + 91) % 128;
                int i10 = mVar.f3039 ^ iArr6[i9];
                mVar.f3039 = i10;
                int m5749 = m.m5749(i10);
                Map map3 = b.f452;
                Object obj3 = map3.get(10695560);
                if (obj3 == null) {
                    obj3 = ((Class) b.m3371(Color.green(0), (char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 41)).getMethod("k", Object.class, Integer.TYPE, Object.class, Object.class);
                    map3.put(10695560, obj3);
                }
                int intValue = ((Integer) ((Method) obj3).invoke(null, mVar, Integer.valueOf(m5749), mVar, mVar)).intValue();
                mVar.f3039 = mVar.f3038;
                mVar.f3038 = intValue;
            }
            int i11 = mVar.f3039;
            int i12 = mVar.f3038;
            mVar.f3039 = i12;
            mVar.f3038 = i11;
            int i13 = i11 ^ iArr6[16];
            mVar.f3038 = i13;
            int i14 = i12 ^ iArr6[17];
            mVar.f3039 = i14;
            cArr[0] = (char) (i14 >>> 16);
            cArr[1] = (char) i14;
            cArr[2] = (char) (i13 >>> 16);
            cArr[3] = (char) i13;
            m.m5748(iArr6);
            int i15 = mVar.f3040;
            cArr2[i15 * 2] = cArr[0];
            cArr2[(i15 * 2) + 1] = cArr[1];
            cArr2[(i15 * 2) + 2] = cArr[2];
            cArr2[(i15 * 2) + 3] = cArr[3];
            Map map4 = b.f452;
            Object obj4 = map4.get(1365438799);
            if (obj4 == null) {
                obj4 = ((Class) b.m3371(1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 41 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("m", Object.class, Object.class);
                map4.put(1365438799, obj4);
            }
            ((Method) obj4).invoke(null, mVar, mVar);
        }
    }

    private static void b(short s, byte b, int i, int i2, int i3, Object[] objArr) {
        int i4;
        int i5;
        int length;
        int i6;
        q qVar = new q();
        StringBuilder sb = new StringBuilder();
        int i7 = f2634;
        try {
            Map map = b.f452;
            Object obj = map.get(-1903297911);
            if (obj == null) {
                Class cls = (Class) b.m3371(Color.green(0), (char) View.MeasureSpec.makeMeasureSpec(0, 0), View.resolveSizeAndState(0, 0, 0) + 41);
                Class<?> cls2 = Integer.TYPE;
                obj = cls.getMethod("g", cls2, cls2);
                map.put(-1903297911, obj);
            }
            int intValue = ((Integer) ((Method) obj).invoke(null, Integer.valueOf(i2), Integer.valueOf(i7))).intValue();
            boolean z = intValue == -1;
            if (z) {
                byte[] bArr = f2633;
                byte[] bArr2 = bArr;
                if (bArr != null) {
                    $10 = ($11 + 121) % 128;
                    int length2 = bArr.length;
                    byte[] bArr3 = new byte[length2];
                    for (int i8 = 0; i8 < length2; i8++) {
                        byte b2 = bArr[i8];
                        Map map2 = b.f452;
                        Object obj2 = map2.get(122654587);
                        if (obj2 == null) {
                            obj2 = ((Class) b.m3371(TextUtils.indexOf("", "", 0, 0), (char) View.MeasureSpec.makeMeasureSpec(0, 0), 41 - View.MeasureSpec.getSize(0))).getMethod("h", Integer.TYPE);
                            map2.put(122654587, obj2);
                        }
                        bArr3[i8] = ((Byte) ((Method) obj2).invoke(null, Integer.valueOf(b2))).byteValue();
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = f2633;
                    int i9 = f2632;
                    Map map3 = b.f452;
                    Object obj3 = map3.get(-1903297911);
                    if (obj3 == null) {
                        Class cls3 = (Class) b.m3371(ViewConfiguration.getFadingEdgeLength() >> 16, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 41 - KeyEvent.keyCodeFromString(""));
                        Class<?> cls4 = Integer.TYPE;
                        obj3 = cls3.getMethod("g", cls4, cls4);
                        map3.put(-1903297911, obj3);
                    }
                    intValue = (byte) (((byte) (bArr4[((Integer) ((Method) obj3).invoke(null, Integer.valueOf(i3), Integer.valueOf(i9))).intValue()] ^ 8044072489887092822L)) + ((int) (f2634 ^ 8044072489887092822L)));
                } else {
                    intValue = (short) (((short) (f2629[i3 + ((int) (f2632 ^ 8044072489887092822L))] ^ 8044072489887092822L)) + ((int) (f2634 ^ 8044072489887092822L)));
                }
            }
            if (intValue > 0) {
                int i10 = $11 + 49;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = ((i3 % intValue) + 5) << ((int) (f2632 - 8044072489887092822L));
                    i4 = i11;
                    if (z) {
                        i4 = i11;
                        i5 = 1;
                    }
                    i5 = 0;
                } else {
                    int i12 = ((i3 + intValue) - 2) + ((int) (f2632 ^ 8044072489887092822L));
                    i4 = i12;
                    if (!z) {
                        i4 = i12;
                        i5 = 0;
                    }
                    i5 = 1;
                }
                qVar.f3047 = i4 + i5;
                int i13 = f2631;
                Map map4 = b.f452;
                Object obj4 = map4.get(-2107390936);
                if (obj4 == null) {
                    Class cls5 = (Class) b.m3371((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 1), 41 - TextUtils.indexOf("", "", 0, 0));
                    Class<?> cls6 = Integer.TYPE;
                    obj4 = cls5.getMethod("f", Object.class, cls6, cls6, Object.class);
                    map4.put(-2107390936, obj4);
                }
                ((StringBuilder) ((Method) obj4).invoke(null, qVar, Integer.valueOf(i), Integer.valueOf(i13), sb)).append(qVar.f3049);
                qVar.f3048 = qVar.f3049;
                byte[] bArr5 = f2633;
                byte[] bArr6 = bArr5;
                if (bArr5 != null) {
                    int i14 = $10 + 53;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        length = bArr5.length;
                        bArr6 = new byte[length];
                        i6 = 1;
                    } else {
                        length = bArr5.length;
                        bArr6 = new byte[length];
                        i6 = 0;
                    }
                    while (i6 < length) {
                        bArr6[i6] = (byte) (bArr5[i6] ^ 8044072489887092822L);
                        i6++;
                    }
                }
                boolean z2 = bArr6 != null;
                qVar.f3050 = 1;
                while (qVar.f3050 < intValue) {
                    if (z2) {
                        byte[] bArr7 = f2633;
                        qVar.f3047 = qVar.f3047 - 1;
                        qVar.f3049 = (char) (qVar.f3048 + (((byte) (((byte) (bArr7[r0] ^ 8044072489887092822L)) + s)) ^ b));
                    } else {
                        short[] sArr = f2629;
                        qVar.f3047 = qVar.f3047 - 1;
                        qVar.f3049 = (char) (qVar.f3048 + (((short) (((short) (sArr[r0] ^ 8044072489887092822L)) + s)) ^ b));
                        $10 = ($11 + 51) % 128;
                    }
                    sb.append(qVar.f3049);
                    qVar.f3048 = qVar.f3049;
                    qVar.f3050++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static ir m5380(JSONObject jSONObject, String str) {
        f2628 = (f2630 + 87) % 128;
        try {
            HttpURLConnection m5386 = m5386(str);
            byte[] m5391 = m5391(m5386, jSONObject);
            long longValue = ((Long) jv.m5593(new Object[0])).longValue();
            m5387(m5386, m5391);
            String m5384 = m5384(m5386);
            int responseCode = m5386.getResponseCode();
            String responseMessage = m5386.getResponseMessage();
            if (responseCode >= 400) {
                m5386.disconnect();
            }
            ir irVar = new ir(m5384, responseCode, responseMessage, ((Long) jv.m5593(new Object[0])).longValue() - longValue);
            f2630 = (f2628 + 31) % 128;
            return irVar;
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a(new int[]{1285976991, 468781310, -376319813, 1668545880}, TextUtils.getCapsMode("", 0, 0) + 8, objArr);
            String intern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a(new int[]{-837416229, -2034558844, 1390954867, 1630054000, -2019417050, -155309784, -215172299, -245434837, 1832819471, -891717390, 1258200606, -1396196874, 1517061379, -241634219}, AndroidCharacter.getMirror('0') - 20, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(th.getLocalizedMessage());
            v.m5760(intern, sb.toString(), th);
            return null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m5381(Closeable closeable) {
        int i = f2630 + 115;
        f2628 = i % 128;
        try {
            if (i % 2 != 0) {
                throw null;
            }
            if (closeable != null) {
                closeable.close();
            }
            f2628 = (f2630 + 99) % 128;
        } catch (Throwable th) {
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m5382(String str) {
        return ((Boolean) m5383(new Object[]{str}, -971124769, 971124770, (int) System.currentTimeMillis())).booleanValue();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Object m5383(Object[] objArr, int i, int i2, int i3) {
        Object m5389;
        int i4 = i ^ (-1);
        int i5 = i3 ^ (-1);
        int i6 = i2 ^ (-1);
        int i7 = i4 | i6;
        if ((i * 868) + (i2 * 868) + ((((i4 | i5) ^ (-1)) | ((i6 | i5) ^ (-1))) * (-867)) + (((i7 ^ (-1)) | ((i4 | i3) ^ (-1)) | ((i6 | i3) ^ (-1))) * (-1734)) + (((((i | i6) | i3) ^ (-1)) | (((i2 | i4) | i3) ^ (-1)) | ((i5 | i7) ^ (-1))) * 867) != 1) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL((String) objArr[0]).openConnection();
            Object[] objArr2 = new Object[1];
            b((short) (67 - View.MeasureSpec.getSize(0)), (byte) (Process.myTid() >> 22), 402179532 + (ViewConfiguration.getScrollDefaultDelay() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 21, (-1660282089) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
            httpURLConnection.setRequestMethod(((String) objArr2[0]).intern());
            f2630 = (f2628 + 103) % 128;
            m5389 = httpURLConnection;
        } else {
            m5389 = m5389(objArr);
        }
        return m5389;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m5384(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            String obj = stringBuffer.toString();
                            m5381(inputStream);
                            m5381(bufferedReader);
                            return obj;
                        }
                        int i = f2628 + 65;
                        f2630 = i % 128;
                        if (i % 2 == 0) {
                            stringBuffer.length();
                            throw null;
                        }
                        if (stringBuffer.length() > 0) {
                            stringBuffer.append('\r');
                        }
                        stringBuffer.append(readLine);
                        f2628 = (f2630 + 43) % 128;
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        Object[] objArr = new Object[1];
                        a(new int[]{1285976991, 468781310, -376319813, 1668545880}, 8 - TextUtils.indexOf("", "", 0, 0), objArr);
                        String intern = ((String) objArr[0]).intern();
                        Object[] objArr2 = new Object[1];
                        a(new int[]{-837416229, -2034558844, -396336680, 140464789, 116435123, 1909523383, 1828642732, -223631226, -177908728, 670829638, 1916602024, 80220942}, (KeyEvent.getMaxKeyCode() >> 16) + 22, objArr2);
                        v.m5760(intern, ((String) objArr2[0]).intern(), th);
                        m5381(inputStream);
                        m5381(bufferedReader);
                        return null;
                    } catch (Throwable th2) {
                        m5381(inputStream);
                        m5381(bufferedReader);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            bufferedReader = null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m5385(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        String m5609 = jz.m5609(jSONObject2);
        String substring = jSONObject2.substring(0, jSONObject2.lastIndexOf(125));
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        Object[] objArr = new Object[1];
        a(new int[]{47250901, 614632366, -1115764340, -1876106777}, TextUtils.getOffsetAfter("", 0) + 7, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(m5609);
        Object[] objArr2 = new Object[1];
        b((short) (59 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 402179495, TextUtils.getOffsetBefore("", 0) - 20, (-1660282086) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
        sb.append(((String) objArr2[0]).intern());
        String obj = sb.toString();
        f2628 = (f2630 + 107) % 128;
        return obj;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static HttpURLConnection m5386(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        Object[] objArr = new Object[1];
        b((short) (21 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (byte) TextUtils.indexOf("", "", 0, 0), 402179541 + TextUtils.indexOf("", ""), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 21, (-1660282093) + (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        httpURLConnection.setRequestMethod(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a(new int[]{1229264163, -1584592002, 1542103197, -1003585377, 133214088, -492890307}, 12 - View.getDefaultSize(0, 0), objArr2);
        String intern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new int[]{1400162491, -96050311, -233726301, 213645380, -1340886192, -92574899, 891284096, 1004825465, -1484722012, -1325431269, 630625921, -1981542978, -1337579864, 144818061, -1974704003, 155475324}, 32 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
        httpURLConnection.setRequestProperty(intern, ((String) objArr3[0]).intern());
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        f2628 = (f2630 + 75) % 128;
        return httpURLConnection;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m5387(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        m5381(dataOutputStream);
        int i = f2628 + 31;
        f2630 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static ir m5388(String str) {
        f2628 = (f2630 + 113) % 128;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) m5383(new Object[]{str}, 1958240920, -1958240920, (int) System.currentTimeMillis());
            long longValue = ((Long) jv.m5593(new Object[0])).longValue();
            String m5384 = m5384(httpURLConnection);
            int responseCode = httpURLConnection.getResponseCode();
            String responseMessage = httpURLConnection.getResponseMessage();
            if (responseCode >= 400) {
                httpURLConnection.disconnect();
            }
            ir irVar = new ir(m5384, responseCode, responseMessage, ((Long) jv.m5593(new Object[0])).longValue() - longValue);
            f2630 = (f2628 + 19) % 128;
            return irVar;
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a(new int[]{1285976991, 468781310, -376319813, 1668545880}, 7 - TextUtils.lastIndexOf("", '0', 0, 0), objArr);
            String intern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            b((short) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), 402179530 + (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.getOffsetAfter("", 0) - 20, (-1660282128) - Color.green(0), objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(th.getLocalizedMessage());
            v.m5760(intern, sb.toString(), th);
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static /* synthetic */ Object m5389(Object[] objArr) {
        String str = (String) objArr[0];
        int i = f2630 + 45;
        f2628 = i % 128;
        int length = str.length();
        if (i % 2 == 0 ? length <= 256 : length <= 26939) {
            return Boolean.FALSE;
        }
        int i2 = f2630 + 99;
        f2628 = i2 % 128;
        if (i2 % 2 == 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static void m5390() {
        f2635 = new int[]{-141607554, 1915648689, 400402945, -1362020863, 1340145687, 1215054260, 1230123824, 91674807, 1314880107, 333510834, 1968747728, -1438900471, 1363570161, 1170948307, -891119266, 945388566, -234333639, 338053395};
        f2632 = 163820870;
        f2634 = 1798721605;
        f2631 = -2093913555;
        f2633 = new byte[]{94, -123, -27, -72, -83, -117, -89, -81, -74, 105, -49, -86, -67, 98, -16, -80, -92, -92, -75, -96, -119, 22, -51, -90, -68, -69, 76, -92, -74, -22, -111, -126, -89, -82, -74, 82, -89, -69, -90, -67, -90, -102, -19, -71, 119};
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] m5391(HttpURLConnection httpURLConnection, JSONObject jSONObject) {
        f2628 = (f2630 + 119) % 128;
        String m5385 = m5385(jSONObject);
        Object[] objArr = new Object[1];
        b((short) (TextUtils.lastIndexOf("", '0', 0, 0) + 44), (byte) (ViewConfiguration.getLongPressTimeout() >> 16), AndroidCharacter.getMirror('0') + 50602, (-20) - (ViewConfiguration.getTapTimeout() >> 16), View.resolveSize(0, 0) - 1660282101, objArr);
        byte[] bytes = m5385.getBytes(((String) objArr[0]).intern());
        byte[] bArr = bytes;
        if (m5382(m5385)) {
            f2630 = (f2628 + 101) % 128;
            Object[] objArr2 = new Object[1];
            a(new int[]{1229264163, -1584592002, 1542103197, -1003585377, -410864011, 2128958673, 264250857, -1322978060}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, objArr2);
            String intern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            b((short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), 402179564 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-20) - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getWindowTouchSlop() >> 8) - 1660282096, objArr3);
            httpURLConnection.setRequestProperty(intern, ((String) objArr3[0]).intern());
            bArr = m5392(bytes);
        }
        return bArr;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] m5392(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream2;
        GZIPOutputStream gZIPOutputStream3 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            gZIPOutputStream = null;
        }
        try {
            gZIPOutputStream2.write(bArr);
            gZIPOutputStream2.flush();
            gZIPOutputStream2.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e2) {
            gZIPOutputStream = gZIPOutputStream2;
            e = e2;
            GZIPOutputStream gZIPOutputStream4 = gZIPOutputStream;
            GZIPOutputStream gZIPOutputStream5 = gZIPOutputStream;
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream3 = gZIPOutputStream2;
            if (gZIPOutputStream3 != null) {
                try {
                    gZIPOutputStream3.close();
                    f2630 = (f2628 + 67) % 128;
                } catch (Exception e3) {
                }
            }
            throw th;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5393(ir irVar) {
        if (irVar != null) {
            String m5372 = irVar.m5372();
            f2630 = (f2628 + 15) % 128;
            return m5372;
        }
        int i = f2630 + 29;
        f2628 = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }
}
