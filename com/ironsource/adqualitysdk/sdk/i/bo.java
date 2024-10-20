package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ChartboostDelegate;
import com.chartboost.sdk.InPlay.CBInPlay;
import com.chartboost.sdk.Model.CBError;
import com.ironsource.adqualitysdk.sdk.i.bm;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: bo.class */
public final class bo extends bm {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f902 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f903;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f904;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f905;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f906;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f907;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f908;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: bo$a.class */
    public class a extends ChartboostDelegate implements hg {
        private static int $10 = 0;
        private static int $11 = 1;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f918 = 0;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f919 = 1;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f920;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static long f921;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private ChartboostDelegate f922;

        /* renamed from: ｋ, reason: contains not printable characters */
        private bo f923;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private cp f924;

        static {
            char[] cArr = new char[1261];
            ByteBuffer.wrap("\ri\u001fZ){;\u0010E>W0aÕsí\u009d\u0099¯\u0086¹\u009eÊGÔfæwð\u001d\u0002#,Þ>×H´Z\u0091d¢v½\u0083O\u00adn¿\u000eÉ Û?åÓ÷ÿ\u0001÷\u0013\u0089=¶NcX\\jnt\u0007\u00868\u0090!¢ÎÌëÞ\u009eè\u009bú»\u0007N\u001f.\r\u001d;<)WWyEws\u0092aª\u008fÞ½Á«ÙØ��Æ!ô0âZ\u0010d>\u0099,\u0090ZóHÖvådú\u0091\b¿)\u00adIÛqÉt÷\u0096å½\u0013¹\u0001Ü/ü\\$J\u001bx)f@\u0094\u007f\u0082f°\u0089Þ¬ÌÙúÜèü\u0015\tXíJÞ|ÿn\u0094\u0010º\u0002´4Q&iÈ\u001dú\u0002ì\u001a\u009fÃ\u0081â³ó¥\u0099W§yZkS\u001d0\u000f\u00021'#2Öýøçê\u008d\u009c\u009e\u008e»°o¢`TbF\u001bh4\u001bÝ\rÂ?÷!\u0092Ó§Å·÷RYàKÓ}òo\u0099\u0011·\u0003¹5\\'dÉ\u0010û\u000fí\u0017\u009eÎ\u0080ï²þ¤\u0094VªxWj^\u001c=\u000e\u000f0*\"?×õùêë\u008a\u009d\u0097\u008f\u0087±D£OUtG\u0012i/\u001aê\fÕ>ç \u008eÒ±Ä¨öG\u0098b\u008a\u0017¼\u0012®2SÇÈXÚkìJþ!\u0080\u000f\u0092\u0001¤ä¶ÜX¨j·|¯\u000fv\u0011W#F5,Ç\u0012éïûæ\u008d\u0085\u009f·¡\u0092³\u0087FOhZz(\f.\u001e\u0002 à2ÈÄêÖ¥ø\u0087\u008b~\u009dq¯X±'C\u0012U\u0017gâ\tÒ\u001b·\ri\u001fZ){;\u0010E>W0aÕsí\u009d\u0099¯\u0086¹\u009eÊGÔfæwð\u001d\u0002#,Þ>×H´Z\u0086d£v¶\u0083y\u00adn¿\u0005É\u0001Û?åë÷ä\u0001æ\u0013\u009f=°NYXFjst\u0016\u0086#\u00903¢ÖÉÌÛÿíÞÿµ\u0081\u009b\u0093\u0095¥p·HY<k#};\u000eâ\u0010Ã\"Ò4¸Æ\u0086è{úr\u008c\u0011\u009e# \u0006²\u0013GÜiË{¦\r´\u001f\u0094!N3AÅC×:ù\u0015\u008aü\u009cã®Ö°³B\u0086T\u0096fsöOä|Ò]À6¾\u0018¬\u0016\u009aó\u0088Ëf¿T B¸1a/@\u001dQ\u000b;ù\u0005×øÅñ³\u0092¡ \u009f\u0085\u008d\u0090xXVMD?2$ \u0010\u001eå\fÕúýè²Æ\u0090µi£f\u0091O\u008f0}\u0005k��Yõ7Å% \t0\u001b\u0003-\"?IAgSie\u008cw´\u0099À«ß½ÇÎ\u001eÐ?â.ôD\u0006z(\u0087:\u008eLí^ß`úrï\u0087 ©4»^Í[ßoá\u009eó§\u0005®\u0017ê9õJ\u0007\\\u000en1pH\u0082g\u0094b¦\u0097È²ÚÒìÇÚàÈÓþòì\u0099\u0092·\u0080¹¶\\¤dJ\u0010x\u000fn\u0017\u001dÎ\u0003ï1þ'\u0094ÕªûWé^\u009f=\u008d\u0018³+¡4TÆzçh\u0087\u001e©\f¶2Z vÖ~Ä��ê?\u0099î\u008fÔ½á£\u008eQ\u0082G«uC\u001bx\u0087Ö\u0095å£Ä±¯Ï\u0081Ý\u008fëjùR\u0017&%93!@ø^ÙlÈz¢\u0088\u009c¦a´hÂ\u000bÐ9î\u001cü\t\tÆ'Ü5¶C¥Q\u0080oP}Z\u008b_\u0099 ·<ÄåÒýàÖ\ri\u001fZ){;\u0010E>W0aÕsí\u009d\u0099¯\u0086¹\u009eÊGÔfæwð\u001d\u0002#,Þ>×H´Z\u0091d¢v½\u0083O\u00adn¿\u000eÉ6Û3åÑ÷ú\u0001þ\u0013\u009b=»NgX]jht\u0007\u0086\u000b\u0090\"¢ÊÌñ\ri\u001fZ){;\u0010E>W0aÕsí\u009d\u0099¯\u0086¹\u009eÊGÔfæwð\u001d\u0002#,Þ>×H´Z\u0086d£v¶\u0083|\u00adc¿\u0003É\u001eÛ\u000eåÍ÷Æ\u0001ý\u0013\u009b=¦NgX]jht\u0007\u0086\u000b\u0090\"¢ÊÌñ\ri\u001fZ){;\u0010E>W0aÕsí\u009d\u0099¯\u0086¹\u009eÊGÔfæwð\u001d\u0002#,Þ>×H´Z\u0086d£v¶\u0083~\u00adk¿\u0019É\u001fÛ3åÑ÷ù\u0001ß\u0013\u0095=°NOXsjjt\u0012\u00869i-{\u001eM?_T!z3t\u0005\u0091\u0017©ùÝËÂÝÚ®\u0003°\"\u00823\u0094YfgH\u009aZ\u0093,ð>Â��ç\u0012òç=É*ÛA\u00adE¿{\u0081«\u0093¡e¤wÛYÇ*\u001e<\u0006\u000e-\ri\u001fZ){;\u0010E>W0aÕsí\u009d\u0099¯\u0086¹\u009eÊGÔfæwð\u001d\u0002#,Þ>×H´Z\u0086d£v¶\u0083y\u00adn¿\u0003É\u0011Û1åï÷å\u0001à\u0013\u009f=\u0083NZXBji\u0004ð\u0016Ã â2\u0089L§^©hLzt\u0094��¦\u001f°\u0007ÃÞÝÿïîù\u0084\u000bº%G7NA-S\u001fm:\u007f/\u008aç¤ò¶\u0080À\u009bÒ¯ìZþj\bF\u001a\f4)GÖQêcó}\u008b\u008f \ri\u001fZ){;\u0010E>W0aÕsí\u009d\u0099¯\u0086¹\u009eÊGÔfæwð\u001d\u0002#,Þ>×H´Z\u0086d£v¶\u0083|\u00adc¿\u0003É\u001eÛ\u000eåÍ÷Ø\u0001÷\u0013\u0099=\u00adNXXVjYt\u000e\u0086#\u00901¢Ñ¦)´\u001a\u0082;\u0090Pî~üpÊ\u0095Ø\u00ad6Ù\u0004Æ\u0012Þa\u0007\u007f&M7[]©c\u0087\u009e\u0095\u0097ãôñÆÏãÝö(*\u0006#\u0014_bAp\u007fN¡\\¦ª»¸Ù\u0096éå,ó\u001dÁ(ßa-e;|\t\u009cg«uØCßQû¬\u0016º#\u0088=æT\rN\u001f[)~;2E+W'aÉsç\u009d©¯\u009e¹³ÊAÔaæTð\u0015\u00020,é>ÝHôZ\u0084d£v \u0083W\u00adc¿\u001eÉ\u001bÛ5åÌ\ri\u001fZ){;\u0010E>W0aÕsí\u009d\u0099¯\u0086¹\u009eÊGÔfæwð\u001d\u0002#,Þ>×H´Z\u0091d¢v½\u0083O\u00adn¿\u000eÉ6Û3åÑ÷ú\u0001þ\u0013\u009b=»NxXWjmt\u0003\u00868\u00906¢ßÌæÞ¼è\u009bú¾\u0007G\u0011e\ri\u001fZ){;\u0010E>W0aÕsí\u009d\u0099¯\u0086¹\u009eÊGÔfæwð\u001d\u0002#,Þ>×H´Z\u0086d£v¶\u0083y\u00adc¿\tÉ\u001aÛ?åð÷ï\u0001å\u0013\u009b=°NNXWj~t4\u0086#\u00906¢ßÌí\ri\u001fZ){;\u0010E>W0aÕsí\u009d\u0099¯\u0086¹\u009eÊGÔfæwð\u001d\u0002#,Þ>×H´Z\u0086d£v¶\u0083|\u00adc¿\u0003É\u001eÛ\u000eåÍ÷Æ\u0001ý\u0013\u009b=¦NxXWjmt\u0003\u00868\u00906¢ßÌæÞ¼è\u009bú¾\u0007G\u0011eÞ\u0092Ì¡ú\u0080èë\u0096Å\u0084Ë². \u0016Nb|}je\u0019¼\u0007\u009d5\u008c#æÑØÿ%í,\u009bO\u0089}·X¥MP\u0085~\u0090lâ\u001aä\bÈ6*$\u0002Ò;ÀdîN\u009d°\u008b»¹\u0085§üUÕCÿq(\u001f\u001d\rt;f\ri\u001fZ){;\u0010E>W0aÕsí\u009d\u0099¯\u0086¹\u009eÊGÔfæwð\u001d\u0002#,Þ>×H´Z\u0086d£v¶\u0083y\u00adn¿\u0005É\u0001Û?åð÷ï\u0001å\u0013\u009b=°NNXWj~t4\u0086#\u00906¢ßÌí\ri\u001fZ){;\u0010E>W0aÕsí\u009d\u0099¯\u0086¹\u009eÊGÔfæwð\u001d\u0002#,Þ>×H´Z\u0086d£v¶\u0083y\u00adn¿\u0003É\u0011Û1åð÷ï\u0001å\u0013\u009b=°NNXWj~t4\u0086#\u00906¢ßÌíJ:X\tn(|C\u0002m\u0010c&\u00864¾ÚÊèÕþÍ\u008d\u0014\u00935¡$·NEpk\u008dy\u0084\u000fç\u001dÕ#ð1åÄ*ê>øT\u008eQ\u009ce¢\u0094°\u00adF¤Tûzô\t\u000e\u001f��-;3UÁ|×eå¿\u008b¸\u0099Ý¯Ä½æ\ri\u001fZ){;\u0010E>W0aÕsí\u009d\u0099¯\u0086¹\u009eÊGÔfæwð\u001d\u0002#,Þ>×H´Z\u0086d£v¶\u0083~\u00adk¿\u0019É\u0002Û6åÃ÷ó\u0001À\u0013\u009f=µNKX@j~t\u0007\u0086.\u0090\u0004¢ÓÌæÞ\u008fè\u009d\u0083=\u0091\u000e§/µDËjÙdï\u0081ý¹\u0013Í!Ò7ÊD\u0013Z2h#~I\u008cw¢\u008a°\u0083ÆàÔÁê÷øê\r\u0002#\u00121WGUU~k\u009ay¿\u008f¿\u009dø³ÿÀ\u001aÖ\u0003ä!\ri\u001fZ){;\u0010E>W0aÕsí\u009d\u0099¯\u0086¹\u009eÊGÔfæwð\u001d\u0002#,Þ>×H´Z\u0086d£v¶\u0083y\u00adc¿\tÉ\u001aÛ?åë÷ä\u0001Â\u0013\u0096=£NS5ù'Ê\u0011ë\u0003\u0080}®o YEK}¥\t\u0097\u0016\u0081\u000eò×ìöÞçÈ\u008d:³\u0014N\u0006Gp$b\u0016\\3N&»ì\u0095ó\u0087\u0093ñ\u008eã\u009eÝ]ÏV9m+\u000b\u00056vó`ÌRÚL\u009e¾»¨»\ri\u001fZ){;\u0010E>W0aÕsí\u009d\u0099¯\u0086¹\u009eÊGÔfæwð\u001d\u0002#,Þ>×H´Z\u0086d£v¶\u0083s\u00adl¿\u0003É\u0006Û3åÃ÷æ\u0001û\u0013\u0080=§".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1261);
            f920 = cArr;
            f921 = -4353588939690860750L;
        }

        a(bo boVar, ChartboostDelegate chartboostDelegate, cp cpVar) {
            this.f923 = boVar;
            this.f922 = chartboostDelegate;
            this.f924 = cpVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0281  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0284  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(int r8, int r9, char r10, java.lang.Object[] r11) {
            /*
                Method dump skipped, instructions count: 659
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bo.a.a(int, int, char, java.lang.Object[]):void");
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private ChartboostDelegate m3764() {
            int i = f919 + 91;
            f918 = i % 128;
            if (i % 2 == 0) {
                return this.f922;
            }
            throw null;
        }

        public void didCacheInPlay(String str) {
            f919 = (f918 + 19) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(33 - Color.alpha(0), 1158 - Color.alpha(0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                f919 = (f918 + 29) % 128;
                chartboostDelegate.didCacheInPlay(str);
            }
        }

        public void didCacheInterstitial(String str) {
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a((Process.myPid() >> 22) + 39, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 88, (char) (TextUtils.getTrimmedLength("") + 21892), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                int i = f918 + 79;
                f919 = i % 128;
                chartboostDelegate.didCacheInterstitial(str);
                if (i % 2 == 0) {
                    throw new ArithmeticException("divide by zero");
                }
                f918 = (f919 + 41) % 128;
            }
            f918 = (f919 + 59) % 128;
        }

        public void didCacheMoreApps(String str) {
            f919 = (f918 + 29) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(34 - TextUtils.lastIndexOf("", '0', 0, 0), 413 - (KeyEvent.getMaxKeyCode() >> 16), (char) (View.resolveSizeAndState(0, 0, 0) + 35519), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                int i = f919 + 1;
                f918 = i % 128;
                chartboostDelegate.didCacheMoreApps(str);
                if (i % 2 != 0) {
                    throw null;
                }
            }
        }

        public void didCacheRewardedVideo(String str) {
            f918 = (f919 + 109) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(((Process.getThreadPriority(0) + 20) >> 6) + 40, 832 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                f918 = (f919 + 23) % 128;
                chartboostDelegate.didCacheRewardedVideo(str);
            }
        }

        public void didClickInterstitial(String str) {
            f918 = (f919 + 125) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 39, 251 - KeyEvent.getDeadChar(0, 0), (char) (50341 - KeyEvent.getDeadChar(0, 0)), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                chartboostDelegate.didClickInterstitial(str);
            }
            int i = f918 + 89;
            f919 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public void didClickMoreApps(String str) {
            f918 = (f919 + 125) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(35 - View.getDefaultSize(0, 0), (Process.myTid() >> 22) + 600, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                chartboostDelegate.didClickMoreApps(str);
                f918 = (f919 + 53) % 128;
            }
        }

        public void didClickRewardedVideo(String str) {
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(40 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 998 - Color.argb(0, 0, 0, 0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                f919 = (f918 + 9) % 128;
                chartboostDelegate.didClickRewardedVideo(str);
            }
            int i = f918 + 51;
            f919 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public void didCloseInterstitial(String str) {
            f919 = (f918 + 33) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(38 - TextUtils.lastIndexOf("", '0'), TextUtils.lastIndexOf("", '0', 0, 0) + 213, (char) (Process.myPid() >> 22), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                f919 = (f918 + 21) % 128;
                chartboostDelegate.didCloseInterstitial(str);
            }
        }

        public void didCloseMoreApps(String str) {
            f919 = (f918 + 5) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 34, ExpandableListView.getPackedPositionGroup(0L) + 565, (char) (25668 - Color.alpha(0)), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                int i = f919 + 41;
                f918 = i % 128;
                chartboostDelegate.didCloseMoreApps(str);
                if (i % 2 != 0) {
                    throw new ArithmeticException("divide by zero");
                }
            }
        }

        public void didCloseRewardedVideo(String str) {
            f919 = (f918 + 53) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(40 - KeyEvent.keyCodeFromString(""), AndroidCharacter.getMirror('0') + 910, (char) ExpandableListView.getPackedPositionType(0L), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCloseRewardedVideo(str);
                f919 = (f918 + 81) % 128;
            }
        }

        public void didCompleteInterstitial(String str) {
            f918 = (f919 + 21) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(AndroidCharacter.getMirror('0') - 6, 331 - Gravity.getAbsoluteGravity(0, 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1114), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCompleteInterstitial(str);
                f919 = (f918 + 71) % 128;
            }
            f919 = (f918 + 103) % 128;
        }

        public void didCompleteRewardedVideo(String str, int i) {
            f918 = (f919 + 111) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(43 - (ViewConfiguration.getTouchSlop() >> 8), IronSourceError.ERROR_IS_SHOW_EXCEPTION - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18259), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str, Integer.valueOf(i));
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCompleteRewardedVideo(str, i);
                f918 = (f919 + 73) % 128;
            }
            f919 = (f918 + 29) % 128;
        }

        public void didDismissInterstitial(String str) {
            f918 = (f919 + 7) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(41 - TextUtils.indexOf("", ""), View.resolveSizeAndState(0, 0, 0) + 171, (char) (TextUtils.getOffsetBefore("", 0) + 50481), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                int i = f919 + 75;
                f918 = i % 128;
                chartboostDelegate.didDismissInterstitial(str);
                if (i % 2 != 0) {
                    throw null;
                }
            }
        }

        public void didDismissMoreApps(String str) {
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a((Process.myTid() >> 22) + 37, (ViewConfiguration.getWindowTouchSlop() >> 8) + 528, (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                int i = f918 + 113;
                f919 = i % 128;
                chartboostDelegate.didDismissMoreApps(str);
                if (i % 2 == 0) {
                    throw null;
                }
                f918 = (f919 + 19) % 128;
            }
        }

        public void didDismissRewardedVideo(String str) {
            f918 = (f919 + 115) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(42 - (ViewConfiguration.getTapTimeout() >> 16), 916 - (Process.myTid() >> 22), (char) (TextUtils.getTrimmedLength("") + 54267), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                chartboostDelegate.didDismissRewardedVideo(str);
                f919 = (f918 + 23) % 128;
            }
            int i = f919 + 47;
            f918 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public void didDisplayInterstitial(String str) {
            f919 = (f918 + 93) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(TextUtils.indexOf("", "", 0) + 41, 290 - KeyEvent.normalizeMetaState(0), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 64294), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                f918 = (f919 + 19) % 128;
                chartboostDelegate.didDisplayInterstitial(str);
            }
            int i = f918 + 121;
            f919 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public void didDisplayMoreApps(String str) {
            f918 = (f919 + 15) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(37 - (ViewConfiguration.getLongPressTimeout() >> 16), 635 - Color.red(0), (char) (Color.green(0) + 2457), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                chartboostDelegate.didDisplayMoreApps(str);
                f919 = (f918 + 51) % 128;
            }
            f918 = (f919 + 7) % 128;
        }

        public void didDisplayRewardedVideo(String str) {
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 41, 1081 - TextUtils.getOffsetBefore("", 0), (char) KeyEvent.keyCodeFromString(""), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                f918 = (f919 + 27) % 128;
                chartboostDelegate.didDisplayRewardedVideo(str);
                f918 = (f919 + 97) % 128;
            }
        }

        public void didFailToLoadInPlay(String str, CBError.CBImpressionError cBImpressionError) {
            f919 = (f918 + 83) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(Color.rgb(0, 0, 0) + 16777254, 1191 - Color.argb(0, 0, 0, 0), (char) (14479 - TextUtils.indexOf((CharSequence) "", '0', 0)), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                int i = f919 + 51;
                f918 = i % 128;
                chartboostDelegate.didFailToLoadInPlay(str, cBImpressionError);
                if (i % 2 != 0) {
                    throw null;
                }
            }
        }

        public void didFailToLoadInterstitial(String str, CBError.CBImpressionError cBImpressionError) {
            f918 = (f919 + 119) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43, 127 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (View.MeasureSpec.getSize(0) + 21641), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                f918 = (f919 + 11) % 128;
                chartboostDelegate.didFailToLoadInterstitial(str, cBImpressionError);
            }
        }

        public void didFailToLoadMoreApps(String str, CBError.CBImpressionError cBImpressionError) {
            f918 = (f919 + 15) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 41, 487 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                chartboostDelegate.didFailToLoadMoreApps(str, cBImpressionError);
                f918 = (f919 + 65) % 128;
            }
        }

        public void didFailToLoadRewardedVideo(String str, CBError.CBImpressionError cBImpressionError) {
            f918 = (f919 + 17) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(44 - TextUtils.lastIndexOf("", '0', 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 870, (char) ((-1) - TextUtils.lastIndexOf("", '0')), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                chartboostDelegate.didFailToLoadRewardedVideo(str, cBImpressionError);
                f918 = (f919 + 37) % 128;
            }
        }

        public void didFailToRecordClick(String str, CBError.CBClickError cBClickError) {
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(TextUtils.lastIndexOf("", '0') + 40, 672 - TextUtils.getTrimmedLength(""), (char) Color.argb(0, 0, 0, 0), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str, cBClickError);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                f918 = (f919 + 103) % 128;
                chartboostDelegate.didFailToRecordClick(str, cBClickError);
                f918 = (f919 + 25) % 128;
            }
        }

        public void didInitialize() {
            f918 = (f919 + 121) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            char mirror = AndroidCharacter.getMirror('0');
            int alpha = Color.alpha(0);
            Object[] objArr = new Object[1];
            a('P' - mirror, 1229 - alpha, (char) ((-1) - TextUtils.lastIndexOf("", '0')), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), new Object[0]);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                int i = f919 + 105;
                f918 = i % 128;
                chartboostDelegate.didInitialize();
                if (i % 2 != 0) {
                    throw null;
                }
            }
        }

        public void didPauseClickForConfirmation(Activity activity) {
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getFadingEdgeLength() >> 16) + 47, (ViewConfiguration.getKeyRepeatDelay() >> 16) + IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_ADAPTER, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43840), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), activity);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                f918 = (f919 + 91) % 128;
                try {
                    Class<?> cls = chartboostDelegate.getClass();
                    Object[] objArr2 = new Object[1];
                    a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28, 758 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr2);
                    cls.getDeclaredMethod(((String) objArr2[0]).intern(), Activity.class).invoke(this.f922, activity);
                    f918 = (f919 + 87) % 128;
                } catch (Throwable th) {
                }
            }
        }

        public boolean shouldDisplayInterstitial(String str) {
            f918 = (f919 + 107) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(Color.rgb(0, 0, 0) + 16777260, Color.alpha(0) + 44, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4678), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate == null) {
                f918 = (f919 + 85) % 128;
                return false;
            }
            int i = f919 + 37;
            f918 = i % 128;
            if (i % 2 != 0) {
                chartboostDelegate.shouldDisplayInterstitial(str);
                throw new ArithmeticException("divide by zero");
            }
            boolean shouldDisplayInterstitial = chartboostDelegate.shouldDisplayInterstitial(str);
            int i2 = f918 + 83;
            f919 = i2 % 128;
            if (i2 % 2 != 0) {
                return shouldDisplayInterstitial;
            }
            throw null;
        }

        public boolean shouldDisplayMoreApps(String str) {
            f919 = (f918 + 85) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(View.MeasureSpec.getMode(0) + 40, 448 - TextUtils.indexOf("", ""), (char) Color.green(0), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate == null) {
                return false;
            }
            f919 = (f918 + 35) % 128;
            return chartboostDelegate.shouldDisplayMoreApps(str);
        }

        public boolean shouldDisplayRewardedVideo(String str) {
            f919 = (f918 + 123) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getJumpTapTimeout() >> 16) + 45, 785 - TextUtils.lastIndexOf("", '0'), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                return chartboostDelegate.shouldDisplayRewardedVideo(str);
            }
            f919 = (f918 + 27) % 128;
            return false;
        }

        public boolean shouldRequestInterstitial(String str) {
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(44 - (KeyEvent.getMaxKeyCode() >> 16), MotionEvent.axisFromString("") + 1, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate == null) {
                return false;
            }
            int i = f918 + 37;
            f919 = i % 128;
            if (i % 2 == 0) {
                chartboostDelegate.shouldRequestInterstitial(str);
                throw null;
            }
            boolean shouldRequestInterstitial = chartboostDelegate.shouldRequestInterstitial(str);
            int i2 = f918 + 123;
            f919 = i2 % 128;
            if (i2 % 2 != 0) {
                return shouldRequestInterstitial;
            }
            throw null;
        }

        public boolean shouldRequestMoreApps(String str) {
            f918 = (f919 + 23) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(Process.getGidForName("") + 41, ExpandableListView.getPackedPositionChild(0L) + 374, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 55177), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate == null) {
                int i = f918 + 23;
                f919 = i % 128;
                if (i % 2 != 0) {
                    return false;
                }
                throw null;
            }
            int i2 = f918 + 45;
            f919 = i2 % 128;
            if (i2 % 2 != 0) {
                return chartboostDelegate.shouldRequestMoreApps(str);
            }
            chartboostDelegate.shouldRequestMoreApps(str);
            throw null;
        }

        public void willDisplayVideo(String str) {
            f919 = (f918 + 109) % 128;
            bo boVar = this.f923;
            cp cpVar = this.f924;
            Object[] objArr = new Object[1];
            a(35 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1122 - ImageFormat.getBitsPerPixel(0), (char) (36436 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr);
            boVar.m3723(this, cpVar, ((String) objArr[0]).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f922;
            if (chartboostDelegate != null) {
                chartboostDelegate.willDisplayVideo(str);
                f919 = (f918 + 67) % 128;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* renamed from: ﻛ */
        public final /* synthetic */ Object mo3633() {
            int i = f919 + 31;
            f918 = i % 128;
            if (i % 2 == 0) {
                return m3764();
            }
            m3764();
            throw null;
        }
    }

    static {
        m3747();
        ViewConfiguration.getScrollBarSize();
        ExpandableListView.getPackedPositionForChild(0, 0);
        ViewConfiguration.getWindowTouchSlop();
        ViewConfiguration.getTapTimeout();
        Gravity.getAbsoluteGravity(0, 0);
        TextUtils.indexOf("", "");
        ViewConfiguration.getScrollDefaultDelay();
        TextUtils.getTrimmedLength("");
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        ViewConfiguration.getLongPressTimeout();
        View.resolveSizeAndState(0, 0, 0);
        ViewConfiguration.getScrollBarSize();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        Color.blue(0);
        View.MeasureSpec.getMode(0);
        ExpandableListView.getPackedPositionChild(0L);
        AndroidCharacter.getMirror('0');
        ViewConfiguration.getMinimumFlingVelocity();
        ViewConfiguration.getPressedStateDuration();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        TextUtils.indexOf("", "", 0, 0);
        TextUtils.getOffsetBefore("", 0);
        TextUtils.indexOf("", "", 0, 0);
        ViewConfiguration.getDoubleTapTimeout();
        PointF.length(0.0f, 0.0f);
        Process.myTid();
        TextUtils.indexOf((CharSequence) "", '0');
        TextUtils.lastIndexOf("", '0', 0, 0);
        f902 = (f903 + 33) % 128;
    }

    public bo(String str) {
        super(str);
    }

    private static void a(String str, int i, Object[] objArr) {
        int i2 = ($11 + 123) % 128;
        $10 = i2;
        if (str != null) {
            $11 = (i2 + 45) % 128;
            str = str.toCharArray();
        }
        n nVar = new n();
        char[] m5750 = n.m5750(f905 ^ (-7438370749274812225L), (char[]) str, i);
        nVar.f3042 = 4;
        while (true) {
            int i3 = nVar.f3042;
            if (i3 >= m5750.length) {
                objArr[0] = new String(m5750, 4, m5750.length - 4);
                return;
            }
            int i4 = i3 - 4;
            nVar.f3041 = i4;
            long j = m5750[i3] ^ m5750[i3 % 4];
            long j2 = i4;
            long j3 = f905;
            try {
                Map map = b.f452;
                Object obj = map.get(983860882);
                if (obj == null) {
                    Class cls = (Class) b.m3371(ViewConfiguration.getEdgeSlop() >> 16, (char) TextUtils.getTrimmedLength(""), KeyEvent.normalizeMetaState(0) + 41);
                    Class<?> cls2 = Long.TYPE;
                    obj = cls.getMethod("p", cls2, cls2, cls2);
                    map.put(983860882, obj);
                }
                m5750[i3] = ((Character) ((Method) obj).invoke(null, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3))).charValue();
                Object obj2 = map.get(-2082235053);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371((-1) - MotionEvent.axisFromString(""), (char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 41)).getMethod("q", Object.class, Object.class);
                    map.put(-2082235053, obj2);
                }
                ((Method) obj2).invoke(null, nVar, nVar);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v94, types: [int] */
    private static void b(String str, int i, Object[] objArr) {
        boolean z = 3;
        if (str != null) {
            $10 = ($11 + 73) % 128;
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        p pVar = new p();
        char[] cArr2 = new char[cArr.length];
        pVar.f3046 = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i2 = pVar.f3046;
            if (i2 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[i2];
            cArr3[1] = cArr[i2 + 1];
            char c = 58224;
            int i3 = 0;
            boolean z2 = z;
            while (i3 < 16) {
                $11 = ($10 + 3) % 128;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                char c4 = (char) (f904 ^ 8584761702560213004L);
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[z2 ? 1 : 0] = Integer.valueOf(f908);
                    objArr2[2] = Integer.valueOf(c3 >>> 5);
                    objArr2[1] = Integer.valueOf((c3 + c) ^ ((c3 << 4) + c4));
                    objArr2[0] = Integer.valueOf(c2);
                    Map map = b.f452;
                    Object obj = map.get(-952725446);
                    if (obj == null) {
                        Class cls = (Class) b.m3371((-1) - TextUtils.lastIndexOf("", '0'), (char) TextUtils.getOffsetBefore("", 0), ExpandableListView.getPackedPositionGroup(0L) + 41);
                        Class<?>[] clsArr = new Class[4];
                        Class<?> cls2 = Integer.TYPE;
                        clsArr[0] = cls2;
                        clsArr[1] = cls2;
                        clsArr[2] = cls2;
                        clsArr[z2 ? 1 : 0] = cls2;
                        obj = cls.getMethod("x", clsArr);
                        map.put(-952725446, obj);
                    }
                    char charValue = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    cArr3[1] = charValue;
                    char c5 = cArr3[0];
                    char c6 = (char) (f907 ^ 8584761702560213004L);
                    char c7 = f906;
                    Object obj2 = map.get(-952725446);
                    if (obj2 == null) {
                        Class cls3 = (Class) b.m3371(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (ViewConfiguration.getEdgeSlop() >> 16), KeyEvent.normalizeMetaState(0) + 41);
                        Class<?> cls4 = Integer.TYPE;
                        obj2 = cls3.getMethod("x", cls4, cls4, cls4, cls4);
                        map.put(-952725446, obj2);
                    }
                    cArr3[0] = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c5), Integer.valueOf((charValue + c) ^ ((charValue << 4) + c6)), Integer.valueOf(charValue >>> 5), Integer.valueOf(c7))).charValue();
                    c -= 40503;
                    i3++;
                    z2 = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i4 = pVar.f3046;
            cArr2[i4] = cArr3[0];
            cArr2[i4 + 1] = cArr3[1];
            Map map2 = b.f452;
            Object obj3 = map2.get(-1234941609);
            if (obj3 == null) {
                obj3 = ((Class) b.m3371((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 41 - TextUtils.getOffsetAfter("", 0))).getMethod("u", Object.class, Object.class);
                map2.put(-1234941609, obj3);
            }
            ((Method) obj3).invoke(null, pVar, pVar);
            $10 = ($11 + 55) % 128;
            z = z2;
        }
    }

    /* renamed from: 爫, reason: contains not printable characters */
    private static Object m3745() {
        f902 = (f903 + 5) % 128;
        com.chartboost.sdk.impl.a aVar = com.chartboost.sdk.g.d;
        int i = f902 + 125;
        f903 = i % 128;
        if (i % 2 == 0) {
            return aVar;
        }
        throw null;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    static /* synthetic */ boolean m3746() {
        f902 = (f903 + 29) % 128;
        boolean m3749 = m3749();
        f902 = (f903 + 13) % 128;
        return m3749;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    static void m3747() {
        f905 = -8030493604537973934L;
        f904 = (char) 3235;
        f906 = (char) 44170;
        f908 = (char) 63220;
        f907 = (char) 6577;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static Object m3748() {
        f902 = (f903 + 61) % 128;
        com.chartboost.sdk.a delegate = Chartboost.getDelegate();
        int i = f903 + 29;
        f902 = i % 128;
        if (i % 2 != 0) {
            return delegate;
        }
        throw null;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static boolean m3749() {
        int i = f902 + 33;
        f903 = i % 128;
        if (i % 2 == 0) {
            return Chartboost.isWebViewEnabled();
        }
        Chartboost.isWebViewEnabled();
        throw null;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static boolean m3750() {
        int i = f902 + 45;
        f903 = i % 128;
        if (i % 2 != 0) {
            boolean z = m3748() instanceof a;
            throw null;
        }
        boolean z2 = m3748() instanceof a;
        int i2 = f903 + 119;
        f902 = i2 % 128;
        if (i2 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ a m3751(bo boVar, ChartboostDelegate chartboostDelegate, cp cpVar) {
        f903 = (f902 + 65) % 128;
        a aVar = (a) m3758(new Object[]{boVar, chartboostDelegate, cpVar}, -839893065, 839893067, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, boVar)).intValue());
        int i = f902 + 79;
        f903 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return aVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Object m3752() {
        int i = f902 + 63;
        f903 = i % 128;
        if (i % 2 != 0) {
            m3745();
            throw null;
        }
        Object m3745 = m3745();
        int i2 = f903 + 85;
        f902 = i2 % 128;
        if (i2 % 2 != 0) {
            return m3745;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m3753(ChartboostDelegate chartboostDelegate) {
        int i = f903 + 109;
        f902 = i % 128;
        Object[] objArr = new Object[1];
        if (i % 2 == 0) {
            objArr[0] = chartboostDelegate;
            m3758(objArr, 2089150785, -2089150784, (int) System.currentTimeMillis());
            throw null;
        }
        objArr[0] = chartboostDelegate;
        m3758(objArr, 2089150785, -2089150784, (int) System.currentTimeMillis());
        f903 = (f902 + 79) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Object m3754() {
        int i = f903 + 69;
        f902 = i % 128;
        if (i % 2 != 0) {
            return m3748();
        }
        m3748();
        throw new ArithmeticException("divide by zero");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static /* synthetic */ Object m3755(Object[] objArr) {
        CBInPlay cBInPlay = (CBInPlay) objArr[0];
        int i = f902 + 83;
        f903 = i % 128;
        String appName = cBInPlay.getAppName();
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        f902 = (f903 + 79) % 128;
        return appName;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m3756(CBInPlay cBInPlay) {
        f903 = (f902 + 57) % 128;
        String str = (String) m3758(new Object[]{cBInPlay}, -733615922, 733615922, (int) System.currentTimeMillis());
        f903 = (f902 + 13) % 128;
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m3757(bo boVar, cp cpVar) {
        int i = f903 + 59;
        f902 = i % 128;
        boVar.m3760(cpVar);
        if (i % 2 == 0) {
            throw null;
        }
        int i2 = f902 + 101;
        f903 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Object m3758(Object[] objArr, int i, int i2, int i3) {
        ChartboostDelegate chartboostDelegate;
        int i4 = i2 ^ (-1);
        int i5 = i3 ^ (-1);
        int i6 = (i * 677) + (i2 * (-675)) + ((i | i3 | i4) * (-676)) + ((((i4 | i) ^ (-1)) | ((i5 | i) ^ (-1))) * 676) + (((((i | i2) | i3) ^ (-1)) | (((i ^ (-1)) | i4) ^ (-1)) | ((i4 | i5) ^ (-1))) * 676);
        if (i6 == 1) {
            ChartboostDelegate chartboostDelegate2 = (ChartboostDelegate) objArr[0];
            f903 = (f902 + 121) % 128;
            Chartboost.setDelegate(chartboostDelegate2);
            f903 = (f902 + 11) % 128;
            chartboostDelegate = null;
        } else if (i6 == 2) {
            chartboostDelegate = new a((bo) objArr[0], (ChartboostDelegate) objArr[1], (cp) objArr[2]);
            f902 = (f903 + 93) % 128;
        } else if (i6 != 3) {
            chartboostDelegate = m3755(objArr);
        } else {
            bo boVar = (bo) objArr[0];
            chartboostDelegate = new HashMap();
            Object[] objArr2 = new Object[1];
            a("늶닅뤅觙\uea8d巡\u2e77꙲ﵠ\u1ae0縲ᛶⶻ䨷컺욺巏", 1 - Color.green(0), objArr2);
            chartboostDelegate.put(((String) objArr2[0]).intern(), new bm.d(boVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bo.3

                /* renamed from: ﾇ, reason: contains not printable characters */
                private bo f912;

                {
                    this.f912 = boVar;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                /* renamed from: ﻛ */
                public final Object mo3630(List<Object> list, cp cpVar) {
                    bo.m3757(this.f912, cpVar);
                    return null;
                }
            });
            Object[] objArr3 = new Object[1];
            a("﮶\ufbd1�垊趇鑡\uf024濥둪総ꁶ�撼ⴵႧ༽ᓞ鵂섙绮씃䳕녁꺂畗", TextUtils.getTrimmedLength("") + 1, objArr3);
            chartboostDelegate.put(((String) objArr3[0]).intern(), new bm.d(boVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bo.4

                /* renamed from: ﻛ, reason: contains not printable characters */
                private bo f913;

                {
                    this.f913 = boVar;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                /* renamed from: ﻛ */
                public final Object mo3630(List<Object> list, cp cpVar) {
                    return bo.m3754();
                }
            });
            Object[] objArr4 = new Object[1];
            a("ऺढ़\ue9da�멒츅粂㖁䛦䨚Ⳑ蔊阰\u1ae0鰁啙\ue652ꪅ䷢Ⓓ㟞笸㶶\uf4d6蟛ே\ued17䐩흣�嵛", (ViewConfiguration.getTapTimeout() >> 16) + 1, objArr4);
            chartboostDelegate.put(((String) objArr4[0]).intern(), new bm.d(boVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bo.2

                /* renamed from: ﻐ, reason: contains not printable characters */
                private bo f911;

                {
                    this.f911 = boVar;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                /* renamed from: ﻛ */
                public final Object mo3630(List<Object> list, cp cpVar) {
                    return bo.m3752();
                }
            });
            Object[] objArr5 = new Object[1];
            b("얹玝靄뫎齔└纏溂䔞髂䠬耷ᛳ켥咞㱬恣\u0ffc땔묩臤莦頩ૺ齔└", 26 - View.getDefaultSize(0, 0), objArr5);
            chartboostDelegate.put(((String) objArr5[0]).intern(), new bm.d(boVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bo.5

                /* renamed from: ﻛ, reason: contains not printable characters */
                private bo f914;

                {
                    this.f914 = boVar;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                /* renamed from: ﻛ */
                public final Object mo3630(List<Object> list, cp cpVar) {
                    return bo.m3751(this.f914, (ChartboostDelegate) list.get(0), cpVar);
                }
            });
            Object[] objArr6 = new Object[1];
            b("纲晳扡\ue0a6팪\uf7ba⛖\ue722평髀骴⍀ꕴ⸈潽薒眪좞�찢流惠", 21 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr6);
            chartboostDelegate.put(((String) objArr6[0]).intern(), new bm.d(boVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bo.1

                /* renamed from: ｋ, reason: contains not printable characters */
                private bo f909;

                {
                    this.f909 = boVar;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                /* renamed from: ﻛ */
                public final Object mo3630(List<Object> list, cp cpVar) {
                    bo.m3753((ChartboostDelegate) list.get(0));
                    return null;
                }
            });
            Object[] objArr7 = new Object[1];
            a("椊楣鞧賤쐹㛿⭩쵝⛜㑐笃緡\uf615撷쯈궱虴퓂᩷�", View.resolveSize(0, 0) + 1, objArr7);
            chartboostDelegate.put(((String) objArr7[0]).intern(), new bm.d(boVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bo.8

                /* renamed from: ﻛ, reason: contains not printable characters */
                private bo f916;

                {
                    this.f916 = boVar;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                /* renamed from: ﻛ */
                public final Object mo3630(List<Object> list, cp cpVar) {
                    return Boolean.valueOf(bo.m3746());
                }
            });
            Object[] objArr8 = new Object[1];
            a("舫艌ڦ飌售뿤㽢䑯췰ꕤ漣\uf4ebᴪ\uf59c�", View.resolveSize(0, 0) + 1, objArr8);
            chartboostDelegate.put(((String) objArr8[0]).intern(), new bm.d(boVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bo.10

                /* renamed from: ﾒ, reason: contains not printable characters */
                private bo f910;

                {
                    this.f910 = boVar;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                /* renamed from: ﻛ */
                public final Object mo3630(List<Object> list, cp cpVar) {
                    return bo.m3759((CBInPlay) list.get(0));
                }
            });
            Object[] objArr9 = new Object[1];
            a("꿤꾃긐㌭ﶘ⪪钃턬\ue020ශ쓭憰メ崠", TextUtils.indexOf("", "", 0, 0) + 1, objArr9);
            chartboostDelegate.put(((String) objArr9[0]).intern(), new bm.d(boVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bo.7

                /* renamed from: ｋ, reason: contains not printable characters */
                private bo f915;

                {
                    this.f915 = boVar;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                /* renamed from: ﻛ */
                public final Object mo3630(List<Object> list, cp cpVar) {
                    return bo.m3756((CBInPlay) list.get(0));
                }
            });
            Object[] objArr10 = new Object[1];
            a("⦣⧊韤ᆨ쑺\ue05d똦\u1bf8晓㐠\ue64aꭃ뚬擐嚞笗", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr10);
            chartboostDelegate.put(((String) objArr10[0]).intern(), new bm.d(boVar) { // from class: com.ironsource.adqualitysdk.sdk.i.bo.9

                /* renamed from: ﾇ, reason: contains not printable characters */
                private bo f917;

                {
                    this.f917 = boVar;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
                /* renamed from: ﻛ */
                public final Object mo3630(List<Object> list, cp cpVar) {
                    return Boolean.valueOf(bo.m3761(this.f917));
                }
            });
            f903 = (f902 + 59) % 128;
        }
        return chartboostDelegate;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m3759(CBInPlay cBInPlay) {
        f903 = (f902 + 87) % 128;
        String m3762 = m3762(cBInPlay);
        f903 = (f902 + 27) % 128;
        return m3762;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m3760(cp cpVar) {
        int i = f903 + 53;
        f902 = i % 128;
        if (i % 2 == 0) {
            ChartboostDelegate chartboostDelegate = (ChartboostDelegate) m3748();
            m3758(new Object[]{(a) m3758(new Object[]{this, chartboostDelegate, cpVar}, -839893065, 839893067, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue())}, 2089150785, -2089150784, (int) System.currentTimeMillis());
            throw null;
        }
        ChartboostDelegate chartboostDelegate2 = (ChartboostDelegate) m3748();
        m3758(new Object[]{(a) m3758(new Object[]{this, chartboostDelegate2, cpVar}, -839893065, 839893067, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue())}, 2089150785, -2089150784, (int) System.currentTimeMillis());
        f902 = (f903 + 79) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m3761(bo boVar) {
        f903 = (f902 + 89) % 128;
        boolean m3750 = m3750();
        int i = f902 + 103;
        f903 = i % 128;
        if (i % 2 == 0) {
            return m3750;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m3762(CBInPlay cBInPlay) {
        int i = f903 + 19;
        f902 = i % 128;
        if (i % 2 == 0) {
            cBInPlay.getLocation();
            throw null;
        }
        String location = cBInPlay.getLocation();
        f902 = (f903 + 17) % 128;
        return location;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01db, code lost:
    
        if (r6.equals(((java.lang.String) r0[0]).intern()) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x044f, code lost:
    
        if (r6.equals(((java.lang.String) r0[0]).intern()) != false) goto L79;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Class mo3627(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 1385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bo.mo3627(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Map mo3628() {
        return (Map) m3758(new Object[]{this}, 723091055, -723091052, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾒ */
    public final String mo3629() {
        f903 = (f902 + 73) % 128;
        try {
            String sDKVersion = Chartboost.getSDKVersion();
            f903 = (f902 + 23) % 128;
            return sDKVersion;
        } catch (Error e) {
            Object[] objArr = new Object[1];
            b("櫮빬ꖐ좴겹\ueefb", Color.argb(0, 0, 0, 0) + 5, objArr);
            return ((String) objArr[0]).intern();
        }
    }
}
