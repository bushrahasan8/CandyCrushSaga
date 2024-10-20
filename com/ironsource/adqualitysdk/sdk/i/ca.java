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
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.ironsource.adqualitysdk.sdk.i.bm;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: ca.class */
public final class ca extends bm {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1131 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f1132 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1133 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1134;

    static {
        m4061();
        Color.red(0);
        AndroidCharacter.getMirror('0');
        View.MeasureSpec.getSize(0);
        AndroidCharacter.getMirror('0');
        Color.alpha(0);
        TextUtils.indexOf("", "", 0, 0);
        ExpandableListView.getPackedPositionType(0L);
        ViewConfiguration.getScrollBarFadeDuration();
        ViewConfiguration.getMaximumFlingVelocity();
        TextUtils.getOffsetBefore("", 0);
        Color.argb(0, 0, 0, 0);
        Color.red(0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewConfiguration.getFadingEdgeLength();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        TextUtils.getOffsetAfter("", 0);
        TextUtils.getOffsetBefore("", 0);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        TextUtils.lastIndexOf("", '0', 0, 0);
        KeyEvent.getModifierMetaStateMask();
        ViewConfiguration.getTouchSlop();
        TextUtils.lastIndexOf("", '0');
        TextUtils.indexOf((CharSequence) "", '0', 0);
        AndroidCharacter.getMirror('0');
        Color.green(0);
        ExpandableListView.getPackedPositionForGroup(0);
        SystemClock.currentThreadTimeMillis();
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getZoomControlsTimeout();
        TextUtils.indexOf("", "", 0, 0);
        SystemClock.elapsedRealtime();
        Color.blue(0);
        AudioTrack.getMaxVolume();
        ViewConfiguration.getZoomControlsTimeout();
        Color.argb(0, 0, 0, 0);
        AudioTrack.getMaxVolume();
        Color.rgb(0, 0, 0);
        ViewConfiguration.getDoubleTapTimeout();
        ViewConfiguration.getTapTimeout();
        TextUtils.lastIndexOf("", '0');
        ViewConfiguration.getEdgeSlop();
        Process.getThreadPriority(0);
        TextUtils.indexOf((CharSequence) "", '0');
        KeyEvent.getDeadChar(0, 0);
        SystemClock.elapsedRealtime();
        ViewConfiguration.getKeyRepeatDelay();
        Color.green(0);
        TextUtils.indexOf((CharSequence) "", '0');
        AudioTrack.getMaxVolume();
        ViewConfiguration.getFadingEdgeLength();
        AudioTrack.getMinVolume();
        TextUtils.getOffsetAfter("", 0);
        Color.alpha(0);
        TextUtils.getOffsetAfter("", 0);
        View.resolveSize(0, 0);
        View.resolveSizeAndState(0, 0, 0);
        ViewConfiguration.getKeyRepeatDelay();
        TextUtils.getOffsetBefore("", 0);
        AudioTrack.getMaxVolume();
        SystemClock.elapsedRealtime();
        SystemClock.uptimeMillis();
        ViewConfiguration.getMinimumFlingVelocity();
        View.resolveSizeAndState(0, 0, 0);
        KeyEvent.getMaxKeyCode();
        AudioTrack.getMinVolume();
        ViewConfiguration.getLongPressTimeout();
        ViewConfiguration.getScrollDefaultDelay();
        Color.rgb(0, 0, 0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        View.combineMeasuredStates(0, 0);
        KeyEvent.getDeadChar(0, 0);
        Color.rgb(0, 0, 0);
        AudioTrack.getMinVolume();
        Color.rgb(0, 0, 0);
        TypedValue.complexToFloat(0);
        ViewConfiguration.getZoomControlsTimeout();
        KeyEvent.getDeadChar(0, 0);
        TypedValue.complexToFloat(0);
        ViewConfiguration.getLongPressTimeout();
        ViewConfiguration.getScrollFriction();
        ViewConfiguration.getZoomControlsTimeout();
        ViewConfiguration.getKeyRepeatTimeout();
        TextUtils.indexOf("", "", 0, 0);
        KeyEvent.normalizeMetaState(0);
        ViewConfiguration.getGlobalActionKeyTimeout();
        ViewConfiguration.getScrollBarFadeDuration();
        ViewConfiguration.getEdgeSlop();
        AndroidCharacter.getMirror('0');
        TextUtils.getTrimmedLength("");
        ViewConfiguration.getTapTimeout();
        ViewConfiguration.getEdgeSlop();
        Color.red(0);
        TypedValue.complexToFloat(0);
        KeyEvent.keyCodeFromString("");
        SystemClock.currentThreadTimeMillis();
        Process.getGidForName("");
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        ViewConfiguration.getMinimumFlingVelocity();
        PointF.length(0.0f, 0.0f);
        ViewConfiguration.getTapTimeout();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        ViewConfiguration.getMaximumDrawingCacheSize();
        ViewConfiguration.getMaximumFlingVelocity();
        ViewConfiguration.getKeyRepeatDelay();
        ViewConfiguration.getMaximumDrawingCacheSize();
        TextUtils.getOffsetBefore("", 0);
        ViewConfiguration.getJumpTapTimeout();
        ViewConfiguration.getScrollBarSize();
        Color.blue(0);
        ViewConfiguration.getTapTimeout();
        TextUtils.getCapsMode("", 0, 0);
        TextUtils.getOffsetBefore("", 0);
        ViewConfiguration.getDoubleTapTimeout();
        PointF.length(0.0f, 0.0f);
        ViewConfiguration.getDoubleTapTimeout();
        ExpandableListView.getPackedPositionType(0L);
        TextUtils.indexOf("", "", 0, 0);
        ExpandableListView.getPackedPositionGroup(0L);
        Color.red(0);
        TypedValue.complexToFloat(0);
        Color.green(0);
        TextUtils.indexOf("", "", 0);
        View.MeasureSpec.getSize(0);
        ExpandableListView.getPackedPositionType(0L);
        KeyEvent.getDeadChar(0, 0);
        KeyEvent.getModifierMetaStateMask();
        Process.myTid();
        TypedValue.complexToFloat(0);
        AudioTrack.getMinVolume();
        View.getDefaultSize(0, 0);
        KeyEvent.getMaxKeyCode();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        TextUtils.indexOf("", "", 0);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        SystemClock.elapsedRealtime();
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        Color.green(0);
        TextUtils.lastIndexOf("", '0');
        ViewConfiguration.getLongPressTimeout();
        ViewConfiguration.getTouchSlop();
        KeyEvent.getModifierMetaStateMask();
        TextUtils.indexOf("", "");
        KeyEvent.keyCodeFromString("");
        ViewConfiguration.getMinimumFlingVelocity();
        TextUtils.getOffsetBefore("", 0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        TextUtils.getOffsetBefore("", 0);
        ViewConfiguration.getScrollFriction();
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        Color.green(0);
        int i = f1131 + 43;
        f1133 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public ca(String str) {
        super(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0210, code lost:
    
        r0[r0] = (char) r0[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x021a, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.b.f452;
        r11 = r0.get(518145355);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x022e, code lost:
    
        if (r11 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0234, code lost:
    
        r11 = ((java.lang.Class) com.ironsource.adqualitysdk.sdk.i.b.m3371(android.graphics.Color.red(0), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.text.TextUtils.getTrimmedLength("") + 41)).getMethod("i", java.lang.Object.class, java.lang.Object.class);
        r0.put(518145355, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0274, code lost:
    
        ((java.lang.reflect.Method) r11).invoke(null, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x028b, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0321  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r8, int r9, char r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ca.a(int, int, char, java.lang.Object[]):void");
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int m4051() {
        f1133 = (f1131 + 45) % 128;
        int i = R.id.inneractive_webview_mraid;
        f1131 = (f1133 + 93) % 128;
        return i;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static String m4052(InneractiveAdSpot inneractiveAdSpot) {
        int i = f1131 + 15;
        f1133 = i % 128;
        String clickThroughUrl = inneractiveAdSpot.getAdContent().getClickThroughUrl();
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        f1133 = (f1131 + 3) % 128;
        return clickThroughUrl;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ InneractiveUnitController m4053(InneractiveAdSpot inneractiveAdSpot) {
        f1133 = (f1131 + 19) % 128;
        InneractiveUnitController inneractiveUnitController = (InneractiveUnitController) m4073(new Object[]{inneractiveAdSpot}, 1648567758, -1648567757, (int) System.currentTimeMillis());
        f1133 = (f1131 + 67) % 128;
        return inneractiveUnitController;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static boolean m4054(InneractiveAdSpot inneractiveAdSpot) {
        return ((Boolean) m4073(new Object[]{inneractiveAdSpot}, -2019509734, 2019509734, (int) System.currentTimeMillis())).booleanValue();
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static boolean m4055(InneractiveAdSpot inneractiveAdSpot) {
        f1131 = (f1133 + 17) % 128;
        boolean isVideoAd = inneractiveAdSpot.getAdContent().isVideoAd();
        int i = f1133 + 29;
        f1131 = i % 128;
        if (i % 2 == 0) {
            return isVideoAd;
        }
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static InneractiveAdRequest m4056(InneractiveAdSpot inneractiveAdSpot) {
        f1131 = (f1133 + 25) % 128;
        InneractiveAdRequest currentProcessedRequest = inneractiveAdSpot.getCurrentProcessedRequest();
        f1133 = (f1131 + 39) % 128;
        return currentProcessedRequest;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e2, code lost:
    
        if (r7.equals(((java.lang.String) r0[0]).intern()) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0124, code lost:
    
        if (r7.equals(((java.lang.String) r0[0]).intern()) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02aa, code lost:
    
        if (r7.equals(((java.lang.String) r0[0]).intern()) != false) goto L35;
     */
    /* renamed from: ﻏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Enum m4057(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ca.m4057(java.lang.String):java.lang.Enum");
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static Object m4058(InneractiveAdSpot inneractiveAdSpot) {
        f1133 = (f1131 + 51) % 128;
        com.fyber.inneractive.sdk.c.f adContent = inneractiveAdSpot.getAdContent();
        f1133 = (f1131 + 39) % 128;
        return adContent;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Object m4059(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        f1131 = (f1133 + 97) % 128;
        Object m4073 = m4073(new Object[]{inneractiveFullscreenAdActivity}, -1893055351, 1893055355, (int) System.currentTimeMillis());
        f1133 = (f1131 + 55) % 128;
        return m4073;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static /* synthetic */ Object m4060(Object[] objArr) {
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) objArr[0];
        int i = f1133 + 125;
        f1131 = i % 128;
        if (i % 2 != 0) {
            m4056(inneractiveAdSpot);
            throw null;
        }
        InneractiveAdRequest m4056 = m4056(inneractiveAdSpot);
        f1131 = (f1133 + 85) % 128;
        return m4056;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static void m4061() {
        char[] cArr = new char[1352];
        ByteBuffer.wrap("\rc\u0084h\u001f\u001c\u0096Ë)è \u0097:AÍjD#ßÐV÷é\u0087cTúb\u008d'\u0004Ì\u009f\u0084\u0016§¨^#,º(MÙÄ\u0095_\u00adÑoh\u0014ã\u0013zí\r\u008e\u0084¿\u001et\u0091\u0017(Þ£ÿ\rI\u0084i\u001f\u001f\u0096\u0080)ü \u008f:@Í{D8ß\u0088Vûé cTús\u008d0\u0004ß\u009f\u0089\u0016²¨[#\u0018º?M\u0098Ä\u0091_ºÑahHã3zí\r\u008e\u0084¿\u001et\u0091\u0017(Þ£ï:\u0097Ì]G4Þ?QÌèðc¯õT\u008cs\u0007-\u009eÎ\u0011ÿ¨´\"[µ#L(ÇÆ^\u008bÑ¨kXâ\u0003u2\fÈ\u0087\u0094\u001e½\u0090y+\t¢35ðÌ¿FIÙrP\u001bëØbóõ\u0082\u008f[[DÒOI;Àì\u007fÏö°lf\u009bM\u0012\u0004\u0089÷��Ð¿¯5h¬]Û\tRêÉ®@\u0093þpu,ì\u0013\u001bÐ\u0092¡\t¸\u0087N>5µ\u001c,ß[´Ò\u0085H\\\rI\u0084i\u001f\u001f\u0096\u0080)ü \u008f:@Í{D8ß\u0088Vûé cTús\u008d0\u0004ß\u009f\u0089\u0016²¨[#\u0018º?M\u0098Ä\u0091_ºÑahHã3zí\r\u008e\u0084¿\u001et\u0091\u0017(Þ£ï:\u0097Ì]G4Þ?QÌèðc¯õT\u008cs\u0007-\u009eÎ\u0011ÿ¨´\"[µ,L3ÇÞ^\u0082Ñ©kUâ\u0010u;\fï\u0087\u0088\u001e\u0093\u0090j+;¢55öÌ\u0097F\\ÙoP\u0006ë×<Kµ@.4§ã\u0018À\u0091¿\u000biüBu\u000bîøgßØ´R{Ë]¼\u00025Û®§'\u008a\u0099s\u0012'\u008b$|÷õ®n\u0093àMY\u001eÒ\u0016KÇ<«µ\u009b/X \u0017\u0019á\u0092Ú\u000b³ýpv[ï*`óÙõR\u008dÄ|½_\rI\u0084i\u001f\u001f\u0096\u0080)ü \u008f:@Í{D8ß\u0088Vûé cTús\u008d0\u0004ß\u009f\u0089\u0016²¨[#\u0018º?M\u0098Ä\u0091_ºÑahHã3zí\r\u008e\u0084¿\u001et\u0091\u0017(Þ£ï:\u0097Ì]G4Þ?QÌèðc¯õT\u008cs\u0007-\u009eÎ\u0011ÿ¨´\"[µ8L/ÇÑ^\u0086Ñ\u0097kSâ\u0006u7\fë\u0087°\u001e»\u0090j+\u001f¢95ÒÌ\u0092FKÙ\u007fP\u0017ëÜbÛõ\u0095\u008fV\u0006w\u0099<\u0010Ï«æ\"·´yOyÆ0YÛ\rc\u0084h\u001f\u001c\u0096Ë)è \u0097:AÍjD#ßÐV÷é\u008fc^úE\u008d2\u0004Ñ\u009f\u009et:ý1fEï\u0092P±ÙÎC\u0018´3=z¦\u0089/®\u0090Ö\u001a\u0007\u0083\u001dô~}\u0096æÆoúÑ\u0018ZC\rc\u0084h\u001f\u001c\u0096Ë)è \u0097:AÍjD#ßÐV÷é\u008fc^úD\u008d'\u0004Ð\u009f\u008e\u0016£¨@#\u000bº(\rc\u0084h\u001f\u001c\u0096Ë)è \u0097:AÍjD#ßÐV÷é\u0083c_úr\u008d+\u0004ß\u009f\u009e\u0016¯¨]#��º\u0014M×Ä\u008f_»\rc\u0084G\u001f1\u0096Á)ô \u0090:KÍyD\u0007ßÇVüé¯c]ús\u008d0ç\u0015n\u001eõj|½Ã\u009eJáÐ7'\u001c®U5¦¼\u0081\u0003û\u0089#\u0010\u000eg@î\u00aduòüÄB\u0007ÉwPB§´.æµÇ;\u0010\u0082|\tA\u0090\u008aøóqøê\u008cc[ÜxU\u0007ÏÑ8ú±³*@£g\u001c\u000b\u0096Ä\u000fïx¦ñmj\u0015ã8]ÖÖ\u008cO¥¸J1\u001eª+$è^|×wL\u0003ÅÔz÷ó\u0088i^\u009eu\u0017<\u008cÏ\u0005èº\u00900A©_Þ4WÄÌ\u0082E\u008cûCp\u0018é1\u001eê\u0097\u0092\f¯\u0082a;\u000b°\")ý^\u0089×¬Mo\r\u007f\u0084h\u001f\u001b\u0096Ú)Þ \u009f:QÍnD&ßÇVëé\u009acCúf\u008d'\ro\u0084p\u001f\u0017\u0096À)î \u0085:nÍwD9ßÒV÷é c_úd\u0080Û\rc\u0084h\u001f\u001c\u0096Ë)è \u0097:AÍjD#ßÐV÷é\u0088cOúz\u008d.\u0004Í\u009f\u0089\u0016´¨W#\u000bº4MàÄ\u008b_ºÑoh\tã\u0011zá\r\u0094\u0084¢\u001eg\u0091\u0010(Þ£Å:\u009dÌ@GnÞ\u0004QÍèòc¦õC\u008c`ägmlö\u0018\u007fÏÀìI\u0093ÓE$n\u00ad'6Ô¿ó��\u008c\u008aK\u0013~d*íÉv\u008dÿ°ASÊ\u000fS0¤ó-\u0082¶\u009f8x\u0081\u0007\n8\u0093þä\u008dm\u009e÷ox\tÁÚJçÓ\u0098%O®lªT#G¸>1ã\u008eÝ\u0007\u009d\u009dejXã\u0016xëñÔN\u0092Ä^]W*\u0019£â8§±\u0080\u000f\u007f\u00844\rc\u0084h\u001f\u0006\u0096Ë)è \u0098:CÍrD\bßÔVýé¹cIús\u008d0\u0004ò\u009f\u0083\u0016µ¨F#\u000bº4MÓÄ\u0090\r~\u0084g\u001f\u0002\u0086\u0084\u000f\u008f\u0094û\u001d,¢\u000f+p±¦F\u008dÏÄT7Ý\u0010boè¨q\u009d\u0006É\u008f*\u0014n\u009dS#°¨ì1ÓÆ\u0010OaÔ|Z\u009bãähÛñ\u001d\u0086n\u000f}\u0095\u008c\u001aê£9(\u0004±{G¬Ì\u008fUÐÚ!c\u0018è]~µ\u0007\u0090\u008cÛÞ\u000fW\u0004ÌpE§ú\u0084sûé-\u001e\u0006\u0097O\f¼\u0085\u009b:ä°#)\u0016^B×¡LåÅØ{;ðgiX\u009e\u008f\u0017à\u008cÛ\u0002\u0012»I0Q©\u008cÞâWÈÍ\u0001B~ûªp\u008féì\u009eô\u0017ÿ\u008c\u008b\u0005\\º\u007f3��©Ö^ý×´LGÅ`z\u0018ðÉi×\u001e¼\u0097L\f\n\u0085\u0007;Ì°\u009d)¨ÞNW6Ì&Bóû\u0085p éw\u009e\u0019\u0017\u0002\u008dú\u0002\u0087»I0c©\n_ÕÔáM\u0084ÂG\ro\u0084p\u001f\u0017\u0096À)î \u0085:nÍwD9ßÒV÷é c_úd\u008d\u0003\u0004Ú\u009f\u008b\u0016¶¨F#\u000bº(ScÚpA\tÈÔwêþªdR\u0093o\u001a!\u0081Ü\bã·¥=i¤`Ó.ZÕÁ\u0090H·öH}\u0003ä\u0004\u0013Í\u009a\u009c\u0001±\u008fa6\u001c½?\rc\u0084G\u001f?\u0096Ü)û \u009f:FÍUD#ßÒmèäÌ\u007f\u0094öWIpÀ\u0014ZÍ\u00adÂ$¤¿O6O\u0089,\u0003Ô\u009aêí\u008adZÿ\u000fv9ÈËC\u008aÚ½-Q¤\f?'\rc\u0084G\u001f$\u0096Ç)þ \u0093:MÍUD#ßÒ\rc\u0084k\u001f\u0002\u0096Ü)ÿ \u0085:QÍwD%ßÈVÖé¯cNúw\rc\u0084G\u001f��\u0096Ç)ù \u009e:oÍ{D.ßÏVóé\u0098cSúr\u008d'\u0004Ñ\u009f¼\u0016¯¨W#\u0019\nñ\u0083þ\u0018\u0098\u0091R.U§\u0006=ßÊâC¼ØiQbî2dÔýÃ\u008a²\u0003T\u0098\u0007\u0011:¯Å$\u0092½±/Ý¦Ö=¢´u\u000bV\u0082)\u0018ÿïÔf\u009dýntIË6AñØÄ¯\u0090&s½74\n\u008aé\u0001µ\u0098\u008aoIæ8}%óÂJ½Á\u0082XD/7¦$<Õ³³\n`\u0081]\u0018\"îõeÖü\u009fsuÊTA\u001c×Ñ®Á%\u0080¼v3M\u008a\u000f��ó\u0097½n\u0097åb|\u0014ó\u0005IüÀ½\rc\u0084h\u001f\u001c\u0096Ë)è \u0097:AÍjD#ßÐV÷é\u008fc^ú@\u008d+\u0004Û\u009f\u009d\u0016\u0083¨D#\u000bº4MÂÄ\u0091_\u0092Ñch\u0015ã&zë\r\u0094\u0084³\u001ep\u0091)(Ã£ò:\u009aÌgGwÞ\u0006QÐèûc¹õU\u008c{\u0007!\u009eÔ\u0011Ò¨£\"Jµ\u000b\rM\u0084c\u001f\u0006\u0096í)ï \u0084:PÍ{D$ßÒVÂé¼cUúu\u008d'\u0004Í\u009f\u0099\u0016£¨V#<º?MÇÄ\u0097_»Ñyh\u0012\rM\u0084c\u001f\u0006\u0096ý)ê \u0099:VÍWD.\rM\u0084c\u001f\u0006\u0096ï)þ µ:MÍpD>ßÃVüéºÊÍCûØºQUîxg\u0014ýß\nó\u0083¶\u0018M\u0091y..¤õ=ü\rC\u0084u\u001f$\u0096Ç)þ \u0093:MÍ_D.Òr[\\À9IÒöÉ\u007f å~\u0012J\u009b!��ñ\u0089ß6\u009e¼p%NR\u0015ÛÔ@§É\u0095\rM\u0084c\u001f\u0006\u0096â)û \u008f:MÍkD>\rM\u0084c\u001f\u0006\u0096ý)ÿ \u009a:GÍ}D>ßÃVöé\u009bcTú\u007f\u008d6\u0004ý\u009f\u0085\u0016¨¨F#\u001cº5MÚÄ\u008e_»Ñx\rM\u0084c\u001f\u0006\u0096ý)ÿ \u009a:GÍ}D>ßÃVöé\u008dcUúx\u008d6\u0004Û\u009f\u0084\u0016²¨q#\u0001º4MÂÄ\u0090_±Ñfh\nã7zü\rM\u0084c\u001f\u0006\u0096ë)ì \u0093:LÍjD9ßêVûé½cNús\u008d,\u0004Û\u009f\u0098B\u0004Ë>P[Ù¶f±ïÎu\u0011\u00827\u000bd\u0090·\u0019¦¦à,\u0013µ.ÂqK\u0086ÐÅH´Á\u009aZÿÓ\u0016l\u0007å\\\u007f«\u0088\u0088\u0001Ç\rM\u0084c\u001f\u0006\u0096û)ô \u009f:VÍZD#ßÕVâé¢c[úo\u008d\u0016\u0004Ç\u009f\u009a\u0016£¨w#��º/MÛâ%k\u000bðny\u008bÆ\u0080OÿÕ#\"\u0012«`0¯¹\u0094\u0006È\u008c7\u0015\fb|ë¿pçùÙG\u0013Ìbñ\u0090x¾ãÛj:Õ*\\[Æ\u008d1¦¸ä#\bª&\u0015|\u009f\u0089\u0006\u008fqþø\u0017cVê_T\u0080ßÞFæ±\u00028Q7Á¾ê%\u0084¬I\u0013j\u009a\u0007��Ô÷õ~¼åMlqÓ ÿÛvúí\u0081dWÛtR\bÈÞ?ó¶²\rg\u0084T\u001f7\u0096í)Î\u009c½\u0015\u0092\u008eé\u00075¸\n1q!O¨t3\u0012ºØ\u0005ÿ\u008c\u0085\u0016PámøLqbê\u0012cÚÜýU\u0086\r|\u0084C\u001f \u0096ú)Ó µ:cÍR\rn\u0084C\u001f4\u0096ï)Ï º:v".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1352);
        f1134 = cArr;
        f1132 = 6664182104794039302L;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ boolean m4062(InneractiveAdSpot inneractiveAdSpot) {
        int i = f1131 + 71;
        f1133 = i % 128;
        if (i % 2 == 0) {
            m4054(inneractiveAdSpot);
            throw null;
        }
        boolean m4054 = m4054(inneractiveAdSpot);
        int i2 = f1133 + 123;
        f1131 = i2 % 128;
        if (i2 % 2 == 0) {
            return m4054;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ int m4063() {
        int i = f1133 + 7;
        f1131 = i % 128;
        if (i % 2 == 0) {
            return m4051();
        }
        m4051();
        throw new ArithmeticException("divide by zero");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ InneractiveAdSpot m4064(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        int i = f1131 + 17;
        f1133 = i % 128;
        if (i % 2 == 0) {
            m4075(inneractiveAdViewUnitController);
            throw null;
        }
        InneractiveAdSpot m4075 = m4075(inneractiveAdViewUnitController);
        int i2 = f1131 + 57;
        f1133 = i2 % 128;
        if (i2 % 2 != 0) {
            return m4075;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Enum m4065(String str) {
        f1131 = (f1133 + 23) % 128;
        Enum m4057 = m4057(str);
        int i = f1131 + 95;
        f1133 = i % 128;
        if (i % 2 != 0) {
            return m4057;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Object m4066(InneractiveAdSpot inneractiveAdSpot) {
        int i = f1131 + 113;
        f1133 = i % 128;
        Object m4058 = m4058(inneractiveAdSpot);
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m4058;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Object m4067(InneractiveUnitController inneractiveUnitController) {
        f1131 = (f1133 + 43) % 128;
        InneractiveContentController selectedContentController = inneractiveUnitController.getSelectedContentController();
        int i = f1133 + 119;
        f1131 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return selectedContentController;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static /* synthetic */ Object m4068(Object[] objArr) {
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) objArr[0];
        f1131 = (f1133 + 85) % 128;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        int i = f1133 + 107;
        f1131 = i % 128;
        if (i % 2 == 0) {
            return selectedUnitController;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m4069(ImpressionData impressionData) {
        int i = f1133 + 95;
        f1131 = i % 128;
        String m4077 = m4077(impressionData);
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        f1131 = (f1133 + 57) % 128;
        return m4077;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m4070(InneractiveContentController inneractiveContentController, InneractiveContentController.EventsListener eventsListener) {
        f1133 = (f1131 + 1) % 128;
        m4083(inneractiveContentController, eventsListener);
        int i = f1133 + 67;
        f1131 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ InneractiveContentController.EventsListener m4071(InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController) {
        int i = f1131 + 5;
        f1133 = i % 128;
        if (i % 2 != 0) {
            return m4079(inneractiveFullscreenVideoContentController);
        }
        m4079(inneractiveFullscreenVideoContentController);
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ Object m4072(Object[] objArr) {
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) objArr[0];
        f1133 = (f1131 + 73) % 128;
        boolean isFullscreenAd = inneractiveAdSpot.getAdContent().isFullscreenAd();
        int i = f1133 + 13;
        f1131 = i % 128;
        if (i % 2 == 0) {
            return Boolean.valueOf(isFullscreenAd);
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Object m4073(Object[] objArr, int i, int i2, int i3) {
        Object m4068;
        int i4 = i3 ^ (-1);
        int i5 = i ^ (-1);
        int i6 = (i * 522) + (i2 * (-520)) + ((((i4 | i2) ^ (-1)) | i) * (-1042)) + ((i2 | i3) * 521) + (((((i | i4) | i2) ^ (-1)) | ((i3 | i5) ^ (-1)) | (((i2 ^ (-1)) | i5) ^ (-1))) * 521);
        if (i6 == 1) {
            m4068 = m4068(objArr);
        } else if (i6 == 2) {
            m4068 = m4060(objArr);
        } else if (i6 == 3) {
            m4068 = m4076(objArr);
        } else if (i6 != 4) {
            m4068 = i6 != 5 ? m4072(objArr) : m4081(objArr);
        } else {
            InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity = (InneractiveFullscreenAdActivity) objArr[0];
            f1131 = (f1133 + 99) % 128;
            m4068 = inneractiveFullscreenAdActivity.getLayout();
            f1131 = (f1133 + 7) % 128;
        }
        return m4068;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m4074(InneractiveAdRequest inneractiveAdRequest) {
        int i = f1131 + 75;
        f1133 = i % 128;
        if (i % 2 != 0) {
            return inneractiveAdRequest.getSpotId();
        }
        inneractiveAdRequest.getSpotId();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static InneractiveAdSpot m4075(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        int i = f1133 + 117;
        f1131 = i % 128;
        InneractiveAdSpot adSpot = inneractiveAdViewUnitController.getAdSpot();
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return adSpot;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static /* synthetic */ Object m4076(Object[] objArr) {
        InneractiveAdRequest inneractiveAdRequest = (InneractiveAdRequest) objArr[0];
        int i = f1131 + 11;
        f1133 = i % 128;
        if (i % 2 == 0) {
            m4074(inneractiveAdRequest);
            throw null;
        }
        String m4074 = m4074(inneractiveAdRequest);
        f1133 = (f1131 + 75) % 128;
        return m4074;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m4077(ImpressionData impressionData) {
        f1131 = (f1133 + 115) % 128;
        String advertiserDomain = impressionData.getAdvertiserDomain();
        f1133 = (f1131 + 43) % 128;
        return advertiserDomain;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m4078(InneractiveAdSpot inneractiveAdSpot) {
        f1133 = (f1131 + 113) % 128;
        boolean m4055 = m4055(inneractiveAdSpot);
        int i = f1131 + 93;
        f1133 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m4055;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static InneractiveContentController.EventsListener m4079(InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController) {
        f1133 = (f1131 + 61) % 128;
        InneractiveContentController.EventsListener eventsListener = inneractiveFullscreenVideoContentController.getEventsListener();
        f1133 = (f1131 + 91) % 128;
        return eventsListener;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Object m4080(InneractiveUnitController inneractiveUnitController) {
        int i = f1133 + 25;
        f1131 = i % 128;
        if (i % 2 == 0) {
            return m4067(inneractiveUnitController);
        }
        m4067(inneractiveUnitController);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x08e9, code lost:
    
        if (r0.equals(((java.lang.String) r0[0]).intern()) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0a68, code lost:
    
        if (r0.equals(((java.lang.String) r0[0]).intern()) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0279, code lost:
    
        if (r0.equals(((java.lang.String) r0[0]).intern()) != false) goto L122;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object m4081(java.lang.Object[] r7) {
        /*
            Method dump skipped, instructions count: 3277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ca.m4081(java.lang.Object[]):java.lang.Object");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m4082(InneractiveAdSpot inneractiveAdSpot) {
        f1131 = (f1133 + 109) % 128;
        String m4052 = m4052(inneractiveAdSpot);
        int i = f1131 + 49;
        f1133 = i % 128;
        if (i % 2 != 0) {
            return m4052;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m4083(InneractiveContentController inneractiveContentController, InneractiveContentController.EventsListener eventsListener) {
        f1131 = (f1133 + 91) % 128;
        inneractiveContentController.setEventsListener(eventsListener);
        f1131 = (f1133 + 83) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Class mo3627(String str) {
        return (Class) m4073(new Object[]{this, str}, 2046291699, -2046291694, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Map mo3628() {
        HashMap hashMap = new HashMap();
        byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Object[] objArr = new Object[1];
        a(modifierMetaStateMask + 27, IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK - (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)), (char) Gravity.getAbsoluteGravity(0, 0), objArr);
        hashMap.put(((String) objArr[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ca.5

            /* renamed from: ﻐ, reason: contains not printable characters */
            private ca f1145;

            {
                this.f1145 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return (InneractiveAdRequest) ca.m4073(new Object[]{(InneractiveAdSpot) list.get(0)}, -245749435, 245749437, (int) System.currentTimeMillis());
            }
        });
        long zoomControlsTimeout = ViewConfiguration.getZoomControlsTimeout();
        int capsMode = TextUtils.getCapsMode("", 0, 0);
        Object[] objArr2 = new Object[1];
        a(10 - (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)), capsMode + 1059, (char) View.getDefaultSize(0, 0), objArr2);
        hashMap.put(((String) objArr2[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ca.6

            /* renamed from: ﾇ, reason: contains not printable characters */
            private ca f1146;

            {
                this.f1146 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return (String) ca.m4073(new Object[]{(InneractiveAdRequest) list.get(0)}, -1499058866, 1499058869, (int) System.currentTimeMillis());
            }
        });
        int lastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
        float maxVolume = AudioTrack.getMaxVolume();
        Object[] objArr3 = new Object[1];
        a(11 - lastIndexOf, 1069 - (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), objArr3);
        hashMap.put(((String) objArr3[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ca.10

            /* renamed from: ﻛ, reason: contains not printable characters */
            private ca f1136;

            {
                this.f1136 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return ca.m4066((InneractiveAdSpot) list.get(0));
            }
        });
        int blue = Color.blue(0);
        int maxKeyCode = KeyEvent.getMaxKeyCode();
        Object[] objArr4 = new Object[1];
        a(14 - blue, (maxKeyCode >> 16) + 1080, (char) (Color.blue(0) + 51086), objArr4);
        hashMap.put(((String) objArr4[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ca.7

            /* renamed from: ｋ, reason: contains not printable characters */
            private ca f1147;

            {
                this.f1147 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return Boolean.valueOf(ca.m4062((InneractiveAdSpot) list.get(0)));
            }
        });
        long elapsedCpuTime = Process.getElapsedCpuTime();
        int lastIndexOf2 = TextUtils.lastIndexOf("", '0', 0);
        Object[] objArr5 = new Object[1];
        a(10 - (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)), lastIndexOf2 + 1095, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), objArr5);
        hashMap.put(((String) objArr5[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ca.13

            /* renamed from: ﾇ, reason: contains not printable characters */
            private ca f1139;

            {
                this.f1139 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return Boolean.valueOf(ca.m4078((InneractiveAdSpot) list.get(0)));
            }
        });
        int tapTimeout = ViewConfiguration.getTapTimeout();
        char mirror = AndroidCharacter.getMirror('0');
        Object[] objArr6 = new Object[1];
        a(18 - (tapTimeout >> 16), 1151 - mirror, (char) (Color.rgb(0, 0, 0) + 16834367), objArr6);
        hashMap.put(((String) objArr6[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ca.15

            /* renamed from: ﻛ, reason: contains not printable characters */
            private ca f1141;

            {
                this.f1141 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return ca.m4082((InneractiveAdSpot) list.get(0));
            }
        });
        int resolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
        long packedPositionForGroup = ExpandableListView.getPackedPositionForGroup(0);
        Object[] objArr7 = new Object[1];
        a(resolveSizeAndState + 9, (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)) + 1121, (char) (Process.myPid() >> 22), objArr7);
        hashMap.put(((String) objArr7[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ca.14

            /* renamed from: ﾒ, reason: contains not printable characters */
            private ca f1140;

            {
                this.f1140 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return ca.m4059((InneractiveFullscreenAdActivity) list.get(0));
            }
        });
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        Object[] objArr8 = new Object[1];
        a(26 - (elapsedRealtime2 > 0L ? 1 : (elapsedRealtime2 == 0L ? 0 : -1)), (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)) + 1129, (char) Gravity.getAbsoluteGravity(0, 0), objArr8);
        hashMap.put(((String) objArr8[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ca.12

            /* renamed from: ﾇ, reason: contains not printable characters */
            private ca f1138;

            {
                this.f1138 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return ca.m4053((InneractiveAdSpot) list.get(0));
            }
        });
        int resolveOpacity = Drawable.resolveOpacity(0, 0);
        long elapsedCpuTime2 = Process.getElapsedCpuTime();
        Object[] objArr9 = new Object[1];
        a(28 - resolveOpacity, (elapsedCpuTime2 > 0L ? 1 : (elapsedCpuTime2 == 0L ? 0 : -1)) + 1154, (char) Color.alpha(0), objArr9);
        hashMap.put(((String) objArr9[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ca.11

            /* renamed from: ﾇ, reason: contains not printable characters */
            private ca f1137;

            {
                this.f1137 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return ca.m4080((InneractiveUnitController) list.get(0));
            }
        });
        long zoomControlsTimeout2 = ViewConfiguration.getZoomControlsTimeout();
        int windowTouchSlop = ViewConfiguration.getWindowTouchSlop();
        Object[] objArr10 = new Object[1];
        a((zoomControlsTimeout2 > 0L ? 1 : (zoomControlsTimeout2 == 0L ? 0 : -1)) + 16, (windowTouchSlop >> 8) + 1183, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr10);
        hashMap.put(((String) objArr10[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ca.3

            /* renamed from: ﾇ, reason: contains not printable characters */
            private ca f1143;

            {
                this.f1143 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return ca.m4071((InneractiveFullscreenVideoContentController) list.get(0));
            }
        });
        int combineMeasuredStates = View.combineMeasuredStates(0, 0);
        int combineMeasuredStates2 = View.combineMeasuredStates(0, 0);
        Object[] objArr11 = new Object[1];
        a(17 - combineMeasuredStates, 1200 - combineMeasuredStates2, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 20317), objArr11);
        hashMap.put(((String) objArr11[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ca.1

            /* renamed from: ﾒ, reason: contains not printable characters */
            private ca f1135;

            {
                this.f1135 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                ca.m4070((InneractiveContentController) list.get(0), (VideoContentListener) list.get(1));
                return null;
            }
        });
        int argb = Color.argb(0, 0, 0, 0);
        int resolveOpacity2 = Drawable.resolveOpacity(0, 0);
        Object[] objArr12 = new Object[1];
        a(argb + 9, 1217 - resolveOpacity2, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 17913), objArr12);
        hashMap.put(((String) objArr12[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ca.2

            /* renamed from: ﻐ, reason: contains not printable characters */
            private ca f1142;

            {
                this.f1142 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return ca.m4064((InneractiveAdViewUnitController) list.get(0));
            }
        });
        char mirror2 = AndroidCharacter.getMirror('0');
        int combineMeasuredStates3 = View.combineMeasuredStates(0, 0);
        Object[] objArr13 = new Object[1];
        a('F' - mirror2, 1226 - combineMeasuredStates3, (char) (TextUtils.lastIndexOf("", '0') + 1), objArr13);
        hashMap.put(((String) objArr13[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ca.4

            /* renamed from: ｋ, reason: contains not printable characters */
            private ca f1144;

            {
                this.f1144 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return ca.m4065((String) list.get(0));
            }
        });
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay();
        Object[] objArr14 = new Object[1];
        a(makeMeasureSpec + 20, 1248 - (keyRepeatDelay >> 16), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 61288), objArr14);
        hashMap.put(((String) objArr14[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ca.8

            /* renamed from: ﾇ, reason: contains not printable characters */
            private ca f1148;

            {
                this.f1148 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return Integer.valueOf(ca.m4063());
            }
        });
        int keyCodeFromString = KeyEvent.keyCodeFromString("");
        int threadPriority = Process.getThreadPriority(0);
        Object[] objArr15 = new Object[1];
        a(keyCodeFromString + 23, 1268 - ((threadPriority + 20) >> 6), (char) (64732 - Process.getGidForName("")), objArr15);
        hashMap.put(((String) objArr15[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ca.9

            /* renamed from: ﻛ, reason: contains not printable characters */
            private ca f1149;

            {
                this.f1149 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return ca.m4069((ImpressionData) list.get(0));
            }
        });
        int i = f1133 + 23;
        f1131 = i % 128;
        if (i % 2 == 0) {
            return hashMap;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾒ */
    public final String mo3629() {
        f1131 = (f1133 + 115) % 128;
        String version = InneractiveAdManager.getVersion();
        int i = f1131 + 53;
        f1133 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return version;
    }
}
