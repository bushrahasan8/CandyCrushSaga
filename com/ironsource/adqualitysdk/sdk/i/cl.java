package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
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
import com.monetization.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdActivity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdType;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.common.VideoEventListener;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: cl.class */
public final class cl extends bm {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1349;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1350 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1351;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f1352;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1353;

    static {
        m4363();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        Process.getGidForName("");
        ViewConfiguration.getScrollBarFadeDuration();
        ExpandableListView.getPackedPositionForGroup(0);
        View.resolveSize(0, 0);
        SystemClock.currentThreadTimeMillis();
        ViewConfiguration.getMaximumDrawingCacheSize();
        View.MeasureSpec.getSize(0);
        ViewConfiguration.getJumpTapTimeout();
        Gravity.getAbsoluteGravity(0, 0);
        SystemClock.uptimeMillis();
        TextUtils.indexOf("", "");
        TextUtils.getOffsetBefore("", 0);
        ViewConfiguration.getScrollDefaultDelay();
        TextUtils.indexOf("", "", 0);
        Color.red(0);
        Process.getGidForName("");
        AudioTrack.getMaxVolume();
        AudioTrack.getMinVolume();
        ViewConfiguration.getJumpTapTimeout();
        ExpandableListView.getPackedPositionChild(0L);
        View.MeasureSpec.getMode(0);
        SystemClock.currentThreadTimeMillis();
        TextUtils.indexOf("", "", 0);
        KeyEvent.getMaxKeyCode();
        Process.getElapsedCpuTime();
        AudioTrack.getMinVolume();
        ViewConfiguration.getJumpTapTimeout();
        ViewConfiguration.getKeyRepeatDelay();
        AudioTrack.getMaxVolume();
        Color.alpha(0);
        View.getDefaultSize(0, 0);
        ViewConfiguration.getScrollFriction();
        TextUtils.indexOf("", "");
        Color.alpha(0);
        AudioTrack.getMinVolume();
        SystemClock.elapsedRealtime();
        SystemClock.currentThreadTimeMillis();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        AndroidCharacter.getMirror('0');
        PointF.length(0.0f, 0.0f);
        ViewConfiguration.getTapTimeout();
        Color.red(0);
        ViewConfiguration.getKeyRepeatDelay();
        TextUtils.lastIndexOf("", '0', 0);
        ViewConfiguration.getKeyRepeatDelay();
        TextUtils.getCapsMode("", 0, 0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        PointF.length(0.0f, 0.0f);
        TextUtils.indexOf("", "");
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        ViewConfiguration.getScrollFriction();
        Color.argb(0, 0, 0, 0);
        f1351 = (f1350 + 73) % 128;
    }

    public cl(String str) {
        super(str);
    }

    private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
        int i;
        int i2;
        $10 = ($11 + 9) % 128;
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
        char[] cArr = f1353;
        char[] cArr2 = cArr;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 47;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    char c = cArr[i7];
                    try {
                        Map map = b.f452;
                        Object obj = map.get(123012079);
                        if (obj == null) {
                            obj = ((Class) b.m3371(ViewConfiguration.getTapTimeout() >> 16, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 41 - TextUtils.indexOf("", "", 0, 0))).getMethod("t", Integer.TYPE);
                            map.put(123012079, obj);
                        }
                        cArr3[i7] = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c))).charValue();
                        i7 %= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    char c2 = cArr[i7];
                    Map map2 = b.f452;
                    Object obj2 = map2.get(123012079);
                    if (obj2 == null) {
                        obj2 = ((Class) b.m3371(View.resolveSizeAndState(0, 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 41 - ExpandableListView.getPackedPositionType(0L))).getMethod("t", Integer.TYPE);
                        map2.put(123012079, obj2);
                    }
                    cArr3[i7] = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c2))).charValue();
                    i7++;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        char[] cArr5 = cArr4;
        if (bArr != null) {
            int i9 = $11 + 21;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr5 = new char[i4];
                i2 = 1;
            } else {
                cArr5 = new char[i4];
                i2 = 0;
            }
            jVar.f2705 = i2;
            char c3 = 0;
            while (true) {
                int i10 = jVar.f2705;
                if (i10 >= i4) {
                    break;
                }
                $10 = ($11 + 115) % 128;
                if (bArr[i10] == 1) {
                    char c4 = cArr4[i10];
                    Map map3 = b.f452;
                    Object obj3 = map3.get(-1475644584);
                    if (obj3 == null) {
                        Class cls = (Class) b.m3371((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 40);
                        Class<?> cls2 = Integer.TYPE;
                        obj3 = cls.getMethod("v", cls2, cls2);
                        map3.put(-1475644584, obj3);
                    }
                    cArr5[i10] = ((Character) ((Method) obj3).invoke(null, Integer.valueOf(c4), Integer.valueOf(c3))).charValue();
                } else {
                    char c5 = cArr4[i10];
                    Map map4 = b.f452;
                    Object obj4 = map4.get(1186866459);
                    if (obj4 == null) {
                        Class cls3 = (Class) b.m3371(Process.myPid() >> 22, (char) Color.alpha(0), 42 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        Class<?> cls4 = Integer.TYPE;
                        obj4 = cls3.getMethod("y", cls4, cls4);
                        map4.put(1186866459, obj4);
                    }
                    cArr5[i10] = ((Character) ((Method) obj4).invoke(null, Integer.valueOf(c5), Integer.valueOf(c3))).charValue();
                }
                c3 = cArr5[jVar.f2705];
                Map map5 = b.f452;
                Object obj5 = map5.get(-811294887);
                if (obj5 == null) {
                    obj5 = ((Class) b.m3371(View.resolveSize(0, 0), (char) KeyEvent.getDeadChar(0, 0), 42 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).getMethod("w", Object.class, Object.class);
                    map5.put(-811294887, obj5);
                }
                ((Method) obj5).invoke(null, jVar, jVar);
            }
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr5, 0, cArr6, 0, i4);
            int i11 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr5, i11, i6);
            System.arraycopy(cArr6, i6, cArr5, 0, i11);
        }
        char[] cArr7 = cArr5;
        if (z) {
            int i12 = $10 + 79;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                cArr7 = new char[i4];
                i = 0;
            } else {
                i = 0;
                cArr7 = new char[i4];
            }
            while (true) {
                jVar.f2705 = i;
                int i13 = jVar.f2705;
                if (i13 >= i4) {
                    break;
                }
                $11 = ($10 + 105) % 128;
                cArr7[i13] = cArr5[(i4 - i13) - 1];
                i = i13 + 1;
            }
        }
        if (i5 > 0) {
            int i14 = 0;
            while (true) {
                jVar.f2705 = i14;
                int i15 = jVar.f2705;
                if (i15 >= i4) {
                    break;
                }
                int i16 = $11 + 93;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    cArr7[i15] = (char) (cArr7[i15] << iArr[3]);
                    i14 = i15 << 1;
                } else {
                    cArr7[i15] = (char) (cArr7[i15] - iArr[2]);
                    i14 = i15 + 1;
                }
            }
        }
        objArr[0] = new String(cArr7);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(int r8, int r9, char r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cl.b(int, int, char, java.lang.Object[]):void");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static /* synthetic */ Object m4355(Object[] objArr) {
        RewardedAd rewardedAd = (RewardedAd) objArr[0];
        int i = f1350 + 51;
        f1351 = i % 128;
        if (i % 2 == 0) {
            return m4378(rewardedAd);
        }
        m4378(rewardedAd);
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m4356(Reward reward) {
        int i = f1351 + 39;
        f1350 = i % 128;
        String type = reward.getType();
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return type;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m4357(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        int i = f1350 + 43;
        f1351 = i % 128;
        m4375(bannerAdView, bannerAdEventListener);
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        f1350 = (f1351 + 97) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static /* synthetic */ Object m4358(Object[] objArr) {
        f1351 = (f1350 + 63) % 128;
        String libraryVersion = MobileAds.getLibraryVersion();
        int i = f1350 + 7;
        f1351 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return libraryVersion;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m4359(AdInfo adInfo) {
        f1351 = (f1350 + 79) % 128;
        String m4367 = m4367(adInfo);
        f1350 = (f1351 + 81) % 128;
        return m4367;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m4360(ImpressionData impressionData) {
        f1350 = (f1351 + 97) % 128;
        String rawData = impressionData.getRawData();
        int i = f1351 + 49;
        f1350 = i % 128;
        if (i % 2 != 0) {
            return rawData;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m4361(Reward reward) {
        f1350 = (f1351 + 121) % 128;
        String m4356 = m4356(reward);
        f1351 = (f1350 + 113) % 128;
        return m4356;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m4362(VideoAd videoAd) {
        f1350 = (f1351 + 111) % 128;
        String str = (String) m4380(new Object[]{videoAd}, 1041873566, -1041873566, (int) System.currentTimeMillis());
        int i = f1351 + 95;
        f1350 = i % 128;
        if (i % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m4363() {
        f1353 = new char[]{37232, 37178, 37154, 37155, 37155, 37154, 37159, 37150, 37150, 37150, 37232, 37154, 37160, 37157, 37163, 37153, 37151, 37121, 37154, 37157, 37154, 37178, 37154, 37155, 37155, 37154, 37159, 37150, 37150, 37150, 37243, 37122, 37154, 37154, 37153, 37154, 37157, 37124, 37148, 37159, 37166, 37131, 37125, 37156, 37158, 37161, 37156, 37154, 37121, 37157, 37295, 37280, 37280, 37296, 36936, 37298, 37297, 36936, 37315, 36968, 36962, 36972, 36954, 36928, 37126, 37335, 37358, 37329, 37335, 37329, 37316, 37325, 37333, 37333, 37320, 37318, 37329, 37356, 37336, 36961, 36990, 36967, 36953, 36972, 36990, 36967, 36975, 36973, 36954, 36945, 37223, 37139, 37162, 37160, 37158, 37141, 37141, 37154, 37181, 37183, 37180, 37153, 37152, 37156, 37159, 37160, 37270, 37308, 37287, 37286, 37309, 37310, 37281, 37281, 37281, 37288, 37289, 37273, 37277, 37173, 37306, 37309, 37308, 37307, 37300, 37311, 37311, 37311, 37286, 37287, 37271, 37275, 37269, 37294, 37310, 37282, 37306, 37289, 37267, 37311, 37300, 37309, 37282, 37282, 37308, 37294, 37131, 37322, 37322, 37333, 37339, 37336, 37169, 36936, 36955, 36953, 36958, 36952, 37297, 37303, 36959, 36959, 37238, 37158, 37160, 37162, 37152, 37167, 37141, 37152, 37137, 37150, 37136, 37260, 37365, 37375, 37366, 37364, 37362, 37346, 37373, 37261, 37361, 37257, 37368, 37346, 37262, 37259, 37260, 37361, 37361, 37363, 37258, 37334, 36990, 36990, 36991, 36963, 36948, 36959, 36960, 36966, 36961, 36963, 36944, 36968, 36961, 36971, 37324, 37299, 36937, 37296, 37304, 36939, 36937, 36942, 36936, 37305, 37299, 36929, 36943, 37155, 37269, 37279, 37273, 37250, 37272, 37271, 37273, 37270, 37269, 37269, 37254, 37257, 37261};
        f1349 = new char[]{30028, 37075, 48688, 50253, 58243, 2496, 3431, 59647, 50748, 48237, 39854, 29165, 28471, 17752, 8329, 3401, 59647, 50739, 48170, 39867, 29161, 28440, 17752, 8351, 7896, 62528, 54201, 51709, 42810, 40303, 30880, 22255, 19550, 10847, 384, 65489, 54598, 45236, 44797, 33844, 25198, 22955, 14278, 11612, 2938, 59015, 56514, 47620, 37301, 36844, 25861, 17254, 16030, 5343, 61977, 59469, 2290, 60791, 50100, 47599, 40483, 29763, 27278, 16599, 9498, 7002, 61868, 54835, 52335, 41634, 39149, 32044, 21345, 18828, 3432, 59633, 50736, 48234, 39847, 29178, 28471, 17752, 8383, 7894, 62475, 54202, 51686, 42772, 40303, 30911, 22270, 19477, 10832, 385, 65488, 3448, 59637, 50729, 48229, 39856, 29164, 28435, 17752, 8379, 7876, 3448, 59637, 50729, 48229, 39856, 29164, 28435, 17752, 8379, 7876, 62507, 54178, 51703, 42806, 40306, 30848, 22243, 19459, 10826, 385, 65484, 54541, 45220, 7041, 65028, 53447, 43676, 36176, 26420, 31215, 21393, 13931, 2108, 58090, 50507, 57102, 45510, 35728, 28285, 16414, 23294, 15543, 6012, 59697, 50160, 42585, 3431, 59637, 50746, 48237, 39843, 29134, 28447, 17744, 8351, 3452, 59641, 50746, 48225, 39853, 29129, 28434, 3405, 59637, 50730, 48197, 39846, 29149, 28440, 17749, 8334, 7913, 62474, 3405, 59637, 50730, 48205, 39852, 29179, 28418, 17753, 8328, 7891, 62490, 54205, 51686, 42801, 40295, 30880, 22211, 19486, 10840, 395, 64997, 6237, 13954, 19710, 27407, 33111, 40895, 46566, 53302, 61037, 1186, 9021, 14686, 22457, 28096, 34818, 42573, 3417, 59637, 50730, 48214, 39847, 29183, 28439, 17742, 8350, 7877, 62474, 54165, 51702, 42781, 40304, 30889, 22244, 19460, 10866, 397, 65489, 54556, 45235, 44786, 33855, 25202, 3417, 59637, 50730, 48205, 39852, 29180, 28435, 17742, 8329, 7892, 62471, 54176, 51707, 42809, 40298, 30861, 22254, 19509, 10824, 385, 65484, 54556, 45210, 44789, 33833, 25204, 22955, 14298, 11543, 2890, 37923, 29083, 24388, 9511, 713, 59522, 63089, 56371, 47570, 34727, 28012, 19167, 20649, 15940, 1028, 45701, 22333, 31202, 922, 9315, 52772, 53467, 64155, 40819, 41228, 19435, 27769, 30270, 6393, 8879, 51010, 59691, 62420, 38291, 33651, 26335, 18432, 12908, 5513, 65484, 57650, 52083, 44706, 37067, 31264, 23995, 18382, 10519, 4930, 63122, 55532, 49715, 42087, 36794, 29165, 23340, 16025, 8388};
        f1352 = 8397505195766442128L;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m4364(VideoController videoController, VideoEventListener videoEventListener) {
        f1351 = (f1350 + 87) % 128;
        videoController.setVideoEventListener(videoEventListener);
        int i = f1350 + 109;
        f1351 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static AdInfo m4365(InterstitialAd interstitialAd) {
        int i = f1351 + 51;
        f1350 = i % 128;
        AdInfo info = interstitialAd.getInfo();
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return info;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ Object m4366(Object[] objArr) {
        Reward reward = (Reward) objArr[0];
        f1350 = (f1351 + 23) % 128;
        int amount = reward.getAmount();
        int i = f1350 + 87;
        f1351 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return Integer.valueOf(amount);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m4367(AdInfo adInfo) {
        int i = f1350 + 25;
        f1351 = i % 128;
        if (i % 2 == 0) {
            return adInfo.getAdUnitId();
        }
        adInfo.getAdUnitId();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m4368(MediaFile mediaFile) {
        int i = f1351 + 23;
        f1350 = i % 128;
        if (i % 2 != 0) {
            return mediaFile.getUrl();
        }
        mediaFile.getUrl();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m4369(VideoController videoController, VideoEventListener videoEventListener) {
        int i = f1350 + 15;
        f1351 = i % 128;
        m4364(videoController, videoEventListener);
        if (i % 2 != 0) {
            throw null;
        }
        int i2 = f1350 + 25;
        f1351 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m4370(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        int i = f1350 + 67;
        f1351 = i % 128;
        rewardedAd.setAdEventListener(rewardedAdEventListener);
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ int m4371(Reward reward) {
        int i = f1350 + 125;
        f1351 = i % 128;
        Object[] objArr = new Object[1];
        if (i % 2 != 0) {
            objArr[0] = reward;
            ((Integer) m4380(objArr, 882799658, -882799656, (int) System.currentTimeMillis())).intValue();
            throw new ArithmeticException("divide by zero");
        }
        objArr[0] = reward;
        int intValue = ((Integer) m4380(objArr, 882799658, -882799656, (int) System.currentTimeMillis())).intValue();
        int i2 = f1351 + 41;
        f1350 = i2 % 128;
        if (i2 % 2 != 0) {
            return intValue;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static MediaFile m4372(VideoAd videoAd) {
        int i = f1350 + 25;
        f1351 = i % 128;
        MediaFile mediaFile = videoAd.getMediaFile();
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return mediaFile;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static /* synthetic */ Object m4373(Object[] objArr) {
        VideoAd videoAd = (VideoAd) objArr[0];
        f1351 = (f1350 + 73) % 128;
        String info = videoAd.getInfo();
        int i = f1351 + 57;
        f1350 = i % 128;
        if (i % 2 != 0) {
            return info;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m4374(MediaFile mediaFile) {
        f1351 = (f1350 + 99) % 128;
        String m4368 = m4368(mediaFile);
        int i = f1351 + 7;
        f1350 = i % 128;
        if (i % 2 != 0) {
            return m4368;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m4375(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        int i = f1350 + 5;
        f1351 = i % 128;
        bannerAdView.setBannerAdEventListener(bannerAdEventListener);
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m4376(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        f1350 = (f1351 + 75) % 128;
        m4370(rewardedAd, rewardedAdEventListener);
        int i = f1350 + 111;
        f1351 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ AdInfo m4377(InterstitialAd interstitialAd) {
        f1351 = (f1350 + 121) % 128;
        AdInfo m4365 = m4365(interstitialAd);
        f1350 = (f1351 + 91) % 128;
        return m4365;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static AdInfo m4378(RewardedAd rewardedAd) {
        int i = f1350 + 85;
        f1351 = i % 128;
        AdInfo info = rewardedAd.getInfo();
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        f1350 = (f1351 + 111) % 128;
        return info;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ MediaFile m4379(VideoAd videoAd) {
        int i = f1350 + 85;
        f1351 = i % 128;
        if (i % 2 == 0) {
            return m4372(videoAd);
        }
        m4372(videoAd);
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Object m4380(Object[] objArr, int i, int i2, int i3) {
        Object obj;
        int i4 = i2 ^ (-1);
        int i5 = (i3 ^ (-1)) | i4;
        int i6 = i ^ (-1);
        int i7 = (i * (-112)) + (i2 * (-112)) + (((i5 ^ (-1)) | i) * 226) + ((((i | i5) ^ (-1)) | ((i2 | i6) ^ (-1)) | ((i6 | i3) ^ (-1))) * (-113)) + (((i4 | i3) ^ (-1)) * 113);
        if (i7 != 1) {
            obj = i7 != 2 ? i7 != 3 ? i7 != 4 ? m4373(objArr) : m4355(objArr) : m4358(objArr) : m4366(objArr);
        } else {
            InterstitialAd interstitialAd = (InterstitialAd) objArr[0];
            InterstitialAdEventListener interstitialAdEventListener = (InterstitialAdEventListener) objArr[1];
            f1351 = (f1350 + 111) % 128;
            m4382(interstitialAd, interstitialAdEventListener);
            f1351 = (f1350 + 123) % 128;
            obj = null;
        }
        return obj;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m4381(ImpressionData impressionData) {
        int i = f1351 + 113;
        f1350 = i % 128;
        if (i % 2 != 0) {
            return m4360(impressionData);
        }
        m4360(impressionData);
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m4382(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        f1350 = (f1351 + 57) % 128;
        interstitialAd.setAdEventListener(interstitialAdEventListener);
        int i = f1350 + 117;
        f1351 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Class mo3627(String str) {
        boolean z = 15;
        switch (str.hashCode()) {
            case -1850459313:
                Object[] objArr = new Object[1];
                a(false, new int[]{146, 6, 43, 1}, "\u0001��\u0001����\u0001", objArr);
                if (str.equals(((String) objArr[0]).intern())) {
                    z = 14;
                    break;
                }
                z = -1;
                break;
            case -1836618638:
                Object[] objArr2 = new Object[1];
                a(true, new int[]{0, 10, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001��\u0001\u0001", objArr2);
                if (str.equals(((String) objArr2[0]).intern())) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case -1666698098:
                Object[] objArr3 = new Object[1];
                b((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 9, Color.red(0) + 6, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr3);
                if (str.equals(((String) objArr3[0]).intern())) {
                    z = 6;
                    break;
                }
                z = -1;
                break;
            case -1401317165:
                Object[] objArr4 = new Object[1];
                b(18 - View.MeasureSpec.getSize(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 57, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1423), objArr4);
                if (str.equals(((String) objArr4[0]).intern())) {
                    f1351 = (f1350 + 1) % 128;
                    z = 10;
                    break;
                }
                z = -1;
                break;
            case -1338246468:
                Object[] objArr5 = new Object[1];
                b(TextUtils.indexOf("", "", 0, 0) + 41, MotionEvent.axisFromString("") + 16, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), objArr5);
                if (str.equals(((String) objArr5[0]).intern())) {
                    z = 8;
                    break;
                }
                z = -1;
                break;
            case -1139615429:
                Object[] objArr6 = new Object[1];
                a(true, new int[]{10, 39, 0, 10}, "��\u0001\u0001��\u0001��\u0001\u0001������\u0001\u0001\u0001\u0001\u0001\u0001��\u0001\u0001\u0001��\u0001��������\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001��\u0001", objArr6);
                if (str.equals(((String) objArr6[0]).intern())) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case -1115843213:
                Object[] objArr7 = new Object[1];
                a(false, new int[]{64, 14, 47, 10}, "����������\u0001��\u0001\u0001\u0001����\u0001��", objArr7);
                if (str.equals(((String) objArr7[0]).intern())) {
                    f1351 = (f1350 + 19) % 128;
                    z = 5;
                    break;
                }
                z = -1;
                break;
            case -650052115:
                Object[] objArr8 = new Object[1];
                b(22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 128, (char) ((Process.myTid() >> 22) + 5885), objArr8);
                if (str.equals(((String) objArr8[0]).intern())) {
                    int i = f1350 + 123;
                    f1351 = i % 128;
                    if (i % 2 == 0) {
                        z = 17;
                        break;
                    } else {
                        z = 113;
                        break;
                    }
                }
                z = -1;
                break;
            case -610771047:
                Object[] objArr9 = new Object[1];
                a(false, new int[]{152, 10, 169, 0}, "\u0001\u0001����\u0001����\u0001\u0001\u0001", objArr9);
                if (str.equals(((String) objArr9[0]).intern())) {
                    z = 20;
                    break;
                }
                z = -1;
                break;
            case -609786639:
                Object[] objArr10 = new Object[1];
                b(10 - View.MeasureSpec.getSize(0), 95 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) Color.argb(0, 0, 0, 0), objArr10);
                if (str.equals(((String) objArr10[0]).intern())) {
                    int i2 = f1350 + 91;
                    f1351 = i2 % 128;
                    if (i2 % 2 != 0) {
                        z = 40;
                        break;
                    }
                }
                z = -1;
                break;
            case -572702516:
                Object[] objArr11 = new Object[1];
                a(false, new int[]{49, 9, 145, 0}, "��\u0001��\u0001��������\u0001", objArr11);
                if (str.equals(((String) objArr11[0]).intern())) {
                    z = 3;
                    break;
                }
                z = -1;
                break;
            case -564429827:
                Object[] objArr12 = new Object[1];
                b(23 - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0') + 106, (char) (Process.myTid() >> 22), objArr12);
                if (str.equals(((String) objArr12[0]).intern())) {
                    z = 16;
                    break;
                }
                z = -1;
                break;
            case -150968480:
                Object[] objArr13 = new Object[1];
                b(9 - KeyEvent.getDeadChar(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 152, (char) TextUtils.getCapsMode("", 0, 0), objArr13);
                if (str.equals(((String) objArr13[0]).intern())) {
                    z = 18;
                    break;
                }
                z = -1;
                break;
            case 308060116:
                Object[] objArr14 = new Object[1];
                a(true, new int[]{78, 12, 196, 5}, "\u0001\u0001��\u0001\u0001\u0001����\u0001��\u0001\u0001", objArr14);
                if (str.equals(((String) objArr14[0]).intern())) {
                    f1351 = (f1350 + 47) % 128;
                    z = 7;
                    break;
                }
                z = -1;
                break;
            case 320151695:
                Object[] objArr15 = new Object[1];
                a(false, new int[]{105, 14, 127, 0}, "��\u0001��\u0001\u0001\u0001\u0001\u0001\u0001\u0001��\u0001\u0001\u0001", objArr15);
                if (str.equals(((String) objArr15[0]).intern())) {
                    int i3 = f1351 + 105;
                    f1350 = i3 % 128;
                    z = 12;
                    if (i3 % 2 == 0) {
                        z = true;
                        break;
                    }
                }
                z = -1;
                break;
            case 871099991:
                Object[] objArr16 = new Object[1];
                a(false, new int[]{90, 15, 0, 0}, "��\u0001\u0001\u0001������\u0001����\u0001\u0001��\u0001\u0001", objArr16);
                if (str.equals(((String) objArr16[0]).intern())) {
                    z = 9;
                    break;
                }
                z = -1;
                break;
            case 957243679:
                Object[] objArr17 = new Object[1];
                b(22 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 73 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr17);
                if (str.equals(((String) objArr17[0]).intern())) {
                    z = 11;
                    break;
                }
                z = -1;
                break;
            case 1228411167:
                a(false, new int[]{119, 27, 133, 26}, "\u0001��\u0001\u0001\u0001\u0001\u0001\u0001\u0001��\u0001\u0001\u0001\u0001\u0001\u0001\u0001����\u0001��\u0001\u0001\u0001\u0001\u0001\u0001", new Object[1]);
                if (!(!str.equals(((String) r0[0]).intern()))) {
                    f1351 = (f1350 + 63) % 128;
                    z = 13;
                    break;
                }
                z = -1;
                break;
            case 1955530641:
                Object[] objArr18 = new Object[1];
                b(((Process.getThreadPriority(0) + 20) >> 6) + 6, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) (30759 - ((Process.getThreadPriority(0) + 20) >> 6)), objArr18);
                if (str.equals(((String) objArr18[0]).intern())) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case 1955869213:
                Object[] objArr19 = new Object[1];
                a(true, new int[]{58, 6, 186, 0}, "\u0001\u0001\u0001\u0001��\u0001", objArr19);
                if (str.equals(((String) objArr19[0]).intern())) {
                    z = 4;
                    break;
                }
                z = -1;
                break;
            case 2117435870:
                Object[] objArr20 = new Object[1];
                b((ViewConfiguration.getEdgeSlop() >> 16) + 7, 160 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr20);
                if (str.equals(((String) objArr20[0]).intern())) {
                    z = 19;
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
            case true:
                return AdActivity.class;
            case true:
                return AdInfo.class;
            case true:
                return AdRequest.class;
            case true:
                return AdType.class;
            case true:
                return ImpressionData.class;
            case true:
                return MobileAds.class;
            case true:
            case true:
                return BannerAdView.class;
            case true:
                return VideoController.class;
            case true:
                return VideoEventListener.class;
            case true:
                return BannerAdEventListener.class;
            case true:
                return InterstitialAd.class;
            case true:
                return InterstitialAdEventListener.class;
            case true:
                return Reward.class;
            case true:
                return RewardedAd.class;
            case true:
                return RewardedAdEventListener.class;
            case true:
                return VideoAdPlaybackListener.class;
            case true:
                return MediaFile.class;
            case true:
                return VideoAd.class;
            case true:
                return RewardData.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Map mo3628() {
        HashMap hashMap = new HashMap();
        Object[] objArr = new Object[1];
        b((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11, Color.rgb(0, 0, 0) + 16777383, (char) Color.red(0), objArr);
        hashMap.put(((String) objArr[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cl.3

            /* renamed from: ﾒ, reason: contains not printable characters */
            private cl f1360;

            {
                this.f1360 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cl.m4359((AdInfo) list.get(0));
            }
        });
        Object[] objArr2 = new Object[1];
        a(false, new int[]{162, 10, 0, 2}, "��\u0001����\u0001��\u0001��\u0001\u0001", objArr2);
        hashMap.put(((String) objArr2[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cl.10

            /* renamed from: ｋ, reason: contains not printable characters */
            private cl f1355;

            {
                this.f1355 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cl.m4381((ImpressionData) list.get(0));
            }
        });
        Object[] objArr3 = new Object[1];
        a(false, new int[]{172, 21, 84, 20}, "\u0001\u0001��\u0001\u0001\u0001����\u0001\u0001\u0001����\u0001��\u0001\u0001\u0001\u0001\u0001\u0001", objArr3);
        hashMap.put(((String) objArr3[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cl.7

            /* renamed from: ﾇ, reason: contains not printable characters */
            private cl f1364;

            {
                this.f1364 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                cl.m4369((VideoController) list.get(0), (VideoEventListener) list.get(1));
                return null;
            }
        });
        Object[] objArr4 = new Object[1];
        b(TextUtils.getOffsetAfter("", 0) + 20, (KeyEvent.getMaxKeyCode() >> 16) + 178, (char) TextUtils.indexOf("", "", 0), objArr4);
        hashMap.put(((String) objArr4[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cl.9

            /* renamed from: ﾒ, reason: contains not printable characters */
            private cl f1366;

            {
                this.f1366 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cl.m4377((InterstitialAd) list.get(0));
            }
        });
        Object[] objArr5 = new Object[1];
        a(true, new int[]{193, 15, 193, 0}, "\u0001��\u0001������\u0001��\u0001����\u0001��\u0001��", objArr5);
        hashMap.put(((String) objArr5[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cl.8

            /* renamed from: ﻛ, reason: contains not printable characters */
            private cl f1365;

            {
                this.f1365 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return Integer.valueOf(cl.m4371((Reward) list.get(0)));
            }
        });
        Object[] objArr6 = new Object[1];
        a(false, new int[]{208, 13, 153, 0}, "����\u0001��\u0001����\u0001����\u0001\u0001\u0001", objArr6);
        hashMap.put(((String) objArr6[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cl.6

            /* renamed from: ｋ, reason: contains not printable characters */
            private cl f1363;

            {
                this.f1363 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cl.m4361((Reward) list.get(0));
            }
        });
        Object[] objArr7 = new Object[1];
        b(17 - View.MeasureSpec.getMode(0), Process.getGidForName("") + 199, (char) (61608 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr7);
        hashMap.put(((String) objArr7[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cl.13

            /* renamed from: ﾒ, reason: contains not printable characters */
            private cl f1358;

            {
                this.f1358 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return (AdInfo) cl.m4380(new Object[]{(RewardedAd) list.get(0)}, -1379383284, 1379383288, (int) System.currentTimeMillis());
            }
        });
        Object[] objArr8 = new Object[1];
        b(26 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 215, (char) TextUtils.getTrimmedLength(""), objArr8);
        hashMap.put(((String) objArr8[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cl.11

            /* renamed from: ｋ, reason: contains not printable characters */
            private cl f1356;

            {
                this.f1356 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                cl.m4376((RewardedAd) list.get(0), (RewardedAdEventListener) list.get(1));
                return null;
            }
        });
        Object[] objArr9 = new Object[1];
        b(29 - TextUtils.lastIndexOf("", '0'), 241 - KeyEvent.getDeadChar(0, 0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr9);
        hashMap.put(((String) objArr9[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cl.12

            /* renamed from: ﾇ, reason: contains not printable characters */
            private cl f1357;

            {
                this.f1357 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                cl.m4380(new Object[]{(InterstitialAd) list.get(0), (InterstitialAdEventListener) list.get(1)}, 1975334308, -1975334307, (int) System.currentTimeMillis());
                return null;
            }
        });
        Object[] objArr10 = new Object[1];
        b(Drawable.resolveOpacity(0, 0) + 15, 271 - (Process.myTid() >> 22), (char) (39278 - (KeyEvent.getMaxKeyCode() >> 16)), objArr10);
        hashMap.put(((String) objArr10[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cl.2

            /* renamed from: ﻐ, reason: contains not printable characters */
            private cl f1359;

            {
                this.f1359 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cl.m4374((MediaFile) list.get(0));
            }
        });
        Object[] objArr11 = new Object[1];
        b(19 - Color.red(0), 286 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 49096), objArr11);
        hashMap.put(((String) objArr11[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cl.4

            /* renamed from: ﻐ, reason: contains not printable characters */
            private cl f1361;

            {
                this.f1361 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cl.m4379((VideoAd) list.get(0));
            }
        });
        Object[] objArr12 = new Object[1];
        a(true, new int[]{221, 14, 111, 8}, "����\u0001\u0001\u0001��\u0001����\u0001��\u0001\u0001\u0001", objArr12);
        hashMap.put(((String) objArr12[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cl.5

            /* renamed from: ﾒ, reason: contains not printable characters */
            private cl f1362;

            {
                this.f1362 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return cl.m4362((VideoAd) list.get(0));
            }
        });
        Object[] objArr13 = new Object[1];
        b(KeyEvent.normalizeMetaState(0) + 24, 305 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (36394 - TextUtils.getOffsetAfter("", 0)), objArr13);
        hashMap.put(((String) objArr13[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cl.1

            /* renamed from: ｋ, reason: contains not printable characters */
            private cl f1354;

            {
                this.f1354 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                cl.m4357((BannerAdView) list.get(0), (BannerAdEventListener) list.get(1));
                return null;
            }
        });
        int i = f1350 + 37;
        f1351 = i % 128;
        if (i % 2 == 0) {
            return hashMap;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾒ */
    public final String mo3629() {
        return (String) m4380(new Object[]{this}, -1568378547, 1568378550, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }
}
