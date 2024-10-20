package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.ba;
import com.ironsource.j4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: o.class */
public interface o extends j4<String> {

    /* loaded from: o$a.class */
    public static final class a implements o {
        private final String a;

        public a(String rowAdm) {
            Intrinsics.checkNotNullParameter(rowAdm, "rowAdm");
            this.a = rowAdm;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.o
        public <T> T a(ba<String, T> mapper) {
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            return mapper.a(this.a);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.o, com.ironsource.j4
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a() {
            return this.a;
        }
    }

    @Override // com.ironsource.j4
    /* synthetic */ String a();

    <T> T a(ba<String, T> baVar);
}
