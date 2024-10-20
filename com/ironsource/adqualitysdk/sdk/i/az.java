package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
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
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: az.class */
public final class az {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: 爫, reason: contains not printable characters */
    private static int f428 = 0;

    /* renamed from: ﬤ, reason: contains not printable characters */
    private static long f429 = 0;

    /* renamed from: סּ, reason: contains not printable characters */
    private static int f430 = 1;

    /* renamed from: ףּ, reason: contains not printable characters */
    private static char[] f431;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static long f432;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private JSONObject f433;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private JSONObject f434;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private final String f435;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private final String f436;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private final String f437;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private final String f438;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private final String f439;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private final String f440;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private final String f441;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final List f442;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final int f443;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final List f444;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final List f445;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final int f446;

    static {
        m3354();
        ViewConfiguration.getZoomControlsTimeout();
        ViewConfiguration.getTouchSlop();
        KeyEvent.getDeadChar(0, 0);
        ViewConfiguration.getMaximumDrawingCacheSize();
        SystemClock.currentThreadTimeMillis();
        View.resolveSize(0, 0);
        Color.rgb(0, 0, 0);
        int i = f430 + 123;
        f428 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public az() {
        Object[] objArr = new Object[1];
        a("\ue44a�鏒坦\u0b64캰芏䛖㨞﹣놣疾⧚\ued03ꅑ撺声᰷퀘鐖", (KeyEvent.getMaxKeyCode() >> 16) + 15307, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b((ViewConfiguration.getTouchSlop() >> 8) + 15, 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (18835 - (KeyEvent.getMaxKeyCode() >> 16)), objArr2);
        this.f445 = Arrays.asList(intern, ((String) objArr2[0]).intern(), "");
        this.f443 = 7;
        this.f444 = new ArrayList();
        this.f446 = 2;
        Object[] objArr3 = new Object[1];
        a("\ue44a㠗峦烴锄꧒춢\ue271ۃ媙缭錠란푚\ue823ೳ⅋䔡駵빍퉓\uf6c5\u0ab1⼣䏞枢葺�ﲑᅅ㔴䦒湠舮Ꚃפֿἴ", View.MeasureSpec.getSize(0) + 56401, objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b(41 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 15, (char) (TextUtils.getOffsetAfter("", 0) + 33153), objArr4);
        String intern3 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        b(44 - View.MeasureSpec.makeMeasureSpec(0, 0), 56 - View.combineMeasuredStates(0, 0), (char) ExpandableListView.getPackedPositionType(0L), objArr5);
        String intern4 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a("\ue440⒩旙Ꚕ\ue7e7⃧懀ꋁ\ue336Ⱛ浑긅\uef73⡾楞\uaa5a\ueaaa⮂璎뗠\uf6ec㟓烏녾\uf234㌗籁뵕﹣㽎硎뢪了㪒篾蓰엜ۃ䜿老섒Ț䍶豺쵔\u0e5e亢", 49391 - ExpandableListView.getPackedPositionGroup(0L), objArr6);
        List<String> asList = Arrays.asList(intern2, intern3, intern4, ((String) objArr6[0]).intern());
        this.f442 = asList;
        Object[] objArr7 = new Object[1];
        a("\ue45e픾蚛", View.MeasureSpec.makeMeasureSpec(0, 0) + 12641, objArr7);
        this.f441 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a("\ue45e卶計섶", (KeyEvent.getMaxKeyCode() >> 16) + 46889, objArr8);
        this.f438 = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        b(3 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), AndroidCharacter.getMirror('0') + '4', (char) ((-16777216) - Color.rgb(0, 0, 0)), objArr9);
        this.f437 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        a("\ue440㾡厌瞌", 56300 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr10);
        this.f439 = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        a("\ue44f煘칛", 38149 - View.getDefaultSize(0, 0), objArr11);
        this.f440 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        b(3 - Color.green(0), 103 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 802), objArr12);
        this.f436 = ((String) objArr12[0]).intern();
        Object[] objArr13 = new Object[1];
        a("\ue440彁鉋핆", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 47881, objArr13);
        this.f435 = ((String) objArr13[0]).intern();
        this.f433 = new JSONObject();
        this.f434 = new JSONObject();
        try {
            for (String str : asList) {
                JSONObject jSONObject = this.f434;
                Object[] objArr14 = new Object[1];
                b(3 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (Process.myPid() >> 22) + 106, (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr14);
                jSONObject.put(str, ((String) objArr14[0]).intern());
            }
        } catch (JSONException e) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x02b8, code lost:
    
        r0[r0] = (char) r0[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02c2, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.b.f452;
        r9 = r0.get(-453221336);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02d4, code lost:
    
        if (r9 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02da, code lost:
    
        r9 = ((java.lang.Class) com.ironsource.adqualitysdk.sdk.i.b.m3371((-1) - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 40 - android.os.Process.getGidForName(""))).getMethod("F", java.lang.Object.class, java.lang.Object.class);
        r0.put(-453221336, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0319, code lost:
    
        ((java.lang.reflect.Method) r9).invoke(null, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0339, code lost:
    
        throw new java.lang.ArithmeticException("divide by zero");
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r9, int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.az.a(java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0205, code lost:
    
        r0[r0] = (char) r0[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x020f, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.b.f452;
        r11 = r0.get(518145355);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0223, code lost:
    
        if (r11 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0229, code lost:
    
        r11 = ((java.lang.Class) com.ironsource.adqualitysdk.sdk.i.b.m3371(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 40)).getMethod("i", java.lang.Object.class, java.lang.Object.class);
        r0.put(518145355, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x026a, code lost:
    
        ((java.lang.reflect.Method) r11).invoke(null, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0281, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0317  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(int r8, int r9, char r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.az.b(int, int, char, java.lang.Object[]):void");
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    static void m3354() {
        f432 = -2207429632426358841L;
        f431 = new char[]{17624, 55786, 32423, 37756, 12322, 22241, 60339, 2108, 44326, 50169, 24761, 34125, 6668, 47316, 56769, 36040, 4601, 46780, 23346, 63542, 40692, 9128, 49263, 25889, 3047, 43239, 19797, 53779, 28865, 5587, 47690, 24350, 64968, 33413, 10057, 50205, 27331, 4091, 44215, 12605, 54807, 29943, 6537, 48744, 17184, 57828, 34441, 11119, 51255, 28370, 62344, 36950, 13580, 56268, 30868, 7514, 3395, 36984, 14206, 56045, 31148, 8062, 41527, 16864, 58533, 35434, 10598, 52444, 21400, 61767, 37913, 15307, 56969, 31827, 777, 42713, 17799, 60234, 36472, 11647, 45275, 22449, 62828, 38944, 16372, 49840, 24696, 1824, 43774, 18846, 61265, 29201, 4607, 46232, 23120, 63752, 40148, 9094, 49500, 25708, 3395, 36980, 14112, 3692, 37696, 13323, 3416, 36987, 53163, 21136, 62916, 6155, 47950, 56716, 24784, 33559, 9820, 3357, 36921, 14176, 3403, 36963, 14140, 19489, 53516, 30297, 39825};
        f429 = 6945065246731505687L;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m3355(az azVar, String str) {
        f430 = (f428 + 59) % 128;
        azVar.m3356(str);
        f430 = (f428 + 119) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m3356(String str) {
        int i = f430 + 113;
        f428 = i % 128;
        if (i % 2 != 0) {
            TextUtils.isEmpty(str);
            throw new ArithmeticException("divide by zero");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f433 = new JSONObject(str);
            int i2 = f430 + 87;
            f428 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (JSONException e) {
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static /* synthetic */ Object m3357(Object[] objArr) {
        az azVar = (az) objArr[0];
        f428 = (f430 + 123) % 128;
        JSONObject jSONObject = azVar.f433;
        Object[] objArr2 = new Object[1];
        a("\ue44a밑哱\uecb2", 22613 - View.getDefaultSize(0, 0), objArr2);
        int optInt = jSONObject.optInt(((String) objArr2[0]).intern(), AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
        int i = f428 + 105;
        f430 = i % 128;
        if (i % 2 != 0) {
            return Integer.valueOf(optInt);
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Object m3358(Object[] objArr, int i, int i2, int i3) {
        Object valueOf;
        int i4 = i2 ^ (-1);
        int i5 = i3 ^ (-1);
        if ((i * 50) + (i2 * (-97)) + ((((i4 | i5) ^ (-1)) | ((i4 | i) ^ (-1))) * 98) + ((((i5 | (i ^ (-1))) ^ (-1)) | i4 | ((i | i3) ^ (-1))) * (-49)) + ((((i | i2) ^ (-1)) | ((i3 | i4) ^ (-1))) * 49) != 1) {
            valueOf = m3357(objArr);
        } else {
            az azVar = (az) objArr[0];
            f430 = (f428 + 79) % 128;
            JSONObject jSONObject = azVar.f433;
            Object[] objArr2 = new Object[1];
            a("\ue45e卶計섶", 46889 - KeyEvent.normalizeMetaState(0), objArr2);
            int optInt = jSONObject.optInt(((String) objArr2[0]).intern(), 7);
            f428 = (f430 + 83) % 128;
            valueOf = Integer.valueOf(optInt);
        }
        return valueOf;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final List<String> m3359() {
        JSONObject jSONObject = this.f433;
        Object[] objArr = new Object[1];
        b(TextUtils.indexOf((CharSequence) "", '0', 0) + 4, Color.alpha(0) + 103, (char) (803 - Color.argb(0, 0, 0, 0)), objArr);
        List<String> list = (List) ki.m5721(new Object[]{jSONObject, ((String) objArr[0]).intern(), new ArrayList()}, 1333401136, -1333401136, (int) System.currentTimeMillis());
        int i = f428 + 93;
        f430 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return list;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final JSONObject m3360() {
        f428 = (f430 + 51) % 128;
        JSONObject jSONObject = this.f433;
        int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize();
        int myPid = Process.myPid();
        Object[] objArr = new Object[1];
        b((maximumDrawingCacheSize >> 24) + 4, (myPid >> 22) + 123, (char) (16751 - (ViewConfiguration.getFadingEdgeLength() >> 16)), objArr);
        JSONObject optJSONObject = jSONObject.optJSONObject(((String) objArr[0]).intern());
        JSONObject jSONObject2 = optJSONObject;
        if (optJSONObject == null) {
            int i = f430 + 13;
            f428 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            jSONObject2 = this.f434;
        }
        return jSONObject2;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final String m3361() {
        f428 = (f430 + 65) % 128;
        JSONObject jSONObject = this.f433;
        Object[] objArr = new Object[1];
        a("\ue44d醸྇藲", 30181 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        String intern = ((String) objArr[0]).intern();
        int gidForName = Process.getGidForName("");
        int trimmedLength = TextUtils.getTrimmedLength("");
        Object[] objArr2 = new Object[1];
        b(gidForName + 4, trimmedLength + 120, (char) Color.blue(0), objArr2);
        String optString = jSONObject.optString(intern, ((String) objArr2[0]).intern());
        f428 = (f430 + 21) % 128;
        return optString;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int m3362() {
        f430 = (f428 + 47) % 128;
        JSONObject jSONObject = this.f433;
        Object[] objArr = new Object[1];
        a("\ue440㾡厌瞌", 56299 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        int optInt = jSONObject.optInt(((String) objArr[0]).intern(), 2);
        f428 = (f430 + 101) % 128;
        return optInt;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m3363() {
        JSONObject jSONObject = this.f433;
        Object[] objArr = new Object[1];
        a("\ue44f煘칛", 38149 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        List<String> list = (List) ki.m5721(new Object[]{jSONObject, ((String) objArr[0]).intern(), new ArrayList()}, 1333401136, -1333401136, (int) System.currentTimeMillis());
        f430 = (f428 + 83) % 128;
        return list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final List m3364() {
        f430 = (f428 + 111) % 128;
        JSONObject jSONObject = this.f433;
        Object[] objArr = new Object[1];
        a("\ue45e픾蚛", 12641 - Gravity.getAbsoluteGravity(0, 0), objArr);
        List list = (List) ki.m5721(new Object[]{jSONObject, ((String) objArr[0]).intern(), this.f445}, 1333401136, -1333401136, (int) System.currentTimeMillis());
        int i = f430 + 109;
        f428 = i % 128;
        if (i % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m3365(ix ixVar) {
        int green = Color.green(0);
        int axisFromString = MotionEvent.axisFromString("");
        Object[] objArr = new Object[1];
        b(9 - green, 107 - axisFromString, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49908), objArr);
        String intern = ((String) objArr[0]).intern();
        int size = View.MeasureSpec.getSize(0);
        long packedPositionForGroup = ExpandableListView.getPackedPositionForGroup(0);
        Object[] objArr2 = new Object[1];
        b(3 - size, 117 - (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), (char) View.combineMeasuredStates(0, 0), objArr2);
        m3356(ixVar.m5404(intern, ((String) objArr2[0]).intern(), new io(this) { // from class: com.ironsource.adqualitysdk.sdk.i.az.1

            /* renamed from: ﻛ, reason: contains not printable characters */
            private az f447;

            {
                this.f447 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.io
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final void mo3367(String str) {
                az.m3355(this.f447, str);
            }
        }));
        int i = f430 + 65;
        f428 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final List m3366() {
        Object m5721;
        int i = f428 + 25;
        f430 = i % 128;
        if (i % 2 == 0) {
            JSONObject jSONObject = this.f433;
            Object[] objArr = new Object[1];
            b(3 >> (AudioTrack.getMaxVolume() > 1.0f ? 1 : (AudioTrack.getMaxVolume() == 1.0f ? 0 : -1)), 104 - TextUtils.lastIndexOf("", 'H'), (char) (16777216 - Color.rgb(1, 1, 0)), objArr);
            m5721 = ki.m5721(new Object[]{jSONObject, ((String) objArr[0]).intern(), this.f444}, 1333401136, -1333401136, (int) System.currentTimeMillis());
        } else {
            JSONObject jSONObject2 = this.f433;
            Object[] objArr2 = new Object[1];
            b((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2, 99 - TextUtils.lastIndexOf("", '0'), (char) (Color.rgb(0, 0, 0) + 16777216), objArr2);
            m5721 = ki.m5721(new Object[]{jSONObject2, ((String) objArr2[0]).intern(), this.f444}, 1333401136, -1333401136, (int) System.currentTimeMillis());
        }
        List list = (List) m5721;
        int i2 = f428 + 43;
        f430 = i2 % 128;
        if (i2 % 2 != 0) {
            return list;
        }
        throw null;
    }
}
