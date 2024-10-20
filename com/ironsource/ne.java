package com.ironsource;

import com.ironsource.y1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ne.class */
public final class ne<Smash extends y1<?>> {
    private final oe a;

    public ne(oe<Smash> smashPicker) {
        Intrinsics.checkNotNullParameter(smashPicker, "smashPicker");
        this.a = smashPicker;
    }

    public final List<Smash> a() {
        return this.a.c();
    }

    public final boolean b() {
        return this.a.c().isEmpty() && this.a.a().isEmpty();
    }

    public final boolean c() {
        return this.a.d() == 0;
    }
}
