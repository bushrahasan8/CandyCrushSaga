package kotlin;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: SafePublicationLazyImpl.class */
public final class SafePublicationLazyImpl implements Lazy, Serializable {
    public static final Companion Companion = new Companion(null);
    private static final AtomicReferenceFieldUpdater valueUpdater = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    private volatile Object _value;

    /* renamed from: final, reason: not valid java name */
    private final Object f3205final;
    private volatile Function0 initializer;

    /* loaded from: SafePublicationLazyImpl$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SafePublicationLazyImpl(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.INSTANCE;
        this._value = uninitialized_value;
        this.f3205final = uninitialized_value;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        Object obj = this._value;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.INSTANCE;
        if (obj != uninitialized_value) {
            return obj;
        }
        Function0 function0 = this.initializer;
        if (function0 != null) {
            Object invoke = function0.invoke();
            if (AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(valueUpdater, this, uninitialized_value, invoke)) {
                this.initializer = null;
                return invoke;
            }
        }
        return this._value;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this._value != UNINITIALIZED_VALUE.INSTANCE;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
