package com.ironsource;

/* loaded from: rd.class */
public final class rd extends f<a> {

    /* loaded from: rd$a.class */
    public interface a {
        void a();
    }

    public rd(long j) {
        super(j);
    }

    public final void a(a aVar) {
        a((Object) aVar);
    }

    @Override // com.ironsource.f
    protected void b() {
        a aVar = (a) this.c;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void e() {
        c();
    }
}
