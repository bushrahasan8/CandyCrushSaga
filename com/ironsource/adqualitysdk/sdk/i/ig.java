package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: ig.class */
public final class ig {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: პ, reason: contains not printable characters */
    private static boolean f2520 = false;

    /* renamed from: Ꮧ, reason: contains not printable characters */
    private static boolean f2521 = false;

    /* renamed from: Ꮭ, reason: contains not printable characters */
    private static int f2522 = 1;

    /* renamed from: ᐱ, reason: contains not printable characters */
    private static int f2523;

    /* renamed from: ᔱ, reason: contains not printable characters */
    private static int f2524;

    /* renamed from: ᔲ, reason: contains not printable characters */
    private static int f2525;

    /* renamed from: ᔹ, reason: contains not printable characters */
    private static char[] f2526;

    /* renamed from: ᔺ, reason: contains not printable characters */
    private static char f2527;

    /* renamed from: ᔽ, reason: contains not printable characters */
    private static long f2528;

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static String f2529;

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static String f2530;

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static String f2531;

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static String f2532;

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static String f2533;

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static String f2534;

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static String f2535;

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static String f2536;

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static String f2537;

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static String f2538;

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static String f2539;

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static String f2540;

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static String f2541;

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static String f2542;

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static String f2543;

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static String f2544;

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static String f2545;

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static String f2546;

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static String f2547;

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static String f2548;

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static String f2549;

    /* renamed from: Ύ, reason: contains not printable characters */
    public static String f2550;

    /* renamed from: K, reason: contains not printable characters */
    public static String f2551;

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static String f2552;

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static String f2553;

    /* renamed from: く, reason: contains not printable characters */
    public static String f2554;

    /* renamed from: っ, reason: contains not printable characters */
    public static String f2555;

    /* renamed from: へ, reason: contains not printable characters */
    public static String f2556;

    /* renamed from: ゥ, reason: contains not printable characters */
    public static String f2557;

    /* renamed from: ト, reason: contains not printable characters */
    public static String f2558;

    /* renamed from: リ, reason: contains not printable characters */
    public static String f2559;

    /* renamed from: ヮ, reason: contains not printable characters */
    public static String f2560;

    /* renamed from: ヶ, reason: contains not printable characters */
    public static String f2561;

    /* renamed from: 丫, reason: contains not printable characters */
    public static String f2562;

    /* renamed from: 乁, reason: contains not printable characters */
    public static String f2563;

    /* renamed from: 爫, reason: contains not printable characters */
    public static String f2564;

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static String f2565;

    /* renamed from: טּ, reason: contains not printable characters */
    public static String f2566;

    /* renamed from: סּ, reason: contains not printable characters */
    public static String f2567;

    /* renamed from: ףּ, reason: contains not printable characters */
    public static String f2568;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static String f2569;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static String f2570;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static String f2571;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static String f2572;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static String f2573;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static String f2574;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static String f2575;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static String f2576;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static String f2577;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static String f2578;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static String f2579;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static String f2580;

    /* renamed from: ｋ, reason: contains not printable characters */
    public static String f2581;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static String f2582;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String f2583;

    static {
        m5342();
        Object[] objArr = new Object[1];
        a((char) KeyEvent.keyCodeFromString(""), 34802529 + (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "亢\uf641僴⩤", "憱ጋ䜂뎍", "뙃旌㬂뗂鰯ﶯ䔓㲽۪湟\uf71a", objArr);
        f2579 = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(null, null, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, "\u0084\u0083\u0082\u0081", objArr2);
        f2583 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(null, null, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, "\u0082\u0084\u0086\u0085", objArr3);
        f2582 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 25403), TextUtils.lastIndexOf("", '0') + 1, "亢\uf641僴⩤", "罀뿋㲲ͣ", "耷┍ἷᖱ袥嚶", objArr4);
        f2581 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 46363), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "亢\uf641僴⩤", "滽æᮓ겵", "蔓朆혼�뗊隋", objArr5);
        f2580 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        b(null, null, 127 - Color.argb(0, 0, 0, 0), "\u0087\u0083", objArr6);
        f2574 = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        a((char) (64542 - ExpandableListView.getPackedPositionType(0L)), ViewConfiguration.getDoubleTapTimeout() >> 16, "亢\uf641僴⩤", "邚\u20f1Ṻჼ", "ᮌ朏Ὕ䅻㦆⯺", objArr7);
        f2576 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        b(null, null, KeyEvent.keyCodeFromString("") + 127, "\u0083\u008b\u0089\u0088\u0081\u008a\u0089\u0088", objArr8);
        f2575 = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        b(null, null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0087\u008f\u008e\u0088\u008e\u008d\u008b\u008b\u008c", objArr9);
        f2578 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        a((char) Drawable.resolveOpacity(0, 0), (-1011872017) - (ViewConfiguration.getJumpTapTimeout() >> 16), "亢\uf641僴⩤", "\uef13뀎韃뱿", "\ueb47ᶃ퇘ᬨ糍岍䜛", objArr10);
        f2577 = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        a((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 27796), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "亢\uf641僴⩤", "洂\ue1e8鎛ｬ", "춥鸻룤䥺긃\ue806", objArr11);
        f2572 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        b(null, null, (Process.myTid() >> 22) + 127, "\u0083\u0085\u008f\u0090\u0088\u008d\u0087\u0091\u0082\u0090", objArr12);
        f2569 = ((String) objArr12[0]).intern();
        Object[] objArr13 = new Object[1];
        a((char) (3530 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) - 1786417982, "亢\uf641僴⩤", "쉟蕬즕輍", "퓎㐩ꏸ똱冓", objArr13);
        f2573 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        a((char) (TextUtils.indexOf("", "", 0, 0) + 7300), (-1311186166) - ((byte) KeyEvent.getModifierMetaStateMask()), "亢\uf641僴⩤", "\u0bd3�蒱혜", "繫됓궇䴉༉", objArr14);
        f2570 = ((String) objArr14[0]).intern();
        Object[] objArr15 = new Object[1];
        b(null, null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0087\u0081\u0092\u008a\u008e", objArr15);
        f2571 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        b(null, null, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, "\u0086\u0088\u0093\u0083\u0087\u0089\u008a", objArr16);
        f2567 = ((String) objArr16[0]).intern();
        Object[] objArr17 = new Object[1];
        b(null, null, 127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0086\u0088\u0093\u0086\u008e\u0082\u0081\u0094", objArr17);
        f2566 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        b(null, null, Process.getGidForName("") + 128, "\u0086\u0088\u0093\u0095\u008b\u0081\u0086\u008b", objArr18);
        f2565 = ((String) objArr18[0]).intern();
        Object[] objArr19 = new Object[1];
        a((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 28859), MotionEvent.axisFromString("") + 1, "亢\uf641僴⩤", "�疔뭼牰", "향㈣審恮ﭽ礡", objArr19);
        f2568 = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        a((char) KeyEvent.getDeadChar(0, 0), 957400885 - (ViewConfiguration.getScrollBarSize() >> 8), "亢\uf641僴⩤", "㕚Ⴧ踹얤", "觶\ueafb呖䷡䛵ඟ矃", objArr20);
        f2564 = ((String) objArr20[0]).intern();
        Object[] objArr21 = new Object[1];
        a((char) (TextUtils.indexOf((CharSequence) "", '0') + 20660), ViewConfiguration.getScrollDefaultDelay() >> 16, "亢\uf641僴⩤", "곧ﷃ댉⭐", "졂쫸ᅯ딅ڑে", objArr21);
        f2560 = ((String) objArr21[0]).intern();
        Object[] objArr22 = new Object[1];
        b(null, null, (ViewConfiguration.getScrollBarSize() >> 8) + 127, "\u0087\u0086\u0088\u0093\u0092\u0083\u008b", objArr22);
        f2561 = ((String) objArr22[0]).intern();
        Object[] objArr23 = new Object[1];
        b(null, null, ExpandableListView.getPackedPositionChild(0L) + 128, "\u0087\u0086\u0088\u0093\u008b\u0088\u0087", objArr23);
        f2562 = ((String) objArr23[0]).intern();
        Object[] objArr24 = new Object[1];
        b(null, null, TextUtils.indexOf("", "") + 127, "\u0087\u0086\u0088\u0096\u008a\u0081\u0092", objArr24);
        f2559 = ((String) objArr24[0]).intern();
        Object[] objArr25 = new Object[1];
        b(null, null, 126 - ImageFormat.getBitsPerPixel(0), "\u0087\u0086\u0088\u0096\u0090\u008b\u0081", objArr25);
        f2563 = ((String) objArr25[0]).intern();
        Object[] objArr26 = new Object[1];
        b(null, null, 126 - Process.getGidForName(""), "\u0087\u0086\u0088\u0096\u0084\u008f\u0081", objArr26);
        f2558 = ((String) objArr26[0]).intern();
        Object[] objArr27 = new Object[1];
        a((char) (50183 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Process.myTid() >> 22, "亢\uf641僴⩤", "꺧ㅃ߯緄", "ﰨ皊扔뇮\uefa4猦", objArr27);
        f2554 = ((String) objArr27[0]).intern();
        Object[] objArr28 = new Object[1];
        b(null, null, Color.argb(0, 0, 0, 0) + 127, "\u0092\u0083\u008b\u008a\u0081", objArr28);
        f2556 = ((String) objArr28[0]).intern();
        Object[] objArr29 = new Object[1];
        b(null, null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0082\u0085\u008b\u008a\u0081", objArr29);
        f2555 = ((String) objArr29[0]).intern();
        Object[] objArr30 = new Object[1];
        a((char) (TextUtils.getOffsetBefore("", 0) + 43525), 850403025 - Color.red(0), "亢\uf641僴⩤", "퇡뀞Բ\uecaa", "㗜⛾牫䐳镽", objArr30);
        f2557 = ((String) objArr30[0]).intern();
        Object[] objArr31 = new Object[1];
        a((char) (25093 - Drawable.resolveOpacity(0, 0)), 1816803488 + ((byte) KeyEvent.getModifierMetaStateMask()), "亢\uf641僴⩤", "鿠䨸լ녢", "뽑끪㲎⍟誒", objArr31);
        f2550 = ((String) objArr31[0]).intern();
        Object[] objArr32 = new Object[1];
        a((char) (56233 - (ViewConfiguration.getJumpTapTimeout() >> 16)), View.resolveSize(0, 0), "亢\uf641僴⩤", "탌䘝ꥋ췛", "툡ᛛ蝍蕤", objArr32);
        f2552 = ((String) objArr32[0]).intern();
        Object[] objArr33 = new Object[1];
        b(null, null, 127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0092\u008a\u008e\u008a\u0081", objArr33);
        f2551 = ((String) objArr33[0]).intern();
        Object[] objArr34 = new Object[1];
        a((char) (32187 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (-1) - TextUtils.lastIndexOf("", '0'), "亢\uf641僴⩤", "�혬뭋뱽", "켯모흠ϯ", objArr34);
        f2549 = ((String) objArr34[0]).intern();
        Object[] objArr35 = new Object[1];
        b(null, null, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 126, "\u0085\u0087\u008a\u0092\u0083\u008b\u008a\u0081", objArr35);
        f2553 = ((String) objArr35[0]).intern();
        Object[] objArr36 = new Object[1];
        b(null, null, 127 - View.resolveSize(0, 0), "\u0085\u0087\u008a\u0082\u0085\u008b\u008a\u0081", objArr36);
        f2547 = ((String) objArr36[0]).intern();
        Object[] objArr37 = new Object[1];
        b(null, null, 127 - View.combineMeasuredStates(0, 0), "\u0087\u008b\u0088\u0098\u008a\u0097\u0089\u0081\u008f", objArr37);
        f2546 = ((String) objArr37[0]).intern();
        Object[] objArr38 = new Object[1];
        a((char) (45051 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (-899041904) - Color.alpha(0), "亢\uf641僴⩤", "逌榵\ufbca躯", "曒ᡳ㻨ꂲ犏갖䍰䈁�맰듰\uf19e\uf682", objArr38);
        f2544 = ((String) objArr38[0]).intern();
        Object[] objArr39 = new Object[1];
        b(null, null, (ViewConfiguration.getScrollBarSize() >> 8) + 127, "\u008a\u0089\u0087\u0096\u008e\u008d\u0083\u008b\u0097\u0099", objArr39);
        f2548 = ((String) objArr39[0]).intern();
        Object[] objArr40 = new Object[1];
        a((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 100162340 - ((byte) KeyEvent.getModifierMetaStateMask()), "亢\uf641僴⩤", "╠\uf85b甅癔", "㳨ﮩ볛㹒把♲혷釩㟗쭚䝘", objArr40);
        f2545 = ((String) objArr40[0]).intern();
        Object[] objArr41 = new Object[1];
        b(null, null, 127 - ((Process.getThreadPriority(0) + 20) >> 6), "\u008a\u0089\u0083\u008e\u0089\u0088\u009a\u0083\u008b\u0097\u0099", objArr41);
        f2541 = ((String) objArr41[0]).intern();
        Object[] objArr42 = new Object[1];
        a((char) View.MeasureSpec.makeMeasureSpec(0, 0), 535336977 - TextUtils.lastIndexOf("", '0', 0), "亢\uf641僴⩤", "ኣ\ue898퀟椧", "肔琌צ졌챔ဨ塈ⱔꯕ⮓氕", objArr42);
        f2540 = ((String) objArr42[0]).intern();
        Object[] objArr43 = new Object[1];
        a((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (-601942419) - TextUtils.getOffsetBefore("", 0), "亢\uf641僴⩤", "浝\u1f16燜嶵", "輺拢粸�硯傅\ue8dd읈ꍱ뇌㴇", objArr43);
        f2539 = ((String) objArr43[0]).intern();
        Object[] objArr44 = new Object[1];
        a((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 41743), TextUtils.indexOf("", "") - 2018891151, "亢\uf641僴⩤", "焇ꨪງኣ", "႕泭坿솅㽣稬钆흚싂칢❠\u19acꑾ", objArr44);
        f2543 = ((String) objArr44[0]).intern();
        Object[] objArr45 = new Object[1];
        a((char) (60721 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (-1) - ExpandableListView.getPackedPositionChild(0L), "亢\uf641僴⩤", "㹆䒣ㅷ鋭", "ꎢ촫ះ\u0e7c펝煿踊\uf536莧䵴م朣慊郉", objArr45);
        f2542 = ((String) objArr45[0]).intern();
        Object[] objArr46 = new Object[1];
        b(null, null, 127 - TextUtils.getOffsetAfter("", 0), "\u0090\u0094\u0082\u009b\u0088\u0089\u0087\u0096", objArr46);
        f2534 = ((String) objArr46[0]).intern();
        Object[] objArr47 = new Object[1];
        b(null, null, (ViewConfiguration.getEdgeSlop() >> 16) + 127, "\u008a\u0081\u0096\u0093\u0083\u008b\u0089\u009d\u009c\u0090", objArr47);
        f2537 = ((String) objArr47[0]).intern();
        Object[] objArr48 = new Object[1];
        b(null, null, TextUtils.lastIndexOf("", '0', 0, 0) + 128, "\u0092\u0088", objArr48);
        f2536 = ((String) objArr48[0]).intern();
        Object[] objArr49 = new Object[1];
        a((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13773), Process.getGidForName("") - 178829916, "亢\uf641僴⩤", "ꎠ坅췵뼵", "亶녆뛅", objArr49);
        f2535 = ((String) objArr49[0]).intern();
        Object[] objArr50 = new Object[1];
        a((char) (60405 - ImageFormat.getBitsPerPixel(0)), View.resolveSize(0, 0) - 1922792823, "亢\uf641僴⩤", "襠撂\uf68d\ue6eb", "趪䫅䨐", objArr50);
        f2538 = ((String) objArr50[0]).intern();
        Object[] objArr51 = new Object[1];
        b(null, null, TextUtils.indexOf("", "", 0, 0) + 127, "\u0083\u0082\u0089\u0092\u009f\u008a\u0082\u0089\u0098\u0083\u0090\u009e\u0090\u008a", objArr51);
        f2530 = ((String) objArr51[0]).intern();
        Object[] objArr52 = new Object[1];
        b(null, null, 127 - (ViewConfiguration.getTouchSlop() >> 8), "\u008e\u0083\u008e \u0081\u008a\u0089\u008f", objArr52);
        f2531 = ((String) objArr52[0]).intern();
        Object[] objArr53 = new Object[1];
        b(null, null, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, "\u0092\u0089\u0088", objArr53);
        f2529 = ((String) objArr53[0]).intern();
        Object[] objArr54 = new Object[1];
        b(null, null, 126 - ImageFormat.getBitsPerPixel(0), "\u008b\u0086\u0085", objArr54);
        f2533 = ((String) objArr54[0]).intern();
        Object[] objArr55 = new Object[1];
        b(null, null, ExpandableListView.getPackedPositionChild(0L) + 128, "\u008f\u0083\u008b\u0081", objArr55);
        f2532 = ((String) objArr55[0]).intern();
        f2523 = (f2522 + 53) % 128;
    }

    private static void a(char c, int i, String str, String str2, String str3, Object[] objArr) {
        $11 = ($10 + 93) % 128;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        if (str2 != null) {
            str2 = str2.toCharArray();
        }
        char[] cArr3 = (char[]) str2;
        if (str != null) {
            $11 = ($10 + 15) % 128;
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
            $11 = ($10 + 35) % 128;
            try {
                Map map = b.f452;
                Object obj = map.get(844572084);
                if (obj == null) {
                    obj = ((Class) b.m3371(View.getDefaultSize(0, 0), (char) Drawable.resolveOpacity(0, 0), (Process.myPid() >> 22) + 41)).getMethod("B", Object.class);
                    map.put(844572084, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, gVar)).intValue();
                Object obj2 = map.get(-204678676);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371(KeyEvent.getDeadChar(0, 0), (char) TextUtils.getTrimmedLength(""), 40 - Process.getGidForName(""))).getMethod("z", Object.class);
                    map.put(-204678676, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, gVar)).intValue();
                char c2 = cArr5[gVar.f2182 % 4];
                char c3 = cArr6[intValue];
                Object obj3 = map.get(786100179);
                if (obj3 == null) {
                    Class cls = (Class) b.m3371(ViewConfiguration.getScrollBarSize() >> 8, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 41);
                    Class<?> cls2 = Integer.TYPE;
                    obj3 = cls.getMethod("A", Object.class, cls2, cls2);
                    map.put(786100179, obj3);
                }
                ((Method) obj3).invoke(null, gVar, Integer.valueOf(c2 * 32718), Integer.valueOf(c3));
                char c4 = cArr5[intValue2];
                char c5 = cArr6[intValue];
                Object obj4 = map.get(1393811622);
                if (obj4 == null) {
                    Class cls3 = (Class) b.m3371(View.combineMeasuredStates(0, 0), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), 41 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    Class<?> cls4 = Integer.TYPE;
                    obj4 = cls3.getMethod("D", cls4, cls4);
                    map.put(1393811622, obj4);
                }
                cArr6[intValue2] = ((Character) ((Method) obj4).invoke(null, Integer.valueOf(c4 * 32718), Integer.valueOf(c5))).charValue();
                cArr5[intValue2] = gVar.f2183;
                int i2 = gVar.f2182;
                cArr7[i2] = (char) ((((r0 ^ cArr2[i2]) ^ (f2528 ^ (-6542782394566060766L))) ^ ((int) (f2525 ^ (-6542782394566060766L)))) ^ ((char) (f2527 ^ (-6542782394566060766L))));
                gVar.f2182 = i2 + 1;
                $10 = ($11 + 5) % 128;
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

    private static void b(int[] iArr, String str, int i, String str2, Object[] objArr) {
        char[] cArr;
        int i2 = $11 + 95;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        String str3 = str2;
        if (str2 != null) {
            str3 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) str3;
        if (str != null) {
            int i3 = $10 + 49;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                str.toCharArray();
                throw new ArithmeticException("divide by zero");
            }
            str = str.toCharArray();
        }
        char[] cArr2 = (char[]) str;
        r rVar = new r();
        char[] cArr3 = f2526;
        char[] cArr4 = cArr3;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr5 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                char c = cArr3[i4];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122475841);
                    if (obj == null) {
                        obj = ((Class) b.m3371(1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), ExpandableListView.getPackedPositionType(0L) + 41)).getMethod("b", Integer.TYPE);
                        map.put(122475841, obj);
                    }
                    cArr5[i4] = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c))).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $11 = ($10 + 51) % 128;
            cArr4 = cArr5;
        }
        int i5 = f2524;
        Map map2 = b.f452;
        Object obj2 = map2.get(122565214);
        if (obj2 == null) {
            obj2 = ((Class) b.m3371(TextUtils.lastIndexOf("", '0', 0, 0) + 1, (char) ExpandableListView.getPackedPositionType(0L), 42 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).getMethod("e", Integer.TYPE);
            map2.put(122565214, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i5))).intValue();
        if (f2520) {
            int length2 = bArr.length;
            rVar.f3052 = length2;
            char[] cArr6 = new char[length2];
            rVar.f3051 = 0;
            while (true) {
                int i6 = rVar.f3051;
                int i7 = rVar.f3052;
                if (i6 >= i7) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                cArr6[i6] = (char) (cArr4[bArr[(i7 - 1) - i6] + i] - intValue);
                Map map3 = b.f452;
                Object obj3 = map3.get(-1176441533);
                if (obj3 == null) {
                    obj3 = ((Class) b.m3371(Color.green(0), (char) (ViewConfiguration.getTouchSlop() >> 8), Color.rgb(0, 0, 0) + 16777257)).getMethod("a", Object.class, Object.class);
                    map3.put(-1176441533, obj3);
                }
                ((Method) obj3).invoke(null, rVar, rVar);
            }
        } else if (f2521) {
            int i8 = $10 + 15;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                int length3 = cArr2.length;
                rVar.f3052 = length3;
                cArr = new char[length3];
                rVar.f3051 = 1;
            } else {
                int length4 = cArr2.length;
                rVar.f3052 = length4;
                cArr = new char[length4];
                rVar.f3051 = 0;
            }
            while (true) {
                int i9 = rVar.f3051;
                int i10 = rVar.f3052;
                if (i9 >= i10) {
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[i9] = (char) (cArr4[cArr2[(i10 - 1) - i9] - i] - intValue);
                Map map4 = b.f452;
                Object obj4 = map4.get(-1176441533);
                if (obj4 == null) {
                    obj4 = ((Class) b.m3371(ViewConfiguration.getLongPressTimeout() >> 16, (char) (TextUtils.lastIndexOf("", '0', 0) + 1), Color.blue(0) + 41)).getMethod("a", Object.class, Object.class);
                    map4.put(-1176441533, obj4);
                }
                ((Method) obj4).invoke(null, rVar, rVar);
            }
        } else {
            int length5 = iArr.length;
            rVar.f3052 = length5;
            char[] cArr7 = new char[length5];
            rVar.f3051 = 0;
            $10 = ($11 + 85) % 128;
            while (true) {
                int i11 = rVar.f3051;
                int i12 = rVar.f3052;
                if (i11 >= i12) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    $11 = ($10 + 39) % 128;
                    cArr7[i11] = (char) (cArr4[iArr[(i12 - 1) - i11] - i] - intValue);
                    rVar.f3051 = i11 + 1;
                }
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static void m5342() {
        f2525 = -919218910;
        f2528 = -8118003416947188864L;
        f2527 = (char) 54562;
        f2521 = true;
        f2526 = new char[]{6385, 6378, 6372, 6387, 6376, 6380, 6375, 6374, 6389, 6388, 6391, 6371, 6344, 6393, 6381, 6379, 6350, 6370, 6341, 6386, 6383, 6373, 6361, 6343, 6352, 6359, 6353, 6390, 6382, 6346, 6357, 6356};
        f2520 = true;
        f2524 = 343349400;
    }
}
