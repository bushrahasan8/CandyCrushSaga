package com.unity3d.ads.injection;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: EntryKey.class */
public final class EntryKey {
    private final KClass instanceClass;
    private final String named;

    public EntryKey(String named, KClass instanceClass) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instanceClass, "instanceClass");
        this.named = named;
        this.instanceClass = instanceClass;
    }

    public /* synthetic */ EntryKey(String str, KClass kClass, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, kClass);
    }

    public static /* synthetic */ EntryKey copy$default(EntryKey entryKey, String str, KClass kClass, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entryKey.named;
        }
        if ((i & 2) != 0) {
            kClass = entryKey.instanceClass;
        }
        return entryKey.copy(str, kClass);
    }

    public final String component1() {
        return this.named;
    }

    public final KClass component2() {
        return this.instanceClass;
    }

    public final EntryKey copy(String named, KClass instanceClass) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instanceClass, "instanceClass");
        return new EntryKey(named, instanceClass);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntryKey)) {
            return false;
        }
        EntryKey entryKey = (EntryKey) obj;
        return Intrinsics.areEqual(this.named, entryKey.named) && Intrinsics.areEqual(this.instanceClass, entryKey.instanceClass);
    }

    public final KClass getInstanceClass() {
        return this.instanceClass;
    }

    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return (this.named.hashCode() * 31) + this.instanceClass.hashCode();
    }

    public String toString() {
        return "EntryKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }
}
