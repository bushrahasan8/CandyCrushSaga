package com.ironsource;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.core.os.BuildCompat$Extensions30Impl$;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: t.class */
public final class t {
    public static final a a = new a(null);

    /* loaded from: t$a.class */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b() {
        }

        @SuppressLint({"WrongConstant", "NewApi"})
        public final int a() {
            int i = 0;
            if (Build.VERSION.SDK_INT < 30) {
                return 0;
            }
            try {
                i = BuildCompat$Extensions30Impl$.ExternalSyntheticApiModelOutline0.m(t2.z);
            } catch (Exception e) {
            }
            return i;
        }
    }

    @SuppressLint({"WrongConstant", "NewApi"})
    public static final int a() {
        return a.a();
    }
}
