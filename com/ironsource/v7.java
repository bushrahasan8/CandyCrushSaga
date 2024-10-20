package com.ironsource;

import android.view.View;
import com.ironsource.r7;
import com.ironsource.t2;
import com.ironsource.v7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: v7.class */
public final class v7 {
    private r7 a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private a i;

    /* loaded from: v7$a.class */
    public interface a {
        void a(ge geVar);

        void a(b bVar);
    }

    /* loaded from: v7$b.class */
    public enum b {
        Title("title"),
        Advertiser(t2.h.F0),
        Body(t2.h.E0),
        Cta("cta"),
        Icon(t2.h.H0),
        Container("container"),
        PrivacyIcon(t2.h.J0);

        private final String a;

        b(String str) {
            this.a = str;
        }

        public final String b() {
            return this.a;
        }
    }

    /* loaded from: v7$c.class */
    public static final class c implements r7.a {
        final v7 a;

        c(v7 v7Var) {
            this.a = v7Var;
        }

        @Override // com.ironsource.r7.a
        public void a(ge viewVisibilityParams) {
            Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            a n = this.a.n();
            if (n != null) {
                n.a(viewVisibilityParams);
            }
        }
    }

    public v7(r7 containerView, View view, View view2, View view3, View view4, View view5, View view6, View privacyIconView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(privacyIconView, "privacyIconView");
        this.a = containerView;
        this.b = view;
        this.c = view2;
        this.d = view3;
        this.e = view4;
        this.f = view5;
        this.g = view6;
        this.h = privacyIconView;
        r();
        s();
    }

    public /* synthetic */ v7(r7 r7Var, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r7Var, (i & 2) != 0 ? null : view, (i & 4) != 0 ? null : view2, (i & 8) != 0 ? null : view3, (i & 16) != 0 ? null : view4, (i & 32) != 0 ? null : view5, (i & 64) != 0 ? null : view6, view7);
    }

    public static /* synthetic */ v7 a(v7 v7Var, r7 r7Var, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i, Object obj) {
        if ((i & 1) != 0) {
            r7Var = v7Var.a;
        }
        if ((i & 2) != 0) {
            view = v7Var.b;
        }
        if ((i & 4) != 0) {
            view2 = v7Var.c;
        }
        if ((i & 8) != 0) {
            view3 = v7Var.d;
        }
        if ((i & 16) != 0) {
            view4 = v7Var.e;
        }
        if ((i & 32) != 0) {
            view5 = v7Var.f;
        }
        if ((i & 64) != 0) {
            view6 = v7Var.g;
        }
        if ((i & 128) != 0) {
            view7 = v7Var.h;
        }
        return v7Var.a(r7Var, view, view2, view3, view4, view5, view6, view7);
    }

    private static final void a(final v7 v7Var, View view, final b bVar) {
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener(v7Var, bVar) { // from class: com.ironsource.v7$$ExternalSyntheticLambda0
                public final v7 f$0;
                public final v7.b f$1;

                {
                    this.f$0 = v7Var;
                    this.f$1 = bVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    v7.a(this.f$0, this.f$1, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(v7 this$0, b viewName, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewName, "$viewName");
        a aVar = this$0.i;
        if (aVar != null) {
            aVar.a(viewName);
        }
    }

    private final void r() {
        a(this, this.b, b.Title);
        a(this, this.c, b.Advertiser);
        a(this, this.e, b.Body);
        a(this, this.g, b.Cta);
        a(this, this.d, b.Icon);
        a(this, this.a, b.Container);
        a(this, this.h, b.PrivacyIcon);
    }

    private final void s() {
        this.a.setListener$mediationsdk_release(new c(this));
    }

    public final r7 a() {
        return this.a;
    }

    public final v7 a(r7 containerView, View view, View view2, View view3, View view4, View view5, View view6, View privacyIconView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(privacyIconView, "privacyIconView");
        return new v7(containerView, view, view2, view3, view4, view5, view6, privacyIconView);
    }

    public final void a(View view) {
        this.c = view;
    }

    public final void a(r7 r7Var) {
        Intrinsics.checkNotNullParameter(r7Var, "<set-?>");
        this.a = r7Var;
    }

    public final void a(a aVar) {
        this.i = aVar;
    }

    public final View b() {
        return this.b;
    }

    public final void b(View view) {
        this.e = view;
    }

    public final View c() {
        return this.c;
    }

    public final void c(View view) {
        this.g = view;
    }

    public final View d() {
        return this.d;
    }

    public final void d(View view) {
        this.d = view;
    }

    public final View e() {
        return this.e;
    }

    public final void e(View view) {
        this.f = view;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7)) {
            return false;
        }
        v7 v7Var = (v7) obj;
        return Intrinsics.areEqual(this.a, v7Var.a) && Intrinsics.areEqual(this.b, v7Var.b) && Intrinsics.areEqual(this.c, v7Var.c) && Intrinsics.areEqual(this.d, v7Var.d) && Intrinsics.areEqual(this.e, v7Var.e) && Intrinsics.areEqual(this.f, v7Var.f) && Intrinsics.areEqual(this.g, v7Var.g) && Intrinsics.areEqual(this.h, v7Var.h);
    }

    public final View f() {
        return this.f;
    }

    public final void f(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.h = view;
    }

    public final View g() {
        return this.g;
    }

    public final void g(View view) {
        this.b = view;
    }

    public final View h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        View view = this.b;
        int i = 0;
        int hashCode2 = view == null ? 0 : view.hashCode();
        View view2 = this.c;
        int hashCode3 = view2 == null ? 0 : view2.hashCode();
        View view3 = this.d;
        int hashCode4 = view3 == null ? 0 : view3.hashCode();
        View view4 = this.e;
        int hashCode5 = view4 == null ? 0 : view4.hashCode();
        View view5 = this.f;
        int hashCode6 = view5 == null ? 0 : view5.hashCode();
        View view6 = this.g;
        if (view6 != null) {
            i = view6.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i) * 31) + this.h.hashCode();
    }

    public final View i() {
        return this.c;
    }

    public final View j() {
        return this.e;
    }

    public final r7 k() {
        return this.a;
    }

    public final View l() {
        return this.g;
    }

    public final View m() {
        return this.d;
    }

    public final a n() {
        return this.i;
    }

    public final View o() {
        return this.f;
    }

    public final View p() {
        return this.h;
    }

    public final View q() {
        return this.b;
    }

    public final JSONObject t() {
        JSONObject put = new JSONObject().put("title", this.b != null).put(t2.h.F0, this.c != null).put(t2.h.E0, this.e != null).put("cta", this.g != null).put(t2.h.I0, this.f != null);
        boolean z = false;
        if (this.d != null) {
            z = true;
        }
        JSONObject put2 = put.put(t2.h.H0, z);
        Intrinsics.checkNotNullExpressionValue(put2, "JSONObject()\n\t\t\t.put(\"ti…\"icon\", iconView != null)");
        return put2;
    }

    public String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.a + ", titleView=" + this.b + ", advertiserView=" + this.c + ", iconView=" + this.d + ", bodyView=" + this.e + ", mediaView=" + this.f + ", ctaView=" + this.g + ", privacyIconView=" + this.h + ')';
    }
}
