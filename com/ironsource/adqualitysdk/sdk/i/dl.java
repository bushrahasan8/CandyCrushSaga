package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: dl.class */
public class dl extends db implements cn {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﬤ, reason: contains not printable characters */
    private static int f1778 = 1;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static byte[] f1779;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f1780;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f1781;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f1782;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static short[] f1783;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1784;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f1785;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private ho f1786;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private ho f1788;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final List f1789 = new ArrayList();

    /* renamed from: ｋ, reason: contains not printable characters */
    private final List f1791 = new ArrayList();

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final List f1790 = new ArrayList();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final List f1792 = new ArrayList();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final List f1793 = new ArrayList();

    /* renamed from: ﱟ, reason: contains not printable characters */
    private JSONObject f1787 = new JSONObject();

    static {
        m4711();
        Process.getThreadPriority(0);
        View.resolveSizeAndState(0, 0, 0);
        TextUtils.lastIndexOf("", '0');
        KeyEvent.normalizeMetaState(0);
        Color.alpha(0);
        Color.blue(0);
        ViewConfiguration.getPressedStateDuration();
        ImageFormat.getBitsPerPixel(0);
        KeyEvent.getMaxKeyCode();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewConfiguration.getGlobalActionKeyTimeout();
        ViewConfiguration.getScrollFriction();
        SystemClock.elapsedRealtime();
        ViewConfiguration.getScrollBarSize();
        TextUtils.getOffsetAfter("", 0);
        ExpandableListView.getPackedPositionForGroup(0);
        TextUtils.indexOf("", "", 0, 0);
        TextUtils.getTrimmedLength("");
        Process.myTid();
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        SystemClock.currentThreadTimeMillis();
        Drawable.resolveOpacity(0, 0);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        TextUtils.getTrimmedLength("");
        View.getDefaultSize(0, 0);
        View.combineMeasuredStates(0, 0);
        ViewConfiguration.getScrollBarFadeDuration();
        Color.blue(0);
        TextUtils.getTrimmedLength("");
        Drawable.resolveOpacity(0, 0);
        AndroidCharacter.getMirror('0');
        Color.blue(0);
        Color.alpha(0);
        TextUtils.indexOf("", "", 0, 0);
        ExpandableListView.getPackedPositionForGroup(0);
        ViewConfiguration.getPressedStateDuration();
        ViewConfiguration.getKeyRepeatDelay();
        View.getDefaultSize(0, 0);
        KeyEvent.getMaxKeyCode();
        TextUtils.lastIndexOf("", '0', 0, 0);
        Process.getGidForName("");
        Color.red(0);
        PointF.length(0.0f, 0.0f);
        View.resolveSizeAndState(0, 0, 0);
        Process.getThreadPriority(0);
        ViewConfiguration.getFadingEdgeLength();
        ViewConfiguration.getMinimumFlingVelocity();
        View.resolveSizeAndState(0, 0, 0);
        View.MeasureSpec.getSize(0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        TextUtils.lastIndexOf("", '0', 0, 0);
        ViewConfiguration.getMaximumDrawingCacheSize();
        Color.blue(0);
        TextUtils.indexOf("", "", 0);
        Process.myPid();
        SystemClock.currentThreadTimeMillis();
        KeyEvent.getMaxKeyCode();
        View.MeasureSpec.getSize(0);
        Process.myTid();
        ImageFormat.getBitsPerPixel(0);
        KeyEvent.getDeadChar(0, 0);
        SystemClock.uptimeMillis();
        Color.rgb(0, 0, 0);
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getMinimumFlingVelocity();
        MotionEvent.axisFromString("");
        ViewConfiguration.getScrollBarFadeDuration();
        ViewConfiguration.getKeyRepeatDelay();
        ViewConfiguration.getScrollFriction();
        ViewConfiguration.getKeyRepeatDelay();
        TextUtils.getOffsetAfter("", 0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        View.MeasureSpec.getMode(0);
        View.combineMeasuredStates(0, 0);
        Process.getThreadPriority(0);
        ViewConfiguration.getScrollBarFadeDuration();
        ViewConfiguration.getZoomControlsTimeout();
        Process.myTid();
        TextUtils.lastIndexOf("", '0', 0);
        KeyEvent.normalizeMetaState(0);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        Color.red(0);
        ExpandableListView.getPackedPositionGroup(0L);
        TypedValue.complexToFloat(0);
        ViewConfiguration.getEdgeSlop();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        KeyEvent.getModifierMetaStateMask();
        SystemClock.currentThreadTimeMillis();
        ViewConfiguration.getMaximumDrawingCacheSize();
        View.resolveSizeAndState(0, 0, 0);
        KeyEvent.keyCodeFromString("");
        TextUtils.indexOf("", "", 0);
        View.resolveSize(0, 0);
        SystemClock.elapsedRealtime();
        ExpandableListView.getPackedPositionForGroup(0);
        ViewConfiguration.getMaximumFlingVelocity();
        KeyEvent.getMaxKeyCode();
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getWindowTouchSlop();
        KeyEvent.getDeadChar(0, 0);
        Color.argb(0, 0, 0, 0);
        SystemClock.currentThreadTimeMillis();
        KeyEvent.getModifierMetaStateMask();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        ExpandableListView.getPackedPositionType(0L);
        Color.alpha(0);
        View.combineMeasuredStates(0, 0);
        MotionEvent.axisFromString("");
        TextUtils.indexOf("", "", 0, 0);
        View.resolveSize(0, 0);
        ViewConfiguration.getTouchSlop();
        View.combineMeasuredStates(0, 0);
        View.MeasureSpec.getSize(0);
        TextUtils.getOffsetBefore("", 0);
        KeyEvent.getDeadChar(0, 0);
        Color.rgb(0, 0, 0);
        AudioTrack.getMinVolume();
        View.combineMeasuredStates(0, 0);
        View.MeasureSpec.getSize(0);
        TextUtils.getOffsetAfter("", 0);
        TextUtils.indexOf((CharSequence) "", '0');
        TextUtils.indexOf("", "");
        KeyEvent.getDeadChar(0, 0);
        int i = f1778 + 47;
        f1782 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r7, int r8, boolean r9, int r10, java.lang.String r11, java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dl.a(int, int, boolean, int, java.lang.String, java.lang.Object[]):void");
    }

    private static void b(short s, byte b, int i, int i2, int i3, Object[] objArr) {
        int i4;
        int i5;
        q qVar = new q();
        StringBuilder sb = new StringBuilder();
        int i6 = f1781;
        try {
            Map map = b.f452;
            Object obj = map.get(-1903297911);
            if (obj == null) {
                Class cls = (Class) b.m3371(ViewConfiguration.getTapTimeout() >> 16, (char) View.MeasureSpec.getSize(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 40);
                Class<?> cls2 = Integer.TYPE;
                obj = cls.getMethod("g", cls2, cls2);
                map.put(-1903297911, obj);
            }
            int intValue = ((Integer) ((Method) obj).invoke(null, Integer.valueOf(i2), Integer.valueOf(i6))).intValue();
            boolean z = intValue == -1;
            if (!(!z)) {
                byte[] bArr = f1779;
                byte[] bArr2 = bArr;
                if (bArr != null) {
                    $11 = ($10 + 121) % 128;
                    int length = bArr.length;
                    byte[] bArr3 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        $10 = ($11 + 9) % 128;
                        byte b2 = bArr[i7];
                        Map map2 = b.f452;
                        Object obj2 = map2.get(122654587);
                        if (obj2 == null) {
                            obj2 = ((Class) b.m3371((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0')), View.combineMeasuredStates(0, 0) + 41)).getMethod("h", Integer.TYPE);
                            map2.put(122654587, obj2);
                        }
                        bArr3[i7] = ((Byte) ((Method) obj2).invoke(null, Integer.valueOf(b2))).byteValue();
                        i7++;
                        $10 = ($11 + 23) % 128;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = f1779;
                    int i8 = f1784;
                    Map map3 = b.f452;
                    Object obj3 = map3.get(-1903297911);
                    if (obj3 == null) {
                        Class cls3 = (Class) b.m3371((-1) - ExpandableListView.getPackedPositionChild(0L), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 41);
                        Class<?> cls4 = Integer.TYPE;
                        obj3 = cls3.getMethod("g", cls4, cls4);
                        map3.put(-1903297911, obj3);
                    }
                    intValue = (byte) (((byte) (bArr4[((Integer) ((Method) obj3).invoke(null, Integer.valueOf(i3), Integer.valueOf(i8))).intValue()] ^ 8044072489887092822L)) + ((int) (f1781 ^ 8044072489887092822L)));
                } else {
                    intValue = (short) (((short) (f1783[i3 + ((int) (f1784 ^ 8044072489887092822L))] ^ 8044072489887092822L)) + ((int) (f1781 ^ 8044072489887092822L)));
                }
            }
            if (intValue > 0) {
                int i9 = $11 + 21;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = ((i3 << intValue) >> 4) / ((int) (f1784 & 8044072489887092822L));
                    i4 = i10;
                    if (z) {
                        i4 = i10;
                        i5 = 1;
                    }
                    i5 = 0;
                } else {
                    int i11 = ((i3 + intValue) - 2) + ((int) (f1784 ^ 8044072489887092822L));
                    i4 = i11;
                    if (!z) {
                        i4 = i11;
                        i5 = 0;
                    }
                    i5 = 1;
                }
                qVar.f3047 = i4 + i5;
                int i12 = f1780;
                Map map4 = b.f452;
                Object obj4 = map4.get(-2107390936);
                if (obj4 == null) {
                    Class cls5 = (Class) b.m3371(ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) (ViewConfiguration.getTouchSlop() >> 8), (-16777175) - Color.rgb(0, 0, 0));
                    Class<?> cls6 = Integer.TYPE;
                    obj4 = cls5.getMethod("f", Object.class, cls6, cls6, Object.class);
                    map4.put(-2107390936, obj4);
                }
                ((StringBuilder) ((Method) obj4).invoke(null, qVar, Integer.valueOf(i), Integer.valueOf(i12), sb)).append(qVar.f3049);
                qVar.f3048 = qVar.f3049;
                byte[] bArr5 = f1779;
                byte[] bArr6 = bArr5;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    bArr6 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        bArr6[i13] = (byte) (bArr5[i13] ^ 8044072489887092822L);
                    }
                }
                boolean z2 = bArr6 != null;
                qVar.f3050 = 1;
                while (qVar.f3050 < intValue) {
                    if (z2) {
                        byte[] bArr7 = f1779;
                        qVar.f3047 = qVar.f3047 - 1;
                        qVar.f3049 = (char) (qVar.f3048 + (((byte) (((byte) (bArr7[r0] ^ 8044072489887092822L)) + s)) ^ b));
                    } else {
                        short[] sArr = f1783;
                        qVar.f3047 = qVar.f3047 - 1;
                        qVar.f3049 = (char) (qVar.f3048 + (((short) (((short) (sArr[r0] ^ 8044072489887092822L)) + s)) ^ b));
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

    /* renamed from: ﬤ, reason: contains not printable characters */
    private Object m4698() {
        boolean z;
        f1778 = (f1782 + 65) % 128;
        if (this.f1789.size() <= 0) {
            int i = f1782 + 29;
            f1778 = i % 128;
            if (i % 2 == 0) {
                this.f1791.size();
                throw null;
            }
            if (this.f1791.size() <= 0 && this.f1793.size() <= 0) {
                z = false;
                return Boolean.valueOf(z);
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }

    /* renamed from: טּ, reason: contains not printable characters */
    private JSONObject m4699() {
        JSONObject jSONObject = new JSONObject();
        try {
            ho hoVar = this.f1786;
            if (hoVar != null) {
                int i = f1778 + 89;
                f1782 = i % 128;
                if (i % 2 != 0) {
                    jSONObject.put(ig.f2564, hoVar.m5142());
                    throw new ArithmeticException("divide by zero");
                }
                jSONObject.put(ig.f2564, hoVar.m5142());
            }
            ho hoVar2 = this.f1788;
            if (hoVar2 != null) {
                jSONObject.put(ig.f2560, hoVar2.m5142());
            }
            if (this.f1789.size() > 0) {
                jSONObject.put(ig.f2562, new JSONArray((Collection) this.f1789));
            }
            if (this.f1791.size() > 0) {
                jSONObject.put(ig.f2558, new JSONArray((Collection) this.f1791));
                f1778 = (f1782 + 65) % 128;
            }
            if (this.f1790.size() > 0) {
                jSONObject.put(ig.f2554, new JSONArray((Collection) this.f1790));
            }
            if (this.f1792.size() > 0) {
                jSONObject.put(ig.f2563, new JSONArray((Collection) this.f1792));
                f1778 = (f1782 + 107) % 128;
            }
            if (this.f1793.size() > 0) {
                jSONObject.put(ig.f2559, new JSONArray((Collection) this.f1793));
            }
            if (this.f1787.length() > 0) {
                jSONObject.putOpt(ig.f2561, this.f1787.toString());
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private String m4700() {
        int i = f1782 + 69;
        f1778 = i % 128;
        if (i % 2 != 0) {
            return this.f1787.optString(ig.f2549);
        }
        this.f1787.optString(ig.f2549);
        throw null;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private String m4701() {
        int i = f1782 + 111;
        f1778 = i % 128;
        if (i % 2 == 0) {
            this.f1787.optString(ig.f2558);
            throw new ArithmeticException("divide by zero");
        }
        String optString = this.f1787.optString(ig.f2558);
        f1782 = (f1778 + 73) % 128;
        return optString;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private String m4702() {
        f1778 = (f1782 + 53) % 128;
        String optString = this.f1787.optString(ig.f2563);
        f1778 = (f1782 + 91) % 128;
        return optString;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private String m4703() {
        int i = f1778 + 123;
        f1782 = i % 128;
        if (i % 2 == 0) {
            return this.f1787.optString(ig.f2554);
        }
        this.f1787.optString(ig.f2554);
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private void m4704(String str) {
        int i = f1778 + 69;
        f1782 = i % 128;
        try {
            if (i % 2 == 0) {
                this.f1787.put(ig.f2554, str);
            } else {
                this.f1787.put(ig.f2554, str);
                throw null;
            }
        } catch (JSONException e) {
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private void m4705(String str) {
        f1782 = (f1778 + 113) % 128;
        try {
            this.f1787.put(ig.f2563, str);
            f1778 = (f1782 + 33) % 128;
        } catch (JSONException e) {
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private ho m4706() {
        int i = f1778;
        ho hoVar = this.f1786;
        int i2 = i + 13;
        f1782 = i2 % 128;
        if (i2 % 2 == 0) {
            return hoVar;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private void m4707(String str) {
        int i = f1778 + 117;
        f1782 = i % 128;
        try {
            if (i % 2 != 0) {
                this.f1787.put(ig.f2558, str);
                throw null;
            }
            this.f1787.put(ig.f2558, str);
            int i2 = f1778 + 15;
            f1782 = i2 % 128;
            if (i2 % 2 != 0) {
                throw new ArithmeticException("divide by zero");
            }
        } catch (JSONException e) {
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private ho m4708() {
        int i = f1778 + 105;
        f1782 = i % 128;
        if (i % 2 == 0) {
            return this.f1788;
        }
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private void m4709(String str) {
        f1782 = (f1778 + 13) % 128;
        try {
            this.f1787.put(ig.f2559, str);
            int i = f1782 + 11;
            f1778 = i % 128;
            if (i % 2 == 0) {
                throw new ArithmeticException("divide by zero");
            }
        } catch (JSONException e) {
        }
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private List m4710() {
        int i = f1782;
        List list = this.f1793;
        int i2 = i + 73;
        f1778 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return list;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static void m4711() {
        f1785 = 287397445;
        f1784 = 770281796;
        f1781 = 1798721575;
        f1780 = 1954462776;
        f1779 = new byte[]{-51, 15, -14, 21, -8, -10, 14, -4, 44, -35, 7, -10, -51, -105, 106, -115, 118, -102, -111, 107, -125, 114, -97, 110, -53, 10, -9, 16, -4, -1, 28, 19, -46, -5, 36, -36, 2, -13, -51, -42, 49, -36, 46, -35, -47, 42, 48, -61, 44, 47, -54, -50, 51, -44, 57, -53, 56, 52, -49, -43, 38, -55, -54, -53, 57, -60, 35, -49, -52, 47, 32, -31, -56, 23, -33, 62, 61, -52, -91, 88, -65, 69, 93, -82, -72, 71, -94, -95, -51, -68, 65, -90, 93, -79, -70, 64, -88, 73, -69, -72, -9, 120, -117, -121, 124, 102, -99, Byte.MIN_VALUE, 103, -118, 120, -117, -121, 124, 102, -91, 117, -124, -55, -7, 10, 6, -3, -25, 28, 1, -26, 28, 4, -9, -31, 46, -12, 9};
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m4712(ho hoVar) {
        int i = f1782 + 113;
        int i2 = i % 128;
        f1778 = i2;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        if (hoVar != null) {
            int i3 = i2 + 81;
            f1782 = i3 % 128;
            this.f1788 = hoVar;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m4713(String str) {
        f1782 = (f1778 + 85) % 128;
        m4719(str, this.f1791);
        f1778 = (f1782 + 25) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m4714(List list) {
        f1782 = (f1778 + 31) % 128;
        m4734(list, this.f1790);
        f1778 = (f1782 + 93) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m4715(JSONObject jSONObject) {
        f1778 = (f1782 + 37) % 128;
        this.f1787 = ki.m5715(jSONObject);
        f1778 = (f1782 + 67) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static /* synthetic */ Object m4716(Object[] objArr) {
        dl dlVar = (dl) objArr[0];
        int i = f1782;
        int i2 = i + 55;
        f1778 = i2 % 128;
        JSONObject jSONObject = dlVar.f1787;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = i + 113;
        f1778 = i3 % 128;
        if (i3 % 2 != 0) {
            return jSONObject;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private List m4717() {
        int i = (f1778 + 73) % 128;
        f1782 = i;
        List list = this.f1789;
        int i2 = i + 93;
        f1778 = i2 % 128;
        if (i2 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m4718(String str) {
        int i = f1778 + 35;
        f1782 = i % 128;
        if (i % 2 != 0) {
            m4719(str, this.f1792);
            throw new ArithmeticException("divide by zero");
        }
        m4719(str, this.f1792);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m4719(String str, List list) {
        int i = f1778;
        f1782 = (i + 103) % 128;
        if (list != null) {
            f1782 = (i + 81) % 128;
            if (!TextUtils.isEmpty(str)) {
                f1782 = (f1778 + 97) % 128;
                if (list.contains(str)) {
                    return;
                }
                f1782 = (f1778 + 21) % 128;
                list.add(str);
                f1782 = (f1778 + 87) % 128;
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m4720(List list) {
        f1782 = (f1778 + 57) % 128;
        m4734(list, this.f1793);
        int i = f1778 + 29;
        f1782 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ Object m4721(Object[] objArr) {
        dl dlVar = (dl) objArr[0];
        String str = (String) objArr[1];
        int i = f1782 + 41;
        f1778 = i % 128;
        try {
            if (i % 2 != 0) {
                dlVar.f1787.put(ig.f2562, str);
                return null;
            }
            dlVar.f1787.put(ig.f2562, str);
            throw null;
        } catch (JSONException e) {
            return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private List m4722() {
        int i = f1782;
        List list = this.f1790;
        int i2 = i + 49;
        f1778 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return list;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m4723(ho hoVar) {
        int i = f1778 + 55;
        int i2 = i % 128;
        f1782 = i2;
        if (i % 2 != 0) {
            throw null;
        }
        if (hoVar != null) {
            this.f1786 = hoVar;
            f1778 = (i2 + 71) % 128;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m4724(List list) {
        f1778 = (f1782 + 81) % 128;
        m4734(list, this.f1789);
        f1778 = (f1782 + 63) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static /* synthetic */ Object m4725(Object[] objArr) {
        dl dlVar = (dl) objArr[0];
        f1778 = (f1782 + 21) % 128;
        String optString = dlVar.f1787.optString(ig.f2559);
        int i = f1782 + 61;
        f1778 = i % 128;
        if (i % 2 != 0) {
            return optString;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0427, code lost:
    
        if (r0.equals(((java.lang.String) r0[0]).intern()) != false) goto L17;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0d3d. Please report as an issue. */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object m4726(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 4444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dl.m4726(java.lang.Object[], int, int, int):java.lang.Object");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private List m4727() {
        int i = f1782 + 39;
        int i2 = i % 128;
        f1778 = i2;
        if (i % 2 == 0) {
            List list = this.f1792;
            throw new ArithmeticException("divide by zero");
        }
        List list2 = this.f1792;
        f1782 = (i2 + 79) % 128;
        return list2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m4728(String str) {
        f1782 = (f1778 + 61) % 128;
        m4719(str, this.f1789);
        f1782 = (f1778 + 69) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m4729(List list) {
        int i = f1778 + 71;
        f1782 = i % 128;
        if (i % 2 == 0) {
            m4734(list, this.f1792);
        } else {
            m4734(list, this.f1792);
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static /* synthetic */ Object m4730(Object[] objArr) {
        dl dlVar = (dl) objArr[0];
        String str = (String) objArr[1];
        f1782 = (f1778 + 41) % 128;
        try {
            dlVar.f1787.put(ig.f2549, str);
            int i = f1778 + 85;
            f1782 = i % 128;
            if (i % 2 == 0) {
                return null;
            }
            throw null;
        } catch (JSONException e) {
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private List m4731() {
        int i = f1782 + 1;
        int i2 = i % 128;
        f1778 = i2;
        if (i % 2 == 0) {
            List list = this.f1791;
            throw new ArithmeticException("divide by zero");
        }
        List list2 = this.f1791;
        f1782 = (i2 + 93) % 128;
        return list2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m4732(String str) {
        int i = f1778 + 99;
        f1782 = i % 128;
        if (i % 2 == 0) {
            m4719(str, this.f1790);
        } else {
            m4719(str, this.f1790);
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m4733(List list) {
        f1782 = (f1778 + 95) % 128;
        m4734(list, this.f1791);
        int i = f1782 + 41;
        f1778 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m4734(List list, List list2) {
        int i = (f1782 + 125) % 128;
        f1778 = i;
        if (list != null) {
            int i2 = i + 21;
            f1782 = i2 % 128;
            if (i2 % 2 != 0) {
                list.iterator();
                throw new ArithmeticException("divide by zero");
            }
            Iterator it = list.iterator();
            while (!(!it.hasNext())) {
                int i3 = f1778 + 17;
                f1782 = i3 % 128;
                if (i3 % 2 != 0) {
                    m4719((String) it.next(), list2);
                    throw null;
                }
                m4719((String) it.next(), list2);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.cn
    /* renamed from: ﻐ */
    public final Object mo3719(String str, List<Object> list, cp cpVar) {
        return m4726(new Object[]{this, str, list, cpVar}, -551709551, 551709552, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }
}
