package com.unity3d.services.core.configuration;

/* loaded from: IModuleConfiguration.class */
public interface IModuleConfiguration {
    Class[] getWebAppApiClassList();

    boolean initCompleteState(Configuration configuration);

    boolean initErrorState(Configuration configuration, ErrorState errorState, String str);

    boolean resetState(Configuration configuration);
}
