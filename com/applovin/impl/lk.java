package com.applovin.impl;

import com.applovin.impl.lk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: lk.class */
public class lk {
    private static final Comparator h = new Comparator() { // from class: com.applovin.impl.lk$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int a2;
            a2 = lk.a((lk.b) obj, (lk.b) obj2);
            return a2;
        }
    };
    private static final Comparator i = new Comparator() { // from class: com.applovin.impl.lk$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int b2;
            b2 = lk.b((lk.b) obj, (lk.b) obj2);
            return b2;
        }
    };
    private final int a;
    private int e;
    private int f;
    private int g;
    private final b[] c = new b[5];
    private final ArrayList b = new ArrayList();
    private int d = -1;

    /* loaded from: lk$b.class */
    public static class b {
        public int a;
        public int b;
        public float c;

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public lk(int i2) {
        this.a = i2;
    }

    public static /* synthetic */ int a(b bVar, b bVar2) {
        return bVar.a - bVar2.a;
    }

    private void a() {
        if (this.d != 1) {
            Collections.sort(this.b, h);
            this.d = 1;
        }
    }

    public static /* synthetic */ int b(b bVar, b bVar2) {
        return Float.compare(bVar.c, bVar2.c);
    }

    private void b() {
        if (this.d != 0) {
            Collections.sort(this.b, i);
            this.d = 0;
        }
    }

    public float a(float f) {
        float f2;
        b();
        float f3 = this.f;
        int i2 = 0;
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            b bVar = (b) this.b.get(i3);
            i2 += bVar.b;
            if (i2 >= f * f3) {
                return bVar.c;
            }
        }
        if (this.b.isEmpty()) {
            f2 = Float.NaN;
        } else {
            ArrayList arrayList = this.b;
            f2 = ((b) arrayList.get(arrayList.size() - 1)).c;
        }
        return f2;
    }

    public void a(int i2, float f) {
        b bVar;
        a();
        int i3 = this.g;
        if (i3 > 0) {
            b[] bVarArr = this.c;
            int i4 = i3 - 1;
            this.g = i4;
            bVar = bVarArr[i4];
        } else {
            bVar = new b();
        }
        int i5 = this.e;
        this.e = i5 + 1;
        bVar.a = i5;
        bVar.b = i2;
        bVar.c = f;
        this.b.add(bVar);
        this.f += i2;
        while (true) {
            int i6 = this.f;
            int i7 = this.a;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            b bVar2 = (b) this.b.get(0);
            int i9 = bVar2.b;
            if (i9 <= i8) {
                this.f -= i9;
                this.b.remove(0);
                int i10 = this.g;
                if (i10 < 5) {
                    b[] bVarArr2 = this.c;
                    this.g = i10 + 1;
                    bVarArr2[i10] = bVar2;
                }
            } else {
                bVar2.b = i9 - i8;
                this.f -= i8;
            }
        }
    }

    public void c() {
        this.b.clear();
        this.d = -1;
        this.e = 0;
        this.f = 0;
    }
}
