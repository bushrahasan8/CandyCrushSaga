package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: v.class */
public final class v {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﺙ */
    private static int f3060 = 1;

    /* renamed from: ﻐ */
    private static int f3061;

    /* renamed from: ﻛ */
    private static boolean f3062;

    /* renamed from: ｋ */
    private static int f3063;

    /* renamed from: ﾇ */
    private static char[] f3064;

    /* renamed from: ﾒ */
    private static boolean f3065;

    static {
        m5755();
        KeyEvent.getMaxKeyCode();
        int i = f3060 + 47;
        f3061 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void a(int[] iArr, String str, int i, String str2, Object[] objArr) {
        String str3 = str2;
        if (str2 != null) {
            str3 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) str3;
        if (str != null) {
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        r rVar = new r();
        char[] cArr2 = f3064;
        char[] cArr3 = cArr2;
        if (cArr2 != null) {
            int i2 = $10;
            $11 = (i2 + 31) % 128;
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            $11 = (i2 + 15) % 128;
            for (int i3 = 0; i3 < length; i3++) {
                char c = cArr2[i3];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122475841);
                    if (obj == null) {
                        obj = ((Class) b.m3371(TextUtils.getTrimmedLength(""), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 41 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("b", Integer.TYPE);
                        map.put(122475841, obj);
                    }
                    cArr4[i3] = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c))).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        int i4 = f3063;
        Map map2 = b.f452;
        Object obj2 = map2.get(122565214);
        if (obj2 == null) {
            obj2 = ((Class) b.m3371((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) (ViewConfiguration.getTouchSlop() >> 8), 41 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("e", Integer.TYPE);
            map2.put(122565214, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i4))).intValue();
        if (f3065) {
            int length2 = bArr.length;
            rVar.f3052 = length2;
            char[] cArr5 = new char[length2];
            rVar.f3051 = 0;
            while (true) {
                int i5 = rVar.f3051;
                int i6 = rVar.f3052;
                if (i5 >= i6) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i5] = (char) (cArr3[bArr[(i6 - 1) - i5] + i] - intValue);
                Map map3 = b.f452;
                Object obj3 = map3.get(-1176441533);
                if (obj3 == null) {
                    obj3 = ((Class) b.m3371(TextUtils.indexOf("", ""), (char) KeyEvent.keyCodeFromString(""), 41 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("a", Object.class, Object.class);
                    map3.put(-1176441533, obj3);
                }
                ((Method) obj3).invoke(null, rVar, rVar);
            }
        } else if (!f3062) {
            int length3 = iArr.length;
            rVar.f3052 = length3;
            char[] cArr6 = new char[length3];
            rVar.f3051 = 0;
            while (true) {
                int i7 = rVar.f3051;
                int i8 = rVar.f3052;
                if (i7 >= i8) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    $10 = ($11 + 121) % 128;
                    cArr6[i7] = (char) (cArr3[iArr[(i8 - 1) - i7] - i] - intValue);
                    rVar.f3051 = i7 + 1;
                }
            }
        } else {
            $10 = ($11 + 85) % 128;
            int length4 = cArr.length;
            rVar.f3052 = length4;
            char[] cArr7 = new char[length4];
            rVar.f3051 = 0;
            while (true) {
                int i9 = rVar.f3051;
                int i10 = rVar.f3052;
                if (i9 >= i10) {
                    objArr[0] = new String(cArr7);
                    return;
                }
                cArr7[i9] = (char) (cArr3[cArr[(i10 - 1) - i9] - i] - intValue);
                Map map4 = b.f452;
                Object obj4 = map4.get(-1176441533);
                if (obj4 == null) {
                    obj4 = ((Class) b.m3371(View.combineMeasuredStates(0, 0), (char) KeyEvent.getDeadChar(0, 0), 41 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("a", Object.class, Object.class);
                    map4.put(-1176441533, obj4);
                }
                ((Method) obj4).invoke(null, rVar, rVar);
            }
        }
    }

    /* renamed from: ﮐ */
    public static void m5752(String str, String str2) {
        f3061 = (f3060 + 35) % 128;
        m5758(new Object[]{str, str, str2}, -1082378131, 1082378133, (int) System.currentTimeMillis());
        int i = f3061 + 105;
        f3060 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﱟ */
    public static void m5753(String str, String str2) {
        int i = f3060 + 27;
        f3061 = i % 128;
        m5772(str, str2, null);
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ */
    private static /* synthetic */ Object m5754(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        int i = f3060 + 121;
        f3061 = i % 128;
        if (i % 2 != 0) {
            m5762();
            throw new ArithmeticException("divide by zero");
        }
        if (!m5762()) {
            if (m5765().shouldPrintLog(ISAdQualityLogLevel.VERBOSE)) {
                Log.v((String) m5758(new Object[]{str2}, 1041568643, -1041568642, (int) System.currentTimeMillis()), str3);
            }
            int i2 = f3061 + 77;
            f3060 = i2 % 128;
            if (i2 % 2 == 0) {
                throw new ArithmeticException("divide by zero");
            }
            return null;
        }
        int i3 = f3060 + 59;
        f3061 = i3 % 128;
        if (i3 % 2 == 0) {
            Log.v((String) m5758(new Object[]{str}, 1041568643, -1041568642, (int) System.currentTimeMillis()), str3);
            return null;
        }
        Log.v((String) m5758(new Object[]{str}, 1041568643, -1041568642, (int) System.currentTimeMillis()), str3);
        throw null;
    }

    /* renamed from: ﻐ */
    static void m5755() {
        f3062 = true;
        f3064 = new char[]{6649, 6456, 6481, 6482, 6485, 6446, 6476, 6494, 6492, 6627, 6400, 6495, 6448, 6432, 6487, 6488, 6479, 6472, 6409};
        f3065 = true;
        f3063 = 343349699;
    }

    /* renamed from: ﻐ */
    public static void m5756(String str, String str2) {
        int i = f3060 + 3;
        f3061 = i % 128;
        m5773(str, str, str2, (Object) null);
        if (i % 2 != 0) {
            throw null;
        }
        f3061 = (f3060 + 91) % 128;
    }

    /* renamed from: ﻐ */
    public static void m5757(String str, String str2, String str3, Object obj, boolean z) {
        m5758(new Object[]{str, str2, str3, obj, Boolean.valueOf(z)}, -1119540476, 1119540476, (int) System.currentTimeMillis());
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ Object m5758(Object[] objArr, int i, int i2, int i3) {
        Object obj;
        int i4 = ((i ^ (-1)) | (i2 ^ (-1))) ^ (-1);
        int i5 = i | i2;
        int i6 = (i * (-755)) + (i2 * (-755)) + (i4 * 1512) + ((((i5 | i3) ^ (-1)) | i4) * (-756)) + ((i5 | (i3 ^ (-1))) * 756);
        if (i6 == 1) {
            String str = (String) objArr[0];
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a(null, null, 127 - Color.red(0), "\u008a\u0093\u0092\u0091\u0090\u008f\u008e\u0087\u008d\u008c\u008b\u008a\u0089\u0088\u0083\u0087\u0084\u0086\u0085\u0084\u0083\u0082", objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(str);
            obj = sb.toString();
            f3060 = (f3061 + 11) % 128;
        } else if (i6 == 2) {
            obj = m5754(objArr);
        } else if (i6 != 3) {
            String str2 = (String) objArr[0];
            String str3 = (String) objArr[1];
            String str4 = (String) objArr[2];
            Object obj2 = objArr[3];
            boolean booleanValue = ((Boolean) objArr[4]).booleanValue();
            String str5 = str4;
            if (obj2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                Object[] objArr3 = new Object[1];
                a(null, null, 127 - ((Process.getThreadPriority(0) + 20) >> 6), "\u0081", objArr3);
                sb2.append(((String) objArr3[0]).intern());
                sb2.append(obj2.toString());
                str5 = sb2.toString();
                f3060 = (f3061 + 115) % 128;
            }
            if (m5762()) {
                f3060 = (f3061 + 9) % 128;
                Log.d((String) m5758(new Object[]{str2}, 1041568643, -1041568642, (int) System.currentTimeMillis()), str5);
                obj = null;
            } else if (!booleanValue) {
                obj = null;
            } else if (!m5765().shouldPrintLog(ISAdQualityLogLevel.DEBUG)) {
                obj = null;
            } else {
                Log.d((String) m5758(new Object[]{str3}, 1041568643, -1041568642, (int) System.currentTimeMillis()), str5);
                obj = null;
            }
        } else {
            obj = m5766(objArr);
        }
        return obj;
    }

    /* renamed from: ﻛ */
    public static void m5759(String str, String str2) {
        f3060 = (f3061 + 37) % 128;
        m5764(str, str, str2, true);
        f3060 = (f3061 + 23) % 128;
    }

    /* renamed from: ﻛ */
    public static void m5760(String str, String str2, Throwable th) {
        f3061 = (f3060 + 37) % 128;
        m5774(str, str, str2, th, false);
    }

    /* renamed from: ﻛ */
    public static void m5761(String str, String str2, boolean z) {
        m5758(new Object[]{str, str2, Boolean.valueOf(z)}, -2057200567, 2057200570, (int) System.currentTimeMillis());
    }

    /* renamed from: ﻛ */
    private static boolean m5762() {
        f3061 = (f3060 + 71) % 128;
        boolean m5830 = y.m5796().m5830();
        int i = f3061 + 59;
        f3060 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m5830;
    }

    /* renamed from: ｋ */
    public static void m5763(String str, String str2) {
        f3060 = (f3061 + 95) % 128;
        m5760(str, str2, (Throwable) null);
        f3060 = (f3061 + 89) % 128;
    }

    /* renamed from: ｋ */
    private static void m5764(String str, String str2, String str3, boolean z) {
        if (m5762()) {
            f3061 = (f3060 + 13) % 128;
            Log.i((String) m5758(new Object[]{str}, 1041568643, -1041568642, (int) System.currentTimeMillis()), str3);
            f3061 = (f3060 + 47) % 128;
            return;
        }
        if (z && m5765().shouldPrintLog(ISAdQualityLogLevel.INFO)) {
            Log.i((String) m5758(new Object[]{str2}, 1041568643, -1041568642, (int) System.currentTimeMillis()), str3);
        }
    }

    /* renamed from: ﾇ */
    private static ISAdQualityLogLevel m5765() {
        int i = f3061 + 61;
        f3060 = i % 128;
        if (i % 2 == 0) {
            y.m5796().m5831();
            throw new ArithmeticException("divide by zero");
        }
        ISAdQualityLogLevel m5831 = y.m5796().m5831();
        int i2 = f3060 + 47;
        f3061 = i2 % 128;
        if (i2 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m5831;
    }

    /* renamed from: ﾇ */
    private static /* synthetic */ Object m5766(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = f3060 + 115;
        f3061 = i % 128;
        m5775(str, str, str2, booleanValue);
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        f3060 = (f3061 + 115) % 128;
        return null;
    }

    /* renamed from: ﾇ */
    public static void m5767(String str, String str2) {
        f3061 = (f3060 + 35) % 128;
        m5764(str, str, str2, false);
        int i = f3061 + 49;
        f3060 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    public static void m5768(String str, String str2, Object obj) {
        int i = f3061 + 5;
        f3060 = i % 128;
        m5773(str, str, str2, obj);
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    public static void m5769(String str, String str2, Throwable th) {
        int i = f3060 + 119;
        f3061 = i % 128;
        m5774(str, str, str2, th, i % 2 == 0);
    }

    /* renamed from: ﾇ */
    public static void m5770(String str, String str2, Throwable th, boolean z) {
        f3061 = (f3060 + 37) % 128;
        m5774(str, str, str2, th, z);
        f3061 = (f3060 + 1) % 128;
    }

    /* renamed from: ﾒ */
    public static void m5771(String str, String str2) {
        f3061 = (f3060 + 21) % 128;
        m5769(str, str2, (Throwable) null);
        int i = f3061 + 25;
        f3060 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* renamed from: ﾒ */
    public static void m5772(String str, String str2, Object obj) {
        f3060 = (f3061 + 5) % 128;
        m5758(new Object[]{str, str, str2, obj, Boolean.FALSE}, -1119540476, 1119540476, (int) System.currentTimeMillis());
        f3060 = (f3061 + 45) % 128;
    }

    /* renamed from: ﾒ */
    private static void m5773(String str, String str2, String str3, Object obj) {
        f3060 = (f3061 + 97) % 128;
        m5758(new Object[]{str, str2, str3, obj, Boolean.TRUE}, -1119540476, 1119540476, (int) System.currentTimeMillis());
        int i = f3060 + 83;
        f3061 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ */
    private static void m5774(String str, String str2, String str3, Throwable th, boolean z) {
        f3060 = (f3061 + 101) % 128;
        if (m5762()) {
            Log.e((String) m5758(new Object[]{str}, 1041568643, -1041568642, (int) System.currentTimeMillis()), str3, th);
            return;
        }
        if (z && m5765().shouldPrintLog(ISAdQualityLogLevel.ERROR)) {
            int i = f3060 + 23;
            f3061 = i % 128;
            if (i % 2 != 0) {
                Log.e((String) m5758(new Object[]{str2}, 1041568643, -1041568642, (int) System.currentTimeMillis()), str3, th);
                throw new ArithmeticException("divide by zero");
            }
            Log.e((String) m5758(new Object[]{str2}, 1041568643, -1041568642, (int) System.currentTimeMillis()), str3, th);
        }
    }

    /* renamed from: ﾒ */
    public static void m5775(String str, String str2, String str3, boolean z) {
        f3061 = (f3060 + 105) % 128;
        m5774(str, str2, str3, null, z);
        int i = f3060 + 101;
        f3061 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }
}
