package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* loaded from: hc.class */
public final class hc extends hf<MediaPlayer.OnCompletionListener> implements MediaPlayer.OnCompletionListener {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2339 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f2340 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2341 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2342;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private d f2343;

    /* loaded from: hc$d.class */
    public interface d {
        void cH_(hc hcVar, MediaPlayer mediaPlayer);
    }

    static {
        m5103();
        ViewConfiguration.getScrollBarFadeDuration();
        TextUtils.getOffsetAfter("", 0);
        View.MeasureSpec.getSize(0);
        f2341 = (f2339 + 59) % 128;
    }

    public hc(MediaPlayer.OnCompletionListener onCompletionListener, d dVar) {
        super(onCompletionListener);
        this.f2343 = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x020b, code lost:
    
        r0[r0] = (char) r0[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0215, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.b.f452;
        r11 = r0.get(518145355);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0228, code lost:
    
        if (r11 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x022e, code lost:
    
        r11 = ((java.lang.Class) com.ironsource.adqualitysdk.sdk.i.b.m3371(android.graphics.Color.argb(0, 0, 0, 0), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) - 1), 42 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)))).getMethod("i", java.lang.Object.class, java.lang.Object.class);
        r0.put(518145355, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x026e, code lost:
    
        ((java.lang.reflect.Method) r11).invoke(null, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x028d, code lost:
    
        throw new java.lang.ArithmeticException("divide by zero");
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0318  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r8, int r9, char r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hc.a(int, int, char, java.lang.Object[]):void");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static void m5103() {
        f2342 = new char[]{36942, 30732, 16516, 10567, 12768, 6558, 57919, 51921, 54125, 47891, 33712, 27694, 29929, 23919, 9496, 3512, 5716, 65276, 50834, 44842, 47097, 32891, 26848, 28811, 22843, 8651, 2683, 4639, 64167, 34152, 27964, 21913, 15467, 9427, 3298, 63254, 57334, 50709, 44603, 38567, 30990, 25029, 18499, 12340, 6292, 888, 60368, 54206, 47622, 41649, 38237, 32193, 25995, 19466, 13547, 8019, 1840, 61340, 54894, 48862, 42687, 35107};
        f2340 = -4984352428830300855L;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        try {
            this.f2343.cH_(this, mediaPlayer);
        } catch (Throwable th) {
            int maxKeyCode = KeyEvent.getMaxKeyCode();
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            Object[] objArr = new Object[1];
            a((maxKeyCode >> 16) + 29, 1 - (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 40236), objArr);
            String intern = ((String) objArr[0]).intern();
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
            int maxKeyCode2 = KeyEvent.getMaxKeyCode();
            Object[] objArr2 = new Object[1];
            a(33 - packedPositionGroup, (maxKeyCode2 >> 16) + 29, (char) (TextUtils.getOffsetBefore("", 0) + 34823), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (mo3633() != null) {
            int i = f2339 + 91;
            f2341 = i % 128;
            if (i % 2 == 0) {
                mo3633().onCompletion(mediaPlayer);
                throw new ArithmeticException("divide by zero");
            }
            mo3633().onCompletion(mediaPlayer);
        }
        int i2 = f2341 + 89;
        f2339 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
