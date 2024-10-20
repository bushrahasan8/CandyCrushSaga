package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Set;

/* loaded from: ComponentContainer.class */
public interface ComponentContainer {

    /* loaded from: ComponentContainer$_CC.class */
    public abstract /* synthetic */ class _CC {
        public static Object $default$get(ComponentContainer componentContainer, Qualified qualified) {
            Provider provider = componentContainer.getProvider(qualified);
            if (provider == null) {
                return null;
            }
            return provider.get();
        }

        public static Set $default$setOf(ComponentContainer componentContainer, Qualified qualified) {
            return (Set) componentContainer.setOfProvider(qualified).get();
        }
    }

    Object get(Qualified qualified);

    Object get(Class cls);

    Provider getProvider(Qualified qualified);

    Provider getProvider(Class cls);

    Set setOf(Qualified qualified);

    Set setOf(Class cls);

    Provider setOfProvider(Qualified qualified);
}
