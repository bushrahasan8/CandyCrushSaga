package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
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
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: kg.class */
public class kg {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f3000 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f3001 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f3002;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Map f3003;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f3004;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: kg$a.class */
    public static final class a {
        private static int $10 = 0;
        private static int $11 = 1;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f3005 = 0;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f3006 = 1;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static char f3007 = 54952;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static long f3008 = -6542782394566060766L;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f3009 = -919218910;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private String f3010;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private Class f3011;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private List f3012;

        public a(Object obj, String str, List<Class> list) {
            if (obj instanceof Class) {
                this.f3011 = (Class) obj;
            } else {
                this.f3011 = obj.getClass();
            }
            this.f3010 = str;
            this.f3012 = list;
        }

        private static void a(char c, int i, String str, String str2, String str3, Object[] objArr) {
            $10 = ($11 + 111) % 128;
            char[] cArr = str3;
            if (str3 != null) {
                cArr = str3.toCharArray();
            }
            char[] cArr2 = cArr;
            if (str2 != null) {
                str2 = str2.toCharArray();
                $11 = ($10 + 103) % 128;
            }
            char[] cArr3 = (char[]) str2;
            if (str != null) {
                str = str.toCharArray();
            }
            char[] cArr4 = (char[]) str;
            g gVar = new g();
            int length = cArr3.length;
            char[] cArr5 = new char[length];
            int length2 = cArr4.length;
            char[] cArr6 = new char[length2];
            System.arraycopy(cArr3, 0, cArr5, 0, length);
            System.arraycopy(cArr4, 0, cArr6, 0, length2);
            cArr5[0] = (char) (cArr5[0] ^ c);
            cArr6[2] = (char) (cArr6[2] + ((char) i));
            int length3 = cArr2.length;
            char[] cArr7 = new char[length3];
            gVar.f2182 = 0;
            while (gVar.f2182 < length3) {
                $10 = ($11 + 87) % 128;
                try {
                    Map map = b.f452;
                    Object obj = map.get(844572084);
                    if (obj == null) {
                        obj = ((Class) b.m3371(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) ExpandableListView.getPackedPositionType(0L), Color.rgb(0, 0, 0) + 16777257)).getMethod("B", Object.class);
                        map.put(844572084, obj);
                    }
                    int intValue = ((Integer) ((Method) obj).invoke(null, gVar)).intValue();
                    Object obj2 = map.get(-204678676);
                    if (obj2 == null) {
                        obj2 = ((Class) b.m3371(ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) TextUtils.getOffsetAfter("", 0), 41 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("z", Object.class);
                        map.put(-204678676, obj2);
                    }
                    int intValue2 = ((Integer) ((Method) obj2).invoke(null, gVar)).intValue();
                    char c2 = cArr5[gVar.f2182 % 4];
                    char c3 = cArr6[intValue];
                    Object obj3 = map.get(786100179);
                    if (obj3 == null) {
                        Class cls = (Class) b.m3371((Process.getThreadPriority(0) + 20) >> 6, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 40 - Process.getGidForName(""));
                        Class<?> cls2 = Integer.TYPE;
                        obj3 = cls.getMethod("A", Object.class, cls2, cls2);
                        map.put(786100179, obj3);
                    }
                    ((Method) obj3).invoke(null, gVar, Integer.valueOf(c2 * 32718), Integer.valueOf(c3));
                    char c4 = cArr5[intValue2];
                    char c5 = cArr6[intValue];
                    Object obj4 = map.get(1393811622);
                    if (obj4 == null) {
                        Class cls3 = (Class) b.m3371(Process.myTid() >> 22, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 41 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        Class<?> cls4 = Integer.TYPE;
                        obj4 = cls3.getMethod("D", cls4, cls4);
                        map.put(1393811622, obj4);
                    }
                    cArr6[intValue2] = ((Character) ((Method) obj4).invoke(null, Integer.valueOf(c4 * 32718), Integer.valueOf(c5))).charValue();
                    cArr5[intValue2] = gVar.f2183;
                    int i2 = gVar.f2182;
                    cArr7[i2] = (char) ((((int) (f3009 ^ (-6542782394566060766L))) ^ ((r0 ^ cArr2[i2]) ^ (f3008 ^ (-6542782394566060766L)))) ^ ((char) (f3007 ^ (-6542782394566060766L))));
                    gVar.f2182 = i2 + 1;
                    $10 = ($11 + 71) % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr7);
        }

        public final boolean equals(Object obj) {
            int i = f3005;
            int i2 = i + 37;
            f3006 = i2 % 128;
            if (i2 % 2 == 0) {
                throw new ArithmeticException("divide by zero");
            }
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            f3006 = (i + 45) % 128;
            if (a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f3011.equals(aVar.f3011)) {
                f3005 = (f3006 + 77) % 128;
                return false;
            }
            if (this.f3010.equals(aVar.f3010)) {
                return this.f3012.equals(aVar.f3012);
            }
            int i3 = f3005 + 99;
            f3006 = i3 % 128;
            if (i3 % 2 == 0) {
                throw new ArithmeticException("divide by zero");
            }
            return false;
        }

        public final int hashCode() {
            int i = f3005 + 3;
            f3006 = i % 128;
            int hashCode = i % 2 == 0 ? (((this.f3011.hashCode() << 55) << this.f3010.hashCode()) * 90) << this.f3012.hashCode() : (((this.f3011.hashCode() * 31) + this.f3010.hashCode()) * 31) + this.f3012.hashCode();
            f3005 = (f3006 + 15) % 128;
            return hashCode;
        }

        public final String toString() {
            Object[] objArr = new Object[1];
            a((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 16633), (-275338131) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "��������", "汻隬璘텀", "ኆ䗶䆯盁洁똈ｬ가\u0db2帻혓딓ㆁ␣첨ⓞꡜ", objArr);
            StringBuilder sb = new StringBuilder(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a((char) (438 - TextUtils.getTrimmedLength("")), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 608273462, "��������", "㗅䆄똤꜁", "�ꮈ\ue1fdퟤ䰅㭸囩ﻙ諸〉⺍�疭", objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(this.f3011);
            Object[] objArr3 = new Object[1];
            a((char) (1865 - TextUtils.getOffsetAfter("", 0)), KeyEvent.normalizeMetaState(0) - 399904587, "��������", "뗽⧰䧨\u0007", "慣\ue7b9പ砂裣흖Ì➒\u1ccbꯁ�砏ᛳ컈巃", objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(this.f3010);
            sb.append('\'');
            Object[] objArr4 = new Object[1];
            a((char) (47214 - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.indexOf("", ""), "��������", "욨�澍Ҹ", "ￊῳ⺖鶮㾎㝎\uee49昴ꉯ㈸槡㢂ဃ콞", objArr4);
            sb.append(((String) objArr4[0]).intern());
            sb.append(this.f3012);
            sb.append('}');
            String obj = sb.toString();
            int i = f3006 + 25;
            f3005 = i % 128;
            if (i % 2 == 0) {
                return obj;
            }
            throw null;
        }
    }

    static {
        m5687();
        ExpandableListView.getPackedPositionChild(0L);
        TextUtils.getOffsetAfter("", 0);
        ExpandableListView.getPackedPositionGroup(0L);
        f3003 = new ConcurrentHashMap();
        int i = f3004 + 69;
        f3001 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r8, int r9, char r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kg.a(int, int, char, java.lang.Object[]):void");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static /* synthetic */ Object m5682(Object[] objArr) {
        List list = (List) objArr[0];
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i = f3004 + 9;
            f3001 = i % 128;
            if (i % 2 == 0) {
                it.next();
                throw null;
            }
            Object next = it.next();
            if (next != null) {
                arrayList.add(next.getClass());
            } else {
                arrayList.add(Object.class);
                f3001 = (f3004 + 15) % 128;
            }
        }
        return arrayList;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Method m5683(Object obj, String str, List<Class> list) {
        try {
            Class<?>[] m5702 = m5702(list);
            if (!(obj instanceof Class)) {
                return obj.getClass().getMethod(str, m5702);
            }
            int i = f3001 + 77;
            f3004 = i % 128;
            try {
                if (i % 2 != 0) {
                    ((Class) obj).getMethod(str, m5702);
                    throw null;
                }
                Method method = ((Class) obj).getMethod(str, m5702);
                int i2 = f3001 + 63;
                f3004 = i2 % 128;
                if (i2 % 2 == 0) {
                    return method;
                }
                throw null;
            } catch (NoSuchMethodException e) {
                return Class.class.getMethod(str, m5702);
            }
        } catch (NoSuchMethodException e2) {
            int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration();
            int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout();
            Object[] objArr = new Object[1];
            a(15 - (scrollBarFadeDuration >> 16), jumpTapTimeout >> 16, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
            String intern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            char mirror = AndroidCharacter.getMirror('0');
            Object[] objArr2 = new Object[1];
            a((elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)) + 3, mirror + 11, (char) (Color.blue(0) + 9762), objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(str);
            int indexOf = TextUtils.indexOf("", "", 0);
            int threadPriority = Process.getThreadPriority(0);
            Object[] objArr3 = new Object[1];
            a(19 - indexOf, 63 - ((threadPriority + 20) >> 6), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6483), objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(obj);
            cu.m4502(intern, sb.toString(), e2);
            return null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m5684(Constructor constructor, List list) {
        return ((Boolean) m5685(new Object[]{constructor, list}, -1475134993, 1475134995, (int) System.currentTimeMillis())).booleanValue();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Object m5685(Object[] objArr, int i, int i2, int i3) {
        int i4 = i ^ (-1);
        int i5 = (i * 236) + (i2 * 471) + (((((i3 ^ (-1)) | i4) ^ (-1)) | i2) * (-235)) + ((((i4 | i3) ^ (-1)) | i2) * (-470)) + ((((i | (i2 ^ (-1))) ^ (-1)) | (((i2 | i4) | i3) ^ (-1))) * 235);
        return i5 != 1 ? i5 != 2 ? m5696(objArr) : m5691(objArr) : m5682(objArr);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Method m5686(Class cls, String str, List list, boolean z) {
        Method[] methods = cls.getMethods();
        f3001 = (f3004 + 31) % 128;
        for (Method method : methods) {
            if (method.getName().equals(str) && method.getParameterTypes().length == list.size() && Modifier.isStatic(method.getModifiers()) == z && !(!m5701(method, list))) {
                int i = f3004 + 99;
                int i2 = i % 128;
                f3001 = i2;
                if (i % 2 == 0) {
                    throw new ArithmeticException("divide by zero");
                }
                int i3 = i2 + 95;
                f3004 = i3 % 128;
                if (i3 % 2 == 0) {
                    return method;
                }
                throw null;
            }
        }
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m5687() {
        f3002 = new char[]{3448, 6228, 10106, 12823, 22819, 25806, 29692, 40702, 42397, 45239, 56945, 58743, 61447, 7961, 10787, 3433, 6237, 10109, 12808, 22837, 25741, 23379, 19974, 28970, 25686, 3903, 12946, 9662, 51387, 62405, 59108, 30527, 25107, 23870, 18500, 9060, 7901, 2495, 58530, 57302, 51965, 42013, 40765, 35417, 25861, 20579, 19342, 9897, 4569, 3321, 58911, 53574, 52256, 42829, 37475, 36250, 30902, 21408, 20099, 11078, 15996, 286, 5246, 5209, 325, 15909, 11082, 16486, 32145, 27315, 34727, 48262, 43499, 50975, 64546, 59732, 1605, 13092, 10381, 17825, 29383, 28600, 3401, 6238, 10097, 12885, 22831, 25823, 29671, 40697, 42369, 45238, 56913, 58737, 61453, 7952, 10878, 12766, 23806, 27536, 30393, 40010, 43866, 46708, 56588, 59454};
        f3000 = 2881632701832566833L;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m5688(Class cls, List<String> list) {
        int i = f3004;
        f3001 = (i + 35) % 128;
        if (cls == null) {
            return false;
        }
        if (list == null) {
            return true;
        }
        f3001 = (i + 121) % 128;
        if (list.isEmpty()) {
            return true;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            int i2 = f3001 + 3;
            f3004 = i2 % 128;
            if (i2 % 2 != 0) {
                it.next().equals("");
                throw null;
            }
            String next = it.next();
            if (next.equals("") && (cls.getPackage() == null || cls.getPackage().getName().equals(""))) {
                return true;
            }
            if (!next.equals("") && cls.getName().startsWith(next)) {
                return true;
            }
        }
        String name = kg.class.getName();
        Object[] objArr = new Object[1];
        a(Color.green(0) + 24, 82 - (ViewConfiguration.getEdgeSlop() >> 16), (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        if (name.startsWith(((String) objArr[0]).intern())) {
            return false;
        }
        int i3 = f3004 + 39;
        f3001 = i3 % 128;
        if (i3 % 2 == 0) {
            kg.class.getPackage();
            throw null;
        }
        if (kg.class.getPackage() == null) {
            f3004 = (f3001 + 65) % 128;
            if (cls.getPackage() == null) {
                return true;
            }
        }
        return kg.class.getPackage() != null && kg.class.getPackage().equals(cls.getPackage());
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Object m5689(Class cls, List<Object> list) throws Exception {
        int i = f3001 + 53;
        f3004 = i % 128;
        Constructor m5697 = m5697(cls, (List) list);
        Object[] array = list.toArray();
        if (i % 2 != 0) {
            m5697.newInstance(array);
            throw null;
        }
        Object newInstance = m5697.newInstance(array);
        f3001 = (f3004 + 79) % 128;
        return newInstance;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Object m5690(Class cls, List<Object> list, Class... clsArr) throws Exception {
        int i = f3001 + 119;
        f3004 = i % 128;
        Constructor constructor = cls.getConstructor(clsArr);
        Object[] array = list.toArray();
        if (i % 2 != 0) {
            constructor.newInstance(array);
            throw null;
        }
        Object newInstance = constructor.newInstance(array);
        int i2 = f3001 + 123;
        f3004 = i2 % 128;
        if (i2 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return newInstance;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ Object m5691(Object[] objArr) {
        Constructor constructor = (Constructor) objArr[0];
        List list = (List) objArr[1];
        f3004 = (f3001 + 69) % 128;
        boolean m5693 = m5693(constructor.getParameterTypes(), list);
        int i = f3004 + 3;
        f3001 = i % 128;
        if (i % 2 != 0) {
            return Boolean.valueOf(m5693);
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Method m5692(Object obj, String str, List<Object> list) {
        return (Method) m5685(new Object[]{obj, str, list}, 1693927874, -1693927874, (int) System.currentTimeMillis());
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean m5693(Class[] clsArr, List list) {
        f3001 = (f3004 + 109) % 128;
        for (int i = 0; i < clsArr.length; i++) {
            int i2 = f3001 + 99;
            f3004 = i2 % 128;
            if (i2 % 2 != 0) {
                list.get(i);
                throw new ArithmeticException("divide by zero");
            }
            Object obj = list.get(i);
            Object obj2 = obj;
            if (obj == null) {
                if (!Object.class.isAssignableFrom(clsArr[i])) {
                    return false;
                }
                obj2 = obj;
            }
            if (obj2 != null && !m5699(clsArr[i], obj2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Field[] m5694(Field[] fieldArr, Field[] fieldArr2) {
        Field[] fieldArr3;
        int i = f3004 + 51;
        f3001 = i % 128;
        if (i % 2 == 0) {
            int length = fieldArr.length;
            int length2 = fieldArr2.length;
            Field[] fieldArr4 = new Field[length >>> length2];
            System.arraycopy(fieldArr, 0, fieldArr4, 0, length);
            System.arraycopy(fieldArr2, 0, fieldArr4, length, length2);
            fieldArr3 = fieldArr4;
        } else {
            int length3 = fieldArr.length;
            int length4 = fieldArr2.length;
            Field[] fieldArr5 = new Field[length3 + length4];
            System.arraycopy(fieldArr, 0, fieldArr5, 0, length3);
            System.arraycopy(fieldArr2, 0, fieldArr5, length3, length4);
            fieldArr3 = fieldArr5;
        }
        f3001 = (f3004 + 3) % 128;
        return fieldArr3;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Class m5695(String str, boolean z) {
        int i = f3004 + 65;
        f3001 = i % 128;
        try {
            if (i % 2 != 0) {
                return Class.forName(str);
            }
            Class.forName(str);
            throw null;
        } catch (Throwable th) {
            if (z) {
                int indexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int touchSlop = ViewConfiguration.getTouchSlop();
                Object[] objArr = new Object[1];
                a(14 - indexOf, touchSlop >> 8, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr);
                String intern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                int threadPriority = Process.getThreadPriority(0);
                int argb = Color.argb(0, 0, 0, 0);
                Object[] objArr2 = new Object[1];
                a(6 - ((threadPriority + 20) >> 6), 15 - argb, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append(str);
                int indexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0);
                int gidForName = Process.getGidForName("");
                Object[] objArr3 = new Object[1];
                a(9 - indexOf2, 20 - gidForName, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22105), objArr3);
                sb.append(((String) objArr3[0]).intern());
                cu.m4502(intern, sb.toString(), th);
            }
            f3004 = (f3001 + 7) % 128;
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static /* synthetic */ Object m5696(Object[] objArr) {
        Method m5698;
        Object obj = objArr[0];
        String str = (String) objArr[1];
        List list = (List) objArr[2];
        a aVar = new a(obj, str, (List) m5685(new Object[]{list}, -1505409267, 1505409268, (int) System.currentTimeMillis()));
        Method method = (Method) f3003.get(aVar);
        if (method != null) {
            int i = f3001 + 69;
            f3004 = i % 128;
            if (i % 2 != 0) {
                m5693(method.getParameterTypes(), list);
                throw new ArithmeticException("divide by zero");
            }
            if (m5693(method.getParameterTypes(), list)) {
                int i2 = f3004 + 7;
                f3001 = i2 % 128;
                if (i2 % 2 != 0) {
                    return method;
                }
                throw null;
            }
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getEdgeSlop() >> 16) + 15, TextUtils.indexOf((CharSequence) "", '0') + 1, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
            String intern = ((String) objArr2[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr3 = new Object[1];
            a(28 - TextUtils.indexOf("", "", 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 30, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31312), objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(aVar);
            cu.m4502(intern, sb.toString(), null);
            f3001 = (f3004 + 97) % 128;
        }
        if (obj instanceof Class) {
            Method m5686 = m5686((Class) obj, str, list, true);
            m5698 = m5686;
            if (m5686 == null) {
                f3001 = (f3004 + 87) % 128;
                m5698 = m5698(Class.class, str, list);
            }
        } else {
            m5698 = m5698(obj, str, list);
        }
        if (m5698 != null) {
            int i3 = f3004 + 31;
            f3001 = i3 % 128;
            if (i3 % 2 == 0) {
                f3003.put(aVar, m5698);
                throw new ArithmeticException("divide by zero");
            }
            f3003.put(aVar, m5698);
        }
        return m5698;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Constructor m5697(Class cls, List list) {
        f3004 = (f3001 + 121) % 128;
        for (Constructor<?> constructor : cls.getConstructors()) {
            if (constructor.getParameterTypes().length == list.size()) {
                int i = f3001 + 43;
                f3004 = i % 128;
                if (i % 2 != 0) {
                    m5684(constructor, list);
                    throw null;
                }
                if (m5684(constructor, list)) {
                    f3004 = (f3001 + 9) % 128;
                    return constructor;
                }
            }
        }
        return null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Method m5698(Object obj, String str, List list) {
        int i = f3001 + 91;
        f3004 = i % 128;
        Method m5686 = m5686(obj.getClass(), str, list, i % 2 != 0);
        f3001 = (f3004 + 63) % 128;
        return m5686;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m5699(Class cls, Object obj) {
        int i = f3001 + 119;
        f3004 = i % 128;
        if (i % 2 != 0) {
            obj.getClass();
            cls.isAssignableFrom(Byte.TYPE);
            throw new ArithmeticException("divide by zero");
        }
        Class<?> cls2 = obj.getClass();
        Class<?> cls3 = cls2;
        if (cls.isAssignableFrom(Byte.TYPE)) {
            cls3 = cls2;
            if (cls3.isAssignableFrom(Byte.class)) {
                return true;
            }
        }
        if (cls.isAssignableFrom(Short.TYPE) && cls3.isAssignableFrom(Short.class)) {
            return true;
        }
        if (!(!cls.isAssignableFrom(r0)) && cls3.isAssignableFrom(Byte.class)) {
            return true;
        }
        Class<?> cls4 = Integer.TYPE;
        if (cls.isAssignableFrom(cls4)) {
            int i2 = f3004 + 123;
            f3001 = i2 % 128;
            if (i2 % 2 == 0) {
                cls3.isAssignableFrom(Integer.class);
                throw null;
            }
            if (cls3.isAssignableFrom(Integer.class)) {
                return true;
            }
        }
        if (cls.isAssignableFrom(cls4) && cls3.isAssignableFrom(Short.class)) {
            return true;
        }
        if (cls.isAssignableFrom(cls4)) {
            f3001 = (f3004 + 103) % 128;
            if (cls3.isAssignableFrom(Byte.class)) {
                return true;
            }
        }
        Class<?> cls5 = Long.TYPE;
        if (cls.isAssignableFrom(cls5) && cls3.isAssignableFrom(Long.class)) {
            return true;
        }
        if (cls.isAssignableFrom(cls5) && cls3.isAssignableFrom(Integer.class)) {
            return true;
        }
        if (cls.isAssignableFrom(cls5) && cls3.isAssignableFrom(Short.class)) {
            return true;
        }
        if (cls.isAssignableFrom(cls5) && cls3.isAssignableFrom(Byte.class)) {
            return true;
        }
        Class<?> cls6 = Float.TYPE;
        if (cls.isAssignableFrom(cls6) && cls3.isAssignableFrom(Float.class)) {
            return true;
        }
        if (cls.isAssignableFrom(cls6)) {
            int i3 = f3004 + 59;
            f3001 = i3 % 128;
            if (i3 % 2 == 0) {
                cls3.isAssignableFrom(Long.class);
                throw null;
            }
            if (cls3.isAssignableFrom(Long.class)) {
                return true;
            }
        }
        if (cls.isAssignableFrom(cls6)) {
            int i4 = f3004 + 35;
            f3001 = i4 % 128;
            if (i4 % 2 == 0) {
                cls3.isAssignableFrom(Integer.class);
                throw new ArithmeticException("divide by zero");
            }
            if (cls3.isAssignableFrom(Integer.class)) {
                return true;
            }
        }
        if (cls.isAssignableFrom(cls6)) {
            f3004 = (f3001 + 79) % 128;
            if (cls3.isAssignableFrom(Short.class)) {
                return true;
            }
        }
        if (cls.isAssignableFrom(cls6)) {
            f3001 = (f3004 + 57) % 128;
            if (cls3.isAssignableFrom(Byte.class)) {
                return true;
            }
        }
        Class<?> cls7 = Double.TYPE;
        if (cls.isAssignableFrom(cls7)) {
            f3001 = (f3004 + 25) % 128;
            if (cls3.isAssignableFrom(Double.class)) {
                return true;
            }
        }
        if (cls.isAssignableFrom(cls7) && cls3.isAssignableFrom(Float.class)) {
            return true;
        }
        if (cls.isAssignableFrom(cls7) && cls3.isAssignableFrom(Long.class)) {
            return true;
        }
        if (cls.isAssignableFrom(cls7)) {
            int i5 = f3004 + 43;
            f3001 = i5 % 128;
            if (i5 % 2 == 0) {
                cls3.isAssignableFrom(Integer.class);
                throw new ArithmeticException("divide by zero");
            }
            if (cls3.isAssignableFrom(Integer.class)) {
                return true;
            }
        }
        if (!(!cls.isAssignableFrom(cls7)) && cls3.isAssignableFrom(Short.class)) {
            return true;
        }
        if (cls.isAssignableFrom(cls7) && cls3.isAssignableFrom(Byte.class)) {
            return true;
        }
        if (!(!cls.isAssignableFrom(Boolean.TYPE)) && cls3.isAssignableFrom(Boolean.class)) {
            return true;
        }
        if (!cls.isAssignableFrom(cls3)) {
            return false;
        }
        int i6 = f3004 + 53;
        f3001 = i6 % 128;
        return i6 % 2 != 0;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Method[] m5700(Method[] methodArr, Method[] methodArr2) {
        Method[] methodArr3;
        int i = f3004 + 123;
        f3001 = i % 128;
        if (i % 2 == 0) {
            int length = methodArr.length;
            int length2 = methodArr2.length;
            Method[] methodArr4 = new Method[length >> length2];
            System.arraycopy(methodArr, 1, methodArr4, 1, length);
            System.arraycopy(methodArr2, 0, methodArr4, length, length2);
            methodArr3 = methodArr4;
        } else {
            int length3 = methodArr.length;
            int length4 = methodArr2.length;
            Method[] methodArr5 = new Method[length3 + length4];
            System.arraycopy(methodArr, 0, methodArr5, 0, length3);
            System.arraycopy(methodArr2, 0, methodArr5, length3, length4);
            methodArr3 = methodArr5;
        }
        return methodArr3;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m5701(Method method, List list) {
        int i = f3004 + 121;
        f3001 = i % 128;
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (i % 2 == 0) {
            m5693(parameterTypes, list);
            throw new ArithmeticException("divide by zero");
        }
        boolean m5693 = m5693(parameterTypes, list);
        f3001 = (f3004 + 97) % 128;
        return m5693;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static Class[] m5702(List list) {
        f3001 = (f3004 + 63) % 128;
        Class[] clsArr = new Class[list.size()];
        int i = 0;
        while (i < list.size()) {
            int i2 = f3001 + 121;
            f3004 = i2 % 128;
            if (i2 % 2 != 0) {
                clsArr[i] = (Class) list.get(i);
                i += 99;
            } else {
                clsArr[i] = (Class) list.get(i);
                i++;
            }
        }
        return clsArr;
    }
}
