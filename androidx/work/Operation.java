package androidx.work;

/* loaded from: Operation.class */
public interface Operation {
    public static final State.SUCCESS SUCCESS = new State.SUCCESS();
    public static final State.IN_PROGRESS IN_PROGRESS = new State.IN_PROGRESS();

    /* loaded from: Operation$State.class */
    public static abstract class State {

        /* loaded from: Operation$State$FAILURE.class */
        public static final class FAILURE extends State {
            private final Throwable mThrowable;

            public FAILURE(Throwable th) {
                this.mThrowable = th;
            }

            public Throwable getThrowable() {
                return this.mThrowable;
            }

            public String toString() {
                return "FAILURE (" + this.mThrowable.getMessage() + ")";
            }
        }

        /* loaded from: Operation$State$IN_PROGRESS.class */
        public static final class IN_PROGRESS extends State {
            private IN_PROGRESS() {
            }

            /* synthetic */ IN_PROGRESS(AnonymousClass1 anonymousClass1) {
                this();
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* loaded from: Operation$State$SUCCESS.class */
        public static final class SUCCESS extends State {
            private SUCCESS() {
            }

            /* synthetic */ SUCCESS(AnonymousClass1 anonymousClass1) {
                this();
            }

            public String toString() {
                return "SUCCESS";
            }
        }

        State() {
        }
    }
}
