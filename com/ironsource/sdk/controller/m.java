package com.ironsource.sdk.controller;

import com.ironsource.f7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: m.class */
public interface m {

    /* loaded from: m$a.class */
    public static final class a implements m {
        private final String a;
        private final String b;
        private final String c;
        private final String d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String funToCall) {
            this(funToCall, null, null, null, 14, null);
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String funToCall, String str) {
            this(funToCall, str, null, null, 12, null);
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String funToCall, String str, String str2) {
            this(funToCall, str, str2, null, 8, null);
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        public a(String funToCall, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
            this.a = funToCall;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }

        @Override // com.ironsource.sdk.controller.m
        public String a() {
            StringBuilder sb = new StringBuilder();
            sb.append("SSA_CORE.SDKController.runFunction('" + this.a);
            String str = this.b;
            if (str != null && str.length() != 0) {
                sb.append("?parameters=" + this.b);
            }
            String str2 = this.c;
            if (str2 != null && str2.length() != 0) {
                sb.append("','" + this.c);
            }
            String str3 = this.d;
            if (str3 != null && str3.length() != 0) {
                sb.append("','" + this.d);
            }
            sb.append("');");
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
    }

    /* loaded from: m$b.class */
    public static final class b implements m {
        private int a;
        private String b;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(m jsMethod, int i) {
            this(jsMethod.a(), i);
            Intrinsics.checkNotNullParameter(jsMethod, "jsMethod");
        }

        public b(String script, int i) {
            Intrinsics.checkNotNullParameter(script, "script");
            this.b = script;
            this.a = i;
        }

        @Override // com.ironsource.sdk.controller.m
        public String a() {
            String str = "try{" + this.b + "}catch(e){" + ((this.a != f7.d.MODE_0.a() && (this.a < f7.d.MODE_1.a() || this.a > f7.d.MODE_3.a())) ? "empty" : "console.log(\"JS exception: \" + JSON.stringify(e));") + "}";
            Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        …              .toString()");
            return str;
        }
    }

    String a();
}
