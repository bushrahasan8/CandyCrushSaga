package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: bf.class */
public final class bf {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f548 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f549;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f550;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f551;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private e f552;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private List f553;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.bf$3, reason: invalid class name */
    /* loaded from: bf$3.class */
    static abstract /* synthetic */ class AnonymousClass3 {

        /* renamed from: ﻐ, reason: contains not printable characters */
        static final int[] f554;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x003e
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.ironsource.adqualitysdk.sdk.i.bf$e[] r0 = com.ironsource.adqualitysdk.sdk.i.bf.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.ironsource.adqualitysdk.sdk.i.bf.AnonymousClass3.f554 = r0
                r0 = r4
                com.ironsource.adqualitysdk.sdk.i.bf$e r1 = com.ironsource.adqualitysdk.sdk.i.bf.e.f562     // Catch: java.lang.NoSuchFieldError -> L36
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            L14:
                int[] r0 = com.ironsource.adqualitysdk.sdk.i.bf.AnonymousClass3.f554     // Catch: java.lang.NoSuchFieldError -> L36 java.lang.NoSuchFieldError -> L3a
                com.ironsource.adqualitysdk.sdk.i.bf$e r1 = com.ironsource.adqualitysdk.sdk.i.bf.e.f559     // Catch: java.lang.NoSuchFieldError -> L3a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a
            L1f:
                int[] r0 = com.ironsource.adqualitysdk.sdk.i.bf.AnonymousClass3.f554     // Catch: java.lang.NoSuchFieldError -> L3a java.lang.NoSuchFieldError -> L3e
                com.ironsource.adqualitysdk.sdk.i.bf$e r1 = com.ironsource.adqualitysdk.sdk.i.bf.e.f560     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L2a:
                int[] r0 = com.ironsource.adqualitysdk.sdk.i.bf.AnonymousClass3.f554     // Catch: java.lang.NoSuchFieldError -> L3e java.lang.NoSuchFieldError -> L42
                com.ironsource.adqualitysdk.sdk.i.bf$e r1 = com.ironsource.adqualitysdk.sdk.i.bf.e.f558     // Catch: java.lang.NoSuchFieldError -> L42
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L42
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L42
            L35:
                return
            L36:
                r4 = move-exception
                goto L14
            L3a:
                r4 = move-exception
                goto L1f
            L3e:
                r4 = move-exception
                goto L2a
            L42:
                r4 = move-exception
                goto L35
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bf.AnonymousClass3.m3471clinit():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ﾒ' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: bf$e.class */
    public static final class e {
        private static int $10 = 0;
        private static int $11 = 1;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static char[] f555;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f556 = 1;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f557;

        /* renamed from: ﻐ, reason: contains not printable characters */
        public static final e f558;

        /* renamed from: ﻛ, reason: contains not printable characters */
        public static final e f559;

        /* renamed from: ｋ, reason: contains not printable characters */
        public static final e f560;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static final e[] f561;

        /* renamed from: ﾒ, reason: contains not printable characters */
        public static final e f562;

        static {
            m3473();
            Object[] objArr = new Object[1];
            a(true, new int[]{0, 3, 148, 2}, null, objArr);
            e eVar = new e(((String) objArr[0]).intern(), 0);
            f562 = eVar;
            Object[] objArr2 = new Object[1];
            a(true, new int[]{3, 5, 54, 1}, null, objArr2);
            e eVar2 = new e(((String) objArr2[0]).intern(), 1);
            f558 = eVar2;
            Object[] objArr3 = new Object[1];
            a(true, new int[]{8, 5, 0, 2}, "\u0001\u0001\u0001��\u0001", objArr3);
            e eVar3 = new e(((String) objArr3[0]).intern(), 2);
            f560 = eVar3;
            Object[] objArr4 = new Object[1];
            a(false, new int[]{13, 5, 0, 0}, "\u0001\u0001\u0001��\u0001", objArr4);
            e eVar4 = new e(((String) objArr4[0]).intern(), 3);
            f559 = eVar4;
            f561 = new e[]{eVar, eVar2, eVar3, eVar4};
            f556 = (f557 + 63) % 128;
        }

        private e(String str, int i) {
        }

        private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
            char c;
            String str2 = str;
            if (str != null) {
                str2 = str.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) str2;
            j jVar = new j();
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = f555;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    char c2 = cArr[i5];
                    try {
                        Map map = b.f452;
                        Object obj = map.get(123012079);
                        if (obj == null) {
                            obj = ((Class) b.m3371(View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 40 - Process.getGidForName(""))).getMethod("t", Integer.TYPE);
                            map.put(123012079, obj);
                        }
                        cArr2[i5] = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c2))).charValue();
                        i5++;
                        $11 = ($10 + 95) % 128;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr, i, cArr3, 0, i2);
            char[] cArr4 = cArr3;
            if (bArr != null) {
                int i6 = $11 + 33;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr4 = new char[i2];
                    jVar.f2705 = 0;
                    c = 1;
                } else {
                    cArr4 = new char[i2];
                    jVar.f2705 = 0;
                    c = 0;
                }
                while (true) {
                    int i7 = jVar.f2705;
                    if (i7 >= i2) {
                        break;
                    }
                    if (bArr[i7] == 1) {
                        char c3 = cArr3[i7];
                        Map map2 = b.f452;
                        Object obj2 = map2.get(-1475644584);
                        if (obj2 == null) {
                            Class cls = (Class) b.m3371((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 41);
                            Class<?> cls2 = Integer.TYPE;
                            obj2 = cls.getMethod("v", cls2, cls2);
                            map2.put(-1475644584, obj2);
                        }
                        cArr4[i7] = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c3), Integer.valueOf(c))).charValue();
                        $11 = ($10 + 89) % 128;
                    } else {
                        char c4 = cArr3[i7];
                        Map map3 = b.f452;
                        Object obj3 = map3.get(1186866459);
                        if (obj3 == null) {
                            Class cls3 = (Class) b.m3371(Drawable.resolveOpacity(0, 0), (char) (TextUtils.lastIndexOf("", '0') + 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 41);
                            Class<?> cls4 = Integer.TYPE;
                            obj3 = cls3.getMethod("y", cls4, cls4);
                            map3.put(1186866459, obj3);
                        }
                        cArr4[i7] = ((Character) ((Method) obj3).invoke(null, Integer.valueOf(c4), Integer.valueOf(c))).charValue();
                    }
                    c = cArr4[jVar.f2705];
                    Map map4 = b.f452;
                    Object obj4 = map4.get(-811294887);
                    if (obj4 == null) {
                        obj4 = ((Class) b.m3371(TextUtils.getTrimmedLength(""), (char) KeyEvent.normalizeMetaState(0), 41 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("w", Object.class, Object.class);
                        map4.put(-811294887, obj4);
                    }
                    ((Method) obj4).invoke(null, jVar, jVar);
                }
            }
            if (i4 > 0) {
                char[] cArr5 = new char[i2];
                System.arraycopy(cArr4, 0, cArr5, 0, i2);
                int i8 = i2 - i4;
                System.arraycopy(cArr5, 0, cArr4, i8, i4);
                System.arraycopy(cArr5, i4, cArr4, 0, i8);
            }
            int i9 = 0;
            char[] cArr6 = cArr4;
            if (z) {
                $10 = ($11 + 15) % 128;
                cArr6 = new char[i2];
                while (true) {
                    jVar.f2705 = i9;
                    int i10 = jVar.f2705;
                    if (i10 >= i2) {
                        break;
                    }
                    $11 = ($10 + 23) % 128;
                    cArr6[i10] = cArr4[(i2 - i10) - 1];
                    i9 = i10 + 1;
                }
            }
            if (i3 > 0) {
                int i11 = 0;
                while (true) {
                    jVar.f2705 = i11;
                    int i12 = jVar.f2705;
                    if (i12 >= i2) {
                        break;
                    }
                    cArr6[i12] = (char) (cArr6[i12] - iArr[2]);
                    i11 = i12 + 1;
                }
            }
            objArr[0] = new String(cArr6);
        }

        public static e valueOf(String str) {
            f556 = (f557 + 53) % 128;
            e eVar = (e) Enum.valueOf(e.class, str);
            f557 = (f556 + 117) % 128;
            return eVar;
        }

        public static e[] values() {
            int i = f556 + 79;
            f557 = i % 128;
            if (i % 2 == 0) {
                return (e[]) f561.clone();
            }
            throw new ArithmeticException("divide by zero");
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        static void m3473() {
            f555 = new char[]{37292, 37273, 37292, 37179, 37175, 37312, 37321, 37172, 37230, 37135, 37120, 37151, 37121, 37230, 37122, 37120, 37134, 37127};
        }
    }

    static {
        m3469();
        View.MeasureSpec.getSize(0);
        MotionEvent.axisFromString("");
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        ViewConfiguration.getKeyRepeatDelay();
        TextUtils.indexOf("", "", 0);
        View.MeasureSpec.getMode(0);
        ViewConfiguration.getKeyRepeatDelay();
        PointF.length(0.0f, 0.0f);
        SystemClock.elapsedRealtime();
        ViewConfiguration.getScrollBarFadeDuration();
        AndroidCharacter.getMirror('0');
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        int i = f550 + 99;
        f548 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public bf(JSONObject jSONObject) {
        Object[] objArr = new Object[1];
        a((byte) ((-16777115) - Color.rgb(0, 0, 0)), "��\t\r\u0011", 4 - View.resolveSize(0, 0), objArr);
        this.f552 = m3468(jSONObject.optString(((String) objArr[0]).intern()));
        Object[] objArr2 = new Object[1];
        a((byte) (41 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "\u0014\u0013", KeyEvent.keyCodeFromString("") + 2, objArr2);
        this.f553 = m3467(jSONObject.optString(((String) objArr2[0]).intern()));
    }

    private static void a(byte b, String str, int i, Object[] objArr) {
        int i2;
        if (str != null) {
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        s sVar = new s();
        char[] cArr2 = f549;
        char[] cArr3 = cArr2;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                $11 = ($10 + 75) % 128;
                char c = cArr2[i3];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122714169);
                    if (obj == null) {
                        obj = ((Class) b.m3371(View.MeasureSpec.getSize(0), (char) TextUtils.indexOf("", "", 0), TextUtils.lastIndexOf("", '0', 0, 0) + 42)).getMethod("j", Integer.TYPE);
                        map.put(122714169, obj);
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
        char c2 = f551;
        Map map2 = b.f452;
        Object obj2 = map2.get(122714169);
        if (obj2 == null) {
            obj2 = ((Class) b.m3371(Process.myTid() >> 22, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 41 - Gravity.getAbsoluteGravity(0, 0))).getMethod("j", Integer.TYPE);
            map2.put(122714169, obj2);
        }
        char charValue = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c2))).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            $10 = ($11 + 45) % 128;
            i2 = i - 1;
            cArr5[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i4 = $10 + 5;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                sVar.f3058 = 1;
            } else {
                sVar.f3058 = 0;
            }
            while (true) {
                int i5 = sVar.f3058;
                if (i5 >= i2) {
                    break;
                }
                char c3 = cArr[i5];
                sVar.f3059 = c3;
                char c4 = cArr[i5 + 1];
                sVar.f3055 = c4;
                if (c3 == c4) {
                    cArr5[i5] = (char) (c3 - b);
                    cArr5[i5 + 1] = (char) (c4 - b);
                } else {
                    Map map3 = b.f452;
                    Object obj3 = map3.get(-707600991);
                    if (obj3 == null) {
                        Class cls = (Class) b.m3371(ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.getDeadChar(0, 0) + 41);
                        Class<?> cls2 = Integer.TYPE;
                        obj3 = cls.getMethod("o", Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class);
                        map3.put(-707600991, obj3);
                    }
                    int intValue = ((Integer) ((Method) obj3).invoke(null, sVar, sVar, Integer.valueOf(charValue), sVar, sVar, Integer.valueOf(charValue), sVar, sVar, Integer.valueOf(charValue), sVar, sVar, Integer.valueOf(charValue), sVar)).intValue();
                    int i6 = sVar.f3054;
                    if (intValue == i6) {
                        $11 = ($10 + 5) % 128;
                        Object obj4 = map3.get(1018245111);
                        if (obj4 == null) {
                            Class cls3 = (Class) b.m3371((-1) - TextUtils.lastIndexOf("", '0', 0), (char) View.getDefaultSize(0, 0), 41 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                            Class<?> cls4 = Integer.TYPE;
                            obj4 = cls3.getMethod("l", Object.class, Object.class, cls4, cls4, Object.class, Object.class, cls4, cls4, Object.class, cls4, Object.class);
                            map3.put(1018245111, obj4);
                        }
                        int intValue2 = ((Integer) ((Method) obj4).invoke(null, sVar, sVar, Integer.valueOf(charValue), Integer.valueOf(charValue), sVar, sVar, Integer.valueOf(charValue), Integer.valueOf(charValue), sVar, Integer.valueOf(charValue), sVar)).intValue();
                        int i7 = sVar.f3057;
                        int i8 = sVar.f3054;
                        int i9 = sVar.f3058;
                        cArr5[i9] = cArr3[intValue2];
                        cArr5[i9 + 1] = cArr3[(i7 * charValue) + i8];
                    } else {
                        int i10 = sVar.f3056;
                        int i11 = sVar.f3057;
                        if (i10 == i11) {
                            int i12 = $10;
                            $11 = (i12 + 21) % 128;
                            int i13 = ((sVar.f3053 + charValue) - 1) % charValue;
                            sVar.f3053 = i13;
                            int i14 = ((i6 + charValue) - 1) % charValue;
                            sVar.f3054 = i14;
                            int i15 = sVar.f3058;
                            cArr5[i15] = cArr3[(i10 * charValue) + i13];
                            cArr5[i15 + 1] = cArr3[(i11 * charValue) + i14];
                            $11 = (i12 + 31) % 128;
                        } else {
                            int i16 = sVar.f3053;
                            int i17 = sVar.f3058;
                            cArr5[i17] = cArr3[(i10 * charValue) + i6];
                            cArr5[i17 + 1] = cArr3[(i11 * charValue) + i16];
                        }
                    }
                }
                sVar.f3058 += 2;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr5[i18] = (char) (cArr5[i18] ^ 13722);
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List] */
    /* renamed from: ﻛ, reason: contains not printable characters */
    private static List m3467(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            f548 = (f550 + 111) % 128;
            Object[] objArr = new Object[1];
            a((byte) (78 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), "㘄", -TextUtils.indexOf((CharSequence) "", '0'), objArr);
            arrayList = Arrays.asList(str.split(((String) objArr[0]).intern()));
            f550 = (f548 + 105) % 128;
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:
    
        if (r6.equals(((java.lang.String) r0[0]).intern()) != false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.ironsource.adqualitysdk.sdk.i.bf.e m3468(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bf.m3468(java.lang.String):com.ironsource.adqualitysdk.sdk.i.bf$e");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static void m3469() {
        f551 = (char) 44288;
        f549 = new char[]{39156, 39167, 39683, 39144, 39163, 39128, 39141, 39100, 39140, 39160, 39157, 39153, 39148, 39135, 39165, 39685, 39161, 39164, 39154, 39146, 39680, 39166, 39147, 39151, 39129, 39686, 39682, 39152, 39162, 39155, 39145, 39684, 39088, 39150, 39681, 39687};
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r0 != 4) goto L39;
     */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m3470(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bf.m3470(java.lang.String):boolean");
    }
}
