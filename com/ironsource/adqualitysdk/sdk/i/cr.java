package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.VideoView;
import java.util.List;

/* loaded from: cr.class */
public final class cr extends db {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1512 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1513;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1514;

    static {
        m4476();
        ViewConfiguration.getDoubleTapTimeout();
        TextUtils.lastIndexOf("", '0', 0);
        KeyEvent.keyCodeFromString("");
        TextUtils.getOffsetBefore("", 0);
        TextUtils.getTrimmedLength("");
        Color.blue(0);
        AndroidCharacter.getMirror('0');
        KeyEvent.getDeadChar(0, 0);
        ViewConfiguration.getLongPressTimeout();
        ViewConfiguration.getTouchSlop();
        ViewConfiguration.getScrollDefaultDelay();
        ViewConfiguration.getWindowTouchSlop();
        TextUtils.lastIndexOf("", '0', 0);
        Color.blue(0);
        KeyEvent.normalizeMetaState(0);
        Color.alpha(0);
        ViewConfiguration.getPressedStateDuration();
        KeyEvent.normalizeMetaState(0);
        ViewConfiguration.getTapTimeout();
        ViewConfiguration.getMaximumDrawingCacheSize();
        SystemClock.uptimeMillis();
        int i = f1512 + 99;
        f1513 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static Object m4470(List<Object> list) {
        f1513 = (f1512 + 99) % 128;
        MediaPlayer eo_ = ka.eo_((VideoView) db.m4587(list, 0, VideoView.class));
        int i = f1513 + 125;
        f1512 = i % 128;
        if (i % 2 != 0) {
            return eo_;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static long m4471() {
        f1512 = (f1513 + 79) % 128;
        long longValue = ((Long) jv.m5593(new Object[0])).longValue();
        f1512 = (f1513 + 57) % 128;
        return longValue;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Object m4472(List<Object> list) {
        f1512 = (f1513 + 63) % 128;
        return ((Pair) db.m4587(list, 0, Pair.class)).second;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Object m4473(List<Object> list) {
        return m4478(new Object[]{list}, 1802843218, -1802843218, (int) System.currentTimeMillis());
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Object m4474(List<Object> list) {
        f1513 = (f1512 + 11) % 128;
        Object obj = ((Pair) db.m4587(list, 0, Pair.class)).first;
        int i = f1513 + 97;
        f1512 = i % 128;
        if (i % 2 != 0) {
            return obj;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Object m4475(List<Object> list) {
        Context context;
        Object obj;
        int i = f1512 + 117;
        f1513 = i % 128;
        if (i % 2 != 0) {
            Context context2 = (Context) db.m4587(list, 1, Context.class);
            obj = db.m4587(list, 0, BroadcastReceiver.class);
            context = context2;
        } else {
            Context context3 = (Context) db.m4587(list, 0, Context.class);
            Object m4587 = db.m4587(list, 1, BroadcastReceiver.class);
            context = context3;
            obj = m4587;
        }
        av.aH_(av.m3316(context), (BroadcastReceiver) obj);
        f1512 = (f1513 + 21) % 128;
        return null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static void m4476() {
        f1514 = 287397456;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m4477(List<Object> list) {
        Context context;
        Object m4587;
        BroadcastReceiver broadcastReceiver;
        int i = f1513 + 67;
        f1512 = i % 128;
        if (i % 2 == 0) {
            context = (Context) db.m4587(list, 0, Context.class);
            BroadcastReceiver broadcastReceiver2 = (BroadcastReceiver) db.m4587(list, 1, BroadcastReceiver.class);
            m4587 = db.m4587(list, 4, IntentFilter.class);
            broadcastReceiver = broadcastReceiver2;
        } else {
            context = (Context) db.m4587(list, 0, Context.class);
            BroadcastReceiver broadcastReceiver3 = (BroadcastReceiver) db.m4587(list, 1, BroadcastReceiver.class);
            m4587 = db.m4587(list, 2, IntentFilter.class);
            broadcastReceiver = broadcastReceiver3;
        }
        av.aG_(av.m3316(context), broadcastReceiver, (IntentFilter) m4587);
        int i2 = f1512 + 61;
        f1513 = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Object m4478(Object[] objArr, int i, int i2, int i3) {
        int i4 = 0;
        List list = (List) objArr[0];
        int i5 = f1513 + 113;
        f1512 = i5 % 128;
        if (i5 % 2 == 0) {
            i4 = 1;
        }
        return av.m3316((Context) db.m4587(list, i4, Context.class));
    }
}
