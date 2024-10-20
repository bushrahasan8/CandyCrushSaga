package com.ironsource;

/* loaded from: s1.class */
public class s1 extends f<a> {

    /* loaded from: s1$a.class */
    public interface a {
        void a();
    }

    public s1(long j) {
        super(j);
    }

    public void a(a aVar) {
        a((Object) aVar);
    }

    @Override // com.ironsource.f
    protected void b() {
        Object obj = this.c;
        if (obj != null) {
            ((a) obj).a();
        }
    }

    public void e() {
        c();
    }
}
