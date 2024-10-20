package com.ironsource.adqualitysdk.sdk.i;

import java.math.BigDecimal;

/* loaded from: er.class */
public abstract class er extends ei {
    public er(eb ebVar, eb ebVar2, dr drVar) {
        super(ebVar, ebVar2, drVar);
    }

    /* renamed from: ﻐ */
    abstract boolean mo4976(String str, String str2);

    /* renamed from: ﻛ */
    abstract boolean mo4977(Object obj, Object obj2);

    @Override // com.ironsource.adqualitysdk.sdk.i.eb
    /* renamed from: ｋ */
    public final dx mo4937(dy dyVar, co coVar) {
        dx m4939 = m4957().m4939(dyVar, coVar);
        Object m4891 = dx.m4891(new Object[]{m4939}, -1102896907, 1102896907, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, m4939)).intValue());
        dx m49392 = m4956().m4939(dyVar, coVar);
        Object m48912 = dx.m4891(new Object[]{m49392}, -1102896907, 1102896907, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, m49392)).intValue());
        try {
            return new dx(Boolean.valueOf(mo4978(new BigDecimal(m4891.toString()).compareTo(new BigDecimal(m48912.toString())))));
        } catch (Exception e) {
            return ((m4891 instanceof String) && (m48912 instanceof String)) ? new dx(Boolean.valueOf(mo4976((String) m4891, (String) m48912))) : new dx(Boolean.valueOf(mo4977(m4891, m48912)));
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    abstract boolean mo4978(int i);
}
