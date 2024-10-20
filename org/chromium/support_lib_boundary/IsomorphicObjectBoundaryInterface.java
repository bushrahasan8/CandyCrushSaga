package org.chromium.support_lib_boundary;

import java.util.concurrent.Callable;

/* loaded from: IsomorphicObjectBoundaryInterface.class */
public interface IsomorphicObjectBoundaryInterface {
    Object getOrCreatePeer(Callable<Object> callable);
}
