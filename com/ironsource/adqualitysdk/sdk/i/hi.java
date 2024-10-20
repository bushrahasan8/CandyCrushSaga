package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.m4;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: hi.class */
public final class hi extends hf<MediaPlayer.OnSeekCompleteListener> implements MediaPlayer.OnSeekCompleteListener {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2358 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2359 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int[] f2360;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private d f2361;

    /* loaded from: hi$d.class */
    public interface d {
        void cK_(hi hiVar, MediaPlayer mediaPlayer);
    }

    static {
        m5111();
        Process.getThreadPriority(0);
        f2358 = (f2359 + 79) % 128;
    }

    public hi(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener, d dVar) {
        super(onSeekCompleteListener);
        this.f2361 = dVar;
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int[] iArr2;
        int length;
        int i2;
        m mVar = new m();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f2360;
        int i3 = 122833333;
        int[] iArr4 = iArr3;
        if (iArr3 != null) {
            int i4 = $11;
            $10 = (i4 + 95) % 128;
            int length2 = iArr3.length;
            int[] iArr5 = new int[length2];
            $10 = (i4 + 105) % 128;
            for (int i5 = 0; i5 < length2; i5++) {
                int i6 = iArr3[i5];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122833333);
                    if (obj == null) {
                        obj = ((Class) b.m3371((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, (char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 41)).getMethod(m4.p, Integer.TYPE);
                        map.put(122833333, obj);
                    }
                    iArr5[i5] = ((Integer) ((Method) obj).invoke(null, Integer.valueOf(i6))).intValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $10 = ($11 + 125) % 128;
            iArr4 = iArr5;
        }
        int length3 = iArr4.length;
        int[] iArr6 = new int[length3];
        int[] iArr7 = f2360;
        if (iArr7 != null) {
            int i7 = $10 + 9;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = iArr7.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                $10 = ($11 + 51) % 128;
                int i8 = iArr7[i2];
                Map map2 = b.f452;
                Object obj2 = map2.get(Integer.valueOf(i3));
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371(ViewConfiguration.getScrollDefaultDelay() >> 16, (char) Drawable.resolveOpacity(0, 0), View.combineMeasuredStates(0, 0) + 41)).getMethod(m4.p, Integer.TYPE);
                    i3 = 122833333;
                    map2.put(122833333, obj2);
                }
                iArr2[i2] = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i8))).intValue();
                i2++;
                $11 = ($10 + 65) % 128;
            }
        } else {
            iArr2 = iArr7;
        }
        System.arraycopy(iArr2, 0, iArr6, 0, length3);
        mVar.f3040 = 0;
        while (true) {
            int i9 = mVar.f3040;
            if (i9 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i10 = iArr[i9];
            char c = (char) (i10 >> 16);
            cArr[0] = c;
            char c2 = (char) i10;
            cArr[1] = c2;
            char c3 = (char) (iArr[i9 + 1] >> 16);
            cArr[2] = c3;
            char c4 = (char) iArr[i9 + 1];
            cArr[3] = c4;
            mVar.f3039 = (c << 16) + c2;
            mVar.f3038 = (c3 << 16) + c4;
            m.m5748(iArr6);
            for (int i11 = 0; i11 < 16; i11++) {
                int i12 = mVar.f3039 ^ iArr6[i11];
                mVar.f3039 = i12;
                int m5749 = m.m5749(i12);
                Map map3 = b.f452;
                Object obj3 = map3.get(10695560);
                if (obj3 == null) {
                    obj3 = ((Class) b.m3371(KeyEvent.getDeadChar(0, 0), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 41)).getMethod("k", Object.class, Integer.TYPE, Object.class, Object.class);
                    map3.put(10695560, obj3);
                }
                int intValue = ((Integer) ((Method) obj3).invoke(null, mVar, Integer.valueOf(m5749), mVar, mVar)).intValue();
                mVar.f3039 = mVar.f3038;
                mVar.f3038 = intValue;
            }
            int i13 = mVar.f3039;
            int i14 = mVar.f3038;
            mVar.f3039 = i14;
            mVar.f3038 = i13;
            int i15 = i13 ^ iArr6[16];
            mVar.f3038 = i15;
            int i16 = i14 ^ iArr6[17];
            mVar.f3039 = i16;
            cArr[0] = (char) (i16 >>> 16);
            cArr[1] = (char) i16;
            cArr[2] = (char) (i15 >>> 16);
            cArr[3] = (char) i15;
            m.m5748(iArr6);
            int i17 = mVar.f3040;
            cArr2[i17 * 2] = cArr[0];
            cArr2[(i17 * 2) + 1] = cArr[1];
            cArr2[(i17 * 2) + 2] = cArr[2];
            cArr2[(i17 * 2) + 3] = cArr[3];
            Map map4 = b.f452;
            Object obj4 = map4.get(1365438799);
            if (obj4 == null) {
                obj4 = ((Class) b.m3371(TextUtils.indexOf((CharSequence) "", '0') + 1, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 40)).getMethod("m", Object.class, Object.class);
                map4.put(1365438799, obj4);
            }
            ((Method) obj4).invoke(null, mVar, mVar);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static void m5111() {
        f2360 = new int[]{-533042884, -1334656312, -504532724, -1333076576, -968225601, -1278414211, 844270414, 1399877719, -291437797, -1530978503, -1998165247, -1619906986, 1772497652, 1491914296, -923422540, 316216889, -1912224778, 256618506};
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        f2359 = (f2358 + 115) % 128;
        try {
            this.f2361.cK_(this, mediaPlayer);
            f2358 = (f2359 + 105) % 128;
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a(new int[]{1585787304, 290788505, -2004872563, -660768221, 1666712791, 1702093709, -1706329409, -1446716857, -840091691, -1071737045, 2133523733, 1348707985, 271916469, -2033193961, 1444803220, 1299816960}, 30 - TextUtils.lastIndexOf("", '0', 0, 0), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new int[]{1503368836, -342802269, 1280473237, -2097070947, -374591619, -1612557683, 1049356904, 1670182574, -1818124217, -559162720, 396333637, -609749241, 662149157, 258679412, 2055151244, 287991065, -1368129882, -1104342248}, TextUtils.getOffsetAfter("", 0) + 35, objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (mo3633() != null) {
            mo3633().onSeekComplete(mediaPlayer);
        }
    }
}
