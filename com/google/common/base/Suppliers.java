package com.google.common.base;

import com.google.common.base.Suppliers;
import java.io.Serializable;

/* loaded from: Suppliers.class */
public abstract class Suppliers {

    /* loaded from: Suppliers$MemoizingSupplier.class */
    static class MemoizingSupplier implements Supplier, Serializable {
        final Supplier delegate;
        volatile transient boolean initialized;
        transient Object value;

        MemoizingSupplier(Supplier supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        public Object get() {
            if (!this.initialized) {
                synchronized (this) {
                    if (!this.initialized) {
                        Object obj = this.delegate.get();
                        this.value = obj;
                        this.initialized = true;
                        return obj;
                    }
                }
            }
            return NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (this.initialized) {
                obj = "<supplier that returned " + this.value + ">";
            } else {
                obj = this.delegate;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    /* loaded from: Suppliers$NonSerializableMemoizingSupplier.class */
    static class NonSerializableMemoizingSupplier implements Supplier {
        private static final Supplier SUCCESSFULLY_COMPUTED = new Supplier() { // from class: com.google.common.base.Suppliers$NonSerializableMemoizingSupplier$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Supplier
            public final Object get() {
                Void lambda$static$0;
                lambda$static$0 = Suppliers.NonSerializableMemoizingSupplier.lambda$static$0();
                return lambda$static$0;
            }
        };
        private volatile Supplier delegate;
        private Object value;

        NonSerializableMemoizingSupplier(Supplier supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Void lambda$static$0() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.base.Supplier
        public Object get() {
            Supplier supplier = this.delegate;
            Supplier supplier2 = SUCCESSFULLY_COMPUTED;
            if (supplier != supplier2) {
                synchronized (this) {
                    if (this.delegate != supplier2) {
                        Object obj = this.delegate.get();
                        this.value = obj;
                        this.delegate = supplier2;
                        return obj;
                    }
                }
            }
            return NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public String toString() {
            Object obj = this.delegate;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            Object obj2 = obj;
            if (obj == SUCCESSFULLY_COMPUTED) {
                obj2 = "<supplier that returned " + this.value + ">";
            }
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }
    }

    /* loaded from: Suppliers$SupplierOfInstance.class */
    private static class SupplierOfInstance implements Supplier, Serializable {
        final Object instance;

        SupplierOfInstance(Object obj) {
            this.instance = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return Objects.equal(this.instance, ((SupplierOfInstance) obj).instance);
            }
            return false;
        }

        @Override // com.google.common.base.Supplier
        public Object get() {
            return this.instance;
        }

        public int hashCode() {
            return Objects.hashCode(this.instance);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.instance + ")";
        }
    }

    public static Supplier memoize(Supplier supplier) {
        if ((supplier instanceof NonSerializableMemoizingSupplier) || (supplier instanceof MemoizingSupplier)) {
            return supplier;
        }
        return supplier instanceof Serializable ? new MemoizingSupplier(supplier) : new NonSerializableMemoizingSupplier(supplier);
    }

    public static Supplier ofInstance(Object obj) {
        return new SupplierOfInstance(obj);
    }
}
