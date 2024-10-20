package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: ep.class */
public abstract class ep extends ei {
    public ep(eb ebVar, eb ebVar2, dr drVar) {
        super(ebVar, ebVar2, drVar);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public abstract Number mo4974(Number number, Number number2);

    @Override // com.ironsource.adqualitysdk.sdk.i.eb
    /* renamed from: ｋ */
    public final dx mo4937(dy dyVar, co coVar) {
        return new dx(mo4974(m4957().m4939(dyVar, coVar).m4895(), m4956().m4939(dyVar, coVar).m4895()));
    }
}
