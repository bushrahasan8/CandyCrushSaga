package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GlobalLibraryVersionRegistrar.class */
public class GlobalLibraryVersionRegistrar {
    private static volatile GlobalLibraryVersionRegistrar INSTANCE;
    private final Set infos = new HashSet();

    GlobalLibraryVersionRegistrar() {
    }

    public static GlobalLibraryVersionRegistrar getInstance() {
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = INSTANCE;
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar2 = globalLibraryVersionRegistrar;
        if (globalLibraryVersionRegistrar == null) {
            synchronized (GlobalLibraryVersionRegistrar.class) {
                try {
                    GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar3 = INSTANCE;
                    globalLibraryVersionRegistrar2 = globalLibraryVersionRegistrar3;
                    if (globalLibraryVersionRegistrar3 == null) {
                        globalLibraryVersionRegistrar2 = new GlobalLibraryVersionRegistrar();
                        INSTANCE = globalLibraryVersionRegistrar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return globalLibraryVersionRegistrar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set getRegisteredVersions() {
        Set unmodifiableSet;
        synchronized (this.infos) {
            unmodifiableSet = Collections.unmodifiableSet(this.infos);
        }
        return unmodifiableSet;
    }
}
