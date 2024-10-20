package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.os.Process;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ExpandableListView;

/* loaded from: eu.class */
public final class eu extends eq {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2064 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2065 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2066 = 1798721644;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f2067;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2068 = -909482038;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2069 = -709354129;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f2070 = {118, 86};

    public eu(eb ebVar, eb ebVar2, dr drVar) {
        super(ebVar, ebVar2, drVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0384 A[Catch: all -> 0x0170, TRY_ENTER, TryCatch #0 {all -> 0x0170, blocks: (B:3:0x0017, B:5:0x0032, B:7:0x0082, B:21:0x00f2, B:23:0x010d, B:25:0x0149, B:34:0x019c, B:36:0x01b7, B:38:0x0200, B:43:0x0246, B:45:0x0261, B:47:0x02ac, B:61:0x0369, B:63:0x0384, B:65:0x03d7), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x047a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r7, byte r8, int r9, int r10, int r11, java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 1449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.eu.d(short, byte, int, int, int, java.lang.Object[]):void");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* renamed from: ﻛ */
    public final String mo4955() {
        f2065 = (f2064 + 75) % 128;
        Object[] objArr = new Object[1];
        d((short) (View.combineMeasuredStates(0, 0) - 66), (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33), 1097970436 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) - 56, 1560528995 - MotionEvent.axisFromString(""), objArr);
        String intern = ((String) objArr[0]).intern();
        f2065 = (f2064 + 59) % 128;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.er
    /* renamed from: ﾒ */
    final boolean mo4978(int i) {
        int i2 = (f2064 + 97) % 128;
        f2065 = i2;
        if (i >= 0) {
            return true;
        }
        f2064 = (i2 + 67) % 128;
        return false;
    }
}
