package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: an.class */
public final class an implements Comparable<an> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f340 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f341 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f342 = -5687612666010623953L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private jc f343;

    public an(jc jcVar) {
        this.f343 = jcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r9, int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.an.a(java.lang.String, int, java.lang.Object[]):void");
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String m3249() {
        f341 = (f340 + 59) % 128;
        String m5479 = this.f343.m5479();
        int i = f340 + 43;
        f341 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m5479;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private long m3250() {
        JSONObject m3262;
        Object obj;
        int i = f340 + 55;
        f341 = i % 128;
        if (i % 2 != 0) {
            m3262 = m3262();
            Object[] objArr = new Object[1];
            a("ε툵", (ExpandableListView.getPackedPositionForGroup(1) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 0L ? 0 : -1)) + 53639, objArr);
            obj = objArr[0];
        } else {
            m3262 = m3262();
            Object[] objArr2 = new Object[1];
            a("ε툵", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 53639, objArr2);
            obj = objArr2[0];
        }
        long optLong = m3262.optLong(((String) obj).intern());
        int i2 = f341 + 1;
        f340 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return optLong;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private int m3251(an anVar) {
        long m3250 = m3250();
        long m32502 = anVar.m3250();
        if (m3250 >= m32502) {
            if (m3250 == m32502) {
                return m3254(anVar);
            }
            return 1;
        }
        int i = f340;
        int i2 = i + 19;
        f341 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        f341 = (i + 51) % 128;
        return -1;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static /* synthetic */ Object m3252(Object[] objArr) {
        an anVar = (an) objArr[0];
        f340 = (f341 + 123) % 128;
        JSONObject m3262 = anVar.m3262();
        Object[] objArr2 = new Object[1];
        a("Τ婌", 23011 - Color.red(0), objArr2);
        long optInt = m3262.optInt(((String) objArr2[0]).intern());
        int i = f340 + 63;
        f341 = i % 128;
        if (i % 2 == 0) {
            return Long.valueOf(optInt);
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ Object m3253(Object[] objArr) {
        JSONObject m3262;
        String str;
        an anVar = (an) objArr[0];
        String str2 = (String) objArr[1];
        int i = f340 + 73;
        f341 = i % 128;
        try {
            if (i % 2 != 0) {
                m3262 = anVar.m3262();
                Object[] objArr2 = new Object[1];
                a("δ築\uf367", 18358 >> View.combineMeasuredStates(0, 1), objArr2);
                str = (String) objArr2[0];
            } else {
                m3262 = anVar.m3262();
                Object[] objArr3 = new Object[1];
                a("δ築\uf367", 30817 - View.combineMeasuredStates(0, 0), objArr3);
                str = (String) objArr3[0];
            }
            m3262.put(str.intern(), str2);
            return null;
        } catch (JSONException e) {
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private int m3254(an anVar) {
        long longValue = ((Long) m3255(new Object[]{this}, 764565726, -764565726, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue())).longValue();
        long longValue2 = ((Long) m3255(new Object[]{anVar}, 764565726, -764565726, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, anVar)).intValue())).longValue();
        if (longValue >= longValue2) {
            if (longValue != longValue2) {
                return 1;
            }
            f340 = (f341 + 53) % 128;
            return 0;
        }
        int i = f341 + 45;
        f340 = i % 128;
        if (i % 2 != 0) {
            return -1;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Object m3255(Object[] objArr, int i, int i2, int i3) {
        int i4 = i ^ (-1);
        int i5 = i2 ^ (-1);
        return ((((i * 567) + (i2 * (-565))) + ((((i4 | i2) ^ (-1)) | ((i4 | i3) ^ (-1))) * (-566))) + (((i | i5) ^ (-1)) * 566)) + ((((i4 | i5) | i3) ^ (-1)) * 566) != 1 ? m3252(objArr) : m3253(objArr);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static List m3256() {
        int i = f341 + 27;
        f340 = i % 128;
        return i % 2 == 0 ? Arrays.asList(ig.f2546) : Arrays.asList(ig.f2546);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(an anVar) {
        f340 = (f341 + 81) % 128;
        int m3251 = m3251(anVar);
        f340 = (f341 + 113) % 128;
        return m3251;
    }

    public final boolean equals(Object obj) {
        int i = f341 + 115;
        f340 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || an.class != obj.getClass()) {
            return false;
        }
        boolean equals = m3249().equals(((an) obj).m3249());
        f340 = (f341 + 99) % 128;
        return equals;
    }

    public final int hashCode() {
        int i = f340 + 45;
        f341 = i % 128;
        if (i % 2 != 0) {
            m3262();
            throw new ArithmeticException("divide by zero");
        }
        if (m3262() != null) {
            return m3262().hashCode();
        }
        f340 = (f341 + 69) % 128;
        return 0;
    }

    public final String toString() {
        f340 = (f341 + 103) % 128;
        String jSONObject = m3262().toString();
        int i = f341 + 111;
        f340 = i % 128;
        if (i % 2 != 0) {
            return jSONObject;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m3257() {
        JSONObject m3262;
        Object obj;
        int i = f341 + 23;
        f340 = i % 128;
        if (i % 2 == 0) {
            m3262 = m3262();
            Object[] objArr = new Object[1];
            a("α㏜捄鋼", 1008 >>> (ViewConfiguration.getMaximumFlingVelocity() + 73), objArr);
            obj = objArr[0];
        } else {
            m3262 = m3262();
            Object[] objArr2 = new Object[1];
            a("α㏜捄鋼", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12401, objArr2);
            obj = objArr2[0];
        }
        return m3262.optString(((String) obj).intern());
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m3258(int i) {
        synchronized (this) {
            f341 = (f340 + 97) % 128;
            if (this.f343.m5477() != null) {
                ki.m5728(this.f343.m5477(), i, (List<String>) m3256());
                f340 = (f341 + 39) % 128;
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final jc m3259() {
        int i = f340 + 67;
        f341 = i % 128;
        if (i % 2 == 0) {
            return this.f343;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m3260(String str) {
        m3255(new Object[]{this, str}, -51711761, 51711762, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m3261() {
        JSONObject m3262;
        Object obj;
        int i = f340 + 89;
        f341 = i % 128;
        if (i % 2 != 0) {
            m3262 = m3262();
            Object[] objArr = new Object[1];
            a("δ築\uf367", ViewConfiguration.getMaximumDrawingCacheSize() * 530656, objArr);
            obj = objArr[0];
        } else {
            m3262 = m3262();
            Object[] objArr2 = new Object[1];
            a("δ築\uf367", 30817 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
            obj = objArr2[0];
        }
        return m3262.optString(((String) obj).intern(), null);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final JSONObject m3262() {
        JSONObject m5477;
        synchronized (this) {
            int i = f340 + 73;
            f341 = i % 128;
            if (i % 2 != 0) {
                this.f343.m5477();
                throw new ArithmeticException("divide by zero");
            }
            m5477 = this.f343.m5477();
            int i2 = f341 + 31;
            f340 = i2 % 128;
            if (i2 % 2 == 0) {
                throw new ArithmeticException("divide by zero");
            }
        }
        return m5477;
    }
}
