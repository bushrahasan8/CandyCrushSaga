package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: s5.class */
public enum s5 {
    SendEvent(0),
    NativeController(1);

    public static final a b = new a(null);
    private final int a;

    /* loaded from: s5$a.class */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s5 a(int i) {
            s5 s5Var;
            s5[] values = s5.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    s5Var = null;
                    break;
                }
                s5Var = values[i2];
                if (s5Var.b() == i) {
                    break;
                }
                i2++;
            }
            s5 s5Var2 = s5Var;
            if (s5Var == null) {
                s5Var2 = s5.SendEvent;
            }
            return s5Var2;
        }
    }

    s5(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }
}
