package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.VideoView;
import com.ironsource.adqualitysdk.sdk.i.hc;
import com.ironsource.adqualitysdk.sdk.i.hd;
import com.ironsource.adqualitysdk.sdk.i.he;
import com.ironsource.adqualitysdk.sdk.i.hh;
import com.ironsource.adqualitysdk.sdk.i.hi;
import com.ironsource.adqualitysdk.sdk.i.hl;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: ka.class */
public final class ka {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f2958 = 0;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static char f2959 = 0;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f2960 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static long f2961;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static long f2962;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static Field f2963;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f2964;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2965;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Field f2966;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Field f2967;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static Object f2968;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Class f2969;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static Field f2970;

    static {
        m5614();
        PointF.length(0.0f, 0.0f);
        ExpandableListView.getPackedPositionForGroup(0);
        KeyEvent.normalizeMetaState(0);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        TextUtils.indexOf("", "");
        TextUtils.indexOf("", "");
        TextUtils.getCapsMode("", 0, 0);
        View.combineMeasuredStates(0, 0);
        TextUtils.lastIndexOf("", '0');
        ViewConfiguration.getEdgeSlop();
        KeyEvent.getMaxKeyCode();
        ViewConfiguration.getKeyRepeatDelay();
        TextUtils.getOffsetBefore("", 0);
        PointF.length(0.0f, 0.0f);
        ViewConfiguration.getKeyRepeatDelay();
        Process.getGidForName("");
        Color.rgb(0, 0, 0);
        TextUtils.getOffsetBefore("", 0);
        ViewConfiguration.getLongPressTimeout();
        ImageFormat.getBitsPerPixel(0);
        Process.getGidForName("");
        View.MeasureSpec.getMode(0);
        Color.rgb(0, 0, 0);
        TextUtils.getOffsetAfter("", 0);
        ViewConfiguration.getMaximumFlingVelocity();
        ExpandableListView.getPackedPositionChild(0L);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        TextUtils.lastIndexOf("", '0', 0, 0);
        ViewConfiguration.getJumpTapTimeout();
        ImageFormat.getBitsPerPixel(0);
        int i = f2960 + 113;
        f2958 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0292  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r8, int r9, char r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ka.a(int, int, char, java.lang.Object[]):void");
    }

    private static void b(char c, int i, String str, String str2, String str3, Object[] objArr) {
        char[] cArr = str3;
        if (str3 != null) {
            $10 = ($11 + 115) % 128;
            cArr = str3.toCharArray();
            $10 = ($11 + 45) % 128;
        }
        char[] cArr2 = cArr;
        if (str2 != null) {
            str2 = str2.toCharArray();
        }
        char[] cArr3 = (char[]) str2;
        if (str != null) {
            $10 = ($11 + 69) % 128;
            str = str.toCharArray();
        }
        char[] cArr4 = (char[]) str;
        g gVar = new g();
        int length = cArr3.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        System.arraycopy(cArr3, 0, cArr5, 0, length);
        System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr7 = new char[length3];
        gVar.f2182 = 0;
        while (gVar.f2182 < length3) {
            try {
                Map map = b.f452;
                Object obj = map.get(844572084);
                if (obj == null) {
                    obj = ((Class) b.m3371(KeyEvent.getDeadChar(0, 0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 41)).getMethod("B", Object.class);
                    map.put(844572084, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, gVar)).intValue();
                Object obj2 = map.get(-204678676);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371(TextUtils.getOffsetAfter("", 0), (char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 41)).getMethod("z", Object.class);
                    map.put(-204678676, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, gVar)).intValue();
                char c2 = cArr5[gVar.f2182 % 4];
                char c3 = cArr6[intValue];
                Object obj3 = map.get(786100179);
                if (obj3 == null) {
                    Class cls = (Class) b.m3371(ViewConfiguration.getKeyRepeatDelay() >> 16, (char) Color.red(0), 40 - TextUtils.lastIndexOf("", '0'));
                    Class<?> cls2 = Integer.TYPE;
                    obj3 = cls.getMethod("A", Object.class, cls2, cls2);
                    map.put(786100179, obj3);
                }
                ((Method) obj3).invoke(null, gVar, Integer.valueOf(c2 * 32718), Integer.valueOf(c3));
                char c4 = cArr5[intValue2];
                char c5 = cArr6[intValue];
                Object obj4 = map.get(1393811622);
                if (obj4 == null) {
                    Class cls3 = (Class) b.m3371(View.MeasureSpec.getMode(0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 41 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    Class<?> cls4 = Integer.TYPE;
                    obj4 = cls3.getMethod("D", cls4, cls4);
                    map.put(1393811622, obj4);
                }
                cArr6[intValue2] = ((Character) ((Method) obj4).invoke(null, Integer.valueOf(c4 * 32718), Integer.valueOf(c5))).charValue();
                cArr5[intValue2] = gVar.f2183;
                int i2 = gVar.f2182;
                cArr7[i2] = (char) ((((r0 ^ cArr2[i2]) ^ (f2962 ^ (-6542782394566060766L))) ^ ((int) (f2965 ^ (-6542782394566060766L)))) ^ ((char) (f2959 ^ (-6542782394566060766L))));
                gVar.f2182 = i2 + 1;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr7);
    }

    public static View.OnClickListener el_(View view) {
        try {
            Object m5616 = m5616(new Object[]{view}, -629263989, 629263990, (int) System.currentTimeMillis());
            if (m5616 == null) {
                return null;
            }
            Class<?> cls = m5616.getClass();
            synchronized (jv.class) {
                try {
                    if (f2970 == null) {
                        Object[] objArr = new Object[1];
                        a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, 107 - TextUtils.indexOf((CharSequence) "", '0'), (char) (35819 - ExpandableListView.getPackedPositionChild(0L)), objArr);
                        f2970 = m5612(cls, ((String) objArr[0]).intern());
                    }
                } finally {
                }
            }
            return (View.OnClickListener) f2970.get(m5616);
        } catch (Exception e) {
            return null;
        }
    }

    public static void em_(View view, he.d dVar) {
        f2960 = (f2958 + 31) % 128;
        View.OnClickListener el_ = el_(view);
        if (!(el_ instanceof he)) {
            view.setOnClickListener(new he(el_, dVar));
        }
        int i = f2960 + 103;
        f2958 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static View.OnTouchListener en_(View view) {
        try {
            Object m5616 = m5616(new Object[]{view}, -629263989, 629263990, (int) System.currentTimeMillis());
            if (m5616 == null) {
                return null;
            }
            Class<?> cls = m5616.getClass();
            synchronized (jv.class) {
                try {
                    if (f2963 == null) {
                        Object[] objArr = new Object[1];
                        b((char) (13840 - TextUtils.lastIndexOf("", '0', 0)), (-1) - ExpandableListView.getPackedPositionChild(0L), "텟Ӧ싻읏", "눷䴾ᄃ縶", "\ue4bb鹧ꛐ鶃ﯜ붋詭㸙痭㰇➋靱쭻\uf1d4\u0acf㚠", objArr);
                        f2963 = m5612(cls, ((String) objArr[0]).intern());
                    }
                } finally {
                }
            }
            return (View.OnTouchListener) f2963.get(m5616);
        } catch (Exception e) {
            return null;
        }
    }

    public static MediaPlayer eo_(VideoView videoView) {
        f2958 = (f2960 + 81) % 128;
        try {
            Object[] objArr = new Object[1];
            b((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ViewConfiguration.getFadingEdgeLength() >> 16, "텟Ӧ싻읏", "\uf895�缿ṭ", "\ue0ce쇀끩ቈ\u2fdeᙪ沍㞻ސଢ଼İૠ", objArr);
            Field m5612 = m5612(VideoView.class, ((String) objArr[0]).intern());
            if (m5612 == null) {
                return null;
            }
            int i = f2958 + 57;
            f2960 = i % 128;
            if (i % 2 != 0) {
                return (MediaPlayer) m5612.get(videoView);
            }
            throw null;
        } catch (Exception e) {
            Object[] objArr2 = new Object[1];
            b((char) Drawable.resolveOpacity(0, 0), ViewConfiguration.getMinimumFlingVelocity() >> 16, "텟Ӧ싻읏", "眦힡鍹쐙", "栕\ue12d\ue641\uf2ceⴜ獶皢觵捁䒙䪒Ԧ", objArr2);
            String intern = ((String) objArr2[0]).intern();
            int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout();
            int green = Color.green(0);
            Object[] objArr3 = new Object[1];
            a(23 - (doubleTapTimeout >> 16), green + 124, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr3);
            kd.m5656(intern, ((String) objArr3[0]).intern(), e, false);
            return null;
        }
    }

    public static void ep_(MediaPlayer mediaPlayer, hd.b bVar) {
        f2960 = (f2958 + 19) % 128;
        try {
            long zoomControlsTimeout = ViewConfiguration.getZoomControlsTimeout();
            long uptimeMillis = SystemClock.uptimeMillis();
            Object[] objArr = new Object[1];
            a((zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 14, (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)) + 146, (char) (43254 - KeyEvent.keyCodeFromString("")), objArr);
            Field m5612 = m5612(MediaPlayer.class, ((String) objArr[0]).intern());
            MediaPlayer.OnInfoListener onInfoListener = (MediaPlayer.OnInfoListener) m5612.get(mediaPlayer);
            if (onInfoListener instanceof hd) {
                return;
            }
            m5612.set(mediaPlayer, new hd(onInfoListener, bVar));
            f2960 = (f2958 + 85) % 128;
        } catch (Exception e) {
            Object[] objArr2 = new Object[1];
            b((char) Color.alpha(0), KeyEvent.getMaxKeyCode() >> 16, "텟Ӧ싻읏", "眦힡鍹쐙", "栕\ue12d\ue641\uf2ceⴜ獶皢觵捁䒙䪒Ԧ", objArr2);
            String intern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            b((char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getLongPressTimeout() >> 16) - 864239959, "텟Ӧ싻읏", "ꦧ精\ueecc璜", "\ue283쩏錄泇\ufaed謰͵佩뤁㲔忉\ue5a7ڪ섭齤옥꾚钾�繮쥬湢\ueae4ϰ覔ꡍ䛓ꣻ㱲鲓笅먺敯彔꜖", objArr3);
            kd.m5656(intern, ((String) objArr3[0]).intern(), e, false);
        }
    }

    public static void eq_(MediaPlayer mediaPlayer, hc.d dVar) {
        m5616(new Object[]{mediaPlayer, dVar}, 1202142028, -1202142028, (int) System.currentTimeMillis());
    }

    public static void er_(MediaPlayer mediaPlayer, hl.a aVar) {
        f2958 = (f2960 + 9) % 128;
        try {
            int mode = View.MeasureSpec.getMode(0);
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
            Object[] objArr = new Object[1];
            a(mode + 19, 202 - bitsPerPixel, (char) (27600 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr);
            Field m5612 = m5612(MediaPlayer.class, ((String) objArr[0]).intern());
            MediaPlayer.OnPreparedListener onPreparedListener = (MediaPlayer.OnPreparedListener) m5612.get(mediaPlayer);
            if (onPreparedListener instanceof hl) {
                return;
            }
            m5612.set(mediaPlayer, new hl(onPreparedListener, aVar));
            f2960 = (f2958 + 39) % 128;
        } catch (Exception e) {
            Object[] objArr2 = new Object[1];
            b((char) (ViewConfiguration.getLongPressTimeout() >> 16), MotionEvent.axisFromString("") + 1, "텟Ӧ싻읏", "眦힡鍹쐙", "栕\ue12d\ue641\uf2ceⴜ獶皢觵捁䒙䪒Ԧ", objArr2);
            String intern = ((String) objArr2[0]).intern();
            int mode2 = View.MeasureSpec.getMode(0);
            int resolveOpacity = Drawable.resolveOpacity(0, 0);
            Object[] objArr3 = new Object[1];
            a(mode2 + 39, 222 - resolveOpacity, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), objArr3);
            kd.m5656(intern, ((String) objArr3[0]).intern(), e, false);
        }
    }

    public static void es_(MediaPlayer mediaPlayer, hi.d dVar) {
        f2958 = (f2960 + 93) % 128;
        try {
            float minVolume = AudioTrack.getMinVolume();
            int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize();
            Object[] objArr = new Object[1];
            a((minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)) + 23, 261 - (maximumDrawingCacheSize >> 24), (char) (IronSourceConstants.errorCode_showFailed - (ViewConfiguration.getWindowTouchSlop() >> 8)), objArr);
            Field m5612 = m5612(MediaPlayer.class, ((String) objArr[0]).intern());
            MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) m5612.get(mediaPlayer);
            if (onSeekCompleteListener instanceof hi) {
                return;
            }
            m5612.set(mediaPlayer, new hi(onSeekCompleteListener, dVar));
            f2960 = (f2958 + 3) % 128;
        } catch (Exception e) {
            Object[] objArr2 = new Object[1];
            b((char) (KeyEvent.getMaxKeyCode() >> 16), Color.green(0), "텟Ӧ싻읏", "眦힡鍹쐙", "栕\ue12d\ue641\uf2ceⴜ獶皢觵捁䒙䪒Ԧ", objArr2);
            String intern = ((String) objArr2[0]).intern();
            long uptimeMillis = SystemClock.uptimeMillis();
            float scrollFriction = ViewConfiguration.getScrollFriction();
            Object[] objArr3 = new Object[1];
            a((uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)) + 37, (scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)) + 283, (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr3);
            kd.m5656(intern, ((String) objArr3[0]).intern(), e, false);
        }
    }

    public static void eu_(View view, hh.c cVar) {
        View.OnTouchListener en_ = en_(view);
        if (!(en_ instanceof hh)) {
            view.setOnTouchListener(new hh(en_, cVar));
            f2960 = (f2958 + 45) % 128;
        }
        f2958 = (f2960 + 119) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static /* synthetic */ Object m5611(Object[] objArr) {
        MediaPlayer mediaPlayer = (MediaPlayer) objArr[0];
        hc.d dVar = (hc.d) objArr[1];
        f2958 = (f2960 + 121) % 128;
        try {
            Object[] objArr2 = new Object[1];
            b((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (-918510392) - View.MeasureSpec.getMode(0), "텟Ӧ싻읏", "젟䂤쫉쪁", "\ue4ac㑆糕ጱ�\uaa3f랊ݖ쓬籒馋⭨넳ꭞ㽓䋶蘫䘂睺畉�", objArr2);
            Field m5612 = m5612(MediaPlayer.class, ((String) objArr2[0]).intern());
            MediaPlayer.OnCompletionListener onCompletionListener = (MediaPlayer.OnCompletionListener) m5612.get(mediaPlayer);
            if (onCompletionListener instanceof hc) {
                return null;
            }
            m5612.set(mediaPlayer, new hc(onCompletionListener, dVar));
            f2958 = (f2960 + 29) % 128;
            return null;
        } catch (Exception e) {
            Object[] objArr3 = new Object[1];
            b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-1) - Process.getGidForName(""), "텟Ӧ싻읏", "眦힡鍹쐙", "栕\ue12d\ue641\uf2ceⴜ獶皢觵捁䒙䪒Ԧ", objArr3);
            String intern = ((String) objArr3[0]).intern();
            int resolveSize = View.resolveSize(0, 0);
            float maxVolume = AudioTrack.getMaxVolume();
            Object[] objArr4 = new Object[1];
            a(resolveSize + 41, 163 - (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr4);
            kd.m5656(intern, ((String) objArr4[0]).intern(), e, false);
            return null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Field m5612(Class cls, String str) {
        f2960 = (f2958 + 39) % 128;
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            int i = f2960 + 55;
            f2958 = i % 128;
            if (i % 2 == 0) {
                return declaredField;
            }
            throw null;
        } catch (Exception e) {
            Object[] objArr = new Object[1];
            b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, "텟Ӧ싻읏", "眦힡鍹쐙", "栕\ue12d\ue641\uf2ceⴜ獶皢觵捁䒙䪒Ԧ", objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b((char) (ViewConfiguration.getLongPressTimeout() >> 16), 435385353 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "텟Ӧ싻읏", "ࢼ\uf374耙兀", "垝쑞湀ℕ䬞滿쩩�ꄀ匠�ᰮຑ燗쵨ᱦᥙ⑻쵺Ἡ✨㲑烢≂⏓", objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), e, false);
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static List m5613(Class cls, Object obj) {
        int i = f2958 + 85;
        f2960 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (f2967 == null) {
            Object[] objArr = new Object[1];
            b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 40930), Color.blue(0), "텟Ӧ싻읏", "綛풑\ue232ꎟ", "\ua958晴攌\uf0b3Ꜷ돨", objArr);
            Field declaredField = cls.getDeclaredField(((String) objArr[0]).intern());
            f2967 = declaredField;
            declaredField.setAccessible(true);
        }
        Object obj2 = f2967.get(obj);
        if (obj2 instanceof List) {
            List list = (List) f2967.get(obj);
            f2958 = (f2960 + 121) % 128;
            return list;
        }
        if (!(obj2 instanceof View[])) {
            return new ArrayList();
        }
        int i2 = f2960 + 41;
        f2958 = i2 % 128;
        if (i2 % 2 == 0) {
            return Arrays.asList((View[]) f2967.get(obj));
        }
        Arrays.asList((View[]) f2967.get(obj));
        throw new ArithmeticException("divide by zero");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static void m5614() {
        f2964 = new char[]{53142, 54148, 63401, 39890, 49132, 17167, 26429, 2834, 12137, 12955, 54960, 64191, 40581, 41689, 17928, 27178, 3651, 4725, 13706, 55709, 64978, 33272, 42472, 18699, 27946, 29008, 5452, 14485, 56491, 57554, 3403, 4441, 13684, 22799, 32049, 33234, 42464, 51663, 60852, 61510, 5229, 14434, 23640, 24580, 34005, 43255, 52382, 53416, 63319, 6976, 16143, 17189, 26421, 35798, 45047, 45965, 55199, 64073, 7785, 8705, 17965, 27333, 3405, 4434, 13668, 22836, 32048, 33224, 42480, 51584, 60844, 61516, 5229, 3439, 4421, 13666, 22802, 32044, 33179, 42467, 51588, 60854, 61531, 5217, 14459, 23569, 24691, 34027, 43248, 52372, 53411, 63311, 7034, 16163, 17194, 26426, 35792, 45045, 45978, 55210, 64005, 7792, 8714, 17961, 27358, 36601, 37549, 46800, 34475, 39572, 48786, 53970, 63198, 2622, 11787, 16998, 26210, 31658, 40855, 45965, 55295, 60369, 3893, 8967, 3407, 4421, 13666, 22802, 32044, 33179, 42477, 51599, 60898, 61512, 5229, 14433, 23611, 24630, 34008, 43248, 52379, 53399, 63308, 7020, 16151, 17198, 26406, 42417, 47502, 40328, 61890, 54726, 10539, 3357, 24923, 17757, 22698, 48266, 36998, 62702, 51392, 11320, 3407, 4421, 13666, 22802, 32044, 33179, 42477, 51599, 60898, 61533, 5229, 14437, 23578, 24626, 34015, 43260, 52405, 53417, 63341, 7016, 16138, 17186, 26421, 35826, 45053, 45970, 55208, 64073, 7779, 8727, 17957, 27334, 36580, 37595, 46745, 55982, 63818, 7550, 8458, 17700, 27088, 26248, 31415, 24241, 13026, 5859, 59921, 52795, 41551, 34431, 39813, 32675, 21398, 14288, 3055, 61191, 49971, 42843, 47981, 40093, 3407, 4421, 13666, 22802, 32044, 33179, 42477, 51599, 60898, 61533, 5229, 14437, 23578, 24626, 34015, 43260, 52405, 53417, 63341, 7016, 16138, 17186, 26421, 35809, 45024, 45978, 55208, 64068, 7796, 8710, 17960, 27365, 36579, 37604, 46724, 55992, 63824, 7550, 8470, 7881, 758, 9968, 19104, 28341, 37456, 46689, 55852, 65059, 58316, 2038, 11255, 20381, 29609, 38743, 47963, 57117, 49978, 58586, 2278, 11406, 20640, 29864, 3407, 4421, 13666, 22802, 32044, 33179, 42477, 51599, 60898, 61533, 5229, 14437, 23578, 24626, 34015, 43260, 52405, 53417, 63347, 7016, 16139, 17184, 26391, 35806, 45055, 45967, 55220, 64064, 7794, 8710, 17920, 27328, 36601, 37603, 46741, 55987, 63835, 7529, 4873, 3893, 11063, 18240, 25444, 40848, 48036, 55242, 62462, 60968, 2600, 9789, 16983};
        f2961 = -7351902060203470537L;
        f2965 = -919218910;
        f2962 = 7096719636528563325L;
        f2959 = (char) 54562;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static /* synthetic */ Object m5615(Object[] objArr) {
        View view = (View) objArr[0];
        try {
            synchronized (jv.class) {
                try {
                    if (f2966 == null) {
                        char mirror = AndroidCharacter.getMirror('0');
                        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                        Object[] objArr2 = new Object[1];
                        a(mirror - '#', (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)) + 321, (char) (7758 - View.MeasureSpec.getMode(0)), objArr2);
                        f2966 = m5612(View.class, ((String) objArr2[0]).intern());
                    }
                } finally {
                }
            }
            return f2966.get(view);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Object m5616(Object[] objArr, int i, int i2, int i3) {
        int i4 = i3 ^ (-1);
        return ((((i * 217) + (i2 * (-215))) + (((i | i3) ^ (-1)) * 216)) + ((((i2 ^ (-1)) | i) | i4) * (-216))) + ((((i | i4) ^ (-1)) | i2) * 216) != 1 ? m5611(objArr) : m5615(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c1  */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<android.view.View> m5617() {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ka.m5617():java.util.List");
    }
}
