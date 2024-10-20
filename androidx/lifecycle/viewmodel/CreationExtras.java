package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: CreationExtras.class */
public abstract class CreationExtras {
    private final Map map = new LinkedHashMap();

    /* loaded from: CreationExtras$Empty.class */
    public static final class Empty extends CreationExtras {
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        @Override // androidx.lifecycle.viewmodel.CreationExtras
        public Object get(Key key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }
    }

    /* loaded from: CreationExtras$Key.class */
    public interface Key {
    }

    public abstract Object get(Key key);

    public final Map getMap$lifecycle_viewmodel_release() {
        return this.map;
    }
}
