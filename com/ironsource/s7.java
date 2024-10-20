package com.ironsource;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.t2;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: s7.class */
public final class s7 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final Drawable e;
    private final WebView f;
    private final View g;

    /* loaded from: s7$a.class */
    public static final class a {
        private final a8 a;
        private final l0 b;

        public a(a8 imageLoader, l0 adViewManagement) {
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(adViewManagement, "adViewManagement");
            this.a = imageLoader;
            this.b = adViewManagement;
        }

        private final Result a(String str) {
            Object m7129constructorimpl;
            WebView webView = null;
            if (str == null) {
                return null;
            }
            w7 a = this.b.a(str);
            if (a != null) {
                webView = a.getPresentingView();
            }
            if (webView == null) {
                Result.Companion companion = Result.Companion;
                m7129constructorimpl = Result.m7129constructorimpl(ResultKt.createFailure(new Exception("missing adview for id: '" + str + '\'')));
            } else {
                m7129constructorimpl = Result.m7129constructorimpl(webView);
            }
            return Result.m7128boximpl(m7129constructorimpl);
        }

        private final Result b(String str) {
            if (str == null) {
                return null;
            }
            return Result.m7128boximpl(this.a.a(str));
        }

        public final b a(Context activityContext, JSONObject json) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String b;
            String b2;
            String b3;
            String b4;
            String b5;
            String b6;
            String b7;
            Intrinsics.checkNotNullParameter(activityContext, "activityContext");
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject optJSONObject = json.optJSONObject("title");
            if (optJSONObject != null) {
                b7 = t7.b(optJSONObject, t2.h.K0);
                str = b7;
            } else {
                str = null;
            }
            JSONObject optJSONObject2 = json.optJSONObject(t2.h.F0);
            if (optJSONObject2 != null) {
                b6 = t7.b(optJSONObject2, t2.h.K0);
                str2 = b6;
            } else {
                str2 = null;
            }
            JSONObject optJSONObject3 = json.optJSONObject(t2.h.E0);
            if (optJSONObject3 != null) {
                b5 = t7.b(optJSONObject3, t2.h.K0);
                str3 = b5;
            } else {
                str3 = null;
            }
            JSONObject optJSONObject4 = json.optJSONObject("cta");
            if (optJSONObject4 != null) {
                b4 = t7.b(optJSONObject4, t2.h.K0);
                str4 = b4;
            } else {
                str4 = null;
            }
            JSONObject optJSONObject5 = json.optJSONObject(t2.h.H0);
            if (optJSONObject5 != null) {
                b3 = t7.b(optJSONObject5, "url");
                str5 = b3;
            } else {
                str5 = null;
            }
            JSONObject optJSONObject6 = json.optJSONObject(t2.h.I0);
            if (optJSONObject6 != null) {
                b2 = t7.b(optJSONObject6, "adViewId");
                str6 = b2;
            } else {
                str6 = null;
            }
            JSONObject optJSONObject7 = json.optJSONObject(t2.h.J0);
            String str7 = null;
            if (optJSONObject7 != null) {
                b = t7.b(optJSONObject7, "url");
                str7 = b;
            }
            return new b(new b.a(str, str2, str3, str4, b(str5), a(str6), rb.a.a(activityContext, str7, this.a)));
        }
    }

    /* loaded from: s7$b.class */
    public static final class b {
        private final a a;

        /* loaded from: s7$b$a.class */
        public static final class a {
            private final String a;
            private final String b;
            private final String c;
            private final String d;
            private final Result e;
            private final Result f;
            private final View g;

            public a(String str, String str2, String str3, String str4, Result result, Result result2, View privacyIcon) {
                Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = result;
                this.f = result2;
                this.g = privacyIcon;
            }

            public static /* synthetic */ a a(a aVar, String str, String str2, String str3, String str4, Result result, Result result2, View view, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.a;
                }
                if ((i & 2) != 0) {
                    str2 = aVar.b;
                }
                if ((i & 4) != 0) {
                    str3 = aVar.c;
                }
                if ((i & 8) != 0) {
                    str4 = aVar.d;
                }
                if ((i & 16) != 0) {
                    result = aVar.e;
                }
                if ((i & 32) != 0) {
                    result2 = aVar.f;
                }
                if ((i & 64) != 0) {
                    view = aVar.g;
                }
                return aVar.a(str, str2, str3, str4, result, result2, view);
            }

            public final a a(String str, String str2, String str3, String str4, Result result, Result result2, View privacyIcon) {
                Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
                return new a(str, str2, str3, str4, result, result2, privacyIcon);
            }

            public final String a() {
                return this.a;
            }

            public final String b() {
                return this.b;
            }

            public final String c() {
                return this.c;
            }

            public final String d() {
                return this.d;
            }

            public final Result e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d) && Intrinsics.areEqual(this.e, aVar.e) && Intrinsics.areEqual(this.f, aVar.f) && Intrinsics.areEqual(this.g, aVar.g);
            }

            public final Result f() {
                return this.f;
            }

            public final View g() {
                return this.g;
            }

            public final s7 h() {
                Drawable drawable;
                String str = this.a;
                String str2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                Result result = this.e;
                WebView webView = null;
                if (result != null) {
                    Object m7137unboximpl = result.m7137unboximpl();
                    Object obj = m7137unboximpl;
                    if (Result.m7134isFailureimpl(m7137unboximpl)) {
                        obj = null;
                    }
                    drawable = (Drawable) obj;
                } else {
                    drawable = null;
                }
                Result result2 = this.f;
                if (result2 != null) {
                    Object m7137unboximpl2 = result2.m7137unboximpl();
                    if (Result.m7134isFailureimpl(m7137unboximpl2)) {
                        m7137unboximpl2 = null;
                    }
                    webView = (WebView) m7137unboximpl2;
                }
                return new s7(str, str2, str3, str4, drawable, webView, this.g);
            }

            public int hashCode() {
                String str = this.a;
                int i = 0;
                int hashCode = str == null ? 0 : str.hashCode();
                String str2 = this.b;
                int hashCode2 = str2 == null ? 0 : str2.hashCode();
                String str3 = this.c;
                int hashCode3 = str3 == null ? 0 : str3.hashCode();
                String str4 = this.d;
                int hashCode4 = str4 == null ? 0 : str4.hashCode();
                Result result = this.e;
                int m7133hashCodeimpl = result == null ? 0 : Result.m7133hashCodeimpl(result.m7137unboximpl());
                Result result2 = this.f;
                if (result2 != null) {
                    i = Result.m7133hashCodeimpl(result2.m7137unboximpl());
                }
                return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + m7133hashCodeimpl) * 31) + i) * 31) + this.g.hashCode();
            }

            public final String i() {
                return this.b;
            }

            public final String j() {
                return this.c;
            }

            public final String k() {
                return this.d;
            }

            public final Result l() {
                return this.e;
            }

            public final Result m() {
                return this.f;
            }

            public final View n() {
                return this.g;
            }

            public final String o() {
                return this.a;
            }

            public String toString() {
                return "Data(title=" + this.a + ", advertiser=" + this.b + ", body=" + this.c + ", cta=" + this.d + ", icon=" + this.e + ", media=" + this.f + ", privacyIcon=" + this.g + ')';
            }
        }

        public b(a data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.a = data;
        }

        private static final void a(JSONObject jSONObject, String str) {
            jSONObject.put(str, new JSONObject().put("success", true));
        }

        private static final void a(JSONObject jSONObject, String str, Object obj) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", Result.m7135isSuccessimpl(obj));
            Throwable m7132exceptionOrNullimpl = Result.m7132exceptionOrNullimpl(obj);
            if (m7132exceptionOrNullimpl != null) {
                String message = m7132exceptionOrNullimpl.getMessage();
                String str2 = message;
                if (message == null) {
                    str2 = "unknown reason";
                }
                jSONObject2.put("reason", str2);
            }
            Unit unit = Unit.INSTANCE;
            jSONObject.put(str, jSONObject2);
        }

        public final a a() {
            return this.a;
        }

        public final JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            if (this.a.o() != null) {
                a(jSONObject, "title");
            }
            if (this.a.i() != null) {
                a(jSONObject, t2.h.F0);
            }
            if (this.a.j() != null) {
                a(jSONObject, t2.h.E0);
            }
            if (this.a.k() != null) {
                a(jSONObject, "cta");
            }
            Result l = this.a.l();
            if (l != null) {
                a(jSONObject, t2.h.H0, l.m7137unboximpl());
            }
            Result m = this.a.m();
            if (m != null) {
                a(jSONObject, t2.h.I0, m.m7137unboximpl());
            }
            return jSONObject;
        }
    }

    public s7(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View privacyIcon) {
        Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = drawable;
        this.f = webView;
        this.g = privacyIcon;
    }

    public static /* synthetic */ s7 a(s7 s7Var, String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view, int i, Object obj) {
        if ((i & 1) != 0) {
            str = s7Var.a;
        }
        if ((i & 2) != 0) {
            str2 = s7Var.b;
        }
        if ((i & 4) != 0) {
            str3 = s7Var.c;
        }
        if ((i & 8) != 0) {
            str4 = s7Var.d;
        }
        if ((i & 16) != 0) {
            drawable = s7Var.e;
        }
        if ((i & 32) != 0) {
            webView = s7Var.f;
        }
        if ((i & 64) != 0) {
            view = s7Var.g;
        }
        return s7Var.a(str, str2, str3, str4, drawable, webView, view);
    }

    public final s7 a(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View privacyIcon) {
        Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
        return new s7(str, str2, str3, str4, drawable, webView, privacyIcon);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final Drawable e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7)) {
            return false;
        }
        s7 s7Var = (s7) obj;
        return Intrinsics.areEqual(this.a, s7Var.a) && Intrinsics.areEqual(this.b, s7Var.b) && Intrinsics.areEqual(this.c, s7Var.c) && Intrinsics.areEqual(this.d, s7Var.d) && Intrinsics.areEqual(this.e, s7Var.e) && Intrinsics.areEqual(this.f, s7Var.f) && Intrinsics.areEqual(this.g, s7Var.g);
    }

    public final WebView f() {
        return this.f;
    }

    public final View g() {
        return this.g;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.c;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.d;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        Drawable drawable = this.e;
        int hashCode5 = drawable == null ? 0 : drawable.hashCode();
        WebView webView = this.f;
        if (webView != null) {
            i = webView.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i) * 31) + this.g.hashCode();
    }

    public final String i() {
        return this.c;
    }

    public final String j() {
        return this.d;
    }

    public final Drawable k() {
        return this.e;
    }

    public final WebView l() {
        return this.f;
    }

    public final View m() {
        return this.g;
    }

    public final String n() {
        return this.a;
    }

    public String toString() {
        return "ISNNativeAdData(title=" + this.a + ", advertiser=" + this.b + ", body=" + this.c + ", cta=" + this.d + ", icon=" + this.e + ", mediaView=" + this.f + ", privacyIcon=" + this.g + ')';
    }
}
