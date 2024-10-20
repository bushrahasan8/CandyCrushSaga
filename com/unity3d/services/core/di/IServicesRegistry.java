package com.unity3d.services.core.di;

import java.util.Map;
import kotlin.Lazy;
import kotlin.reflect.KClass;

/* loaded from: IServicesRegistry.class */
public interface IServicesRegistry {

    /* loaded from: IServicesRegistry$DefaultImpls.class */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getService$default(IServicesRegistry iServicesRegistry, String str, KClass kClass, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getService");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            return iServicesRegistry.getService(str, kClass);
        }
    }

    <T> T getService(String str, KClass kClass);

    Map<ServiceKey, Lazy> getServices();

    <T> T resolveService(ServiceKey serviceKey);

    <T> T resolveServiceOrNull(ServiceKey serviceKey);

    <T> void updateService(ServiceKey serviceKey, Lazy lazy);
}
