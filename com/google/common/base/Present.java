package com.google.common.base;

/* loaded from: Present.class */
final class Present extends Optional {
    private final Object reference;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Present(Object obj) {
        this.reference = obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.reference.equals(((Present) obj).reference);
        }
        return false;
    }

    @Override // com.google.common.base.Optional
    public Object get() {
        return this.reference;
    }

    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return true;
    }

    public String toString() {
        return "Optional.of(" + this.reference + ")";
    }
}
