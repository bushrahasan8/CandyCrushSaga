package androidx.media3.common;

import java.util.HashSet;

/* loaded from: MediaLibraryInfo.class */
public abstract class MediaLibraryInfo {
    private static final HashSet registeredModules = new HashSet();
    private static String registeredModulesString = "media3.common";

    public static void registerModule(String str) {
        synchronized (MediaLibraryInfo.class) {
            try {
                if (registeredModules.add(str)) {
                    registeredModulesString += ", " + str;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String registeredModules() {
        String str;
        synchronized (MediaLibraryInfo.class) {
            try {
                str = registeredModulesString;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
