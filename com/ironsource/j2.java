package com.ironsource;

import java.util.ArrayList;

/* loaded from: j2.class */
public class j2 {
    private a a = a.NOT_READY;
    private ArrayList b = new ArrayList();
    private String c;

    /* loaded from: j2$a.class */
    enum a {
        NOT_READY,
        READY
    }

    public j2(String str) {
        this.c = str;
    }

    public void a() {
        synchronized (this) {
            Object[] array = this.b.toArray();
            for (int i = 0; i < array.length; i++) {
                ((Runnable) array[i]).run();
                array[i] = null;
            }
            this.b.clear();
        }
    }

    public void a(Runnable runnable) {
        synchronized (this) {
            if (this.a != a.READY) {
                this.b.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    public void b() {
        synchronized (this) {
            this.a = a.NOT_READY;
        }
    }

    public void c() {
        synchronized (this) {
            this.a = a.READY;
        }
    }
}
