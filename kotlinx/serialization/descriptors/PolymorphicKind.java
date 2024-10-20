package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: PolymorphicKind.class */
public abstract class PolymorphicKind extends SerialKind {

    /* loaded from: PolymorphicKind$OPEN.class */
    public static final class OPEN extends PolymorphicKind {
        public static final OPEN INSTANCE = new OPEN();

        private OPEN() {
            super(null);
        }
    }

    /* loaded from: PolymorphicKind$SEALED.class */
    public static final class SEALED extends PolymorphicKind {
        public static final SEALED INSTANCE = new SEALED();

        private SEALED() {
            super(null);
        }
    }

    private PolymorphicKind() {
        super(null);
    }

    public /* synthetic */ PolymorphicKind(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
