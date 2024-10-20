package com.ironsource.adqualitysdk.sdk.i;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.UUID;

/* loaded from: ik.class */
public final class ik {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2608 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2609 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2610 = 1;

    static {
        m5367();
        AudioTrack.getMaxVolume();
        View.getDefaultSize(0, 0);
        AudioTrack.getMinVolume();
        int i = f2609 + 21;
        f2610 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0312  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r7, int r8, boolean r9, int r10, java.lang.String r11, java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ik.a(int, int, boolean, int, java.lang.String, java.lang.Object[]):void");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m5363(String str, String str2) {
        f2609 = (f2610 + 31) % 128;
        v.m5763(str, str2);
        f2609 = (f2610 + 71) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m5364(String str, String str2) {
        f2610 = (f2609 + 1) % 128;
        v.m5753(str, str2);
        f2610 = (f2609 + 105) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static String m5365(Context context) {
        f2610 = (f2609 + 29) % 128;
        ContentResolver contentResolver = context.getApplicationContext().getContentResolver();
        Object[] objArr = new Object[1];
        a(9 - Process.getGidForName(""), Color.alpha(0) + 5, false, Drawable.resolveOpacity(0, 0) + 103, "\u0002�\ufff8\u0002�\ufffa\u0007�\u000b\b", objArr);
        String string = Settings.Secure.getString(contentResolver, ((String) objArr[0]).intern());
        String str = string;
        if (string == null) {
            Object[] objArr2 = new Object[1];
            a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33, ((byte) KeyEvent.getModifierMetaStateMask()) + 32, false, 93 - ((byte) KeyEvent.getModifierMetaStateMask()), "￭\uffe7\uffe7\ufff8￣ￂ\ufff1\u0004\u0015\u0005\u0017\u0014\u0007\u0006\ufff5\n\u0003\u0014\u0007\u0006\ufff2\u0014\u0007\b\u0007\u0014\u0007\u0010\u0005\u0007\u0015￫\ufff5", objArr2);
            String intern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a(View.resolveSize(0, 0) + 46, 33 - Color.argb(0, 0, 0, 0), false, 86 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u0012ￊ￫\ufff8￮￼\ufff9\ufff3￮\t\ufff3￮\uffd8ￊ\uffff\u001d\u0013\u0018\u0011ￊ\u0011\u000f\u0018\u000f\u001c\u000b\u001e\u000f\u000eￊ\u0013\u000e\uffd8￭\u0019\u001f\u0016\u000e\u0018\uffd1\u001eￊ\u0010\u000f\u001e\r", objArr3);
            m5363(intern, ((String) objArr3[0]).intern());
            str = m5366(context);
        }
        f2609 = (f2610 + 101) % 128;
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m5366(Context context) {
        f2610 = (f2609 + 69) % 128;
        Object[] objArr = new Object[1];
        a(11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 6 - KeyEvent.getDeadChar(0, 0), true, 98 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "ￍ\u0004\u0011\u000e\u0013\u0012\u0001\u0003ￍ\u0015\n", objArr);
        SharedPreferences sharedPreferences = context.getSharedPreferences(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        a(18 - (ViewConfiguration.getTouchSlop() >> 8), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 15, true, 102 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\ufffe\uffff\u000e\ufffb\f\uffff\b\uffff\u0001\uffc8\ufffb\u0006\u0007\t\t\r\ufffe\u0003", objArr2);
        String string = sharedPreferences.getString(((String) objArr2[0]).intern(), null);
        if (!(!TextUtils.isEmpty(string))) {
            f2610 = (f2609 + 45) % 128;
            string = UUID.randomUUID().toString();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            Object[] objArr3 = new Object[1];
            a(KeyEvent.keyCodeFromString("") + 18, 17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), true, 102 - Color.alpha(0), "\ufffe\uffff\u000e\ufffb\f\uffff\b\uffff\u0001\uffc8\ufffb\u0006\u0007\t\t\r\ufffe\u0003", objArr3);
            edit.putString(((String) objArr3[0]).intern(), string).commit();
        }
        return string;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static void m5367() {
        f2608 = 287397421;
    }
}
