package com.ironsource;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: mb.class */
public final class mb {
    private boolean a;
    private String b;
    private boolean c;
    private int d;
    private int[] e;
    private int[] f;

    public mb() {
        this(false, null, false, 0, null, null, 63, null);
    }

    public mb(boolean z, String pixelEventsUrl, boolean z2, int i, int[] iArr, int[] iArr2) {
        Intrinsics.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        this.a = z;
        this.b = pixelEventsUrl;
        this.c = z2;
        this.d = i;
        this.e = iArr;
        this.f = iArr2;
    }

    public /* synthetic */ mb(boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? nb.a : str, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? null : iArr, (i2 & 32) != 0 ? null : iArr2);
    }

    public static /* synthetic */ mb a(mb mbVar, boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = mbVar.a;
        }
        if ((i2 & 2) != 0) {
            str = mbVar.b;
        }
        if ((i2 & 4) != 0) {
            z2 = mbVar.c;
        }
        if ((i2 & 8) != 0) {
            i = mbVar.d;
        }
        if ((i2 & 16) != 0) {
            iArr = mbVar.e;
        }
        if ((i2 & 32) != 0) {
            iArr2 = mbVar.f;
        }
        return mbVar.a(z, str, z2, i, iArr, iArr2);
    }

    public final mb a(boolean z, String pixelEventsUrl, boolean z2, int i, int[] iArr, int[] iArr2) {
        Intrinsics.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        return new mb(z, pixelEventsUrl, z2, i, iArr, iArr2);
    }

    public final void a(int i) {
        this.d = i;
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.b = str;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void a(int[] iArr) {
        this.f = iArr;
    }

    public final boolean a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final void b(boolean z) {
        this.a = z;
    }

    public final void b(int[] iArr) {
        this.e = iArr;
    }

    public final boolean c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int[] e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb)) {
            return false;
        }
        mb mbVar = (mb) obj;
        return this.a == mbVar.a && Intrinsics.areEqual(this.b, mbVar.b) && this.c == mbVar.c && this.d == mbVar.d && Intrinsics.areEqual(this.e, mbVar.e) && Intrinsics.areEqual(this.f, mbVar.f);
    }

    public final int[] f() {
        return this.f;
    }

    public final boolean g() {
        return this.c;
    }

    public final int h() {
        return this.d;
    }

    public int hashCode() {
        boolean z = this.a;
        int i = 1;
        boolean z2 = z;
        if (z) {
            z2 = true;
        }
        int hashCode = this.b.hashCode();
        boolean z3 = this.c;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        int i2 = this.d;
        int[] iArr = this.e;
        int i3 = 0;
        int hashCode2 = iArr == null ? 0 : Arrays.hashCode(iArr);
        int[] iArr2 = this.f;
        if (iArr2 != null) {
            i3 = Arrays.hashCode(iArr2);
        }
        return ((((((((((z2 ? 1 : 0) * 31) + hashCode) * 31) + i) * 31) + i2) * 31) + hashCode2) * 31) + i3;
    }

    public final boolean i() {
        return this.a;
    }

    public final String j() {
        return this.b;
    }

    public final int[] k() {
        return this.f;
    }

    public final int[] l() {
        return this.e;
    }

    public String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.a + ", pixelEventsUrl=" + this.b + ", pixelEventsCompression=" + this.c + ", pixelEventsCompressionLevel=" + this.d + ", pixelOptOut=" + Arrays.toString(this.e) + ", pixelOptIn=" + Arrays.toString(this.f) + ')';
    }
}
