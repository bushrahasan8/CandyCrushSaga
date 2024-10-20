package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: CommonGetInitializationState.class */
public final class CommonGetInitializationState implements GetInitializationState {
    private final SessionRepository sessionRepository;

    public CommonGetInitializationState(SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetInitializationState
    public InitializationState invoke() {
        return this.sessionRepository.getInitializationState();
    }
}
