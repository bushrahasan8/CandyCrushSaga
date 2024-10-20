package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;

/* loaded from: d4.class */
public interface d4<T> extends db {

    /* loaded from: d4$a.class */
    public static final class a {
        public static <T> void a(d4<T> d4Var) {
            d4Var.k().a(d4Var);
            if (d4Var.j().exists()) {
                IronSourceStorageUtils.deleteFile(d4Var.j());
            }
            try {
                d4Var.k().a(d4Var.j(), d4Var.c().value(), 5, 5);
            } catch (Exception e) {
                Function1 i = d4Var.i();
                Result.Companion companion = Result.Companion;
                i.invoke(Result.m7128boximpl(Result.m7129constructorimpl(ResultKt.createFailure(e))));
            }
        }

        public static <T> boolean b(d4<T> d4Var) {
            return d4Var.j().exists();
        }
    }

    @Override // com.ironsource.db
    /* synthetic */ void a(o7 o7Var);

    @Override // com.ironsource.db
    /* synthetic */ void a(o7 o7Var, g7 g7Var);

    String b();

    void b(o7 o7Var);

    c5 c();

    boolean h();

    Function1 i();

    o7 j();

    c6 k();

    void l();
}
