package kotlinx.coroutines.flow;

/* loaded from: SharingStarted.class */
public interface SharingStarted {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: SharingStarted$Companion.class */
    public static final class Companion {
        static final Companion $$INSTANCE = new Companion();
        private static final SharingStarted Eagerly = new StartedEagerly();
        private static final SharingStarted Lazily = new StartedLazily();

        private Companion() {
        }

        public final SharingStarted getEagerly() {
            return Eagerly;
        }

        public final SharingStarted getLazily() {
            return Lazily;
        }
    }

    Flow command(StateFlow stateFlow);
}
