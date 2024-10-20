package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: hu.class */
public final class hu {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private List f2446;

    /* renamed from: ｋ, reason: contains not printable characters */
    private int f2447;

    public hu() {
        ArrayList arrayList = new ArrayList();
        this.f2446 = arrayList;
        int i = (-1) + 1;
        this.f2447 = i;
        arrayList.add(i, new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m5206(Field field) {
        ((List) this.f2446.get(this.f2447)).remove(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m5207(Field field) {
        ((List) this.f2446.get(this.f2447)).add(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m5208() {
        int i = this.f2447 + 1;
        this.f2447 = i;
        this.f2446.add(i, new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m5209() {
        this.f2446.remove(this.f2447);
        this.f2447--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final List m5210() {
        return this.f2446;
    }
}
