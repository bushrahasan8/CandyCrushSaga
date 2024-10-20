package com.facebook.appevents.iap;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: InAppPurchaseSkuDetailsWrapper.class */
public final class InAppPurchaseSkuDetailsWrapper {
    public static final Companion Companion = new Companion(null);
    private static final AtomicBoolean initialized = new AtomicBoolean(false);
    private static InAppPurchaseSkuDetailsWrapper instance;
    private final Method buildMethod;
    private final Class builderClazz;
    private final Method newBuilderMethod;
    private final Method setSkusListMethod;
    private final Method setTypeMethod;
    private final Class skuDetailsParamsClazz;

    /* loaded from: InAppPurchaseSkuDetailsWrapper$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void createInstance() {
            Class cls = InAppPurchaseUtils.getClass("com.android.billingclient.api.SkuDetailsParams");
            Class cls2 = InAppPurchaseUtils.getClass("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (cls == null || cls2 == null) {
                return;
            }
            Method method = InAppPurchaseUtils.getMethod(cls, "newBuilder", new Class[0]);
            Method method2 = InAppPurchaseUtils.getMethod(cls2, "setType", String.class);
            Method method3 = InAppPurchaseUtils.getMethod(cls2, "setSkusList", List.class);
            Method method4 = InAppPurchaseUtils.getMethod(cls2, "build", new Class[0]);
            if (method == null || method2 == null || method3 == null || method4 == null) {
                return;
            }
            InAppPurchaseSkuDetailsWrapper.instance = new InAppPurchaseSkuDetailsWrapper(cls, cls2, method, method2, method3, method4);
        }

        public final InAppPurchaseSkuDetailsWrapper getOrCreateInstance() {
            if (InAppPurchaseSkuDetailsWrapper.initialized.get()) {
                return InAppPurchaseSkuDetailsWrapper.instance;
            }
            createInstance();
            InAppPurchaseSkuDetailsWrapper.initialized.set(true);
            return InAppPurchaseSkuDetailsWrapper.instance;
        }
    }

    public InAppPurchaseSkuDetailsWrapper(Class skuDetailsParamsClazz, Class builderClazz, Method newBuilderMethod, Method setTypeMethod, Method setSkusListMethod, Method buildMethod) {
        Intrinsics.checkNotNullParameter(skuDetailsParamsClazz, "skuDetailsParamsClazz");
        Intrinsics.checkNotNullParameter(builderClazz, "builderClazz");
        Intrinsics.checkNotNullParameter(newBuilderMethod, "newBuilderMethod");
        Intrinsics.checkNotNullParameter(setTypeMethod, "setTypeMethod");
        Intrinsics.checkNotNullParameter(setSkusListMethod, "setSkusListMethod");
        Intrinsics.checkNotNullParameter(buildMethod, "buildMethod");
        this.skuDetailsParamsClazz = skuDetailsParamsClazz;
        this.builderClazz = builderClazz;
        this.newBuilderMethod = newBuilderMethod;
        this.setTypeMethod = setTypeMethod;
        this.setSkusListMethod = setSkusListMethod;
        this.buildMethod = buildMethod;
    }

    public final Object getSkuDetailsParams(String str, List list) {
        Object invokeMethod;
        Object invokeMethod2 = InAppPurchaseUtils.invokeMethod(this.skuDetailsParamsClazz, this.newBuilderMethod, null, new Object[0]);
        if (invokeMethod2 == null || (invokeMethod = InAppPurchaseUtils.invokeMethod(this.builderClazz, this.setTypeMethod, invokeMethod2, str)) == null) {
            return null;
        }
        Object invokeMethod3 = InAppPurchaseUtils.invokeMethod(this.builderClazz, this.setSkusListMethod, invokeMethod, list);
        return invokeMethod3 == null ? null : InAppPurchaseUtils.invokeMethod(this.builderClazz, this.buildMethod, invokeMethod3, new Object[0]);
    }

    public final Class getSkuDetailsParamsClazz() {
        return this.skuDetailsParamsClazz;
    }
}
