package com.ironsource.adqualitysdk.sdk.i;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.AsyncTask;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;

/* loaded from: jv.class */
public class jv {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2924 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2925 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2926;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2927;

    static {
        m5589();
        Color.red(0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        Process.getElapsedCpuTime();
        MotionEvent.axisFromString("");
        View.MeasureSpec.getMode(0);
        Color.rgb(0, 0, 0);
        f2927 = (f2925 + 115) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x028d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r8, int r9, char r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jv.a(int, int, char, java.lang.Object[]):void");
    }

    @TargetApi(3)
    public static void ek_(AsyncTask<Object, Object, Object> asyncTask, Object... objArr) {
        f2927 = (f2925 + 3) % 128;
        asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, objArr);
        int i = f2927 + 5;
        f2925 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static void m5589() {
        f2926 = new char[]{9184, 49377, 58872, 35457, 45046, 19706, 29180, 5805, 15321, 55495, 64976, 58053, 34728, 42160, 18822, 28302, 5013, 12445, 54677, 64153, 27305, 35262, 44214, 50081, 59044, 1460, 14511, 24471, 29333, 37345, 46218, 43904, 52865, 60810, 138, 10116, 23275, 31205, 40183, 46055, 55000, 62915, 59578, 4041, 8899, 16839, 25686, 39729, 48677, 56621, 61473, 5937, 2570, 10512, 46457, 22141, 3455, 61051, 52070, 41992, 33030, 6965, 63509, 56623, 45582, 38657, 29697, 18691, 11811, 805, 57356, 50482, 55850, 48932, 40006, 3439, 61021, 52050, 42058, 33100, 25107, 24400, 14444, 5473, 63093, 54113, 52333, 43362, 35330, 26370, 16390, 15706, 7692, 64260, 54279, 45351, 37421, 36643, 44218, 20360, 27271, 1439, 8345, 50118, 65154, 39342, 46258, 22451, 29369, 28065, 2221, 11225, 50841, 57808, 40138, 49097, 23255, 30169, 4331, 13282, 11953, 51693, 58603, 34789, 41490, 3417, 60992, 52047, 42056, 33106, 25170, 24345, 14461, 5488, 63078, 54139, 52344, 43380, 35338, 26383, 16394};
        f2924 = -5216963966796239313L;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] m5590(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        f2927 = (f2925 + 45) % 128;
        int i = 0;
        while (i < length) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
            i += 2;
            f2927 = (f2925 + 99) % 128;
        }
        return bArr;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static long m5591() {
        f2927 = (f2925 + 51) % 128;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        int i = f2927 + 93;
        f2925 = i % 128;
        if (i % 2 != 0) {
            return timeInMillis;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static List m5592(List list, List list2) {
        HashSet hashSet = new HashSet(list);
        if (list2 != null) {
            f2925 = (f2927 + 53) % 128;
            hashSet.addAll(list2);
        }
        ArrayList arrayList = new ArrayList(hashSet);
        int i = f2925 + 25;
        f2927 = i % 128;
        if (i % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Object m5593(Object[] objArr) {
        int i = f2925 + 51;
        f2927 = i % 128;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        int i2 = f2927 + 71;
        f2925 = i2 % 128;
        if (i2 % 2 != 0) {
            return Long.valueOf(elapsedRealtime);
        }
        throw null;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: ﾇ, reason: contains not printable characters */
    public static String m5594(String str, String str2, String str3, String str4) {
        CipherInputStream cipherInputStream;
        StringBuilder sb = new StringBuilder();
        try {
            try {
                byte[] decode = Base64.decode(str.getBytes(), 0);
                byte[] copyOfRange = Arrays.copyOfRange(decode, 16, decode.length);
                try {
                    byte[] m5590 = m5590(str3);
                    byte[] m55902 = m5590(str4);
                    Object[] objArr = new Object[1];
                    a(20 - Color.alpha(0), Gravity.getAbsoluteGravity(0, 0), (char) ((Process.myPid() >> 22) + 11915), objArr);
                    Cipher cipher = Cipher.getInstance(((String) objArr[0]).intern());
                    PBEKeySpec pBEKeySpec = new PBEKeySpec(str2.toCharArray(), m55902, 1, 256);
                    Object[] objArr2 = new Object[1];
                    a(34 - (ViewConfiguration.getTapTimeout() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 20, (char) (26580 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr2);
                    String intern = ((String) objArr2[0]).intern();
                    Object[] objArr3 = new Object[1];
                    a(Color.blue(0) + 2, 54 - KeyEvent.getDeadChar(0, 0), (char) (47121 - (ViewConfiguration.getWindowTouchSlop() >> 8)), objArr3);
                    cipher.init(2, SecretKeyFactory.getInstance(intern, ((String) objArr3[0]).intern()).generateSecret(pBEKeySpec), new IvParameterSpec(m5590, 0, cipher.getBlockSize()));
                    cipherInputStream = new CipherInputStream(new ByteArrayInputStream(copyOfRange), cipher);
                    try {
                        ImageFormat.getBitsPerPixel(0);
                        ViewConfiguration.getMinimumFlingVelocity();
                        TextUtils.lastIndexOf("", '0', 0);
                        byte[] bArr = new byte[8192];
                        for (int read = cipherInputStream.read(bArr); read >= 0; read = cipherInputStream.read(bArr)) {
                            Object[] objArr4 = new Object[1];
                            a(5 - TextUtils.indexOf("", "", 0, 0), 56 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), objArr4);
                            sb.append(new String(bArr, 0, read, ((String) objArr4[0]).intern()));
                        }
                        cipherInputStream.close();
                    } catch (Throwable th) {
                        th = th;
                        try {
                            Object[] objArr5 = new Object[1];
                            a(14 - Color.red(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 61, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 5726), objArr5);
                            String intern2 = ((String) objArr5[0]).intern();
                            Object[] objArr6 = new Object[1];
                            a(23 - Gravity.getAbsoluteGravity(0, 0), 75 - View.combineMeasuredStates(0, 0), (char) KeyEvent.getDeadChar(0, 0), objArr6);
                            kd.m5656(intern2, ((String) objArr6[0]).intern(), th, false);
                            if (cipherInputStream != null) {
                                cipherInputStream.close();
                                return sb.toString();
                            }
                            f2925 = (f2927 + 107) % 128;
                            return sb.toString();
                        } catch (Throwable th2) {
                            if (cipherInputStream != null) {
                                try {
                                    cipherInputStream.close();
                                    f2925 = (f2927 + 47) % 128;
                                } catch (Throwable th3) {
                                }
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cipherInputStream = null;
                }
            } catch (Throwable th5) {
                Object[] objArr7 = new Object[1];
                a(15 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 61, (char) (5725 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr7);
                String intern3 = ((String) objArr7[0]).intern();
                Object[] objArr8 = new Object[1];
                a(27 - TextUtils.getOffsetBefore("", 0), 98 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (Gravity.getAbsoluteGravity(0, 0) + 41429), objArr8);
                kd.m5656(intern3, ((String) objArr8[0]).intern(), th5, false);
            }
        } catch (Throwable th6) {
        }
        return sb.toString();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static long m5595() {
        return ((Long) m5593(new Object[0])).longValue();
    }
}
