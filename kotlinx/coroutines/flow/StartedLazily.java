package kotlinx.coroutines.flow;

/* loaded from: StartedLazily.class */
final class StartedLazily implements SharingStarted {
    @Override // kotlinx.coroutines.flow.SharingStarted
    public Flow command(StateFlow stateFlow) {
        return FlowKt.flow(new StartedLazily$command$1(stateFlow, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
