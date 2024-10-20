package retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* loaded from: Invocation.class */
public final class Invocation {
    private final List arguments;
    private final Method method;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Invocation(Method method, List list) {
        this.method = method;
        this.arguments = Collections.unmodifiableList(list);
    }

    public Method method() {
        return this.method;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.method.getDeclaringClass().getName(), this.method.getName(), this.arguments);
    }
}
