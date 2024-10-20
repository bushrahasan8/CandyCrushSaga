package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: hd.class */
public final class hd extends hf<MediaPlayer.OnInfoListener> implements MediaPlayer.OnInfoListener {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2344 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2345 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2346 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private b f2347;

    /* loaded from: hd$b.class */
    public interface b {
        boolean cI_(hd hdVar, MediaPlayer mediaPlayer, int i, int i2);
    }

    static {
        m5105();
        ViewConfiguration.getGlobalActionKeyTimeout();
        f2346 = (f2345 + 125) % 128;
    }

    public hd(MediaPlayer.OnInfoListener onInfoListener, b bVar) {
        super(onInfoListener);
        this.f2347 = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r9, int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hd.a(java.lang.String, int, java.lang.Object[]):void");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static void m5105() {
        f2344 = -1643124123158688726L;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        f2345 = (f2346 + 65) % 128;
        try {
            this.f2347.cI_(this, mediaPlayer, i, i2);
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a("\uef8b裯ℇ�状\uebf2萖㵎햟仝\ue713聝㢝턷䩆\ue2aa鯷㐾구䖺ﻔ霂じ", View.MeasureSpec.getSize(0) + 26437, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("\uef81婣萜컔㣢拍굓\u1779䅌诔\uf5c2㾁橴푼ḑ䣋닱ﲏ❛酹�ג俤릮\ue452\u2e6f頉", 46549 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (mo3633() == null) {
            return false;
        }
        f2346 = (f2345 + 45) % 128;
        boolean onInfo = mo3633().onInfo(mediaPlayer, i, i2);
        int i3 = f2345 + 41;
        f2346 = i3 % 128;
        if (i3 % 2 != 0) {
            return onInfo;
        }
        throw null;
    }
}
