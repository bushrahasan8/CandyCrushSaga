package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.q;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: h.class */
public interface h extends q {

    /* loaded from: h$a.class */
    public static abstract class a implements h {
        private final String a;
        private final String b;
        private final boolean c;

        public a(String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public String a() {
            return this.b;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public String b() {
            return this.a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h, com.ironsource.mediationsdk.demandOnly.q
        public abstract IronSourceError c();

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public boolean d() {
            return this.c;
        }
    }

    /* loaded from: h$b.class */
    public static final class b extends a {
        private final String d;
        private final Activity e;
        private final ISDemandOnlyBannerLayout f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String adFormat, Activity activity, String str, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str2, boolean z) {
            super(str, str2, z);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.d = adFormat;
            this.e = activity;
            this.f = iSDemandOnlyBannerLayout;
        }

        public /* synthetic */ b(String str, Activity activity, String str2, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, activity, str2, iSDemandOnlyBannerLayout, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.h, com.ironsource.mediationsdk.demandOnly.q
        public IronSourceError c() {
            IronSourceError a = new q.a(this.d).a(this);
            if (a != null) {
                return a;
            }
            return null;
        }

        public final Activity f() {
            return this.e;
        }

        public final ISDemandOnlyBannerLayout g() {
            return this.f;
        }
    }

    /* loaded from: h$c.class */
    public static final class c {
        private String a = "";
        private Activity b;
        private String c;
        private boolean d;
        private String e;
        private ISDemandOnlyBannerLayout f;

        public final b a() {
            return new b(this.a, this.b, this.c, this.f, this.e, this.d);
        }

        public final c a(Activity activity) {
            this.b = activity;
            return this;
        }

        public final c a(Activity activity, Activity activity2) {
            Activity activity3 = activity;
            if (activity == null) {
                activity3 = activity2;
            }
            this.b = activity3;
            return this;
        }

        public final c a(IronSource.AD_UNIT adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            String ad_unit = adFormat.toString();
            Intrinsics.checkNotNullExpressionValue(ad_unit, "adFormat.toString()");
            this.a = ad_unit;
            return this;
        }

        public final c a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
            this.f = iSDemandOnlyBannerLayout;
            return this;
        }

        public final c a(String str) {
            this.e = str;
            return this;
        }

        public final c a(boolean z) {
            this.d = z;
            return this;
        }

        public final c b(String str) {
            this.c = str;
            return this;
        }

        public final d b() {
            return new d(this.a, this.b, this.c, this.e, this.d);
        }
    }

    /* loaded from: h$d.class */
    public static final class d extends a implements com.ironsource.j {
        private final String d;
        private final Activity e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String adFormat, Activity activity, String str, String str2, boolean z) {
            super(str, str2, z);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.d = adFormat;
            this.e = activity;
        }

        public /* synthetic */ d(String str, Activity activity, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, activity, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.h, com.ironsource.mediationsdk.demandOnly.q
        public IronSourceError c() {
            IronSourceError a = new q.b(this.d).a(this);
            if (a != null) {
                return a;
            }
            return null;
        }

        @Override // com.ironsource.j
        public Activity e() {
            return this.e;
        }
    }

    String a();

    String b();

    @Override // com.ironsource.mediationsdk.demandOnly.q
    /* synthetic */ IronSourceError c();

    boolean d();
}
