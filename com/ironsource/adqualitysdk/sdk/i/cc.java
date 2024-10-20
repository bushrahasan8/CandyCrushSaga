package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
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
import com.ironsource.adqualitysdk.sdk.i.bm;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdData;
import net.pubnative.lite.sdk.vpaid.PlayerInfo;
import net.pubnative.lite.sdk.vpaid.VideoAd;
import net.pubnative.lite.sdk.vpaid.VideoAdController;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.Companion;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionAds;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.Creative;
import net.pubnative.lite.sdk.vpaid.models.vast.Creatives;
import net.pubnative.lite.sdk.vpaid.models.vast.InLine;
import net.pubnative.lite.sdk.vpaid.models.vast.MediaFile;
import net.pubnative.lite.sdk.vpaid.models.vast.StaticResource;
import net.pubnative.lite.sdk.vpaid.models.vast.VASTAdTagURI;
import net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource;
import net.pubnative.lite.sdk.vpaid.models.vast.VideoClicks;
import net.pubnative.lite.sdk.vpaid.models.vast.Wrapper;
import net.pubnative.lite.sdk.vpaid.models.vpaid.CreativeParams;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import org.json.JSONObject;

/* loaded from: cc.class */
public final class cc extends bm {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1157;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f1158 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1159 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1160 = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: cc$d.class */
    public class d extends VideoAdListener implements hg {
        private static int $10 = 0;
        private static int $11 = 1;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f1200 = 1;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f1201;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private cp f1204;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private cc f1205;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private VideoAdListener f1206;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static char[] f1203 = {37163, 37251, 37252, 37277, 37269, 37276, 37277, 37269, 37292, 37277, 37248, 37279, 37277, 37275, 37257, 37363, 37257, 37259, 37271, 37292, 37269, 37274, 37274, 37268, 37361, 37367, 37271, 37256, 37363, 37257, 37254, 37179, 37283, 37284, 37292, 37269, 37271, 37294, 37292, 37290, 37272, 37250, 37272, 37274, 37286, 37283, 37284, 37289, 37289, 37291, 37248, 37254, 37286, 37279, 37250, 37275, 37267, 37290, 37151, 37347, 37370, 37368, 37366, 37348, 37358, 37348, 37350, 37362, 37263, 37360, 37365, 37365, 37367, 37356, 37330, 37362, 37355, 37358, 37352, 37354, 37362, 37260, 37367, 37362, 37263, 37360, 37368, 37345, 37372, 37362, 37362, 37344, 37373, 37260, 37367, 37360, 37367, 37360, 37263, 37146, 37356, 37358, 37370, 37367, 37368, 37373, 37373, 37375, 37332, 37338, 37370, 37353, 37356, 37351, 37375, 37369, 37335, 37356, 37364, 37351, 37355, 37346, 37344, 37374, 37356, 37223, 37139, 37162, 37160, 37158, 37140, 37150, 37140, 37142, 37154, 37183, 37152, 37157, 37157, 37159, 37148, 37122, 37154, 37147, 37150, 37143, 37139, 37158, 37152, 37180, 37158, 37160, 37223, 37139, 37162, 37160, 37158, 37140, 37150, 37140, 37142, 37154, 37183, 37152, 37157, 37157, 37159, 37148, 37122, 37154, 37140, 37136, 37176, 37183, 37181, 37154, 37141, 37141, 37157, 37151, 37150, 37157, 37159, 37151, 37147, 37158, 37162, 37163, 37238, 37183, 37154, 37142, 37140, 37150, 37140, 37158, 37160, 37162, 37139, 37162, 37183, 37159, 37137, 37143, 37159, 37157, 37150, 37151, 37157, 37141, 37136, 37180, 37180, 37159, 37167, 37161, 37144, 37141, 37154, 37122, 37148, 37159, 37157, 37157, 37223, 37139, 37162, 37160, 37158, 37140, 37150, 37140, 37142, 37154, 37183, 37152, 37157, 37157, 37159, 37148, 37122, 37154, 37140, 37136, 37176, 37183, 37181, 37154, 37140, 37127, 37126, 37126, 37137, 37159, 37183, 37243, 37157, 37152, 37183, 37154, 37142, 37140, 37150, 37140, 37158, 37160, 37162, 37139, 37137, 37157, 37181, 37182, 37142, 37145, 37159, 37157, 37150, 37151, 37157, 37141, 37141, 37154, 37181, 37183, 37176, 37136, 37151, 37150, 37147, 37154, 37122, 37148, 37159, 37152, 37293, 37284, 37290, 37280, 37270, 37272, 37270, 37264, 37308, 37305, 37282, 37287, 37287, 37281, 37278, 37276, 37308, 37271, 37271, 37287, 37273, 37272, 37287, 37281, 37273, 37269, 37283, 37311, 37282, 37290};

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f1202 = {21172, 34779, 63526, 11639, 1997, 30771, 44390, 34718, 63499, 11585, 1974, 30967, 44364, 34711, 63728, 11644, 1933, 30940, 44291, 34422, 63726, 11549, 1635, 30902, 44324, 34387, 63659, 11774, 52872, 7143, 25626, 45387, 39921, 58383, 12634, 7074, 25655, 45437, 39818, 58571, 12656, 7083, 25804, 45376, 39857, 58592, 12607, 6730, 25818, 45351, 39501, 58499, 12599, 6781, 25741, 45515, 39546, 3452, 55315, 42990, 29375, 22533, 10235, 62126, 55382, 42947, 29321, 22654, 10047, 62084, 55391, 42808, 29364, 22597, 10004, 62155, 55742, 42793, 29398, 22947, 10105, 62145, 55711, 42862, 3452, 55315, 42990, 29375, 22533, 10235, 62126, 55382, 42947, 29321, 22654, 10047, 62084, 55391, 42808, 29364, 22597, 10004, 62155, 55742, 42798, 29395, 22958, 10056, 62159, 55707, 42857, 29234, 22959, 10068, 61998, 15806, 59601, 38700, 17021, 26823, 5945, 49772, 59540, 38657, 16971, 26812, 6141, 49734, 59549, 38906, 17014, 26759, 6102, 49673, 59772, 38893, 16896, 27000, 6065, 49690, 59741, 38828, 3452, 55315, 42990, 29375, 22533, 10235, 62126, 55382, 42947, 29321, 22654, 10047, 62084, 55391, 42808, 29364, 22597, 10004, 62153, 55727, 42777, 29390, 22949, 10103, 62191, 55700, 42862, 29209, 22923, 10056, 61998, 55753, 42818, 29205, 23037, 3452, 55315, 42990, 29375, 22533, 10235, 62126, 55382, 42947, 29321, 22654, 10047, 62084, 55391, 42808, 29364, 22597, 10004, 62158, 55743, 42764, 29403, 22975, 10102, 62174, 55743, 42852, 29246, 22953, 10075, 62008, 55806, 42857, 29206, 23011, 9401, 61953, 3452, 55315, 42990, 29375, 22533, 10235, 62126, 55382, 42947, 29321, 22654, 10047, 62084, 55391, 42808, 29364, 22597, 10004, 62153, 55727, 42777, 29390, 22949, 10103, 62185, 55726, 42827, 29209, 22950, 10067, 61993, 55793, 56683, 2052, 30713, 41640, 34834, 63468, 8889, 2113, 30676, 41630, 34921, 63272, 8851, 2120, 30511, 41635, 34898, 63235, 8926, 2488, 30478, 41689, 35250, 63328, 8958, 2489, 30556, 41473, 35218, 63308, 8761, 2507, 30556, 41476, 35313, 3452, 55315, 42990, 29375, 22533, 10235, 62126, 55382, 42947, 29321, 22654, 10047, 62084, 55391, 42808, 29364, 22597, 10004, 62159, 55732, 42766, 29433, 22955, 10088, 62158, 55734, 42853, 29243, 22926, 10089, 62015, 55801, 42825, 29215, 23033, 9385, 3452, 55315, 42990, 29375, 22533, 10235, 62126, 55382, 42947, 29321, 22654, 10047, 62084, 55391, 42808, 29364, 22597, 10004, 62159, 55732, 42766, 29433, 22955, 10088, 62158, 55734, 42853, 29243, 22926, 10108, 61995, 55795, 42822, 55062, 633, 32132, 43221, 33391, 64913, 10436, 572, 32169, 43235, 33300, 64853, 10478, 565, 32082, 43230, 33327, 64894, 10405, 990, 32100, 43155, 33729, 64770, 10404, 963, 32011, 43097, 33776, 64800, 10309, 916};

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static long f1199 = -1312771762238728070L;

        d(cc ccVar, VideoAdListener videoAdListener, cp cpVar) {
            this.f1205 = ccVar;
            this.f1206 = videoAdListener;
            this.f1204 = cpVar;
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
            char[] cArr = f1203;
            char[] cArr2 = cArr;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr3 = new char[length];
                for (int i5 = 0; i5 < length; i5++) {
                    char c = cArr[i5];
                    try {
                        Map map = b.f452;
                        Object obj = map.get(123012079);
                        if (obj == null) {
                            obj = ((Class) b.m3371(ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 41 - View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("t", Integer.TYPE);
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
                cArr2 = cArr3;
            }
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr2, i, cArr4, 0, i2);
            char[] cArr5 = cArr4;
            if (bArr != null) {
                char[] cArr6 = new char[i2];
                jVar.f2705 = 0;
                char c2 = 0;
                while (true) {
                    int i6 = jVar.f2705;
                    if (i6 >= i2) {
                        break;
                    }
                    if (bArr[i6] == 1) {
                        char c3 = cArr4[i6];
                        Map map2 = b.f452;
                        Object obj2 = map2.get(-1475644584);
                        if (obj2 == null) {
                            Class cls = (Class) b.m3371(ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 41 - TextUtils.getCapsMode("", 0, 0));
                            Class<?> cls2 = Integer.TYPE;
                            obj2 = cls.getMethod("v", cls2, cls2);
                            map2.put(-1475644584, obj2);
                        }
                        cArr6[i6] = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c3), Integer.valueOf(c2))).charValue();
                    } else {
                        char c4 = cArr4[i6];
                        Map map3 = b.f452;
                        Object obj3 = map3.get(1186866459);
                        if (obj3 == null) {
                            Class cls3 = (Class) b.m3371(KeyEvent.getDeadChar(0, 0), (char) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getLongPressTimeout() >> 16) + 41);
                            Class<?> cls4 = Integer.TYPE;
                            obj3 = cls3.getMethod("y", cls4, cls4);
                            map3.put(1186866459, obj3);
                        }
                        cArr6[i6] = ((Character) ((Method) obj3).invoke(null, Integer.valueOf(c4), Integer.valueOf(c2))).charValue();
                    }
                    c2 = cArr6[jVar.f2705];
                    Map map4 = b.f452;
                    Object obj4 = map4.get(-811294887);
                    if (obj4 == null) {
                        obj4 = ((Class) b.m3371(View.resolveSize(0, 0), (char) Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionType(0L) + 41)).getMethod("w", Object.class, Object.class);
                        map4.put(-811294887, obj4);
                    }
                    ((Method) obj4).invoke(null, jVar, jVar);
                }
                cArr5 = cArr6;
            }
            if (i4 > 0) {
                int i7 = $10 + 27;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    char[] cArr7 = new char[i2];
                    System.arraycopy(cArr5, 0, cArr7, 1, i2);
                    System.arraycopy(cArr7, 1, cArr5, i2 >> i4, i4);
                    System.arraycopy(cArr7, i4, cArr5, 1, i2 << i4);
                } else {
                    char[] cArr8 = new char[i2];
                    System.arraycopy(cArr5, 0, cArr8, 0, i2);
                    int i8 = i2 - i4;
                    System.arraycopy(cArr8, 0, cArr5, i8, i4);
                    System.arraycopy(cArr8, i4, cArr5, 0, i8);
                }
                $11 = ($10 + 79) % 128;
            }
            char[] cArr9 = cArr5;
            if (z) {
                $11 = ($10 + 81) % 128;
                cArr9 = new char[i2];
                int i9 = 0;
                while (true) {
                    jVar.f2705 = i9;
                    int i10 = jVar.f2705;
                    if (i10 >= i2) {
                        break;
                    }
                    cArr9[i10] = cArr5[(i2 - i10) - 1];
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
                    cArr9[i12] = (char) (cArr9[i12] - iArr[2]);
                    i11 = i12 + 1;
                }
            }
            objArr[0] = new String(cArr9);
        }

        /* JADX WARN: Code restructure failed: missing block: B:67:0x03cd, code lost:
        
            r0[r0] = (char) r0[r0];
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x03d7, code lost:
        
            r0 = com.ironsource.adqualitysdk.sdk.i.b.f452;
            r11 = r0.get(518145355);
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x03eb, code lost:
        
            if (r11 == null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x03f1, code lost:
        
            r11 = ((java.lang.Class) com.ironsource.adqualitysdk.sdk.i.b.m3371(android.text.TextUtils.getOffsetAfter("", 0), (char) ((android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) - 1), (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 40)).getMethod("i", java.lang.Object.class, java.lang.Object.class);
            r0.put(518145355, r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0435, code lost:
        
            ((java.lang.reflect.Method) r11).invoke(null, r0, r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x044c, code lost:
        
            throw null;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x04da  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x04dc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void b(int r8, int r9, char r10, java.lang.Object[] r11) {
            /*
                Method dump skipped, instructions count: 1260
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cc.d.b(int, int, char, java.lang.Object[]):void");
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private VideoAdListener m4167() {
            int i = f1201;
            VideoAdListener videoAdListener = this.f1206;
            f1200 = (i + 13) % 128;
            return videoAdListener;
        }

        public void onAdClicked() {
            cc ccVar = this.f1205;
            cp cpVar = this.f1204;
            int longPressTimeout = ViewConfiguration.getLongPressTimeout();
            int offsetAfter = TextUtils.getOffsetAfter("", 0);
            Object[] objArr = new Object[1];
            b(27 - (longPressTimeout >> 16), offsetAfter + 57, (char) TextUtils.getTrimmedLength(""), objArr);
            ccVar.m3723(this, cpVar, ((String) objArr[0]).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1206;
            if (videoAdListener != null) {
                int i = f1200 + 17;
                f1201 = i % 128;
                videoAdListener.onAdClicked();
                if (i % 2 != 0) {
                    throw null;
                }
                f1201 = (f1200 + 67) % 128;
            }
        }

        public void onAdCustomEndCardFound() {
            cc ccVar = this.f1205;
            cp cpVar = this.f1204;
            Object[] objArr = new Object[1];
            a(true, new int[]{255, 38, 0, 13}, "��\u0001\u0001\u0001��\u0001��\u0001����\u0001\u0001\u0001����\u0001��\u0001����\u0001��\u0001��\u0001����\u0001\u0001����\u0001\u0001\u0001\u0001\u0001��\u0001", objArr);
            ccVar.m3723(this, cpVar, ((String) objArr[0]).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1206;
            if (videoAdListener != null) {
                f1200 = (f1201 + 75) % 128;
                videoAdListener.onAdCustomEndCardFound();
            }
            f1201 = (f1200 + 47) % 128;
        }

        public void onAdDidReachEnd() {
            f1200 = (f1201 + 25) % 128;
            cc ccVar = this.f1205;
            cp cpVar = this.f1204;
            int myTid = Process.myTid();
            int normalizeMetaState = KeyEvent.normalizeMetaState(0);
            Object[] objArr = new Object[1];
            b(31 - (myTid >> 22), 84 - normalizeMetaState, (char) TextUtils.indexOf("", "", 0, 0), objArr);
            ccVar.m3723(this, cpVar, ((String) objArr[0]).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1206;
            if (videoAdListener != null) {
                f1200 = (f1201 + 43) % 128;
                videoAdListener.onAdDidReachEnd();
            }
        }

        public void onAdDismissed() {
            f1200 = (f1201 + 117) % 128;
            cc ccVar = this.f1205;
            cp cpVar = this.f1204;
            int defaultSize = View.getDefaultSize(0, 0);
            int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout();
            Object[] objArr = new Object[1];
            b(defaultSize + 29, (doubleTapTimeout >> 16) + 28, (char) (50164 - (Process.myPid() >> 22)), objArr);
            ccVar.m3723(this, cpVar, ((String) objArr[0]).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1206;
            if (videoAdListener != null) {
                int i = f1200 + 97;
                f1201 = i % 128;
                videoAdListener.onAdDismissed();
                if (i % 2 != 0) {
                    throw null;
                }
            }
            int i2 = f1200 + 45;
            f1201 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        public void onAdDismissed(int i) {
            f1200 = (f1201 + 37) % 128;
            cc ccVar = this.f1205;
            cp cpVar = this.f1204;
            Object[] objArr = new Object[1];
            a(false, new int[]{58, 41, 80, 0}, "��\u0001\u0001\u0001����\u0001��\u0001��\u0001\u0001\u0001\u0001\u0001��\u0001\u0001\u0001\u0001��\u0001������������\u0001\u0001��\u0001������\u0001��\u0001\u0001����", objArr);
            ccVar.m3723(this, cpVar, ((String) objArr[0]).intern(), Integer.valueOf(i));
            VideoAdListener videoAdListener = this.f1206;
            if (videoAdListener != null) {
                f1200 = (f1201 + 75) % 128;
                videoAdListener.onAdDismissed(i);
                f1201 = (f1200 + 71) % 128;
            }
            int i2 = f1201 + 107;
            f1200 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        public void onAdExpired() {
            f1200 = (f1201 + 33) % 128;
            cc ccVar = this.f1205;
            cp cpVar = this.f1204;
            int gidForName = Process.getGidForName("");
            long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
            Object[] objArr = new Object[1];
            b(26 - gidForName, 116 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), (char) (12482 - (ViewConfiguration.getPressedStateDuration() >> 16)), objArr);
            ccVar.m3723(this, cpVar, ((String) objArr[0]).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1206;
            if (videoAdListener != null) {
                f1200 = (f1201 + 99) % 128;
                videoAdListener.onAdExpired();
                f1200 = (f1201 + 27) % 128;
            }
        }

        public void onAdLoadFail(PlayerInfo playerInfo) {
            f1200 = (f1201 + 55) % 128;
            cc ccVar = this.f1205;
            cp cpVar = this.f1204;
            Object[] objArr = new Object[1];
            b((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 27, Process.myTid() >> 22, (char) (View.MeasureSpec.getSize(0) + 24520), objArr);
            ccVar.m3723(this, cpVar, ((String) objArr[0]).intern(), playerInfo);
            VideoAdListener videoAdListener = this.f1206;
            if (videoAdListener != null) {
                f1201 = (f1200 + 87) % 128;
                videoAdListener.onAdLoadFail(playerInfo);
            }
        }

        public void onAdLoadSuccess() {
            int i = f1201 + 111;
            f1200 = i % 128;
            if (i % 2 == 0) {
                cc ccVar = this.f1205;
                cp cpVar = this.f1204;
                Object[] objArr = new Object[1];
                a(false, new int[]{0, 31, 109, 9}, "��\u0001\u0001������������\u0001\u0001\u0001\u0001����\u0001��\u0001��\u0001\u0001\u0001\u0001\u0001��\u0001\u0001\u0001\u0001��\u0001", objArr);
                ccVar.m3723(this, cpVar, ((String) objArr[0]).intern(), new Object[1]);
                if (this.f1206 == null) {
                    return;
                }
            } else {
                cc ccVar2 = this.f1205;
                cp cpVar2 = this.f1204;
                Object[] objArr2 = new Object[1];
                a(false, new int[]{0, 31, 109, 9}, "��\u0001\u0001������������\u0001\u0001\u0001\u0001����\u0001��\u0001��\u0001\u0001\u0001\u0001\u0001��\u0001\u0001\u0001\u0001��\u0001", objArr2);
                ccVar2.m3723(this, cpVar2, ((String) objArr2[0]).intern(), new Object[0]);
                if (this.f1206 == null) {
                    return;
                }
            }
            this.f1206.onAdLoadSuccess();
            f1201 = (f1200 + 51) % 128;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x00a8, code lost:
        
            r6.f1206.onAdSkipped();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00a5, code lost:
        
            if (r6.f1206 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x005a, code lost:
        
            if (r6.f1206 != null) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onAdSkipped() {
            /*
                Method dump skipped, instructions count: 199
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cc.d.onAdSkipped():void");
        }

        public void onAdStarted() {
            cc ccVar = this.f1205;
            cp cpVar = this.f1204;
            Object[] objArr = new Object[1];
            a(false, new int[]{31, 27, 124, 4}, "����\u0001\u0001��\u0001\u0001\u0001����\u0001��\u0001��\u0001\u0001\u0001\u0001\u0001��\u0001\u0001\u0001\u0001\u0001\u0001\u0001", objArr);
            ccVar.m3723(this, cpVar, ((String) objArr[0]).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1206;
            if (videoAdListener != null) {
                int i = f1200 + 89;
                f1201 = i % 128;
                videoAdListener.onAdStarted();
                if (i % 2 != 0) {
                    throw new ArithmeticException("divide by zero");
                }
            }
            f1201 = (f1200 + 101) % 128;
        }

        public void onCustomCTACLick(boolean z) {
            f1200 = (f1201 + 31) % 128;
            cc ccVar = this.f1205;
            cp cpVar = this.f1204;
            Object[] objArr = new Object[1];
            b(Color.rgb(0, 0, 0) + 16777248, 214 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr);
            ccVar.m3723(this, cpVar, ((String) objArr[0]).intern(), Boolean.valueOf(z));
            VideoAdListener videoAdListener = this.f1206;
            if (videoAdListener != null) {
                videoAdListener.onCustomCTACLick(z);
            }
            f1201 = (f1200 + 65) % 128;
        }

        public void onCustomCTALoadFail() {
            cc ccVar = this.f1205;
            cp cpVar = this.f1204;
            int size = View.MeasureSpec.getSize(0);
            int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay();
            Object[] objArr = new Object[1];
            b(size + 35, 246 - (scrollDefaultDelay >> 16), (char) (KeyEvent.normalizeMetaState(0) + 53271), objArr);
            ccVar.m3723(this, cpVar, ((String) objArr[0]).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1206;
            if (videoAdListener != null) {
                f1201 = (f1200 + 25) % 128;
                videoAdListener.onCustomCTALoadFail();
            }
            f1201 = (f1200 + 7) % 128;
        }

        public void onCustomCTAShow() {
            f1200 = (f1201 + 71) % 128;
            cc ccVar = this.f1205;
            cp cpVar = this.f1204;
            Object[] objArr = new Object[1];
            a(false, new int[]{224, 31, 0, 0}, "��\u0001\u0001\u0001����\u0001��\u0001��\u0001\u0001\u0001\u0001\u0001��\u0001\u0001\u0001����\u0001\u0001����\u0001\u0001��\u0001\u0001��", objArr);
            ccVar.m3723(this, cpVar, ((String) objArr[0]).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1206;
            if (videoAdListener != null) {
                videoAdListener.onCustomCTAShow();
                f1201 = (f1200 + 91) % 128;
            }
        }

        public void onCustomEndCardClick(String str) {
            f1200 = (f1201 + 99) % 128;
            cc ccVar = this.f1205;
            cp cpVar = this.f1204;
            Object[] objArr = new Object[1];
            a(false, new int[]{152, 36, 0, 0}, "��\u0001\u0001\u0001����\u0001��\u0001��\u0001\u0001\u0001\u0001\u0001��\u0001\u0001\u0001����\u0001\u0001����\u0001��\u0001��\u0001��\u0001\u0001\u0001����", objArr);
            ccVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            VideoAdListener videoAdListener = this.f1206;
            if (videoAdListener != null) {
                f1201 = (f1200 + 29) % 128;
                videoAdListener.onCustomEndCardClick(str);
                f1200 = (f1201 + 65) % 128;
            }
        }

        public void onCustomEndCardShow(String str) {
            cc ccVar = this.f1205;
            cp cpVar = this.f1204;
            Object[] objArr = new Object[1];
            b(35 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 142 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), objArr);
            ccVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            VideoAdListener videoAdListener = this.f1206;
            if (videoAdListener != null) {
                f1200 = (f1201 + 113) % 128;
                videoAdListener.onCustomEndCardShow(str);
                f1200 = (f1201 + 69) % 128;
            }
        }

        public void onDefaultEndCardClick(String str) {
            f1201 = (f1200 + 99) % 128;
            cc ccVar = this.f1205;
            cp cpVar = this.f1204;
            Object[] objArr = new Object[1];
            b((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36, 177 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) Color.red(0), objArr);
            ccVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            VideoAdListener videoAdListener = this.f1206;
            if (videoAdListener != null) {
                videoAdListener.onDefaultEndCardClick(str);
            }
            f1200 = (f1201 + 109) % 128;
        }

        public void onDefaultEndCardShow(String str) {
            f1200 = (f1201 + 73) % 128;
            cc ccVar = this.f1205;
            cp cpVar = this.f1204;
            Object[] objArr = new Object[1];
            a(true, new int[]{188, 36, 0, 11}, "��\u0001��\u0001��\u0001����\u0001\u0001\u0001\u0001��\u0001\u0001\u0001��\u0001��\u0001��\u0001\u0001��\u0001��\u0001\u0001\u0001��\u0001\u0001��\u0001\u0001\u0001", objArr);
            ccVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            VideoAdListener videoAdListener = this.f1206;
            if (videoAdListener != null) {
                f1201 = (f1200 + 87) % 128;
                videoAdListener.onDefaultEndCardShow(str);
            }
            int i = f1200 + 77;
            f1201 = i % 128;
            if (i % 2 != 0) {
                throw new ArithmeticException("divide by zero");
            }
        }

        public void onEndCardClosed(Boolean bool) {
            int i = f1200 + 91;
            f1201 = i % 128;
            if (i % 2 != 0) {
                cc ccVar = this.f1205;
                cp cpVar = this.f1204;
                Object[] objArr = new Object[1];
                a(false, new int[]{293, 31, 130, 0}, "��\u0001\u0001\u0001����\u0001��\u0001��\u0001\u0001\u0001\u0001\u0001��\u0001\u0001\u0001\u0001��\u0001��\u0001��\u0001\u0001\u0001����\u0001", objArr);
                String intern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[0];
                objArr2[0] = bool;
                ccVar.m3723(this, cpVar, intern, objArr2);
                if (this.f1206 == null) {
                    return;
                }
            } else {
                cc ccVar2 = this.f1205;
                cp cpVar2 = this.f1204;
                Object[] objArr3 = new Object[1];
                a(false, new int[]{293, 31, 130, 0}, "��\u0001\u0001\u0001����\u0001��\u0001��\u0001\u0001\u0001\u0001\u0001��\u0001\u0001\u0001\u0001��\u0001��\u0001��\u0001\u0001\u0001����\u0001", objArr3);
                ccVar2.m3723(this, cpVar2, ((String) objArr3[0]).intern(), bool);
                if (this.f1206 == null) {
                    return;
                }
            }
            this.f1206.onEndCardClosed(bool);
            f1200 = (f1201 + 3) % 128;
        }

        public void onEndCardLoadFail(Boolean bool) {
            f1201 = (f1200 + 11) % 128;
            cc ccVar = this.f1205;
            cp cpVar = this.f1204;
            Object[] objArr = new Object[1];
            b(33 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 316 - ExpandableListView.getPackedPositionChild(0L), (char) KeyEvent.getDeadChar(0, 0), objArr);
            ccVar.m3723(this, cpVar, ((String) objArr[0]).intern(), bool);
            VideoAdListener videoAdListener = this.f1206;
            if (videoAdListener != null) {
                videoAdListener.onEndCardLoadFail(bool);
            }
            int i = f1201 + 101;
            f1200 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public void onEndCardLoadSuccess(Boolean bool) {
            cc ccVar = this.f1205;
            cp cpVar = this.f1204;
            Object[] objArr = new Object[1];
            b(36 - View.resolveSize(0, 0), Color.green(0) + 281, (char) (Color.rgb(0, 0, 0) + 16777216), objArr);
            ccVar.m3723(this, cpVar, ((String) objArr[0]).intern(), bool);
            VideoAdListener videoAdListener = this.f1206;
            if (videoAdListener != null) {
                f1201 = (f1200 + 71) % 128;
                videoAdListener.onEndCardLoadSuccess(bool);
                f1200 = (f1201 + 91) % 128;
            }
        }

        public void onEndCardSkipped(Boolean bool) {
            f1200 = (f1201 + 107) % 128;
            cc ccVar = this.f1205;
            cp cpVar = this.f1204;
            Object[] objArr = new Object[1];
            b((ViewConfiguration.getScrollDefaultDelay() >> 16) + 32, ((byte) KeyEvent.getModifierMetaStateMask()) + 351, (char) (KeyEvent.getDeadChar(0, 0) + 55914), objArr);
            ccVar.m3723(this, cpVar, ((String) objArr[0]).intern(), bool);
            VideoAdListener videoAdListener = this.f1206;
            if (videoAdListener != null) {
                int i = f1201 + 17;
                f1200 = i % 128;
                videoAdListener.onEndCardSkipped(bool);
                if (i % 2 == 0) {
                    throw null;
                }
            }
        }

        public void onLeaveApp() {
            f1200 = (f1201 + 17) % 128;
            cc ccVar = this.f1205;
            cp cpVar = this.f1204;
            Object[] objArr = new Object[1];
            a(false, new int[]{99, 26, 72, 20}, "����\u0001��\u0001\u0001\u0001\u0001\u0001��\u0001\u0001��\u0001��\u0001\u0001��\u0001����\u0001\u0001\u0001����", objArr);
            ccVar.m3723(this, cpVar, ((String) objArr[0]).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1206;
            if (videoAdListener != null) {
                videoAdListener.onLeaveApp();
            }
            f1200 = (f1201 + 99) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* renamed from: ﻛ */
        public final /* synthetic */ Object mo3633() {
            f1201 = (f1200 + 29) % 128;
            VideoAdListener m4167 = m4167();
            int i = f1201 + 13;
            f1200 = i % 128;
            if (i % 2 == 0) {
                throw new ArithmeticException("divide by zero");
            }
            return m4167;
        }
    }

    static {
        m4122();
        Process.getThreadPriority(0);
        KeyEvent.getDeadChar(0, 0);
        View.MeasureSpec.getSize(0);
        AudioTrack.getMinVolume();
        KeyEvent.getDeadChar(0, 0);
        AudioTrack.getMinVolume();
        AudioTrack.getMinVolume();
        SystemClock.currentThreadTimeMillis();
        TypedValue.complexToFloat(0);
        ExpandableListView.getPackedPositionChild(0L);
        ViewConfiguration.getScrollBarFadeDuration();
        TextUtils.lastIndexOf("", '0', 0);
        View.combineMeasuredStates(0, 0);
        TextUtils.getOffsetAfter("", 0);
        KeyEvent.keyCodeFromString("");
        Color.rgb(0, 0, 0);
        Color.rgb(0, 0, 0);
        ViewConfiguration.getKeyRepeatTimeout();
        TextUtils.lastIndexOf("", '0');
        ViewConfiguration.getZoomControlsTimeout();
        AndroidCharacter.getMirror('0');
        ViewConfiguration.getEdgeSlop();
        TextUtils.indexOf("", "");
        KeyEvent.getMaxKeyCode();
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        View.getDefaultSize(0, 0);
        TextUtils.indexOf("", "");
        View.MeasureSpec.getSize(0);
        KeyEvent.getMaxKeyCode();
        TextUtils.getTrimmedLength("");
        ViewConfiguration.getPressedStateDuration();
        Color.argb(0, 0, 0, 0);
        TextUtils.getTrimmedLength("");
        AndroidCharacter.getMirror('0');
        View.combineMeasuredStates(0, 0);
        TextUtils.getOffsetBefore("", 0);
        ExpandableListView.getPackedPositionChild(0L);
        TextUtils.indexOf("", "");
        ViewConfiguration.getKeyRepeatTimeout();
        View.combineMeasuredStates(0, 0);
        ViewConfiguration.getMinimumFlingVelocity();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        ViewConfiguration.getKeyRepeatTimeout();
        TextUtils.lastIndexOf("", '0', 0);
        ViewConfiguration.getDoubleTapTimeout();
        ViewConfiguration.getTapTimeout();
        SystemClock.uptimeMillis();
        Process.getGidForName("");
        Process.getGidForName("");
        Color.blue(0);
        TypedValue.complexToFloat(0);
        TextUtils.indexOf("", "", 0, 0);
        TextUtils.lastIndexOf("", '0', 0, 0);
        Process.getGidForName("");
        ViewConfiguration.getScrollBarFadeDuration();
        ViewConfiguration.getLongPressTimeout();
        TextUtils.lastIndexOf("", '0', 0);
        AudioTrack.getMaxVolume();
        SystemClock.currentThreadTimeMillis();
        KeyEvent.normalizeMetaState(0);
        TextUtils.lastIndexOf("", '0', 0, 0);
        Gravity.getAbsoluteGravity(0, 0);
        ViewConfiguration.getWindowTouchSlop();
        KeyEvent.keyCodeFromString("");
        TextUtils.indexOf((CharSequence) "", '0');
        SystemClock.currentThreadTimeMillis();
        View.combineMeasuredStates(0, 0);
        ViewConfiguration.getPressedStateDuration();
        View.MeasureSpec.getSize(0);
        Gravity.getAbsoluteGravity(0, 0);
        Color.rgb(0, 0, 0);
        KeyEvent.keyCodeFromString("");
        Gravity.getAbsoluteGravity(0, 0);
        View.resolveSizeAndState(0, 0, 0);
        TextUtils.getCapsMode("", 0, 0);
        TextUtils.getTrimmedLength("");
        TextUtils.indexOf((CharSequence) "", '0');
        TextUtils.getOffsetAfter("", 0);
        Color.alpha(0);
        KeyEvent.normalizeMetaState(0);
        MotionEvent.axisFromString("");
        Color.rgb(0, 0, 0);
        ViewConfiguration.getKeyRepeatTimeout();
        ExpandableListView.getPackedPositionForChild(0, 0);
        Gravity.getAbsoluteGravity(0, 0);
        Process.myTid();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        KeyEvent.keyCodeFromString("");
        ViewConfiguration.getPressedStateDuration();
        SystemClock.uptimeMillis();
        ViewConfiguration.getDoubleTapTimeout();
        ExpandableListView.getPackedPositionType(0L);
        Process.getThreadPriority(0);
        AndroidCharacter.getMirror('0');
        View.MeasureSpec.getSize(0);
        View.resolveSize(0, 0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        Color.rgb(0, 0, 0);
        ViewConfiguration.getKeyRepeatDelay();
        View.resolveSizeAndState(0, 0, 0);
        ExpandableListView.getPackedPositionChild(0L);
        View.combineMeasuredStates(0, 0);
        ViewConfiguration.getMinimumFlingVelocity();
        TextUtils.lastIndexOf("", '0', 0, 0);
        TextUtils.getOffsetAfter("", 0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        View.MeasureSpec.getMode(0);
        KeyEvent.keyCodeFromString("");
        ViewConfiguration.getScrollBarSize();
        ViewConfiguration.getGlobalActionKeyTimeout();
        ExpandableListView.getPackedPositionChild(0L);
        Process.getGidForName("");
        ViewConfiguration.getMaximumFlingVelocity();
        Color.rgb(0, 0, 0);
        ViewConfiguration.getScrollFriction();
        View.MeasureSpec.getSize(0);
        View.getDefaultSize(0, 0);
        AudioTrack.getMaxVolume();
        ViewConfiguration.getTapTimeout();
        TextUtils.lastIndexOf("", '0', 0);
        Process.myPid();
        ViewConfiguration.getPressedStateDuration();
        ViewConfiguration.getFadingEdgeLength();
        TextUtils.indexOf("", "", 0, 0);
        View.getDefaultSize(0, 0);
        TextUtils.indexOf("", "", 0, 0);
        ViewConfiguration.getFadingEdgeLength();
        MotionEvent.axisFromString("");
        ViewConfiguration.getFadingEdgeLength();
        AudioTrack.getMinVolume();
        ViewConfiguration.getEdgeSlop();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        Process.myPid();
        View.combineMeasuredStates(0, 0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        ViewConfiguration.getTapTimeout();
        AudioTrack.getMinVolume();
        ViewConfiguration.getMaximumDrawingCacheSize();
        Process.getThreadPriority(0);
        ViewConfiguration.getMaximumDrawingCacheSize();
        TextUtils.lastIndexOf("", '0');
        ViewConfiguration.getScrollDefaultDelay();
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        TextUtils.lastIndexOf("", '0', 0);
        Process.getElapsedCpuTime();
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        TextUtils.indexOf("", "");
        View.MeasureSpec.makeMeasureSpec(0, 0);
        Process.getElapsedCpuTime();
        ViewConfiguration.getScrollDefaultDelay();
        MotionEvent.axisFromString("");
        ViewConfiguration.getWindowTouchSlop();
        ViewConfiguration.getScrollBarSize();
        ExpandableListView.getPackedPositionGroup(0L);
        KeyEvent.getDeadChar(0, 0);
        ViewConfiguration.getMinimumFlingVelocity();
        Color.red(0);
        View.combineMeasuredStates(0, 0);
        AudioTrack.getMaxVolume();
        ViewConfiguration.getTouchSlop();
        Color.green(0);
        Process.getThreadPriority(0);
        Process.getGidForName("");
        Color.red(0);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        TextUtils.getCapsMode("", 0, 0);
        TextUtils.getOffsetBefore("", 0);
        ViewConfiguration.getLongPressTimeout();
        ExpandableListView.getPackedPositionType(0L);
        ViewConfiguration.getTouchSlop();
        ViewConfiguration.getWindowTouchSlop();
        Drawable.resolveOpacity(0, 0);
        KeyEvent.getDeadChar(0, 0);
        ViewConfiguration.getDoubleTapTimeout();
        Color.rgb(0, 0, 0);
        Color.argb(0, 0, 0, 0);
        Color.blue(0);
        View.MeasureSpec.getMode(0);
        ViewConfiguration.getKeyRepeatDelay();
        AudioTrack.getMinVolume();
        Process.getThreadPriority(0);
        TextUtils.indexOf("", "");
        Process.myTid();
        Color.alpha(0);
        Process.getElapsedCpuTime();
        Drawable.resolveOpacity(0, 0);
        ExpandableListView.getPackedPositionType(0L);
        ImageFormat.getBitsPerPixel(0);
        ViewConfiguration.getEdgeSlop();
        Color.green(0);
        ViewConfiguration.getTapTimeout();
        Color.red(0);
        ViewConfiguration.getPressedStateDuration();
        Color.red(0);
        PointF.length(0.0f, 0.0f);
        SystemClock.elapsedRealtime();
        TextUtils.indexOf("", "");
        Process.getGidForName("");
        SystemClock.uptimeMillis();
        View.getDefaultSize(0, 0);
        ViewConfiguration.getEdgeSlop();
        TextUtils.lastIndexOf("", '0', 0, 0);
        ViewConfiguration.getTapTimeout();
        TextUtils.getOffsetBefore("", 0);
        SystemClock.uptimeMillis();
        Process.myPid();
        PointF.length(0.0f, 0.0f);
        TextUtils.getTrimmedLength("");
        View.MeasureSpec.getSize(0);
        TextUtils.getOffsetBefore("", 0);
        TextUtils.getCapsMode("", 0, 0);
        ViewConfiguration.getZoomControlsTimeout();
        ViewConfiguration.getScrollDefaultDelay();
        View.MeasureSpec.getMode(0);
        Process.getThreadPriority(0);
        ExpandableListView.getPackedPositionType(0L);
        TypedValue.complexToFloat(0);
        ViewConfiguration.getTapTimeout();
        Drawable.resolveOpacity(0, 0);
        ImageFormat.getBitsPerPixel(0);
        ImageFormat.getBitsPerPixel(0);
        View.getDefaultSize(0, 0);
        TextUtils.getOffsetBefore("", 0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        Process.getGidForName("");
        ViewConfiguration.getEdgeSlop();
        AudioTrack.getMinVolume();
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getScrollBarSize();
        ViewConfiguration.getLongPressTimeout();
        AudioTrack.getMaxVolume();
        TextUtils.indexOf((CharSequence) "", '0');
        KeyEvent.keyCodeFromString("");
        SystemClock.elapsedRealtime();
        ExpandableListView.getPackedPositionChild(0L);
        TextUtils.lastIndexOf("", '0', 0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        TextUtils.getCapsMode("", 0, 0);
        TextUtils.indexOf("", "", 0, 0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        TextUtils.lastIndexOf("", '0');
        View.resolveSizeAndState(0, 0, 0);
        TextUtils.indexOf("", "", 0);
        KeyEvent.normalizeMetaState(0);
        View.MeasureSpec.getSize(0);
        ViewConfiguration.getEdgeSlop();
        ViewConfiguration.getFadingEdgeLength();
        TextUtils.indexOf("", "", 0, 0);
        KeyEvent.getDeadChar(0, 0);
        ExpandableListView.getPackedPositionChild(0L);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        Color.blue(0);
        View.resolveSize(0, 0);
        SystemClock.currentThreadTimeMillis();
        TypedValue.complexToFloat(0);
        TextUtils.indexOf((CharSequence) "", '0');
        TextUtils.lastIndexOf("", '0');
        TextUtils.indexOf((CharSequence) "", '0');
        TextUtils.indexOf("", "", 0);
        View.MeasureSpec.getSize(0);
        ViewConfiguration.getWindowTouchSlop();
        Process.getThreadPriority(0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewConfiguration.getMaximumDrawingCacheSize();
        ViewConfiguration.getScrollFriction();
        ImageFormat.getBitsPerPixel(0);
        ViewConfiguration.getLongPressTimeout();
        View.combineMeasuredStates(0, 0);
        Gravity.getAbsoluteGravity(0, 0);
        KeyEvent.getModifierMetaStateMask();
        ViewConfiguration.getFadingEdgeLength();
        ViewConfiguration.getMinimumFlingVelocity();
        TextUtils.indexOf("", "");
        TextUtils.lastIndexOf("", '0', 0);
        KeyEvent.getMaxKeyCode();
        TextUtils.indexOf((CharSequence) "", '0');
        SystemClock.uptimeMillis();
        ExpandableListView.getPackedPositionType(0L);
        TypedValue.complexToFloat(0);
        ViewConfiguration.getTouchSlop();
        View.resolveSizeAndState(0, 0, 0);
        ViewConfiguration.getDoubleTapTimeout();
        Color.alpha(0);
        Process.getElapsedCpuTime();
        Process.getGidForName("");
        TextUtils.lastIndexOf("", '0');
        AudioTrack.getMaxVolume();
        View.resolveSize(0, 0);
        TypedValue.complexToFloat(0);
        AudioTrack.getMinVolume();
        TextUtils.indexOf((CharSequence) "", '0');
        ViewConfiguration.getTouchSlop();
        TextUtils.indexOf("", "");
        MotionEvent.axisFromString("");
        AndroidCharacter.getMirror('0');
        ExpandableListView.getPackedPositionType(0L);
        TextUtils.getOffsetBefore("", 0);
        TypedValue.complexToFloat(0);
        ViewConfiguration.getPressedStateDuration();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        View.resolveSize(0, 0);
        TextUtils.indexOf("", "", 0, 0);
        ViewConfiguration.getEdgeSlop();
        Color.alpha(0);
        ViewConfiguration.getPressedStateDuration();
        TextUtils.indexOf("", "", 0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        Color.rgb(0, 0, 0);
        AudioTrack.getMinVolume();
        Process.getElapsedCpuTime();
        AndroidCharacter.getMirror('0');
        Process.getElapsedCpuTime();
        ViewConfiguration.getMinimumFlingVelocity();
        KeyEvent.normalizeMetaState(0);
        KeyEvent.getModifierMetaStateMask();
        PointF.length(0.0f, 0.0f);
        ExpandableListView.getPackedPositionChild(0L);
        Gravity.getAbsoluteGravity(0, 0);
        View.resolveSize(0, 0);
        AudioTrack.getMaxVolume();
        AndroidCharacter.getMirror('0');
        ExpandableListView.getPackedPositionForChild(0, 0);
        ExpandableListView.getPackedPositionChild(0L);
        Color.rgb(0, 0, 0);
        ViewConfiguration.getScrollBarFadeDuration();
        AudioTrack.getMaxVolume();
        ViewConfiguration.getMaximumDrawingCacheSize();
        ViewConfiguration.getDoubleTapTimeout();
        TextUtils.lastIndexOf("", '0');
        TextUtils.lastIndexOf("", '0', 0, 0);
        ViewConfiguration.getScrollFriction();
        AndroidCharacter.getMirror('0');
        ViewConfiguration.getMinimumFlingVelocity();
        AndroidCharacter.getMirror('0');
        ViewConfiguration.getMinimumFlingVelocity();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        Process.myPid();
        Color.green(0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        KeyEvent.normalizeMetaState(0);
        View.MeasureSpec.getSize(0);
        ViewConfiguration.getTapTimeout();
        Process.myTid();
        KeyEvent.getMaxKeyCode();
        ViewConfiguration.getMaximumFlingVelocity();
        ViewConfiguration.getTouchSlop();
        ViewConfiguration.getDoubleTapTimeout();
        KeyEvent.keyCodeFromString("");
        View.getDefaultSize(0, 0);
        MotionEvent.axisFromString("");
        AndroidCharacter.getMirror('0');
        TextUtils.lastIndexOf("", '0', 0);
        TextUtils.lastIndexOf("", '0', 0);
        PointF.length(0.0f, 0.0f);
        ViewConfiguration.getGlobalActionKeyTimeout();
        ViewConfiguration.getMaximumFlingVelocity();
        TextUtils.getTrimmedLength("");
        ViewConfiguration.getZoomControlsTimeout();
        Color.rgb(0, 0, 0);
        TextUtils.getOffsetAfter("", 0);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        PointF.length(0.0f, 0.0f);
        Color.blue(0);
        SystemClock.currentThreadTimeMillis();
        ViewConfiguration.getTapTimeout();
        AndroidCharacter.getMirror('0');
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getPressedStateDuration();
        ImageFormat.getBitsPerPixel(0);
        TextUtils.getOffsetBefore("", 0);
        Color.rgb(0, 0, 0);
        SystemClock.elapsedRealtime();
        View.MeasureSpec.getMode(0);
        ViewConfiguration.getEdgeSlop();
        ViewConfiguration.getScrollBarFadeDuration();
        TextUtils.indexOf((CharSequence) "", '0');
        TextUtils.indexOf((CharSequence) "", '0');
        f1160 = (f1159 + 103) % 128;
    }

    public cc(String str) {
        super(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0290  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r8, int r9, char r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cc.a(int, int, char, java.lang.Object[]):void");
    }

    /* renamed from: ﬤ, reason: contains not printable characters */
    private static List m4090(AdParams adParams) {
        int i = f1159 + 73;
        f1160 = i % 128;
        List endCardUrlList = adParams.getEndCardUrlList();
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        f1160 = (f1159 + 39) % 128;
        return endCardUrlList;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static List m4091(AdParams adParams) {
        f1159 = (f1160 + 13) % 128;
        List videoClicks = adParams.getVideoClicks();
        int i = f1159 + 81;
        f1160 = i % 128;
        if (i % 2 != 0) {
            return videoClicks;
        }
        throw null;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static List m4092(AdParams adParams) {
        int i = f1159 + 47;
        f1160 = i % 128;
        if (i % 2 != 0) {
            return adParams.getVideoFileUrlsList();
        }
        adParams.getVideoFileUrlsList();
        throw null;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static String m4093(AdParams adParams) {
        int i = f1160 + 9;
        f1159 = i % 128;
        if (i % 2 != 0) {
            adParams.getEndCardRedirectUrl();
            throw null;
        }
        String endCardRedirectUrl = adParams.getEndCardRedirectUrl();
        f1159 = (f1160 + 77) % 128;
        return endCardRedirectUrl;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static /* synthetic */ Object m4094(Object[] objArr) {
        Ad ad = (Ad) objArr[0];
        String str = (String) objArr[1];
        int i = f1159 + 51;
        f1160 = i % 128;
        String assetUrl = ad.getAssetUrl(str);
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        f1159 = (f1160 + 19) % 128;
        return assetUrl;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static List m4095(AdParams adParams) {
        f1159 = (f1160 + 9) % 128;
        List endCardClicks = adParams.getEndCardClicks();
        f1159 = (f1160 + 67) % 128;
        return endCardClicks;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static /* synthetic */ Object m4096(Object[] objArr) {
        Ad ad = (Ad) objArr[0];
        String str = (String) objArr[1];
        int i = f1159 + 115;
        f1160 = i % 128;
        if (i % 2 != 0) {
            return m4102(ad, str);
        }
        m4102(ad, str);
        throw null;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static String m4097() {
        f1160 = (f1159 + 111) % 128;
        String appToken = HyBid.getAppToken();
        int i = f1159 + 19;
        f1160 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return appToken;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static String m4098(AdParams adParams) {
        int i = f1160 + 77;
        f1159 = i % 128;
        if (i % 2 != 0) {
            adParams.getVideoRedirectUrl();
            throw null;
        }
        String videoRedirectUrl = adParams.getVideoRedirectUrl();
        f1160 = (f1159 + 1) % 128;
        return videoRedirectUrl;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static /* synthetic */ Object m4099(Object[] objArr) {
        StaticResource staticResource = (StaticResource) objArr[0];
        int i = f1159 + 109;
        f1160 = i % 128;
        String m4157 = m4157(staticResource);
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        f1160 = (f1159 + 11) % 128;
        return m4157;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static String m4100(AdParams adParams) {
        int i = f1159 + 23;
        f1160 = i % 128;
        String id = adParams.getId();
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return id;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static /* synthetic */ Object m4101(Object[] objArr) {
        Ad ad = (Ad) objArr[0];
        String str = (String) objArr[1];
        int i = f1159 + 17;
        f1160 = i % 128;
        AdData meta = ad.getMeta(str);
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return meta;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static List m4102(Ad ad, String str) {
        f1160 = (f1159 + 45) % 128;
        List beacons = ad.getBeacons(str);
        int i = f1160 + 91;
        f1159 = i % 128;
        if (i % 2 == 0) {
            return beacons;
        }
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ List m4103(AdParams adParams) {
        f1159 = (f1160 + 45) % 128;
        List m4090 = m4090(adParams);
        int i = f1160 + 117;
        f1159 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m4090;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static /* synthetic */ Object m4104(Object[] objArr) {
        Ad ad = (Ad) objArr[0];
        int i = f1160 + 27;
        f1159 = i % 128;
        if (i % 2 != 0) {
            ad.getZoneId();
            throw null;
        }
        String zoneId = ad.getZoneId();
        int i2 = f1159 + 15;
        f1160 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return zoneId;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ List m4105(AdParams adParams) {
        int i = f1160 + 35;
        f1159 = i % 128;
        if (i % 2 == 0) {
            return m4092(adParams);
        }
        m4092(adParams);
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static AdData m4106(Ad ad, String str) {
        f1159 = (f1160 + 63) % 128;
        AdData asset = ad.getAsset(str);
        int i = f1160 + 125;
        f1159 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return asset;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static /* synthetic */ Object m4107(Object[] objArr) {
        Ad ad = (Ad) objArr[0];
        String str = (String) objArr[1];
        int i = f1160 + 99;
        f1159 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        String str2 = (String) m4154(new Object[]{ad, str}, 1311310209, -1311310195, (int) System.currentTimeMillis());
        int i2 = f1159 + 45;
        f1160 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return str2;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static String m4108(Ad ad) {
        f1160 = (f1159 + 57) % 128;
        String creativeId = ad.getCreativeId();
        f1160 = (f1159 + 101) % 128;
        return creativeId;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static String m4109(AdData adData) {
        int i = f1160 + 69;
        f1159 = i % 128;
        String url = adData.getURL();
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        f1159 = (f1160 + 17) % 128;
        return url;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static String m4110(AdParams adParams) {
        f1159 = (f1160 + 31) % 128;
        String adParams2 = adParams.getAdParams();
        int i = f1159 + 35;
        f1160 = i % 128;
        if (i % 2 != 0) {
            return adParams2;
        }
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static /* synthetic */ Object m4111(Object[] objArr) {
        cc ccVar = (cc) objArr[0];
        HashMap hashMap = new HashMap();
        int scrollBarSize = ViewConfiguration.getScrollBarSize();
        int defaultSize = View.getDefaultSize(0, 0);
        Object[] objArr2 = new Object[1];
        a(11 - (scrollBarSize >> 8), defaultSize + 1632, (char) (5223 - (ViewConfiguration.getWindowTouchSlop() >> 8)), objArr2);
        hashMap.put(((String) objArr2[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.1

            /* renamed from: ﾇ, reason: contains not printable characters */
            private cc f1161;

            {
                this.f1161 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4126();
            }
        });
        float maxVolume = AudioTrack.getMaxVolume();
        int myTid = Process.myTid();
        Object[] objArr3 = new Object[1];
        a((maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)) + 16, (myTid >> 22) + 1643, (char) Color.alpha(0), objArr3);
        hashMap.put(((String) objArr3[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.11

            /* renamed from: ﻐ, reason: contains not printable characters */
            private cc f1163;

            {
                this.f1163 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return Boolean.valueOf(cc.m4124((VideoAd) list.get(0)));
            }
        });
        int alpha = Color.alpha(0);
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        Object[] objArr4 = new Object[1];
        a(18 - alpha, 1661 - (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)), (char) (64301 - Gravity.getAbsoluteGravity(0, 0)), objArr4);
        hashMap.put(((String) objArr4[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.23

            /* renamed from: ﾒ, reason: contains not printable characters */
            private cc f1176;

            {
                this.f1176 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                cc.m4123((VideoAd) list.get(0), (VideoAdListener) list.get(1));
                return null;
            }
        });
        byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
        int rgb = Color.rgb(0, 0, 0);
        Object[] objArr5 = new Object[1];
        a(8 - modifierMetaStateMask, rgb + 16778894, (char) ((-1) - TextUtils.lastIndexOf("", '0')), objArr5);
        hashMap.put(((String) objArr5[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.33

            /* renamed from: ｋ, reason: contains not printable characters */
            private cc f1187;

            {
                this.f1187 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4133((Ad) list.get(0));
            }
        });
        int threadPriority = Process.getThreadPriority(0);
        int resolveSize = View.resolveSize(0, 0);
        Object[] objArr6 = new Object[1];
        a(((threadPriority + 20) >> 6) + 15, 1687 - resolveSize, (char) TextUtils.getOffsetBefore("", 0), objArr6);
        hashMap.put(((String) objArr6[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.31

            /* renamed from: ﻛ, reason: contains not printable characters */
            private cc f1185;

            {
                this.f1185 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4155((Ad) list.get(0));
            }
        });
        int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength();
        int resolveOpacity = Drawable.resolveOpacity(0, 0);
        Object[] objArr7 = new Object[1];
        a(9 - (fadingEdgeLength >> 16), resolveOpacity + 1702, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 56847), objArr7);
        hashMap.put(((String) objArr7[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.34

            /* renamed from: ﾒ, reason: contains not printable characters */
            private cc f1188;

            {
                this.f1188 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4116((Ad) list.get(0));
            }
        });
        int edgeSlop = ViewConfiguration.getEdgeSlop();
        long packedPositionForGroup = ExpandableListView.getPackedPositionForGroup(0);
        Object[] objArr8 = new Object[1];
        a((edgeSlop >> 16) + 11, (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)) + 1711, (char) (Process.myTid() >> 22), objArr8);
        hashMap.put(((String) objArr8[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.39

            /* renamed from: ｋ, reason: contains not printable characters */
            private cc f1192;

            {
                this.f1192 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4136((Ad) list.get(0));
            }
        });
        int edgeSlop2 = ViewConfiguration.getEdgeSlop();
        int threadPriority2 = Process.getThreadPriority(0);
        Object[] objArr9 = new Object[1];
        a(9 - (edgeSlop2 >> 16), IronSourceConstants.errorCode_TEST_SUITE_DISABLED - ((threadPriority2 + 20) >> 6), (char) (9525 - Process.getGidForName("")), objArr9);
        hashMap.put(((String) objArr9[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.36

            /* renamed from: ﾇ, reason: contains not printable characters */
            private cc f1190;

            {
                this.f1190 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4129((Ad) list.get(0), (String) list.get(1));
            }
        });
        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
        int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity();
        Object[] objArr10 = new Object[1];
        a(9 - packedPositionChild, 1731 - (maximumFlingVelocity >> 16), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr10);
        hashMap.put(((String) objArr10[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.37

            /* renamed from: ﾇ, reason: contains not printable characters */
            private cc f1191;

            {
                this.f1191 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return (AdData) cc.m4154(new Object[]{(Ad) list.get(0), (String) list.get(1)}, 1977873919, -1977873917, (int) System.currentTimeMillis());
            }
        });
        int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration();
        long zoomControlsTimeout = ViewConfiguration.getZoomControlsTimeout();
        Object[] objArr11 = new Object[1];
        a((scrollBarFadeDuration >> 16) + 12, (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 1740, (char) KeyEvent.normalizeMetaState(0), objArr11);
        hashMap.put(((String) objArr11[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.3

            /* renamed from: ﾇ, reason: contains not printable characters */
            private cc f1183;

            {
                this.f1183 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return (List) cc.m4154(new Object[]{(Ad) list.get(0), (String) list.get(1)}, -1849221192, 1849221204, (int) System.currentTimeMillis());
            }
        });
        int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay();
        int normalizeMetaState = KeyEvent.normalizeMetaState(0);
        Object[] objArr12 = new Object[1];
        a(13 - (scrollDefaultDelay >> 16), normalizeMetaState + 1753, (char) Color.alpha(0), objArr12);
        hashMap.put(((String) objArr12[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.4

            /* renamed from: ﾇ, reason: contains not printable characters */
            private cc f1193;

            {
                this.f1193 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return (String) cc.m4154(new Object[]{(Ad) list.get(0), (String) list.get(1)}, -659470113, 659470121, (int) System.currentTimeMillis());
            }
        });
        float maxVolume2 = AudioTrack.getMaxVolume();
        float complexToFraction = TypedValue.complexToFraction(0, 0.0f, 0.0f);
        Object[] objArr13 = new Object[1];
        a(14 - (maxVolume2 > 0.0f ? 1 : (maxVolume2 == 0.0f ? 0 : -1)), 1766 - (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)), (char) View.combineMeasuredStates(0, 0), objArr13);
        hashMap.put(((String) objArr13[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.2

            /* renamed from: ﾒ, reason: contains not printable characters */
            private cc f1172;

            {
                this.f1172 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4145((AdData) list.get(0));
            }
        });
        long packedPositionForGroup2 = ExpandableListView.getPackedPositionForGroup(0);
        int scrollDefaultDelay2 = ViewConfiguration.getScrollDefaultDelay();
        Object[] objArr14 = new Object[1];
        a((packedPositionForGroup2 > 0L ? 1 : (packedPositionForGroup2 == 0L ? 0 : -1)) + 11, 1779 - (scrollDefaultDelay2 >> 16), (char) (ImageFormat.getBitsPerPixel(0) + 1), objArr14);
        hashMap.put(((String) objArr14[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.5

            /* renamed from: ﾇ, reason: contains not printable characters */
            private cc f1194;

            {
                this.f1194 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return (String) cc.m4154(new Object[]{(AdData) list.get(0)}, 1696700187, -1696700187, (int) System.currentTimeMillis());
            }
        });
        int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout();
        byte modifierMetaStateMask2 = (byte) KeyEvent.getModifierMetaStateMask();
        Object[] objArr15 = new Object[1];
        a((doubleTapTimeout >> 16) + 12, modifierMetaStateMask2 + 1791, (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr15);
        hashMap.put(((String) objArr15[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.7

            /* renamed from: ﻛ, reason: contains not printable characters */
            private cc f1196;

            {
                this.f1196 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4137((AdData) list.get(0));
            }
        });
        int myPid = Process.myPid();
        long packedPositionForGroup3 = ExpandableListView.getPackedPositionForGroup(0);
        Object[] objArr16 = new Object[1];
        a(20 - (myPid >> 22), 1802 - (packedPositionForGroup3 > 0L ? 1 : (packedPositionForGroup3 == 0L ? 0 : -1)), (char) (56737 - TextUtils.indexOf("", "", 0, 0)), objArr16);
        hashMap.put(((String) objArr16[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.8

            /* renamed from: ﾇ, reason: contains not printable characters */
            private cc f1197;

            {
                this.f1197 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return (String) cc.m4154(new Object[]{(AdData) list.get(0), (String) list.get(1)}, -1881225477, 1881225480, (int) System.currentTimeMillis());
            }
        });
        int green = Color.green(0);
        int resolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
        Object[] objArr17 = new Object[1];
        a(23 - green, resolveSizeAndState + 1822, (char) (4326 - ExpandableListView.getPackedPositionType(0L)), objArr17);
        hashMap.put(((String) objArr17[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.10

            /* renamed from: ﻛ, reason: contains not printable characters */
            private cc f1162;

            {
                this.f1162 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4114(this.f1162, (VideoAdListener) list.get(0), cpVar);
            }
        });
        long packedPositionForGroup4 = ExpandableListView.getPackedPositionForGroup(0);
        float minVolume = AudioTrack.getMinVolume();
        Object[] objArr18 = new Object[1];
        a((packedPositionForGroup4 > 0L ? 1 : (packedPositionForGroup4 == 0L ? 0 : -1)) + 17, (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)) + 1845, (char) (10521 - Color.argb(0, 0, 0, 0)), objArr18);
        hashMap.put(((String) objArr18[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.6

            /* renamed from: ﾇ, reason: contains not printable characters */
            private cc f1195;

            {
                this.f1195 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4120((AdParams) list.get(0));
            }
        });
        int indexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        int capsMode = TextUtils.getCapsMode("", 0, 0);
        Object[] objArr19 = new Object[1];
        a(indexOf + 14, capsMode + 1862, (char) (1569 - Color.argb(0, 0, 0, 0)), objArr19);
        hashMap.put(((String) objArr19[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.9

            /* renamed from: ﾇ, reason: contains not printable characters */
            private cc f1198;

            {
                this.f1198 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4139((AdParams) list.get(0));
            }
        });
        int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L);
        int gidForName = Process.getGidForName("");
        Object[] objArr20 = new Object[1];
        a(packedPositionChild2 + 28, gidForName + 1876, (char) Drawable.resolveOpacity(0, 0), objArr20);
        hashMap.put(((String) objArr20[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.12

            /* renamed from: ｋ, reason: contains not printable characters */
            private cc f1164;

            {
                this.f1164 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4128((AdParams) list.get(0));
            }
        });
        int indexOf2 = TextUtils.indexOf("", "", 0);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        Object[] objArr21 = new Object[1];
        a(29 - indexOf2, makeMeasureSpec + 1902, (char) Color.green(0), objArr21);
        hashMap.put(((String) objArr21[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.14

            /* renamed from: ｋ, reason: contains not printable characters */
            private cc f1166;

            {
                this.f1166 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4159((AdParams) list.get(0));
            }
        });
        int indexOf3 = TextUtils.indexOf("", "");
        int mode = View.MeasureSpec.getMode(0);
        Object[] objArr22 = new Object[1];
        a(22 - indexOf3, 1931 - mode, (char) ExpandableListView.getPackedPositionGroup(0L), objArr22);
        hashMap.put(((String) objArr22[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.13

            /* renamed from: ﾒ, reason: contains not printable characters */
            private cc f1165;

            {
                this.f1165 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4147((AdParams) list.get(0));
            }
        });
        int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay();
        int fadingEdgeLength2 = ViewConfiguration.getFadingEdgeLength();
        Object[] objArr23 = new Object[1];
        a((keyRepeatDelay >> 16) + 24, 1953 - (fadingEdgeLength2 >> 16), (char) (Gravity.getAbsoluteGravity(0, 0) + 43521), objArr23);
        hashMap.put(((String) objArr23[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.15

            /* renamed from: ｋ, reason: contains not printable characters */
            private cc f1167;

            {
                this.f1167 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4113((AdParams) list.get(0));
            }
        });
        int lastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
        int myTid2 = Process.myTid();
        Object[] objArr24 = new Object[1];
        a(lastIndexOf + 29, (myTid2 >> 22) + 1977, (char) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr24);
        hashMap.put(((String) objArr24[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.16

            /* renamed from: ｋ, reason: contains not printable characters */
            private cc f1168;

            {
                this.f1168 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4105((AdParams) list.get(0));
            }
        });
        int combineMeasuredStates = View.combineMeasuredStates(0, 0);
        int resolveOpacity2 = Drawable.resolveOpacity(0, 0);
        Object[] objArr25 = new Object[1];
        a(25 - combineMeasuredStates, 2005 - resolveOpacity2, (char) (ViewConfiguration.getTapTimeout() >> 16), objArr25);
        hashMap.put(((String) objArr25[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.17

            /* renamed from: ﻛ, reason: contains not printable characters */
            private cc f1169;

            {
                this.f1169 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4103((AdParams) list.get(0));
            }
        });
        int green2 = Color.green(0);
        int threadPriority3 = Process.getThreadPriority(0);
        Object[] objArr26 = new Object[1];
        a(11 - green2, ((threadPriority3 + 20) >> 6) + 2030, (char) (32368 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr26);
        hashMap.put(((String) objArr26[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.19

            /* renamed from: ﾒ, reason: contains not printable characters */
            private cc f1171;

            {
                this.f1171 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4151((VideoAdController) list.get(0));
            }
        });
        int size = View.MeasureSpec.getSize(0);
        int keyRepeatDelay2 = ViewConfiguration.getKeyRepeatDelay();
        Object[] objArr27 = new Object[1];
        a(26 - size, 2041 - (keyRepeatDelay2 >> 16), (char) TextUtils.indexOf("", "", 0, 0), objArr27);
        hashMap.put(((String) objArr27[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.20

            /* renamed from: ﾇ, reason: contains not printable characters */
            private cc f1173;

            {
                this.f1173 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4148((VideoClicks) list.get(0));
            }
        });
        int resolveSize2 = View.resolveSize(0, 0);
        int indexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        Object[] objArr28 = new Object[1];
        a(31 - resolveSize2, 2066 - indexOf4, (char) (47628 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr28);
        hashMap.put(((String) objArr28[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.18

            /* renamed from: ﾒ, reason: contains not printable characters */
            private cc f1170;

            {
                this.f1170 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4160((VideoClicks) list.get(0));
            }
        });
        int pressedStateDuration = ViewConfiguration.getPressedStateDuration();
        int fadingEdgeLength3 = ViewConfiguration.getFadingEdgeLength();
        Object[] objArr29 = new Object[1];
        a((pressedStateDuration >> 16) + 24, 2098 - (fadingEdgeLength3 >> 16), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr29);
        hashMap.put(((String) objArr29[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.24

            /* renamed from: ﾇ, reason: contains not printable characters */
            private cc f1177;

            {
                this.f1177 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4142((Companion) list.get(0));
            }
        });
        int pressedStateDuration2 = ViewConfiguration.getPressedStateDuration();
        int myPid2 = Process.myPid();
        Object[] objArr30 = new Object[1];
        a(23 - (pressedStateDuration2 >> 16), 2122 - (myPid2 >> 22), (char) ((-16777216) - Color.rgb(0, 0, 0)), objArr30);
        hashMap.put(((String) objArr30[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.21

            /* renamed from: ﻐ, reason: contains not printable characters */
            private cc f1174;

            {
                this.f1174 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4161((Creative) list.get(0));
            }
        });
        int resolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0);
        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
        Object[] objArr31 = new Object[1];
        a(18 - resolveSizeAndState2, 2145 - packedPositionGroup, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), objArr31);
        hashMap.put(((String) objArr31[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.25

            /* renamed from: ﾇ, reason: contains not printable characters */
            private cc f1178;

            {
                this.f1178 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4163((InLine) list.get(0));
            }
        });
        char mirror = AndroidCharacter.getMirror('0');
        long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
        Object[] objArr32 = new Object[1];
        a('H' - mirror, (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 2162, (char) (ImageFormat.getBitsPerPixel(0) + 1), objArr32);
        hashMap.put(((String) objArr32[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.22

            /* renamed from: ﾒ, reason: contains not printable characters */
            private cc f1175;

            {
                this.f1175 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4121((VastAdSource) list.get(0));
            }
        });
        int combineMeasuredStates2 = View.combineMeasuredStates(0, 0);
        int indexOf5 = TextUtils.indexOf("", "", 0);
        Object[] objArr33 = new Object[1];
        a(16 - combineMeasuredStates2, indexOf5 + 2187, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 46268), objArr33);
        hashMap.put(((String) objArr33[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.26

            /* renamed from: ﻐ, reason: contains not printable characters */
            private cc f1179;

            {
                this.f1179 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return (String) cc.m4154(new Object[]{(MediaFile) list.get(0)}, -1546412359, 1546412369, (int) System.currentTimeMillis());
            }
        });
        int offsetAfter = TextUtils.getOffsetAfter("", 0);
        int trimmedLength = TextUtils.getTrimmedLength("");
        Object[] objArr34 = new Object[1];
        a(21 - offsetAfter, 2203 - trimmedLength, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr34);
        hashMap.put(((String) objArr34[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.27

            /* renamed from: ﻐ, reason: contains not printable characters */
            private cc f1180;

            {
                this.f1180 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return (String) cc.m4154(new Object[]{(StaticResource) list.get(0)}, -725232612, 725232619, (int) System.currentTimeMillis());
            }
        });
        int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize();
        int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L);
        Object[] objArr35 = new Object[1];
        a((maximumDrawingCacheSize >> 24) + 29, packedPositionGroup2 + 2224, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr35);
        hashMap.put(((String) objArr35[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.29

            /* renamed from: ﾒ, reason: contains not printable characters */
            private cc f1182;

            {
                this.f1182 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4138((StaticResource) list.get(0));
            }
        });
        int axisFromString = MotionEvent.axisFromString("");
        int indexOf6 = TextUtils.indexOf("", "", 0, 0);
        Object[] objArr36 = new Object[1];
        a(18 - axisFromString, indexOf6 + 2253, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 17476), objArr36);
        hashMap.put(((String) objArr36[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.28

            /* renamed from: ﾇ, reason: contains not printable characters */
            private cc f1181;

            {
                this.f1181 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4164((Wrapper) list.get(0));
            }
        });
        int windowTouchSlop = ViewConfiguration.getWindowTouchSlop();
        int green3 = Color.green(0);
        Object[] objArr37 = new Object[1];
        a(22 - (windowTouchSlop >> 8), green3 + 2272, (char) (47445 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr37);
        hashMap.put(((String) objArr37[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.30

            /* renamed from: ﻛ, reason: contains not printable characters */
            private cc f1184;

            {
                this.f1184 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4150((Wrapper) list.get(0));
            }
        });
        char mirror2 = AndroidCharacter.getMirror('0');
        int deadChar = KeyEvent.getDeadChar(0, 0);
        Object[] objArr38 = new Object[1];
        a(mirror2 - 19, deadChar + 2294, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr38);
        hashMap.put(((String) objArr38[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.32

            /* renamed from: ﻐ, reason: contains not printable characters */
            private cc f1186;

            {
                this.f1186 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return (String) cc.m4154(new Object[]{(CreativeParams) list.get(0)}, -359178512, 359178513, (int) System.currentTimeMillis());
            }
        });
        int blue = Color.blue(0);
        int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity();
        Object[] objArr39 = new Object[1];
        a(blue + 32, (minimumFlingVelocity >> 16) + 2323, (char) (ViewConfiguration.getTapTimeout() >> 16), objArr39);
        hashMap.put(((String) objArr39[0]).intern(), new bm.d(ccVar) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.35

            /* renamed from: ｋ, reason: contains not printable characters */
            private cc f1189;

            {
                this.f1189 = ccVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cc.m4119((CreativeParams) list.get(0));
            }
        });
        int i = f1160 + 43;
        f1159 = i % 128;
        if (i % 2 == 0) {
            return hashMap;
        }
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static String m4112(Ad ad) {
        int i = f1159 + 109;
        f1160 = i % 128;
        if (i % 2 == 0) {
            ad.getVast();
            throw null;
        }
        String vast = ad.getVast();
        f1159 = (f1160 + 27) % 128;
        return vast;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    static /* synthetic */ List m4113(AdParams adParams) {
        f1159 = (f1160 + 5) % 128;
        List m4095 = m4095(adParams);
        int i = f1160 + 97;
        f1159 = i % 128;
        if (i % 2 == 0) {
            return m4095;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ d m4114(cc ccVar, VideoAdListener videoAdListener, cp cpVar) {
        f1160 = (f1159 + 19) % 128;
        d dVar = (d) m4154(new Object[]{ccVar, videoAdListener, cpVar}, -843464421, 843464434, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, ccVar)).intValue());
        f1160 = (f1159 + 93) % 128;
        return dVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static /* synthetic */ Object m4115(Object[] objArr) {
        Ad ad = (Ad) objArr[0];
        String str = (String) objArr[1];
        int i = f1160 + 87;
        f1159 = i % 128;
        if (i % 2 != 0) {
            m4106(ad, str);
            throw null;
        }
        AdData m4106 = m4106(ad, str);
        f1159 = (f1160 + 25) % 128;
        return m4106;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m4116(Ad ad) {
        f1160 = (f1159 + 69) % 128;
        String m4112 = m4112(ad);
        int i = f1159 + 11;
        f1160 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m4112;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m4117(AdData adData) {
        int i = f1160 + 97;
        f1159 = i % 128;
        String js = adData.getJS();
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return js;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m4118(StaticResource staticResource) {
        f1159 = (f1160 + 117) % 128;
        String creativeType = staticResource.getCreativeType();
        int i = f1160 + 49;
        f1159 = i % 128;
        if (i % 2 == 0) {
            return creativeType;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m4119(CreativeParams creativeParams) {
        f1159 = (f1160 + 49) % 128;
        String m4146 = m4146(creativeParams);
        int i = f1159 + 109;
        f1160 = i % 128;
        if (i % 2 != 0) {
            return m4146;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m4120(AdParams adParams) {
        int i = f1159 + 97;
        f1160 = i % 128;
        if (i % 2 == 0) {
            m4110(adParams);
            throw null;
        }
        String m4110 = m4110(adParams);
        int i2 = f1159 + 85;
        f1160 = i2 % 128;
        if (i2 % 2 != 0) {
            return m4110;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Creatives m4121(VastAdSource vastAdSource) {
        int i = f1159 + 11;
        f1160 = i % 128;
        if (i % 2 != 0) {
            return m4149(vastAdSource);
        }
        m4149(vastAdSource);
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static void m4122() {
        char[] cArr = new char[2355];
        ByteBuffer.wrap("\rbá\u001fÕðÉ§¼~\rká\u0002ÕñÉ¯¼y\u0090>\u0084\u0087sÓ\u009f¹«{·\u0010Âòî\u009bú:\u0005ó\u0011«=KI\u0010T£`q\u008c?\u009fÜ\rcá\u000bÕÂÉ¼¼\u007f\u0090%\u0084\u0091{Wo%Cè7\u009f*\u000f\u001eÔò\u0097áeÕ;É\u0098yÿ\u0095\u0084¡D½<Èøä¢ð\u0011\u000fô\u001b¬7oC4^\u008ejX\u0086\u0003\rká\u0002ÕáÉ¡¼o\u0090$\u0084\u0081{[o\tCé7¼*\b\u001eÓò\u0091\rbá\u001fÕðÉ§¼~\u0090\u0017\u0084\u0086{mo%Có7 *\r\u001eßG\u009c«ç\u009f!\u0083Zö®Ú×Îe1\u009f%Î\t5}]`ûT(¸u«\u0087\rká\u0013ÕÑÉº¼s\u00909\u0084\u008cÑ2=]\t\u0086\u0015ú`%L~Xè§\u0016³u\u009f¯ëíöZÂ\u0094.É=*\tB\u0015Ñ`\u001fL\\X»¤ò³5\u000fRã!×æË\u0092¾K\u0092\"\u0086³y[m\rAÖ5\u0094(>\u001cáð·ãR×\u0019°Ð\\«hmt\u0016\u0001÷-\u009e9\u001eÆàÒ\u0083þY\u008a\u001b\u0097¬£bO?\\Ü 8ÌDø\u008däé\u00919½c©ÀV#B{n¸\u001aã\u0007Y3\u008fßÔ¹\u0091Uìa\u0003}T\b\u008d$ì0\u007fÏ¹ÛÜ÷\u0007\u0083R\u009eéª FqU\u0098aÌ}u\b\u0094$å)?ÅBñ\u00adíú\u0098#´B Ñ_\u0017Krg©\u0013ü\u000eG:\u008eÖßÅ6ñbíÛ\u00989´] ¼\\æK/g\u009c\u0013Â\u000e$:oÖ\u009dÅ\u0016ñDí\u008e\u0099ö´5 \u0092\\É\rbá\u001fÕðÉ§¼~\u0090\u001f\u0084\u008c{Jo/Cô7¡*\u001a\u001eÓò\u0082ákÕ?É\u0086¼d\u0090��\u0084áx»orCÁ7\u009f*y\u001e2òÁáKÕ\u0014ÉÒ½§\u0090l\rzá(ÕûÉ ¼n\u00903\u0084\u0090{Mo>Cï7¦*\u0007\u001eÛò\u009aáCÕ:\rcá\bÕÆÉ«¼h\u0090%\u0084\u0096{Wo>Cï7³*\u0002\u001eêò\u0084ágÕ-É\u008f¼H\u0090\u0006\u0084ëx¨oRCÇ7\u009d*e\u001e4òóáZÕ\u0015ÉÄùÇ\u0015¬!b=\u000fHÌd\u0081p2\u008fó\u009b\u009a·KÃ\u0017Þ¦êN\u0006 \u0015Ã!\u0089=+Hìd¢pO\u008c\f\u009bô·gÃ9ÞÚê\u008d\u0006D\u0015ó\rgá\u0014ÕÓÉ§¼~\u0090\u001f\u0084\u008c{Jo/Cô7¡*\u001a\u001eÓò\u0082ákÕ?É\u0086¼v\u0090��\u0084ëx©osCÌ7\u008a*o\u001e4\u0001\u008aíñÙ7ÅL°¥\u009cÎ\u0088`w\u00adcÎO\u0003;P&ñ\u00128þií\u0095ÙÄÅL°¢\u009cá\u0088\u000btIc\u008eO ;m&\u008e\rDá\u0003ÕÆÉà¼j\u0090#\u0084\u0080{Po+Cò7»*\u0018\u001eßòØánÕ7É\u009e¼C\u0090\\\u0084ýx¾o}C\u008c7\u0097*d\u001e2ò÷á\\Õ\tÉÂ½«\u0090j\u0084Ãx\u0087o^C`7û+µ\u001e\u0016ò×æ¼ÕoÉ&½\u0097\u0090\u0014\u0084>xûl\u009cC\u00037Â+»\u001e`ò.æóÕPÉ\r½þ\u0091¯\u0084fxÇl\u009bCZ7\u0003+ý\u001e^ò\u000fæÄÚ§Én½/\rbá\u001fÕðÉ§¼~\u0090\u001f\u0084\u008c{Jo/Cô7¡*\u001a\u001eÓò\u0082ákÕ?É\u0086¼g\u0090\u0011\u0084úx³o`CË7\u008a*s÷ë\u001b¬/i3OFÅj\u008c~/\u0081ÿ\u0095\u0084¹]Í\u0014Ð·äp\bw\u001bÁ/\u009831Fìjó~R\u0082\u0011\u0095Ò¹#Í8ÐËä\u009d\bX\u001bó/¦3mG\u0004jÅ~l\u0082(\u0095ñ¹ÏÍTÑ\u001aä¹\bx\u001c\u0013/À3\u0089G8j»~\u0094\u0082_\u0096\u0010¹¬ÍmÑ\u0014äÏ\b\u0081\u001c\\/ÿ3¢GQk��~É\u0082h\u00964¹õÍ¬ÑRäñ\b \u001ck \b3ÁG\u0080=ßÑ¬åkù\u001f\u008cÆ §´4Kò_\u0097sL\u0007\u0019\u001a¢.kÂ:ÑÓå\u0087ù>\u008cß ©´BH\u000b_Øss\u00072\u001aË\rDá\u0003ÕÆÉà¼j\u0090#\u0084\u0080{Po+Cò7»*\u0018\u001eßòØánÕ7É\u009e¼C\u0090\\\u0084ýx¾o}C\u008c7\u0097*d\u001e2ò÷á\\Õ\tÉÂ½«\u0090j\u0084Ãx\u0087o^C`7û+µ\u001e\u0016ò×æ¼ÕoÉ&½\u0097\u0090\u0014\u0084 xãl\u00adC\u001e7ï+\u009c\u001ezò?æäÕQÉ\n½ã\u0091²\u0084{xÏl\u0096Cw7!+ê\u001eCò\u0010æÛÚºÉc\u008b\u008dgöS0OK:¢\u0016É\u0002gýªéÉÅ\u0004±W¬ö\u0098?tng\u0092SÃOZ:´\u0016÷\u0002\u0016þ]é\u008eÅ'±v\rká\u0002Ëî'\u0087\u0013s\u000f*zëV²°Ç\\®h[t\u001a\u0001Â\rká\u0002ÕàÉ«¼i\u0090&\u0084\u008d{Po9Cã\rká\u0002ÕÄÉ«¼h\u0090\"\u0084\u008b{Mo#Cè7µ*'\u001eÔò\u0090ám\rxá\u0003ÕßÉ¡¼n\u00903\u0084¡{Qo$Cà7»*\t\u001eûò\u0086árÕ\u0017É\u0084¼@\u0090\u001dÁç-¼\u0019z\u0005\u0001põ\\¬H\u001e\rgá4ÕóÉ\u0087¼^\u0090��\u0084\u008b{[o=\"íÎ¾úyæ\r\u0093Ô¿\u0095«\u0006TÀ@¥l~\u0018+\u0005\u00901YÝ\bÎáúµæ\f\rgá4ÕóÉ\u0087¼^\u0090\u0014\u0084\u0083{Po$Cã7 \rká\u0002ÕâÉ¼¼\u007f\u0090%\u0084\u0087{Po>Cã7 **\u001eßò\u0095ámÕ,É\u008b¼R\u0090\u001d\u0084ü\bPä>ÐýÌ\u0097¹U\u0095\u0012\u0081¼~qj\u0012Fê2\u0099/'\u001bä÷³äZÐ\r\rbá\u001fÕðÉ§¼~\u0090\u0004\u0084\u0087{Io+Cô7¶*\u000b\u001eÞò·áf\rbá\u001fÕðÉ§¼~\u0090\u0004\u0084\u0087{Io+Cô7¶*\u000b\u001eÞò´ápÕ1É\u008b¼B\u0090\u0011\u0084ïx©obCð7\u009b*i\u001e#òûáXÕ\u001fÉÄ\u0010\u001aügÈ\u0088Ôß¡\u0006\u008d|\u0099ÿf1rS^\u008c*Î7s\u0003¦ïÌü\bÈIÔó¡:\u008di\u0099\u0097eÑr\u001a^\u0089*ã7\u001c\u0003Zï\u008fü$\rxá\u0003ÕÅÉ¯¼h\u00902\u0084\u0087{Zo\u001aCô7·*\u001d\u001eßò\u0098ávÕ;É\u0098¼b\u0090\u0017\u0084íxµodCÃ7\u008a*e\u001e4\rxá\u0003ÕÅÉ¯¼h\u00902\u0084\u0087{Zo\u001aCô7·*\u001d\u001eßò\u0098ávÕ;É\u0098¼`\u0090\u0013\u0084íx®oyCÐ7\u0087>ÊÒ±æwú\f\u008fþ£\u0085·#Hé\\\u008epT\u0004\u0001\u0019¼-\\Á2ÒÑæ\u009bú9\u008fþ£°·]K\u001e\rDá\u0003ÕÆÉà¼j\u0090#\u0084\u0080{Po+Cò7»*\u0018\u001eßòØánÕ7É\u009e¼C\u0090\\\u0084ýx¾o}C\u008c7\u008c*o\u001e1òóá\\Õ\u001eÉÓ½¦\u00900\u0084Ëx\u0085oFC'7ì+¿\u001e\u0016òÇæäÕNÉ+½¬\u0090S\u0084\u0012xÐl»C\u001d7Ç+\u0080\u001ejò?æòÕcÉ\u001d½þ\u0091¯\u0084dxÇl\u008eCOV¸ºÅ\u008e*\u0092}ç¤ËÞß] \u00934ñ\u0018.llqÑE\u0004©mº»\u008eð\u0092Yç\u008aËÁß #y\rDá\u0003ÕÆÉà¼j\u0090#\u0084\u0080{Po+Cò7»*\u0018\u001eßòØánÕ7É\u009e¼C\u0090\\\u0084ýx¾o}C\u008c7\u008c*o\u001e1òóá\\Õ\u001eÉÓ½¦\u00900\u0084Ëx\u0085oFC'7ì+¿\u001e\u0016òÇæäÕPÉ3½\u009d\u0090N\u0084$xçl©C\u000b7Ô+\u0096\u001ekò>æ×ÕAÉ\n½ã\u0091°\u0084{xÚl\u0083\r|á\u0007ÕÁÉº¼H\u00903\u0084\u0095{_o8Câ7·*\n\u001eûò\u0095ávÕ7É\u009c¼O\u0090\u0006\u0084÷\rzá(ÕóÉª¼L\u0090?\u0084\u0087{I\rbá\u001fÕðÉ§¼~\u0090\u0017\u0084\u0086{ho#Cã7¥MN¡3\u0095Ü\u0089\u008büRÐ8Ä¯;|/\b\u0003Ïw\u008cj\u0003^ò²\u008c¡G\u0095\u0017\u0089±ä\u001c\ba<\u008e ÙU��ydmù\u0092!\u0086Pª\u009dÞÞÃr÷«\u001bé\b\u000e<D ÕU<yZm\u0099\u0091Á\u0086\u001fWe»\u0018\u008f÷\u0093 æyÊ\u001cÞ·!\\5.\u0019õm\u0094p\rDë¨\u0098»`\u008f.¨\u001aDHp\u0093lþ\u001935u!íÞ0Ê^æ\u0083\u0092Ü\u008fz»\u0093WøD\u0004pQlÜ\u0019/5w!\u0099Lú ¨\u0094p\u0088/ýôÑ¸Å\u0007:Ì.\u008b\u0002bv\u0004k\u0087__³\u0001\rzá(ÕÿÉ\u009c¼\u007f\u00905\u0084\u0096{\u007fo.CÐ7»*\u000b\u001eÍ\u001aTö\u0006ÂËÞ\u0085«V\u0087.\u0093¥lux\u0013\r|á\u000fÕÖÉ«¼u\u0090\u0017\u0084\u0086U6¹E\u008d\u009c\u0091áä?È]ÜÌ#87i\u001b¿oìrAF\u009eªÙ¹:\r|á\u000fÕÖÉ«¼u\u0090\u0017\u0084\u0086{ho#Cã7¥¤ÓH¨|n`\u0015\u0015å9\u008b-\"ÒòÆ\u0080êZ\u009e\u000e\u0083®·g\rzá\nÕÓÉ·¼\u007f\u0090$\u0084«{Po,Cé\rbá\u001fÕðÉ§¼~\u0090\u001f\u0084\u008c{Jo/Cô7¡*\u001a\u001eÓò\u0082ákÕ?É\u0086¼g\u0090\u0016\u0084Âx³oeCÖ7\u009b*d\u001e#òà½;QFe©yþ\f' ]4ÞË\u0010ßró\u00ad\u0087ï\u009aR®\u0087BîQ?eKyÚ\f\f _4²Èíß*ó\u0089ô¿\u0018Â,-0zE£iÊ}[\u0082µ\u0096þº>ÎxÓÿç\u000e\u000bX\u0018«,æ0YE\u009eiÝ\r~á$ÕäÉ§¼~\u00903\u0084\u008d{\u007fo.CÊ7»*\u001d\u001eÎò\u0093álÕ;É\u0098\rká\u0002ÕâÉ¯¼h\u00907\u0084\u008f{M\r|á\u000fÕ×É¹¼Y\u00909\u0084\u008c{Jo8Cé7¾*\u0002\u001eßò\u0084áTÕ?É\u0099¼R\r|á\u000fÕÖÉ«¼u\u0090\u0017\u0084\u0086{}o%Cè7¦*\u001c\u001eÕò\u009aánÕ;É\u0098\u0007aë\u0012ßËÃ¶¶h\u009a\b\u008e\u0093qJe4Ið=¼\u0096¯zÌN\u001dRk'·\u000bÄ\u001fLà\u008aôãØ5¬s±À\riá\nÕÛÉ\u00ad¼q\u0090\u0002\u0084\u0090{_o)Cí7»*��\u001eÝê÷\u0006\u00972A. [åw¦c\u0015\u009cÏ\u0088ºÎ¤\"Ä\u0016\u0012\ns\u007f¶SõGF¸\u009c¬é\u0080\nô{éÐ\riá\tÕßÉ¾¼{\u00908\u0084\u008b{Qo$CÅ7¾*\u0007\u001eÙò\u009dáVÕ6É\u0098¼I\u0090\u0007\u0084éx²\riá\tÕßÉ¾¼{\u00908\u0084\u008b{Qo$CÅ7¾*\u0007\u001eÙò\u009dáVÕ,É\u008b¼E\u0090\u0019\u0084çx´oqæ\u0012\no>¬\"ÔW\u0015{Doï\u0090 Dc¨\u001e\u009cÝ\u0080¥õdÙ5Í\u009e2Q&3\rcá\bÕþÉ§¼t\u00903¸\u009eTå`#|X\t¹%Ð1SÎ³ÚÝö\u0016\u0082S\u009fé¡ßM»yne\u001f\u0010Ã<¨(3×êÃ\u0097\rgá\u0003ÕÖÉ§¼{\u0090\u0010\u0084\u008b{Ro/CõÑR=9\tø\u0015\u0091`XL\u001eX\u009b§p³\u0012\u009fÂë\u008cö7Âò.¸Od£\u001f\u0097Ù\u008b¢æ\u0012\n{>¼\"ÑW\u0005{\\oÿTx¸#\u008cå\u0090\u009eå_É6Ý²\"[6)\u001a×n\u0084s#\u009c«pÖD\u0015Xm-¬\u0001ý\u0015Vê\u0099þØÒ%¦b»Í\u008f\u0015cG\u0019*õdÁ¡Ýè¨\r\u0084A\u0090Ño6{FW\u0084#Û\rCá\u0015ÕàÉ«¼m\u00907\u0084\u0090{Zo/Câ7\u0084*\u0007\u001eÞò\u0093ámÕ\u001fÉ\u008eöt\u001a..ë2µG^k\u001f\u007fª\u0080|\u0094&¸ÏÌ³Ñ*åä\t¯\u001aJ.\u001d2¢Gy\rMá\u0003ÕÆÉ\u008f¼~\u0090\u001c\u0084\u0091{Qo$\rMá\u0003ÕÆÉ\u008f¼~\u0090\u0015\u0084\u0090{[o+Cò7»*\u0018\u001eßò¿áfÓ]?\u0013\u000bÖ\u0017\u009fbnN\u0010Z\u0093¥]±.\rMá\u0003ÕÆÉ\u008f¼~\u0090\f\u0084\u008d{Po/CÏ7¶({Ä5ððì¹\u0099Hµ-¡±^|J\u001d\rMá\u0003ÕÆÉ\u008f¼~\u0090\u0017\u0084\u0091{Mo/Cò\rMá\u0003ÕÆÉ\u008f¼~\u0090\u0014\u0084\u0087{_o)Cé7¼*\u001d\rMá\u0003ÕÆÉ\u008f¼~\u0090\u0017\u0084\u0091{Mo/Cò7\u0087*\u001c\u001eÖ\rMá\u0003ÕÆÉ\u008f¼~\u0090\u0012\u0084\u0083{Jo+CÎ7¦*\u0003\u001eÖ\rMá\u0003ÕÆÉ\u008f¼~\u0090\u0012\u0084\u0083{Jo+CÌ7¡\rMá\u0003ÕÆÉ\u008f¼~\u0090\u0012\u0084\u0083{Jo+CÓ7 *\u0002Ðì<¢\bg\u0014.aßM³Y\"¦ë²\u008a\u009etê\u0007÷½Ãr/9<Ä\b¹\u0014\"aâM¿YK\u001d¯ñòÅ1ÙI¬\u0088\u0080Õ\u0094Pk\u009a\u007fúS\t'P:í\u000e3âQñ\u0080ÅôÙe¬³\u0080à\u0094\rhR\u007f\u0095S6$TÈ\u001aüßà\u0096\u0095g¹\u001f\u00ad\u009aRUF2jò\u001e¸\u0003$7×Û\u009dÈrü)à\u0094\u000blç\"ÓçÏ®º_\u0096'\u0082¢}mi\nEÊ1\u0080,\u0006\u0018ÿ\rMá\u0003ÕÆÉ\u008f¼~\u0090\u0006\u0084\u0083{Lo+Cë7¡*8\u001eÓò\u0092ágÕ1É¸¼C\u0090\u0016\u0084çx¨osCÁ7\u008a*_\u001e4òþ\rMá\u0003ÕÆÉ\u008f¼~\u0090\u0006\u0084\u0083{Lo+Cë7¡*+\u001eÔò\u0092áAÕ?É\u0098¼B\u0090 \u0084ëx¾o\u007fCÐ7\u009b*i\u001e2òÇá\\Õ\u0016\rMá\u0003ÕÆÉ\u008f¼~\u0090\u0006\u0084\u0083{Lo+Cë7¡*8\u001eÓò\u0092ágÕ1É©¼J\u0090\u001b\u0084íx±oe§LK\u0002\u007fÇc\u008e\u0016\u007f:\u0007.\u0082ÑMÅ*éê\u009d \u0080*´ÕX\u0093K@\u007f>c\u0099\u0016C:0.ãÒ²ÅtéÈ\u009d\u008c\rMá\u0003ÕÆÉ\u008f¼~\u0090\u0006\u0084\u0083{Lo+Cë7¡*8\u001eÓò\u0092ágÕ1É¬¼O\u0090\u001e\u0084ëx\u008fodCÎ7\u008d*F\u001e/òááZ\rMá\u0003ÕÆÉ\u008f¼~\u0090\u0006\u0084\u0083{Lo+Cë7¡*+\u001eÔò\u0092áAÕ?É\u0098¼B\u0090'\u0084üx¶oZCË7\u008d*~s=\u009fs«¶·ÿÂ\u000eîvúó\u0005<\u0011[=\u009bIÑ\rMá\u0003ÕÆÉ\u0098¼s\u00902\u0084\u0087{Qo\tCê7»*\r\u001eÑò\u0085áAÕ2É\u0083¼E\u0090\u0019\u0084Úx²odCÍ7\u008b*m\u001e.·A[\u000foÊs\u0094\u0006\u007f*>>\u008bÁ]Õ\u0005ùæ\u008d·\u0090\u0001¤ÝH\u0089[Mo>s\u008f\u0006I*\u0015>ÖÂ¤Õ{ùÍ\u008d\u0099\u0090o¤$Hù[no\u001fsÉ\u0007º\rMá\u0003ÕÆÉ\u008d¼u\u0090;\u0084\u0092{_o$Cï7½*��\u001eùò\u009aákÕ=É\u0081¼r\u0090\u001a\u0084üxµocCÅ7\u0096\rMá\u0003ÕÆÉ\u008d¼h\u00903\u0084\u0083{Jo#Cð7·*-\u001eÕò\u009bárÕ?É\u0084¼O\u0090\u001d\u0084àx\u009borCÑ\rMá\u0003ÕÆÉ\u0087¼t\u0090:\u0084\u008b{Po/CÅ7 *\u000b\u001eÛò\u0082ákÕ(É\u008f¼U\rMá\u0003ÕÆÉ\u0098¼{\u0090%\u0084\u0096{\u007fo.CÕ7½*\u001b\u001eÈò\u0095ágÕ\u001dÉ\u0098¼C\u0090\u0013\u0084úx³o`CÇ7\u008d¹ðU¾a{}>\bÂ$\u008f06ÏâÛ±÷R\u0083\u0003\u009e¶ªSF.UÇa\u0097\rMá\u0003ÕÆÉ\u009d¼n\u00907\u0084\u0096{Wo)CÔ7·*\u001d\u001eÕò\u0083ápÕ=É\u008f¼r\u0090\u0017\u0084öx®\rMá\u0003ÕÆÉ\u009d¼n\u00907\u0084\u0096{Wo)CÔ7·*\u001d\u001eÕò\u0083ápÕ=É\u008f¼e\u0090��\u0084ëx»obCË7\u0088*o\u001e\u0012òëá^Õ\u001fI\t¥G\u0091\u0082\u008dÝø,ÔsÀÖ?\n+k\u0007°sÕnXZ\u009b¶Ó¥2\u0091s\u008dØø\u0007ÔE´\u0018XVl\u0093pÌ\u0005=)b=ÇÂ\u001bÖzú¡\u008eÑ\u0093z§¼K÷X\u0016lopë\u0005\u0012)@=\u008eÁÝÖ\n\rMá\u0003ÕÆÉ\u008d¼h\u00903\u0084\u0083{Jo#Cð7·*>\u001eÛò\u0084ácÕ3É\u0099¼e\u0090��\u0084ëx»obCË7\u0088*o\u001e\u0002òóáZÕ\u001b\rMá\u0003ÕÆÉ\u008d¼h\u00903\u0084\u0083{Jo#Cð7·*>\u001eÛò\u0084ácÕ3É\u0099¼c\u0090\u001c\u0084øx³odCÍ7\u0090*g\u001e#òüáZÕ,É×½°\u0090m".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2355);
        f1157 = cArr;
        f1158 = 6756418937152135526L;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m4123(VideoAd videoAd, VideoAdListener videoAdListener) {
        f1160 = (f1159 + 99) % 128;
        m4134(videoAd, videoAdListener);
        int i = f1160 + 113;
        f1159 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ boolean m4124(VideoAd videoAd) {
        int i = f1159 + 71;
        f1160 = i % 128;
        if (i % 2 != 0) {
            return m4165(videoAd);
        }
        m4165(videoAd);
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static /* synthetic */ Object m4125(Object[] objArr) {
        AdData adData = (AdData) objArr[0];
        int i = f1160 + 113;
        f1159 = i % 128;
        if (i % 2 == 0) {
            return m4117(adData);
        }
        m4117(adData);
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m4126() {
        f1160 = (f1159 + 119) % 128;
        String m4097 = m4097();
        f1160 = (f1159 + 47) % 128;
        return m4097;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m4127(AdData adData) {
        f1159 = (f1160 + 33) % 128;
        String html = adData.getHtml();
        int i = f1160 + 95;
        f1159 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return html;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m4128(AdParams adParams) {
        int i = f1160 + 97;
        f1159 = i % 128;
        if (i % 2 == 0) {
            return m4098(adParams);
        }
        m4098(adParams);
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ AdData m4129(Ad ad, String str) {
        int i = f1160 + 39;
        f1159 = i % 128;
        Object[] objArr = new Object[2];
        if (i % 2 != 0) {
            objArr[0] = ad;
            objArr[1] = str;
            throw null;
        }
        objArr[0] = ad;
        objArr[1] = str;
        AdData adData = (AdData) m4154(objArr, -867394315, 867394324, (int) System.currentTimeMillis());
        f1159 = (f1160 + 81) % 128;
        return adData;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static ClickThrough m4130(VideoClicks videoClicks) {
        f1160 = (f1159 + 11) % 128;
        ClickThrough clickThrough = videoClicks.getClickThrough();
        f1160 = (f1159 + 85) % 128;
        return clickThrough;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Creatives m4131(InLine inLine) {
        int i = f1159 + 57;
        f1160 = i % 128;
        Creatives creatives = inLine.getCreatives();
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return creatives;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Creatives m4132(Wrapper wrapper) {
        f1160 = (f1159 + 13) % 128;
        Creatives creatives = wrapper.getCreatives();
        f1159 = (f1160 + 3) % 128;
        return creatives;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m4133(Ad ad) {
        int i = f1160 + 7;
        f1159 = i % 128;
        if (i % 2 != 0) {
            m4152(ad);
            throw null;
        }
        JSONObject m4152 = m4152(ad);
        int i2 = f1159 + 119;
        f1160 = i2 % 128;
        if (i2 % 2 != 0) {
            return m4152;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m4134(VideoAd videoAd, VideoAdListener videoAdListener) {
        int i = f1160 + 15;
        f1159 = i % 128;
        videoAd.setAdListener(videoAdListener);
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        f1159 = (f1160 + 59) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ Object m4135(Object[] objArr) {
        AdData adData = (AdData) objArr[0];
        String str = (String) objArr[1];
        f1159 = (f1160 + 3) % 128;
        String str2 = (String) m4154(new Object[]{adData, str}, -346885960, 346885971, (int) System.currentTimeMillis());
        int i = f1159 + 41;
        f1160 = i % 128;
        if (i % 2 != 0) {
            return str2;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m4136(Ad ad) {
        f1160 = (f1159 + 45) % 128;
        String str = (String) m4154(new Object[]{ad}, -898922206, 898922211, (int) System.currentTimeMillis());
        f1159 = (f1160 + 49) % 128;
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m4137(AdData adData) {
        int i = f1159 + 103;
        f1160 = i % 128;
        if (i % 2 == 0) {
            m4109(adData);
            throw null;
        }
        String m4109 = m4109(adData);
        int i2 = f1159 + 93;
        f1160 = i2 % 128;
        if (i2 % 2 != 0) {
            return m4109;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m4138(StaticResource staticResource) {
        int i = f1159 + 29;
        f1160 = i % 128;
        String m4118 = m4118(staticResource);
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m4118;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m4139(AdParams adParams) {
        int i = f1160 + 23;
        f1159 = i % 128;
        if (i % 2 == 0) {
            return m4100(adParams);
        }
        m4100(adParams);
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static List m4140(VideoClicks videoClicks) {
        int i = f1160 + 101;
        f1159 = i % 128;
        if (i % 2 == 0) {
            return videoClicks.getClickTrackingList();
        }
        videoClicks.getClickTrackingList();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static CompanionAds m4141(Creative creative) {
        int i = f1160 + 27;
        f1159 = i % 128;
        if (i % 2 != 0) {
            creative.getCompanionAds();
            throw null;
        }
        CompanionAds companionAds = creative.getCompanionAds();
        f1159 = (f1160 + 33) % 128;
        return companionAds;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ CompanionClickThrough m4142(Companion companion) {
        f1159 = (f1160 + 117) % 128;
        CompanionClickThrough m4162 = m4162(companion);
        f1159 = (f1160 + 37) % 128;
        return m4162;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static VASTAdTagURI m4143(Wrapper wrapper) {
        f1160 = (f1159 + 57) % 128;
        VASTAdTagURI vastAdTagURI = wrapper.getVastAdTagURI();
        int i = f1159 + 79;
        f1160 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return vastAdTagURI;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static /* synthetic */ Object m4144(Object[] objArr) {
        VideoAdController videoAdController = (VideoAdController) objArr[0];
        int i = f1159 + 33;
        f1160 = i % 128;
        AdParams adParams = videoAdController.getAdParams();
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return adParams;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m4145(AdData adData) {
        f1160 = (f1159 + 113) % 128;
        String m4127 = m4127(adData);
        int i = f1160 + 11;
        f1159 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m4127;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m4146(CreativeParams creativeParams) {
        int i = f1160 + 103;
        f1159 = i % 128;
        if (i % 2 == 0) {
            return creativeParams.getEnvironmentVars();
        }
        creativeParams.getEnvironmentVars();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ List m4147(AdParams adParams) {
        int i = f1160 + 83;
        f1159 = i % 128;
        if (i % 2 != 0) {
            m4091(adParams);
            throw null;
        }
        List m4091 = m4091(adParams);
        f1159 = (f1160 + 41) % 128;
        return m4091;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ ClickThrough m4148(VideoClicks videoClicks) {
        f1160 = (f1159 + 103) % 128;
        ClickThrough m4130 = m4130(videoClicks);
        int i = f1159 + 59;
        f1160 = i % 128;
        if (i % 2 != 0) {
            return m4130;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Creatives m4149(VastAdSource vastAdSource) {
        f1159 = (f1160 + 83) % 128;
        Creatives creatives = vastAdSource.getCreatives();
        int i = f1159 + 59;
        f1160 = i % 128;
        if (i % 2 != 0) {
            return creatives;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ VASTAdTagURI m4150(Wrapper wrapper) {
        f1160 = (f1159 + 95) % 128;
        VASTAdTagURI m4143 = m4143(wrapper);
        int i = f1160 + 115;
        f1159 = i % 128;
        if (i % 2 == 0) {
            return m4143;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ AdParams m4151(VideoAdController videoAdController) {
        f1159 = (f1160 + 51) % 128;
        AdParams adParams = (AdParams) m4154(new Object[]{videoAdController}, -441121144, 441121148, (int) System.currentTimeMillis());
        int i = f1159 + 47;
        f1160 = i % 128;
        if (i % 2 != 0) {
            return adParams;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static JSONObject m4152(Ad ad) {
        f1160 = (f1159 + 67) % 128;
        try {
            JSONObject json = ad.toJson();
            int i = f1160 + 101;
            f1159 = i % 128;
            if (i % 2 == 0) {
                return json;
            }
            throw null;
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static /* synthetic */ Object m4153(Object[] objArr) {
        CreativeParams creativeParams = (CreativeParams) objArr[0];
        int i = f1160 + 87;
        f1159 = i % 128;
        if (i % 2 != 0) {
            m4158(creativeParams);
            throw null;
        }
        String m4158 = m4158(creativeParams);
        f1160 = (f1159 + 55) % 128;
        return m4158;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Object m4154(Object[] objArr, int i, int i2, int i3) {
        Object m4153;
        int i4 = i2 ^ (-1);
        int i5 = ((i3 ^ (-1)) | i2) ^ (-1);
        int i6 = i ^ (-1);
        switch ((i * (-1939)) + (i2 * 971) + ((((i4 | i) ^ (-1)) | i5) * (-970)) + (((i2 | i6) ^ (-1)) * 1940) + ((((i6 | i4) ^ (-1)) | i5) * 970)) {
            case 1:
                m4153 = m4153(objArr);
                break;
            case 2:
                m4153 = m4115(objArr);
                break;
            case 3:
                m4153 = m4135(objArr);
                break;
            case 4:
                m4153 = m4144(objArr);
                break;
            case 5:
                m4153 = m4104(objArr);
                break;
            case 6:
                m4153 = m4111(objArr);
                break;
            case 7:
                m4153 = m4099(objArr);
                break;
            case 8:
                m4153 = m4107(objArr);
                break;
            case 9:
                m4153 = m4101(objArr);
                break;
            case 10:
                MediaFile mediaFile = (MediaFile) objArr[0];
                f1159 = (f1160 + 43) % 128;
                m4153 = m4156(mediaFile);
                f1159 = (f1160 + 105) % 128;
                break;
            case 11:
                AdData adData = (AdData) objArr[0];
                String str = (String) objArr[1];
                f1159 = (f1160 + 93) % 128;
                m4153 = adData.getStringField(str);
                f1159 = (f1160 + 125) % 128;
                break;
            case 12:
                m4153 = m4096(objArr);
                break;
            case 13:
                m4153 = new d((cc) objArr[0], (VideoAdListener) objArr[1], (cp) objArr[2]);
                f1159 = (f1160 + 39) % 128;
                break;
            case 14:
                m4153 = m4094(objArr);
                break;
            default:
                m4153 = m4125(objArr);
                break;
        }
        return m4153;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m4155(Ad ad) {
        int i = f1160 + 59;
        f1159 = i % 128;
        String m4108 = m4108(ad);
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m4108;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m4156(MediaFile mediaFile) {
        int i = f1160 + 103;
        f1159 = i % 128;
        String text = mediaFile.getText();
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return text;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m4157(StaticResource staticResource) {
        f1160 = (f1159 + 49) % 128;
        String text = staticResource.getText();
        f1160 = (f1159 + 77) % 128;
        return text;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m4158(CreativeParams creativeParams) {
        int i = f1160 + 5;
        f1159 = i % 128;
        String creativeData = creativeParams.getCreativeData();
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return creativeData;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m4159(AdParams adParams) {
        f1159 = (f1160 + 7) % 128;
        String m4093 = m4093(adParams);
        int i = f1159 + 39;
        f1160 = i % 128;
        if (i % 2 != 0) {
            return m4093;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ List m4160(VideoClicks videoClicks) {
        f1159 = (f1160 + 51) % 128;
        List m4140 = m4140(videoClicks);
        int i = f1159 + 1;
        f1160 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m4140;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ CompanionAds m4161(Creative creative) {
        f1159 = (f1160 + 101) % 128;
        CompanionAds m4141 = m4141(creative);
        int i = f1160 + 115;
        f1159 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m4141;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static CompanionClickThrough m4162(Companion companion) {
        int i = f1159 + 81;
        f1160 = i % 128;
        CompanionClickThrough companionClickThrough = companion.getCompanionClickThrough();
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        f1159 = (f1160 + 65) % 128;
        return companionClickThrough;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Creatives m4163(InLine inLine) {
        f1159 = (f1160 + 81) % 128;
        Creatives m4131 = m4131(inLine);
        int i = f1160 + 69;
        f1159 = i % 128;
        if (i % 2 == 0) {
            return m4131;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Creatives m4164(Wrapper wrapper) {
        int i = f1159 + 65;
        f1160 = i % 128;
        if (i % 2 != 0) {
            return m4132(wrapper);
        }
        m4132(wrapper);
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m4165(VideoAd videoAd) {
        f1160 = (f1159 + 25) % 128;
        boolean isRewarded = videoAd.isRewarded();
        int i = f1160 + 123;
        f1159 = i % 128;
        if (i % 2 == 0) {
            return isRewarded;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x08b3, code lost:
    
        if (r8.equals(((java.lang.String) r0[0]).intern()) != false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x1350, code lost:
    
        if (r8.equals(((java.lang.String) r0[0]).intern()) != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x158e, code lost:
    
        if (r8.equals(((java.lang.String) r0[0]).intern()) != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x1804, code lost:
    
        if (r8.equals(((java.lang.String) r0[0]).intern()) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x1a50, code lost:
    
        if (r8.equals(((java.lang.String) r0[0]).intern()) != false) goto L124;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Class mo3627(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8049
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cc.mo3627(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Map mo3628() {
        return (Map) m4154(new Object[]{this}, -1375532203, 1375532209, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾒ */
    public final String mo3629() {
        int i = f1160 + 73;
        f1159 = i % 128;
        if (i % 2 != 0) {
            HyBid.getHyBidVersion();
            throw new ArithmeticException("divide by zero");
        }
        String hyBidVersion = HyBid.getHyBidVersion();
        int i2 = f1160 + 107;
        f1159 = i2 % 128;
        if (i2 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return hyBidVersion;
    }
}
