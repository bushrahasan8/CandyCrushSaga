package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdController;
import com.amazon.aps.ads.ApsAdRequest;
import com.amazon.aps.ads.ApsAdView;
import com.amazon.aps.ads.activity.ApsAdActivity;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.listeners.ApsAdRequestListener;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.model.ApsAdType;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.AdType;
import com.amazon.device.ads.DTBActivity;
import com.amazon.device.ads.DTBAdActivity;
import com.amazon.device.ads.DTBAdBannerListener;
import com.amazon.device.ads.DTBAdBaseBannerListener;
import com.amazon.device.ads.DTBAdBaseInterstitialListener;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdExpandedListener;
import com.amazon.device.ads.DTBAdInterstitial;
import com.amazon.device.ads.DTBAdInterstitialListener;
import com.amazon.device.ads.DTBAdListener;
import com.amazon.device.ads.DTBAdLoader;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DTBAdView;
import com.amazon.device.ads.DTBAdViewSupportClient;
import com.amazon.device.ads.DTBFetchFactory;
import com.amazon.device.ads.DTBFetchManager;
import com.amazon.device.ads.DTBInterstitialActivity;
import com.amazon.device.ads.DTBRenderer;
import com.ironsource.adqualitysdk.sdk.i.bm;
import com.ironsource.h4;
import com.ironsource.m4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.u2;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: bl.class */
public final class bl extends bm {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f839;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f840 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f841 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f842 = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: bl$a.class */
    public class a extends ThreadPoolExecutor implements hg {
        private static int $10 = 0;
        private static int $11 = 1;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f866 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f867;

        /* renamed from: ｋ, reason: contains not printable characters */
        private cp f870;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private bl f871;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static char[] f869 = {23775, 18445, 30022, 25279, 4094, 15164, 8294, 52643, 64196, 58909, 37744, 47234, 42441, 20745, 32346, 27540, 4270, 15777, 10534, 54911, 50110, 59644, 37926, 33123, 44686};

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static long f868 = -7246442755794658834L;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(com.ironsource.adqualitysdk.sdk.i.bl r9, java.util.concurrent.ThreadPoolExecutor r10, com.ironsource.adqualitysdk.sdk.i.cp r11) {
            /*
                r8 = this;
                r0 = r8
                r1 = r9
                r0.f871 = r1
                r0 = r10
                int r0 = r0.getCorePoolSize()
                r13 = r0
                r0 = r10
                int r0 = r0.getMaximumPoolSize()
                r12 = r0
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                r9 = r0
                r0 = r8
                r1 = r13
                r2 = r12
                r3 = r10
                r4 = r9
                long r3 = r3.getKeepAliveTime(r4)
                r4 = r9
                r5 = r10
                java.util.concurrent.BlockingQueue r5 = r5.getQueue()
                r0.<init>(r1, r2, r3, r4, r5)
                r0 = r8
                r1 = r11
                r0.f870 = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bl.a.<init>(com.ironsource.adqualitysdk.sdk.i.bl, java.util.concurrent.ThreadPoolExecutor, com.ironsource.adqualitysdk.sdk.i.cp):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x01ff, code lost:
        
            r0[r0] = (char) r0[r0];
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0209, code lost:
        
            r0 = com.ironsource.adqualitysdk.sdk.i.b.f452;
            r11 = r0.get(518145355);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x021c, code lost:
        
            if (r11 == null) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0222, code lost:
        
            r11 = ((java.lang.Class) com.ironsource.adqualitysdk.sdk.i.b.m3371(android.text.TextUtils.getOffsetBefore("", 0), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 42)).getMethod("i", java.lang.Object.class, java.lang.Object.class);
            r0.put(518145355, r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0264, code lost:
        
            ((java.lang.reflect.Method) r11).invoke(null, r0, r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x027b, code lost:
        
            throw null;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0306  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0309  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(int r8, int r9, char r10, java.lang.Object[] r11) {
            /*
                Method dump skipped, instructions count: 792
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bl.a.a(int, int, char, java.lang.Object[]):void");
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private ThreadPoolExecutor m3705() {
            f866 = (f867 + 121) % 128;
            return this;
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f867 = (f866 + 51) % 128;
            bl blVar = this.f871;
            cp cpVar = this.f870;
            Object[] objArr = new Object[1];
            a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 24, (-1) - TextUtils.lastIndexOf("", '0'), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 20897), objArr);
            blVar.m3723(this, cpVar, ((String) objArr[0]).intern(), runnable);
            super.execute(runnable);
            int i = f867 + 85;
            f866 = i % 128;
            if (i % 2 == 0) {
                throw new ArithmeticException("divide by zero");
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* renamed from: ﻛ */
        public final /* synthetic */ Object mo3633() {
            int i = f867 + 11;
            f866 = i % 128;
            if (i % 2 != 0) {
                return m3705();
            }
            m3705();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: bl$e.class */
    public class e extends HashMap implements hg {
        private static int $10 = 0;
        private static int $11 = 1;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int[] f872 = {1838055250, -1245901127, -719508244, 891180839, 416170205, 1122757140, 181647229, 2004877864, 488451049, -97963389, 1837939589, -937713581, -207872142, 305836053, 826690200, 1482579090, -1396762414, 653105858};

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f873 = 0;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f874 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private bl f875;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private cp f876;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(bl blVar, HashMap<String, DTBFetchManager> hashMap, cp cpVar) {
            super(hashMap);
            this.f875 = blVar;
            this.f876 = cpVar;
        }

        private static void a(int[] iArr, int i, Object[] objArr) {
            int[] iArr2;
            int length;
            m mVar = new m();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = f872;
            int[] iArr4 = iArr3;
            if (iArr3 != null) {
                int length2 = iArr3.length;
                int[] iArr5 = new int[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    int i3 = iArr3[i2];
                    try {
                        Map map = b.f452;
                        Object obj = map.get(122833333);
                        if (obj == null) {
                            obj = ((Class) b.m3371(TextUtils.indexOf("", ""), (char) (Process.myTid() >> 22), 41 - Color.red(0))).getMethod(m4.p, Integer.TYPE);
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
            int length3 = iArr4.length;
            int[] iArr6 = new int[length3];
            int[] iArr7 = f872;
            if (iArr7 != null) {
                int i4 = $11 + 31;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    length = iArr7.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr7.length;
                    iArr2 = new int[length];
                }
                for (int i5 = 0; i5 < length; i5++) {
                    int i6 = iArr7[i5];
                    Map map2 = b.f452;
                    Object obj2 = map2.get(122833333);
                    if (obj2 == null) {
                        obj2 = ((Class) b.m3371(KeyEvent.normalizeMetaState(0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0') + 42)).getMethod(m4.p, Integer.TYPE);
                        map2.put(122833333, obj2);
                    }
                    iArr2[i5] = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i6))).intValue();
                }
            } else {
                iArr2 = iArr7;
            }
            System.arraycopy(iArr2, 0, iArr6, 0, length3);
            mVar.f3040 = 0;
            while (true) {
                int i7 = mVar.f3040;
                if (i7 >= iArr.length) {
                    objArr[0] = new String(cArr2, 0, i);
                    return;
                }
                int i8 = iArr[i7];
                char c = (char) (i8 >> 16);
                cArr[0] = c;
                char c2 = (char) i8;
                cArr[1] = c2;
                char c3 = (char) (iArr[i7 + 1] >> 16);
                cArr[2] = c3;
                char c4 = (char) iArr[i7 + 1];
                cArr[3] = c4;
                mVar.f3039 = (c << 16) + c2;
                mVar.f3038 = (c3 << 16) + c4;
                m.m5748(iArr6);
                $11 = ($10 + 73) % 128;
                for (int i9 = 0; i9 < 16; i9++) {
                    int i10 = mVar.f3039 ^ iArr6[i9];
                    mVar.f3039 = i10;
                    int m5749 = m.m5749(i10);
                    Map map3 = b.f452;
                    Object obj3 = map3.get(10695560);
                    if (obj3 == null) {
                        obj3 = ((Class) b.m3371(ExpandableListView.getPackedPositionGroup(0L), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 41 - TextUtils.indexOf("", "", 0))).getMethod("k", Object.class, Integer.TYPE, Object.class, Object.class);
                        map3.put(10695560, obj3);
                    }
                    int intValue = ((Integer) ((Method) obj3).invoke(null, mVar, Integer.valueOf(m5749), mVar, mVar)).intValue();
                    mVar.f3039 = mVar.f3038;
                    mVar.f3038 = intValue;
                }
                int i11 = mVar.f3039;
                int i12 = mVar.f3038;
                mVar.f3039 = i12;
                mVar.f3038 = i11;
                int i13 = i11 ^ iArr6[16];
                mVar.f3038 = i13;
                int i14 = i12 ^ iArr6[17];
                mVar.f3039 = i14;
                cArr[0] = (char) (i14 >>> 16);
                cArr[1] = (char) i14;
                cArr[2] = (char) (i13 >>> 16);
                cArr[3] = (char) i13;
                m.m5748(iArr6);
                int i15 = mVar.f3040;
                cArr2[i15 * 2] = cArr[0];
                cArr2[(i15 * 2) + 1] = cArr[1];
                cArr2[(i15 * 2) + 2] = cArr[2];
                cArr2[(i15 * 2) + 3] = cArr[3];
                Map map4 = b.f452;
                Object obj4 = map4.get(1365438799);
                if (obj4 == null) {
                    obj4 = ((Class) b.m3371(Color.blue(0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 41 - (KeyEvent.getMaxKeyCode() >> 16))).getMethod("m", Object.class, Object.class);
                    map4.put(1365438799, obj4);
                }
                ((Method) obj4).invoke(null, mVar, mVar);
            }
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private DTBFetchManager m3707(String str, DTBFetchManager dTBFetchManager) {
            f874 = (f873 + 87) % 128;
            bl blVar = this.f875;
            cp cpVar = this.f876;
            Object[] objArr = new Object[1];
            a(new int[]{522039041, -1558291625, 1142540450, 1266178714, 782504233, 671242332, -348566424, 1355608443, 2059009694, -37700608, -1477646222, -1263597076, 3525320, 759804019}, 27 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            blVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str, dTBFetchManager);
            DTBFetchManager dTBFetchManager2 = (DTBFetchManager) super.put(str, dTBFetchManager);
            int i = f874 + 115;
            f873 = i % 128;
            if (i % 2 != 0) {
                throw new ArithmeticException("divide by zero");
            }
            return dTBFetchManager2;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private HashMap m3708() {
            int i = f874;
            int i2 = i + 51;
            f873 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = i + 27;
            f873 = i3 % 128;
            if (i3 % 2 != 0) {
                throw new ArithmeticException("divide by zero");
            }
            return this;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            int i = f874 + 81;
            f873 = i % 128;
            String str = (String) obj;
            DTBFetchManager dTBFetchManager = (DTBFetchManager) obj2;
            if (i % 2 != 0) {
                m3707(str, dTBFetchManager);
                throw null;
            }
            DTBFetchManager m3707 = m3707(str, dTBFetchManager);
            f873 = (f874 + 15) % 128;
            return m3707;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* renamed from: ﻛ */
        public final /* synthetic */ Object mo3633() {
            f873 = (f874 + 101) % 128;
            HashMap m3708 = m3708();
            int i = f874 + 65;
            f873 = i % 128;
            if (i % 2 == 0) {
                return m3708;
            }
            throw null;
        }
    }

    static {
        m3656();
        ViewConfiguration.getScrollFriction();
        KeyEvent.getDeadChar(0, 0);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        ViewConfiguration.getWindowTouchSlop();
        SystemClock.currentThreadTimeMillis();
        ExpandableListView.getPackedPositionType(0L);
        ViewConfiguration.getDoubleTapTimeout();
        TextUtils.lastIndexOf("", '0');
        ViewConfiguration.getKeyRepeatTimeout();
        Color.rgb(0, 0, 0);
        View.getDefaultSize(0, 0);
        Process.getGidForName("");
        Process.getElapsedCpuTime();
        KeyEvent.normalizeMetaState(0);
        TextUtils.lastIndexOf("", '0');
        ViewConfiguration.getScrollBarFadeDuration();
        TextUtils.indexOf("", "", 0, 0);
        Color.blue(0);
        ViewConfiguration.getKeyRepeatTimeout();
        AndroidCharacter.getMirror('0');
        ViewConfiguration.getMinimumFlingVelocity();
        Color.blue(0);
        View.MeasureSpec.getMode(0);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        SystemClock.currentThreadTimeMillis();
        Gravity.getAbsoluteGravity(0, 0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        ViewConfiguration.getKeyRepeatTimeout();
        SystemClock.uptimeMillis();
        ViewConfiguration.getZoomControlsTimeout();
        TextUtils.getOffsetAfter("", 0);
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getWindowTouchSlop();
        View.resolveSize(0, 0);
        Color.red(0);
        ViewConfiguration.getGlobalActionKeyTimeout();
        Process.myPid();
        ViewConfiguration.getTapTimeout();
        View.resolveSizeAndState(0, 0, 0);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        ViewConfiguration.getLongPressTimeout();
        ViewConfiguration.getLongPressTimeout();
        AndroidCharacter.getMirror('0');
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        TextUtils.getOffsetBefore("", 0);
        SystemClock.elapsedRealtime();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        View.resolveSize(0, 0);
        ViewConfiguration.getScrollBarSize();
        ViewConfiguration.getKeyRepeatTimeout();
        Process.getGidForName("");
        TextUtils.lastIndexOf("", '0', 0, 0);
        ViewConfiguration.getScrollFriction();
        Process.getThreadPriority(0);
        Color.alpha(0);
        TextUtils.getTrimmedLength("");
        View.MeasureSpec.getSize(0);
        MotionEvent.axisFromString("");
        Process.getGidForName("");
        ImageFormat.getBitsPerPixel(0);
        ImageFormat.getBitsPerPixel(0);
        TextUtils.lastIndexOf("", '0');
        SystemClock.uptimeMillis();
        ViewConfiguration.getJumpTapTimeout();
        ViewConfiguration.getKeyRepeatDelay();
        ViewConfiguration.getPressedStateDuration();
        Color.green(0);
        View.getDefaultSize(0, 0);
        View.MeasureSpec.getSize(0);
        ViewConfiguration.getScrollBarFadeDuration();
        ViewConfiguration.getKeyRepeatTimeout();
        AudioTrack.getMinVolume();
        TextUtils.getTrimmedLength("");
        Color.rgb(0, 0, 0);
        TypedValue.complexToFloat(0);
        ViewConfiguration.getScrollFriction();
        ExpandableListView.getPackedPositionForChild(0, 0);
        KeyEvent.getDeadChar(0, 0);
        AudioTrack.getMaxVolume();
        View.resolveSizeAndState(0, 0, 0);
        TextUtils.indexOf("", "", 0, 0);
        Process.getGidForName("");
        ExpandableListView.getPackedPositionType(0L);
        ViewConfiguration.getEdgeSlop();
        TextUtils.getOffsetAfter("", 0);
        ViewConfiguration.getScrollBarSize();
        SystemClock.currentThreadTimeMillis();
        ViewConfiguration.getJumpTapTimeout();
        ViewConfiguration.getJumpTapTimeout();
        ViewConfiguration.getDoubleTapTimeout();
        SystemClock.elapsedRealtime();
        Color.argb(0, 0, 0, 0);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        View.MeasureSpec.getSize(0);
        Color.alpha(0);
        SystemClock.currentThreadTimeMillis();
        View.MeasureSpec.getSize(0);
        ViewConfiguration.getGlobalActionKeyTimeout();
        Color.alpha(0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        ViewConfiguration.getMinimumFlingVelocity();
        ViewConfiguration.getKeyRepeatDelay();
        TextUtils.getOffsetAfter("", 0);
        View.MeasureSpec.getSize(0);
        SystemClock.uptimeMillis();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        Process.getElapsedCpuTime();
        ViewConfiguration.getTapTimeout();
        SystemClock.currentThreadTimeMillis();
        ViewConfiguration.getScrollBarFadeDuration();
        ViewConfiguration.getTouchSlop();
        SystemClock.elapsedRealtime();
        ViewConfiguration.getMinimumFlingVelocity();
        Color.rgb(0, 0, 0);
        ViewConfiguration.getGlobalActionKeyTimeout();
        TypedValue.complexToFloat(0);
        AndroidCharacter.getMirror('0');
        Gravity.getAbsoluteGravity(0, 0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        ImageFormat.getBitsPerPixel(0);
        View.getDefaultSize(0, 0);
        ViewConfiguration.getScrollBarSize();
        SystemClock.elapsedRealtime();
        MotionEvent.axisFromString("");
        SystemClock.elapsedRealtime();
        MotionEvent.axisFromString("");
        AudioTrack.getMaxVolume();
        AudioTrack.getMinVolume();
        AudioTrack.getMinVolume();
        Color.red(0);
        KeyEvent.getDeadChar(0, 0);
        AndroidCharacter.getMirror('0');
        ViewConfiguration.getWindowTouchSlop();
        ViewConfiguration.getTouchSlop();
        View.MeasureSpec.getMode(0);
        View.MeasureSpec.getSize(0);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        TextUtils.lastIndexOf("", '0', 0, 0);
        Color.argb(0, 0, 0, 0);
        ViewConfiguration.getScrollFriction();
        ViewConfiguration.getPressedStateDuration();
        TextUtils.indexOf((CharSequence) "", '0');
        TextUtils.indexOf("", "", 0);
        ViewConfiguration.getScrollFriction();
        ExpandableListView.getPackedPositionForGroup(0);
        ViewConfiguration.getKeyRepeatDelay();
        TextUtils.getOffsetAfter("", 0);
        ExpandableListView.getPackedPositionForGroup(0);
        Process.myTid();
        KeyEvent.normalizeMetaState(0);
        ViewConfiguration.getLongPressTimeout();
        Drawable.resolveOpacity(0, 0);
        KeyEvent.getDeadChar(0, 0);
        ViewConfiguration.getDoubleTapTimeout();
        KeyEvent.getModifierMetaStateMask();
        TextUtils.lastIndexOf("", '0');
        AudioTrack.getMinVolume();
        ViewConfiguration.getTouchSlop();
        TextUtils.indexOf("", "", 0);
        ViewConfiguration.getMaximumFlingVelocity();
        ViewConfiguration.getMinimumFlingVelocity();
        ViewConfiguration.getTapTimeout();
        MotionEvent.axisFromString("");
        TextUtils.lastIndexOf("", '0', 0, 0);
        Color.red(0);
        ViewConfiguration.getScrollDefaultDelay();
        ViewConfiguration.getGlobalActionKeyTimeout();
        View.resolveSize(0, 0);
        TextUtils.getCapsMode("", 0, 0);
        ViewConfiguration.getMaximumFlingVelocity();
        View.resolveSize(0, 0);
        KeyEvent.getMaxKeyCode();
        SystemClock.elapsedRealtime();
        KeyEvent.getDeadChar(0, 0);
        Color.alpha(0);
        Color.blue(0);
        ViewConfiguration.getKeyRepeatTimeout();
        View.resolveSizeAndState(0, 0, 0);
        ViewConfiguration.getTouchSlop();
        ViewConfiguration.getMinimumFlingVelocity();
        ViewConfiguration.getWindowTouchSlop();
        TypedValue.complexToFloat(0);
        Process.getThreadPriority(0);
        ViewConfiguration.getMinimumFlingVelocity();
        Color.rgb(0, 0, 0);
        TextUtils.getOffsetAfter("", 0);
        f842 = (f840 + 69) % 128;
    }

    public bl(String str) {
        super(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r8, int r9, char r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bl.a(int, int, char, java.lang.Object[]):void");
    }

    private static Bundle aJ_(DTBAdResponse dTBAdResponse) {
        int i = f842 + 75;
        f840 = i % 128;
        if (i % 2 != 0) {
            dTBAdResponse.getRenderingBundle();
            throw null;
        }
        Bundle renderingBundle = dTBAdResponse.getRenderingBundle();
        int i2 = f842 + 93;
        f840 = i2 % 128;
        if (i2 % 2 == 0) {
            return renderingBundle;
        }
        throw null;
    }

    static /* synthetic */ Bundle aK_(DTBAdResponse dTBAdResponse) {
        int i = f842 + 45;
        f840 = i % 128;
        if (i % 2 == 0) {
            return aJ_(dTBAdResponse);
        }
        aJ_(dTBAdResponse);
        throw null;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static Map m3655(DTBAdResponse dTBAdResponse) {
        int i = f842 + 45;
        f840 = i % 128;
        Map defaultVideoAdsRequestCustomParams = dTBAdResponse.getDefaultVideoAdsRequestCustomParams();
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return defaultVideoAdsRequestCustomParams;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    static void m3656() {
        char[] cArr = new char[1191];
        ByteBuffer.wrap("\r\u0004\u008aU\u0003\u00ad\u0098ý\u0010%©ß&°¾W7ßÌüDQÝ£Zü\rk\u008a\u001b\u0003Ò\u0098°\u0010\u0019©ê&§¾\r7ðÌ¶D\fÝäZ¹Ò\u0015\rn\u008a+\u0003Â\u0098\u0094\u0010\u001d©÷&½¾\u000f7ëÌ£D\u0001\rm\u008a4\u0003É\u0098ß\u0010;©Ê&\u0091¾'7ÉÌ\u009dDrÝÍZ\u0097Ò)kÁà\u0096x;ñ\u0085\u008e\u0095\u0006%\u009fÙ\u0014Ù¬\u0004%ù¢´:\u0002³ÏH\u008dÀ+YÙÖ\u0091n1ç×\rn\u008a+\u0003Â\u0098\u009c\u0010\u0010©÷&±¾\u000b7ñÌ£D\u0011ÝùZ¿Ò\u001akàà\u0090x\u0019ñû\u008e¹\u0006\u0013\u009fç\u0014§¬\u001d\rI\u008a\u0010\u0003í\u0098û\u0010\u001f©î&µ¾\u00037íÌ¹DVÝéZ³Ò\rkåà²x\u001fñ¡\u008e±\u0006\u0001\u009fý\u0014ý¬ %Ý¢\u0090:.³æH©À\u0003YùÖ¯n\u0015çã|«ô\t\u008dÔ\n²\u0082\"\u001b×\u0090\u00ad(\u000b¡Á>±¶\u0019OÏÊ\u0097MÒÄ;_m×ãn;áNyôð\u0012\u000bX\u0083è\u001a��\u009dV\rI\u008a\u0010\u0003í\u0098û\u0010\u001f©î&µ¾\u00037íÌ¹DVÝéZ³Ò\rkåà²x\u001fñ¡\u008e±\u0006\u0001\u009fý\u0014ý¬ %Ý¢\u0090:&³ìH\u009cÀ\u0005YÿÖµn\u0017çã|«ô\u0019=Fº\u00033ê¨¼ 2\u0099â\u0016\u0092\u008e%\u0007Ïü\u008dt#íÑj\u0097â'[ÍÐ\u0098H>\u0002Ç\u0085\u0082\fk\u0097=\u001f³¦f)\u0012±±8OÃ\u001bK£¡ü&¹¯P4\u0006¼\u0088\u0005C\u008a#\u0012\u009a\u009be` è\u0099qk\rn\u008a+\u0003Â\u0098\u0094\u0010\u001a©Ñ&±¾\n7òÌ¸D\u0016ÝþZ³\rn\u008a+\u0003Â\u0098\u0094\u0010\u001a©Õ&½¾\u001c7õçu`,éÑrÇú#CÒÌ\u0089T?ÝÑ&\u0085®j7Õ°\u008f81\u0081Ù\n\u008e\u0092#\u001b\u009dd\u008dì=uÁþÁF\u001cÏáH¬Ð\u001aYÐ¢·*3³Ò<\u0097À¼GùÎ\u0010UFÝÈd\u0002ëosÑú5\rn\u008a+\u0003Â\u0098\u0094\u0010\u001a©Õ&½¾\u001c7õÌ\u0084D\rÝýZ¦Ò\u0014kþà¥x9ñã\u008e¹\u0006��\u009fà\u0014§\rn\u008a+\u0003Â\u0098\u0093\u0010\u001b©÷&·¾\u00117ÄÌ¶D\u001bÝùZ¹Ò\tkõ\rn\u008a+\u0003Â\u0098\u0093\u0010\u001b©÷&·¾\u00117ÏÌ¶D\u0016ÝìZ±Ò\u001ekþ\rn\u008a+\u0003Â\u0098\u0087\u0010\u001b©í&°¾\u001c7ðÌ²D\n\rn\u008a+\u0003Â\u0098\u0094\u0010\u001a©Á&µ¾\u00177ìÌ²D\nÝÁZ¿Ò\bkøà´x\u0014ñê\u008e¢\rn\u008a+\u0003Â\u0098\u0094\u0010\u001a©Á&µ¾\n7çÌ\u0095D\u0019ÝãZ¸Ò\u001ekþà\u009dx\u0013ñü\u008e¤\u0006��\u009fà\u0014¶¬\u0016â\u0092e×ì>whÿæF=ÉIQöØ\u001b#b«ê2\u0005µO=õ\u0084\u0003\u000fY\u0097ï\u001e\u0007aEéøp\u001eûcCñÊ\u0006MZÕþ\\\u001a§D/è\u009fÆ\u0018\u0083\u0091j\n<\u0082²;h´\u001d,½¥F^\u001dÖ±OFÈ\u0015\rn\u008a+\u0003Â\u0098\u0094\u0010\u001a©Æ&¬¾\t7ãÌ¹D\u001cÝèZ²Ò7kåà¢x\u000eñê\u008e¾\u0006��\u009füÕ\u007fR:ÛÓ@\u0085È\u000bqÛþ«f\u001cïö\u0014´\u009c\u001a\u0005è\u0082®\n\u001e³ô8¡ \u0007)ÒV¨Þ\u0007GëÌ§t\u001býýz±~Âù\u0087pnë8c¶ÚcU\u0011Í¦DZ¿\u001e7º®D)\b\r~\u008a=\u0003Í\u0098´\u0010\u0010©â&³¾\u001c7ðÌ\u009fD\u0019ÝþZ¾Ò6kíà¡\r~\u008a=\u0003Å\u0098\u00ad\u0010\u001b©à&¡¾\r7íÌ¥D+ÝèZ¤Ò\rkåà²x\u001fÖåQ\u0081Ø}C\u0012Ë\u009eryý?e\u0085ì\u007f\u0017-\u009f\u009f\u0006w\u00811\t\u0094°n;\u001e£\u0097*uU7Ý\u009dDiÏ)w\u0093\rI\u008a\u0010\u0003í\u0098û\u0010\u001f©î&µ¾\u00037íÌ¹DVÝìZ¦Ò\bk¢à°x\u001eñü\u008eþ\u0006\u0004\u009fí\u0014§¬\r%ÿ¢»:\u0013³ñHóÀ'YûÖ¯n(çä|«ô\u0005\u008dÇ\n\u00ad\u0082\u0017\u001bÝ\u0090\u00ad(\u000b¡Ö>´¶,OÕÄ¯\\\u0005ÕÇR³ê\u001bcÉ\rk\u008a\u000f\u0003ó\u0098\u0094\u0010\u001a©Â&·¾\r7ëÌ¡D\u0011ÝùZ¯\rI\u008a\u0010\u0003í\u0098û\u0010\u001f©î&µ¾\u00037íÌ¹DVÝìZ¦Ò\bk¢à°x\u001eñü\u008eþ\u0006\u0004\u009fí\u0014§¬\r%ÿ¢»:\u0013³ñHóÀ'YûÖ¯n çî|\u009eô\u0003\u008dÁ\n·\u0082\u0015\u001bÝ\u0090\u00ad(\u001b\u000b9\u008c]\u0005¡\u009eÆ\u0016H¯\u0087 ï¸N1§\rk\u008a\u000f\u0003ó\rk\u008a\u000f\u0003ó\u0098\u0094\u0010\u001aÁ{F\u001fÏãT\u0084Ü\neÐê«r\u0007ûæ��µ\u0088\u0007\u0011ñ\u0096ª\u001e\u000e§î\rk\u008a\u000f\u0003ó\u0098\u0094\u0010\u001a©Ï&½¾\n7öÌ²D\u0016ÝèZ¤U©ÒÍ[1ÀVHØñ\u0013~sæÊo5\u0094p\u001cÉ\u0085;\u0002X\u008aÐ3=¸g Ý©#Öw^Õ\rk\u008a\u000f\u0003ó\u0098\u0094\u0010\u001a©Å&»¾\u000b7ïÌ¶D\f\rk\u008a\u000f\u0003ó\u0098\u0094\u0010\u001a©×&\u00ad¾\t7ç\rk\u008a\u000f\u0003ó\u0098\u0094\u0010\u001a©Ñ&±¾\b7÷Ì²D\u000bÝù\u0007È\u0080\u009f\tq\u0092\u0011\u001a\u008b£v,\u001a´\u0099=~¢6%a¬\u008f7è¿`\u0006\u008c\u0089Ì\u0011j\u0098¿cÍë`r\u0082õÂ}rÄ\u008eOã×o^\u0087!ß©\u007f0\u009b»Ë\u0003z%G¢\u0010+þ°\u009e8\u0010\u0081Û\u000e»\u0096��\u001føä²l\u001cõôr¹ú3CïÈ¿P9Ùá\rM\u008a\u001a\u0003ô\u0098\u0094\u0010\u001a©Ñ&±¾\n7òÌ¸D\u0016ÝþZ³Ò8kþà´x\u001bñû\u008e¹\u0006\u0013\u009fë\u0014\u009a¬��\rM\u008a\u001a\u0003ô\u0098\u0094\u0010\u001a©Ñ&±¾\n7òÌ¸D\u0016ÝþZ³Ò2káà¡x\bñê\u008e£\u0006\u0016\u009fç\u0014¼¬\n%Ü¢ :\u000b\u0097þ\u0010©\u0099G\u0002'\u008a©3b¼\u0002$¹\u00adAV\u000bÞ¥GMÀ��H\u009añZz\fâ\u00adkY\u0014\u0011\u009c¿\u0005S\u008e\u00076\u009a¿[8\u0011\rM\u008a\u001a\u0003ô\u0098\u0094\u0010\u001a©Ñ&±¾\n7òÌ¸D\u0016ÝþZ³Ò)kéà¿x\u001eñê\u008e¢\u0006\f\u009fà\u0014´¬&%ü¢¼:\u0003³äH¸k\u0099ìÎe þEvÏÏ1@aØØQ:ªw\"ú»0<f´Ê\r7\u0086D\u001eÊ\u0097(èV`Ôù+rrÊÕC.Är\\ðÕ).z¦Æ?0°e\bå\u0081?\u001ay\u0092Õë\fly\rM\u008a\u001a\u0003ô\u0098\u0094\u0010\u001a©Ñ&±¾\n7òÌ¸D\u0016ÝþZ³Ò:kèà¢\rM\u008a\u001a\u0003ô\u0098\u0094\u0010\u001a©Ñ&±¾\n7òÌ¸D\u0016ÝþZ³Ò+kþà¸x\u0019ñê\u008e\u0080\u0006\n\u009fç\u0014½¬\u0010\rM\u008a\u001a\u0003ô\u0098\u0094\u0010\u001a©Ð&½¾\u00037çÌ\u0084D\u0014ÝâZ¢Ò.kÙà\u0098x>\u0010\u008c\u0097Û\u001e5\u0085U\rÛ´\u0011;|£Â*&ÑWYÝÀ\u0018GnÏÊv(¦÷! ¨N3.» \u0002j\u008d\u0007\u0015¹\u009c]g=ï·vUñ?y¤ÀBK\u001fÓ©Z[%\r\u00ad¬\rC\u008a\f\u0003Á\u0098±\u0010-©ê&®¾\u001c7ËÌ¹D\fÝèZ¤Ò\bkøà¸x\u000eñæ\u008e±\u0006\t\u009fÏ\u0014·ÁÍF\u0089ÏaT0Ü\u008eebê\u0004r¿û@��6\u0088\u0088\u0011j\u0096:\u001e¹§i,6´\u008a=dB&Ê\u0098SGØ6`\u008eéln1ö\u0086\u007f~\u0084\u0014\f\u0083\u0095\u007feEâ\u0001kéð¸x\u0006ÁêN\u008cÖ7_Ë¤£,\u0011µâ2¯º\u0003\u0003ï\u0088¯\u0010%\u0099ææ®n\u001f÷ë|¼Ä\r\rM\u008a\u001a\u0003ô\u0098\u0094\u0010\u000e©ð&\u0095¾\u001d7ÐÌ²D\tÝøZ³Ò\bkø||û+rÅé¦a&ØÖW¬Ï&FÕ½\u0089\rM\u008a\u001a\u0003ô\u0098\u0085\u0010\f©ê&·¾\u001c7ÒÌ¸D\u0011ÝãZ¢òtu#üÍg¿ï+VÕÙ\u0099A\u0015ÈÎ3\u0087»%+W¬��%î¾\u008e6\u0014\u008fê��\u008f\u0098\u0007\u0011Þê¢b\u0010ûú|\u00adô\u0015\rM\u008a\u001a\u0003ô\u0098\u0094\u0010\u001a©Ï&»¾\u00187æÌ²D\n\rM\u008a\u001a\u0003ô\u0098\u0094\u0010\u001a©Õ&½¾\u001c7õ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1191);
        f839 = cArr;
        f841 = -8853742995299399041L;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static DTBAdView m3657(ApsAd apsAd) {
        f840 = (f842 + 111) % 128;
        DTBAdView adView = apsAd.getAdView();
        f842 = (f840 + 5) % 128;
        return adView;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static String m3658(ApsAd apsAd) {
        f840 = (f842 + 99) % 128;
        String slotUuid = apsAd.getSlotUuid();
        int i = f842 + 103;
        f840 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return slotUuid;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static List m3659(DTBAdResponse dTBAdResponse) {
        f840 = (f842 + 93) % 128;
        List dTBAds = dTBAdResponse.getDTBAds();
        int i = f840 + 23;
        f842 = i % 128;
        if (i % 2 != 0) {
            return dTBAds;
        }
        throw null;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static String m3660() {
        int i = f840 + 111;
        f842 = i % 128;
        if (i % 2 == 0) {
            AdRegistration.getAppKey();
            throw null;
        }
        String appKey = AdRegistration.getAppKey();
        f840 = (f842 + 77) % 128;
        return appKey;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static ApsAdFormat m3661(ApsAd apsAd) {
        f840 = (f842 + 45) % 128;
        ApsAdFormat apsAdFormat = apsAd.getApsAdFormat();
        f840 = (f842 + 91) % 128;
        return apsAdFormat;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static DTBFetchFactory m3662() {
        int i = f842 + 65;
        f840 = i % 128;
        if (i % 2 != 0) {
            DTBFetchFactory.getInstance();
            throw null;
        }
        DTBFetchFactory dTBFetchFactory = DTBFetchFactory.getInstance();
        f840 = (f842 + 67) % 128;
        return dTBFetchFactory;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static HashMap m3663(DTBAdResponse dTBAdResponse) {
        int i = f842 + 111;
        f840 = i % 128;
        if (i % 2 != 0) {
            dTBAdResponse.getRenderingMap();
            throw null;
        }
        HashMap renderingMap = dTBAdResponse.getRenderingMap();
        int i2 = f842 + 105;
        f840 = i2 % 128;
        if (i2 % 2 == 0) {
            return renderingMap;
        }
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static AdType m3664(DTBAdSize dTBAdSize) {
        f840 = (f842 + 39) % 128;
        AdType dTBAdType = dTBAdSize.getDTBAdType();
        int i = f840 + 101;
        f842 = i % 128;
        if (i % 2 != 0) {
            return dTBAdType;
        }
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static String m3665(ApsAd apsAd) {
        f840 = (f842 + 11) % 128;
        String bidInfo = apsAd.getBidInfo();
        int i = f840 + 19;
        f842 = i % 128;
        if (i % 2 != 0) {
            return bidInfo;
        }
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ Map m3666(DTBAdResponse dTBAdResponse) {
        int i = f840 + 101;
        f842 = i % 128;
        if (i % 2 != 0) {
            return m3655(dTBAdResponse);
        }
        m3655(dTBAdResponse);
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static ApsAdRequest m3667(ApsAd apsAd) {
        int i = f840 + 113;
        f842 = i % 128;
        if (i % 2 == 0) {
            apsAd.getApsAdRequest();
            throw null;
        }
        ApsAdRequest apsAdRequest = apsAd.getApsAdRequest();
        f840 = (f842 + 89) % 128;
        return apsAdRequest;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static /* synthetic */ Object m3668(Object[] objArr) {
        int i = f840 + 91;
        f842 = i % 128;
        if (i % 2 != 0) {
            return m3660();
        }
        m3660();
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ List m3669(DTBAdResponse dTBAdResponse) {
        int i = f842 + 99;
        f840 = i % 128;
        List m3659 = m3659(dTBAdResponse);
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        int i2 = f842 + 71;
        f840 = i2 % 128;
        if (i2 % 2 == 0) {
            return m3659;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ ApsAdRequest m3670(ApsAd apsAd) {
        int i = f840 + 49;
        f842 = i % 128;
        Object[] objArr = new Object[1];
        if (i % 2 == 0) {
            objArr[0] = apsAd;
            throw null;
        }
        objArr[0] = apsAd;
        ApsAdRequest apsAdRequest = (ApsAdRequest) m3696(objArr, 1453976269, -1453976261, (int) System.currentTimeMillis());
        int i2 = f842 + 33;
        f840 = i2 % 128;
        if (i2 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return apsAdRequest;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static String m3671(DTBAdResponse dTBAdResponse) {
        int i = f840 + 101;
        f842 = i % 128;
        if (i % 2 != 0) {
            return dTBAdResponse.getImpressionUrl();
        }
        dTBAdResponse.getImpressionUrl();
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static JSONObject m3672(DTBAdSize dTBAdSize) {
        int i = f842 + 3;
        f840 = i % 128;
        if (i % 2 == 0) {
            return dTBAdSize.getPubSettings();
        }
        dTBAdSize.getPubSettings();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ DTBAdView m3673(ApsAd apsAd) {
        f840 = (f842 + 11) % 128;
        DTBAdView m3657 = m3657(apsAd);
        f842 = (f840 + 47) % 128;
        return m3657;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static /* synthetic */ Object m3674(Object[] objArr) {
        ApsAd apsAd = (ApsAd) objArr[0];
        f842 = (f840 + 29) % 128;
        String m3677 = m3677(apsAd);
        int i = f840 + 3;
        f842 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m3677;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static String m3675(DTBAdResponse dTBAdResponse) {
        f842 = (f840 + 115) % 128;
        String bidId = dTBAdResponse.getBidId();
        int i = f840 + 41;
        f842 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return bidId;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static /* synthetic */ Object m3676(Object[] objArr) {
        ApsAd apsAd = (ApsAd) objArr[0];
        f842 = (f840 + 35) % 128;
        ApsAdRequest adLoader = apsAd.getAdLoader();
        int i = f840 + 107;
        f842 = i % 128;
        if (i % 2 != 0) {
            return adLoader;
        }
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static String m3677(ApsAd apsAd) {
        int i = f840 + 101;
        f842 = i % 128;
        String pricePoint = apsAd.getPricePoint();
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        int i2 = f842 + 49;
        f840 = i2 % 128;
        if (i2 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return pricePoint;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static String m3678(DTBAdResponse dTBAdResponse) {
        int i = f840 + 109;
        f842 = i % 128;
        if (i % 2 == 0) {
            dTBAdResponse.getCrid();
            throw null;
        }
        String crid = dTBAdResponse.getCrid();
        int i2 = f840 + 47;
        f842 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return crid;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static boolean m3679(DTBAdSize dTBAdSize) {
        return ((Boolean) m3696(new Object[]{dTBAdSize}, -492303930, 492303932, (int) System.currentTimeMillis())).booleanValue();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ DTBFetchFactory m3680() {
        int i = f840 + 51;
        f842 = i % 128;
        if (i % 2 != 0) {
            return m3662();
        }
        m3662();
        throw new ArithmeticException("divide by zero");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static /* synthetic */ Object m3681(Object[] objArr) {
        f840 = (f842 + 113) % 128;
        String version = AdRegistration.getVersion();
        int i = f840 + 39;
        f842 = i % 128;
        if (i % 2 != 0) {
            return version;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ HashMap m3682(DTBAdResponse dTBAdResponse) {
        int i = f842 + 3;
        f840 = i % 128;
        HashMap m3663 = m3663(dTBAdResponse);
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m3663;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ boolean m3683(DTBAdSize dTBAdSize) {
        int i = f840 + 97;
        f842 = i % 128;
        boolean m3679 = m3679(dTBAdSize);
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        f840 = (f842 + 77) % 128;
        return m3679;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ ApsAdFormat m3684(ApsAd apsAd) {
        int i = f842 + 45;
        f840 = i % 128;
        if (i % 2 != 0) {
            m3661(apsAd);
            throw null;
        }
        ApsAdFormat m3661 = m3661(apsAd);
        int i2 = f842 + 77;
        f840 = i2 % 128;
        if (i2 % 2 == 0) {
            return m3661;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ e m3685(bl blVar, HashMap hashMap, cp cpVar) {
        f842 = (f840 + 23) % 128;
        e m3694 = blVar.m3694(hashMap, cpVar);
        f842 = (f840 + 51) % 128;
        return m3694;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static /* synthetic */ Object m3686(Object[] objArr) {
        ApsAd apsAd = (ApsAd) objArr[0];
        f840 = (f842 + 69) % 128;
        ApsAdRequest m3667 = m3667(apsAd);
        int i = f840 + 115;
        f842 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m3667;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m3687(DTBAdResponse dTBAdResponse) {
        f840 = (f842 + 79) % 128;
        String m3671 = m3671(dTBAdResponse);
        f840 = (f842 + 23) % 128;
        return m3671;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m3688(DTBAdSize dTBAdSize) {
        int i = f842 + 95;
        f840 = i % 128;
        Object[] objArr = new Object[1];
        if (i % 2 != 0) {
            objArr[0] = dTBAdSize;
            throw null;
        }
        objArr[0] = dTBAdSize;
        String str = (String) m3696(objArr, -1161756011, 1161756017, (int) System.currentTimeMillis());
        f840 = (f842 + 25) % 128;
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ AdType m3689(DTBAdSize dTBAdSize) {
        int i = f842 + 113;
        f840 = i % 128;
        AdType m3664 = m3664(dTBAdSize);
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m3664;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ a m3690(bl blVar, ThreadPoolExecutor threadPoolExecutor, cp cpVar) {
        int i = f840 + 1;
        f842 = i % 128;
        if (i % 2 != 0) {
            return blVar.m3691(threadPoolExecutor, cpVar);
        }
        blVar.m3691(threadPoolExecutor, cpVar);
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private a m3691(ThreadPoolExecutor threadPoolExecutor, cp cpVar) {
        a aVar = new a(this, threadPoolExecutor, cpVar);
        f840 = (f842 + 45) % 128;
        return aVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ Object m3692(Object[] objArr) {
        DTBAdSize dTBAdSize = (DTBAdSize) objArr[0];
        int i = f840 + 73;
        f842 = i % 128;
        if (i % 2 != 0) {
            return dTBAdSize.getSlotUUID();
        }
        dTBAdSize.getSlotUUID();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m3693(ApsAd apsAd) {
        int i = f842 + 81;
        f840 = i % 128;
        if (i % 2 != 0) {
            m3665(apsAd);
            throw null;
        }
        String m3665 = m3665(apsAd);
        int i2 = f842 + 1;
        f840 = i2 % 128;
        if (i2 % 2 == 0) {
            return m3665;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private e m3694(HashMap hashMap, cp cpVar) {
        e eVar = new e(this, hashMap, cpVar);
        int i = f842 + 53;
        f840 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return eVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static /* synthetic */ Object m3695(Object[] objArr) {
        DTBAdResponse dTBAdResponse = (DTBAdResponse) objArr[0];
        int i = f840 + 113;
        f842 = i % 128;
        String m3678 = m3678(dTBAdResponse);
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        int i2 = f842 + 85;
        f840 = i2 % 128;
        if (i2 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m3678;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Object m3696(Object[] objArr, int i, int i2, int i3) {
        Object m3695;
        boolean z;
        int i4 = i2 ^ (-1);
        int i5 = i4 | i;
        switch ((i * 624) + (i2 * (-622)) + (((i5 | i3) ^ (-1)) * 623) + ((((i2 | (i ^ (-1))) ^ (-1)) | (i3 ^ (-1))) * (-623)) + ((((i | i3) ^ (-1)) | (i5 ^ (-1)) | ((i4 | i3) ^ (-1))) * 623)) {
            case 1:
                m3695 = m3695(objArr);
                break;
            case 2:
                m3695 = m3700(objArr);
                break;
            case 3:
                String str = (String) objArr[1];
                switch (str.hashCode()) {
                    case -2137858584:
                        Object[] objArr2 = new Object[1];
                        a(Color.green(0) + 11, TextUtils.getTrimmedLength("") + 204, (char) (IronSourceConstants.NT_INSTANCE_SHOW - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr2);
                        if (str.equals(((String) objArr2[0]).intern())) {
                            z = 8;
                            break;
                        }
                        z = -1;
                        break;
                    case -2133119933:
                        Object[] objArr3 = new Object[1];
                        a(15 - (ViewConfiguration.getWindowTouchSlop() >> 8), 672 - MotionEvent.axisFromString(""), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 52240), objArr3);
                        if (str.equals(((String) objArr3[0]).intern())) {
                            z = 34;
                            break;
                        }
                        z = -1;
                        break;
                    case -1987686071:
                        Object[] objArr4 = new Object[1];
                        a(13 - View.MeasureSpec.getMode(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 482, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29612), objArr4);
                        if (!(!str.equals(((String) objArr4[0]).intern()))) {
                            z = 24;
                            break;
                        }
                        z = -1;
                        break;
                    case -1885106463:
                        Object[] objArr5 = new Object[1];
                        a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, TextUtils.lastIndexOf("", '0', 0) + 28, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr5);
                        if (str.equals(((String) objArr5[0]).intern())) {
                            z = true;
                            break;
                        }
                        z = -1;
                        break;
                    case -1879113962:
                        Object[] objArr6 = new Object[1];
                        a(8 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 280, (char) (Color.argb(0, 0, 0, 0) + 52690), objArr6);
                        if (str.equals(((String) objArr6[0]).intern())) {
                            z = 13;
                            break;
                        }
                        z = -1;
                        break;
                    case -1879025222:
                        Object[] objArr7 = new Object[1];
                        a(9 - (ViewConfiguration.getFadingEdgeLength() >> 16), 241 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr7);
                        if (str.equals(((String) objArr7[0]).intern())) {
                            z = 11;
                            break;
                        }
                        z = -1;
                        break;
                    case -1554728876:
                        Object[] objArr8 = new Object[1];
                        a(45 - Color.red(0), TextUtils.lastIndexOf("", '0', 0, 0) + 95, (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr8);
                        if (str.equals(((String) objArr8[0]).intern())) {
                            z = 4;
                            break;
                        }
                        z = -1;
                        break;
                    case -1464660218:
                        Object[] objArr9 = new Object[1];
                        a(29 - KeyEvent.normalizeMetaState(0), Color.argb(0, 0, 0, 0) + 394, (char) (61436 - Gravity.getAbsoluteGravity(0, 0)), objArr9);
                        if (str.equals(((String) objArr9[0]).intern())) {
                            f840 = (f842 + 125) % 128;
                            z = 20;
                            break;
                        }
                        z = -1;
                        break;
                    case -1358954558:
                        Object[] objArr10 = new Object[1];
                        a((ViewConfiguration.getTapTimeout() >> 16) + 15, TextUtils.indexOf("", "") + 311, (char) Color.green(0), objArr10);
                        if (!(!str.equals(((String) objArr10[0]).intern()))) {
                            z = 15;
                            break;
                        }
                        z = -1;
                        break;
                    case -1293925587:
                        Object[] objArr11 = new Object[1];
                        a(Color.green(0) + 23, 71 - View.resolveSize(0, 0), (char) (MotionEvent.axisFromString("") + 1), objArr11);
                        if (str.equals(((String) objArr11[0]).intern())) {
                            z = 3;
                            break;
                        }
                        z = -1;
                        break;
                    case -1291566264:
                        Object[] objArr12 = new Object[1];
                        a((Process.myPid() >> 22) + 12, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 740, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr12);
                        if (str.equals(((String) objArr12[0]).intern())) {
                            z = 39;
                            break;
                        }
                        z = -1;
                        break;
                    case -1092884085:
                        Object[] objArr13 = new Object[1];
                        a(35 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 152, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), objArr13);
                        if (str.equals(((String) objArr13[0]).intern())) {
                            z = 6;
                            break;
                        }
                        z = -1;
                        break;
                    case -1090060454:
                        Object[] objArr14 = new Object[1];
                        a(12 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 215 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (TextUtils.getOffsetBefore("", 0) + 44178), objArr14);
                        if (str.equals(((String) objArr14[0]).intern())) {
                            z = 9;
                            break;
                        }
                        z = -1;
                        break;
                    case -832298225:
                        Object[] objArr15 = new Object[1];
                        a(16 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 495, (char) (Process.myTid() >> 22), objArr15);
                        if (str.equals(((String) objArr15[0]).intern())) {
                            f840 = (f842 + 119) % 128;
                            z = 25;
                            break;
                        }
                        z = -1;
                        break;
                    case -791598050:
                        Object[] objArr16 = new Object[1];
                        a(Color.argb(0, 0, 0, 0) + 11, 721 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) KeyEvent.normalizeMetaState(0), objArr16);
                        if (str.equals(((String) objArr16[0]).intern())) {
                            z = 37;
                            break;
                        }
                        z = -1;
                        break;
                    case -723985259:
                        Object[] objArr17 = new Object[1];
                        a(11 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 341 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr17);
                        if (str.equals(((String) objArr17[0]).intern())) {
                            z = 17;
                            break;
                        }
                        z = -1;
                        break;
                    case -696695160:
                        Object[] objArr18 = new Object[1];
                        a(33 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 38, (char) (37 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr18);
                        if (str.equals(((String) objArr18[0]).intern())) {
                            z = 2;
                            break;
                        }
                        z = -1;
                        break;
                    case -694845532:
                        Object[] objArr19 = new Object[1];
                        a(13 - TextUtils.getTrimmedLength(""), 139 - ExpandableListView.getPackedPositionType(0L), (char) (View.getDefaultSize(0, 0) + 51193), objArr19);
                        if (str.equals(((String) objArr19[0]).intern())) {
                            z = 5;
                            break;
                        }
                        z = -1;
                        break;
                    case -466918522:
                        Object[] objArr20 = new Object[1];
                        a(23 - KeyEvent.getDeadChar(0, 0), (Process.myPid() >> 22) + 371, (char) Color.alpha(0), objArr20);
                        if (str.equals(((String) objArr20[0]).intern())) {
                            f840 = (f842 + 51) % 128;
                            z = 19;
                            break;
                        }
                        z = -1;
                        break;
                    case -341719851:
                        Object[] objArr21 = new Object[1];
                        a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 19, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 351, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), objArr21);
                        if (str.equals(((String) objArr21[0]).intern())) {
                            z = 18;
                            break;
                        }
                        z = -1;
                        break;
                    case -300800492:
                        Object[] objArr22 = new Object[1];
                        a(17 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.getDefaultSize(0, 0) + 511, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr22);
                        if (str.equals(((String) objArr22[0]).intern())) {
                            f840 = (f842 + 37) % 128;
                            z = 26;
                            break;
                        }
                        z = -1;
                        break;
                    case -197992833:
                        Object[] objArr23 = new Object[1];
                        a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24, 528 - View.resolveSize(0, 0), (char) (TextUtils.getTrimmedLength("") + 56206), objArr23);
                        if (str.equals(((String) objArr23[0]).intern())) {
                            z = 27;
                            break;
                        }
                        z = -1;
                        break;
                    case -27446238:
                        Object[] objArr24 = new Object[1];
                        a(21 - TextUtils.getOffsetBefore("", 0), TextUtils.getOffsetBefore("", 0) + 436, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), objArr24);
                        if (str.equals(((String) objArr24[0]).intern())) {
                            f840 = (f842 + 47) % 128;
                            z = 22;
                            break;
                        }
                        z = -1;
                        break;
                    case 66052:
                        Object[] objArr25 = new Object[1];
                        a(View.MeasureSpec.makeMeasureSpec(0, 0) + 3, TextUtils.indexOf((CharSequence) "", '0', 0) + 666, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr25);
                        if (!(!str.equals(((String) objArr25[0]).intern()))) {
                            z = 32;
                            break;
                        }
                        z = -1;
                        break;
                    case 63478087:
                        Object[] objArr26 = new Object[1];
                        a(5 - Gravity.getAbsoluteGravity(0, 0), 668 - KeyEvent.keyCodeFromString(""), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr26);
                        if (str.equals(((String) objArr26[0]).intern())) {
                            z = 33;
                            break;
                        }
                        z = -1;
                        break;
                    case 355568411:
                        Object[] objArr27 = new Object[1];
                        a(14 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 689, (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr27);
                        if (str.equals(((String) objArr27[0]).intern())) {
                            z = 35;
                            break;
                        }
                        z = -1;
                        break;
                    case 568188517:
                        Object[] objArr28 = new Object[1];
                        a(15 - View.getDefaultSize(0, 0), 326 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ExpandableListView.getPackedPositionGroup(0L), objArr28);
                        if (str.equals(((String) objArr28[0]).intern())) {
                            z = 16;
                            break;
                        }
                        z = -1;
                        break;
                    case 620798166:
                        Object[] objArr29 = new Object[1];
                        a(TextUtils.getCapsMode("", 0, 0) + 13, 275 - AndroidCharacter.getMirror('0'), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr29);
                        if (str.equals(((String) objArr29[0]).intern())) {
                            int i6 = f842 + 111;
                            f840 = i6 % 128;
                            if (i6 % 2 == 0) {
                                z = 10;
                                break;
                            } else {
                                z = 100;
                                break;
                            }
                        }
                        z = -1;
                        break;
                    case 788901082:
                        Object[] objArr30 = new Object[1];
                        a(ImageFormat.getBitsPerPixel(0) + 14, AndroidCharacter.getMirror('0') + 375, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 37543), objArr30);
                        if (str.equals(((String) objArr30[0]).intern())) {
                            z = 21;
                            break;
                        }
                        z = -1;
                        break;
                    case 1036908700:
                        Object[] objArr31 = new Object[1];
                        a(14 - (ViewConfiguration.getJumpTapTimeout() >> 16), 13 - (KeyEvent.getMaxKeyCode() >> 16), (char) TextUtils.getCapsMode("", 0, 0), objArr31);
                        if (str.equals(((String) objArr31[0]).intern())) {
                            z = false;
                            break;
                        }
                        z = -1;
                        break;
                    case 1251356764:
                        Object[] objArr32 = new Object[1];
                        a(TextUtils.indexOf("", "", 0, 0) + 41, Color.blue(0) + IronSourceError.ERROR_BN_LOAD_NO_CONFIG, (char) (ViewConfiguration.getTapTimeout() >> 16), objArr32);
                        if (str.equals(((String) objArr32[0]).intern())) {
                            z = 30;
                            break;
                        }
                        z = -1;
                        break;
                    case 1306698049:
                        Object[] objArr33 = new Object[1];
                        a(17 - TextUtils.getOffsetAfter("", 0), 188 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (12328 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr33);
                        if (str.equals(((String) objArr33[0]).intern())) {
                            z = 7;
                            break;
                        }
                        z = -1;
                        break;
                    case 1328085269:
                        Object[] objArr34 = new Object[1];
                        a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 25, 457 - View.getDefaultSize(0, 0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 55312), objArr34);
                        if (str.equals(((String) objArr34[0]).intern())) {
                            z = 23;
                            break;
                        }
                        z = -1;
                        break;
                    case 1340383521:
                        Object[] objArr35 = new Object[1];
                        a((ViewConfiguration.getLongPressTimeout() >> 16) + 9, 732 - TextUtils.getCapsMode("", 0, 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr35);
                        if (str.equals(((String) objArr35[0]).intern())) {
                            z = 38;
                            break;
                        }
                        z = -1;
                        break;
                    case 1340427404:
                        Object[] objArr36 = new Object[1];
                        a(9 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (-16776560) - Color.rgb(0, 0, 0), (char) (1618 - View.resolveSize(0, 0)), objArr36);
                        if (str.equals(((String) objArr36[0]).intern())) {
                            f842 = (f840 + 87) % 128;
                            z = 31;
                            break;
                        }
                        z = -1;
                        break;
                    case 1600627740:
                        Object[] objArr37 = new Object[1];
                        a(21 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + IronSourceError.ERROR_NT_INIT_FAILED_AFTER_LOAD, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22722), objArr37);
                        if (!(!str.equals(((String) objArr37[0]).intern()))) {
                            f840 = (f842 + 89) % 128;
                            z = 36;
                            break;
                        }
                        z = -1;
                        break;
                    case 1648408950:
                        Object[] objArr38 = new Object[1];
                        a(13 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr38);
                        if (str.equals(((String) objArr38[0]).intern())) {
                            z = 29;
                            break;
                        }
                        z = -1;
                        break;
                    case 1713728997:
                        Object[] objArr39 = new Object[1];
                        a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 51, 550 - TextUtils.lastIndexOf("", '0', 0, 0), (char) View.MeasureSpec.getSize(0), objArr39);
                        if (str.equals(((String) objArr39[0]).intern())) {
                            int i7 = f842 + 27;
                            f840 = i7 % 128;
                            if (i7 % 2 == 0) {
                                z = 28;
                                break;
                            } else {
                                z = 113;
                                break;
                            }
                        }
                        z = -1;
                        break;
                    case 2019413793:
                        Object[] objArr40 = new Object[1];
                        a(TextUtils.getCapsMode("", 0, 0) + 31, 249 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (Color.blue(0) + 59964), objArr40);
                        if (str.equals(((String) objArr40[0]).intern())) {
                            z = 12;
                            break;
                        }
                        z = -1;
                        break;
                    case 2144664800:
                        Object[] objArr41 = new Object[1];
                        a(MotionEvent.axisFromString("") + 23, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 289, (char) (AndroidCharacter.getMirror('0') - '0'), objArr41);
                        if (str.equals(((String) objArr41[0]).intern())) {
                            z = 14;
                            break;
                        }
                        z = -1;
                        break;
                    default:
                        z = -1;
                        break;
                }
                switch (z) {
                    case false:
                        m3695 = AdRegistration.class;
                        break;
                    case true:
                    case true:
                        m3695 = DTBActivity.class;
                        break;
                    case true:
                    case true:
                        m3695 = DTBInterstitialActivity.class;
                        break;
                    case true:
                    case true:
                        m3695 = DTBAdActivity.class;
                        break;
                    case true:
                        m3695 = DTBAdInterstitial.class;
                        break;
                    case true:
                        m3695 = DTBAdLoader.class;
                        break;
                    case true:
                        m3695 = DTBAdRequest.class;
                        break;
                    case true:
                        m3695 = DTBAdResponse.class;
                        break;
                    case true:
                    case true:
                        m3695 = DTBAdView.class;
                        break;
                    case true:
                        m3695 = DTBAdSize.class;
                        break;
                    case true:
                        m3695 = DTBAdViewSupportClient.class;
                        break;
                    case true:
                        m3695 = DTBFetchFactory.class;
                        break;
                    case true:
                        m3695 = DTBFetchManager.class;
                        break;
                    case true:
                        m3695 = DTBRenderer.class;
                        break;
                    case true:
                        m3695 = DTBAdBannerListener.class;
                        break;
                    case true:
                        m3695 = DTBAdBaseBannerListener.class;
                        break;
                    case true:
                        m3695 = DTBAdBaseInterstitialListener.class;
                        break;
                    case true:
                        m3695 = DTBAdCallback.class;
                        break;
                    case true:
                        m3695 = DTBAdExpandedListener.class;
                        break;
                    case true:
                        m3695 = DTBAdInterstitialListener.class;
                        break;
                    case true:
                        m3695 = DTBAdListener.class;
                        break;
                    case VIEW_NOT_VISIBLE_ON_PLAY_VALUE:
                        m3695 = e.class;
                        break;
                    case MRAID_DOWNLOAD_JS_RETRY_SUCCESS_VALUE:
                        m3695 = a.class;
                        break;
                    case OMSDK_DOWNLOAD_JS_RETRY_SUCCESS_VALUE:
                    case PRIVACY_URL_OPENED_VALUE:
                        m3695 = ApsInterstitialActivity.class;
                        break;
                    case NOTIFICATION_REDIRECT_VALUE:
                    case true:
                        m3695 = ApsAdActivity.class;
                        break;
                    case true:
                        m3695 = ApsAdView.class;
                        f842 = (f840 + 53) % 128;
                        break;
                    case h4.i /* 32 */:
                        m3695 = Aps.class;
                        break;
                    case true:
                        m3695 = ApsAd.class;
                        break;
                    case true:
                        m3695 = ApsAdController.class;
                        break;
                    case true:
                        m3695 = ApsAdListener.class;
                        break;
                    case true:
                        m3695 = ApsAdRequestListener.class;
                        break;
                    case true:
                        m3695 = ApsAdFormat.class;
                        break;
                    case true:
                        m3695 = ApsAdType.class;
                        break;
                    case true:
                        m3695 = ApsAdRequest.class;
                        break;
                    default:
                        m3695 = null;
                        break;
                }
            case 4:
                bl blVar = (bl) objArr[0];
                HashMap hashMap = new HashMap();
                Object[] objArr42 = new Object[1];
                a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9, 753 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (2693 - Color.alpha(0)), objArr42);
                hashMap.put(((String) objArr42[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.5

                    /* renamed from: ﾇ, reason: contains not printable characters */
                    private bl f861;

                    {
                        this.f861 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return (String) bl.m3696(new Object[0], 1548639167, -1548639158, (int) System.currentTimeMillis());
                    }
                });
                Object[] objArr43 = new Object[1];
                a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23, 762 - Color.argb(0, 0, 0, 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 44924), objArr43);
                hashMap.put(((String) objArr43[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.11

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private bl f845;

                    {
                        this.f845 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return bl.m3680();
                    }
                });
                Object[] objArr44 = new Object[1];
                a(Color.red(0) + 18, View.MeasureSpec.getMode(0) + 785, (char) (ImageFormat.getBitsPerPixel(0) + 10251), objArr44);
                hashMap.put(((String) objArr44[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.18

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private bl f852;

                    {
                        this.f852 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return bl.m3698((DTBAdResponse) list.get(0));
                    }
                });
                Object[] objArr45 = new Object[1];
                a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23, (-16776413) - Color.rgb(0, 0, 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr45);
                hashMap.put(((String) objArr45[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.16

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private bl f850;

                    {
                        this.f850 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return (String) bl.m3696(new Object[]{(DTBAdResponse) list.get(0)}, 1016257373, -1016257372, (int) System.currentTimeMillis());
                    }
                });
                Object[] objArr46 = new Object[1];
                a((ViewConfiguration.getWindowTouchSlop() >> 8) + 26, (ViewConfiguration.getLongPressTimeout() >> 16) + 826, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr46);
                hashMap.put(((String) objArr46[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.19

                    /* renamed from: ﾇ, reason: contains not printable characters */
                    private bl f853;

                    {
                        this.f853 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return bl.m3687((DTBAdResponse) list.get(0));
                    }
                });
                Object[] objArr47 = new Object[1];
                a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 25, ExpandableListView.getPackedPositionType(0L) + 852, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 39603), objArr47);
                hashMap.put(((String) objArr47[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.17

                    /* renamed from: ﻐ, reason: contains not printable characters */
                    private bl f851;

                    {
                        this.f851 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return bl.m3682((DTBAdResponse) list.get(0));
                    }
                });
                Object[] objArr48 = new Object[1];
                a(28 - Gravity.getAbsoluteGravity(0, 0), TextUtils.indexOf("", "", 0, 0) + 877, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr48);
                hashMap.put(((String) objArr48[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.25

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private bl f858;

                    {
                        this.f858 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return bl.aK_((DTBAdResponse) list.get(0));
                    }
                });
                Object[] objArr49 = new Object[1];
                a((-16777179) - Color.rgb(0, 0, 0), 905 - View.getDefaultSize(0, 0), (char) (26324 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr49);
                hashMap.put(((String) objArr49[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.22

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private bl f856;

                    {
                        this.f856 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return bl.m3666((DTBAdResponse) list.get(0));
                    }
                });
                Object[] objArr50 = new Object[1];
                a(((byte) KeyEvent.getModifierMetaStateMask()) + 17, TextUtils.lastIndexOf("", '0', 0) + 943, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr50);
                hashMap.put(((String) objArr50[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.24

                    /* renamed from: ﾇ, reason: contains not printable characters */
                    private bl f857;

                    {
                        this.f857 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return bl.m3669((DTBAdResponse) list.get(0));
                    }
                });
                Object[] objArr51 = new Object[1];
                a(Color.red(0) + 23, 958 - KeyEvent.normalizeMetaState(0), (char) Color.blue(0), objArr51);
                hashMap.put(((String) objArr51[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.3

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private bl f859;

                    {
                        this.f859 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return bl.m3699((DTBAdResponse) list.get(0), (DTBAdSize) list.get(1));
                    }
                });
                Object[] objArr52 = new Object[1];
                a(TextUtils.indexOf((CharSequence) "", '0') + 18, 981 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) Color.alpha(0), objArr52);
                hashMap.put(((String) objArr52[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.1

                    /* renamed from: ｋ, reason: contains not printable characters */
                    private bl f843;

                    {
                        this.f843 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return bl.m3688((DTBAdSize) list.get(0));
                    }
                });
                Object[] objArr53 = new Object[1];
                a(View.combineMeasuredStates(0, 0) + 15, 999 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (7617 - (ViewConfiguration.getJumpTapTimeout() >> 16)), objArr53);
                hashMap.put(((String) objArr53[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.2

                    /* renamed from: ｋ, reason: contains not printable characters */
                    private bl f854;

                    {
                        this.f854 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return bl.m3689((DTBAdSize) list.get(0));
                    }
                });
                Object[] objArr54 = new Object[1];
                a(TextUtils.getTrimmedLength("") + 20, TextUtils.lastIndexOf("", '0') + u2.j, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43962), objArr54);
                hashMap.put(((String) objArr54[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.4

                    /* renamed from: ｋ, reason: contains not printable characters */
                    private bl f860;

                    {
                        this.f860 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return bl.m3702((DTBAdSize) list.get(0));
                    }
                });
                Object[] objArr55 = new Object[1];
                a(TextUtils.indexOf((CharSequence) "", '0') + 23, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr55);
                hashMap.put(((String) objArr55[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.9

                    /* renamed from: ﾇ, reason: contains not printable characters */
                    private bl f865;

                    {
                        this.f865 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return Boolean.valueOf(bl.m3683((DTBAdSize) list.get(0)));
                    }
                });
                Object[] objArr56 = new Object[1];
                a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1055, (char) (52356 - Drawable.resolveOpacity(0, 0)), objArr56);
                hashMap.put(((String) objArr56[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.7

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private bl f863;

                    {
                        this.f863 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return bl.m3685(this.f863, (HashMap) list.get(0), cpVar);
                    }
                });
                Object[] objArr57 = new Object[1];
                a(23 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1084, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 26635), objArr57);
                hashMap.put(((String) objArr57[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.6

                    /* renamed from: ﾇ, reason: contains not printable characters */
                    private bl f862;

                    {
                        this.f862 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return bl.m3690(this.f862, (ThreadPoolExecutor) list.get(0), cpVar);
                    }
                });
                Object[] objArr58 = new Object[1];
                a(Drawable.resolveOpacity(0, 0) + 15, 1108 - TextUtils.getTrimmedLength(""), (char) TextUtils.getTrimmedLength(""), objArr58);
                hashMap.put(((String) objArr58[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.8

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private bl f864;

                    {
                        this.f864 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return (ApsAdRequest) bl.m3696(new Object[]{(ApsAd) list.get(0)}, 1176644949, -1176644944, (int) System.currentTimeMillis());
                    }
                });
                Object[] objArr59 = new Object[1];
                a(TextUtils.getCapsMode("", 0, 0) + 10, 1123 - (Process.myTid() >> 22), (char) (28978 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr59);
                hashMap.put(((String) objArr59[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.10

                    /* renamed from: ﻐ, reason: contains not printable characters */
                    private bl f844;

                    {
                        this.f844 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return bl.m3693((ApsAd) list.get(0));
                    }
                });
                Object[] objArr60 = new Object[1];
                a(12 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1133, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr60);
                hashMap.put(((String) objArr60[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.14

                    /* renamed from: ﻐ, reason: contains not printable characters */
                    private bl f848;

                    {
                        this.f848 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return (String) bl.m3696(new Object[]{(ApsAd) list.get(0)}, -2105444157, 2105444164, (int) System.currentTimeMillis());
                    }
                });
                Object[] objArr61 = new Object[1];
                a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1147, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 65337), objArr61);
                hashMap.put(((String) objArr61[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.15

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private bl f849;

                    {
                        this.f849 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return bl.m3697((ApsAd) list.get(0));
                    }
                });
                Object[] objArr62 = new Object[1];
                a(14 - View.resolveSize(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1156, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9753), objArr62);
                hashMap.put(((String) objArr62[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.13

                    /* renamed from: ﾇ, reason: contains not printable characters */
                    private bl f847;

                    {
                        this.f847 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return bl.m3684((ApsAd) list.get(0));
                    }
                });
                Object[] objArr63 = new Object[1];
                a(KeyEvent.normalizeMetaState(0) + 11, 1170 - TextUtils.lastIndexOf("", '0'), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr63);
                hashMap.put(((String) objArr63[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.12

                    /* renamed from: ﾇ, reason: contains not printable characters */
                    private bl f846;

                    {
                        this.f846 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return bl.m3670((ApsAd) list.get(0));
                    }
                });
                Object[] objArr64 = new Object[1];
                a(Drawable.resolveOpacity(0, 0) + 9, ImageFormat.getBitsPerPixel(0) + 1183, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr64);
                hashMap.put(((String) objArr64[0]).intern(), new bm.d(blVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bl.20

                    /* renamed from: ﻐ, reason: contains not printable characters */
                    private bl f855;

                    {
                        this.f855 = blVar;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                    /* renamed from: ﻛ */
                    public final Object mo3630(List<Object> list, cp cpVar) {
                        return bl.m3673((ApsAd) list.get(0));
                    }
                });
                f842 = (f840 + 115) % 128;
                m3695 = hashMap;
                break;
            case 5:
                m3695 = m3686(objArr);
                break;
            case 6:
                m3695 = m3692(objArr);
                break;
            case 7:
                m3695 = m3674(objArr);
                break;
            case 8:
                m3695 = m3676(objArr);
                break;
            case 9:
                m3695 = m3668(objArr);
                break;
            default:
                m3695 = m3681(objArr);
                break;
        }
        return m3695;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m3697(ApsAd apsAd) {
        f840 = (f842 + 115) % 128;
        String m3658 = m3658(apsAd);
        f842 = (f840 + 69) % 128;
        return m3658;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m3698(DTBAdResponse dTBAdResponse) {
        f842 = (f840 + 9) % 128;
        String m3675 = m3675(dTBAdResponse);
        int i = f840 + 91;
        f842 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m3675;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m3699(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        f842 = (f840 + 95) % 128;
        String m3701 = m3701(dTBAdResponse, dTBAdSize);
        f842 = (f840 + 63) % 128;
        return m3701;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static /* synthetic */ Object m3700(Object[] objArr) {
        DTBAdSize dTBAdSize = (DTBAdSize) objArr[0];
        int i = f842 + 37;
        f840 = i % 128;
        boolean isInterstitialAd = dTBAdSize.isInterstitialAd();
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return Boolean.valueOf(isInterstitialAd);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m3701(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        f840 = (f842 + 121) % 128;
        String pricePoints = dTBAdResponse.getPricePoints(dTBAdSize);
        f842 = (f840 + 121) % 128;
        return pricePoints;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m3702(DTBAdSize dTBAdSize) {
        f842 = (f840 + 91) % 128;
        JSONObject m3672 = m3672(dTBAdSize);
        int i = f840 + 89;
        f842 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m3672;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﮐ, reason: contains not printable characters */
    public final String mo3703() {
        return (String) m3696(new Object[]{this}, 450216520, -450216520, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Class mo3627(String str) {
        return (Class) m3696(new Object[]{this, str}, -168677147, 168677150, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Map mo3628() {
        return (Map) m3696(new Object[]{this}, 1706059446, -1706059442, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾒ */
    public final String mo3629() {
        f842 = (f840 + 79) % 128;
        String mo3703 = mo3703();
        Object[] objArr = new Object[1];
        a(13 - TextUtils.indexOf("", "", 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        Matcher matcher = Pattern.compile(((String) objArr[0]).intern()).matcher(mo3703);
        if (!matcher.matches()) {
            f842 = (f840 + 81) % 128;
            return null;
        }
        int i = f840 + 119;
        f842 = i % 128;
        return i % 2 == 0 ? matcher.group(1) : matcher.group(1);
    }
}
