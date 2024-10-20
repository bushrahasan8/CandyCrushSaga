package com.unity3d.services.core.di;

/* loaded from: IServiceComponent.class */
public interface IServiceComponent {

    /* loaded from: IServiceComponent$DefaultImpls.class */
    public static final class DefaultImpls {
        public static IServiceProvider getServiceProvider(IServiceComponent iServiceComponent) {
            return ServiceProvider.INSTANCE;
        }
    }

    IServiceProvider getServiceProvider();
}
