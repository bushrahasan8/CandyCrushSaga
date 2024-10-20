package com.applovin.impl;

import android.util.SparseArray;

/* loaded from: tk.class */
final class tk {
    private final v4 c;
    private final SparseArray b = new SparseArray();
    private int a = -1;

    public tk(v4 v4Var) {
        this.c = v4Var;
    }

    public void a() {
        for (int i = 0; i < this.b.size(); i++) {
            this.c.accept(this.b.valueAt(i));
        }
        this.a = -1;
        this.b.clear();
    }

    public void a(int i) {
        for (int size = this.b.size() - 1; size >= 0 && i < this.b.keyAt(size); size--) {
            this.c.accept(this.b.valueAt(size));
            this.b.removeAt(size);
        }
        this.a = this.b.size() > 0 ? Math.min(this.a, this.b.size() - 1) : -1;
    }

    public void a(int i, Object obj) {
        if (this.a == -1) {
            f1.b(this.b.size() == 0);
            this.a = 0;
        }
        if (this.b.size() > 0) {
            SparseArray sparseArray = this.b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            boolean z = false;
            if (i >= keyAt) {
                z = true;
            }
            f1.a(z);
            if (keyAt == i) {
                v4 v4Var = this.c;
                SparseArray sparseArray2 = this.b;
                v4Var.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.b.append(i, obj);
    }

    public Object b() {
        SparseArray sparseArray = this.b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public void b(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.b.size() - 1) {
                return;
            }
            int i4 = i3 + 1;
            if (i < this.b.keyAt(i4)) {
                return;
            }
            this.c.accept(this.b.valueAt(i3));
            this.b.removeAt(i3);
            int i5 = this.a;
            if (i5 > 0) {
                this.a = i5 - 1;
            }
            i2 = i4;
        }
    }

    public Object c(int i) {
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 <= 0 || i >= this.b.keyAt(i2)) {
                break;
            }
            this.a--;
        }
        while (this.a < this.b.size() - 1 && i >= this.b.keyAt(this.a + 1)) {
            this.a++;
        }
        return this.b.valueAt(this.a);
    }

    public boolean c() {
        return this.b.size() == 0;
    }
}
