package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: id.class */
public final class id {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2506 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static long f2507;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f2508;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2509;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static final byte[] f2510;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2511;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private SecretKey f2512;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Cipher f2513;

    /* renamed from: ｋ, reason: contains not printable characters */
    private Cipher f2514;

    /* loaded from: id$c.class */
    public final class c extends Exception {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private id f2515;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(id idVar, String str) {
            super(str);
            this.f2515 = idVar;
        }
    }

    static {
        m5333();
        ExpandableListView.getPackedPositionGroup(0L);
        AudioTrack.getMinVolume();
        TextUtils.getOffsetAfter("", 0);
        MotionEvent.axisFromString("");
        ViewConfiguration.getWindowTouchSlop();
        ExpandableListView.getPackedPositionForGroup(0);
        KeyEvent.getMaxKeyCode();
        TextUtils.indexOf("", "");
        Process.getGidForName("");
        TextUtils.indexOf("", "", 0);
        View.getDefaultSize(0, 0);
        ViewConfiguration.getScrollBarSize();
        ExpandableListView.getPackedPositionType(0L);
        ViewConfiguration.getScrollBarFadeDuration();
        ViewConfiguration.getDoubleTapTimeout();
        f2510 = new byte[]{16, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};
        f2509 = (f2506 + 109) % 128;
    }

    public id(byte[] bArr, String str, String str2, String str3) {
        byte[] digest;
        try {
            try {
                Object[] objArr = new Object[1];
                a(29 - Gravity.getAbsoluteGravity(0, 0), TextUtils.getOffsetAfter("", 0) + 26, false, (ViewConfiguration.getScrollBarSize() >> 8) + 122, "\u0013\u0005\u0010\u0004\u000f\u0004��\n��￮\ufff1\ufff2\ufffe\u0005\u0010�\u0001\u000f￩\uffff\ufffe\uffff￩\ufffe\uffff\f\ufffe\u0001", objArr);
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(((String) objArr[0]).intern());
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                sb.append(str3);
                digest = secretKeyFactory.generateSecret(new PBEKeySpec(sb.toString().toCharArray(), bArr, 1024, 256)).getEncoded();
            } catch (GeneralSecurityException e) {
                Object[] objArr2 = new Object[1];
                b((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19, ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
                String intern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                a(58 - Process.getGidForName(""), (ViewConfiguration.getEdgeSlop() >> 16) + 39, false, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 149, "\n\u0003\r\u0006\uffc1\u0005\u0006\u0017\n\u0004\u0006ￏ\uffc1\ufff5\u0013\u001a\n\u000f\b\uffc1\u0005\n\u0007\u0007\u0006\u0013\u0006\u000f\u0015\uffc1\u0002\u0011\u0011\u0013\u0010\u0002\u0004\tￏ\ufff1\u0013\u0010\u0003\u0002\u0003\r\u001a\uffc1\u0002\u000f\uffc1\n\u000f\u0004\u0010\u000e\u0011\u0002\u0015", objArr3);
                ik.m5364(intern, ((String) objArr3[0]).intern());
                Object[] objArr4 = new Object[1];
                b(TextUtils.getOffsetAfter("", 0) + 3, (ViewConfiguration.getEdgeSlop() >> 16) + 19, (char) View.MeasureSpec.getMode(0), objArr4);
                MessageDigest messageDigest = MessageDigest.getInstance(((String) objArr4[0]).intern());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(str2);
                sb2.append(str3);
                for (char c2 : sb2.toString().toCharArray()) {
                    messageDigest.update((byte) c2);
                }
                digest = messageDigest.digest();
            }
            Object[] objArr5 = new Object[1];
            a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2, 2 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), true, 126 - (ViewConfiguration.getTapTimeout() >> 16), "�\ufff9\u000b", objArr5);
            this.f2512 = new SecretKeySpec(digest, ((String) objArr5[0]).intern());
            m5332();
        } catch (NoSuchAlgorithmException e2) {
            Object[] objArr6 = new Object[1];
            b(19 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (Color.rgb(0, 0, 0) + 16777216), objArr6);
            throw new RuntimeException(((String) objArr6[0]).intern(), e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x027d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r8, int r9, boolean r10, int r11, java.lang.String r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.id.a(int, int, boolean, int, java.lang.String, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0448  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(int r8, int r9, char r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 1147
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.id.b(int, int, char, java.lang.Object[]):void");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m5332() {
        try {
            Object[] objArr = new Object[1];
            a(20 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), true, KeyEvent.keyCodeFromString("") + 132, "\u0016\u0016\u0013\u0002\uffe7\u0005\ufff5�\u0002￡\ufff5\ufff4\ufff5￡\u0005\ufff7\ufff3\u0019 \u001b", objArr);
            Cipher cipher = Cipher.getInstance(((String) objArr[0]).intern());
            this.f2513 = cipher;
            SecretKey secretKey = this.f2512;
            byte[] bArr = f2510;
            cipher.init(1, secretKey, new IvParameterSpec(bArr));
            Object[] objArr2 = new Object[1];
            a(20 - ExpandableListView.getPackedPositionGroup(0L), 17 - (ViewConfiguration.getTapTimeout() >> 16), true, 131 - Process.getGidForName(""), "\u0016\u0016\u0013\u0002\uffe7\u0005\ufff5�\u0002￡\ufff5\ufff4\ufff5￡\u0005\ufff7\ufff3\u0019 \u001b", objArr2);
            Cipher cipher2 = Cipher.getInstance(((String) objArr2[0]).intern());
            this.f2514 = cipher2;
            cipher2.init(2, this.f2512, new IvParameterSpec(bArr));
            f2506 = (f2509 + 51) % 128;
        } catch (GeneralSecurityException e) {
            Object[] objArr3 = new Object[1];
            a(22 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (Process.myTid() >> 22) + 2, false, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED - (ViewConfiguration.getTapTimeout() >> 16), "\uffc0ￒ￩\u000e\u0016\u0001\f\t\u0004\uffc0\u0005\u000e\u0016\t\u0012\u000f\u000e\r\u0005\u000e\u0014", objArr3);
            throw new RuntimeException(((String) objArr3[0]).intern(), e);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static void m5333() {
        f2511 = 287397403;
        f2508 = new char[]{3425, 39603, 8919, 51944, 21019, 64070, 33347, 10859, 45977, 23513, 58320, 35640, 4879, 47989, 17217, 59567, 28830, 6361, 40992, 3431, 39602, 8871, 3427, 39576, 8932, 51935, 21046, 64015, 33382, 10766, 45999, 23544, 58308, 35639, 4872, 47977, 17228, 59555, 28815, 6360, 40998, 2962, 40015, 9273, 52350, 21647, 3426, 39571, 8947, 51930, 21055, 64020, 33314, 10816, 45989, 23522, 58258, 35640, 4885, 47987, 17228, 59562, 28874, 6302, 41019, 18448, 53356, 30791, 430, 43399, 12782, 55670, 24854, 2431, 37198, 16039, 50882, 28385, 63192, 40534, 9849, 52827, 22435, 65487, 34744, 46819};
        f2507 = -307484338019263754L;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m5334(String str) {
        synchronized (this) {
            f2506 = (f2509 + 121) % 128;
            if (TextUtils.isEmpty(str)) {
                f2506 = (f2509 + 41) % 128;
                return str;
            }
            try {
                Cipher cipher = this.f2513;
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                a(TextUtils.indexOf((CharSequence) "", '0') + 41, 40 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), true, ((Process.getThreadPriority(0) + 20) >> 6) + 149, "\u001dￒￎ\u0013\u0010\u0015\u0002\u0004\u0014\u0016\u0007\u0003\ufff0\ufff4￦￢ￏ\r\n\u0015\u0016ￏ\b\u000f\n\r\r\n\u0003ￏ\u0002\r\u000e\u0010\u0010\u0014ￏ\u000e\u0010\u0004", objArr);
                sb.append(((String) objArr[0]).intern());
                sb.append(str);
                String obj = sb.toString();
                int resolveOpacity = Drawable.resolveOpacity(0, 0);
                char mirror = AndroidCharacter.getMirror('0');
                Object[] objArr2 = new Object[1];
                b(5 - resolveOpacity, 'Y' - mirror, (char) (Color.argb(0, 0, 0, 0) + 1773), objArr2);
                return ic.m5324(cipher.doFinal(obj.getBytes(((String) objArr2[0]).intern())));
            } catch (UnsupportedEncodingException e) {
                m5332();
                int defaultSize = View.getDefaultSize(0, 0);
                int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay();
                Object[] objArr3 = new Object[1];
                b(defaultSize + 19, 22 - (keyRepeatDelay >> 16), (char) Drawable.resolveOpacity(0, 0), objArr3);
                throw new RuntimeException(((String) objArr3[0]).intern(), e);
            } catch (GeneralSecurityException e2) {
                m5332();
                float length = PointF.length(0.0f, 0.0f);
                int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout();
                Object[] objArr4 = new Object[1];
                b(19 - (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)), (keyRepeatTimeout >> 16) + 22, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr4);
                throw new RuntimeException(((String) objArr4[0]).intern(), e2);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m5335(String str) throws c {
        synchronized (this) {
            int i = f2509 + 53;
            f2506 = i % 128;
            if (i % 2 == 0) {
                TextUtils.isEmpty(str);
                throw null;
            }
            try {
                try {
                    if (TextUtils.isEmpty(str)) {
                        f2509 = (f2506 + 1) % 128;
                        return null;
                    }
                    try {
                        byte[] doFinal = this.f2514.doFinal(ic.m5328(str));
                        int indexOf = TextUtils.indexOf("", "", 0, 0);
                        int threadPriority = Process.getThreadPriority(0);
                        Object[] objArr = new Object[1];
                        b(indexOf + 5, 41 - ((threadPriority + 20) >> 6), (char) (TextUtils.indexOf("", "", 0) + 1773), objArr);
                        String str2 = new String(doFinal, ((String) objArr[0]).intern());
                        Object[] objArr2 = new Object[1];
                        a(View.MeasureSpec.makeMeasureSpec(0, 0) + 40, 40 - View.MeasureSpec.makeMeasureSpec(0, 0), true, 148 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u001dￒￎ\u0013\u0010\u0015\u0002\u0004\u0014\u0016\u0007\u0003\ufff0\ufff4￦￢ￏ\r\n\u0015\u0016ￏ\b\u000f\n\r\r\n\u0003ￏ\u0002\r\u000e\u0010\u0010\u0014ￏ\u000e\u0010\u0004", objArr2);
                        if (str2.indexOf(((String) objArr2[0]).intern()) == 0) {
                            Object[] objArr3 = new Object[1];
                            a(39 - ExpandableListView.getPackedPositionChild(0L), 40 - Gravity.getAbsoluteGravity(0, 0), true, KeyEvent.normalizeMetaState(0) + 149, "\u001dￒￎ\u0013\u0010\u0015\u0002\u0004\u0014\u0016\u0007\u0003\ufff0\ufff4￦￢ￏ\r\n\u0015\u0016ￏ\b\u000f\n\r\r\n\u0003ￏ\u0002\r\u000e\u0010\u0010\u0014ￏ\u000e\u0010\u0004", objArr3);
                            return str2.substring(((String) objArr3[0]).intern().length(), str2.length());
                        }
                        StringBuilder sb = new StringBuilder();
                        char mirror = AndroidCharacter.getMirror('0');
                        float maxVolume = AudioTrack.getMaxVolume();
                        Object[] objArr4 = new Object[1];
                        b(mirror - '\t', 47 - (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)), (char) KeyEvent.keyCodeFromString(""), objArr4);
                        sb.append(((String) objArr4[0]).intern());
                        sb.append(str);
                        throw new c(this, sb.toString());
                    } catch (UnsupportedEncodingException e) {
                        int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration();
                        int offsetBefore = TextUtils.getOffsetBefore("", 0);
                        Object[] objArr5 = new Object[1];
                        b((scrollBarFadeDuration >> 16) + 19, 22 - offsetBefore, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), objArr5);
                        throw new RuntimeException(((String) objArr5[0]).intern(), e);
                    }
                } catch (ie e2) {
                    m5332();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e2.getMessage());
                    float length = PointF.length(0.0f, 0.0f);
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                    Object[] objArr6 = new Object[1];
                    b(1 - (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)), 85 - packedPositionGroup, (char) (48115 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr6);
                    sb2.append(((String) objArr6[0]).intern());
                    sb2.append(str);
                    throw new c(this, sb2.toString());
                }
            } catch (BadPaddingException e3) {
                m5332();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(e3.getMessage());
                int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout();
                int capsMode = TextUtils.getCapsMode("", 0, 0);
                Object[] objArr7 = new Object[1];
                b((jumpTapTimeout >> 16) + 1, capsMode + 85, (char) (48115 - KeyEvent.getDeadChar(0, 0)), objArr7);
                sb3.append(((String) objArr7[0]).intern());
                sb3.append(str);
                throw new c(this, sb3.toString());
            } catch (IllegalBlockSizeException e4) {
                m5332();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(e4.getMessage());
                int myTid = Process.myTid();
                int windowTouchSlop = ViewConfiguration.getWindowTouchSlop();
                Object[] objArr8 = new Object[1];
                b(1 - (myTid >> 22), 85 - (windowTouchSlop >> 8), (char) (48116 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr8);
                sb4.append(((String) objArr8[0]).intern());
                sb4.append(str);
                throw new c(this, sb4.toString());
            }
        }
    }
}
