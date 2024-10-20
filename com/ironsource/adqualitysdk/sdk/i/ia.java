package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashSet;
import java.util.Set;

/* loaded from: ia.class */
public final class ia<T> {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean f2489;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private hw f2492;

    /* renamed from: ｋ, reason: contains not printable characters */
    private hu f2490 = new hu();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Set f2491 = new HashSet();

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Set f2488 = new HashSet();

    /* renamed from: ﮐ, reason: contains not printable characters */
    private Set f2487 = new HashSet();

    public ia(hw hwVar) {
        this.f2492 = hwVar;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final Set<T> m5283() {
        return this.f2488;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final Set<hy> m5284() {
        return this.f2487;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final ia m5285() {
        this.f2489 = true;
        return this;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final Set<Object> m5286() {
        return this.f2491;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final hw m5287() {
        return this.f2492;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m5288(hy hyVar) {
        this.f2487.add(hyVar);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m5289(T t) {
        this.f2488.add(t);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m5290() {
        return this.f2489;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final hu m5291() {
        return this.f2490;
    }
}
