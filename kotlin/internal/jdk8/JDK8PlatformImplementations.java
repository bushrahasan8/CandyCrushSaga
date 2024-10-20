package kotlin.internal.jdk8;

import kotlin.internal.jdk7.JDK7PlatformImplementations;
import kotlin.random.Random;
import kotlin.random.jdk8.PlatformThreadLocalRandom;

/* loaded from: JDK8PlatformImplementations.class */
public class JDK8PlatformImplementations extends JDK7PlatformImplementations {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: JDK8PlatformImplementations$ReflectSdkVersion.class */
    public static final class ReflectSdkVersion {
        public static final ReflectSdkVersion INSTANCE = new ReflectSdkVersion();
        public static final Integer sdkVersion;

        /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
        static {
            /*
                kotlin.internal.jdk8.JDK8PlatformImplementations$ReflectSdkVersion r0 = new kotlin.internal.jdk8.JDK8PlatformImplementations$ReflectSdkVersion
                r1 = r0
                r1.<init>()
                kotlin.internal.jdk8.JDK8PlatformImplementations.ReflectSdkVersion.INSTANCE = r0
                r0 = 0
                r5 = r0
                java.lang.String r0 = "android.os.Build$VERSION"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L42
                java.lang.String r1 = "SDK_INT"
                java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Throwable -> L42
                r1 = 0
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L42
                r3 = r0
                r0 = r3
                boolean r0 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L42
                if (r0 == 0) goto L2a
                r0 = r3
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L42
                r3 = r0
                goto L2c
            L2a:
                r0 = 0
                r3 = r0
            L2c:
                r0 = r5
                r4 = r0
                r0 = r3
                if (r0 == 0) goto L3d
                r0 = r5
                r4 = r0
                r0 = r3
                int r0 = r0.intValue()
                if (r0 <= 0) goto L3d
                r0 = r3
                r4 = r0
            L3d:
                r0 = r4
                kotlin.internal.jdk8.JDK8PlatformImplementations.ReflectSdkVersion.sdkVersion = r0
                return
            L42:
                r3 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.jdk8.JDK8PlatformImplementations.ReflectSdkVersion.m7256clinit():void");
        }

        private ReflectSdkVersion() {
        }
    }

    private final boolean sdkIsNullOrAtLeast(int i) {
        Integer num = ReflectSdkVersion.sdkVersion;
        return num == null || num.intValue() >= i;
    }

    @Override // kotlin.internal.PlatformImplementations
    public Random defaultPlatformRandom() {
        return sdkIsNullOrAtLeast(34) ? new PlatformThreadLocalRandom() : super.defaultPlatformRandom();
    }
}
