package kotlinx.coroutines.flow;

/* loaded from: StartedEagerly.class */
final class StartedEagerly implements SharingStarted {
    @Override // kotlinx.coroutines.flow.SharingStarted
    public Flow command(StateFlow stateFlow) {
        return FlowKt.flowOf(SharingCommand.START);
    }

    public String toString() {
        return "SharingStarted.Eagerly";
    }
}
