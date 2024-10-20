package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: dm.class */
public class dm extends db implements cn {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: 爫, reason: contains not printable characters */
    private static int f1794 = 0;

    /* renamed from: ףּ, reason: contains not printable characters */
    private static int f1795 = 1;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static long f1796;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static char[] f1797;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static char[] f1798;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private String f1799;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private String f1800;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String f1801;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private String f1802;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private String f1803;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private String f1804;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private String f1805;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f1806;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f1807;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f1808;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f1809;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f1810;

    static {
        m4757();
        PointF.length(0.0f, 0.0f);
        TextUtils.indexOf("", "", 0);
        Color.alpha(0);
        AudioTrack.getMinVolume();
        Process.getThreadPriority(0);
        ViewConfiguration.getMinimumFlingVelocity();
        View.resolveSizeAndState(0, 0, 0);
        Color.red(0);
        KeyEvent.getModifierMetaStateMask();
        SystemClock.elapsedRealtime();
        ViewConfiguration.getScrollFriction();
        TextUtils.indexOf((CharSequence) "", '0');
        TextUtils.indexOf((CharSequence) "", '0');
        TextUtils.lastIndexOf("", '0', 0);
        ViewConfiguration.getTouchSlop();
        ViewConfiguration.getGlobalActionKeyTimeout();
        ViewConfiguration.getPressedStateDuration();
        ViewConfiguration.getMaximumFlingVelocity();
        Process.getElapsedCpuTime();
        TextUtils.getTrimmedLength("");
        ViewConfiguration.getDoubleTapTimeout();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        TextUtils.lastIndexOf("", '0', 0);
        TextUtils.indexOf((CharSequence) "", '0');
        SystemClock.currentThreadTimeMillis();
        ViewConfiguration.getScrollBarSize();
        SystemClock.currentThreadTimeMillis();
        ViewConfiguration.getDoubleTapTimeout();
        Process.getGidForName("");
        TextUtils.indexOf("", "", 0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewConfiguration.getScrollBarFadeDuration();
        View.MeasureSpec.getSize(0);
        ExpandableListView.getPackedPositionChild(0L);
        ViewConfiguration.getEdgeSlop();
        ExpandableListView.getPackedPositionChild(0L);
        f1795 = (f1794 + 117) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r8, int r9, char r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dm.a(int, int, char, java.lang.Object[]):void");
    }

    private static void b(boolean z, int[] iArr, String str, Object[] objArr) {
        char[] cArr;
        String str2 = str;
        if (str != null) {
            str2 = str.getBytes("ISO-8859-1");
            $11 = ($10 + 77) % 128;
        }
        byte[] bArr = (byte[]) str2;
        j jVar = new j();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr2 = f1797;
        char[] cArr3 = cArr2;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 69;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    char c = cArr2[i5];
                    try {
                        Map map = b.f452;
                        Object obj = map.get(123012079);
                        if (obj == null) {
                            obj = ((Class) b.m3371(ViewConfiguration.getFadingEdgeLength() >> 16, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 41 - TextUtils.getOffsetAfter("", 0))).getMethod("t", Integer.TYPE);
                            map.put(123012079, obj);
                        }
                        cArr4[i5] = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c))).charValue();
                        i5 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    char c2 = cArr2[i5];
                    Map map2 = b.f452;
                    Object obj2 = map2.get(123012079);
                    if (obj2 == null) {
                        obj2 = ((Class) b.m3371(KeyEvent.keyCodeFromString(""), (char) (TextUtils.lastIndexOf("", '0') + 1), 41 - View.getDefaultSize(0, 0))).getMethod("t", Integer.TYPE);
                        map2.put(123012079, obj2);
                    }
                    cArr4[i5] = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c2))).charValue();
                    i5++;
                }
            }
            cArr3 = cArr4;
        }
        char[] cArr5 = new char[i2];
        System.arraycopy(cArr3, i, cArr5, 0, i2);
        char[] cArr6 = cArr5;
        if (bArr != null) {
            char[] cArr7 = new char[i2];
            jVar.f2705 = 0;
            char c3 = 0;
            while (true) {
                int i7 = jVar.f2705;
                if (i7 >= i2) {
                    break;
                }
                if (bArr[i7] == 1) {
                    $10 = ($11 + 59) % 128;
                    char c4 = cArr5[i7];
                    Map map3 = b.f452;
                    Object obj3 = map3.get(-1475644584);
                    if (obj3 == null) {
                        Class cls = (Class) b.m3371(KeyEvent.keyCodeFromString(""), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 40 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        Class<?> cls2 = Integer.TYPE;
                        obj3 = cls.getMethod("v", cls2, cls2);
                        map3.put(-1475644584, obj3);
                    }
                    cArr7[i7] = ((Character) ((Method) obj3).invoke(null, Integer.valueOf(c4), Integer.valueOf(c3))).charValue();
                } else {
                    char c5 = cArr5[i7];
                    Map map4 = b.f452;
                    Object obj4 = map4.get(1186866459);
                    if (obj4 == null) {
                        Class cls3 = (Class) b.m3371((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, (char) KeyEvent.keyCodeFromString(""), TextUtils.indexOf((CharSequence) "", '0') + 42);
                        Class<?> cls4 = Integer.TYPE;
                        obj4 = cls3.getMethod("y", cls4, cls4);
                        map4.put(1186866459, obj4);
                    }
                    cArr7[i7] = ((Character) ((Method) obj4).invoke(null, Integer.valueOf(c5), Integer.valueOf(c3))).charValue();
                }
                c3 = cArr7[jVar.f2705];
                Map map5 = b.f452;
                Object obj5 = map5.get(-811294887);
                if (obj5 == null) {
                    obj5 = ((Class) b.m3371((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) TextUtils.getOffsetAfter("", 0), 41 - KeyEvent.keyCodeFromString(""))).getMethod("w", Object.class, Object.class);
                    map5.put(-811294887, obj5);
                }
                ((Method) obj5).invoke(null, jVar, jVar);
            }
            cArr6 = cArr7;
        }
        if (i4 > 0) {
            char[] cArr8 = new char[i2];
            System.arraycopy(cArr6, 0, cArr8, 0, i2);
            int i8 = i2 - i4;
            System.arraycopy(cArr8, 0, cArr6, i8, i4);
            System.arraycopy(cArr8, i4, cArr6, 0, i8);
            $11 = ($10 + 65) % 128;
        }
        if (!(!z)) {
            int i9 = $11 + 13;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr = new char[i2];
                jVar.f2705 = 1;
            } else {
                cArr = new char[i2];
                jVar.f2705 = 0;
            }
            while (true) {
                int i10 = jVar.f2705;
                if (i10 >= i2) {
                    break;
                }
                cArr[i10] = cArr6[(i2 - i10) - 1];
                jVar.f2705 = i10 + 1;
            }
            cArr6 = cArr;
        }
        if (i3 > 0) {
            $10 = ($11 + 81) % 128;
            jVar.f2705 = 0;
            while (true) {
                int i11 = jVar.f2705;
                if (i11 >= i2) {
                    break;
                }
                cArr6[i11] = (char) (cArr6[i11] - iArr[2]);
                jVar.f2705 = i11 + 1;
                $10 = ($11 + 3) % 128;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private String m4736() {
        int i = f1795;
        int i2 = i + 103;
        f1794 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.f1805;
        int i3 = i + 55;
        f1794 = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private JSONObject m4737() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(ig.f2552, this.f1806);
            jSONObject.putOpt(ig.f2551, this.f1807);
            jSONObject.putOpt(ig.f2555, this.f1809);
            jSONObject.putOpt(ig.f2556, this.f1808);
            jSONObject.putOpt(ig.f2557, this.f1803);
            jSONObject.putOpt(ig.f2550, this.f1804);
            jSONObject.putOpt(ig.f2549, this.f1802);
            jSONObject.putOpt(ig.f2553, this.f1801);
            jSONObject.putOpt(ig.f2547, this.f1805);
            f1795 = (f1794 + 111) % 128;
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private Object m4738() {
        int i = (f1794 + 81) % 128;
        f1795 = i;
        String str = this.f1799;
        f1794 = (i + 79) % 128;
        return str;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private void m4739(String str) {
        int i = f1795 + 109;
        f1794 = i % 128;
        this.f1799 = str;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private Object m4740() {
        int i = f1795;
        String str = this.f1800;
        f1794 = (i + 11) % 128;
        return str;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private void m4741(String str) {
        int i = f1794;
        this.f1800 = str;
        f1795 = (i + 83) % 128;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String m4742() {
        int i = f1794;
        int i2 = i + 93;
        f1795 = i2 % 128;
        if (i2 % 2 == 0) {
            String str = this.f1804;
            throw new ArithmeticException("divide by zero");
        }
        String str2 = this.f1804;
        f1795 = (i + 27) % 128;
        return str2;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private void m4743(String str) {
        int i = f1794 + 43;
        f1795 = i % 128;
        this.f1802 = str;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private void m4744(String str) {
        int i = f1795;
        int i2 = i + 27;
        f1794 = i2 % 128;
        this.f1801 = str;
        if (i2 % 2 != 0) {
            throw null;
        }
        f1794 = (i + 47) % 128;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private String m4745() {
        int i = f1794 + 73;
        f1795 = i % 128;
        if (i % 2 != 0) {
            return this.f1802;
        }
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private String m4746() {
        int i = f1794;
        int i2 = i + 81;
        f1795 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.f1803;
        int i3 = i + 55;
        f1795 = i3 % 128;
        if (i3 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return str;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private void m4747(String str) {
        int i = f1794 + 83;
        int i2 = i % 128;
        f1795 = i2;
        this.f1803 = str;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        f1794 = (i2 + 3) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Object m4748() {
        int i = f1794;
        int i2 = i + 123;
        f1795 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.f1810;
        int i3 = i + 35;
        f1795 = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static /* synthetic */ Object m4749(Object[] objArr) {
        dm dmVar = (dm) objArr[0];
        int i = (f1795 + 105) % 128;
        f1794 = i;
        String str = dmVar.f1808;
        int i2 = i + 23;
        f1795 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m4750(String str) {
        int i = f1794 + 15;
        f1795 = i % 128;
        this.f1809 = str;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static /* synthetic */ Object m4751(Object[] objArr) {
        dm dmVar = (dm) objArr[0];
        String str = (String) objArr[1];
        int i = f1794;
        f1795 = (i + 99) % 128;
        dmVar.f1805 = str;
        int i2 = i + 53;
        f1795 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String m4752() {
        int i = f1795;
        String str = this.f1806;
        f1794 = (i + 31) % 128;
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m4753(String str) {
        int i = f1794;
        this.f1807 = str;
        int i2 = i + 33;
        f1795 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ Object m4754(Object[] objArr) {
        dm dmVar = (dm) objArr[0];
        int i = f1794;
        int i2 = i + 125;
        f1795 = i2 % 128;
        String str = dmVar.f1801;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = i + 17;
        f1795 = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private String m4755() {
        int i = f1794;
        String str = this.f1809;
        int i2 = i + 3;
        f1795 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m4756(String str) {
        int i = f1794;
        int i2 = i + 73;
        f1795 = i2 % 128;
        this.f1810 = str;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = i + 29;
        f1795 = i3 % 128;
        if (i3 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static void m4757() {
        f1798 = new char[]{3417, 31516, 57848, 28562, 54274, 17148, 51388, 3405, 31516, 57848, 28562, 54274, 17148, 51388, 8097, 27120, 62228, 32124, 50923, 20532, 55876, 9186, 44343, 14154, 32918, 2590, 37958, 3417, 31516, 57848, 28560, 54279, 17112, 51368, 12558, 49115, 9638, 37498, 6383, 34487, 3949, 30149, 42983, 53686, 19282, 50494, 32446, 59504, 25095, 39861, 5457, 36623, 20001, 14448, 41620, 11501, 38767, 424, 35777, 29286, 64685, 26329, 53553, 23475, 3405, 31516, 57848, 28567, 54293, 17093, 51345, 12555, 3405, 31516, 57848, 28567, 54293, 17093, 51355, 12573, 49111, 9632, 37472, 6354, 34488, 3960, 30185, 58259, 3417, 31516, 57848, 28567, 54293, 17093, 51355, 12558, 49119, 9649, 37493, 6354, 34473, 3955, 30185, 58259, 388, 30657, 60709, 25420, 55506, 19980, 50246, 15815, 45853, 10606, 40620, 5128, 35440, 953, 3405, 31516, 57848, 28561, 54287, 17105, 51355, 12570, 49088, 9651, 37489, 6357, 34477, 3940, 6999, 27935, 63439, 31145, 49664, 21714};
        f1796 = -7404774684212167815L;
        f1797 = new char[]{37247, 37158, 37143, 37146, 37159, 37152, 37152, 37143, 37150, 37163, 37154, 37156, 37161, 37222, 37165, 37158, 37156, 37161, 37156, 37154, 37163, 37150, 37143, 37152, 37162, 37162, 37158, 37176, 37145, 37352, 37352, 37342, 37318, 37353, 37353, 37359, 37351, 37354, 37354, 37352, 37359, 37337, 37314, 37246, 37159, 37137, 37146, 37161, 37162, 37152, 37142, 37150, 37153, 37153, 37159, 37183, 37154, 37154, 37246, 37159, 37142, 37143, 37152, 37152, 37159, 37146, 37147, 37153, 37155, 37154, 37158, 37247, 37162, 37152, 37143, 37142, 37159, 37167, 37158, 37154, 37155, 37153, 37147, 37146, 37237, 37152, 37152, 37137, 37136, 37180, 37182, 37182, 37136, 37146, 37237, 37152, 37152, 37167, 37143, 37159, 37183, 37153, 37152, 37183, 37138, 37146, 37237, 37143, 37136, 37152, 37152, 37159, 37146, 37136, 37237, 37152, 37152, 37136, 37143, 37181, 37141, 37142, 37159, 37167, 37158, 37154, 37155, 37153, 37147, 37146, 37238, 37152, 37162, 37161, 37146, 37143, 37158, 37156, 37161, 37156, 37154, 37163, 37150, 37141, 37181, 37143, 37336, 36971, 36965, 36988, 36968, 36945, 36965, 36948, 36946, 36963, 36963, 37146, 37351, 37345, 37368, 37348, 37357, 37345, 37328, 37358, 37375, 37345};
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m4758(String str) {
        int i = f1794 + 81;
        f1795 = i % 128;
        this.f1808 = str;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static /* synthetic */ Object m4759(Object[] objArr) {
        dm dmVar = (dm) objArr[0];
        String str = (String) objArr[1];
        int i = f1795;
        f1794 = (i + 65) % 128;
        dmVar.f1806 = str;
        int i2 = i + 79;
        f1794 = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Object m4760(Object[] objArr, int i, int i2, int i3) {
        Object m4751;
        int i4 = i ^ (-1);
        int i5 = i2 ^ (-1);
        int i6 = (i * (-947)) + (i2 * 949) + ((((i5 | i3) ^ (-1)) | i4) * (-948)) + ((((i3 ^ (-1)) | (i4 | i5)) ^ (-1)) * (-948)) + ((i | i5) * 948);
        if (i6 == 1) {
            m4751 = m4751(objArr);
        } else if (i6 == 2) {
            m4751 = m4759(objArr);
        } else if (i6 == 3) {
            m4751 = m4749(objArr);
        } else if (i6 != 4) {
            m4751 = m4754(objArr);
        } else {
            dm dmVar = (dm) objArr[0];
            String str = (String) objArr[1];
            int i7 = f1795;
            f1794 = (i7 + 41) % 128;
            dmVar.f1804 = str;
            f1794 = (i7 + 55) % 128;
            m4751 = null;
        }
        return m4751;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String m4761() {
        int i = f1794 + 47;
        f1795 = i % 128;
        if (i % 2 != 0) {
            return this.f1807;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0535, code lost:
    
        if (r8.equals(((java.lang.String) r0[0]).intern()) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x06e2, code lost:
    
        if (r8.equals(((java.lang.String) r0[0]).intern()) != false) goto L89;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.cn
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo3719(java.lang.String r8, java.util.List<java.lang.Object> r9, com.ironsource.adqualitysdk.sdk.i.cp r10) {
        /*
            Method dump skipped, instructions count: 2668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dm.mo3719(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.cp):java.lang.Object");
    }
}
