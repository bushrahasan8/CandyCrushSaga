package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fyber.Fyber;
import com.fyber.ads.internal.Offer;
import com.fyber.ads.ofw.OfferWallActivity;
import java.util.HashMap;
import java.util.Map;

/* loaded from: bt.class */
public final class bt extends bm {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1005;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1006 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f1007 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1008 = 1;

    static {
        m3874();
        ViewConfiguration.getJumpTapTimeout();
        SystemClock.uptimeMillis();
        View.MeasureSpec.getMode(0);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        Process.myTid();
        TextUtils.indexOf("", "", 0, 0);
        MotionEvent.axisFromString("");
        Process.myPid();
        int i = f1008 + 123;
        f1006 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    public bt(String str) {
        super(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x020b, code lost:
    
        if (r0 == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0239, code lost:
    
        r0[r0] = (char) (r0.f3059 - r7);
        r0[r0 + 1] = (char) (r0.f3055 - r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0258, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.b.f452;
        r20 = r0.get(-707600991);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x026d, code lost:
    
        if (r20 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0273, code lost:
    
        r0 = (java.lang.Class) com.ironsource.adqualitysdk.sdk.i.b.m3371((android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) - 1, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 41);
        r0 = java.lang.Integer.TYPE;
        r20 = r0.getMethod("o", java.lang.Object.class, java.lang.Object.class, r0, java.lang.Object.class, java.lang.Object.class, r0, java.lang.Object.class, java.lang.Object.class, r0, java.lang.Object.class, java.lang.Object.class, r0, java.lang.Object.class);
        r0.put(-707600991, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02fd, code lost:
    
        r0 = ((java.lang.Integer) ((java.lang.reflect.Method) r20).invoke(null, r0, r0, java.lang.Integer.valueOf(r0), r0, r0, java.lang.Integer.valueOf(r0), r0, r0, java.lang.Integer.valueOf(r0), r0, r0, java.lang.Integer.valueOf(r0), r0)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0367, code lost:
    
        r0 = r0.f3054;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0370, code lost:
    
        if (r0 != r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0373, code lost:
    
        r20 = r0.get(1018245111);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0383, code lost:
    
        if (r20 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0389, code lost:
    
        r0 = (java.lang.Class) com.ironsource.adqualitysdk.sdk.i.b.m3371(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.view.MotionEvent.axisFromString("") + 42);
        r0 = java.lang.Integer.TYPE;
        r20 = r0.getMethod("l", java.lang.Object.class, java.lang.Object.class, r0, r0, java.lang.Object.class, java.lang.Object.class, r0, r0, java.lang.Object.class, r0, java.lang.Object.class);
        r0.put(1018245111, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0406, code lost:
    
        r0 = ((java.lang.Integer) ((java.lang.reflect.Method) r20).invoke(null, r0, r0, java.lang.Integer.valueOf(r0), java.lang.Integer.valueOf(r0), r0, r0, java.lang.Integer.valueOf(r0), java.lang.Integer.valueOf(r0), r0, java.lang.Integer.valueOf(r0), r0)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0467, code lost:
    
        r0 = r0.f3057;
        r0 = r0.f3054;
        r0 = r0.f3058;
        r0[r0] = r8[r0];
        r0[r0 + 1] = r8[(r0 * r0) + r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0497, code lost:
    
        r0 = r0.f3056;
        r0 = r0.f3057;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x04a9, code lost:
    
        if (r0 != r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x04ac, code lost:
    
        r0 = ((r0.f3053 + r0) - 1) % r0;
        r0.f3053 = r0;
        r0 = ((r0 + r0) - 1) % r0;
        r0.f3054 = r0;
        r0 = r0.f3058;
        r0[r0] = r8[(r0 * r0) + r0];
        r0[r0 + 1] = r8[(r0 * r0) + r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x04ff, code lost:
    
        r0 = r0.f3053;
        r0 = r0.f3058;
        r0[r0] = r8[(r0 * r0) + r0];
        r0[r0 + 1] = r8[(r0 * r0) + r0];
        com.ironsource.adqualitysdk.sdk.i.bt.$10 = (com.ironsource.adqualitysdk.sdk.i.bt.$11 + 17) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0236, code lost:
    
        if (r0 == r0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r7, java.lang.String r8, int r9, java.lang.Object[] r10) {
        /*
            Method dump skipped, instructions count: 1418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bt.a(byte, java.lang.String, int, java.lang.Object[]):void");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m3874() {
        f1007 = (char) 44291;
        f1005 = new char[]{39115, 39113, 39090, 39126, 39166, 39152, 39162, 39123, 39161, 39144, 39153, 39112, 39130, 39155, 39157, 39165, 39141, 39127, 39147, 39167, 39150, 39160, 39146, 39133, 39151};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Class mo3627(String str) {
        boolean z = 5;
        switch (str.hashCode()) {
            case -2030618966:
                Object[] objArr = new Object[1];
                a((byte) (50 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "\u0012\u000e\f��\u000b\u0015\u0003\t\u0016��\u0010\u0014\u0016\u0004\u000b\b\u0011\u0003\b\u0007\u0007\t��\u0005\u0014\n\b\u0014\u0018\u000e\f\u0018\u0013\u000e㘖", 35 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
                if (str.equals(((String) objArr[0]).intern())) {
                    int i = f1008 + 87;
                    f1006 = i % 128;
                    if (i % 2 == 0) {
                        z = 2;
                        break;
                    }
                }
                z = -1;
                break;
            case 68348604:
                Object[] objArr2 = new Object[1];
                a((byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 100), "\u000b\u0011\u0003\t㙍", 4 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
                if (str.equals(((String) objArr2[0]).intern())) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case 76098108:
                Object[] objArr3 = new Object[1];
                a((byte) (Color.alpha(0) + 121), "\b\u0007\u0007\t㙡", 5 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr3);
                if (str.equals(((String) objArr3[0]).intern())) {
                    f1008 = (f1006 + 79) % 128;
                    z = 3;
                    break;
                }
                z = -1;
                break;
            case 701989717:
                Object[] objArr4 = new Object[1];
                a((byte) (Process.getGidForName("") + 71), "\b\u0007\u0007\t��\u0005\u0014\n\b\u0014\u0018\u000e\f\u0018\u0013\u000e㘩", View.getDefaultSize(0, 0) + 17, objArr4);
                if (str.equals(((String) objArr4[0]).intern())) {
                    f1006 = (f1008 + 59) % 128;
                    z = true;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        if (!z) {
            return Fyber.class;
        }
        if (z || z == 2) {
            return OfferWallActivity.class;
        }
        if (z != 3) {
            return null;
        }
        return Offer.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Map mo3628() {
        HashMap hashMap = new HashMap();
        f1008 = (f1006 + 87) % 128;
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾒ */
    public final String mo3629() {
        int i = f1008 + 53;
        f1006 = i % 128;
        if (i % 2 == 0) {
            return Fyber.RELEASE_VERSION_STRING;
        }
        String str = Fyber.RELEASE_VERSION_STRING;
        throw new ArithmeticException("divide by zero");
    }
}
