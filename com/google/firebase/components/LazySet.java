package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: LazySet.class */
public class LazySet implements Provider {
    private volatile Set actualSet = null;
    private volatile Set providers = Collections.newSetFromMap(new ConcurrentHashMap());

    LazySet(Collection collection) {
        this.providers.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static LazySet fromCollection(Collection collection) {
        return new LazySet((Set) collection);
    }

    private void updateSet() {
        synchronized (this) {
            Iterator it = this.providers.iterator();
            while (it.hasNext()) {
                this.actualSet.add(((Provider) it.next()).get());
            }
            this.providers = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void add(Provider provider) {
        synchronized (this) {
            if (this.actualSet == null) {
                this.providers.add(provider);
            } else {
                this.actualSet.add(provider.get());
            }
        }
    }

    @Override // com.google.firebase.inject.Provider
    public Set get() {
        if (this.actualSet == null) {
            synchronized (this) {
                if (this.actualSet == null) {
                    this.actualSet = Collections.newSetFromMap(new ConcurrentHashMap());
                    updateSet();
                }
            }
        }
        return Collections.unmodifiableSet(this.actualSet);
    }
}
