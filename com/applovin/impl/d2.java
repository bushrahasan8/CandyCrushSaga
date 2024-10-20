package com.applovin.impl;

import com.applovin.impl.t1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: d2.class */
public abstract class d2 implements t1 {
    protected t1.a b;
    protected t1.a c;
    private t1.a d;
    private t1.a e;
    private ByteBuffer f;
    private ByteBuffer g;
    private boolean h;

    public d2() {
        ByteBuffer byteBuffer = t1.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        t1.a aVar = t1.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
    }

    @Override // com.applovin.impl.t1
    public final t1.a a(t1.a aVar) {
        this.d = aVar;
        this.e = b(aVar);
        return f() ? this.e : t1.a.e;
    }

    public final ByteBuffer a(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    public final boolean a() {
        return this.g.hasRemaining();
    }

    protected abstract t1.a b(t1.a aVar);

    @Override // com.applovin.impl.t1
    public final void b() {
        this.g = t1.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        g();
    }

    @Override // com.applovin.impl.t1
    public boolean c() {
        return this.h && this.g == t1.a;
    }

    @Override // com.applovin.impl.t1
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.g;
        this.g = t1.a;
        return byteBuffer;
    }

    @Override // com.applovin.impl.t1
    public final void e() {
        this.h = true;
        h();
    }

    @Override // com.applovin.impl.t1
    public boolean f() {
        return this.e != t1.a.e;
    }

    protected void g() {
    }

    protected void h() {
    }

    protected void i() {
    }

    @Override // com.applovin.impl.t1
    public final void reset() {
        b();
        this.f = t1.a;
        t1.a aVar = t1.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
        i();
    }
}
