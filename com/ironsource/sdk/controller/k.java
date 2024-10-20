package com.ironsource.sdk.controller;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: k.class */
public interface k {

    /* loaded from: k$a.class */
    public static final class a implements com.ironsource.g {
        @Override // com.ironsource.g
        public Intent a() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    /* loaded from: k$b.class */
    public static final class b implements com.ironsource.h {
        @Override // com.ironsource.h
        public Intent a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) OpenUrlActivity.class);
        }
    }
}
