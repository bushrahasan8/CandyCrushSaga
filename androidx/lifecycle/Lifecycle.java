package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Lifecycle.class */
public abstract class Lifecycle {
    AtomicReference mInternalScopeRef = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.Lifecycle$1 */
    /* loaded from: Lifecycle$1.class */
    public static abstract /* synthetic */ class AnonymousClass1 {
        static final int[] $SwitchMap$androidx$lifecycle$Lifecycle$Event;
        static final int[] $SwitchMap$androidx$lifecycle$Lifecycle$State;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:72:0x00bd
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                androidx.lifecycle.Lifecycle.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$Event = r0
                r0 = r4
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE     // Catch: java.lang.NoSuchFieldError -> L99
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L99
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L99
            L14:
                int[] r0 = androidx.lifecycle.Lifecycle.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L99 java.lang.NoSuchFieldError -> L9d
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP     // Catch: java.lang.NoSuchFieldError -> L9d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9d
            L1f:
                int[] r0 = androidx.lifecycle.Lifecycle.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L9d java.lang.NoSuchFieldError -> La1
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START     // Catch: java.lang.NoSuchFieldError -> La1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La1
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La1
            L2a:
                int[] r0 = androidx.lifecycle.Lifecycle.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> La1 java.lang.NoSuchFieldError -> La5
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE     // Catch: java.lang.NoSuchFieldError -> La5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La5
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La5
            L35:
                int[] r0 = androidx.lifecycle.Lifecycle.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> La5 java.lang.NoSuchFieldError -> La9
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME     // Catch: java.lang.NoSuchFieldError -> La9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La9
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La9
            L40:
                int[] r0 = androidx.lifecycle.Lifecycle.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> La9 java.lang.NoSuchFieldError -> Lad
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY     // Catch: java.lang.NoSuchFieldError -> Lad
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lad
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lad
            L4c:
                int[] r0 = androidx.lifecycle.Lifecycle.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> Lad java.lang.NoSuchFieldError -> Lb1
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_ANY     // Catch: java.lang.NoSuchFieldError -> Lb1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb1
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb1
            L58:
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()     // Catch: java.lang.NoSuchFieldError -> Lb1
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                androidx.lifecycle.Lifecycle.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$State = r0
                r0 = r4
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch: java.lang.NoSuchFieldError -> Lb5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb5
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb5
            L6c:
                int[] r0 = androidx.lifecycle.Lifecycle.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> Lb5 java.lang.NoSuchFieldError -> Lb9
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch: java.lang.NoSuchFieldError -> Lb9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb9
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb9
            L77:
                int[] r0 = androidx.lifecycle.Lifecycle.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> Lb9 java.lang.NoSuchFieldError -> Lbd
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch: java.lang.NoSuchFieldError -> Lbd
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lbd
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lbd
            L82:
                int[] r0 = androidx.lifecycle.Lifecycle.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> Lbd java.lang.NoSuchFieldError -> Lc1
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED     // Catch: java.lang.NoSuchFieldError -> Lc1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc1
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc1
            L8d:
                int[] r0 = androidx.lifecycle.Lifecycle.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> Lc1 java.lang.NoSuchFieldError -> Lc5
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch: java.lang.NoSuchFieldError -> Lc5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc5
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc5
            L98:
                return
            L99:
                r4 = move-exception
                goto L14
            L9d:
                r4 = move-exception
                goto L1f
            La1:
                r4 = move-exception
                goto L2a
            La5:
                r4 = move-exception
                goto L35
            La9:
                r4 = move-exception
                goto L40
            Lad:
                r4 = move-exception
                goto L4c
            Lb1:
                r4 = move-exception
                goto L58
            Lb5:
                r4 = move-exception
                goto L6c
            Lb9:
                r4 = move-exception
                goto L77
            Lbd:
                r4 = move-exception
                goto L82
            Lc1:
                r4 = move-exception
                goto L8d
            Lc5:
                r4 = move-exception
                goto L98
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.Lifecycle.AnonymousClass1.m247clinit():void");
        }
    }

    /* loaded from: Lifecycle$Event.class */
    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static Event downFrom(State state) {
            int i = AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$State[state.ordinal()];
            if (i == 1) {
                return ON_DESTROY;
            }
            if (i == 2) {
                return ON_STOP;
            }
            if (i != 3) {
                return null;
            }
            return ON_PAUSE;
        }

        public static Event upFrom(State state) {
            int i = AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$State[state.ordinal()];
            if (i == 1) {
                return ON_START;
            }
            if (i == 2) {
                return ON_RESUME;
            }
            if (i != 5) {
                return null;
            }
            return ON_CREATE;
        }

        public static Event upTo(State state) {
            int i = AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$State[state.ordinal()];
            if (i == 1) {
                return ON_CREATE;
            }
            if (i == 2) {
                return ON_START;
            }
            if (i != 3) {
                return null;
            }
            return ON_RESUME;
        }

        public State getTargetState() {
            switch (AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case 6:
                    return State.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* loaded from: Lifecycle$State.class */
    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean isAtLeast(State state) {
            return compareTo(state) >= 0;
        }
    }

    public abstract void addObserver(LifecycleObserver lifecycleObserver);

    public abstract State getCurrentState();

    public abstract void removeObserver(LifecycleObserver lifecycleObserver);
}
