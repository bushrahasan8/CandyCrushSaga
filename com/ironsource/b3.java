package com.ironsource;

import com.ironsource.d4;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: b3.class */
public final class b3 implements d4<o7> {
    private final c5 a;
    private final String b;
    private final c6 c;
    private final Function1 d;
    private o7 e;

    public b3(c5 fileUrl, String destinationPath, c6 downloadManager, Function1 onFinish) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.a = fileUrl;
        this.b = destinationPath;
        this.c = downloadManager;
        this.d = onFinish;
        this.e = new o7(b());
    }

    @Override // com.ironsource.d4, com.ironsource.db
    public void a(o7 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        i().invoke(Result.m7128boximpl(Result.m7129constructorimpl(file)));
    }

    @Override // com.ironsource.d4, com.ironsource.db
    public void a(o7 o7Var, g7 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Function1 i = i();
        Result.Companion companion = Result.Companion;
        i.invoke(Result.m7128boximpl(Result.m7129constructorimpl(ResultKt.createFailure(new Exception("Unable to download mobileController.html: " + error.b())))));
    }

    @Override // com.ironsource.d4
    public String b() {
        return this.b;
    }

    @Override // com.ironsource.d4
    public void b(o7 o7Var) {
        Intrinsics.checkNotNullParameter(o7Var, "<set-?>");
        this.e = o7Var;
    }

    @Override // com.ironsource.d4
    public c5 c() {
        return this.a;
    }

    @Override // com.ironsource.d4
    public boolean h() {
        return d4.a.b(this);
    }

    @Override // com.ironsource.d4
    public Function1 i() {
        return this.d;
    }

    @Override // com.ironsource.d4
    public o7 j() {
        return this.e;
    }

    @Override // com.ironsource.d4
    public c6 k() {
        return this.c;
    }

    @Override // com.ironsource.d4
    public void l() {
        d4.a.a(this);
    }
}
