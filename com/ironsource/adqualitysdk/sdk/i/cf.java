package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
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
import com.ironsource.adqualitysdk.sdk.i.bm;
import com.ogury.sdk.Ogury;
import io.presage.Presage;
import io.presage.common.AdConfig;
import io.presage.common.PresageSdk;
import io.presage.common.network.models.RewardItem;
import io.presage.interstitial.InterstitialActivity;
import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: cf.class */
public final class cf extends bm {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1230 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1231 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1232;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1233;

    static {
        m4199();
        View.resolveSizeAndState(0, 0, 0);
        ViewConfiguration.getJumpTapTimeout();
        View.resolveSize(0, 0);
        TextUtils.getOffsetAfter("", 0);
        ViewConfiguration.getKeyRepeatDelay();
        Process.myPid();
        Color.rgb(0, 0, 0);
        SystemClock.uptimeMillis();
        Color.red(0);
        KeyEvent.keyCodeFromString("");
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        Process.getGidForName("");
        AudioTrack.getMaxVolume();
        TextUtils.indexOf((CharSequence) "", '0');
        TextUtils.getCapsMode("", 0, 0);
        ViewConfiguration.getFadingEdgeLength();
        TextUtils.getCapsMode("", 0, 0);
        Process.getGidForName("");
        ViewConfiguration.getPressedStateDuration();
        SystemClock.uptimeMillis();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        int i = f1231 + 79;
        f1230 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public cf(String str) {
        super(str);
    }

    private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
        int length;
        int i;
        int i2 = $11 + 51;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str2 = str;
        if (str != null) {
            str2 = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) str2;
        j jVar = new j();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = f1232;
        char[] cArr2 = cArr;
        if (cArr != null) {
            int i7 = $10 + 93;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr.length;
                cArr2 = new char[length];
                i = 1;
            } else {
                length = cArr.length;
                cArr2 = new char[length];
                i = 0;
            }
            while (i < length) {
                char c = cArr[i];
                try {
                    Map map = b.f452;
                    Object obj = map.get(123012079);
                    if (obj == null) {
                        obj = ((Class) b.m3371('0' - AndroidCharacter.getMirror('0'), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.blue(0) + 41)).getMethod("t", Integer.TYPE);
                        map.put(123012079, obj);
                    }
                    cArr2[i] = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c))).charValue();
                    i++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        char[] cArr4 = cArr3;
        if (bArr != null) {
            cArr4 = new char[i4];
            jVar.f2705 = 0;
            char c2 = 0;
            while (true) {
                int i8 = jVar.f2705;
                if (i8 >= i4) {
                    break;
                }
                if (bArr[i8] == 1) {
                    char c3 = cArr3[i8];
                    Map map2 = b.f452;
                    Object obj2 = map2.get(-1475644584);
                    if (obj2 == null) {
                        Class cls = (Class) b.m3371(ViewConfiguration.getPressedStateDuration() >> 16, (char) Color.green(0), 40 - ExpandableListView.getPackedPositionChild(0L));
                        Class<?> cls2 = Integer.TYPE;
                        obj2 = cls.getMethod("v", cls2, cls2);
                        map2.put(-1475644584, obj2);
                    }
                    cArr4[i8] = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c3), Integer.valueOf(c2))).charValue();
                } else {
                    char c4 = cArr3[i8];
                    Map map3 = b.f452;
                    Object obj3 = map3.get(1186866459);
                    if (obj3 == null) {
                        Class cls3 = (Class) b.m3371(Color.blue(0), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 41);
                        Class<?> cls4 = Integer.TYPE;
                        obj3 = cls3.getMethod("y", cls4, cls4);
                        map3.put(1186866459, obj3);
                    }
                    cArr4[i8] = ((Character) ((Method) obj3).invoke(null, Integer.valueOf(c4), Integer.valueOf(c2))).charValue();
                }
                c2 = cArr4[jVar.f2705];
                Map map4 = b.f452;
                Object obj4 = map4.get(-811294887);
                if (obj4 == null) {
                    obj4 = ((Class) b.m3371(ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) View.resolveSize(0, 0), View.combineMeasuredStates(0, 0) + 41)).getMethod("w", Object.class, Object.class);
                    map4.put(-811294887, obj4);
                }
                ((Method) obj4).invoke(null, jVar, jVar);
            }
        }
        if (i6 > 0) {
            int i9 = $11 + 97;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr4, 0, cArr5, 1, i4);
                System.arraycopy(cArr5, 1, cArr4, i4 + i6, i6);
                System.arraycopy(cArr5, i6, cArr4, 1, i4 >>> i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr4, 0, cArr6, 0, i4);
                int i10 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr4, i10, i6);
                System.arraycopy(cArr6, i6, cArr4, 0, i10);
            }
        }
        int i11 = 0;
        char[] cArr7 = cArr4;
        if (z) {
            $11 = ($10 + 75) % 128;
            cArr7 = new char[i4];
            while (true) {
                jVar.f2705 = i11;
                int i12 = jVar.f2705;
                if (i12 >= i4) {
                    break;
                }
                $11 = ($10 + 97) % 128;
                cArr7[i12] = cArr4[(i4 - i12) - 1];
                i11 = i12 + 1;
            }
            $10 = ($11 + 49) % 128;
        }
        char[] cArr8 = cArr7;
        if (i5 > 0) {
            int i13 = $11 + 67;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                jVar.f2705 = 1;
            } else {
                jVar.f2705 = 0;
            }
            while (true) {
                int i14 = jVar.f2705;
                cArr8 = cArr7;
                if (i14 >= i4) {
                    break;
                }
                cArr7[i14] = (char) (cArr7[i14] - iArr[2]);
                jVar.f2705 = i14 + 1;
            }
        }
        objArr[0] = new String(cArr8);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(int r7, int r8, boolean r9, int r10, java.lang.String r11, java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cf.b(int, int, boolean, int, java.lang.String, java.lang.Object[]):void");
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static Presage m4197() {
        int i = f1231 + 5;
        f1230 = i % 128;
        if (i % 2 == 0) {
            return Presage.getInstance();
        }
        Presage.getInstance();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m4198(Object[] objArr, int i, int i2, int i3) {
        int i4 = i ^ (-1);
        int i5 = i3 ^ (-1);
        int i6 = ((i2 ^ (-1)) | i3) ^ (-1);
        return ((((i * (-574)) + (i2 * (-574))) + ((((i4 | i5) ^ (-1)) | i6) * 1150)) + ((((i2 | i5) ^ (-1)) | i6) * (-575))) + ((((i | i5) ^ (-1)) | ((i4 | i3) ^ (-1))) * 575) != 1 ? m4204(objArr) : m4202(objArr);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static void m4199() {
        f1232 = new char[]{37232, 37178, 37154, 37155, 37155, 37154, 37159, 37150, 37146, 37162, 37161, 37154, 37154, 37154, 37183, 37182, 37159, 37152, 37181, 37143, 37239, 37121, 37162, 37161, 37154, 37154, 37154, 37183, 37182, 37159, 37152, 37181, 37159, 37127, 37125, 37162, 37160, 37158, 37152, 37159, 37181, 37123, 37122, 37152, 37120, 37336, 37342, 37313, 37174, 37244, 37158, 37152, 37159, 37165, 37138, 37162, 37161, 37154, 37154, 37154, 37183, 37182, 37159, 37152, 37181, 37143, 37147, 37162, 37243, 37158, 37160, 37162, 37139, 37166, 37159, 37154, 37182, 37139, 37142, 37162, 37160, 37158, 37152, 37159, 37165, 37243, 37159, 37154, 37182, 37139, 37142, 37162, 37160, 37158, 37152, 37159, 37165, 37137, 37163, 37166, 37165, 37163, 37152, 37162, 37150, 37141, 37158, 37160, 37162, 37139, 37242, 37157, 37152, 37138, 37146, 37159, 37157, 37152, 37154, 37143, 37228, 37150, 37151, 37141, 37154, 37158, 37163, 37156, 37247, 37162, 37152, 37166, 37165, 37159, 37152, 37158, 37160, 37162, 37147, 37143, 37180, 37183, 37158, 37163, 37156, 37160, 37171, 37285, 37290, 37296, 37307, 37306, 37297, 37298, 37301, 37301, 37301, 37308, 37309, 37294, 37265, 37309, 37307, 37310, 37280, 37281, 37310, 37302, 37307, 37244};
        f1233 = 287397566;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Presage m4200() {
        f1231 = (f1230 + 43) % 128;
        Presage m4197 = m4197();
        f1230 = (f1231 + 125) % 128;
        return m4197;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m4201(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        int i = f1231 + 19;
        f1230 = i % 128;
        Object[] objArr = new Object[2];
        if (i % 2 == 0) {
            objArr[0] = presageOptinVideo;
            objArr[1] = presageOptinVideoCallback;
            m4198(objArr, -1378161475, 1378161475, (int) System.currentTimeMillis());
        } else {
            objArr[0] = presageOptinVideo;
            objArr[1] = presageOptinVideoCallback;
            m4198(objArr, -1378161475, 1378161475, (int) System.currentTimeMillis());
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ Object m4202(Object[] objArr) {
        PresageInterstitial presageInterstitial = (PresageInterstitial) objArr[0];
        PresageInterstitialCallback presageInterstitialCallback = (PresageInterstitialCallback) objArr[1];
        int i = f1231 + 83;
        f1230 = i % 128;
        m4203(presageInterstitial, presageInterstitialCallback);
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m4203(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        int i = f1230 + 5;
        f1231 = i % 128;
        presageInterstitial.setInterstitialCallback(presageInterstitialCallback);
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static /* synthetic */ Object m4204(Object[] objArr) {
        PresageOptinVideo presageOptinVideo = (PresageOptinVideo) objArr[0];
        PresageOptinVideoCallback presageOptinVideoCallback = (PresageOptinVideoCallback) objArr[1];
        f1230 = (f1231 + 79) % 128;
        presageOptinVideo.setOptinVideoCallback(presageOptinVideoCallback);
        int i = f1231 + 15;
        f1230 = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﮐ */
    public final String mo3703() {
        f1231 = (f1230 + 79) % 128;
        String str = null;
        try {
            Object[] objArr = new Object[1];
            b((ViewConfiguration.getFadingEdgeLength() >> 16) + 47, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 32, false, 246 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\f\u000bￋ\u0006\u0003ￋ\ufff3\ufffe��\u0005\u0002\u000f\u0006\u000b\u0001\u0012\u0005\ufffe\u0012\u0011￡\f\u0012\uffff\u0010￪\f\u000b\u0011\u0001￬\u000f\u0006\fￋ\r\u000f\u0002\u0010\ufffe\u0004\u0002ￋ��\f\n\n", objArr);
            Class<?> cls = Class.forName(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a(true, new int[]{169, 1, 0, 0}, "\u0001", objArr2);
            String str2 = (String) cls.getMethod(((String) objArr2[0]).intern(), null).invoke(null, null);
            int i = f1230 + 97;
            f1231 = i % 128;
            if (i % 2 != 0) {
                return str2;
            }
            throw null;
        } catch (Exception e) {
            try {
                str = PresageSdk.getAdsSdkVersion();
            } catch (Throwable th) {
            }
            return str;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Class mo3627(String str) {
        boolean z = 6;
        switch (str.hashCode()) {
            case -2101347995:
                Object[] objArr = new Object[1];
                a(false, new int[]{120, 8, 0, 0}, "\u0001\u0001\u0001��\u0001��\u0001��", objArr);
                if (str.equals(((String) objArr[0]).intern())) {
                    z = 12;
                    break;
                }
                z = -1;
                break;
            case -1907784110:
                Object[] objArr2 = new Object[1];
                a(true, new int[]{68, 17, 0, 0}, "\u0001��\u0001\u0001\u0001��\u0001\u0001��\u0001����������\u0001��", objArr2);
                if (str.equals(((String) objArr2[0]).intern())) {
                    int i = f1231 + 11;
                    f1230 = i % 128;
                    if (i % 2 == 0) {
                        z = 9;
                        break;
                    } else {
                        z = 97;
                        break;
                    }
                }
                z = -1;
                break;
            case -1704786309:
                Object[] objArr3 = new Object[1];
                b(20 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 19, false, 253 - ((Process.getThreadPriority(0) + 20) >> 6), "\u0004\n\ufffb\b\t\n\uffff\n\uffff\ufff7\u0002ￗ\ufff9\n\uffff\f\uffff\n\u000f\uffdf", objArr3);
                if (str.equals(((String) objArr3[0]).intern())) {
                    f1231 = (f1230 + 75) % 128;
                    z = true;
                    break;
                }
                z = -1;
                break;
            case -938422005:
                Object[] objArr4 = new Object[1];
                b(TextUtils.indexOf("", "", 0, 0) + 10, 5 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), true, 246 - TextUtils.lastIndexOf("", '0'), "\u0003�\u000f\u0001\u000e￬\u0007��\uffef\u0001", objArr4);
                if (str.equals(((String) objArr4[0]).intern())) {
                    f1230 = (f1231 + 81) % 128;
                    break;
                }
                z = -1;
                break;
            case -610604286:
                Object[] objArr5 = new Object[1];
                a(true, new int[]{110, 10, 0, 0}, "\u0001��\u0001\u0001\u0001��\u0001����\u0001", objArr5);
                if (str.equals(((String) objArr5[0]).intern())) {
                    z = 11;
                    break;
                }
                z = -1;
                break;
            case -126768170:
                Object[] objArr6 = new Object[1];
                a(true, new int[]{0, 44, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001��\u0001\u0001��\u0001\u0001\u0001\u0001\u0001\u0001\u0001��\u0001\u0001��\u0001��\u0001\u0001\u0001\u0001\u0001\u0001\u0001��\u0001\u0001\u0001��������\u0001����\u0001��", objArr6);
                if (str.equals(((String) objArr6[0]).intern())) {
                    f1230 = (f1231 + 3) % 128;
                    z = false;
                    break;
                }
                z = -1;
                break;
            case 76142724:
                Object[] objArr7 = new Object[1];
                a(true, new int[]{44, 5, 31, 0}, "��\u0001\u0001����", objArr7);
                if (str.equals(((String) objArr7[0]).intern())) {
                    f1231 = (f1230 + 53) % 128;
                    z = 4;
                    break;
                }
                z = -1;
                break;
            case 698887547:
                Object[] objArr8 = new Object[1];
                a(true, new int[]{49, 19, 0, 5}, "\u0001����\u0001����\u0001��\u0001\u0001\u0001\u0001\u0001\u0001\u0001��\u0001����", objArr8);
                if (str.equals(((String) objArr8[0]).intern())) {
                    f1231 = (f1230 + 107) % 128;
                    z = 7;
                    break;
                }
                z = -1;
                break;
            case 1067648736:
                Object[] objArr9 = new Object[1];
                b(26 - TextUtils.indexOf((CharSequence) "", '0'), -TextUtils.indexOf((CharSequence) "", '0'), true, 249 - (ViewConfiguration.getTouchSlop() >> 8), "￪\u0005�\ufffb￼\u0006\u0006\ufffb\uffdd\u0006\ufffb\u0003\u000e\u0003\u000e\r\f\uffff\u000e\b￣\uffff\u0001\ufffb\r\uffff\f", objArr9);
                if (str.equals(((String) objArr9[0]).intern())) {
                    z = 8;
                    break;
                }
                z = -1;
                break;
            case 1346371759:
                Object[] objArr10 = new Object[1];
                b(AndroidCharacter.getMirror('0') - ')', 2 - MotionEvent.axisFromString(""), true, 248 - View.combineMeasuredStates(0, 0), "��\r￫��\u0002￼\u000e", objArr10);
                if (str.equals(((String) objArr10[0]).intern())) {
                    int i2 = f1230 + 57;
                    f1231 = i2 % 128;
                    if (i2 % 2 != 0) {
                        z = 5;
                        break;
                    }
                    z = 4;
                    break;
                }
                z = -1;
                break;
            case 1871097647:
                Object[] objArr11 = new Object[1];
                b(22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 21 - View.resolveSize(0, 0), false, TextUtils.getOffsetBefore("", 0) + 252, "��￠\u0005\u000b￼\t\n\u000b��\u000b��\ufff8\u0003\uffd8\ufffa\u000b��\r��\u000b\u0010￬", objArr11);
                if (str.equals(((String) objArr11[0]).intern())) {
                    z = 3;
                    break;
                }
                z = -1;
                break;
            case 2109755994:
                Object[] objArr12 = new Object[1];
                b(KeyEvent.keyCodeFromString("") + 47, TextUtils.indexOf((CharSequence) "", '0', 0) + 8, false, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 249, "�\u000e\u0003\u0010\u0003\u000e\u0013\u0003\t\uffc8\n\f\uffff\r\ufffb\u0001\uffff\uffc8\u0003\b\u000e\uffff\f\r\u000e\u0003\u000e\u0003\ufffb\u0006\uffc8\u000f\u0003\uffc8￣\b\u000e\uffff\f\r\u000e\u0003\u000e\u0003\ufffb\u0006ￛ", objArr12);
                if (str.equals(((String) objArr12[0]).intern())) {
                    f1230 = (f1231 + 79) % 128;
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case 2128976055:
                Object[] objArr13 = new Object[1];
                a(true, new int[]{85, 25, 0, 12}, "��\u0001\u0001��\u0001����������\u0001��\u0001����\u0001����\u0001������\u0001\u0001\u0001", objArr13);
                if (str.equals(((String) objArr13[0]).intern())) {
                    int i3 = f1231 + 81;
                    f1230 = i3 % 128;
                    if (i3 % 2 == 0) {
                        z = 10;
                        break;
                    } else {
                        z = 54;
                        break;
                    }
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        switch (z) {
            case false:
            case true:
                return InterstitialActivity.class;
            case true:
            case true:
                return io.presage.interstitial.ui.InterstitialActivity.class;
            case true:
                return Ogury.class;
            case true:
                return Presage.class;
            case true:
                return PresageSdk.class;
            case true:
                return PresageInterstitial.class;
            case true:
                f1231 = (f1230 + 67) % 128;
                return PresageInterstitialCallback.class;
            case true:
                return PresageOptinVideo.class;
            case true:
                return PresageOptinVideoCallback.class;
            case true:
                return RewardItem.class;
            case true:
                return AdConfig.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Map mo3628() {
        HashMap hashMap = new HashMap();
        Object[] objArr = new Object[1];
        a(false, new int[]{128, 18, 0, 0}, "\u0001��\u0001����\u0001����������\u0001\u0001\u0001\u0001\u0001\u0001��", objArr);
        hashMap.put(((String) objArr[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cf.2

            /* renamed from: ﻛ, reason: contains not printable characters */
            private cf f1235;

            {
                this.f1235 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cf.m4200();
            }
        });
        Object[] objArr2 = new Object[1];
        a(false, new int[]{146, 23, 139, 21}, "\u0001\u0001\u0001��\u0001\u0001\u0001\u0001\u0001\u0001\u0001��\u0001\u0001��\u0001����\u0001��������", objArr2);
        hashMap.put(((String) objArr2[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cf.4

            /* renamed from: ﻛ, reason: contains not printable characters */
            private cf f1236;

            {
                this.f1236 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                cf.m4198(new Object[]{(PresageInterstitial) list.get(0), (PresageInterstitialCallback) list.get(1)}, 1700009706, -1700009705, (int) System.currentTimeMillis());
                return null;
            }
        });
        Object[] objArr3 = new Object[1];
        b(((Process.getThreadPriority(0) + 20) >> 6) + 21, AndroidCharacter.getMirror('0') - '#', false, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 248, "\ufff1\u0004\uffff��\n\uffde￼\u0007\u0007�￼\ufffe\u0006\u000e��\u000f￪\u000b\u000f\u0004\t", objArr3);
        hashMap.put(((String) objArr3[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cf.1

            /* renamed from: ﻐ, reason: contains not printable characters */
            private cf f1234;

            {
                this.f1234 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                cf.m4201((PresageOptinVideo) list.get(0), (PresageOptinVideoCallback) list.get(1));
                return null;
            }
        });
        int i = f1230 + 51;
        f1231 = i % 128;
        if (i % 2 != 0) {
            return hashMap;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾒ */
    public final String mo3629() {
        int i = f1231 + 111;
        f1230 = i % 128;
        if (i % 2 != 0) {
            mo3703();
            throw null;
        }
        String mo3703 = mo3703();
        if (mo3703 == null) {
            f1231 = (f1230 + 3) % 128;
            return null;
        }
        Object[] objArr = new Object[1];
        b(1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1 - Color.alpha(0), true, TextUtils.getTrimmedLength("") + 192, "��", objArr);
        return mo3703.split(((String) objArr[0]).intern())[0];
    }
}
