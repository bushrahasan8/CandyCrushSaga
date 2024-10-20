package com.vungle.ads;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: InternalError.class */
public final class InternalError extends VungleError {
    public InternalError(int i, String str) {
        super(Integer.valueOf(i), null, str, null, null, null, 58, null);
    }

    public /* synthetic */ InternalError(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str);
    }

    @Override // com.vungle.ads.VungleError
    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(InternalError.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        int code = getCode();
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.vungle.ads.InternalError");
        if (code != ((InternalError) obj).getCode()) {
            z = false;
        }
        return z;
    }

    @Override // com.vungle.ads.VungleError
    public int hashCode() {
        return InternalError.class.hashCode();
    }
}
