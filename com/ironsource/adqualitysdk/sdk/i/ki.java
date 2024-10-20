package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: ki.class */
public final class ki {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f3020 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f3021 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f3022;

    /* loaded from: ki$b.class */
    public interface b<T> {
        /* renamed from: ﾇ */
        T mo3434(JSONObject jSONObject, String str);
    }

    /* loaded from: ki$c.class */
    public interface c<T> {
        /* renamed from: ﾒ */
        T mo3435(JSONArray jSONArray, int i);
    }

    static {
        m5724();
        View.getDefaultSize(0, 0);
        f3020 = (f3021 + 101) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x01bb, code lost:
    
        r0[r0] = (char) r0[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c5, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.b.f452;
        r0 = r0.get(-453221336);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d8, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01db, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x021d, code lost:
    
        ((java.lang.reflect.Method) r9).invoke(null, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x023d, code lost:
    
        throw new java.lang.ArithmeticException("divide by zero");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e0, code lost:
    
        r9 = ((java.lang.Class) com.ironsource.adqualitysdk.sdk.i.b.m3371(android.view.ViewConfiguration.getPressedStateDuration() >> 16, (char) android.widget.ExpandableListView.getPackedPositionType(0), 'Y' - android.text.AndroidCharacter.getMirror('0'))).getMethod("F", java.lang.Object.class, java.lang.Object.class);
        r0.put(-453221336, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r9, int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ki.a(java.lang.String, int, java.lang.Object[]):void");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Map<String, String> m5712(JSONObject jSONObject) {
        Map<String, String> map = (Map) m5721(new Object[]{jSONObject, new b() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.3
            @Override // com.ironsource.adqualitysdk.sdk.i.ki.b
            /* renamed from: ﾇ */
            public final /* synthetic */ Object mo3434(JSONObject jSONObject2, String str) {
                return jSONObject2.optString(str, null);
            }
        }}, -1952640495, 1952640497, (int) System.currentTimeMillis());
        f3020 = (f3021 + 17) % 128;
        return map;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static List<String> m5713(JSONObject jSONObject, String str, List<String> list) {
        return (List) m5721(new Object[]{jSONObject, str, list}, 1333401136, -1333401136, (int) System.currentTimeMillis());
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static JSONObject m5714(int i, int i2, long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (j > -1) {
                f3020 = (f3021 + 23) % 128;
                Object[] objArr = new Object[1];
                a("䊰", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1008, objArr);
                jSONObject.put(((String) objArr[0]).intern(), i);
                Object[] objArr2 = new Object[1];
                a("䊱", 6247 - TextUtils.getOffsetBefore("", 0), objArr2);
                jSONObject.put(((String) objArr2[0]).intern(), i2);
                Object[] objArr3 = new Object[1];
                a("䊼", 24203 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
                jSONObject.put(((String) objArr3[0]).intern(), j);
                Object[] objArr4 = new Object[1];
                a("䊽", 50020 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr4);
                jSONObject.put(((String) objArr4[0]).intern(), j2);
            } else {
                Object[] objArr5 = new Object[1];
                a("䊰", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1008, objArr5);
                jSONObject.put(((String) objArr5[0]).intern(), -1);
                Object[] objArr6 = new Object[1];
                a("䊱", 6247 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr6);
                jSONObject.put(((String) objArr6[0]).intern(), -1);
                Object[] objArr7 = new Object[1];
                a("䊼", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24203, objArr7);
                jSONObject.put(((String) objArr7[0]).intern(), -1);
                Object[] objArr8 = new Object[1];
                a("䊽", ExpandableListView.getPackedPositionGroup(0L) + 50021, objArr8);
                jSONObject.put(((String) objArr8[0]).intern(), -1);
            }
        } catch (JSONException e) {
            Object[] objArr9 = new Object[1];
            a("䊂⫸鉁箯\ue311䭓ン頑ƣ", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26723, objArr9);
            String intern = ((String) objArr9[0]).intern();
            Object[] objArr10 = new Object[1];
            a("䊍욫䪘캔勾횽嫍�戥\ue630樖\uee1a牪\uf672稆﹛ι螚எ迟Ᏻ韘ᯝ鼧⍰꜋⬁꽬㍺", (ViewConfiguration.getJumpTapTimeout() >> 16) + 33809, objArr10);
            v.m5760(intern, ((String) objArr10[0]).intern(), e);
        }
        f3021 = (f3020 + 59) % 128;
        return jSONObject;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static JSONObject m5715(JSONObject jSONObject) {
        f3020 = (f3021 + 109) % 128;
        return m5723(jSONObject, false);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m5716(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        int i = f3021;
        f3020 = (i + 27) % 128;
        if (jSONObject != null) {
            f3020 = (i + 41) % 128;
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (!(!keys.hasNext())) {
                    String next = keys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException e) {
                    }
                }
                if (!z) {
                    return;
                }
                int i2 = f3021 + 117;
                f3020 = i2 % 128;
                if (i2 % 2 == 0) {
                    jSONObject.remove(ig.f2574);
                } else {
                    jSONObject.remove(ig.f2574);
                    throw null;
                }
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static <T> List<T> m5717(JSONArray jSONArray) {
        List<T> m5718 = m5718(jSONArray, new c() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.5
            /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
            @Override // com.ironsource.adqualitysdk.sdk.i.ki.c
            /* renamed from: ﾒ */
            public final T mo3435(JSONArray jSONArray2, int i) {
                return jSONArray2.opt(i);
            }
        });
        f3020 = (f3021 + 45) % 128;
        return m5718;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static <T> List<T> m5718(JSONArray jSONArray, c<T> cVar) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            int i2 = f3021 + 3;
            f3020 = i2 % 128;
            if (i2 % 2 != 0) {
                cVar.mo3435(jSONArray, i);
                throw new ArithmeticException("divide by zero");
            }
            T mo3435 = cVar.mo3435(jSONArray, i);
            if (mo3435 != null) {
                arrayList.add(mo3435);
            }
        }
        f3020 = (f3021 + 103) % 128;
        return arrayList;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m5719(JSONObject jSONObject, String str, int i) {
        f3021 = (f3020 + 93) % 128;
        String str2 = (String) m5721(new Object[]{jSONObject.opt(str), Integer.valueOf(i)}, -673616654, 673616655, i);
        if (str2 != null) {
            String str3 = str2;
            if (str2.equals("")) {
                int i2 = f3020 + 61;
                f3021 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw new ArithmeticException("divide by zero");
                }
                str3 = null;
            }
            jSONObject.put(str, str3);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m5720(JSONObject jSONObject, JSONObject jSONObject2) {
        f3020 = (f3021 + 61) % 128;
        m5716(jSONObject, jSONObject2, false);
        int i = f3021 + 119;
        f3020 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.util.List] */
    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Object m5721(Object[] objArr, int i, int i2, int i3) {
        HashMap hashMap;
        int i4 = i2 ^ (-1);
        int i5 = (i | i3) ^ (-1);
        int i6 = i ^ (-1);
        int i7 = (i6 | i2) ^ (-1);
        int i8 = (i * (-813)) + (i2 * 408) + ((((i4 | i) ^ (-1)) | i5) * (-814)) + ((((i4 | (i3 ^ (-1))) ^ (-1)) | i7 | i5) * 407) + ((((i6 | i3) ^ (-1)) | i7 | ((i2 | i3) ^ (-1))) * 407);
        if (i8 == 1) {
            Object obj = objArr[0];
            int intValue = ((Number) objArr[1]).intValue();
            if (obj instanceof JSONObject) {
                m5727((JSONObject) obj, intValue);
                hashMap = null;
            } else if (obj instanceof JSONArray) {
                f3021 = (f3020 + 117) % 128;
                m5725((JSONArray) obj, intValue);
                hashMap = null;
            } else {
                hashMap = null;
                if (obj instanceof String) {
                    ?? r0 = (String) obj;
                    hashMap = r0;
                    if (r0.length() > intValue) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(r0.substring(0, intValue));
                        Object[] objArr2 = new Object[1];
                        a("䋦\ue6b1ੈ꿥폠眉颷㳇怓薦⧚䴐\uf6b8\u1a8a", 42071 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
                        sb.append(((String) objArr2[0]).intern());
                        hashMap = sb.toString();
                        f3020 = (f3021 + 49) % 128;
                    }
                }
            }
        } else if (i8 != 2) {
            JSONObject jSONObject = (JSONObject) objArr[0];
            String str = (String) objArr[1];
            hashMap = (List) objArr[2];
            f3020 = (f3021 + 23) % 128;
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray == null) {
                f3020 = (f3021 + 75) % 128;
            } else {
                hashMap = m5729(optJSONArray);
            }
        } else {
            JSONObject jSONObject2 = (JSONObject) objArr[0];
            b bVar = (b) objArr[1];
            f3021 = (f3020 + 47) % 128;
            hashMap = null;
            if (jSONObject2 != null) {
                hashMap = new HashMap();
                Iterator<String> keys = jSONObject2.keys();
                while (!(!keys.hasNext())) {
                    f3020 = (f3021 + 83) % 128;
                    String next = keys.next();
                    hashMap.put(next, bVar.mo3434(jSONObject2, next));
                }
            }
        }
        return hashMap;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static <T> Map<String, T> m5722(JSONObject jSONObject, b<T> bVar) {
        return (Map) m5721(new Object[]{jSONObject, bVar}, -1952640495, 1952640497, (int) System.currentTimeMillis());
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static JSONObject m5723(JSONObject jSONObject, boolean z) {
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (z) {
                    jSONObject2.remove(ig.f2574);
                    f3020 = (f3021 + 23) % 128;
                }
                int i = f3020 + 43;
                f3021 = i % 128;
                if (i % 2 != 0) {
                    return jSONObject2;
                }
                throw null;
            } catch (JSONException e) {
            }
        }
        return new JSONObject();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static void m5724() {
        f3022 = 8877848444935397670L;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m5725(JSONArray jSONArray, int i) {
        int i2 = f3020;
        f3021 = (i2 + 95) % 128;
        f3021 = (i2 + 125) % 128;
        int i3 = 0;
        while (i3 < jSONArray.length()) {
            m5726(jSONArray, i3, i);
            i3++;
            f3021 = (f3020 + 57) % 128;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m5726(JSONArray jSONArray, int i, int i2) {
        f3021 = (f3020 + 15) % 128;
        String str = (String) m5721(new Object[]{jSONArray.opt(i), Integer.valueOf(i2)}, -673616654, 673616655, i2);
        if (str != null) {
            jSONArray.put(i, str);
            f3021 = (f3020 + 31) % 128;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m5727(JSONObject jSONObject, int i) {
        int i2 = f3020 + 115;
        f3021 = i2 % 128;
        m5728(jSONObject, i, (List<String>) null);
        if (i2 % 2 == 0) {
            throw null;
        }
        f3020 = (f3021 + 99) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        r6.contains(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        throw new java.lang.ArithmeticException("divide by zero");
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m5728(org.json.JSONObject r4, int r5, java.util.List<java.lang.String> r6) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ki.m5728(org.json.JSONObject, int, java.util.List):void");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static List<String> m5729(JSONArray jSONArray) {
        if (jSONArray != null) {
            List<String> m5717 = m5717(jSONArray);
            f3021 = (f3020 + 31) % 128;
            return m5717;
        }
        int i = (f3021 + 67) % 128;
        f3020 = i;
        int i2 = i + 109;
        f3021 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return null;
    }
}
