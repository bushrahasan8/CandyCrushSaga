package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableSetMultimap;

/* loaded from: zzhx.class */
public final class zzhx {
    public static final Supplier zza = Suppliers.memoize(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzhw
        @Override // com.google.common.base.Supplier
        public final Object get() {
            ImmutableSetMultimap build;
            build = new ImmutableSetMultimap.Builder().build();
            return build;
        }
    });
}
