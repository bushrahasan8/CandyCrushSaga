package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.m4;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: kd.class */
public final class kd {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f2985 = {-2123062802, -288739161, -1879417771, 2030277293, -204704072, 1897616176, 134318389, -431850842, 814838183, -1932880120, 295754330, -851121737, -783581900, -1905290865, -1597954184, 349466774, 2135632, -1630884453};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2986 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2987 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static WeakReference f2988;

    private static void a(int[] iArr, int i, Object[] objArr) {
        int[] iArr2;
        m mVar = new m();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f2985;
        int[] iArr4 = iArr3;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr5 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = iArr3[i2];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122833333);
                    if (obj == null) {
                        obj = ((Class) b.m3371(ViewConfiguration.getWindowTouchSlop() >> 8, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 41 - Color.blue(0))).getMethod(m4.p, Integer.TYPE);
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
            iArr4 = iArr5;
        }
        int length2 = iArr4.length;
        int[] iArr6 = new int[length2];
        int[] iArr7 = f2985;
        if (iArr7 != null) {
            int length3 = iArr7.length;
            int[] iArr8 = new int[length3];
            int i4 = 0;
            while (i4 < length3) {
                int i5 = $10 + 97;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = iArr7[i4];
                    Map map2 = b.f452;
                    Object obj2 = map2.get(122833333);
                    if (obj2 == null) {
                        obj2 = ((Class) b.m3371(Color.blue(0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 41 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getMethod(m4.p, Integer.TYPE);
                        map2.put(122833333, obj2);
                    }
                    iArr8[i4] = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i6))).intValue();
                } else {
                    int i7 = iArr7[i4];
                    Map map3 = b.f452;
                    Object obj3 = map3.get(122833333);
                    if (obj3 == null) {
                        obj3 = ((Class) b.m3371('0' - AndroidCharacter.getMirror('0'), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 41 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod(m4.p, Integer.TYPE);
                        map3.put(122833333, obj3);
                    }
                    iArr8[i4] = ((Integer) ((Method) obj3).invoke(null, Integer.valueOf(i7))).intValue();
                    i4++;
                }
                $10 = ($11 + 71) % 128;
            }
            iArr2 = iArr8;
        } else {
            iArr2 = iArr7;
        }
        System.arraycopy(iArr2, 0, iArr6, 0, length2);
        mVar.f3040 = 0;
        while (true) {
            int i8 = mVar.f3040;
            if (i8 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            $10 = ($11 + 67) % 128;
            int i9 = iArr[i8];
            char c = (char) (i9 >> 16);
            cArr[0] = c;
            char c2 = (char) i9;
            cArr[1] = c2;
            char c3 = (char) (iArr[i8 + 1] >> 16);
            cArr[2] = c3;
            char c4 = (char) iArr[i8 + 1];
            cArr[3] = c4;
            mVar.f3039 = (c << 16) + c2;
            mVar.f3038 = (c3 << 16) + c4;
            m.m5748(iArr6);
            for (int i10 = 0; i10 < 16; i10++) {
                int i11 = mVar.f3039 ^ iArr6[i10];
                mVar.f3039 = i11;
                int m5749 = m.m5749(i11);
                Map map4 = b.f452;
                Object obj4 = map4.get(10695560);
                if (obj4 == null) {
                    obj4 = ((Class) b.m3371(1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) KeyEvent.keyCodeFromString(""), 42 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).getMethod("k", Object.class, Integer.TYPE, Object.class, Object.class);
                    map4.put(10695560, obj4);
                }
                int intValue = ((Integer) ((Method) obj4).invoke(null, mVar, Integer.valueOf(m5749), mVar, mVar)).intValue();
                mVar.f3039 = mVar.f3038;
                mVar.f3038 = intValue;
            }
            int i12 = mVar.f3039;
            int i13 = mVar.f3038;
            mVar.f3039 = i13;
            mVar.f3038 = i12;
            int i14 = i12 ^ iArr6[16];
            mVar.f3038 = i14;
            int i15 = i13 ^ iArr6[17];
            mVar.f3039 = i15;
            cArr[0] = (char) (i15 >>> 16);
            cArr[1] = (char) i15;
            cArr[2] = (char) (i14 >>> 16);
            cArr[3] = (char) i14;
            m.m5748(iArr6);
            int i16 = mVar.f3040;
            cArr2[i16 * 2] = cArr[0];
            cArr2[(i16 * 2) + 1] = cArr[1];
            cArr2[(i16 * 2) + 2] = cArr[2];
            cArr2[(i16 * 2) + 3] = cArr[3];
            Map map5 = b.f452;
            Object obj5 = map5.get(1365438799);
            if (obj5 == null) {
                obj5 = ((Class) b.m3371(ViewConfiguration.getTouchSlop() >> 8, (char) (Process.myTid() >> 22), 41 - Color.argb(0, 0, 0, 0))).getMethod("m", Object.class, Object.class);
                map5.put(1365438799, obj5);
            }
            ((Method) obj5).invoke(null, mVar, mVar);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static /* synthetic */ Object m5645(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        String str4 = (String) objArr[3];
        f2987 = (f2986 + 61) % 128;
        try {
            if (TextUtils.isEmpty(str3)) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            Object[] objArr2 = new Object[1];
            a(new int[]{-1660922997, -689211925}, KeyEvent.normalizeMetaState(0) + 1, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(str);
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr3 = new Object[1];
            a(new int[]{2009242760, 868084551, -1565485380, -54289440, -1676319177, 1885044562}, 11 - TextUtils.getOffsetBefore("", 0), objArr3);
            sb2.append(((String) objArr3[0]).intern());
            sb2.append(obj);
            Object[] objArr4 = new Object[1];
            a(new int[]{62335012, -1398598591, -1042050036, 1212264164, -1842455572, -1879134712, 196344964, 19685538}, 13 - TextUtils.getOffsetBefore("", 0), objArr4);
            sb2.append(((String) objArr4[0]).intern());
            String obj2 = sb2.toString();
            Boolean bool = Boolean.FALSE;
            v.m5758(new Object[]{str, obj2, bool}, -2057200567, 2057200570, (int) System.currentTimeMillis());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            String str5 = "";
            if (str4 != null) {
                StringBuilder sb4 = new StringBuilder();
                try {
                    Object[] objArr5 = new Object[1];
                    a(new int[]{-1291166370, -1620418359}, View.MeasureSpec.getMode(0) + 1, objArr5);
                    sb4.append(((String) objArr5[0]).intern());
                    sb4.append(str4);
                    str5 = sb4.toString();
                } catch (Throwable th) {
                    return null;
                }
            }
            sb3.append(str5);
            v.m5758(new Object[]{str, sb3.toString(), bool}, -2057200567, 2057200570, (int) System.currentTimeMillis());
            be beVar = (be) f2988.get();
            if (beVar == null) {
                return null;
            }
            int i = f2987 + 55;
            f2986 = i % 128;
            if (i % 2 != 0) {
                beVar.m3457(str, str2, obj, str4);
                throw new ArithmeticException("divide by zero");
            }
            beVar.m3457(str, str2, obj, str4);
            return null;
        } catch (Throwable th2) {
            return null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m5646(String str, String str2, String str3, Throwable th, JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        if (z) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                Object[] objArr = new Object[1];
                a(new int[]{-1660922997, -689211925}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
                sb.append(((String) objArr[0]).intern());
                sb.append(str);
                str3 = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                Object[] objArr2 = new Object[1];
                a(new int[]{-1664237595, 551697295, 1930394125, -221954651}, ExpandableListView.getPackedPositionType(0L) + 7, objArr2);
                sb2.append(((String) objArr2[0]).intern());
                sb2.append(str3);
                Object[] objArr3 = new Object[1];
                a(new int[]{-200674281, -267931171}, 1 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr3);
                sb2.append(((String) objArr3[0]).intern());
                v.m5770(str, sb2.toString(), th, z3);
                f2986 = (f2987 + 39) % 128;
            } catch (Throwable th2) {
                return;
            }
        }
        be beVar = (be) f2988.get();
        if (beVar != null) {
            String stackTraceString = Log.getStackTraceString(th);
            be.m3450(new Object[]{beVar, str, str2, str3, stackTraceString, jSONObject, Boolean.valueOf(z2)}, -1260838682, 1260838682, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, beVar)).intValue());
            f2987 = (f2986 + 47) % 128;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m5647(String str, String str2, Throwable th, boolean z, boolean z2) {
        int i = f2986 + 83;
        f2987 = i % 128;
        try {
            if (i % 2 == 0) {
                m5653(str, str2, th, z, z2, false);
            } else {
                m5653(str, str2, th, z, z2, false);
            }
            int i2 = f2986 + 95;
            f2987 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static /* synthetic */ Object m5648(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        Throwable th = (Throwable) objArr[3];
        f2987 = (f2986 + 29) % 128;
        try {
            m5657(str, str2, str3, th, false);
            f2987 = (f2986 + 15) % 128;
            return null;
        } catch (Throwable th2) {
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Object m5649(Object[] objArr, int i, int i2, int i3) {
        int i4 = i ^ (-1);
        return ((((i * 303) + (i2 * (-301))) + ((((((i3 ^ (-1)) | i4) | i2) ^ (-1)) | (((i | i2) | i3) ^ (-1))) * (-302))) + ((((i4 | i2) | i3) ^ (-1)) * (-604))) + ((((i | (i2 ^ (-1))) ^ (-1)) | ((i2 | i3) ^ (-1))) * 302) != 1 ? m5645(objArr) : m5648(objArr);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Throwable m5650(Throwable th) {
        while (th.getCause() != null) {
            int i = f2987 + 77;
            f2986 = i % 128;
            if (i % 2 != 0) {
                th.getCause();
                throw null;
            }
            th = th.getCause();
            f2987 = (f2986 + 59) % 128;
        }
        return th;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m5651(String str, String str2, String str3, String str4) {
        int i = f2987 + 89;
        f2986 = i % 128;
        try {
            if (i % 2 != 0) {
                m5649(new Object[]{str, str2, str3, str4}, -1869889941, 1869889941, (int) System.currentTimeMillis());
                throw null;
            }
            m5649(new Object[]{str, str2, str3, str4}, -1869889941, 1869889941, (int) System.currentTimeMillis());
            int i2 = f2987 + 121;
            f2986 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m5652(String str, String str2, String str3, Throwable th) {
        m5649(new Object[]{str, str2, str3, th}, -1811451310, 1811451311, (int) System.currentTimeMillis());
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m5653(String str, String str2, Throwable th, boolean z, boolean z2, boolean z3) {
        f2986 = (f2987 + 17) % 128;
        try {
            if (!z) {
                v.m5770(str, str2, th, z3);
            } else {
                v.m5758(new Object[]{str, str2, Boolean.valueOf(z3)}, -2057200567, 2057200570, (int) System.currentTimeMillis());
                if (th != null) {
                    Object[] objArr = new Object[1];
                    a(new int[]{-1017635433, 1195861544, -1962447565, -1093646502}, 7 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
                    v.m5770(str, ((String) objArr[0]).intern(), th, z3);
                    f2987 = (f2986 + 75) % 128;
                }
            }
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a(new int[]{232167602, 1925635151, 1108803648, -73313152, -917292177, -1031187978}, TextUtils.indexOf("", "", 0) + 10, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(str);
            m5646(str, str2, sb.toString(), th, null, false, z2, z3);
            f2986 = (f2987 + 119) % 128;
        } catch (Throwable th2) {
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m5654(be beVar) {
        f2988 = new WeakReference(beVar);
        f2987 = (f2986 + 69) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m5655(String str, String str2, String str3, Throwable th, JSONObject jSONObject, boolean z) {
        int i = f2986 + 101;
        f2987 = i % 128;
        try {
            if (i % 2 == 0) {
                m5646(str, str2, str3, th, jSONObject, false, true, z);
            } else {
                m5646(str, str2, str3, th, jSONObject, true, false, z);
            }
        } catch (Throwable th2) {
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m5656(String str, String str2, Throwable th, boolean z) {
        int i = f2986 + 11;
        f2987 = i % 128;
        try {
            if (i % 2 == 0) {
                m5647(str, str2, th, z, true);
            } else {
                m5647(str, str2, th, z, false);
            }
        } catch (Throwable th2) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m5657(String str, String str2, String str3, Throwable th, boolean z) {
        f2987 = (f2986 + 15) % 128;
        try {
            m5646(str, str2, str3, th, null, false, false, false);
            f2987 = (f2986 + 77) % 128;
        } catch (Throwable th2) {
        }
    }
}
