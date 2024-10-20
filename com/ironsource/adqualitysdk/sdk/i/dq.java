package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: dq.class */
public final class dq {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﮐ */
    private static long f1855 = 0;

    /* renamed from: ﱟ */
    private static int f1856 = 0;

    /* renamed from: ﱡ */
    private static int f1857 = 1;

    /* renamed from: ﺙ */
    private String f1858;

    /* renamed from: ﻐ */
    private String f1859;

    /* renamed from: ﻛ */
    private List f1860;

    /* renamed from: ｋ */
    private ISAdQualityAdType f1861;

    /* renamed from: ﾇ */
    private JSONObject f1862;

    /* renamed from: ﾒ */
    private String f1863;

    static {
        m4803();
        PointF.length(0.0f, 0.0f);
        ViewConfiguration.getScrollBarFadeDuration();
        SystemClock.uptimeMillis();
        AudioTrack.getMaxVolume();
        ExpandableListView.getPackedPositionType(0L);
        TextUtils.indexOf("", "", 0, 0);
        int i = f1856 + 81;
        f1857 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public dq(JSONObject jSONObject) {
        this.f1861 = ISAdQualityAdType.UNKNOWN;
        Object[] objArr = new Object[1];
        a("楾䘎㞀\ue718", (ViewConfiguration.getEdgeSlop() >> 16) + 12157, objArr);
        this.f1859 = dv.m4842(jSONObject.optString(((String) objArr[0]).intern()));
        Object[] objArr2 = new Object[1];
        a("楫㳫쉔槼㽮싶", 21892 - TextUtils.lastIndexOf("", '0'), objArr2);
        String m4842 = dv.m4842(jSONObject.optString(((String) objArr2[0]).intern()));
        if (!TextUtils.isEmpty(m4842)) {
            this.f1861 = ISAdQualityAdType.fromInt(Integer.parseInt(m4842));
        }
        Object[] objArr3 = new Object[1];
        a("楺⁜ﬖ닎䶻ݪ", 18743 - View.MeasureSpec.getMode(0), objArr3);
        this.f1862 = jSONObject.optJSONObject(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        a("楫솔㢄鎔쪈▒鲐\uf788⺇馜", 43261 - Color.alpha(0), objArr4);
        this.f1860 = (List) ki.m5721(new Object[]{jSONObject, ((String) objArr4[0]).intern(), new ArrayList()}, 1333401136, -1333401136, (int) System.currentTimeMillis());
        Object[] objArr5 = new Object[1];
        a("楼℈惡뀼䣠ʹ�鎓⨷\ue2bb", (ViewConfiguration.getTapTimeout() >> 16) + 18539, objArr5);
        this.f1863 = dv.m4842(jSONObject.optString(((String) objArr5[0]).intern()));
        Object[] objArr6 = new Object[1];
        a("楽﮺䳂턣∷띆ᦃ檪￥䀒픬♙袓ᶩ", Gravity.getAbsoluteGravity(0, 0) + 37589, objArr6);
        this.f1858 = dv.m4842(jSONObject.optString(((String) objArr6[0]).intern()));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x031b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r9, int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dq.a(java.lang.String, int, java.lang.Object[]):void");
    }

    /* renamed from: ﱟ */
    static void m4803() {
        f1855 = -8009324979386135836L;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ Object m4804(Object[] objArr, int i, int i2, int i3) {
        dq dqVar = (dq) objArr[0];
        int i4 = f1857;
        f1856 = (i4 + 63) % 128;
        List list = dqVar.f1860;
        f1856 = (i4 + 43) % 128;
        return list;
    }

    /* renamed from: ﻏ */
    public final String m4805() {
        int i = f1856;
        String str = this.f1858;
        int i2 = i + 27;
        f1857 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return str;
    }

    /* renamed from: ﻐ */
    public final ISAdQualityAdType m4806() {
        int i = f1857 + 23;
        f1856 = i % 128;
        if (i % 2 == 0) {
            return this.f1861;
        }
        ISAdQualityAdType iSAdQualityAdType = this.f1861;
        throw new ArithmeticException("divide by zero");
    }

    /* renamed from: ﻛ */
    public final JSONObject m4807() {
        int i = f1857;
        int i2 = i + 83;
        f1856 = i2 % 128;
        if (i2 % 2 != 0) {
            JSONObject jSONObject = this.f1862;
            throw new ArithmeticException("divide by zero");
        }
        JSONObject jSONObject2 = this.f1862;
        int i3 = i + 97;
        f1856 = i3 % 128;
        if (i3 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return jSONObject2;
    }

    /* renamed from: ｋ */
    public final String m4808() {
        int i = f1856;
        int i2 = i + 59;
        f1857 = i2 % 128;
        if (i2 % 2 == 0) {
            String str = this.f1863;
            throw new ArithmeticException("divide by zero");
        }
        String str2 = this.f1863;
        int i3 = i + 119;
        f1857 = i3 % 128;
        if (i3 % 2 != 0) {
            return str2;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public final List<String> m4809() {
        return (List) m4804(new Object[]{this}, 1057112624, -1057112624, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    /* renamed from: ﾒ */
    public final String m4810() {
        int i = f1857 + 75;
        f1856 = i % 128;
        if (i % 2 == 0) {
            return this.f1859;
        }
        throw null;
    }
}
