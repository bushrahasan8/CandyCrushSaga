package com.ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* loaded from: a.class */
public class a extends Thread {
    private static final com.ironsource.b m = new C0024a();
    private static final j8 n = new b();
    private final int d;
    private com.ironsource.b a = m;
    private j8 b = n;
    private final Handler c = new Handler(Looper.getMainLooper());
    private String e = "";
    private boolean f = false;
    private boolean g = false;
    private volatile int h = 0;
    private int i = 1;
    private int j = 0;
    private final Runnable k = new c(this);

    /* renamed from: com.ironsource.a$a, reason: collision with other inner class name */
    /* loaded from: a$a.class */
    class C0024a implements com.ironsource.b {
        C0024a() {
        }

        @Override // com.ironsource.b
        public void a() {
        }

        @Override // com.ironsource.b
        public void b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    }

    /* loaded from: a$b.class */
    class b implements j8 {
        b() {
        }

        @Override // com.ironsource.j8
        public void a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* loaded from: a$c.class */
    class c implements Runnable {
        final a a;

        c(a aVar) {
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = this.a;
            aVar.h = (aVar.h + 1) % Integer.MAX_VALUE;
        }
    }

    public a(int i) {
        this.d = i;
    }

    public int a() {
        return this.j;
    }

    public a a(com.ironsource.b bVar) {
        com.ironsource.b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = m;
        }
        this.a = bVar2;
        return this;
    }

    public a a(j8 j8Var) {
        j8 j8Var2 = j8Var;
        if (j8Var == null) {
            j8Var2 = n;
        }
        this.b = j8Var2;
        return this;
    }

    public a a(String str) {
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        this.e = str2;
        return this;
    }

    public a a(boolean z) {
        this.g = z;
        return this;
    }

    public void a(int i) {
        this.i = i;
    }

    public int b() {
        return this.i;
    }

    public a b(boolean z) {
        this.f = z;
        return this;
    }

    public a c() {
        this.e = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANR-ANRHandler|");
        int i = -1;
        while (!isInterrupted() && this.j < this.i) {
            int i2 = this.h;
            this.c.post(this.k);
            try {
                Thread.sleep(this.d);
                if (this.h != i2) {
                    this.j = 0;
                } else if (this.g || !Debug.isDebuggerConnected()) {
                    this.j++;
                    this.a.a();
                    String str = e3.l;
                    if (str != null && !str.trim().isEmpty()) {
                        new u4(e3.l, String.valueOf(System.currentTimeMillis()), "ANR").a();
                    }
                } else {
                    if (this.h != i) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i = this.h;
                }
            } catch (InterruptedException e) {
                this.b.a(e);
                return;
            }
        }
        if (this.j >= this.i) {
            this.a.b();
        }
    }
}
