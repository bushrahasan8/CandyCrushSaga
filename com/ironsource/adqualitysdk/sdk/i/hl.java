package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* loaded from: hl.class */
public final class hl extends hf<MediaPlayer.OnPreparedListener> implements MediaPlayer.OnPreparedListener {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2375 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2376;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2377;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2378;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private a f2379;

    /* loaded from: hl$a.class */
    public interface a {
        void cJ_(hl hlVar, MediaPlayer mediaPlayer);
    }

    static {
        m5122();
        AudioTrack.getMinVolume();
        ViewConfiguration.getFadingEdgeLength();
        KeyEvent.getModifierMetaStateMask();
        int i = f2376 + 123;
        f2375 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    public hl(MediaPlayer.OnPreparedListener onPreparedListener, a aVar) {
        super(onPreparedListener);
        this.f2379 = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r8, int r9, char r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hl.a(int, int, char, java.lang.Object[]):void");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static void m5122() {
        f2377 = new char[]{3429, 23765, 44632, 63979, 19211, 39567, 58413, 14255, 33223, 54103, 8908, 35960, 57237, 10499, 30881, 51771, 5215, 26617, 45404, 140, 21021, 48544, 3886, 22860, 43206, 64108, 17890, 3439, 23753, 44666, 63990, 19228, 39647, 58405, 14259, 33154, 54110, 8916, 35955, 57258, 10526, 30903, 51745, 5215, 26597, 45437, 155, 21086, 48544, 3890, 22909, 43200, 64102, 17888, 38656, 59012, 12322, 33712};
        f2378 = -3007068744921555781L;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        f2376 = (f2375 + 51) % 128;
        try {
            this.f2379.cJ_(this, mediaPlayer);
        } catch (Throwable th) {
            int indexOf = TextUtils.indexOf("", "", 0);
            int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength();
            Object[] objArr = new Object[1];
            a(indexOf + 27, fadingEdgeLength >> 16, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), objArr);
            String intern = ((String) objArr[0]).intern();
            long uptimeMillis = SystemClock.uptimeMillis();
            int gidForName = Process.getGidForName("");
            Object[] objArr2 = new Object[1];
            a((uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)) + 30, 26 - gidForName, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (mo3633() != null) {
            int i = f2376 + 41;
            f2375 = i % 128;
            if (i % 2 == 0) {
                mo3633().onPrepared(mediaPlayer);
                throw new ArithmeticException("divide by zero");
            }
            mo3633().onPrepared(mediaPlayer);
        }
    }
}
