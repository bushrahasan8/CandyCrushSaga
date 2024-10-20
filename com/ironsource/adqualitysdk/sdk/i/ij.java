package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: ij.class */
public final class ij {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f2595 = 1;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f2596;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2597;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static final Object f2598;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static long f2599;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static ij f2600;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private final Handler f2601;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final Context f2604;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean f2605 = true;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final HashMap f2606 = new HashMap();

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final HashMap f2603 = new HashMap();

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final ArrayList f2602 = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: ij$c.class */
    public static abstract class c {
    }

    static {
        m5359();
        ViewConfiguration.getKeyRepeatTimeout();
        Process.getThreadPriority(0);
        View.MeasureSpec.getMode(0);
        f2598 = new Object();
        int i = f2595 + 79;
        f2596 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private ij(Context context) {
        this.f2604 = context;
        this.f2601 = new Handler(this, context.getMainLooper()) { // from class: com.ironsource.adqualitysdk.sdk.i.ij.3

            /* renamed from: ｋ, reason: contains not printable characters */
            private ij f2607;

            {
                this.f2607 = this;
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    ij.m5358(this.f2607);
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r7, int r8, boolean r9, int r10, java.lang.String r11, java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ij.a(int, int, boolean, int, java.lang.String, java.lang.Object[]):void");
    }

    private static void b(String str, int i, Object[] objArr) {
        int i2 = $10;
        int i3 = i2 + 85;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            $11 = (i2 + 37) % 128;
            str = str.toCharArray();
            $11 = ($10 + 37) % 128;
        }
        n nVar = new n();
        char[] m5750 = n.m5750(f2599 ^ (-7438370749274812225L), (char[]) str, i);
        nVar.f3042 = 4;
        while (true) {
            int i4 = nVar.f3042;
            if (i4 >= m5750.length) {
                objArr[0] = new String(m5750, 4, m5750.length - 4);
                return;
            }
            $10 = ($11 + 79) % 128;
            int i5 = i4 - 4;
            nVar.f3041 = i5;
            long j = m5750[i4] ^ m5750[i4 % 4];
            long j2 = i5;
            long j3 = f2599;
            try {
                Map map = b.f452;
                Object obj = map.get(983860882);
                if (obj == null) {
                    Class cls = (Class) b.m3371(ViewConfiguration.getScrollBarSize() >> 8, (char) (Process.myTid() >> 22), Color.green(0) + 41);
                    Class<?> cls2 = Long.TYPE;
                    obj = cls.getMethod("p", cls2, cls2, cls2);
                    map.put(983860882, obj);
                }
                m5750[i4] = ((Character) ((Method) obj).invoke(null, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3))).charValue();
                Object obj2 = map.get(-2082235053);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371(View.MeasureSpec.getMode(0), (char) TextUtils.getOffsetAfter("", 0), TextUtils.lastIndexOf("", '0') + 42)).getMethod("q", Object.class, Object.class);
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

    private void cQ_(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f2606) {
            ArrayList arrayList = (ArrayList) this.f2606.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                IntentFilter intentFilter = (IntentFilter) arrayList.get(i);
                for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                    String action = intentFilter.getAction(i2);
                    ArrayList arrayList2 = (ArrayList) this.f2603.get(action);
                    if (arrayList2 != null) {
                        if (arrayList2.size() > 0) {
                            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$.ExternalSyntheticThrowCCEIfNotNull0.m(arrayList2.get(0));
                            throw null;
                        }
                        if (arrayList2.size() <= 0) {
                            this.f2603.remove(action);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static ij m5353(Context context) {
        return (ij) m5354(new Object[]{context});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m5354(Object[] objArr) {
        ij ijVar;
        Context context = (Context) objArr[0];
        synchronized (f2598) {
            if (f2600 == null) {
                f2600 = new ij(context.getApplicationContext());
            }
            ijVar = f2600;
        }
        return ijVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m5355() {
        synchronized (this.f2606) {
            Iterator it = new HashMap(this.f2606).keySet().iterator();
            while (it.hasNext()) {
                cQ_((BroadcastReceiver) it.next());
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m5357() {
        int size;
        c[] cVarArr;
        do {
            synchronized (this.f2606) {
                size = this.f2602.size();
                if (size <= 0) {
                    return;
                }
                cVarArr = new c[size];
                this.f2602.toArray(cVarArr);
                this.f2602.clear();
            }
        } while (size <= 0);
        c cVar = cVarArr[0];
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m5358(ij ijVar) {
        f2596 = (f2595 + 75) % 128;
        ijVar.m5357();
        int i = f2596 + 31;
        f2595 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static void m5359() {
        f2597 = 287397508;
        f2599 = -9220881029616989019L;
    }

    public final boolean cR_(Intent intent) {
        Object[] objArr = new Object[1];
        a(21 - Gravity.getAbsoluteGravity(0, 0), 8 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), true, 268 - MotionEvent.axisFromString(""), "\u000b\u000e\uffde\b�\uffff\u000b￨\u000e\u0001\u0003�\n�￩\u0010\u000f�\uffff���", objArr);
        String intern = ((String) objArr[0]).intern();
        if (!this.f2605) {
            return false;
        }
        synchronized (this.f2606) {
            intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f2604.getContentResolver());
            intent.getData();
            String scheme = intent.getScheme();
            intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                a(AndroidCharacter.getMirror('0') - '!', 12 - View.combineMeasuredStates(0, 0), true, 314 - AndroidCharacter.getMirror('0'), "\u0018\u0013\uffbf\u0006\r\b\u0015\u000b\u000e\u0012\u0004\ufff1\uffbf\u0004\u000f", objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append(resolveTypeIfNeeded);
                Object[] objArr3 = new Object[1];
                b("刺履욫�럴辣瘪∌觲䩄❚늼", TextUtils.getTrimmedLength(""), objArr3);
                sb.append(((String) objArr3[0]).intern());
                sb.append(scheme);
                Object[] objArr4 = new Object[1];
                b("坅坥㕁⤴鼷ꝥⷌ禢❄릭ྍ\ue91f럻짟빁", Color.alpha(0), objArr4);
                sb.append(((String) objArr4[0]).intern());
                sb.append(intent);
                Log.v(intern, sb.toString());
            }
            ArrayList arrayList = (ArrayList) this.f2603.get(intent.getAction());
            if (arrayList != null) {
                if (z) {
                    StringBuilder sb2 = new StringBuilder();
                    Object[] objArr5 = new Object[1];
                    a(13 - TextUtils.indexOf("", ""), Color.blue(0) + 3, true, (ViewConfiguration.getFadingEdgeLength() >> 16) + 259, "\u001a\t\uffe7ￆ￠\u001a\u0019\u000f\u0012ￆ\u0014\u0015\u000f", objArr5);
                    sb2.append(((String) objArr5[0]).intern());
                    sb2.append(arrayList);
                    Log.v(intern, sb2.toString());
                }
                if (arrayList.size() > 0) {
                    MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$.ExternalSyntheticThrowCCEIfNotNull0.m(arrayList.get(0));
                    if (!z) {
                        throw null;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    Object[] objArr6 = new Object[1];
                    b("瑑琜8᱃亀盀瓖\u20fbё賓�뀇钡ﲳ澣䆩─洄\uffdf턤뗑�载慔䘭乿\u1c8e\uf2a0", ViewConfiguration.getKeyRepeatDelay() >> 16, objArr6);
                    sb3.append(((String) objArr6[0]).intern());
                    throw null;
                }
            }
        }
        return false;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m5360() {
        synchronized (this) {
            f2595 = (f2596 + 49) % 128;
            this.f2605 = false;
            m5355();
            f2596 = (f2595 + 57) % 128;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m5361() {
        synchronized (this) {
            int i = (f2596 + 99) % 128;
            f2595 = i;
            this.f2605 = true;
            f2596 = (i + 53) % 128;
        }
    }
}
