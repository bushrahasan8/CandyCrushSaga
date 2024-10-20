package com.ironsource.adqualitysdk.sdk.i;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: ih.class */
public final class ih {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2584 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2585;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2586;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static final String[] f2587;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private SQLiteDatabase f2588;

    /* renamed from: ｋ, reason: contains not printable characters */
    private b f2589;

    /* loaded from: ih$b.class */
    final class b extends SQLiteOpenHelper {
        private static int $10 = 0;
        private static int $11 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f2590 = 1;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static long f2591 = -7349541369517865299L;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f2592;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private ih f2593;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ih ihVar, Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
            this.f2593 = ihVar;
        }

        private static void a(String str, int i, Object[] objArr) {
            int i2 = ($11 + 81) % 128;
            $10 = i2;
            String str2 = str;
            if (str != null) {
                int i3 = i2 + 31;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    str.toCharArray();
                    throw new ArithmeticException("divide by zero");
                }
                str2 = str.toCharArray();
            }
            n nVar = new n();
            char[] m5750 = n.m5750(f2591 ^ (-7438370749274812225L), (char[]) str2, i);
            nVar.f3042 = 4;
            while (true) {
                int i4 = nVar.f3042;
                if (i4 >= m5750.length) {
                    objArr[0] = new String(m5750, 4, m5750.length - 4);
                    return;
                }
                $10 = ($11 + 125) % 128;
                int i5 = i4 - 4;
                nVar.f3041 = i5;
                long j = m5750[i4] ^ m5750[i4 % 4];
                long j2 = i5;
                long j3 = f2591;
                try {
                    Map map = com.ironsource.adqualitysdk.sdk.i.b.f452;
                    Object obj = map.get(983860882);
                    if (obj == null) {
                        Class cls = (Class) com.ironsource.adqualitysdk.sdk.i.b.m3371((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, (char) (Process.myTid() >> 22), TextUtils.getOffsetAfter("", 0) + 41);
                        Class<?> cls2 = Long.TYPE;
                        obj = cls.getMethod("p", cls2, cls2, cls2);
                        map.put(983860882, obj);
                    }
                    m5750[i4] = ((Character) ((Method) obj).invoke(null, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3))).charValue();
                    Object obj2 = map.get(-2082235053);
                    if (obj2 == null) {
                        obj2 = ((Class) com.ironsource.adqualitysdk.sdk.i.b.m3371(ViewConfiguration.getPressedStateDuration() >> 16, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), View.MeasureSpec.getSize(0) + 41)).getMethod("q", Object.class, Object.class);
                        map.put(-2082235053, obj2);
                    }
                    ((Method) obj2).invoke(null, nVar, nVar);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            int i = f2590 + 59;
            f2592 = i % 128;
            if (i % 2 != 0) {
                sQLiteDatabase.isReadOnly();
                throw new ArithmeticException("divide by zero");
            }
            if (!sQLiteDatabase.isReadOnly()) {
                Object[] objArr = new Object[1];
                a("營熏Ɉ鑭ᐈﾺ레뷋⧚汓အ斢선쒘䢼ക祠\u1cccꃎ듟ႚ甃ᤔ岣죹", ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr);
                sQLiteDatabase.execSQL(((String) objArr[0]).intern());
                f2592 = (f2590 + 101) % 128;
            }
            Object[] objArr2 = new Object[1];
            a("癦瘥\ue3d6⇂\uf596̕ඣ䅢\u2e7a跉ꖎ餿욷┶ﴺ\uf196纞ﵵᕸ䠻ᜈ钫곒ꁣ콋\u2cf4쐇\uf8d8枂쑇ᰶ傘Ῠ掃랭꽏둉㯶쿃\u074b沅팩朗律Ӣ歱뽮뙇뵞ʬ횬ฒ啋�渔曚෮爧虋뺒ꖺ৴↠ᕒ娲ꆼ秊派\uf2be礐酏", TextUtils.indexOf("", "", 0), objArr2);
            sQLiteDatabase.execSQL(((String) objArr2[0]).intern());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            int i3 = f2590 + 3;
            f2592 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    static {
        m5344();
        Object[] objArr = new Object[1];
        a(false, new int[]{17, 3, 0, 0}, "\u0001����", objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(false, new int[]{0, 3, 48, 2}, "\u0001\u0001��", objArr2);
        f2587 = new String[]{intern, ((String) objArr2[0]).intern()};
        int i = f2585 + 19;
        f2584 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    public ih(Context context, String str) {
        b bVar = new b(this, context, str);
        this.f2589 = bVar;
        this.f2588 = bVar.getWritableDatabase();
    }

    private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
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
        char[] cArr = f2586;
        char[] cArr2 = cArr;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                char c = cArr[i5];
                try {
                    Map map = com.ironsource.adqualitysdk.sdk.i.b.f452;
                    Object obj = map.get(123012079);
                    if (obj == null) {
                        obj = ((Class) com.ironsource.adqualitysdk.sdk.i.b.m3371(Process.myPid() >> 22, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.green(0) + 41)).getMethod("t", Integer.TYPE);
                        map.put(123012079, obj);
                    }
                    cArr3[i5] = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c))).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $10 = ($11 + 27) % 128;
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i2];
        char c2 = 0;
        System.arraycopy(cArr2, i, cArr4, 0, i2);
        char[] cArr5 = cArr4;
        if (bArr != null) {
            int i6 = $10 + 121;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr5 = new char[i2];
                jVar.f2705 = 0;
            } else {
                cArr5 = new char[i2];
                jVar.f2705 = 0;
                c2 = 0;
            }
            while (true) {
                int i7 = jVar.f2705;
                if (i7 >= i2) {
                    break;
                }
                $11 = ($10 + 31) % 128;
                if (bArr[i7] == 1) {
                    char c3 = cArr4[i7];
                    Map map2 = com.ironsource.adqualitysdk.sdk.i.b.f452;
                    Object obj2 = map2.get(-1475644584);
                    if (obj2 == null) {
                        Class cls = (Class) com.ironsource.adqualitysdk.sdk.i.b.m3371((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 40 - TextUtils.lastIndexOf("", '0', 0, 0));
                        Class<?> cls2 = Integer.TYPE;
                        obj2 = cls.getMethod("v", cls2, cls2);
                        map2.put(-1475644584, obj2);
                    }
                    cArr5[i7] = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c3), Integer.valueOf(c2))).charValue();
                } else {
                    char c4 = cArr4[i7];
                    Map map3 = com.ironsource.adqualitysdk.sdk.i.b.f452;
                    Object obj3 = map3.get(1186866459);
                    if (obj3 == null) {
                        Class cls3 = (Class) com.ironsource.adqualitysdk.sdk.i.b.m3371(MotionEvent.axisFromString("") + 1, (char) Drawable.resolveOpacity(0, 0), 42 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        Class<?> cls4 = Integer.TYPE;
                        obj3 = cls3.getMethod("y", cls4, cls4);
                        map3.put(1186866459, obj3);
                    }
                    cArr5[i7] = ((Character) ((Method) obj3).invoke(null, Integer.valueOf(c4), Integer.valueOf(c2))).charValue();
                }
                c2 = cArr5[jVar.f2705];
                Map map4 = com.ironsource.adqualitysdk.sdk.i.b.f452;
                Object obj4 = map4.get(-811294887);
                if (obj4 == null) {
                    obj4 = ((Class) com.ironsource.adqualitysdk.sdk.i.b.m3371(ViewConfiguration.getWindowTouchSlop() >> 8, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 41 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("w", Object.class, Object.class);
                    map4.put(-811294887, obj4);
                }
                ((Method) obj4).invoke(null, jVar, jVar);
            }
        }
        if (i4 > 0) {
            int i8 = $10 + 73;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                char[] cArr6 = new char[i2];
                System.arraycopy(cArr5, 1, cArr6, 1, i2);
                System.arraycopy(cArr6, 1, cArr5, i2 - i4, i4);
                System.arraycopy(cArr6, i4, cArr5, 0, i2 + i4);
            } else {
                char[] cArr7 = new char[i2];
                System.arraycopy(cArr5, 0, cArr7, 0, i2);
                int i9 = i2 - i4;
                System.arraycopy(cArr7, 0, cArr5, i9, i4);
                System.arraycopy(cArr7, i4, cArr5, 0, i9);
            }
        }
        char[] cArr8 = cArr5;
        if (!(!z)) {
            cArr8 = new char[i2];
            jVar.f2705 = 0;
            while (true) {
                int i10 = jVar.f2705;
                if (i10 >= i2) {
                    break;
                }
                cArr8[i10] = cArr5[(i2 - i10) - 1];
                jVar.f2705 = i10 + 1;
            }
            $10 = ($11 + 35) % 128;
        }
        if (i3 > 0) {
            int i11 = 0;
            while (true) {
                jVar.f2705 = i11;
                int i12 = jVar.f2705;
                if (i12 >= i2) {
                    break;
                }
                cArr8[i12] = (char) (cArr8[i12] - iArr[2]);
                i11 = i12 + 1;
            }
        }
        objArr[0] = new String(cArr8);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m5344() {
        f2586 = new char[]{37124, 37338, 37357, 37246, 37159, 37180, 37181, 37183, 37157, 37158, 37180, 37225, 37153, 37312, 37343, 37171, 37215, 37241, 37156, 37155, 37203, 37145, 37156, 37155, 37143, 37230, 37124, 37126, 37126, 37242, 37120, 37155, 37156, 37125, 37231, 37215, 37231, 37246, 37124, 37126, 37126, 37242, 37120, 37155, 37156, 37129, 37246, 37127, 37127, 37130, 37123, 37239, 37134, 37159, 37180, 37181, 37183, 37157, 37158, 37180, 37129, 37130, 37154, 37180, 37152, 37135, 37224, 37126, 37162, 37159, 37123, 37234, 37149, 37149, 37150, 37125, 37245, 37238, 37127, 37128, 37124, 37124, 37120, 37363, 37368, 37252, 37352, 37371, 37336, 37354, 37328, 37364, 37258, 37368, 37369, 37368, 37259, 37368, 37339, 37368, 37253, 37364, 37364, 37330, 37354, 37328, 37183, 37248, 37259, 37360};
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m5345(String str) {
        Cursor cursor;
        int columnIndexOrThrow;
        synchronized (this) {
            try {
                SQLiteDatabase sQLiteDatabase = this.f2588;
                Object[] objArr = new Object[1];
                a(true, new int[]{3, 8, 0, 0}, "\u0001\u0001\u0001\u0001\u0001��\u0001\u0001", objArr);
                String intern = ((String) objArr[0]).intern();
                String[] strArr = f2587;
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                a(false, new int[]{11, 5, 36, 1}, "\u0001��������", objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append(str);
                Object[] objArr3 = new Object[1];
                a(true, new int[]{16, 1, 0, 0}, "\u0001", objArr3);
                sb.append(((String) objArr3[0]).intern());
                cursor = sQLiteDatabase.query(intern, strArr, sb.toString(), null, null, null, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToNext()) {
                            int i = f2585 + 97;
                            f2584 = i % 128;
                            if (i % 2 == 0) {
                                Object[] objArr4 = new Object[1];
                                a(false, new int[]{0, 3, 48, 2}, "\u0001\u0001��", objArr4);
                                columnIndexOrThrow = cursor.getColumnIndexOrThrow(((String) objArr4[0]).intern());
                            } else {
                                Object[] objArr5 = new Object[1];
                                a(false, new int[]{0, 3, 48, 2}, "\u0001\u0001��", objArr5);
                                columnIndexOrThrow = cursor.getColumnIndexOrThrow(((String) objArr5[0]).intern());
                            }
                            String string = cursor.getString(columnIndexOrThrow);
                            cursor.close();
                            return string;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursor != null) {
                    int i2 = f2585 + 25;
                    f2584 = i2 % 128;
                    if (i2 % 2 == 0) {
                        cursor.close();
                        throw null;
                    }
                    cursor.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final HashMap<String, String> m5346(String str, int i) {
        Cursor cursor;
        Throwable th;
        String num;
        HashMap<String, String> hashMap;
        synchronized (this) {
            try {
                String replace = str.replace('*', '%');
                SQLiteDatabase sQLiteDatabase = this.f2588;
                Object[] objArr = new Object[1];
                a(true, new int[]{3, 8, 0, 0}, "\u0001\u0001\u0001\u0001\u0001��\u0001\u0001", objArr);
                String intern = ((String) objArr[0]).intern();
                String[] strArr = f2587;
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                a(true, new int[]{25, 10, 0, 8}, "\u0001����\u0001��\u0001������\u0001", objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append(replace);
                Object[] objArr3 = new Object[1];
                a(true, new int[]{16, 1, 0, 0}, "\u0001", objArr3);
                sb.append(((String) objArr3[0]).intern());
                String obj = sb.toString();
                if (i <= 0) {
                    num = null;
                } else {
                    num = Integer.toString(i);
                    f2585 = (f2584 + 31) % 128;
                }
                Cursor query = sQLiteDatabase.query(intern, strArr, obj, null, null, null, null, num);
                try {
                    hashMap = new HashMap<>();
                    while (query != null) {
                        f2584 = (f2585 + 87) % 128;
                        if (!query.moveToNext()) {
                            break;
                        }
                        f2585 = (f2584 + 55) % 128;
                        try {
                            Object[] objArr4 = new Object[1];
                            a(false, new int[]{0, 3, 48, 2}, "\u0001\u0001��", objArr4);
                            int columnIndexOrThrow = query.getColumnIndexOrThrow(((String) objArr4[0]).intern());
                            Object[] objArr5 = new Object[1];
                            a(false, new int[]{17, 3, 0, 0}, "\u0001����", objArr5);
                            hashMap.put(query.getString(query.getColumnIndexOrThrow(((String) objArr5[0]).intern())), query.getString(columnIndexOrThrow));
                        } catch (IllegalArgumentException e) {
                        }
                    }
                    if (query != null) {
                        int i2 = f2584 + 17;
                        f2585 = i2 % 128;
                        if (i2 % 2 != 0) {
                            query.close();
                            throw null;
                        }
                        query.close();
                    }
                    int i3 = f2584 + 67;
                    f2585 = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw new ArithmeticException("divide by zero");
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                cursor = null;
                th = th3;
            }
        }
        return hashMap;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m5347(String str, String str2) {
        synchronized (this) {
            ContentValues contentValues = new ContentValues();
            Object[] objArr = new Object[1];
            a(false, new int[]{0, 3, 48, 2}, "\u0001\u0001��", objArr);
            contentValues.put(((String) objArr[0]).intern(), str2);
            SQLiteDatabase sQLiteDatabase = this.f2588;
            Object[] objArr2 = new Object[1];
            a(true, new int[]{3, 8, 0, 0}, "\u0001\u0001\u0001\u0001\u0001��\u0001\u0001", objArr2);
            String intern = ((String) objArr2[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr3 = new Object[1];
            a(false, new int[]{11, 5, 36, 1}, "\u0001��������", objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(str);
            Object[] objArr4 = new Object[1];
            a(true, new int[]{16, 1, 0, 0}, "\u0001", objArr4);
            sb.append(((String) objArr4[0]).intern());
            if (sQLiteDatabase.update(intern, contentValues, sb.toString(), null) == 0) {
                f2584 = (f2585 + 75) % 128;
                Object[] objArr5 = new Object[1];
                a(false, new int[]{17, 3, 0, 0}, "\u0001����", objArr5);
                contentValues.put(((String) objArr5[0]).intern(), str);
                SQLiteDatabase sQLiteDatabase2 = this.f2588;
                Object[] objArr6 = new Object[1];
                a(true, new int[]{3, 8, 0, 0}, "\u0001\u0001\u0001\u0001\u0001��\u0001\u0001", objArr6);
                sQLiteDatabase2.replace(((String) objArr6[0]).intern(), null, contentValues);
                f2585 = (f2584 + 5) % 128;
            }
            int i = f2584 + 7;
            f2585 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m5348(String str) {
        synchronized (this) {
            int i = f2584 + 15;
            f2585 = i % 128;
            if (i % 2 != 0) {
                SQLiteDatabase sQLiteDatabase = this.f2588;
                Object[] objArr = new Object[1];
                a(false, new int[]{3, 8, 0, 0}, "\u0001\u0001\u0001\u0001\u0001��\u0001\u0001", objArr);
                String intern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                a(true, new int[]{20, 5, 0, 1}, "\u0001��������", objArr2);
                String intern2 = ((String) objArr2[0]).intern();
                String[] strArr = new String[1];
                strArr[1] = str;
                sQLiteDatabase.delete(intern, intern2, strArr);
            } else {
                SQLiteDatabase sQLiteDatabase2 = this.f2588;
                Object[] objArr3 = new Object[1];
                a(true, new int[]{3, 8, 0, 0}, "\u0001\u0001\u0001\u0001\u0001��\u0001\u0001", objArr3);
                String intern3 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                a(false, new int[]{20, 5, 0, 1}, "\u0001��������", objArr4);
                sQLiteDatabase2.delete(intern3, ((String) objArr4[0]).intern(), new String[]{str});
            }
            f2585 = (f2584 + 75) % 128;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int m5349(String str) {
        Cursor cursor;
        synchronized (this) {
            try {
                String replace = str.replace('*', '%');
                SQLiteDatabase sQLiteDatabase = this.f2588;
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                a(true, new int[]{35, 48, 0, 0}, "\u0001\u0001\u0001����\u0001��\u0001����\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001��\u0001\u0001\u0001\u0001��\u0001����\u0001\u0001\u0001\u0001������\u0001����\u0001��\u0001��\u0001\u0001��", objArr);
                sb.append(((String) objArr[0]).intern());
                sb.append(replace);
                Object[] objArr2 = new Object[1];
                a(true, new int[]{16, 1, 0, 0}, "\u0001", objArr2);
                sb.append(((String) objArr2[0]).intern());
                cursor = sQLiteDatabase.rawQuery(sb.toString(), null);
                if (cursor != null) {
                    try {
                        if (!(!cursor.moveToFirst())) {
                            int i = cursor.getInt(0);
                            int i2 = f2585 + 107;
                            f2584 = i2 % 128;
                            if (i2 % 2 != 0) {
                                cursor.close();
                                return i;
                            }
                            cursor.close();
                            throw null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursor != null) {
                    int i3 = f2585 + 123;
                    f2584 = i3 % 128;
                    if (i3 % 2 == 0) {
                        cursor.close();
                        throw new ArithmeticException("divide by zero");
                    }
                    cursor.close();
                }
                return 0;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
            }
        }
    }
}
