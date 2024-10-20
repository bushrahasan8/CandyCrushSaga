package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.gb;
import com.ironsource.hb;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import com.ironsource.t2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: p.class */
public interface p {

    /* loaded from: p$a.class */
    public static final class a implements p {
        private b a;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String method, hb openUrlConfigurations) {
            this(method, openUrlConfigurations, new k.b(), new k.a());
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(openUrlConfigurations, "openUrlConfigurations");
        }

        public a(String method, hb openUrlConfigurations, com.ironsource.h activityIntentFactory, com.ironsource.g actionIntentFactory) {
            b aVar;
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(openUrlConfigurations, "openUrlConfigurations");
            Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
            Intrinsics.checkNotNullParameter(actionIntentFactory, "actionIntentFactory");
            int hashCode = method.hashCode();
            if (hashCode == -1455867212) {
                if (method.equals(t2.h.J)) {
                    aVar = new b.a(openUrlConfigurations, actionIntentFactory);
                }
                aVar = new b.C0047b(method);
            } else if (hashCode != 109770977) {
                if (hashCode == 1224424441 && method.equals(t2.h.K)) {
                    aVar = new b.d(openUrlConfigurations, activityIntentFactory);
                }
                aVar = new b.C0047b(method);
            } else {
                if (method.equals(t2.h.U)) {
                    aVar = new b.c(openUrlConfigurations, activityIntentFactory);
                }
                aVar = new b.C0047b(method);
            }
            this.a = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ironsource.sdk.controller.p$c] */
        @Override // com.ironsource.sdk.controller.p
        public c a(Context context, gb openUrl) {
            c.a aVar;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(openUrl, "openUrl");
            try {
                aVar = this.a.a(context, openUrl);
            } catch (Exception e) {
                String message = e.getMessage();
                String message2 = (message == null || message.length() == 0) ? "" : e.getMessage();
                Intrinsics.checkNotNull(message2);
                aVar = new c.a(message2);
            }
            return aVar;
        }
    }

    /* loaded from: p$b.class */
    public interface b {

        /* loaded from: p$b$a.class */
        public static final class a implements b {
            private final hb a;
            private final com.ironsource.g b;

            public a(hb configurations, com.ironsource.g intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.a = configurations;
                this.b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, gb openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                if (TextUtils.isEmpty(openUrl.d())) {
                    return new c.a("url is empty");
                }
                Intent a = this.b.a();
                a.setData(Uri.parse(openUrl.d()));
                String c = openUrl.c();
                Intent intent = a;
                if (c != null) {
                    if (c.length() == 0) {
                        intent = a;
                    } else {
                        intent = a.setPackage(openUrl.c());
                        Intrinsics.checkNotNullExpressionValue(intent, "this.setPackage(\n       …                        )");
                    }
                }
                Intent intent2 = intent;
                if (!(context instanceof Activity)) {
                    intent2 = intent.addFlags(this.a.c());
                }
                Intrinsics.checkNotNullExpressionValue(intent2, "intentFactory.create()\n …ations.flags) else this }");
                context.startActivity(intent2);
                return c.b.a;
            }
        }

        /* renamed from: com.ironsource.sdk.controller.p$b$b, reason: collision with other inner class name */
        /* loaded from: p$b$b.class */
        public static final class C0047b implements b {
            private final String a;

            public C0047b(String method) {
                Intrinsics.checkNotNullParameter(method, "method");
                this.a = method;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, gb openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                return new c.a("method " + this.a + " is unsupported");
            }
        }

        /* loaded from: p$b$c.class */
        public static final class c implements b {
            private final hb a;
            private final com.ironsource.h b;

            public c(hb configurations, com.ironsource.h intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.a = configurations;
                this.b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, gb openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.e(this.b).a(this.a.c()).a(openUrl.d()).b(true).c(true).a(context));
                return c.b.a;
            }
        }

        /* loaded from: p$b$d.class */
        public static final class d implements b {
            private final hb a;
            private final com.ironsource.h b;

            public d(hb configurations, com.ironsource.h intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.a = configurations;
                this.b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, gb openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.e(this.b).a(this.a.c()).a(openUrl.d()).a(this.a.d()).b(true).a(context));
                return c.b.a;
            }
        }

        c a(Context context, gb gbVar);
    }

    /* loaded from: p$c.class */
    public static abstract class c {

        /* loaded from: p$c$a.class */
        public static final class a extends c {
            private final String a;

            public a() {
                this(null, 1, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String errorMessage) {
                super(null);
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.a = errorMessage;
            }

            public /* synthetic */ a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ a a(a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.a;
                }
                return aVar.a(str);
            }

            public final a a(String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                return new a(errorMessage);
            }

            public final String a() {
                return this.a;
            }

            public final String b() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "Error(errorMessage=" + this.a + ')';
            }
        }

        /* loaded from: p$c$b.class */
        public static final class b extends c {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    c a(Context context, gb gbVar);
}
