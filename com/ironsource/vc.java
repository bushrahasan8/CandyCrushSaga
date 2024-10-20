package com.ironsource;

/* loaded from: vc.class */
public class vc extends f<a> {

    /* loaded from: vc$a.class */
    public interface a {
        void a();
    }

    public vc(long j) {
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
