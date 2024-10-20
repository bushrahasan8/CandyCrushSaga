package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
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
import com.five_corp.ad.CreativeType;
import com.five_corp.ad.FiveAd;
import com.five_corp.ad.FiveAdConfig;
import com.five_corp.ad.FiveAdCustomLayout;
import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdListener;
import com.five_corp.ad.FiveAdLoadListener;
import com.five_corp.ad.FiveAdViewEventListener;
import com.ironsource.adqualitysdk.sdk.i.bm;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: bs.class */
public final class bs extends bm {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f990 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f991;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f992;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f993;

    static {
        m3863();
        ViewConfiguration.getFadingEdgeLength();
        TextUtils.indexOf("", "", 0, 0);
        ViewConfiguration.getKeyRepeatTimeout();
        PointF.length(0.0f, 0.0f);
        SystemClock.currentThreadTimeMillis();
        Color.rgb(0, 0, 0);
        ExpandableListView.getPackedPositionForGroup(0);
        ViewConfiguration.getScrollBarSize();
        ViewConfiguration.getLongPressTimeout();
        ViewConfiguration.getMaximumFlingVelocity();
        Color.red(0);
        AndroidCharacter.getMirror('0');
        Color.rgb(0, 0, 0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        SystemClock.uptimeMillis();
        View.MeasureSpec.getMode(0);
        View.resolveSizeAndState(0, 0, 0);
        ViewConfiguration.getScrollDefaultDelay();
        ImageFormat.getBitsPerPixel(0);
        Process.myPid();
        TypedValue.complexToFloat(0);
        Gravity.getAbsoluteGravity(0, 0);
        ExpandableListView.getPackedPositionForGroup(0);
        KeyEvent.getMaxKeyCode();
        TypedValue.complexToFloat(0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        Color.blue(0);
        MotionEvent.axisFromString("");
        Process.myTid();
        TextUtils.lastIndexOf("", '0', 0, 0);
        KeyEvent.getMaxKeyCode();
        TypedValue.complexToFloat(0);
        TextUtils.lastIndexOf("", '0', 0, 0);
        TextUtils.getOffsetAfter("", 0);
        View.resolveSize(0, 0);
        ExpandableListView.getPackedPositionType(0L);
        View.MeasureSpec.getMode(0);
        TextUtils.getOffsetAfter("", 0);
        KeyEvent.getDeadChar(0, 0);
        ImageFormat.getBitsPerPixel(0);
        TextUtils.getTrimmedLength("");
        ExpandableListView.getPackedPositionChild(0L);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        View.MeasureSpec.getMode(0);
        ViewConfiguration.getLongPressTimeout();
        ImageFormat.getBitsPerPixel(0);
        KeyEvent.getMaxKeyCode();
        Process.getGidForName("");
        ViewConfiguration.getScrollBarFadeDuration();
        Process.myTid();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        SystemClock.currentThreadTimeMillis();
        TextUtils.lastIndexOf("", '0', 0, 0);
        Color.red(0);
        AudioTrack.getMaxVolume();
        KeyEvent.getMaxKeyCode();
        ViewConfiguration.getDoubleTapTimeout();
        ExpandableListView.getPackedPositionChild(0L);
        TextUtils.indexOf("", "", 0);
        ViewConfiguration.getWindowTouchSlop();
        ExpandableListView.getPackedPositionType(0L);
        Process.getElapsedCpuTime();
        Process.getThreadPriority(0);
        int i = f993 + 5;
        f990 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public bs(String str) {
        super(str);
    }

    private static void a(String str, int i, Object[] objArr) {
        int i2 = ($10 + 27) % 128;
        $11 = i2;
        if (str != null) {
            int i3 = i2 + 11;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            str = str.toCharArray();
        }
        n nVar = new n();
        char[] m5750 = n.m5750(f992 ^ (-7438370749274812225L), (char[]) str, i);
        nVar.f3042 = 4;
        while (true) {
            int i4 = nVar.f3042;
            if (i4 >= m5750.length) {
                objArr[0] = new String(m5750, 4, m5750.length - 4);
                return;
            }
            int i5 = i4 - 4;
            nVar.f3041 = i5;
            long j = m5750[i4] ^ m5750[i4 % 4];
            long j2 = i5;
            long j3 = f992;
            try {
                Map map = b.f452;
                Object obj = map.get(983860882);
                if (obj == null) {
                    Class cls = (Class) b.m3371((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.getOffsetBefore("", 0) + 41);
                    Class<?> cls2 = Long.TYPE;
                    obj = cls.getMethod("p", cls2, cls2, cls2);
                    map.put(983860882, obj);
                }
                m5750[i4] = ((Character) ((Method) obj).invoke(null, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3))).charValue();
                Object obj2 = map.get(-2082235053);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 40)).getMethod("q", Object.class, Object.class);
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(int r7, int r8, boolean r9, int r10, java.lang.String r11, java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bs.b(int, int, boolean, int, java.lang.String, java.lang.Object[]):void");
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static FiveAd m3850() {
        int i = f990 + 69;
        f993 = i % 128;
        if (i % 2 != 0) {
            FiveAd.getSingleton();
            throw null;
        }
        FiveAd singleton = FiveAd.getSingleton();
        f993 = (f990 + 85) % 128;
        return singleton;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static String m3851(FiveAdInterface fiveAdInterface) {
        int i = f990 + 89;
        f993 = i % 128;
        if (i % 2 != 0) {
            fiveAdInterface.getFiveAdTag();
            throw null;
        }
        String fiveAdTag = fiveAdInterface.getFiveAdTag();
        int i2 = f990 + 93;
        f993 = i2 % 128;
        if (i2 % 2 == 0) {
            return fiveAdTag;
        }
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static FiveAdListener m3852(FiveAdInterface fiveAdInterface) {
        f990 = (f993 + 13) % 128;
        FiveAdListener listener = fiveAdInterface.getListener();
        f993 = (f990 + 17) % 128;
        return listener;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static String m3853(FiveAdInterface fiveAdInterface) {
        int i = f990 + 71;
        f993 = i % 128;
        if (i % 2 == 0) {
            return fiveAdInterface.getAdParameter();
        }
        fiveAdInterface.getAdParameter();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static CreativeType m3854(FiveAdInterface fiveAdInterface) {
        int i = f993 + 93;
        f990 = i % 128;
        if (i % 2 == 0) {
            fiveAdInterface.getCreativeType();
            throw null;
        }
        CreativeType creativeType = fiveAdInterface.getCreativeType();
        f993 = (f990 + 113) % 128;
        return creativeType;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ FiveAdListener m3855(FiveAdInterface fiveAdInterface) {
        f993 = (f990 + 125) % 128;
        FiveAdListener m3852 = m3852(fiveAdInterface);
        f993 = (f990 + 37) % 128;
        return m3852;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static /* synthetic */ Object m3856(Object[] objArr) {
        FiveAdInterface fiveAdInterface = (FiveAdInterface) objArr[0];
        FiveAdListener fiveAdListener = (FiveAdListener) objArr[1];
        int i = f993 + 55;
        f990 = i % 128;
        fiveAdInterface.setListener(fiveAdListener);
        if (i % 2 == 0) {
            throw null;
        }
        f993 = (f990 + 21) % 128;
        return null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m3857(Object[] objArr, int i, int i2, int i3) {
        Object m3865;
        int i4 = i ^ (-1);
        int i5 = (i | i2) ^ (-1);
        int i6 = (i * (-375)) + (i2 * (-375)) + (((((i2 ^ (-1)) | i4) ^ (-1)) | i3 | i5) * 376) + ((((i | (i3 ^ (-1))) ^ (-1)) | i5) * (-376)) + ((((i4 | i3) ^ (-1)) | i2) * 376);
        if (i6 == 1) {
            m3865 = m3865(objArr);
        } else if (i6 != 2) {
            m3865 = i6 != 3 ? i6 != 4 ? m3861(objArr) : m3869(objArr) : m3856(objArr);
        } else {
            f993 = (f990 + 123) % 128;
            m3865 = m3850();
            f993 = (f990 + 77) % 128;
        }
        return m3865;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m3858(FiveAdConfig fiveAdConfig) {
        int i = f990 + 1;
        f993 = i % 128;
        String str = fiveAdConfig.appId;
        if (i % 2 != 0) {
            throw null;
        }
        f990 = (f993 + 41) % 128;
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m3859(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        f993 = (f990 + 33) % 128;
        m3857(new Object[]{fiveAdInterface, fiveAdListener}, 1789614360, -1789614357, (int) System.currentTimeMillis());
        int i = f990 + 57;
        f993 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m3860(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        int i = f990 + 9;
        f993 = i % 128;
        m3867(fiveAdInterface, fiveAdLoadListener);
        if (i % 2 != 0) {
            throw null;
        }
        f993 = (f990 + 115) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static /* synthetic */ Object m3861(Object[] objArr) {
        FiveAdInterface fiveAdInterface = (FiveAdInterface) objArr[0];
        FiveAdViewEventListener fiveAdViewEventListener = (FiveAdViewEventListener) objArr[1];
        int i = f990 + 35;
        f993 = i % 128;
        m3868(fiveAdInterface, fiveAdViewEventListener);
        if (i % 2 != 0) {
            throw null;
        }
        f993 = (f990 + 27) % 128;
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m3862(FiveAdInterface fiveAdInterface) {
        f993 = (f990 + 79) % 128;
        String m3853 = m3853(fiveAdInterface);
        f990 = (f993 + 91) % 128;
        return m3853;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m3863() {
        f992 = 907593988362693790L;
        f991 = 287397401;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ CreativeType m3864(FiveAdInterface fiveAdInterface) {
        int i = f993 + 109;
        f990 = i % 128;
        if (i % 2 == 0) {
            m3854(fiveAdInterface);
            throw null;
        }
        CreativeType m3854 = m3854(fiveAdInterface);
        int i2 = f990 + 79;
        f993 = i2 % 128;
        if (i2 % 2 == 0) {
            return m3854;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ Object m3865(Object[] objArr) {
        FiveAdInterface fiveAdInterface = (FiveAdInterface) objArr[0];
        int i = f990 + 9;
        f993 = i % 128;
        if (i % 2 != 0) {
            fiveAdInterface.getSlotId();
            throw null;
        }
        String slotId = fiveAdInterface.getSlotId();
        int i2 = f993 + 39;
        f990 = i2 % 128;
        if (i2 % 2 != 0) {
            return slotId;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m3866(FiveAdConfig fiveAdConfig) {
        int i = f990 + 71;
        f993 = i % 128;
        if (i % 2 == 0) {
            return m3858(fiveAdConfig);
        }
        m3858(fiveAdConfig);
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m3867(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        f990 = (f993 + 91) % 128;
        fiveAdInterface.setLoadListener(fiveAdLoadListener);
        f990 = (f993 + 25) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m3868(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        int i = f993 + 39;
        f990 = i % 128;
        fiveAdInterface.setViewEventListener(fiveAdViewEventListener);
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static /* synthetic */ Object m3869(Object[] objArr) {
        FiveAdCustomLayout fiveAdCustomLayout = (FiveAdCustomLayout) objArr[0];
        int i = f993 + 41;
        f990 = i % 128;
        if (i % 2 != 0) {
            return m3870(fiveAdCustomLayout);
        }
        m3870(fiveAdCustomLayout);
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m3870(FiveAdCustomLayout fiveAdCustomLayout) {
        int i = f990 + 113;
        f993 = i % 128;
        String advertiserName = fiveAdCustomLayout.getAdvertiserName();
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        f993 = (f990 + 101) % 128;
        return advertiserName;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m3871(FiveAdInterface fiveAdInterface) {
        f990 = (f993 + 27) % 128;
        String str = (String) m3857(new Object[]{fiveAdInterface}, -1802475093, 1802475094, (int) System.currentTimeMillis());
        int i = f993 + 105;
        f990 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m3872(FiveAdInterface fiveAdInterface) {
        int i = f993 + 1;
        f990 = i % 128;
        String m3851 = m3851(fiveAdInterface);
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m3851;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x04f8, code lost:
    
        if (r8.equals(((java.lang.String) r0[0]).intern()) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x036c, code lost:
    
        if (r8.equals(((java.lang.String) r0[0]).intern()) != false) goto L67;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Class mo3627(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 1550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bs.mo3627(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Map mo3628() {
        HashMap hashMap = new HashMap();
        Object[] objArr = new Object[1];
        b(20 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 9 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), true, 149 - View.MeasureSpec.getMode(0), "\u0003￨\u000f\u000f￠\u0013\u0004\u0006\u0006\b\u0005\r\u000e￢\u0003￠\f\u000e\u0011￥", objArr);
        hashMap.put(((String) objArr[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.bs.2

            /* renamed from: ﻐ, reason: contains not printable characters */
            private bs f997;

            {
                this.f997 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return bs.m3866((FiveAdConfig) list.get(0));
            }
        });
        Object[] objArr2 = new Object[1];
        b((ViewConfiguration.getWindowTouchSlop() >> 8) + 24, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 5, false, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 151, "\f\u0011￦\u0001\u0004\u0002\u0011￣\u0006\u0013\u0002\uffde\u0001￦\u000b\u0011\u0002\u000f\u0003\ufffe��\u0002\ufff0\t", objArr2);
        hashMap.put(((String) objArr2[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.bs.4

            /* renamed from: ｋ, reason: contains not printable characters */
            private bs f999;

            {
                this.f999 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return bs.m3871((FiveAdInterface) list.get(0));
            }
        });
        Object[] objArr3 = new Object[1];
        a("㥔㤳⏬\uee05⪓�즹㍻ﺐ㨐ᘳ��ˈ켗ன\ue8bdቷ�ᬸﬧ懼갵梤讧", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
        hashMap.put(((String) objArr3[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.bs.3

            /* renamed from: ﻐ, reason: contains not printable characters */
            private bs f998;

            {
                this.f998 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return bs.m3872((FiveAdInterface) list.get(0));
            }
        });
        Object[] objArr4 = new Object[1];
        b((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29, 14 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), false, 153 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0001\uffdf\u000e\u0001�\u0010\u0005\u0012\u0001\ufff0\u0015\f\u0001\u0003\u0001\u0010￢\u0005\u0012\u0001\uffdd��￥\n\u0010\u0001\u000e\u0002�\uffff", objArr4);
        hashMap.put(((String) objArr4[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.bs.10

            /* renamed from: ﻐ, reason: contains not printable characters */
            private bs f995;

            {
                this.f995 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return bs.m3864((FiveAdInterface) list.get(0));
            }
        });
        Object[] objArr5 = new Object[1];
        a("蚵蛒〰埃雷챴癘₧䝖虴꿵拒柙ᄔ监럍坜ƫ晝Ꝝ䓆爠ᗦ퓅㑱抠Ց쑄◀匨㓛\uf5ccᕛ", 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr5);
        hashMap.put(((String) objArr5[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.bs.9

            /* renamed from: ﻐ, reason: contains not printable characters */
            private bs f1004;

            {
                this.f1004 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return bs.m3862((FiveAdInterface) list.get(0));
            }
        });
        Object[] objArr6 = new Object[1];
        b((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, 14 - Color.blue(0), true, 153 - TextUtils.getOffsetAfter("", 0), "\r��\u000f\t￤\uffffￜ��\u0011\u0004￡\u000f��\u0002\r��\t��\u000f\u000e\u0004\uffe7��\ufffe￼\u0001", objArr6);
        hashMap.put(((String) objArr6[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.bs.7

            /* renamed from: ﻛ, reason: contains not printable characters */
            private bs f1002;

            {
                this.f1002 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return bs.m3855((FiveAdInterface) list.get(0));
            }
        });
        Object[] objArr7 = new Object[1];
        a("₶\u20c5\u2072떮䷍�큛ュꔻ嵎䶘맨쇚Ŗ钼泷\uf15fᇩ萰籦\ue2c5扢\uf786\u0ff2鉑狷\ue72bά菋䍽", 1 - View.MeasureSpec.getSize(0), objArr7);
        hashMap.put(((String) objArr7[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.bs.6

            /* renamed from: ﾇ, reason: contains not printable characters */
            private bs f1001;

            {
                this.f1001 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                bs.m3859((FiveAdInterface) list.get(0), (FiveAdListener) list.get(1));
                return null;
            }
        });
        Object[] objArr8 = new Object[1];
        b(TextUtils.indexOf((CharSequence) "", '0') + 19, TextUtils.getOffsetAfter("", 0) + 3, true, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 153, "\u000f��\u0002\t\n\u000f��\u0007\u0002\t\u0004￮\uffffￜ��\u0011\u0004￡", objArr8);
        hashMap.put(((String) objArr8[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.bs.8

            /* renamed from: ﾒ, reason: contains not printable characters */
            private bs f1003;

            {
                this.f1003 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return (FiveAd) bs.m3857(new Object[0], -137363577, 137363579, (int) System.currentTimeMillis());
            }
        });
        Object[] objArr9 = new Object[1];
        b((KeyEvent.getMaxKeyCode() >> 16) + 35, 14 - Color.argb(0, 0, 0, 0), false, 154 - Color.argb(0, 0, 0, 0), "ￛ\ufffe\u0010\uffff\f\u000e\u0003\r\uffff\f￨\ufffb\u0007\uffff\u0001\uffff\u000e￠\u0003\u0010\uffffￛ\ufffe\uffdd\u000f\r\u000e\t\u0007￦\ufffb\u0013\t\u000f\u000e", objArr9);
        hashMap.put(((String) objArr9[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.bs.15

            /* renamed from: ﻐ, reason: contains not printable characters */
            private bs f996;

            {
                this.f996 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return (String) bs.m3857(new Object[]{(FiveAdCustomLayout) list.get(0)}, 1983340419, -1983340415, (int) System.currentTimeMillis());
            }
        });
        Object[] objArr10 = new Object[1];
        a("卺匉騐賎툌晔ꎑ誐鱚슈瓸☣눛묎귆\uf32d芘ꮜ뵄", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr10);
        hashMap.put(((String) objArr10[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.bs.1

            /* renamed from: ﻐ, reason: contains not printable characters */
            private bs f994;

            {
                this.f994 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                bs.m3860((FiveAdInterface) list.get(0), (FiveAdLoadListener) list.get(1));
                return null;
            }
        });
        Object[] objArr11 = new Object[1];
        b(21 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 12, false, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 155, "\u000e�\u0006\f￤\u0001\u000b\f�\u0006�\n\u000b�\f￮\u0001�\u000f\uffdd", objArr11);
        hashMap.put(((String) objArr11[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.bs.5

            /* renamed from: ﻐ, reason: contains not printable characters */
            private bs f1000;

            {
                this.f1000 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                bs.m3857(new Object[]{(FiveAdInterface) list.get(0), (FiveAdViewEventListener) list.get(1)}, -334007669, 334007669, (int) System.currentTimeMillis());
                return null;
            }
        });
        f990 = (f993 + 35) % 128;
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾒ */
    public final String mo3629() {
        int i = f993 + 15;
        f990 = i % 128;
        if (i % 2 != 0) {
            return FiveAd.getSdkSemanticVersion();
        }
        FiveAd.getSdkSemanticVersion();
        throw new ArithmeticException("divide by zero");
    }
}
