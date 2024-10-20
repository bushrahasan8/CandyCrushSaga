package com.google.common.base;

/* loaded from: Absent.class */
final class Absent extends Optional {
    static final Absent INSTANCE = new Absent();

    private Absent() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Optional withType() {
        return INSTANCE;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.google.common.base.Optional
    public Object get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public int hashCode() {
        return 2040732332;
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return false;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
