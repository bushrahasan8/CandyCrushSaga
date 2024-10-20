package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.util.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: DataRewinderRegistry.class */
public class DataRewinderRegistry {
    private static final DataRewinder.Factory DEFAULT_FACTORY = new DataRewinder.Factory() { // from class: com.bumptech.glide.load.data.DataRewinderRegistry.1
        AnonymousClass1() {
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        public DataRewinder build(Object obj) {
            return new DefaultRewinder(obj);
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        public Class getDataClass() {
            throw new UnsupportedOperationException("Not implemented");
        }
    };
    private final Map rewinders = new HashMap();

    /* renamed from: com.bumptech.glide.load.data.DataRewinderRegistry$1 */
    /* loaded from: DataRewinderRegistry$1.class */
    class AnonymousClass1 implements DataRewinder.Factory {
        AnonymousClass1() {
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        public DataRewinder build(Object obj) {
            return new DefaultRewinder(obj);
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        public Class getDataClass() {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* loaded from: DataRewinderRegistry$DefaultRewinder.class */
    private static final class DefaultRewinder implements DataRewinder {
        private final Object data;

        DefaultRewinder(Object obj) {
            this.data = obj;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder
        public void cleanup() {
        }

        @Override // com.bumptech.glide.load.data.DataRewinder
        public Object rewindAndGet() {
            return this.data;
        }
    }

    public DataRewinder build(Object obj) {
        DataRewinder build;
        synchronized (this) {
            Preconditions.checkNotNull(obj);
            DataRewinder.Factory factory = (DataRewinder.Factory) this.rewinders.get(obj.getClass());
            DataRewinder.Factory factory2 = factory;
            if (factory == null) {
                Iterator it = this.rewinders.values().iterator();
                do {
                    factory2 = factory;
                    if (!it.hasNext()) {
                        break;
                    }
                    factory2 = (DataRewinder.Factory) it.next();
                } while (!factory2.getDataClass().isAssignableFrom(obj.getClass()));
            }
            DataRewinder.Factory factory3 = factory2;
            if (factory2 == null) {
                factory3 = DEFAULT_FACTORY;
            }
            build = factory3.build(obj);
        }
        return build;
    }

    public void register(DataRewinder.Factory factory) {
        synchronized (this) {
            this.rewinders.put(factory.getDataClass(), factory);
        }
    }
}
