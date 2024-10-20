package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* loaded from: jn.class */
public final class jn {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private jr f2891;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean f2894 = false;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Handler f2893 = new Handler(Looper.getMainLooper());

    /* renamed from: ｋ, reason: contains not printable characters */
    private jj f2892 = new ji(this) { // from class: com.ironsource.adqualitysdk.sdk.i.jn.4

        /* renamed from: ﾒ, reason: contains not printable characters */
        private jn f2897;

        {
            this.f2897 = this;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ji, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            jn.m5561(this.f2897);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ji, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            jn.m5561(this.f2897);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ji, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            jn.dO_(this.f2897, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ji, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            jn.dN_(this.f2897, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ji, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            jn.m5561(this.f2897);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ji, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            jn.m5561(this.f2897);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ji, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            jn.m5561(this.f2897);
        }
    };

    public jn(jr jrVar) {
        this.f2891 = jrVar;
        jh.m5535().m5538(this.f2892);
    }

    static /* synthetic */ void dN_(jn jnVar, Activity activity) {
        if (jnVar.f2894) {
            jnVar.f2894 = false;
            jr jrVar = jnVar.f2891;
            if (jrVar != null) {
                jrVar.dQ_(activity);
            }
        }
        jnVar.f2893.removeCallbacksAndMessages(null);
    }

    static /* synthetic */ void dO_(jn jnVar, Activity activity) {
        jnVar.f2893.postDelayed(new is(jnVar, activity) { // from class: com.ironsource.adqualitysdk.sdk.i.jn.1

            /* renamed from: ﻐ, reason: contains not printable characters */
            private jn f2895;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private Activity f2896;

            {
                this.f2895 = jnVar;
                this.f2896 = activity;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.is
            /* renamed from: ﻐ */
            public final void mo3016() {
                jn.m5563(this.f2895);
                if (this.f2895.f2891 != null) {
                    this.f2895.f2891.dP_(this.f2896);
                }
            }
        }, 500L);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m5561(jn jnVar) {
        jnVar.f2893.removeCallbacksAndMessages(null);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ boolean m5563(jn jnVar) {
        jnVar.f2894 = true;
        return true;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m5564() {
        this.f2893.removeCallbacksAndMessages(null);
        if (this.f2892 != null) {
            jh.m5535().m5537(this.f2892);
            this.f2892 = null;
        }
    }
}
