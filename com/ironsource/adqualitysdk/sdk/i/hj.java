package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Message;
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
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: hj.class */
public class hj extends WebChromeClient implements cn, js {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2362 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2363;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2364;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2365;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private WebChromeClient f2366;

    /* renamed from: ｋ, reason: contains not printable characters */
    private WebChromeClient f2367;

    static {
        m5114();
        ViewConfiguration.getZoomControlsTimeout();
        SystemClock.elapsedRealtime();
        Color.blue(0);
        ViewConfiguration.getPressedStateDuration();
        KeyEvent.getMaxKeyCode();
        ExpandableListView.getPackedPositionType(0L);
        Color.argb(0, 0, 0, 0);
        Process.myTid();
        Process.myPid();
        f2362 = (f2364 + 109) % 128;
    }

    public hj(WebChromeClient webChromeClient, WebChromeClient webChromeClient2) {
        this.f2366 = webChromeClient;
        this.f2367 = webChromeClient2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r8, int r9, char r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hj.a(int, int, char, java.lang.Object[]):void");
    }

    private WebChromeClient cM_() {
        int i = (f2362 + 91) % 128;
        f2364 = i;
        WebChromeClient webChromeClient = this.f2366;
        f2362 = (i + 49) % 128;
        return webChromeClient;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private Object m5113() {
        int i = f2362;
        WebChromeClient webChromeClient = this.f2367;
        int i2 = i + 73;
        f2364 = i2 % 128;
        if (i2 % 2 == 0) {
            return webChromeClient;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static void m5114() {
        char[] cArr = new char[1006];
        ByteBuffer.wrap("\r}\u008dÃ\fP\u008cÍ\u000fr\u008fä\u000e\r\u008e\u0093\t/\u0089\u0085\b>\u008bG\u000bß\u008aX\nö\u0085Z\u0005\u008f\u0084\u0005\u0004\u009d\u0087<\u0007»\u0086\"\u0001M\u0081ÌkdëßjKêêicé½h��è\u009boaï n\ríGmýìTlúãac\u0084â\u0003b\u009cá7añà2gGçåfsæâe~å\u0097d\u0014ä\u008e{:û\u0096zÉùLy×øbxôÿyjrêÉk]ëühuè«i\u0016é\u008dnwî¶o\u001bìQlëíBmìâwb\u0092ã\u0015c\u008aà!`çá$fQæñgrçødjä\u009ae\u0011å\u008ez;ú\u0097{ÞøOxÃùv\u0018M\u0098ö\u0019b\u0099Ã\u001aJ\u009a\u0094\u001b)\u009b²\u001cH\u009c\u0089\u001d$\u009en\u001eÔ\u009f}\u001fÓ\u0090H\u0010\u00ad\u0091*\u0011µ\u0092\u001e\u0012Ø\u0093\u001b\u0014n\u0094Î\u0015M\u0095Ç\u0016U\u0096¥\u0017.\u0097±\b\u0004\u0088µ\të\u008ak\nþt¯ô\u0014u\u0080õ!v¨övwË÷PpªðkqÆò\u008cr6ó\u009fs1üª|OýÈ}Wþü~:ÿùx\u008cø,y¯ù%z·úG{ÌûSdæäJe\u0005æ\u0093f\u0011ç¦g\u0013àµ`MáÐa_âôb~xkøÐyDùåzlú²{\u000fû\u0094|nü¯}\u0002þH~òÿ[\u007fõðnp\u008bñ\fq\u0093ò8rþó=tHôéufõívaö©w\u000b÷\u0081h2èµiÃêtjßëoké\ro\u008dÔ\f@\u008cá\u000fh\u008f¶\u000e\u000b\u008e\u0090\tj\u0089«\b\u0006\u008bL\u000bö\u008a_\nñ\u0085j\u0005\u008f\u0084\b\u0004\u0097\u0087<\u0007ú\u00869\u0001L\u0081ö��c\u0080â\u0003w\u0083\u00ad\u0002\u000f\u0082\u0085\u001d6\u009d±\u001cÇ\u009fp\u001fÛ\u009ek\u001eí*íªV+Â«c(ê¨4)\u0089©\u0012.è®)/\u0084¬Î,t\u00adÝ-s¢è\"\r£\u008a#\u0015 ¾ x¡»&Î¦\u007f'ú§a$ñ¤\u0018%\u009d¥#:©º2;L¸Ë8Gþ\u0004~¿ÿ+\u007f\u008aü\u0003|Ýý`}ûú\u0001zÀûmx'ø\u009dy4ù\u009av\u0001öäwc÷ütWô\u0091uRò'r\u0087ó\u0004s\u009cð\fpàñbqéîonÚï¢l8ìª\ro\u008dÔ\f@\u008cá\u000fh\u008f¶\u000e\u000b\u008e\u0090\tj\u0089«\b\u0006\u008bL\u000bö\u008a_\nñ\u0085j\u0005\u008f\u0084\b\u0004\u0097\u0087<\u0007ú\u00869\u0001L\u0081ý��f\u0080é\u0003a\u0083\u008b\u0002-\u0082\u009f\u001d,\u009dº\u001cÅ\u009fQóÐskòÿr^ñ×q\tð´p/÷Õw\u0014ö¹uóõItàôN{Õû0z·ú(y\u0083ùEx\u0086ÿó\u007fKþÆ~xýÁ}4ü·|=\ro\u008dÔ\f@\u008cá\u000fh\u008f¶\u000e\u000b\u008e\u0090\tj\u0089«\b\u0006\u008bL\u000bö\u008a_\nñ\u0085j\u0005\u008f\u0084\b\u0004\u0097\u0087<\u0007ú\u00869\u0001L\u0081ô��y\u0080Å\u0003}\u0083\u0080\u0002\u001c\u0082\u009f\u001d0\u009d³zøúC{×ûvxÿø!y\u009cù\u0007~ýþ<\u007f\u0091üÛ|aýÈ}fòýr\u0018ó\u009fs��ð«pmñ®vÛöcwî÷At÷ô\u0016u\u0080õ\u0011j¡\ro\u008dÔ\f@\u008cá\u000fh\u008f¶\u000e\u000b\u008e\u0090\tj\u0089«\b\u0006\u008bL\u000bö\u008a_\nñ\u0085j\u0005\u008f\u0084\b\u0004\u0097\u0087<\u0007ú\u00869\u0001L\u0081ô��y\u0080Ä\u0003w\u0083\u0088\u0002\u0015\u0082\u0084\u001d'\u009d\u008b\u001cÄ\u009fJ\u001fÝ\u009eo\u001eþ\ro\u008dÔ\f@\u008cá\u000fh\u008f¶\u000e\u000b\u008e\u0090\tj\u0089«\b\u0006\u008bL\u000bö\u008a_\nñ\u0085j\u0005\u008f\u0084\b\u0004\u0097\u0087<\u0007ú\u00869\u0001L\u0081û��r\u0080å\u0003w\u0083\u008b\u0002\u001e\u0082\u0093\u001d&\u009d\u009a\u001cË\u009fR\u001fÓ\u009el\u001eû\u0099e\u0019\u0087\u0098/\u0018¿\u009b)\u001b¦\u009aÏ\ro\u008dÔ\f@\u008cá\u000fh\u008f¶\u000e\u000b\u008e\u0090\tj\u0089«\b\u0006\u008bL\u000bö\u008a_\nñ\u0085j\u0005\u008f\u0084\b\u0004\u0097\u0087<\u0007ú\u00869\u0001L\u0081ù��o\u0080é\u0003~\u0083\u0081\u0002\u0019\u0082\u0097\u001d6\u009d·\u001cÅ\u009fH\u001fâ\u009ek\u001eè\u0099{\u0019\u008b\u0098\r\u0018¹\u009b/\u001b½\u009aÀ\u0015I\u0095å\u0014j\u0094ñ\u0017\u001d\u0097¶\u0016��\u0096¡\u00117\u0091¦\u0010Ö\u009e²\u001e\t\u009f\u009d\u001f<\u009cµ\u001ck\u009dÖ\u001dM\u009a·\u001av\u009bÛ\u0018\u0091\u0098+\u0019\u0082\u0099,\u0016·\u0096R\u0017Õ\u0097J\u0014á\u0094'\u0015ä\u0092\u0091\u0012$\u0093²\u00134\u0090£\u0010\\\u0091Ä\u0011J\u008eë\u000ej\u008f\u0018\f\u0095\u008c?\r¶\u008d5\n¦\u008aV\u000bÐ\u008bd\bò\u0088`\t\u001d\u0086\u0094\u0006#\u0087¶\u0007'\u0084Ò\u0004k\u0085Ý\u0005|\u0082ê\u0002{\u0083\u000b\ro\u008dÔ\f@\u008cá\u000fh\u008f¶\u000e\u000b\u008e\u0090\tj\u0089«\b\u0006\u008bL\u000bö\u008a_\nñ\u0085j\u0005\u008f\u0084\b\u0004\u0097\u0087<\u0007ú\u00869\u0001L\u0081î��o\u0080ô\u0003\u007f\u0083\u0087\u0002\t\u0082\u0085\u001d+\u009d±\u001cÄ\u009ft\u001f×\u009e\u007f\u001eï\u0099s\u0019\u0091\u0098\n\ro\u008dÔ\f@\u008cá\u000fh\u008f¶\u000e\u000b\u008e\u0090\tj\u0089«\b\u0006\u008bL\u000bö\u008a_\nñ\u0085j\u0005\u008f\u0084\b\u0004\u0097\u0087<\u0007ú\u00869\u0001L\u0081î��o\u0080ô\u0003\u007f\u0083\u0087\u0002\t\u0082\u0085\u001d+\u009d±\u001cÄ\u009ft\u001f×\u009e\u007f\u001eï\u0099s\u0019\u0091\u0098\n\u0018\u0089\u009b'\u001b¼\u009aÍ\u0015_\u0095Ú\u0014g\u0094úµ35\u0088´\u001c4½·47ê¶W6Ì±61÷°Z3\u0010³ª2\u0003²\u00ad=6½Ó<T¼Ë?`¿¦>e¹\u00109¨¸%8\u008e»';ßºC:Å¥k%ö\ro\u008dÔ\f@\u008cá\u000fh\u008f¶\u000e\u000b\u008e\u0090\tj\u0089«\b\u0006\u008bL\u000bö\u008a_\nñ\u0085j\u0005\u008f\u0084\b\u0004\u0097\u0087<\u0007ú\u00869\u0001L\u0081ý��e\u0080è\u0003a\u0083\u0081\u0002\u0016\u0082\u0093\u001d\u000f\u009d»\u001cÙ\u009fU\u001fÓ\u009ei\u001eÿ\u0015Ï\u0095t\u0014à\u0094A\u0017È\u0097\u0016\u0016«\u00960\u0011Ê\u0091\u000b\u0010¦\u0093ì\u0013V\u0092ÿ\u0012Q\u009dÊ\u001d/\u009c¨\u001c7\u009f\u009c\u001fZ\u009e\u0091\u0019ç\u0099j\u0018î\u0098C\u001bÔ\u009b/\u001a¯\u009a:\u0005\u0096\u0085(\u0004c\u0087â\u0007w\u0086Á\u0006j\u0081Ù\u00011\u0080ª��\u000f\u0083\u0094c×ãlbøâYaÐá\u000e`³à(gÒç\u0013f¾åôeNäçdIëÒk7ê°j/é\u0084iBè\u0089oÿïrnäîWmÎí3l\u00adì\u0002s\u0095ó\u0007rvñ÷qdðÑpr÷Üw5ö¡v��õ\u009bu\u0019ôe{ÔûgzßúQ\ro\u008dÔ\f@\u008cá\u000fh\u008f¶\u000e\u000b\u008e\u0090\tj\u0089«\b\u0006\u008bL\u000bö\u008a_\nñ\u0085j\u0005\u008f\u0084\b\u0004\u0097\u0087<\u0007ú\u00861\u0001G\u0081Ê��\\\u0080ï\u0003a\u0083\u0087\u0002\u000e\u0082\u0093\u001d&\u009d\u0096\u001cÃ\u009fU\u001fÆ\u009ea\u001eè\u0099o\ro\u008dÔ\f@\u008cá\u000fh\u008f¶\u000e\u000b\u008e\u0090\tj\u0089«\b\u0006\u008bL\u000bö\u008a_\nñ\u0085j\u0005\u008f\u0084\b\u0004\u0097\u0087<\u0007ú\u00869\u0001L\u0081í��b\u0080é\u0003e\u0083¨\u0002\u0013\u0082\u009a\u001d'\u009d\u009d\u001cÂ\u009fI\u001fÝ\u009e}\u001eÿ\u0099d\rM\u008dÃ\fF\u008cÙ\u000fh\u008f÷\u000e\u0012\u008e\u008e\t/\u0089¢\b\u0005\u008bK\u000bØ\u008au\nê\u0085l\u0005\u0085\u0084\u000b\u0004\u0097\u0087\r\u0007¶\u0086?\u0001G\u0081Ð��~ËÛKUÊÐJLÉîIWÈ\u0091H\nÏ\u009fO8Î¶M×ÍALÅÌWCäÃ\u0015B\u0095Â\nA¬".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1006);
        f2363 = cArr;
        f2365 = -574430493323588186L;
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        f2362 = (f2364 + 51) % 128;
        try {
            this.f2367.getDefaultVideoPoster();
            f2362 = (f2364 + 25) % 128;
        } catch (Throwable th) {
            int resolveSize = View.resolveSize(0, 0);
            Object[] objArr = new Object[1];
            a(24 - resolveSize, KeyEvent.getDeadChar(0, 0), (char) KeyEvent.getDeadChar(0, 0), objArr);
            String intern = ((String) objArr[0]).intern();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int blue = Color.blue(0);
            Object[] objArr2 = new Object[1];
            a(43 - (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)), blue + 795, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6304), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
            f2362 = (f2364 + 7) % 128;
            return defaultVideoPoster;
        }
        int i = f2364 + 9;
        f2362 = i % 128;
        if (i % 2 != 0) {
            return webChromeClient.getDefaultVideoPoster();
        }
        webChromeClient.getDefaultVideoPoster();
        throw new ArithmeticException("divide by zero");
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        int i = f2362 + 85;
        f2364 = i % 128;
        try {
        } catch (Throwable th) {
            int indexOf = TextUtils.indexOf("", "", 0);
            Object[] objArr = new Object[1];
            a(24 - indexOf, ExpandableListView.getPackedPositionGroup(0L), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr);
            String intern = ((String) objArr[0]).intern();
            int maxKeyCode = KeyEvent.getMaxKeyCode();
            int indexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0);
            Object[] objArr2 = new Object[1];
            a((maxKeyCode >> 16) + 48, indexOf2 + 838, (char) (28344 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (i % 2 != 0) {
            this.f2367.getVideoLoadingProgressView();
            throw null;
        }
        this.f2367.getVideoLoadingProgressView();
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            return super.getVideoLoadingProgressView();
        }
        f2364 = (f2362 + 5) % 128;
        return webChromeClient.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        int i = f2364 + 103;
        f2362 = i % 128;
        try {
        } catch (Throwable th) {
            int keyCodeFromString = KeyEvent.keyCodeFromString("");
            int edgeSlop = ViewConfiguration.getEdgeSlop();
            Object[] objArr = new Object[1];
            a(24 - keyCodeFromString, edgeSlop >> 16, (char) TextUtils.getOffsetAfter("", 0), objArr);
            String intern = ((String) objArr[0]).intern();
            int indexOf = TextUtils.indexOf("", "", 0, 0);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
            Object[] objArr2 = new Object[1];
            a(38 - indexOf, packedPositionGroup + 885, (char) KeyEvent.keyCodeFromString(""), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (i % 2 == 0) {
            this.f2367.getVisitedHistory(valueCallback);
            throw new ArithmeticException("divide by zero");
        }
        this.f2367.getVisitedHistory(valueCallback);
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            super.getVisitedHistory(valueCallback);
            return;
        }
        int i2 = f2362 + 105;
        f2364 = i2 % 128;
        if (i2 % 2 == 0) {
            webChromeClient.getVisitedHistory(valueCallback);
        } else {
            webChromeClient.getVisitedHistory(valueCallback);
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        try {
            this.f2367.onCloseWindow(webView);
        } catch (Throwable th) {
            int lastIndexOf = TextUtils.lastIndexOf("", '0');
            Object[] objArr = new Object[1];
            a(23 - lastIndexOf, TextUtils.getTrimmedLength(""), (char) (KeyEvent.getMaxKeyCode() >> 16), objArr);
            String intern = ((String) objArr[0]).intern();
            long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
            int offsetBefore = TextUtils.getOffsetBefore("", 0);
            Object[] objArr2 = new Object[1];
            a(35 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), 320 - offsetBefore, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient != null) {
            f2362 = (f2364 + 3) % 128;
            webChromeClient.onCloseWindow(webView);
        } else {
            super.onCloseWindow(webView);
            f2362 = (f2364 + 59) % 128;
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onConsoleMessage(String str, int i, String str2) {
        f2364 = (f2362 + 63) % 128;
        try {
            this.f2367.onConsoleMessage(str, i, str2);
        } catch (Throwable th) {
            int pressedStateDuration = ViewConfiguration.getPressedStateDuration();
            Object[] objArr = new Object[1];
            a(24 - (pressedStateDuration >> 16), TextUtils.getOffsetAfter("", 0), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr);
            String intern = ((String) objArr[0]).intern();
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
            int packedPositionType = ExpandableListView.getPackedPositionType(0L);
            Object[] objArr2 = new Object[1];
            a(37 - absoluteGravity, 758 - packedPositionType, (char) TextUtils.indexOf("", "", 0), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            super.onConsoleMessage(str, i, str2);
            return;
        }
        int i2 = f2364 + 21;
        f2362 = i2 % 128;
        if (i2 % 2 != 0) {
            webChromeClient.onConsoleMessage(str, i, str2);
        } else {
            webChromeClient.onConsoleMessage(str, i, str2);
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        f2364 = (f2362 + 27) % 128;
        try {
            this.f2367.onConsoleMessage(consoleMessage);
        } catch (Throwable th) {
            int longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Object[] objArr = new Object[1];
            a((longPressTimeout >> 16) + 24, ExpandableListView.getPackedPositionGroup(0L), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
            String intern = ((String) objArr[0]).intern();
            int maxKeyCode = KeyEvent.getMaxKeyCode();
            int pressedStateDuration = ViewConfiguration.getPressedStateDuration();
            Object[] objArr2 = new Object[1];
            a((maxKeyCode >> 16) + 37, 758 - (pressedStateDuration >> 16), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient != null) {
            return webChromeClient.onConsoleMessage(consoleMessage);
        }
        boolean onConsoleMessage = super.onConsoleMessage(consoleMessage);
        int i = f2364 + 99;
        f2362 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return onConsoleMessage;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        f2364 = (f2362 + 93) % 128;
        try {
            this.f2367.onCreateWindow(webView, z, z2, message);
        } catch (Throwable th) {
            int indexOf = TextUtils.indexOf("", "");
            int touchSlop = ViewConfiguration.getTouchSlop();
            Object[] objArr = new Object[1];
            a(indexOf + 24, touchSlop >> 8, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
            String intern = ((String) objArr[0]).intern();
            int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout();
            int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize();
            Object[] objArr2 = new Object[1];
            a((doubleTapTimeout >> 16) + 35, (maximumDrawingCacheSize >> 24) + IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 10114), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            boolean onCreateWindow = super.onCreateWindow(webView, z, z2, message);
            f2364 = (f2362 + 67) % 128;
            return onCreateWindow;
        }
        int i = f2364 + 125;
        f2362 = i % 128;
        if (i % 2 != 0) {
            return webChromeClient.onCreateWindow(webView, z, z2, message);
        }
        webChromeClient.onCreateWindow(webView, z, z2, message);
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        int i = f2364 + 65;
        f2362 = i % 128;
        try {
        } catch (Throwable th) {
            int indexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            Object[] objArr = new Object[1];
            a(23 - indexOf, Color.argb(0, 0, 0, 0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
            String intern = ((String) objArr[0]).intern();
            int indexOf2 = TextUtils.indexOf((CharSequence) "", '0');
            int longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Object[] objArr2 = new Object[1];
            a(43 - indexOf2, (longPressTimeout >> 16) + 484, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (i % 2 == 0) {
            this.f2367.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
            throw new ArithmeticException("divide by zero");
        }
        this.f2367.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
            return;
        }
        f2362 = (f2364 + 71) % 128;
        webChromeClient.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        f2364 = (f2362 + 41) % 128;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        f2362 = (f2364 + 121) % 128;
        try {
            this.f2367.onGeolocationPermissionsHidePrompt();
        } catch (Throwable th) {
            int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength();
            int longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Object[] objArr = new Object[1];
            a(24 - (fadingEdgeLength >> 16), longPressTimeout >> 16, (char) (Process.myTid() >> 22), objArr);
            String intern = ((String) objArr[0]).intern();
            int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity();
            long packedPositionForGroup = ExpandableListView.getPackedPositionForGroup(0);
            Object[] objArr2 = new Object[1];
            a((minimumFlingVelocity >> 16) + 55, (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)) + 583, (char) (KeyEvent.keyCodeFromString("") + 37853), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient != null) {
            webChromeClient.onGeolocationPermissionsHidePrompt();
            return;
        }
        super.onGeolocationPermissionsHidePrompt();
        int i = f2362 + 119;
        f2364 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        int i = f2362 + 99;
        f2364 = i % 128;
        try {
        } catch (Throwable th) {
            int resolveSize = View.resolveSize(0, 0);
            int myPid = Process.myPid();
            Object[] objArr = new Object[1];
            a(resolveSize + 24, myPid >> 22, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
            String intern = ((String) objArr[0]).intern();
            int size = View.MeasureSpec.getSize(0);
            int threadPriority = Process.getThreadPriority(0);
            Object[] objArr2 = new Object[1];
            a(size + 55, ((threadPriority + 20) >> 6) + 528, (char) TextUtils.indexOf("", "", 0, 0), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (i % 2 != 0) {
            this.f2367.onGeolocationPermissionsShowPrompt(str, callback);
            throw null;
        }
        this.f2367.onGeolocationPermissionsShowPrompt(str, callback);
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            super.onGeolocationPermissionsShowPrompt(str, callback);
        } else {
            webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
            f2362 = (f2364 + 103) % 128;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        f2362 = (f2364 + 9) % 128;
        try {
            this.f2367.onHideCustomView();
        } catch (Throwable th) {
            int alpha = Color.alpha(0);
            long packedPositionForGroup = ExpandableListView.getPackedPositionForGroup(0);
            Object[] objArr = new Object[1];
            a(alpha + 24, (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), (char) View.MeasureSpec.getMode(0), objArr);
            String intern = ((String) objArr[0]).intern();
            float complexToFraction = TypedValue.complexToFraction(0, 0.0f, 0.0f);
            int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity();
            Object[] objArr2 = new Object[1];
            a((complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)) + 37, (minimumFlingVelocity >> 16) + 213, (char) TextUtils.getCapsMode("", 0, 0), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            super.onHideCustomView();
            return;
        }
        int i = f2364 + 33;
        f2362 = i % 128;
        if (i % 2 != 0) {
            webChromeClient.onHideCustomView();
        } else {
            webChromeClient.onHideCustomView();
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        int i = f2362 + 79;
        f2364 = i % 128;
        try {
        } catch (Throwable th) {
            int deadChar = KeyEvent.getDeadChar(0, 0);
            Object[] objArr = new Object[1];
            a(deadChar + 24, ExpandableListView.getPackedPositionGroup(0L), (char) Color.alpha(0), objArr);
            String intern = ((String) objArr[0]).intern();
            int indexOf = TextUtils.indexOf((CharSequence) "", '0', 0);
            int size = View.MeasureSpec.getSize(0);
            Object[] objArr2 = new Object[1];
            a(29 - indexOf, 354 - size, (char) ((Process.myTid() >> 22) + 65215), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (i % 2 != 0) {
            this.f2367.onJsAlert(webView, str, str2, jsResult);
            throw new ArithmeticException("divide by zero");
        }
        this.f2367.onJsAlert(webView, str, str2, jsResult);
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            return super.onJsAlert(webView, str, str2, jsResult);
        }
        boolean onJsAlert = webChromeClient.onJsAlert(webView, str, str2, jsResult);
        f2364 = (f2362 + 125) % 128;
        return onJsAlert;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        int i = f2362 + 35;
        f2364 = i % 128;
        try {
        } catch (Throwable th) {
            int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize();
            Object[] objArr = new Object[1];
            a(24 - (maximumDrawingCacheSize >> 24), ExpandableListView.getPackedPositionType(0L), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr);
            String intern = ((String) objArr[0]).intern();
            int pressedStateDuration = ViewConfiguration.getPressedStateDuration();
            int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity();
            Object[] objArr2 = new Object[1];
            a(37 - (pressedStateDuration >> 16), (maximumFlingVelocity >> 16) + 447, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (i % 2 != 0) {
            this.f2367.onJsBeforeUnload(webView, str, str2, jsResult);
            throw null;
        }
        this.f2367.onJsBeforeUnload(webView, str, str2, jsResult);
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            return super.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        f2362 = (f2364 + 121) % 128;
        return webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        int i = f2362 + 25;
        f2364 = i % 128;
        try {
        } catch (Throwable th) {
            int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout();
            Object[] objArr = new Object[1];
            a(24 - (keyRepeatTimeout >> 16), Process.myTid() >> 22, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 32, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 383, (char) View.combineMeasuredStates(0, 0), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (i % 2 != 0) {
            this.f2367.onJsConfirm(webView, str, str2, jsResult);
            throw null;
        }
        this.f2367.onJsConfirm(webView, str, str2, jsResult);
        f2364 = (f2362 + 125) % 128;
        WebChromeClient webChromeClient = this.f2366;
        return webChromeClient != null ? webChromeClient.onJsConfirm(webView, str, str2, jsResult) : super.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        int i = f2364 + 105;
        f2362 = i % 128;
        try {
        } catch (Throwable th) {
            int resolveSize = View.resolveSize(0, 0);
            int lastIndexOf = TextUtils.lastIndexOf("", '0');
            Object[] objArr = new Object[1];
            a(resolveSize + 24, (-1) - lastIndexOf, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
            String intern = ((String) objArr[0]).intern();
            int normalizeMetaState = KeyEvent.normalizeMetaState(0);
            int touchSlop = ViewConfiguration.getTouchSlop();
            Object[] objArr2 = new Object[1];
            a(31 - normalizeMetaState, (touchSlop >> 8) + 416, (char) (ImageFormat.getBitsPerPixel(0) + 30616), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (i % 2 == 0) {
            this.f2367.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            throw new ArithmeticException("divide by zero");
        }
        this.f2367.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        f2362 = (f2364 + 71) % 128;
        boolean onJsPrompt = webChromeClient.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        f2362 = (f2364 + 47) % 128;
        return onJsPrompt;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public boolean onJsTimeout() {
        f2362 = (f2364 + 59) % 128;
        try {
            this.f2367.onJsTimeout();
            f2362 = (f2364 + 125) % 128;
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a(24 - TextUtils.getOffsetAfter("", 0), 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31, 727 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (47196 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2366;
        return webChromeClient != null ? webChromeClient.onJsTimeout() : super.onJsTimeout();
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        int i = f2364 + 73;
        f2362 = i % 128;
        try {
        } catch (Throwable th) {
            long elapsedCpuTime = Process.getElapsedCpuTime();
            float minVolume = AudioTrack.getMinVolume();
            Object[] objArr = new Object[1];
            a((elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)) + 23, (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
            String intern = ((String) objArr[0]).intern();
            float complexToFraction = TypedValue.complexToFraction(0, 0.0f, 0.0f);
            int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity();
            Object[] objArr2 = new Object[1];
            a(40 - (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)), (maximumFlingVelocity >> 16) + 638, (char) TextUtils.indexOf("", "", 0, 0), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (i % 2 == 0) {
            this.f2367.onPermissionRequest(permissionRequest);
            throw null;
        }
        this.f2367.onPermissionRequest(permissionRequest);
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            super.onPermissionRequest(permissionRequest);
            return;
        }
        int i2 = f2364 + 87;
        f2362 = i2 % 128;
        if (i2 % 2 == 0) {
            webChromeClient.onPermissionRequest(permissionRequest);
            throw new ArithmeticException("divide by zero");
        }
        webChromeClient.onPermissionRequest(permissionRequest);
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        try {
            this.f2367.onPermissionRequestCanceled(permissionRequest);
            f2364 = (f2362 + 53) % 128;
        } catch (Throwable th) {
            int offsetAfter = TextUtils.getOffsetAfter("", 0);
            int edgeSlop = ViewConfiguration.getEdgeSlop();
            Object[] objArr = new Object[1];
            a(offsetAfter + 24, edgeSlop >> 16, (char) TextUtils.getTrimmedLength(""), objArr);
            String intern = ((String) objArr[0]).intern();
            int indexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
            Object[] objArr2 = new Object[1];
            a(indexOf + 49, 679 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            super.onPermissionRequestCanceled(permissionRequest);
            return;
        }
        int i = f2362 + 89;
        f2364 = i % 128;
        if (i % 2 != 0) {
            webChromeClient.onPermissionRequestCanceled(permissionRequest);
            throw new ArithmeticException("divide by zero");
        }
        webChromeClient.onPermissionRequestCanceled(permissionRequest);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        f2362 = (f2364 + 27) % 128;
        try {
            this.f2367.onProgressChanged(webView, i);
        } catch (Throwable th) {
            char mirror = AndroidCharacter.getMirror('0');
            Object[] objArr = new Object[1];
            a('H' - mirror, TextUtils.getOffsetAfter("", 0), (char) ((-16777216) - Color.rgb(0, 0, 0)), objArr);
            String intern = ((String) objArr[0]).intern();
            int size = View.MeasureSpec.getSize(0);
            long packedPositionForGroup = ExpandableListView.getPackedPositionForGroup(0);
            Object[] objArr2 = new Object[1];
            a(size + 38, 24 - (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), (char) (26123 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            super.onProgressChanged(webView, i);
            int i2 = f2364 + 121;
            f2362 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i3 = f2364 + 73;
        f2362 = i3 % 128;
        if (i3 % 2 != 0) {
            webChromeClient.onProgressChanged(webView, i);
        } else {
            webChromeClient.onProgressChanged(webView, i);
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        try {
            this.f2367.onReceivedIcon(webView, bitmap);
        } catch (Throwable th) {
            int green = Color.green(0);
            int axisFromString = MotionEvent.axisFromString("");
            Object[] objArr = new Object[1];
            a(24 - green, axisFromString + 1, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), objArr);
            String intern = ((String) objArr[0]).intern();
            int pressedStateDuration = ViewConfiguration.getPressedStateDuration();
            int threadPriority = Process.getThreadPriority(0);
            Object[] objArr2 = new Object[1];
            a(35 - (pressedStateDuration >> 16), ((threadPriority + 20) >> 6) + 98, (char) (5410 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            super.onReceivedIcon(webView, bitmap);
            return;
        }
        int i = f2362 + 59;
        f2364 = i % 128;
        if (i % 2 != 0) {
            webChromeClient.onReceivedIcon(webView, bitmap);
            throw null;
        }
        webChromeClient.onReceivedIcon(webView, bitmap);
        int i2 = f2362 + 63;
        f2364 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        try {
            this.f2367.onReceivedTitle(webView, str);
            f2364 = (f2362 + 21) % 128;
        } catch (Throwable th) {
            float minVolume = AudioTrack.getMinVolume();
            Object[] objArr = new Object[1];
            a(24 - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0), (char) TextUtils.indexOf("", ""), objArr);
            String intern = ((String) objArr[0]).intern();
            int lastIndexOf = TextUtils.lastIndexOf("", '0');
            int pressedStateDuration = ViewConfiguration.getPressedStateDuration();
            Object[] objArr2 = new Object[1];
            a(lastIndexOf + 37, 62 - (pressedStateDuration >> 16), (char) (26397 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            super.onReceivedTitle(webView, str);
            return;
        }
        int i = f2364 + 81;
        f2362 = i % 128;
        if (i % 2 != 0) {
            webChromeClient.onReceivedTitle(webView, str);
        } else {
            webChromeClient.onReceivedTitle(webView, str);
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        int i = f2362 + 5;
        f2364 = i % 128;
        try {
        } catch (Throwable th) {
            int capsMode = TextUtils.getCapsMode("", 0, 0);
            Object[] objArr = new Object[1];
            a(capsMode + 24, KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            String intern = ((String) objArr[0]).intern();
            long packedPositionForGroup = ExpandableListView.getPackedPositionForGroup(0);
            int windowTouchSlop = ViewConfiguration.getWindowTouchSlop();
            Object[] objArr2 = new Object[1];
            a(43 - (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), 133 - (windowTouchSlop >> 8), (char) (31168 - View.getDefaultSize(0, 0)), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (i % 2 != 0) {
            this.f2367.onReceivedTouchIconUrl(webView, str, z);
            throw null;
        }
        this.f2367.onReceivedTouchIconUrl(webView, str, z);
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            super.onReceivedTouchIconUrl(webView, str, z);
        } else {
            f2362 = (f2364 + 87) % 128;
            webChromeClient.onReceivedTouchIconUrl(webView, str, z);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onRequestFocus(WebView webView) {
        f2364 = (f2362 + 113) % 128;
        try {
            this.f2367.onRequestFocus(webView);
        } catch (Throwable th) {
            int maxKeyCode = KeyEvent.getMaxKeyCode();
            Object[] objArr = new Object[1];
            a(24 - (maxKeyCode >> 16), Color.blue(0), (char) Color.red(0), objArr);
            String intern = ((String) objArr[0]).intern();
            int indexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int resolveSize = View.resolveSize(0, 0);
            Object[] objArr2 = new Object[1];
            a(34 - indexOf, resolveSize + 285, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 62315), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            super.onRequestFocus(webView);
        } else {
            f2364 = (f2362 + 31) % 128;
            webChromeClient.onRequestFocus(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        f2362 = (f2364 + 99) % 128;
        try {
            this.f2367.onShowCustomView(view, i, customViewCallback);
        } catch (Throwable th) {
            long packedPositionForChild = ExpandableListView.getPackedPositionForChild(0, 0);
            Object[] objArr = new Object[1];
            a(23 - (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), objArr);
            String intern = ((String) objArr[0]).intern();
            int argb = Color.argb(0, 0, 0, 0);
            int myPid = Process.myPid();
            Object[] objArr2 = new Object[1];
            a(argb + 37, 176 - (myPid >> 22), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29955), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            super.onShowCustomView(view, i, customViewCallback);
            return;
        }
        int i2 = f2364 + 3;
        f2362 = i2 % 128;
        if (i2 % 2 != 0) {
            webChromeClient.onShowCustomView(view, i, customViewCallback);
        } else {
            webChromeClient.onShowCustomView(view, i, customViewCallback);
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        try {
            this.f2367.onShowCustomView(view, customViewCallback);
        } catch (Throwable th) {
            int threadPriority = Process.getThreadPriority(0);
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
            Object[] objArr = new Object[1];
            a(((threadPriority + 20) >> 6) + 24, (-1) - bitsPerPixel, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            String intern = ((String) objArr[0]).intern();
            int alpha = Color.alpha(0);
            int normalizeMetaState = KeyEvent.normalizeMetaState(0);
            Object[] objArr2 = new Object[1];
            a(37 - alpha, 176 - normalizeMetaState, (char) (29956 - Color.blue(0)), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            super.onShowCustomView(view, customViewCallback);
            return;
        }
        f2364 = (f2362 + 33) % 128;
        webChromeClient.onShowCustomView(view, customViewCallback);
        f2364 = (f2362 + 25) % 128;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        f2362 = (f2364 + 9) % 128;
        try {
            this.f2367.onShowFileChooser(webView, valueCallback, fileChooserParams);
        } catch (Throwable th) {
            int size = View.MeasureSpec.getSize(0);
            int rgb = Color.rgb(0, 0, 0);
            Object[] objArr = new Object[1];
            a(24 - size, rgb + 16777216, (char) (ViewConfiguration.getTouchSlop() >> 8), objArr);
            String intern = ((String) objArr[0]).intern();
            int packedPositionType = ExpandableListView.getPackedPositionType(0L);
            int keyCodeFromString = KeyEvent.keyCodeFromString("");
            Object[] objArr2 = new Object[1];
            a(packedPositionType + 38, keyCodeFromString + 923, (char) (KeyEvent.getMaxKeyCode() >> 16), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2366;
        if (webChromeClient == null) {
            return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        f2364 = (f2362 + 57) % 128;
        return webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.cn
    /* renamed from: ﻐ */
    public final Object mo3719(String str, List<Object> list, cp cpVar) {
        int i = f2362 + 39;
        f2364 = i % 128;
        if (i % 2 != 0) {
            str.hashCode();
            throw null;
        }
        int hashCode = str.hashCode();
        boolean z = -1;
        if (hashCode == 1395849045) {
            Object[] objArr = new Object[1];
            a(19 - TextUtils.indexOf((CharSequence) "", '0', 0), Gravity.getAbsoluteGravity(0, 0) + 986, (char) (50838 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr);
            if (str.equals(((String) objArr[0]).intern())) {
                z = true;
            }
        } else if (hashCode == 1442029578) {
            Object[] objArr2 = new Object[1];
            a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24, 961 - TextUtils.indexOf("", "", 0), (char) (TextUtils.lastIndexOf("", '0') + 1), objArr2);
            if (str.equals(((String) objArr2[0]).intern())) {
                f2364 = (f2362 + 41) % 128;
                z = false;
            }
        }
        if (!z) {
            return cM_();
        }
        if (z) {
            return m5113();
        }
        f2362 = (f2364 + 49) % 128;
        return null;
    }
}
