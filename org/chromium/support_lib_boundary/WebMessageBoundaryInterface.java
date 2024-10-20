package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

/* loaded from: WebMessageBoundaryInterface.class */
public interface WebMessageBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    @Deprecated
    String getData();

    InvocationHandler getMessagePayload();

    InvocationHandler[] getPorts();
}
