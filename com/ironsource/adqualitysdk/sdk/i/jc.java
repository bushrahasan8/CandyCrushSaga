package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: jc.class */
public final class jc {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2753 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2754;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private JSONObject f2757;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f2758;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean f2759;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2756 = {3418, 10117, 22745, 36126, 42606, 55435, 3550, 9739, 31495, 20935, 11931, 64342};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2755 = -1620054875459934230L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public jc(JSONObject jSONObject) {
        this(jSONObject, false, UUID.randomUUID().toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public jc(JSONObject jSONObject, boolean z, String str) {
        this.f2757 = jSONObject;
        this.f2759 = z;
        this.f2758 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0430  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r8, int r9, char r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jc.a(int, int, char, java.lang.Object[]):void");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject m5477() {
        int i = f2754 + 21;
        f2753 = i % 128;
        if (i % 2 != 0) {
            return this.f2757;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m5478() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int indexOf = TextUtils.indexOf((CharSequence) "", '0', 0);
        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
        Object[] objArr = new Object[1];
        a(7 - indexOf, packedPositionChild + 1, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr);
        jSONObject.put(((String) objArr[0]).intern(), this.f2757);
        long zoomControlsTimeout = ViewConfiguration.getZoomControlsTimeout();
        int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay();
        Object[] objArr2 = new Object[1];
        a(5 - (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)), 8 - (scrollDefaultDelay >> 16), (char) (ExpandableListView.getPackedPositionGroup(0L) + 30296), objArr2);
        jSONObject.put(((String) objArr2[0]).intern(), this.f2758);
        int i = f2753 + 109;
        f2754 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return jSONObject;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m5479() {
        int i = f2753;
        String str = this.f2758;
        int i2 = i + 109;
        f2754 = i2 % 128;
        if (i2 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return str;
    }
}
