package com.applovin.impl;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.drive.DriveFile;

/* loaded from: o2.class */
public abstract class o2 {
    private int a;

    public void b() {
        this.a = 0;
    }

    public final void b(int i) {
        this.a = i | this.a;
    }

    public final void c(int i) {
        this.a = (i ^ (-1)) & this.a;
    }

    public final boolean c() {
        return d(DriveFile.MODE_READ_ONLY);
    }

    public final boolean d() {
        return d(RecyclerView.UNDEFINED_DURATION);
    }

    public final boolean d(int i) {
        return (this.a & i) == i;
    }

    public final void e(int i) {
        this.a = i;
    }

    public final boolean e() {
        return d(4);
    }

    public final boolean f() {
        return d(1);
    }
}
