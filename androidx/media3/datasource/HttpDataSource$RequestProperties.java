package androidx.media3.datasource;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: HttpDataSource$RequestProperties.class */
public final class HttpDataSource$RequestProperties {
    private final Map requestProperties = new HashMap();
    private Map requestPropertiesSnapshot;

    public Map getSnapshot() {
        Map map;
        synchronized (this) {
            if (this.requestPropertiesSnapshot == null) {
                this.requestPropertiesSnapshot = Collections.unmodifiableMap(new HashMap(this.requestProperties));
            }
            map = this.requestPropertiesSnapshot;
        }
        return map;
    }
}
