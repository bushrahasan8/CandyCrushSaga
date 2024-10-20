package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Route;

/* loaded from: RouteDatabase.class */
public final class RouteDatabase {
    private final Set failedRoutes = new LinkedHashSet();

    public final void connected(Route route) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(route, "route");
            this.failedRoutes.remove(route);
        }
    }

    public final void failed(Route failedRoute) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            this.failedRoutes.add(failedRoute);
        }
    }

    public final boolean shouldPostpone(Route route) {
        boolean contains;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(route, "route");
            contains = this.failedRoutes.contains(route);
        }
        return contains;
    }
}
