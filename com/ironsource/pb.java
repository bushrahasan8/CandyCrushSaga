package com.ironsource;

/* loaded from: pb.class */
public enum pb {
    PER_DAY("d"),
    PER_HOUR("h");

    public String a;

    pb(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.a;
    }
}
