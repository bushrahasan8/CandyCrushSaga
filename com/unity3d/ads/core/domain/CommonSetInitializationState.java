package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: CommonSetInitializationState.class */
public final class CommonSetInitializationState implements SetInitializationState {
    private final SessionRepository sessionRepository;

    public CommonSetInitializationState(SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.SetInitializationState
    public void invoke(InitializationState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.sessionRepository.setInitializationState(state);
    }
}
