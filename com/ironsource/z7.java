package com.ironsource;

import android.graphics.drawable.Drawable;
import android.webkit.URLUtil;
import java.io.File;
import java.io.InputStream;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: z7.class */
public final class z7 implements a8 {
    private final m2 a;

    public z7() {
        this(null, 1, null);
    }

    public z7(m2 connectionFactory) {
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        this.a = connectionFactory;
    }

    public /* synthetic */ z7(m2 m2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? m3.a : m2Var);
    }

    private final Object b(String str) {
        Exception exc;
        File file = new File(str);
        if (file.exists()) {
            Drawable createFromPath = Drawable.createFromPath(file.getPath());
            if (createFromPath != null) {
                return Result.m7129constructorimpl(createFromPath);
            }
            Result.Companion companion = Result.Companion;
            exc = new Exception("failed to create a drawable");
        } else {
            Result.Companion companion2 = Result.Companion;
            exc = new Exception("file does not exists");
        }
        return Result.m7129constructorimpl(ResultKt.createFailure(exc));
    }

    private final Object c(String str) {
        InputStream a = this.a.a(str);
        try {
            Object createFromStream = Drawable.createFromStream(a, new File(str).getName());
            CloseableKt.closeFinally(a, null);
            Object obj = createFromStream;
            if (createFromStream == null) {
                Result.Companion companion = Result.Companion;
                obj = ResultKt.createFailure(new Exception("failed to create a drawable"));
            }
            return Result.m7129constructorimpl(obj);
        } finally {
        }
    }

    private final boolean d(String str) {
        return URLUtil.isHttpsUrl(str);
    }

    @Override // com.ironsource.a8
    public Object a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            return d(url) ? c(url) : b(url);
        } catch (Exception e) {
            Result.Companion companion = Result.Companion;
            return Result.m7129constructorimpl(ResultKt.createFailure(e));
        }
    }
}
