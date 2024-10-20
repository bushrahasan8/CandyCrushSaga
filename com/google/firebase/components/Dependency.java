package com.google.firebase.components;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: Dependency.class */
public final class Dependency {
    private final Qualified anInterface;
    private final int injection;
    private final int type;

    private Dependency(Qualified qualified, int i, int i2) {
        this.anInterface = (Qualified) Preconditions.checkNotNull(qualified, "Null dependency anInterface.");
        this.type = i;
        this.injection = i2;
    }

    private Dependency(Class cls, int i, int i2) {
        this(Qualified.unqualified(cls), i, i2);
    }

    private static String describeInjection(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return IronSourceConstants.EVENTS_PROVIDER;
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    public static Dependency optional(Class cls) {
        return new Dependency(cls, 0, 0);
    }

    public static Dependency optionalProvider(Class cls) {
        return new Dependency(cls, 0, 1);
    }

    public static Dependency required(Qualified qualified) {
        return new Dependency(qualified, 1, 0);
    }

    public static Dependency required(Class cls) {
        return new Dependency(cls, 1, 0);
    }

    public static Dependency requiredProvider(Class cls) {
        return new Dependency(cls, 1, 1);
    }

    public static Dependency setOf(Class cls) {
        return new Dependency(cls, 2, 0);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof Dependency) {
            Dependency dependency = (Dependency) obj;
            z = false;
            if (this.anInterface.equals(dependency.anInterface)) {
                z = false;
                if (this.type == dependency.type) {
                    z = false;
                    if (this.injection == dependency.injection) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public Qualified getInterface() {
        return this.anInterface;
    }

    public int hashCode() {
        return ((((this.anInterface.hashCode() ^ 1000003) * 1000003) ^ this.type) * 1000003) ^ this.injection;
    }

    public boolean isDeferred() {
        return this.injection == 2;
    }

    public boolean isDirectInjection() {
        return this.injection == 0;
    }

    public boolean isRequired() {
        boolean z = true;
        if (this.type != 1) {
            z = false;
        }
        return z;
    }

    public boolean isSet() {
        return this.type == 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.anInterface);
        sb.append(", type=");
        int i = this.type;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(describeInjection(this.injection));
        sb.append("}");
        return sb.toString();
    }
}
